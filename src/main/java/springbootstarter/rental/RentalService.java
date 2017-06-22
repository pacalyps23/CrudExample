package springbootstarter.rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisgarcia on 6/22/17.
 */

@Service
public class RentalService
{
    @Autowired
    private RentalRepo rentalRepo;

    public List<Rental> getAll(Integer id)
    {
        List<Rental> courses = new ArrayList<>();
        rentalRepo.findByUserId(id).forEach(courses::add);
        return courses;
    }

    public Rental getRentalById(Integer id)
    {
        return rentalRepo.findOne(id);
    }

    public void addRental(Rental rental)
    {
        rentalRepo.save(rental);
    }

    public void updateRental(Rental rental)
    {
        rentalRepo.save(rental);
    }

    public void deleteRental(Integer id)
    {
        rentalRepo.delete(id);
    }
    
}

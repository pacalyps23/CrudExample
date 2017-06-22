package springbootstarter.rental;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by luisgarcia on 6/22/17.
 */


public interface RentalRepo extends CrudRepository<Rental, Integer>
{
    public List<Rental> findByUserId(Integer topicId);
}

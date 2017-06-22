package springbootstarter.rental;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by luisgarcia on 6/22/17.
 */

@Entity
public class Rental
{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int itemId;

    String itemDescription;
    double itemAmount;

    public Rental(int itemId, String itemDescription, double itemAmount)
    {
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.itemAmount = itemAmount;
    }

    public Rental()
    {
    }

    public int getItemId()
    {
        return itemId;
    }

    public void setItemId(int itemId)
    {
        this.itemId = itemId;
    }

    public String getItemDescription()
    {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }

    public double getItemAmount()
    {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount)
    {
        this.itemAmount = itemAmount;
    }
}

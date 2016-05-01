
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer = new Customer("TestCustomer");
    Movie movie = new Movie("Test Movie", 2);
    Rental rental = new Rental(movie, 30);

    @Test
    public void addRental() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for TestCustomer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTest Movie\t\t30\t42.0\n" +
                "Amount owed is 42.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void getName() throws Exception {
        assertEquals(customer.getName(), "TestCustomer");
    }

    @Test
    public void statement() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for TestCustomer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTest Movie\t\t30\t42.0\n" +
                "Amount owed is 42.0\n" +
                "You earned 1 frequent renter points");
    }

}
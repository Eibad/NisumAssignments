package test.java.com.example.mobileBank;

import main.java.com.example.mobileBank.Account;
import org.junit.Assert;
import org.junit.Test;


public class AccountTest {



    // Checking New Account with Initial getBalance()
    @Test
    public void NewAccountTest() {
        Account Rahim = new Account("Rahim", 12000, 2345);
        Account Zahid = new Account("Zahid", 35000, 9876);
        Account Ali = new Account("Ali", 55555, 5555);


        //Rahim's Account
        Assert.assertEquals(12000, Rahim.getBalance());
        Assert.assertNotEquals(21000, Rahim.getBalance());

        //Zahid's Account
        Assert.assertEquals(35000, Zahid.getBalance());
        Assert.assertNotEquals(34999, Zahid.getBalance());

        //Ali's Account
        Assert.assertEquals(55555, Ali.getBalance());
        Assert.assertNotEquals(55000, Ali.getBalance());
    }

    // Verifying Account Pin
    //Act & Assert
    @Test
    public void verifyPin() {
        Account Rahim = new Account("Rahim", 12000, 2345);

        //Rahim's Account
        Assert.assertEquals(true, Rahim.verifyPin(2345));
        Assert.assertNotEquals(true, Rahim.verifyPin(1234));

    }

    // Checking Current getBalance()
    @Test

    public void CheckBalTest() {

        Account Rahim = new Account("Rahim", 12000, 2345);

        Assert.assertEquals(12000, Rahim.getBalance());
        Assert.assertNotEquals(23456, Rahim.getBalance());
    }

    //Checking Transfer Amount in Both Sender & Receiver Account
    @Test
    public void TransferTest() {
        Account Rahim = new Account("Rahim", 12000, 2345);
        Account Zahid = new Account("Zahid", 35000, 9876);
        Account Ali = new Account("Ali", 55555, 5555);

        //Act
        Rahim.transferTo(Zahid, 1000);
        //Assert
        //Sender
        Assert.assertEquals(11000, Rahim.getBalance());

        //Receiver
        Assert.assertEquals(36000, Zahid.getBalance());
        Rahim.transferTo(Ali, 2000);

        //Sender
        Assert.assertEquals(9000, Rahim.getBalance());

        //Receiver
        Assert.assertEquals(57555, Ali.getBalance());
        Ali.transferTo(Zahid, 50000);

        //Sender
        Assert.assertEquals(86000, Zahid.getBalance());

        //Receiver
        Assert.assertEquals(7555, Ali.getBalance());
    }


}

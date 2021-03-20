import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

public class CellPhoneCaseTest{
    @Test
    public void testingInheritance() {
        System.out.println("Testing CellPhoneCase class");
        // Testing whether CellPhoneCase is derived from Case class
        // instances of CellPhoneCase ARE also instances of Case
        CellPhoneCase myCase = new CellPhoneCase("Me", "gold",
                "123-456-7890");
        assertTrue(myCase instanceof Case);

        // Testing that CellPhoneCase class did not override the getOwnerName and getColor methods
        try {
            Method meth = CellPhoneCase.class.getDeclaredMethod("getOwnerName");
            System.out.println("getOwnerName should not be defined in CellPhoneCase class.  It is" +
                    "inherited from the Case class.");
        } catch (NoSuchMethodException e) {
        }
        try {
            Method meth = CellPhoneCase.class.getDeclaredMethod("getColor");
            System.out.println("getColor should not be defined in CellPhoneCase class.  It is " +
                    "inherited from the Case class.");
        } catch (NoSuchMethodException e) {
        }
    }
    @Test
    public void testing_constructor() {
        System.out.println("Testing CellPhoneCase constructor");
        CellPhoneCase myCase = new CellPhoneCase("Me", "gold",
                "123-456-7890");
        assertEquals("Me", myCase.getOwnerName());
        assertEquals("gold", myCase.getColor());
        assertEquals("Me", myCase.getCellPhone().getOwnerName());
        assertEquals("123-456-7890", myCase.getCellPhone().getPhoneNumber());

        // Initially phone's ring tone should be set to "beep"
        assertEquals("beep", myCase.getCellPhone().getRingTone());
        // Initally phone should have do not disturb set to false
        assertFalse(myCase.getCellPhone().isDoNotDisturb());
    }
    @Test
    public void testing_methods() {
        System.out.println("Testing CellPhoneCase methods");
        CellPhoneCase myCase = new CellPhoneCase("Mine", "blue",
                "987-654-3210");
        assertEquals("Mine", myCase.getOwnerName());
        assertEquals("blue", myCase.getColor());
        assertEquals("Mine", myCase.getCellPhone().getOwnerName());
        assertEquals("987-654-3210", myCase.getCellPhone().getPhoneNumber());

        // Initially phone's ring tone should be set to "beep" - change it
        myCase.getCellPhone().setRingTone("zooooom");
        assertEquals("zooooom", myCase.getCellPhone().getRingTone());

        // Testing quietPhone
        assertFalse(myCase.getCellPhone().isDoNotDisturb());
        myCase.quietPhone();
        assertTrue(myCase.getCellPhone().isDoNotDisturb());

        // Testing the toString method
        assertEquals("Case Owner : Mine , Color : blue , Phone Owner : Mine , Number : 987-654-3210",
                myCase.toString());
    }

    @Test
    public void testing_swapPhones() {
        System.out.println("Testing CellPhoneCase swapPhones");

        //create two new ce phone case objects
        CellPhoneCase myCase = new CellPhoneCase("Mine", "blue",
                "987-654-3210");
        CellPhoneCase yourCase = new CellPhoneCase("Yours", "red",
                "012-345-6789");
        // store the addresses of the cell phone objects
        CellPhone myCellObject = myCase.getCellPhone();
        CellPhone yourCellObject = yourCase.getCellPhone();

        // swap the phones
        CellPhoneCase.swapPhones(myCase, yourCase);

        // my case should have your cell phone and vice versa
        //   == compares object references
        assertTrue(myCellObject == yourCase.getCellPhone());
        assertTrue(yourCellObject == myCase.getCellPhone());

        assertEquals("Mine", myCase.getOwnerName());
        assertEquals("blue", myCase.getColor());
        assertEquals("Yours", myCase.getCellPhone().getOwnerName());
        assertEquals("012-345-6789", myCase.getCellPhone().getPhoneNumber());
        // your case should have Mine cell phone
        assertEquals("Yours", yourCase.getOwnerName());
        assertEquals("red", yourCase.getColor());
        assertEquals("Mine", yourCase.getCellPhone().getOwnerName());
        assertEquals("987-654-3210", yourCase.getCellPhone().getPhoneNumber());

        // Testing the toString method
        assertEquals("Case Owner : Mine , Color : blue , Phone Owner : Yours , Number : 012-345-6789",
                myCase.toString());

        // Testing the toString method
        assertEquals("Case Owner : Yours , Color : red , Phone Owner : Mine , Number : 987-654-3210",
                yourCase.toString());
    }
}
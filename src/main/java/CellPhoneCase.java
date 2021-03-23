public class CellPhoneCase extends Case {
    /**
     * <h1>Lab3</h1>
     * <h2>CISC 181-052L Spring 2021</h2>
     * <h3>University of Delaware</h3>
     * <p>
     * The purpose of Lab 3 is to have us practice and learn concepts like
     * Encapsulation, Inheritance, and Arrays while continuing to work with Objects
     * and Classes
     *
     * @author London Kumar
     * @since 2021-03-22
     */

    /**
     * This class extends the Case class so that we could build upon it
     * cellPhoneObject is an object of the CellPhone class so that we can access it's information and
     * manipulate it later in the code
     */
    public CellPhone cellPhoneObject;

    /**
     * This constructor allows us to set the owner's name, case color, and phone number and it calls the
     * constructor from Case to set the name and color and uses CellPhone to set the name and number
     * @param name is a String that represents the owner's name
     * @param color is a String that represents the color of the case
     * @param number is a String that represents the phone number
     */
    protected CellPhoneCase(String name, String color, String number) {
        super(name, color);
        cellPhoneObject = new CellPhone(name, number);
    }

    /**
     * This method is used to get the cellPhoneObject to see what information we have passed in it
     * @return the cellPhoneObject and the information we passed it
     */
    public CellPhone getCellPhone(){
        return cellPhoneObject;
    }

    /**
     * This method is used to set the do not disturb to on so that we don't get any phone calls
     */
    public void quietPhone(){
        cellPhoneObject.setDoNotDisturb(true);
    }

    /**
     * This is a helper method I made to allow the swapPhones method to be able to set the new
     * object
     * @param phone is the Cellphone object you want to set it ass
     */
    private void setCellPhone(CellPhone phone){
        cellPhoneObject = phone;
    }

    /**
     * This method is used to swap phones
     * @param phone1 is an CellPhoneCase object
     * @param phone2 is an CellPhoneCase object
     */

    public static void swapPhones(CellPhoneCase phone1, CellPhoneCase phone2){
        CellPhoneCase phone3 = new CellPhoneCase("","","");
        phone3.setCellPhone(phone1.getCellPhone());
        phone1.setCellPhone(phone2.getCellPhone());
        phone2.setCellPhone(phone3.getCellPhone());

    }
    /**
     * This toString method was used to print out the owner and the case color and their phone number
     * @return owner's name , case color, and their number  in a neat manner
     */
    @Override
    public String toString() {
        return super.toString() + " , "+getCellPhone();
    }
    /**
     *This method was used for use to do some testing with our method during the development
     * phase so that we knew it was good to work on the next part of the this project
     */
    public static void main(String args[]){
        CellPhoneCase tester1 = new CellPhoneCase("Tim","black","111-222-3333");
        CellPhoneCase tester2 = new CellPhoneCase("Neena","blue","444-555-6666");
        swapPhones(tester1,tester2);

        System.out.println(tester1.toString());
        System.out.println(tester2.toString());

    }

}

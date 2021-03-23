public class CellPhone {
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
     * @name is a String object that represents the name of the owner
     * @phoneNum is a String object that represent the phone number
     * @ringtone is a String object that represents the ringtone of the phone
     * @doNotDisturb is a boolean that represents wither or not do not disturb is on or not
     */
    protected String name;
    protected String phoneNum;
    protected String ringtone;
    protected boolean doNotDisturb;

    /**
     * This constructor allows for you to set the name and phone number off the bat
     * and sets the default ringtone to beep and do not disturb to false.
     * @param name is a String object that represents the name of the owner
     * @param phoneNum is a String object that represent the phone number
     */
    public CellPhone(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
        this.ringtone = "beep";
        this.doNotDisturb = false;
    }

    /**
     * This constructor allows for you to not pass anything and automatically
     * set the name to John Doe and the phone number to 1234567890
     */
    public CellPhone(){
        this("John Doe","1234567890");
    }

    /**
     * This method is used to retrieve the name of the owner
     * @return name, the name of the owner
     */
    public String getOwnerName(){
        return this.name;
    }

    /**
     * this method is used to retrieve the phone number
     * @return phoneNum, the phone number
     */
    public String getPhoneNumber(){
        return this.phoneNum;
    }

    /**
     * this method is used to get the ringtone of the phone
     * @return ringtone
     */
    public String getRingTone(){
        return this.ringtone;
    }

    /**
     * this mehtod is used to get whether do not disturb is false, meaning off, or true, meaning on
     * @return doNotDisturb
     */
    public boolean isDoNotDisturb(){
        return this.doNotDisturb;
    }

    /**
     * This method is used
     * @param setMode is the variable meant to set whether do not disturb is on or off
     */
    public void setDoNotDisturb(boolean setMode){
        this.doNotDisturb = setMode;
    }

    /**
     * This method allows you to change the ringtone of the phone
     * @param Tone, this string represents the new ringtone you want to set it to
     */
    public void setRingTone(String Tone){
        this.ringtone = Tone;
    }

    /**
     * This method either prints the rington if do not disturb is off but if it is on, then
     * it only prints shhh
     */
    public void incomingCall(){
        if(!isDoNotDisturb()){
            System.out.print(getRingTone());
        }else{
            System.out.print("shhh");
        }
    }

    /**
     * This method is used to display the phone owner's name and phone number in a neat manner
     * @return owner's name and phone number in a neat manner
     */
    @Override
    public String toString(){
        return "Phone Owner : "+ getOwnerName() +" , Number : "+getPhoneNumber();
    }
    /**
     *This method was used for use to do some testing with our method during the development
     * phase so that we knew it was good to work on the next part of the this project
     */
    public static void main(String args[]){
        CellPhone cell = new CellPhone("Sue","888-999-0000");
        cell.setDoNotDisturb(true);
        cell.incomingCall();
        System.out.println(cell.toString());

    }

}

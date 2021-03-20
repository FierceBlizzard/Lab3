public class CellPhone {
    protected String name;
    protected String phoneNum;
    protected String ringtone;
    protected boolean doNotDisturb;

    public CellPhone(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
        this.ringtone = "beep";
        this.doNotDisturb = false;
    }

    public CellPhone(){
        this("John Doe","1234567890");
    }

    public String getOwnerName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNum;
    }

    public String getRingTone(){
        return this.ringtone;
    }

    public boolean isDoNotDisturb(){
        return this.doNotDisturb;
    }

    public void setDoNotDisturb(boolean setMode){
        this.doNotDisturb = setMode;
    }

    public void setRingTone(String Tone){
        this.ringtone = Tone;
    }

    public void incomingCall(){
        if(!isDoNotDisturb()){
            System.out.print(getRingTone());
        }else{
            System.out.print("shhh");
        }
    }

    @Override
    public String toString(){
        return "Phone Owner : "+ getOwnerName() +" , Number : "+getPhoneNumber();
    }

    public static void main(String args[]){
        CellPhone cell = new CellPhone("Sue","888-999-0000");
        cell.setDoNotDisturb(true);
        cell.incomingCall();
        System.out.println(cell.toString());

    }

}

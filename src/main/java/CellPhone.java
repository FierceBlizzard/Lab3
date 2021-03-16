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

    public boolean getDoNotDisturbed(){
        return this.doNotDisturb;
    }

    public void setDoNotDisturbed(boolean setMode){
        this.doNotDisturb = setMode;
    }

    public void setRingTone(String Tone){
        this.ringtone = Tone;
    }

    public void incomingCall(){
        if(!getDoNotDisturbed()){
            System.out.print(getRingTone());
        }
        System.out.print("shhh");
    }

}

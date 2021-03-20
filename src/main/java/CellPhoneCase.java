public class CellPhoneCase extends Case {

    public CellPhone cellPhoneObject;
    protected CellPhoneCase(String name, String color, String number) {
        super(name, color);
        cellPhoneObject = new CellPhone(name, number);
    }

    public CellPhone getCellPhone(){
        return cellPhoneObject;
    }

    public void quietPhone(){
        cellPhoneObject.setDoNotDisturb(true);
    }
    private void setCellPhone(CellPhone phone){
        cellPhoneObject = phone;
    }

    public static void swapPhones(CellPhoneCase phone1, CellPhoneCase phone2){
        CellPhoneCase phone3 = new CellPhoneCase("","","");
        phone3.setCellPhone(phone1.getCellPhone());
        phone1.setCellPhone(phone2.getCellPhone());
        phone2.setCellPhone(phone3.getCellPhone());
    }

    @Override
    public String toString() {
        return super.toString() + " , "+getCellPhone();
    }

    public static void main(String args[]){
        CellPhoneCase tester1 = new CellPhoneCase("Tim","black","111-222-3333");
        CellPhoneCase tester2 = new CellPhoneCase("Neena","blue","444-555-6666");
        swapPhones(tester1,tester2);

        System.out.println(tester1.toString());
        System.out.println(tester2.toString());

    }

}

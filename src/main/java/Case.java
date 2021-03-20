public class Case {
    protected String name;
    protected String color;

    protected Case(String name, String color){
        this.name = name;
        this.color = color;
    }

    protected String getOwnerName(){
        return this.name;
    }

    protected String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Case Owner : "+getOwnerName()+" , Color : "+getColor();
    }

    public static void main(String args[]){
        Case test1 = new Case("Sue","Maroon");
        System.out.println("Case Owner : "+test1.getOwnerName()+" Color : "+test1.getColor());
        System.out.println(test1.toString());
    }

}

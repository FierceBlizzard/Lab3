public class Case {
    protected String name;
    protected String color;
    protected Case(String name, String color){
        this.name = name;
        this.color = color;
    }

    protected Case(){
        this("Sue","Maroon");
    }

    protected String getOwnerName(){
        return this.name;
    }

    protected String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Case Owner: "+getOwnerName()+" , Color: "+getColor();
    }
}

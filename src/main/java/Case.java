public class Case {
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
     * the protected String name is the name of the owner of the phone
     * the protected String color is the color of the phone case
     */
    protected String name;
    protected String color;

    /**
     * The purpose of this constuctor is to allow the you to set the name
     * and color right off the bat
     * @param name is a string and stands for the name of the owner
     * @param color is a string and for the color of the phone case
     */
    protected Case(String name, String color){
        this.name = name;
        this.color = color;
    }

    /**
     * This method is used to get the name of the owner
     * @return the name String object from the global level
     */
    protected String getOwnerName(){
        return this.name;
    }
    /**
     * This method is used to get the color of the case
     * @return the color String object from the global level
     */

    protected String getColor(){
        return this.color;
    }

    /**
     * This toString method was used to print out the owner and the case color
     * @return owner's name , case color
     */

    @Override
    public String toString() {
        return "Case Owner : "+getOwnerName()+" , Color : "+getColor();
    }

    /**
     *This method was used for use to do some testing with our method during the development
     * phase so that we knew it was good to work on the next part of the this project
     */

    public static void main(String args[]){
        Case test1 = new Case("Sue","Maroon");
        System.out.println("Case Owner : "+test1.getOwnerName()+" Color : "+test1.getColor());
        System.out.println(test1.toString());
    }

}

public class ArrayStaticMethods {
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
     * This method takes an array of integers and adds the square of the
     * positive integers integers in the array
     * @param data, the integer array that is passed to be evaluated
     * @return sum, the square sum of all the positive integers
     */
    public static double sumSqrPos(double[] data) {
        double sum = 0;
        //the for loop just allows you to iterate through data so you can look at
        //each integer in the array
        for(int i = 0; i < data.length; i++) {
            //this checks is the integer is positive
            if (data[i] > 0) {
                //if it passes the if statement, then it is squared and added to sum
                sum += Math.pow(data[i],2);
            }
        }
        return sum;
    }

    /**
     * This method allows you to check how many times a character shows up
     * in a character array
     * @param arrayChar is a sentence that is made into a character array so
     *                  we can evaluate each character in the statement.
     * @param searchChar is the character that you want to search for
     * @return counter, the amount of times the selected character shows up
     * in the sentence
     */
    public static int countChars(char[] arrayChar, char searchChar) {
        int counter = 0;
        //the for loop iterates through the loops so it allows for you to evaluate
        //each character
        for(int c = 0; c < arrayChar.length; c++){
            //checks if the characters are the same or not
            if(arrayChar[c] == searchChar){
                //if so, then adds one to the counter
                counter++;
            }
        }
        return counter;
    }

    /**
     *This method checks for if value1 appears in the ints integer array
     * and if it does than then it is replaced with value2
     * @param ints, the array of integers
     * @param value1, the integer you are searching for to be replaced if
     *                it's in the array
     * @param value2, the integer you are replacing value1 in the integer with
     * @return newIntArray, the array with the values you would like
     */
    public static int[] replace(int[] ints, int value1, int value2) {
        //makes a new array for the new one to be in and sets it equal to the old one
        int newIntArray[] = ints;
        //this for loop iterates through the array checking for value1 and if
        //it appears, it is replaced with value2.
        for(int n = 0; n < newIntArray.length; n++){
            if(newIntArray[n] == value1){
                newIntArray[n] = value2;
            }
        }
        return newIntArray;
    }

    /**
     *This method organizes the an integer array to have all the negative values
     * first and then the positive ones.
     * @param ints, array of integers
     * @return and new array with organized values
     */
    public static int[] moveNegatives(int[] ints) {
        //creates a new array with the same length as ints
        int organizedIntArray[] = new int[ints.length];
        //this is used to keep track of the index so that all the integers are stored
        // in their proper places
        int indexIndicator = 0;
        //this for loops iterates through the array ints and adds all the negative integers first
        //to the organizedArray
        for(int l = 0; l < ints.length; l++){
            if(ints[l] < 0){
                organizedIntArray[indexIndicator] = ints[l];
                indexIndicator++;
            }
        }
        //After adding all the negative values, this loop iterates through the loop again but adds
        //all the positive integers and 0 after the negative ones
        for(int x = 0; x < ints.length; x++){
            if(ints[x] >= 0){
                organizedIntArray[indexIndicator] = ints[x];
                indexIndicator++;
            }
        }
        return organizedIntArray;
    }
}

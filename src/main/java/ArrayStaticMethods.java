public class ArrayStaticMethods {
    public static double sumSqrPos(double[] data) {
        double sum = 0;
        for(int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                sum += Math.pow(data[i],2);
            }
        }
        return sum;
    }

    public static int countChars(char[] arrayChar, char searchChar) {
        int counter = 0;
        for(int c = 0; c < arrayChar.length; c++){
            if(arrayChar[c] == searchChar){
                counter++;
            }
        }
        return counter;
    }

    public static int[] replace(int[] ints, int value1, int value2) {
        int newIntArray[] = ints;
        for(int n = 0; n < newIntArray.length; n++){
            if(newIntArray[n] == value1){
                newIntArray[n] = value2;
            }
        }
        return newIntArray;
    }

    public static int[] moveNegatives(int[] ints) {
        int organizedIntArray[] = new int[ints.length];
        int indexIndicator = 0;
        for(int l = 0; l < ints.length; l++){
            if(ints[l] < 0){
                organizedIntArray[indexIndicator] = ints[l];
                indexIndicator++;
            }
        }
        for(int x = 0; x < ints.length; x++){
            if(ints[x] >= 0){
                organizedIntArray[indexIndicator] = ints[x];
                indexIndicator++;
            }
        }
        return organizedIntArray;
    }
}

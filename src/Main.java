import java.util.Arrays;

public class Main {
//If an element is removed then its cost is sum of all remaining elements including itself...
// (only neglect deleted elements)
    public static int minimumCost(int[] array){
        if (array.length == 1){
            return array[0];
        }
        Arrays.sort(array);
        int cost = 0, occurrence = 1;
        for (int iterator = array.length - 1 ; iterator >= 0 ;iterator--){
            cost += array[iterator]*occurrence;
            occurrence++;
        }
        return cost;
    }

    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{2,1}));
    }
}
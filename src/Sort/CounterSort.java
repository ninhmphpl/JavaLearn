package Sort;

public class CounterSort extends Sort{
    static int[] arrayMinMax(int [] arr){
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (max < j) max = j;
            else if (min > j) min = j;
        }
        return new int[]{min, max};
    }
    static int[] sort(int [] arr){
        int [] letMinMax = arrayMinMax(arr);
        int min = letMinMax[0];
        int max = letMinMax[1];
        int[] newArray = new int[max-min+1];
        for (int k : arr) {
            newArray[k - min]++;
        }
        int index = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > 0){
                for (int j = 0 ; j < newArray[i] ; j++){
                    arr[index++] = i + min;
                }
            }
        }
        return arr;
    }

}

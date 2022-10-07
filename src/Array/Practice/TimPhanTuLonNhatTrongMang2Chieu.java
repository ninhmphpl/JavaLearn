package Array.Practice;

import java.util.Arrays;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static int[][] createRandomArrays(){
        int[][] array = new int[3][3];
        for (int i = 0 ; i < array.length ; i ++){
            for (int j = 0 ; j < array[0].length ; j ++){
                array[i][j] = (int) Math.floor(Math.random()*100);
            }
        }
        return array;
    }
    public static void disPlayArray(int[][] array){
        for (int i = 0; i < array.length ; i ++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
    static int[] maxValueArray (int[][] array){
        int max = array[0][0];
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0 ; i < array.length ; i ++){
            for (int j = 0 ; j < array[0].length ; j ++){
                if(array[i][j] > max ){
                    max = array[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        return new int[]{max, maxI, maxJ};
    }
    public static void main(String[] args) {
        int[][] arr = createRandomArrays();

        disPlayArray(arr);
        System.out.println(Arrays.toString(maxValueArray(arr)));
    }
}

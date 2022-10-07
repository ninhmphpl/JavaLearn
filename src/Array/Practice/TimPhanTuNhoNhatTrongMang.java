package Array.Practice;

import java.util.Arrays;

public class TimPhanTuNhoNhatTrongMang {
    static int[] minValueArray (int[][] array) {
        int min = array[0][0];
        int minI = 0;
        int minJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        return new int[]{min, minI, minJ};
    }
    public static void main(String[] args) {
        TimPhanTuLonNhatTrongMang2Chieu min = new TimPhanTuLonNhatTrongMang2Chieu();
        int[][] array = min.createRandomArrays();
        min.disPlayArray(array);
        System.out.println(Arrays.toString(minValueArray(array)));




    }
}

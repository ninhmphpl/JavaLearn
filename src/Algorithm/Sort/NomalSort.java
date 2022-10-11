package Algorithm.Sort;

import OOP.Practice.StopWatch;

public class NomalSort {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();
        int[] arr = new int[10000000];
        for (int i = 0; i < arr.length ; i ++){
            arr[i] = (int) Math.floor(Math.random()*100);
        }
//        for (int i = 0 ; i < arr.length; i++){
//            for (int j = i ; j < arr.length ; j ++){
//                if(arr[i]<arr[j]){
//                    int tempt = arr[j];
//                    arr[j]=arr[i];
//                    arr[i] = tempt;
//                }
//            }
//        }
        int[] number = new int[100];
        for (int i = 0 ; i < arr.length ; i++){
            number[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < number.length ; i++){
            if (number[i] > 0){
                for (int j = 1 ; j <= number[i] ; j++){
                    arr[index++] = i;
                }
            }
        }
//        System.out.println(Arrays.toString(number));
//        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(arr));
        System.out.println(time.getElapsedTime());
        //https://ongdevtutorials.github.io/sorting-algorithms-visualizer/

    }
}

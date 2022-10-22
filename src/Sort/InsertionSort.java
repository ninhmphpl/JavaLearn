package Sort;

import java.util.Arrays;

public class InsertionSort extends Sort {
    public static void sort(int [] arr){
        // 1. cách giải quyết vấn đề:
        // cho phần tử i chạy từ trái sang phải của mảng
        // nếu phần tử phía phải nhỏ hơn nó thì di chuyển phần tử đó về phía bên trái của mảng
        // cho đến khi nó không nhỏ hơn phần tử phía bên trái nó thì dừng lại

        //2. cho i chạy từ vị tri 0 den vi tri leng - 1
        for (int i = 0; i + 1 < arr.length; i++) {
            //3.  nếu phần  tử phía trái nó nhỏ hơn nó thì đổi chỗ
            if (arr[i] > arr[i+1]) {
                //4. gán j tại vị trí i để bắt đầu di chuyển phẩn tử đó về vị trí đúng.
                int j = i;
                //5. đổi chỗ j với phần tử bên trái nếu lớn hơn nó
                //6. giảm j sau mỗi lần lặp
                //7. kết thúc vòng lặp nếu j < 0 hoặc phần tử phía trước nó nhỏ hơn nó.
                while ((j>=0) && (arr[j] > arr[j+1])) {
                    swap(arr,j,j+1);
                    j--;
                }
            }
        }
    }
}
// https://ongdevtutorials.github.io/sorting-algorithms-visualizer/

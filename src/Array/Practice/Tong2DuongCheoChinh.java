package Array.Practice;

public class Tong2DuongCheoChinh {
    public static void main(String[] args) {


        TimPhanTuLonNhatTrongMang2Chieu create = new TimPhanTuLonNhatTrongMang2Chieu();


        int arr[][] = create.createRandomArrays();
        create.disPlayArray(arr);
        int i = 0;
        int j = 0;
        int cout1 = 0;
        int cout2 = 0;

        while (i < arr.length){
            cout1 += arr[i++][j++];
        }
        j--;
        i = 0;
        while (j>=0){
            cout2 += arr[i++][j--];
        }
        System.out.println("gia tri 2 duong cheo : " + cout1 + "," + cout2);
    }
}

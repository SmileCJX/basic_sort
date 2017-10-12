package pers.caijx.sort.insertsort;

/**
 * Created by caijx on 2017/10/12/012.
 */
public class ShellSorting {

    /**
     * 希尔排序
     * 不稳定
     * 平均时间复杂度：O(nlogn)
     * @param arr
     */
    private static void sort(int[] arr) {
        int d = arr.length;
        while (true) {
            d = d / 2;

            for (int i=0; i<d; i++){
                for (int j=i+d; j<arr.length; j=j+d) {
                    int temp = arr[j];
                    int k;
                    for (k=j-d; k>=0&&arr[k]>temp; k=k-d) {
                        arr[k+d] = arr[k];
                    }
                    arr[k+d] = temp;
                }
            }

            if (d == 1) {
                break;
            }
        }
    }

    public static void main(String[] args){

        int [] arr = {20,50,18,14,28,60,38,29,21};
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sort(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

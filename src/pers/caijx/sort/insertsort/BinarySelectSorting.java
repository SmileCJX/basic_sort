package pers.caijx.sort.insertsort;

/**
 * Created by caijx on 2017/10/12/012.
 */
public class BinarySelectSorting {

    /**
     * 二分插入排序
     * 稳定排序
     * 最好情况：复杂度O(N)
     * 最坏情况：复杂度O(N2/2)
     * 平均复杂度：O(N2)
     * @param arr 排序数组
     */
    private static void sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int left = 0;
            int right = i-1;
            int mid = 0;
            while (left<=right) {
                mid = (left + right) / 2;
                if (temp < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i-1; j>=left; j--) {
                arr[j+1] = arr[j];
            }
            if (left != i) {
                arr[left] = temp;
            }
        }
    }

    public static void main(String[] args){

        int [] arr = {20,50,18,49,28,60,38,29,21};
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

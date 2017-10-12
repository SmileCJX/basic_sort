package pers.caijx.sort.insertsort;

/**
 * Created by caijx on 2017/10/12/012.
 */
public class StraightSelectSorting {

    /**
     * 直接插入排序,从第二个数值开始，往前进行比较，比前面数值小，则交换位置。相当于插入一个有序序列，直到排序结束
     * 稳定排序
     * 最好情况：只比较一次，复杂度O(N)
     * 最坏情况：都比较i-1此，复杂度O(N2)
     * 平均复杂度：O(N2)
     * @param arr 排序数组
     */
    private static void sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            //要插入的数值
            int temp = arr[i];
            int j;
            for (j=i-1; j>=0; j--){
                if (arr[j] > temp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args){

        int [] arr = {30,49,50,20,18,39,30,48};
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

package pers.caijx.sort.mergesort;

/**
 * 归并排序是稳定的排序方法。
 * 归并排序的时间复杂度为O(nlogn)。
 * 速度仅次于快速排序，为稳定排序算法，一般用于对总体无序，但是各子项相对有序的数列。
 * Created by Administrator on 2017/11/1/001.
 */
public class MergeSort {

    private static void sort(int[] a,int left,int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            //对左边进行递归
            sort(a,left,middle);
            //对右边进行递归
            sort(a,middle+1,right);
            //合并
            merge(a,left,middle,right);
        }
    }

    private static void merge(int[] a, int left, int middle, int right) {
        int [] tmpArr = new int[a.length];
        //右边的起始位置
        int mid = middle + 1;
        int tmp = left;
        int third = left;
        while (left <= middle && mid <= right) {
            //从两个数组中选出较小的数放入中间数组
            if (a[left] <=  a[mid]) {
                tmpArr[third++] = a[left++];
            } else {
                tmpArr[third++] = a[mid++];
            }
        }
        //将剩余部分放入中间数组
        while (left <= middle) {
            tmpArr[third++] = a[left++];
        }
        while (mid <= right) {
            tmpArr[third++] = a[mid++];
        }
        //将中间数组复制回原数组
        while (tmp <= right) {
            a[tmp] = tmpArr[tmp++];
        }
    }

    public static void main(String[] args) {
        int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        sort(a,0,a.length-1);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}

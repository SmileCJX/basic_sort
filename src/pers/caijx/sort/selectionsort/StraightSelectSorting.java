package pers.caijx.sort.selectionsort;

/**
 * 直接选择排序
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * 时间复杂度：T(n) = O(n2)
 * Created by Administrator on 2017/10/28/028.
 */
public class StraightSelectSorting {

    private static void sort(int[] a) {
        //简单的选择排序
        for (int i = 0; i < a.length; i++) {
            //最小数
            int min = a[i];
            //当前最小数索引
            int n = i;
            for (int j = i+1; j < a.length; j++) {
                //找出当前最小数
                if (a[j] < min) {
                    min = a[j];
                    n = j;
                }
            }
            a[n] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        System.out.println("排序之前");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}

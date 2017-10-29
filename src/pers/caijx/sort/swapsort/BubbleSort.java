package pers.caijx.sort.swapsort;

/**
 * 时间复杂度T(n) = O(n2)
 * Created by Administrator on 2017/10/29/029.
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param a
     */
    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                //这里i-1主要是每遍历一次都把最大的i个数沉到最底下去了
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};
        System.out.println("排序之前：");
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

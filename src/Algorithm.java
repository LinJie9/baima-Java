import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {

    // 7-26
    int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
    System.out.println(search(arr, 7));

//        int[] arr = new int[]{3, 5, 7, 8, 1, 2, 9};
//        System.out.println(Arrays.toString(arr));
        // int[] arr = new int[]{3, 5, 7, 8, 1, 2, 9};
        // sort(arr);
        // System.out.println(Arrays.toString(arr));

    }

    // 二分查找，先计算出数组的最小和最大数，然后求一个平均数，用平均数和目标数进行比较
        // 每次的比较，都能知道平均数是大了还是小了，然后让最大还是最小数进行+-
        // 一边不动，一边加减，eg，左不动，右边减一，右不动，左加一
    private static int search(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            // mid是下标
            int mid = (left + right) / 2;
            int i = arr[mid];
            if(i < target){
                left = mid + 1;
            }else if(i > target){
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;


//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > target){
//                break;
//            }
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
    }


    // 为什么双循环？
    // 因为要把最大的数放到最后，所以需要循环n - 1次
    // 每次循环都要把最大的数放到最后，所以需要循环n - 1次
    // 每次循环都要比较、交换相邻的两个数，所以需要循环n - 1次
    // private static void sort(int[] arr) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         // 为什么设置flag？
    //         // 因为如果已经排好序了，就不需要再循环了
    //         boolean flag = false;
    //         for (int j = 0; j < arr.length - i - 1; j++) {
    //             if(arr[j] > arr[j + 1]){
    //                 int tmp = arr[j + 1];
    //                 arr[j + 1] = arr[j];
    //                 arr[j] = tmp;
    //                 flag = true;
    //             }
    //         }
    //         if(!flag){
    //             break;
    //         }
    //     }
    // }
}

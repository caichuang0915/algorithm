package com.tupelo.algorithm.service.impl;

import com.alibaba.fastjson.JSON;
import com.tupelo.algorithm.service.SortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author caichuang
 * @version V1.0
 * @date 2019/6/4 18:31
 * @Description 快速排序
 */
@Service
public class QuickSortServiceImpl implements SortService {

    private static Logger logger = LoggerFactory.getLogger(QuickSortServiceImpl.class);

    /**
     从数列中挑出一个元素，称为 “基准”（pivot）;

     重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；

     递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；

     平均时间复杂度是 O（nlogn），最坏情况下的时间复杂度是 O（n^2）。
     */
    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }

    private static int[] quickSort(int[] array, int left, int right){
        if(left<right){
            int pari = partition(array,left,right);
            quickSort(array,left,pari-1);
            quickSort(array,pari+1,right);
        }
        return array;
    }

    private static int[] quickSortBak(int[] array, int left, int right){
        if(left<right){
            int pari = partitionBak(array,left,right);
            quickSort(array,left,pari-1);
            quickSort(array,pari+1,right);
        }
        return array;
    }


    private static int partition(int[] arr,int left,int right){

        int start = left;
        int pivot = arr[left];

        while(left != right){
            // 左侧小于选定的值 指针向右移一位
            while(left<right && arr[left]<=pivot){
                left++;
            }
            // 右侧大于选定的值 指针向右移一位
            while (right>left && arr[right] > pivot){
                right--;
            }
            // 如果还没有重合 则交换两个指针处的值
            if(left<right){
                swap(arr,left,right);
            }
        }

        // 指针重合 与 选定位置交换
        if(arr[left]<pivot){
            swap(arr,left,start);
            return left;
        }else{
            swap(arr,left-1,start);
        }
        return left-1;
    }

    private static void swap(int[] arr,int i ,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {1,234,546,78,45,23,88,50,100,32,63,2932};
        quickSortBak(array,0,array.length-1);
        System.out.println(JSON.toJSONString(array));
    }


    private static int partitionBak(int[] arr,int left,int right){

        int pivot = arr[left];
        int start = left;

        while(left<right){

            // 从右边开始比较
            while (left<right){
                if(arr[right] < pivot){
                    arr[left] = arr[right];
                    start = right;
                    left++;
                    break;
                }
                right--;
            }
            // 从左边开始比较
            while (left<right){
                if(arr[left]>pivot){
                    arr[right] = arr[left];
                    start = left;
                    right--;
                    break;
                }
                left++;
            }

        }
        arr[start] = pivot;
        return start;
    }
}

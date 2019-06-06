package com.tupelo.algorithm.service.impl;

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

     时间复杂度 O(nlogn)
     */
    @Override
    public void sort(int[] array) {


    }


    private int partition(int[] arr,int left,int right){

        return 0;
    }

    private void swap(int[] arr,int i ,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

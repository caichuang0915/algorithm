package com.tupelo.algorithm.service.impl;

import com.alibaba.fastjson.JSON;
import com.tupelo.algorithm.service.SortService;

/**
 * @author caichuang
 * @version V1.0
 * @date 2019/6/4 20:52
 * @Description 选择排序
 */
public class SelectionSortServiceImpl implements SortService {
    /**
     首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置

     再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。

     重复第二步，直到所有元素均排序完毕。

     时间复杂度 O(n2)
     */
    @Override
    public void sort(int[] array) {
        for (int i=0 ; i<array.length-1 ; i++){
            int min = i;
            for (int j=i+1 ; j<array.length ; j++){
                if(array[j]<array[i]){
                    min = j;
                }
            }
            if (min > i) {
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }
}

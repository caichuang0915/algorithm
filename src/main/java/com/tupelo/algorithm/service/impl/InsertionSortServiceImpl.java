package com.tupelo.algorithm.service.impl;

import com.alibaba.fastjson.JSON;
import com.tupelo.algorithm.service.SortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author caichuang
 * @version V1.0
 * @date 2019/6/4 18:57
 * @Description 插入排序
 */
@Service
public class InsertionSortServiceImpl implements SortService {

    private static Logger logger = LoggerFactory.getLogger(InsertionSortServiceImpl.class);

    /**
     将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。

     从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）

     时间复杂度 O(n2)
     */
    @Override
    public void sort(int[] array) {
        for(int i=1 ; i<array.length;i++){
            int tmp = array[i];
            for(int j=i-1;j>0;j--){
                if(array[j]>tmp){
                    array[j+1] = array[j];
                }else {
                    array[j+1] = tmp;
                    break;
                }
            }
        }
    }
}

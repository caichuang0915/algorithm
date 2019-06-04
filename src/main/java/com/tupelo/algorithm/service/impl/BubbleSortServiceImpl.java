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
 * @Description 冒泡排序
 */
@Service
public class BubbleSortServiceImpl implements SortService {

    private static Logger logger = LoggerFactory.getLogger(BubbleSortServiceImpl.class);

    /**
     比较相邻的元素。如果第一个比第二个大，就交换他们两个。

     对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。

     针对所有的元素重复以上的步骤，除了最后一个。

     持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。

     时间复杂度 O(n2)
     */
    @Override
    public void sort(int[] array) {
        //记录最后一次交换的位置
        int lastExchangeIndex = 0;

        //无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = array.length - 1;

        for (int i=0;i<array.length;i++){
            // 判断是否已经是有序的
            Boolean bool = true;

            for (int j=0;j<sortBorder;j++){
                logger.warn("j:" + j + " j+1:" + (j+1));
                if(array[j] > array[j+1]){
                    int m = array[j];
                    array[j] = array[j+1];
                    array[j+1] = m;

                    // 更新最后一次交换的地方
                    lastExchangeIndex = j;

                    // 判断是否已经是有序的
                    bool = false;
                }
            }
            sortBorder = lastExchangeIndex;
            if(bool){
                break;
            }
        }
    }
}

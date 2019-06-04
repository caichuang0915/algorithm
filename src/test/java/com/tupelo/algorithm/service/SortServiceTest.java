package com.tupelo.algorithm.service;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author caichuang
 * @version V1.0
 * @date 2019/6/4 18:58
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SortServiceTest {

    @Autowired
    private SortService insertionSortServiceImpl;

    @Test
    public void sort() {
        int[] array = {1,2,3,9,8,7,5,4,6};
    }
}
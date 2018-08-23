package com.hh.springbootredis.biz.impl;

import com.hh.springbootredis.biz.TestBiz;

import org.springframework.stereotype.Service;

/**
 * @author HaoHao
 * @Description:
 * @date 2018/7/15下午5:47
 */

@Service("copyTestBizImpl")
public class CopyTestBizImpl implements TestBiz {

    @Override
    public void say(String words) {
        System.out.println("她说:" + words);
    }
}

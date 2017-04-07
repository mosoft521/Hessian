package com.henry.xi.hessian.impl;

import com.henry.xi.hessian.MathService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by admin on 2016/1/27.
 */
public class HessianMathService implements MathService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    public int add(int a, int b) {
        logger.debug("{} + {} = {} ", a, b, a + b);
        return a + b;
    }

}
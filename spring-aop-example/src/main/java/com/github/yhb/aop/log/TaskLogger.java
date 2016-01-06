package com.github.yhb.aop.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Haibin on 16/1/6.
 */
public class TaskLogger {
    private final Logger log = LoggerFactory.getLogger("TaskLogger");
    public void before() {
        log.info("before");
    }

    public void after() {
        log.info("after");
    }
}

package com.github.yhb.aop.service;

/**
 * Created by Haibin on 16/1/6.
 */
public interface ITaskExecutor {
    /**
     * 执行任务
     * @param param 传入的参数
     * @throws Exception 异常
     */
    public void exec(Object param) throws Exception;
}

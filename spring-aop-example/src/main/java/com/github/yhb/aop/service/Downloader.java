package com.github.yhb.aop.service;

/**
 * Created by Haibin on 16/1/6.
 */
public class Downloader implements ITaskExecutor {
    @Override
    public void exec(Object param) throws Exception {
        System.out.println(String.format("Download object: %s", param));
    }
}

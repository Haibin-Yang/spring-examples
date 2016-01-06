package com.github.yhb.aop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Haibin on 16/1/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application.xml"})
public class DownloaderTest {

    @Autowired
    ITaskExecutor downloader;
    @Test
    public void testExec() throws Exception {
        downloader.exec("test");
    }
}
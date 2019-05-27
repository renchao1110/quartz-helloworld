package com.glodon.quartz.helloworld.helloworld01;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author ：renc
 * @date ：Created in 2019/5/27 11:03
 * @description：通过实现job接口 ，来定义一个具体要干的工作
 */
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("***********helloworld***************");
    }
}

package com.glodon.quartz.helloworld.helloworld01;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author ：renc
 * @date ：Created in 2019/5/27 11:05
 * @description：简单的测试
 */
public class HelloWorld01 {

    public static void main(String[] args) throws SchedulerException {
        //创建SchedulerFactory工厂
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        //获取任务调度Scheduler对象
        Scheduler scheduler = schedulerFactory.getScheduler();
        //创建JobDetail对象并传入自定义的Job对象
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("myJob01","group01").build();
        //创建触发器对象，设置触发条件
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger01","group01").startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();

        scheduler.scheduleJob(jobDetail,trigger);
        //启动
        scheduler.start();
    }
}

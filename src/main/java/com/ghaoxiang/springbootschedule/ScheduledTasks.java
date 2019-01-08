/*
* 文件名: com.ghaoxiang.springbootschedule
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 17:32
* 修改人:
* 修改时间: 2019年01月08日 17:32
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.springbootschedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title ScheduledTasks
 * @Description springboot定时任务
 * @date 2019年01月08日 17:32
 * @since V1.0
 */
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        log.info("The fixedRate time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay=1000)
    public void fixedDelayJob(){
        log.info("The fixedDelay time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron="0 39 17 * * ?")
    public void cronJob(){
        log.info("The cronJob time is now {}", dateFormat.format(new Date()));
    }
}

package com.abc.controller;

import com.abc.entity.SysLog;
import com.abc.service.SysLogService;
import com.abc.vo.Json;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description  日志记录相关配置类
 * created      2020/10/25 21:09
 * class_name   LogManagerController
 * @author      wzb
 * @version     1.0
 */
@RestController
@RequestMapping("/log")
public class LogManagerController {
    private static final Logger log = LoggerFactory.getLogger(SysRoleController.class);
   @Autowired
   private SysLogService sysLogService;
    @PostMapping("/getLog")
    public Json getLog(@RequestBody String body){
        String oper = "query role";
        log.info("{}, body: {}", oper, null);

        Wrapper<SysLog> queryParams = new EntityWrapper<>();
        queryParams.orderBy("id",false);
        Page<SysLog> page = sysLogService.selectPage(new Page<SysLog>(1, 20), queryParams);
        return Json.succ(oper).data("page",page);

    };
}

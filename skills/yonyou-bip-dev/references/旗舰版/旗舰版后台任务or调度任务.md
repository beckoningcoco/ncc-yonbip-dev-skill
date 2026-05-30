---
name: 旗舰版后台任务/调度任务
description: >
  用友 BIP 客开技能。当用户需要开发后台任务或调度任务（如定时生成确认单），涉及新建调度类型、编写 Controller、回调平台更新任务状态时，参考该文档内容。
---

# 旗舰版后台任务or调度任务

```
开发后台任务：当【出租合同】表头"是否自动确认收入"为是时，检查下后台任务执行时系统日期与【出租合同】单据<摊销>页签中"结束日期"为同一月、并且当前月没有【出租收入确认单】生成时，后台任务自动生成执行月的【出租收入确认单】；

开发方案：新增调度任务，调用后端controller RentalConfirmController，执行逻辑。
```

## 流程如下

### 新建调度类型

![image-20250722174508907](旗舰版后台任务or调度任务/image-20250722174508907.png)

![image-20250722174539150](旗舰版后台任务or调度任务/image-20250722174539150.png)

接口属性，对应的是后端的一个controller类，需要自己开发

### 新建后台任务

![image-20250722174746771](旗舰版后台任务or调度任务/image-20250722174746771.png)

![image-20250722174831443](旗舰版后台任务or调度任务/image-20250722174831443.png)

### 编写后端controller

```java
package com.yonyou.ucf.mdf.contract.controller;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.bd.org.privateutil.AuthHttpClientUtils;
import com.yonyou.ucf.mdf.contract.service.IRentalConfirmTaskService;
import com.yonyou.ucf.util.PropertyUtil;
import iuap.yms.thread.api.YmsExecutors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/rentalConfirm")
public class RentalConfirmController {
    private ExecutorService ymsExecutor = YmsExecutors.getYmsExecutor();

    @Resource
    private IRentalConfirmTaskService rentalConfirmTaskService;

    @RequestMapping("/task/addConfirm")
    public Object addConfirm(HttpServletRequest request, @RequestBody(required = false) Map<String, Object> paramMap) {
        String logId = request.getHeader("logId");
        String execDate = paramMap == null ? null : (String) paramMap.get("execDate");
        if (StringUtils.isBlank(execDate)) {
            int timezone = 8;
            int offset_GMT = new Date().getTimezoneOffset();
            long nowDate = new Date().getTime();
            Date date = new Date(nowDate + offset_GMT * 60 * 1000 + timezone * 60 * 60 * 1000);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            execDate = sdf.format(date);
        }

        String finalExecDate = execDate;
        ymsExecutor.execute(() -> {
            try {
                rentalConfirmTaskService.addConfirm(finalExecDate);
                callbackPlatform(logId, 1, "执行成功");
            } catch (Exception e) {
                log.error("RentalConfirmController.addConfirm 异常: ", e);
                String stackTrace = Arrays.stream(e.getStackTrace())
                        .map(StackTraceElement::toString)
                        .collect(Collectors.joining("\n"));
                callbackPlatform(logId, 0, "执行日期参数："+ finalExecDate + "\r" + e.getMessage()+" \r\n " + stackTrace);
            }
        });
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("id", logId);
        resultMap.put("title", "生成出租收入确认单");
        resultMap.put("asynchronized", "true");
        return resultMap;
    }

    private void callbackPlatform(String logId, int status, String msg) {
        // 回调调度任务
        JSONObject param = new JSONObject();
        param.put("status", status);
        param.put("id", logId);
        try {
            param.put("content", msg);
            String url = PropertyUtil.getPropertyByKey("domain.iuap-apcom-coderule") + "/warning/warning/async/updateTaskLog";
            AuthHttpClientUtils.execPost(url, null, null, param.toString());
        } catch (Exception e) {
            log.error("回调平台，更改任务状态异常:{}", e.getMessage());
        }
    }
}
```

# 后端脚本进阶开发

> 来源：YonBIP 社区文档中心 - c2.yonyoucloud.com
> 抓取时间：2026-05-28
> 原始URL：https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/YCDY12

## 概述

本文讲解应用构建后端脚本预制函数使用，包含：远程调用、消息触达、调度任务、事件订阅。

关键词：远程调用、openLinker、postman、定时规则、sendMessage、事件订阅

---

## 远程调用

### 后端函数调用BIP开放平台接口 — openLinker

自动根据应用编码查找 appKey/appSecret 获取 token。

**POST示例：**
```js
let url = "https://dbox.yonyoucloud.com/iuap-api-gateway/yonbip/digitalModel/orgunit/querytree";
let body = {};
let apiResponse = openLinker("POST", url, "应用编码", JSON.stringify(body));
```

**GET示例：**
```js
let url = "https://dbox.yonyoucloud.com/.../detail?id='1978519454683392'";
let apiResponse = openLinker("GET", url, "应用编码", JSON.stringify({}));
```

### 后端函数调用三方系统接口 — postman / postmanPure

**postman**：携带当前上下文信息（含 yht_access_token），适合调本系统内部接口
**postmanPure**：纯净HTTP请求，不携带任何默认上下文，适合跨租户/外部系统

函数脚本调用外部接口数据量限制：领域服务最多500条，标准服务最多2000条。

**GET请求：**
```js
let header = { 'Content-Type': "application/json;charset=UTF-8" };
let responseObj = postman("get", "https://xxx.com/test", JSON.stringify(header), JSON.stringify(body));
```

**POST请求：**
```js
let body = { testBody: "testBody" };
let responseObj = postman("post", "https://xxx.com/test", JSON.stringify(header), JSON.stringify(body));
```

### openLinker vs openLinkerPure 区别
- **openLinker**：默认使用当前租户token，不用加yht_access_token
- **openLinkerPure**：需在header中加 yht_access_token，适用跨租户调用

### postman vs postmanPure 区别
- **postman**：携带当前上下文（含token），方便调本系统接口
- **postmanPure**：无状态，兼容性更好，适合外部系统

### 后端函数相互调用
```js
let func1 = extrequire("GT27789AT209.backDesignerFunction.1639808631397_0");
let res = func1.execute(context, param);
```

### 获取当前数据中心域名
```js
ObjectStore.env().url
```

---

## 消息触达（sendMessage）

channels 可选值：`mail`、`sms`、`uspace`、`weixin`、`enterprise_wechat`（不传表示全部发送）

### 发送邮件
```js
var mailReceiver = ['nishch@yonyou.com'];
var channels = ['mail'];
var messageInfo = {
  sysId: 'diwork',
  tenantId: ObjectStore.env().tenantId,
  mailReceiver: mailReceiver,
  channels: channels,
  subject: 'email title',
  content: 'email content',
};
var result = sendMessage(messageInfo);
```
使用前提：在"数字化建模 → 消息平台 → 消息通道"配置发件箱

### 发送友空间工作通知
```js
var uspaceReceiver = ['user-id-xxx'];
var channels = ['uspace'];
var messageInfo = {
  sysId: 'diwork', tenantId: ObjectStore.env().tenantId,
  uspaceReceiver: uspaceReceiver, channels: channels,
  subject: 'title', content: 'content',
};
var result = sendMessage(messageInfo);
```

### 发送友空间待办消息
```js
var messageInfo = {
  ...,
  messageType: 'createToDo',
  createToDoExt: { webUrl: 'www.xxx.com' },
};
var result = sendMessage(messageInfo);
```

### 发送友空间预警消息
```js
var messageInfo = { ..., groupCode: 'prewarning' };
var result = sendMessage(messageInfo);
```

**uspaceReceiver 获取**：用户管理菜单中的用户ID

---

## 调度任务

步骤：
1. 创建后端脚本，获取函数地址
2. 进入"调度任务"节点 → 任务管理 → 新增任务
3. 调度类型选择"后端脚本"，脚本编码填写函数地址
4. 配置定时规则
5. 保存

可以手动触发一次验证执行逻辑。调度任务失败可以手动执行补偿。

---

## 事件订阅

### 配置函数
```js
let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
  execute(request) {
    let a = { a: request };
    let header = { 'Content-Type': 'application/json;charset=UTF-8' };
    var strResponse = postman('post', 'http://xxx.com/rest/v1/openapi/isv/test',
      JSON.stringify(header), JSON.stringify(a));
    return {};
  }
}
exports({ entryPoint: MyAPIHandler });
```

### 添加事件订阅
1. 应用构建 → 集成配置 → 事件订阅 → 函数选项 → 新增 → 添加函数 → **保存**
2. 事件订阅页签 → 新增 → 选择事件

**注意**：在添加函数后必须在事件订阅页面点击保存后再切换页签，否则函数绑定关系会丢失。

### 常见问题
- 事件订阅选择不到需要的 → 原厂未提供，提交需求工单
- 三方系统如何接收消息 → 三方开放公网可访问的REST接口，函数中通过postman调用

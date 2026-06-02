---
tags: [API调用, DynamicProxy, invokeFunction, AbstractAPIHandler, AbstractTrigger, openLinker, postman, sendMessage]
created: 2026-05-27
updated: 2026-05-28
sources: [2026-05-27-bip-api-call, 2026-05-28-bip-backend-script-intro, 2026-05-28-bip-backend-script-advanced]
platform_version: "BIP V5"
project: ""
last_verified: 2026-05-31
status: verified
source_type: practice
---

# API调用

> BIP 平台前后端 API 调用的完整方案。

## 前端调用方式

### 前端 → 后端 Controller
```javascript
let proxy = cb.rest.DynamicProxy.create({
    methodName: { url: '/path', method: 'POST', options: { domainKey: 'xxx' } }
});
proxy.methodName(params);
```

### 前端 → 后端函数
```javascript
cb.rest.invokeFunction("functionId", params, function(err, res) { ... });
// 非ObjectStore操作必须加 domainKey 参数
cb.rest.invokeFunction("路径", {参数}, callback, viewModel, {"domainKey": "developplatform"});
```

## 后端调用方式

### AbstractAPIHandler（API脚本）
```javascript
let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
  execute(request) { return {}; }
}
exports({"entryPoint": MyAPIHandler});
```
用途：前端调后端、发布为接口供三方调用

### AbstractTrigger（后端脚本）
```javascript
let AbstractTrigger = require('AbstractTrigger');
class MyTrigger extends AbstractTrigger {
  execute(context, param) {
    var val = param.data[0].field;
    param.data[0].set('new1', 'value');
    return {};
  }
}
exports({"entryPoint": MyTrigger});
```
用途：规则链、调度任务

### 后端调BIP内部接口 — openLinker
```javascript
let apiResponse = openLinker("POST", url, "应用编码", JSON.stringify(body));
let apiResponse = openLinker("GET", url, "应用编码", JSON.stringify({}));
```
自动根据应用编码获取 appKey/appSecret 和 token

### 后端调外部系统 — postman / postmanPure
```javascript
let header = { 'Content-Type': 'application/json;charset=UTF-8' };
let response = postman("get", url, JSON.stringify(header), JSON.stringify(body));     // 带上下文token
let response = postmanPure("post", url, JSON.stringify(header), JSON.stringify(body)); // 纯净请求
```

| 方法 | Token | 适用场景 |
|------|-------|----------|
| `openLinker` | 自动获取 | 调BIP内部开放平台接口 |
| `openLinkerPure` | 需手动传appKey/appSecret | 跨租户调BIP接口 |
| `postman` | 携带当前上下文token | 调本系统REST接口 |
| `postmanPure` | 不携带上下文 | 调外部/三方系统 |

### 后端函数互调
```javascript
let func = extrequire("函数路径地址");
let res = func.execute(context, param);
```

## 消息触达 — sendMessage
```javascript
var result = sendMessage({
  sysId: 'diwork', tenantId: ObjectStore.env().tenantId,
  channels: ['mail'],  // mail/sms/uspace/weixin/enterprise_wechat
  subject: '标题', content: '内容',
  mailReceiver: ['xx@yy.com']
});
```
支持：邮件、友空间通知、待办（`messageType: 'createToDo'`）、预警（`groupCode: 'prewarning'`）

## 后端 Java — BIP OpenAPI 调用（OpenServiceBuilder）

来自毛戈平 V5 项目 [[YonbipUtil]]，后端 Java 代码调用 BIP 平台 OpenAPI 的标准方式：

```java
OpenServiceBuilder builder = OpenServiceBuilder.build()
        .appKey(appKey).appSecret(appSecret).env(env);
InputParam inputParam = InputParam.build()
        .setUrl(url).setBody(reqBody)
        .setContentType(InputParam.CONTENT_TYPE_JSON)
        .setMethod(InputParam.METHOD_POST);
Map<String, Object> result = Invoke.getResult(builder, inputParam);
```

## 相关页面

- [[YonbipUtil]]
- [[IBillQueryRepository]]
- [[页面脚本]]
- [[yht_access_token]]
- [[搜索查询]]
- [[2026-05-28-bip-backend-script-advanced]]
- [[BIP后端开发模板]]

---
tags: [审核后, 扩展函数, 插件, 回写, Controller, 后端函数, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-after-audit-plugin.md]
---

# 审核后-扩展函数插件

> 单据审批后通过扩展函数插件调用后端 Controller，如审批后回写金额到上游单据。

## 实现方式

### 后端函数脚本

在审核后的扩展函数中调用后端 Controller：

```js
let token = ObjectStore.env().token;
let body = {
  date: param.billDOs[0].billDate,
  relatedId: param.billDOs[0].extendData.relateId,
  data: param.billDOs[0].bodyItem,
  allData: param.billDOs[0],
};
let header = { 'Content-Type': 'application/json;charset=UTF-8', Cookie: 'yht_access_token=' + token };
let url = ObjectStore.env().url + '/ctdevelopengine-be/check/afterAuditRecivable';
let strInfo = postman('post', url, JSON.stringify(header), JSON.stringify(body));
```

### Java 插件类

在 Controller 中定义服务类，接收参数后执行回写逻辑。

## 关键概念

- [[审核后事件]]
- [[扩展函数]]
- [[回写操作]]
- [[Controller 调用]]

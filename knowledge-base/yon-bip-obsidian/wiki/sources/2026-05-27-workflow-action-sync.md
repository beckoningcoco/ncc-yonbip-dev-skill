---
tags: [审批流, beforeWorkflowAction, 同步调用, ensureSync, Controller, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-workflow-action-sync.md]
---

# 页面脚本监听审批流操作并同步调用Controller

> 在页面脚本中监听审批流操作（驳回/退回），通过 beforeWorkflowAction 事件同步调用后端 Controller。

## 页面脚本

```js
viewModel.on('beforeWorkflowAction', (data) => {
  if (actionCode === 'reject') {
    var proxy = cb.rest.DynamicProxy.create({
      ensure: { url: url, method: 'POST', options: { domainKey: '...' } }
    });
    const result = proxy.ensureSync(param);  // 同步调用
    if (result.data.code != '200') {
      cb.utils.alert('退回失败！');
      return false;  // 阻止审批流继续
    }
  }
  return true;
});
```

使用 `ensureSync`（非 `ensure`）进行同步调用，确保审批操作前完成业务逻辑。

## Controller 返回格式

**必须**包含 `data` 字段，否则 `ensureSync` 解析不出来：

```java
Map<String, Object> response = new HashMap<>();
Map<String, Object> res = new HashMap<>();
response.put("data", res);
res.put("code", "200");
res.put("message", "操作成功");
return response;
```

## 关键概念

- [[beforeWorkflowAction]]
- [[ensureSync]]
- [[DynamicProxy]]
- [[审批流]]

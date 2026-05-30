---
tags: [API调用, DynamicProxy, invokeFunction, AbstractAPIHandler, AbstractTrigger, BIP]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bip-api-call.md]
---

# 20个BIP常用API调用代码片段

> BIP 前端和后端 API 调用的完整方案对比。

## 调用方式对比

| 方式 | 层级 | 适用场景 |
|------|------|----------|
| `cb.rest.DynamicProxy.create` | 前端 | 调后端 Controller |
| `cb.rest.invokeFunction` | 前端 | 调后端函数（by functionId） |
| `AbstractAPIHandler` | 后端 | 后端 API 接口 |
| `AbstractTrigger` | 后端 | 触发器/事件响应 |
| `ObjectStore.postman` | 后端 | 调外部系统 API |
| `rootStore.utils.request` | 前端 | 高级列表查询 |

## DynamicProxy 模式
```javascript
let proxy = cb.rest.DynamicProxy.create({
    methodName: { url: '/path', method: 'POST', options: { domainKey: 'xxx', async: false } }
});
var result = proxy.methodName(params);
```

## invokeFunction 模式
```javascript
cb.rest.invokeFunction("functionId", params, function(err, res) { ... });
```

## AbstractTrigger 调外部 API
```javascript
let env = ObjectStore.env();
let url = env.url + "/external/api/path";
let resp = ObjectStore.postman("post", url, header, body);
```

## 带 Loading 的调用
```javascript
cb.utils.loadingControl.start({ diworkCode });
// ... API 调用 ...
cb.utils.loadingControl.end({ diworkCode });
```
<!-- confidence: EXTRACTED -->

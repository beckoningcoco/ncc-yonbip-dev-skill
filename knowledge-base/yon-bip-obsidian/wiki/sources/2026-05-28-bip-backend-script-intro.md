---
tags: [后端脚本, API脚本, AbstractTrigger, AbstractAPIHandler, 规则链]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-bip-backend-script-intro]
---

# 后端脚本开发入门

> YonBIP 社区文档中心 — 后端函数基础开发。

## 核心内容

### 后端脚本 vs API脚本

| 类型 | 基类 | 使用场景 | 取参方式 |
|------|------|----------|----------|
| 后端脚本 | `AbstractTrigger` | 规则链、调度任务 | `param.data[0]` |
| API脚本 | `AbstractAPIHandler` | 前端调后端、发布为接口 | `request` |

### 后端脚本示例
```js
let AbstractTrigger = require('AbstractTrigger');
class MyTrigger extends AbstractTrigger {
  execute(context, param) {
    var email = param.data[0].email;
    param.data[0].set('new1', '22' + "");
    return {};
  }
}
```

### API脚本示例
```js
let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
  execute(request) {
    return {};
  }
}
```

### 代码调试
仅商开环境可用：编辑器→调试→复制脚本→页面 Alt+Shift+D→执行

### 前端调用后端
`cb.rest.invokeFunction("路径", {参数}, callback, viewModel, {"domainKey": "developplatform"})`

非ObjectStore操作必须加 `domainKey` 参数

### 规则链配置
规则链最后添加新规则→选择"执行函数"→选择后端函数→调整顺序→保存

### 异常处理
```js
try { ... } catch (e) { ... } finally { ... }
```

## 相关页面
- [[页面脚本]]
- [[API调用]]
- [[保存事件]]

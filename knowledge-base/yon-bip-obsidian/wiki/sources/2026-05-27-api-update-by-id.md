---
tags: [后端函数, API函数, updateById, ObjectStore, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-api-update-by-id.md]
---

# 后端函数根据单据ID更新某字段

> 通过后端函数（API 函数）使用 `ObjectStore.updateById` 方法根据单据 ID 更新指定字段。

## 代码示例

```js
let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
  execute(request) {
    var object = { id: '2295302499099213828', dept: '2147407756992708624', bodyItem: [] };
    var res = ObjectStore.updateById('earap.payment.PaymentHeader', object, 'payment');
    return { res };
  }
}
exports({ entryPoint: MyAPIHandler });
```

- 第一个参数：实体 URI（如 `earap.payment.PaymentHeader`）
- 第二个参数：包含 id 和要更新的字段的对象
- 第三个参数：模块标识（如 `payment`）

## 关键概念

- [[ObjectStore]]
- [[后端函数]]
- [[API 函数]]
- [[updateById]]

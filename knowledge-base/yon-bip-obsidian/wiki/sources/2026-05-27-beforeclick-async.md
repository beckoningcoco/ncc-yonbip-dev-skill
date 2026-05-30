---
tags: [beforeclick, 按钮事件, 异步校验, 页面脚本, fireEvent, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-beforeclick-async.md]
---

# 旗舰版监听按钮点击前页面脚本写法

> 在按钮点击前（beforeclick）执行异步校验逻辑，校验不通过时阻止按钮默认行为。

## 核心模式

页面脚本不支持同步调用后端函数，需要：
1. `beforeclick` 中先 `return false` 阻止默认行为
2. 异步调用 `cb.rest.invokeFunction` 执行校验
3. 校验通过后通过 `viewModel.get('btn').fireEvent('click', data)` 手动触发

```js
let qjflag = true;
viewModel.get('btnCancelApprove').on('beforeclick', function (data) {
  if (qjflag) {
    cb.rest.invokeFunction('...DelExpenseBill', { billId: dataId }, function (err, res) {
      if (res.success) {
        qjflag = false;
        viewModel.get('btnCancelApprove').fireEvent('click', data);
        qjflag = true;
      }
    });
    return false;  // 先阻止默认行为
  }
});
```

使用 `qjflag` 标志位防止 `fireEvent` 触发时再次执行校验逻辑。

## 关键概念

- [[beforeclick 事件]]
- [[fireEvent]]
- [[异步校验]]
- [[cb.rest.invokeFunction]]

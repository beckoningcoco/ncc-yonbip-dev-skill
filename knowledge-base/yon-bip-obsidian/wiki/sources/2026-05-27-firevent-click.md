---
tags: [fireEvent, 按钮模拟, beforeclick, 异步校验, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-firevent-click.md]
---

# 旗舰版页面脚本模拟触发点击按钮

> 通过 beforeclick 拦截按钮点击、异步校验后使用 fireEvent('click') 手动触发按钮事件。

## 核心模式

```js
let qjflag = true;
viewModel.get('btn').on('beforeclick', function (data) {
  if (qjflag) {
    cb.rest.invokeFunction('...', params, function (err, res) {
      if (res.success) {
        qjflag = false;
        viewModel.get('btn').fireEvent('click', data);
        qjflag = true;
      }
    });
    return false;  // 先阻止默认点击
  }
});
```

`qjflag` 防止 fireEvent 触发时再次进入校验逻辑造成死循环。

## 关键概念

- [[fireEvent]]
- [[beforeclick 事件]]
- [[异步校验]]

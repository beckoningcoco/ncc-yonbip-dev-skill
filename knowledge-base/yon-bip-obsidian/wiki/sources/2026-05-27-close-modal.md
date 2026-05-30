---
tags: [弹窗, 模态框, communication, 关闭弹窗, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-close-modal.md]
---

# 旗舰版页面脚本关闭弹窗

> 在页面脚本中关闭弹窗（模态框），支持刷新或不刷新父页面。

## 关闭弹窗不刷新父页面

```js
viewModel.communication({
  type: 'return',
  payload: { cParameter: JSON.stringify({ refresh: false }) }
});
```

## 关闭弹窗（默认自动刷新父页面）

```js
viewModel.communication({ type: 'return' });
```

## 关键概念

- [[communication API]]
- [[模态框]]
- [[页面脚本]]

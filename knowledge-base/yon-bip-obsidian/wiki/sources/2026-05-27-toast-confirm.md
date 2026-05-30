---
tags: [提示框, Toast, Confirm, cb.utils, 页面脚本, React]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-toast-confirm.md]
---

# 提示框案例

> cb.utils.alert 和 cb.utils.confirm 的各种用法：轻提示、询问确认、自定义按钮、React 组件。

## Toast 轻提示

```js
cb.utils.alert({ title: '标题', type: 'info', duration: '3', mask: true, onClose: () => {} });
```
type 可选：error/fail/success/warning/info/noIcon

## Confirm 确认框

三种用法：
1. **简单回调**：`cb.utils.confirm('确定删除?', okFn, cancelFn)`
2. **自定义按钮**：传入 `footer` 数组，每个按钮配置 `text`、`type`、`onPress`
3. **React 自定义内容**：title 和 content 使用 `React.createElement` 创建，支持样式和富文本

## 关键概念

- [[cb.utils.alert]]
- [[cb.utils.confirm]]
- [[页面脚本]]

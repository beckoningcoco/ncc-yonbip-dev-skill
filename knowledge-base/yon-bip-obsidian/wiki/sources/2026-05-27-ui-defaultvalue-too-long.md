---
tags: [UI模板, 默认值, cDefaultValue, 脚本扩展, afterLoadData, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-ui-defaultvalue-too-long.md]
---

# UI模板中设置默认值保存超长

> cDefaultValue 字段长度仅 45 字符，超过限制无法在设计器中保存默认值。

## 报错

```
Data truncation: Data too long for column 'cDefaultValue' at row 1
```

## 解决方案

不在设计器中设置默认值，改用扩展脚本在 `afterLoadData` 中设置：

```js
viewModel.on('afterLoadData', function(data) {
  if (viewModel.getParams().mode == 'add') {
    viewModel.get('vmemo').setValue('很长的默认值文本...');
  }
});
```

## 关键概念

- [[cDefaultValue]]
- [[afterLoadData]]
- [[UI 模板默认值]]

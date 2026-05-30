---
tags: [列表, 条件颜色, setCellState, style, GridModel, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-grid-cell-color.md]
---

# 采购订单列表字段按条件显示不同颜色

> 在列表界面根据条件为不同行的字段设置不同颜色样式，类似"单据状态"效果。

## 实现

```js
viewModel.getGridModel().on('afterSetDataSource', (args) => {
  let rows = viewModel.getGridModel().getRows();
  rows.forEach((item, index) => {
    if (item.field == '无付款申请') {
      viewModel.getGridModel().setCellState(index, 'field', 'style', { color: 'green' });
    } else {
      viewModel.getGridModel().setCellState(index, 'field', 'style', { color: 'red' });
    }
  });
});
```

通过 `setCellState(index, fieldName, 'style', { color: 'xxx' })` 设置单元格颜色。

## 关键概念

- [[setCellState]]
- [[GridModel]]
- [[条件样式]]

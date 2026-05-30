---
tags: [状态控制, modeChange, afterStateRule, setActionsState, 页面脚本]
created: 2026-05-27
updated: 2026-05-27
sources: [2026-05-27-bip-state-control]
---

# 20个BIP状态控制代码片段

> BIP 页面状态控制的完整方案：字段显隐、按钮状态、表格行状态、单元格格式化。

## 控制层级

### 页面级（modeChange/afterStateRule）
```javascript
viewModel.on('modeChange', function(mode) {
    // mode: add/edit/browse
    viewModel.get('field').setDisabled(true/false);
    viewModel.get('field').setVisible(true/false);
});
```

### 表格行级（setActionsState）
```javascript
const actionsStates = rows.map(row => ({
    "btnEdit": { visible: condition },
    "btnDelete": { visible: condition }
}));
gridModel.setActionsState(actionsStates);
```

### 单元格级（setRowState）
```javascript
gridModel.setRowState(index, 'readOnly', true);
```

### 状态样式（formatter）
```javascript
gridModel.setColumnState('column', 'formatter', (rowInfo, rowData) => {
    return { override: true, html: `<div style='...'>...</div>` };
});
```

## 关键 API
- `field.setVisible/setDisabled/setState`
- `gridModel.setActionsState/setRowState/setColumnState/setState`
- `button.setDisabled(true)` — 防重复点击
<!-- confidence: EXTRACTED -->

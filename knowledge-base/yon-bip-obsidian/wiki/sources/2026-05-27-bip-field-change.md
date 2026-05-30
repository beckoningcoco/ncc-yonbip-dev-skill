---
tags: [字段值改变, afterValueChange, beforeValueChange, 页面脚本, BIP]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bip-field-change.md]
---

# 20个BIP字段值改变代码片段

> BIP 字段值改变事件的完整写法汇总，涵盖 afterValueChange、beforeValueChange、afterCellValueChange。

## 事件类型

### afterValueChange（字段值改变后）
- **联动赋值**：`viewModel.get('target').setValue(newValue)`
- **显隐控制**：`.setVisible(true/false)`
- **禁用控制**：`.setDisabled(true/false)`
- **调后端查询**：`cb.rest.invokeFunction` 异步查数据回填
- **批量回填**：`setProxy` + `async: false` 同步调后端接口回填多个字段
- **批量状态控制**：`forEach` + `setState('bCanModify'/'disabled', value)`

### afterCellValueChange（表格单元格值改变）
- `cellName` 判断改变的列 → 计算汇总/联动其他列
- `setCellValue(rowIndex, field, value)` 修改同表格其他单元格
- `setColumnState(field, stateName, bool)` 控制列属性

### beforeValueChange（值改变前）
- 支持 Promise 拦截：`new cb.promise()` + confirm 弹窗
- 返回 false 阻止变更

### 参照字段事件
- `afterReferOkClick` — 参照选择确认后回填

## 关键 API

| API | 说明 |
|-----|------|
| `afterValueChange` | 值改变后触发 |
| `beforeValueChange` | 值改变前（支持 Promise 拦截） |
| `afterCellValueChange` | 表格单元格值改变 |
| `setState('bCanModify', bool)` | 控制字段可修改 |
| `setState('disabled', bool)` | 控制字段禁用 |
<!-- confidence: EXTRACTED -->

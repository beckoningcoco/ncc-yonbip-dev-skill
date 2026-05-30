---
tags: [GridModel, 表格, 页面脚本, API参考, 行操作, 列操作, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-gridmodel-api.md]
---

# 表格（GridModel）方法和事件

> 页面表格 GridModel 的完整 API 参考，涵盖数据获取、行操作、列操作、状态控制、事件监听。

## 核心方法速查

| 分类 | 关键方法 |
|------|----------|
| **数据获取** | `getData()`, `getRows()`, `getSelectedRows()`, `getCellValue()` |
| **数据修改** | `setCellValue()`, `updateRow()`, `setColumnValue()` |
| **行操作** | `insertRow()`, `insertRows()`, `appendRow()`, `deleteRows()`, `deleteAllRows()` |
| **列操作** | `getColumns()`, `setColumns()`, `addColumns()` |
| **状态** | `setReadOnly()`, `setDirty()`, `setColumnState()`, `setRowState()`, `setCellState()` |
| **选中** | `select()`, `unselect()`, `selectAll()` |
| **分页** | `setPageSize()`, `setPageIndex()` |
| **数据源** | `setDataSource()`（local 模式传数据，非 local 传请求配置） |
| **校验** | `validate()`, `getDirtyData()` |

## 关键事件

值改变、行操作（增/删）、选中变化、数据源变化、排序/筛选均有 before/after 事件对。

`getRows(deep)` 获取的数据不含删除行（排序后、筛选前），`getRealViewRows()` 获取界面显示的数据（排序后、筛选后）。

## 关键概念

- [[GridModel]]
- [[页面脚本]]
- [[viewModel]]

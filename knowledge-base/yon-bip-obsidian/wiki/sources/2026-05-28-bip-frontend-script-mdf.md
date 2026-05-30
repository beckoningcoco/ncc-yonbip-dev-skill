---
tags: [前端脚本, MDF, viewModel, BaseModel, 页面路由, 模态框]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-bip-frontend-script-mdf]
---

# 前端脚本（MDF）开发

> YonBIP 社区文档中心官方文档 — MDF前端脚本开发入门。

## 核心内容

### 浏览器调试
- F12 开发者工具，Sources 面板搜索 `getHpaExtCodeRegister` 定位扩展脚本
- debugger 关键字 / 行号断点 / console.log 调试

### MDF 模型体系（核心概念）

MDF 框架将页面元素封装为模型，通过 JS 调用模型 API 控制 UI。事件通信采用发布订阅模式。

| 模型类型 | 对应页面元素 | 关键方法 | 关键事件 |
|----------|-------------|----------|----------|
| **BaseModel** | 所有模型基类 | `setVisible()`, `on()` | — |
| **viewModel** | 单据页面容器 | `get(field)`, `getGridModel()`, `hasFeature()` | `beforeSearch`, `afterLoadData`, `beforeSave`/`afterSave` 等动作事件 |
| **SimpleModel** | 输入框、按钮 | `getValue()`, `setValue()`, `clear()` | `beforeValueChange`, `afterValueChange` |
| **ListModel** | 下拉选框、复选框 | `setDataSource([...])` | `beforeSetDataSource`, `afterSetDataSource` |
| **GridModel** | 表格 | `getCellValue()`, `setCellValue()`, `getSelectedRows()`, `setColumnState()` | `beforeCellValueChange`, `afterCellValueChange` |
| **ReferModel** | 参照选框 | `setFilter()`, `browse()` | `beforeBrowse`, `beforeValueChange` |

### 页面路由
`cb.loader.runCommandLine('bill', {billtype, billno, domainKey, params: {mode, id, carryParams, query}}, viewModel)`

目标页面通过 `viewModel.getParams()` 接收参数

### 模态框
`templateType: 'modal'` + 第四个参数回调 `(subModel) => { return subModel }`

弹窗获取父模型：`viewModel.getCache('parentViewModel')`

## 关键知识点
- MDF前端模型概念和分类（容器级/控件级）
- 发布订阅事件模式（`on` 监听 / `execute` 触发）
- 动作事件的 before/after 模式
- 不支持 ES6 模块化语法

## 相关页面
- [[页面脚本]]
- [[API调用]]
- [[页面跳转]]
- [[页面生命周期]]

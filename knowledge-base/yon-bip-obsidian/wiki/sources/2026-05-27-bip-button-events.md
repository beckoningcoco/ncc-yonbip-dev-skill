---
tags: [按钮事件, 页面脚本, 点击事件, BIP]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bip-button-events.md]
---

# 20个BIP按钮点击事件代码片段

> BIP 页面按钮点击事件的常见实现模式。

## 按钮类型与模式

### 基础按钮
- `viewModel.get('btnCode').on('click', fn)` — 基础点击绑定
- `viewModel.get('btnCode').on('beforeclick', fn)` — 点击前事件（返回 false 阻止执行）
- `button.setDisabled(true/false)` — 防重复点击

### 业务按钮
- **新增/编辑按钮**：`cb.loader.runCommandLine('bill', request, viewModel)` 打开单据页面
- **保存并新增**：`viewModel.execute('save').then(() => viewModel.execute('add'))`
- **批量提交**：遍历 GridModel rows 校验 → `invokeFunction` 调后端
- **撤回按钮**：`cb.utils.confirm` 确认后执行

### 行操作按钮
- **增行**：`gridModel.appendRow(row)`，复制行时先 `delete row.id` 再 `_status='Insert'`
- **删行**：`gridModel.deleteRows(indexes)`，需 `getSelectedRowIndexes()` 获取选中行

### 模态框按钮
- **确定并关闭**：回写数据到父页面 `parentViewModel.getGridModel().appendRow(row)` → `viewModel.communication({type:'modal'})`
- **推送按钮**：`setProxy` + `ensure` 调用后端接口

## 关键 API

| API | 说明 |
|-----|------|
| `viewModel.execute('save')` | 程序化保存 |
| `viewModel.execute('add')` | 程序化新增 |
| `viewModel.execute('refresh')` | 刷新页面 |
| `cb.loader.runCommandLine('bill', ...)` | 跳转单据页面 |
<!-- confidence: EXTRACTED -->

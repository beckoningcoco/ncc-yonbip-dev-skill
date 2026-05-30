---
tags: [保存事件, beforeSave, afterSave, 页面脚本, BIP]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bip-save-events.md]
---

# 20个BIP保存事件代码片段

> BIP 旗舰版页面保存事件（beforeSave/afterSave）的 20 种常见写法。

## 核心模式

### beforeSave（保存前校验）
- **基础校验**：`viewModel.on("beforeSave", fn)` → 校验失败 `return false` 阻止保存
- **日期范围校验**：比较起止日期，非法则 alert + return false
- **主子表完整性校验**：遍历 GridModel rows，检查必填字段
- **异步校验**：`cb.rest.invokeFunction` 调后端校验，使用 `async: false` 同步等待
- **Promise 校验**：`new cb.promise()` 支持 confirm 确认后继续/拒绝

### 数据状态控制
- **强制 Update**：`data._status = "Update"` 将新增转为更新
- **模式判断**：`mode === 'add'` vs `mode === 'edit'` 走不同逻辑

### afterSave（保存后处理）
- **保存后调后端**：`setProxy` + `ensure` 更新关联数据
- **回写到来源单据**：`doWriteBack` 把保存结果写回上游
- **主子表保存**：先 `invokeFunction` 查是否存在 → 存在则 updateEntity，不存在则 insertEntity

## 关键 API

| API | 说明 |
|-----|------|
| `viewModel.on("beforeSave", fn)` | 保存前事件，return false 阻止 |
| `viewModel.on("afterSave", fn)` | 保存后事件 |
| `JSON.parse(args.data.data)` | 解析保存数据 |
| `data._status = "Update"` | 改变数据状态 |
| `viewModel.getParams().mode` | 获取页面模式（add/edit） |
<!-- confidence: EXTRACTED -->

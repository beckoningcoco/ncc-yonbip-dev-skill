---
tags: [生命周期, afterMount, afterLoadData, modeChange, afterAudit, 页面脚本]
created: 2026-05-27
updated: 2026-05-27
sources: [2026-05-27-bip-lifecycle]
---

# 20个BIP页面生命周期代码片段

> BIP 页面完整生命周期事件及执行顺序。

## 执行顺序

```
customInit → afterInit → afterInitCommonViewModel → afterMount
→ beforeLoadData → afterLoadData → modeChange
→ afterStateRule/afterRule
→ (保存) beforeSave → afterSave
→ (审批) afterAudit/afterUnaudit
```

## 核心事件

| 事件 | 时机 | 典型用途 |
|------|------|----------|
| `customInit` | 最早 | 注册监听器、获取权限 |
| `afterMount` | DOM 完成 | 操作查询区、设默认值 |
| `afterLoadData` | 数据加载完 | 根据数据状态控制界面 |
| `modeChange` | 模式切换 | 区分 add/edit/browse |
| `afterStateRule` | 规则执行后 | 覆盖/补充状态规则 |
| `beforeSave` | 保存前 | 校验、修改保存数据 |
| `afterAudit` | 审批通过后 | 审批后业务处理 |

## 页面模式判断

```javascript
function isAdd() { return viewModel.getParams().mode == 'add'; }
function isEdit() { return viewModel.getParams().mode == 'edit'; }
function isBrowse() { return viewModel.getParams().mode === 'browse'; }
```
<!-- confidence: EXTRACTED -->

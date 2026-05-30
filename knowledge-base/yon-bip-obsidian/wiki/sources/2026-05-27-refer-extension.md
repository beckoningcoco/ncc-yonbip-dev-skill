---
tags: [参照, 参照扩展, 页面脚本, 过滤, 生命周期, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-refer-extension.md]
---

# 参照相关常见扩展

> 参照组件的常见扩展操作合集：获取模型、设置过滤、动态切换类型、脚本赋值、打开弹窗、生命周期事件等。

## 核心操作速查

| 操作 | 关键代码 |
|------|----------|
| 获取参照模型 | `viewModel.get('field').getFromModel()` 或 `viewModel.getEditRowModel().get('field').getFromModel()` |
| 脚本赋值触发带入 | `cb.utils.triggerReferBrowse(item, [{field:'id', op:'eq', value1:'xxx'}])` |
| 设置过滤条件 | `referModel.setFilter({isExtend: true, simpleVOs: [...]})` |
| 动态改变参照类型 | `referModel.setRefCode("refCode", "{...}")` |
| 脚本打开参照弹窗 | `referModel.browse(true)` |
| 参照输入框可手录 | `referModel.setState('inputValid', true)` |
| 多选不增行 | `referModel.setState('returnText', true)` |
| 自动加载数据 | `filterViewModel.getParams().autoLoad = true` |

## 生命周期事件

`afterInitVm` → `beforeGetRefData` → `afterGetRefMeta` → `afterOkClick` → `referModalClose`

## 关键概念

- [[参照组件]]
- [[页面脚本]]
- [[viewModel]]

---
tags: [下推, 单据转换, beforePush, afterLoadData, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-push-bill-params.md]
---

# 下推单据时传递参数给下游单据脚本

> 通过 beforePush 和 afterLoadData 页面脚本实现选行下推，只将勾选的表体行带到下游单据，并将上游参数传递给下游。

## 上游单据（beforePush）

1. 在 `beforePush` 中通过 `gridModel.getSelectedRows()` 获取选中行
2. 未选中时 alert 拦截下推
3. 将选中行的 ID 列表和表头项目信息封装到 `viewModel.getParams().query.contractPushParam`
4. 通过 `viewModel.getParams().query` 传递给下游

## 下游单据（afterLoadData）

1. 在 `afterLoadData` 中通过 `viewParams.query.contractPushParam` 获取上游参数
2. 遍历当前表体行，根据 `sourceChildId` 筛选保留上游选中的行
3. `deleteAllRows()` 清空 → `insertRows` 插入筛选后的行
4. 同时将上游传来的项目 ID/名称赋值到对应字段

## 关键概念

- [[单据下推]]
- [[beforePush 事件]]
- [[afterLoadData 事件]]
- [[单据转换规则]]

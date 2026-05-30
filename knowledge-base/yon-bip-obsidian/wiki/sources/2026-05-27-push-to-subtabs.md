---
tags: [转单, 下推, 子页签, carryData, afterLoadData, 汇总, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-push-to-subtabs.md]
---

# 转单-上游单据数据带到下游子页签

> 上游列表选择数据后生成下游单据，将数据按维度汇总后分别带到下游多个子页签。

## 上游页面脚本

通过 `carryParams` / `carryData` 传递汇总数据，标记 `ispush: true`。

## 下游 afterLoadData

1. 通过 `params.needCarryData` 获取上游数据
2. 按 5 个维度（法人公司、成本中心、业务类型、项目、WBS）分组汇总
3. 根据交易类型分发到对应子页签（飞机/火车/酒店/用车）
4. `deleteAllRows()` + `insertRows()` 设置各页签数据

## 关键概念

- [[转单]]
- [[carryData]]
- [[carryParams]]
- [[afterLoadData]]
- [[子页签]]

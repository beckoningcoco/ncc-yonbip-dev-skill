---
title: "YonBuilder 原厂扩展"
type: reference
source: "iuap-YonBuilder原厂扩展开发红皮书 (31页)"
tags: ["BIP", "旗舰版", "原厂扩展", "实体扩展", "页面扩展"]
created: 2026-06-01
---

# 原厂扩展

四种场景：ISV→系统 / 租户→系统 / 租户→ISV / ISV→ISV。

实体扩展：每实体最多 60 自定义字段，不可修改原厂元数据。页面扩展：布局调整、事件覆盖、交互规则、版本回滚。

覆盖策略：系统级 → 租户级 → 用户级（单记录视图，后层覆盖前层）。标签：原/扩/自建。

API：`/mdf/rest/v1/business_object_tree/getDomainAppTree` → `getBusinessBillTree` → `getNewTemplateListByBillParam` → `prodesignerByTplId`。

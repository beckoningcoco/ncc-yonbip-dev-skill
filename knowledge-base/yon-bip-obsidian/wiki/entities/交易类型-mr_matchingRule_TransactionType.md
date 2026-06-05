---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.matchingRule.TransactionType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 交易类型 (`mr.matchingRule.TransactionType`)

> MR | 物理表：`mr_transaction_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交易类型 |
| 物理表 | `mr_transaction_type` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:15:52.1960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 工厂 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `matchingRuleId` | 匹配规则id | `matching_rule_id` | bacac19a-6cdf-4006-bb9d-9a46176da2e9 |
| 6 | `forecastDoc` | 预测冲销单据 | `forecast_doc` | String |
| 7 | `saleForecastTransTypeId` | 预测单据交易类型 | `sale_forecast_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 8 | `reversalDoc` | 订单冲销单据 | `reversal_doc` | String |
| 9 | `voucherTransTypeId` | 冲销单据交易类型 | `voucher_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 10 | `datasub` | 应用来源 | `datasub` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `saleForecastTransTypeId` | 预测单据交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `matchingRuleId` | 匹配规则id | `mr.matchingRule.MatchingRule` | None | true |
| 6 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 7 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 8 | `voucherTransTypeId` | 冲销单据交易类型 | `bd.bill.TransType` | Service |  |

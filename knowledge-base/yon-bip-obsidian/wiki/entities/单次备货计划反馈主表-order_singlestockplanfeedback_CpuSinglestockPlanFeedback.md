---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "order.singlestockplanfeedback.CpuSinglestockPlanFeedback"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 单次备货计划反馈主表 (`order.singlestockplanfeedback.CpuSinglestockPlanFeedback`)

> ycSaleCoor | 物理表：`cpu_single_stockplan_feedback`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单次备货计划反馈主表 |
| 物理表 | `cpu_single_stockplan_feedback` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:47.7590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `purPlanId` | 单次备货计划id | `pur_plan_id` | Long |
| 3 | `orgName` | 采购组织 | `org_name` | String |
| 4 | `transTypeId` | 交易类型ID | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `transTypeName` | 交易类型 | `trans_type_name` | String |
| 6 | `dr` | 删除标志 | `dr` | Integer |
| 7 | `ts` | 时间戳 | `ts` | DateTime |
| 8 | `ytenant` | 租户编码 | `ytenant_id` | String |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `deptName` | 采购部门 | `dept_name` | String |
| 13 | `purchaseName` | 采购员 | `purchase_name` | String |
| 14 | `purchasePhone` | 采购员联系电话 | `purchase_phone` | String |
| 15 | `currencyName` | 币种 | `currency_name` | String |
| 16 | `currencyCode` | 币种编号 | `currency_code` | String |
| 17 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 18 | `orderCode` | 计划单号 | `order_code` | String |
| 19 | `orgId` | 采购组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `singlestockplanDefineCharacter` | 自定义项特征组 | `define_header` | 1be53447-02f4-48f9-96f9-45d9d2fb8f4b |
| 21 | `deptId` | 采购部门ID | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 22 | `purchaseId` | 采购员人员 | `purchase_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 23 | `enterpriseId` | 供应商租户id | `enterprise_id` | Long |
| 24 | `purenterpriseId` | 采购商租户id | `pur_enterprise_id` | Long |
| 25 | `enterpriseName` | 供应商的租户名称 | `enterprise_name` | String |
| 26 | `purenterpriseName` | 采购企业 | `pur_enterprise_name` | String |
| 27 | `currencyId` | 币种Id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 28 | `memo` | 备注 | `memo` | String |
| 29 | `feedbackStatus` | 反馈状态 | `feedback_status` | String |
| 30 | `pubTime` | 发布时间 | `pub_time` | DateTime |
| 31 | `feedbackTime` | 反馈时间 | `feedback_time` | DateTime |
| 32 | `feedbackDesc` | 反馈说明 | `feedback_desc` | String |
| 33 | `defines` | 单次备货计划反馈主表自由自定义项 | `` | 2ef6ea5b-9603-4edc-b868-67edd3968c7b |
| 34 | `singlestockplanfeedbackDetailList` | 单次备货计划反馈子表 | `` | 7e84a6f0-817d-4a56-a79f-666bf99f8f64 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purchaseId` | 采购员人员 | `bd.staff.Staff` | Service |  |
| 2 | `deptId` | 采购部门ID | `org.func.BaseOrg` | Service |  |
| 3 | `transTypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 4 | `singlestockplanDefineCharacter` | 自定义项特征组 | `order.singlestockplanfeedback.CpuSinglestockPlanFeedbackHeaderDefine` | None |  |
| 5 | `singlestockplanfeedbackDetailList` | 单次备货计划反馈子表 | `order.singlestockplanfeedback.CpuSinglestockPlanFeedbackDetail` | None | true |
| 6 | `currencyId` | 币种Id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 7 | `orgId` | 采购组织ID | `org.func.BaseOrg` | Service |  |
| 8 | `defines` | 单次备货计划反馈主表自由自定义项 | `order.singlestockplanfeedback.CpuSinglestockPlanFeedbackDefine` | None | true |

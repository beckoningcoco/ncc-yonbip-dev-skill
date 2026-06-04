---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidnotification.CpuNoticeCandidate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果(中标供应商数据) (`lawbid.bidnotification.CpuNoticeCandidate`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_notice_candidate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果(中标供应商数据) |
| 物理表 | `cpu_notice_candidate` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:47.2210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `adviceNotes` | 中标结果说明 | `advice_notes` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `ytenant` | 租户 | `ytenant_id` | String |
| 7 | `id` | ID | `id` | Long |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 12 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 13 | `noticeId` | 成交通知书(主实体) | `notice_id` | fe00f7dc-a779-4468-91e5-93227f2f04df |
| 14 | `resultId` | 确定中标人(采购结果中标供应商数据) | `result_id` | 1b9a1d9c-4e40-4d84-9c9d-4603582e1bbd |
| 15 | `sidPriceDetails` | 成交结果明细(中标供应商的中标物料数据) | `` | 3655bb14-795c-46eb-b9c5-691ad1860fe9 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `resultId` | 确定中标人(采购结果中标供应商数据) | `lawbid.decisionresult.CpuDecisionResult` | None |  |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `sidPriceDetails` | 成交结果明细(中标供应商的中标物料数据) | `lawbid.bidnotification.CpuBidPriceDetailsNotice` | None | true |
| 5 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 7 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 8 | `noticeId` | 成交通知书(主实体) | `lawbid.bidnotification.CpuBidInformationNotice` | None | true |

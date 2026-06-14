---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidnotification.CpuServiceChargeNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 缴纳服务费(中标供应商数据) (`lawbid.bidnotification.CpuServiceChargeNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_service_charge_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 缴纳服务费(中标供应商数据) |
| 物理表 | `cpu_service_charge_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:35.8080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 缴纳服务费接口 | `lawdecision.itf.ICpuServiceChargeNotice` | 158 |
| 2 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 5 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 订单号 | `code` | String |
| 2 | `deadlineDate` | 处理时间 | `deadline_date` | DateTime |
| 3 | `supplydocId` | 供应商名称 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `feeType` | 费用类型 | `fee_type` | String |
| 7 | `isPay` | 缴费状态 | `isPay` | Integer |
| 8 | `payDate` | 缴费时间 | `pay_date` | DateTime |
| 9 | `processingStatus` | 状态 | `processing_status` | Short |
| 10 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `purchasingPerson` | 处理人 | `purchasing_person` | String |
| 13 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 14 | `serciePriceUnit` | 服务费单位 | `sercie_price_unit` | String |
| 15 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 16 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 17 | `ytenant` | 租户 | `ytenant_id` | String |
| 18 | `id` | id | `id` | Long |
| 19 | `userId` | 用户主键 | `user_id` | Long |
| 20 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 21 | `transactionTypeId` | 采购类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 22 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 23 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 24 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 25 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 26 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 27 | `paymentNotice` | 缴费通知单 | `payment_notice` | String |
| 28 | `noticeId` | 成交通知书(主实体) | `notice_id` | fe00f7dc-a779-4468-91e5-93227f2f04df |
| 29 | `resultId` | 中标结果表主键 | `result_id` | 1b9a1d9c-4e40-4d84-9c9d-4603582e1bbd |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `resultId` | 中标结果表主键 | `lawbid.decisionresult.CpuDecisionResult` | None |  |
| 3 | `transactionTypeId` | 采购类型 | `bd.bill.TransType` | Service |  |
| 4 | `supplydocId` | 供应商名称 | `aa.vendor.Vendor` | Service |  |
| 5 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 8 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 9 | `noticeId` | 成交通知书(主实体) | `lawbid.bidnotification.CpuBidInformationNotice` | None | true |

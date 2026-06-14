---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidnotification.CpuBidNotification"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 通知书(全部供应商数据) (`lawbid.bidnotification.CpuBidNotification`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_notification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通知书(全部供应商数据) |
| 物理表 | `cpu_bid_notification` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:48.6090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 中标通知书接口 | `lawdecision.itf.ICpuBidNotification` | 161 |
| 2 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 5 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `chargeId` | 缴费表主键 | `charge_id` | a7a224b8-9d83-4c5e-b557-8e27d33d8220 |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `isBid` | 是否中标 | `isBid` | Boolean |
| 4 | `supplierReviewTime` | 供应商查看时间 | `supplier_review_time` | DateTime |
| 5 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 6 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `state` | 通知书发布状态 | `state` | Integer |
| 9 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 10 | `ytenant` | 租户 | `ytenant_id` | String |
| 11 | `id` | id | `id` | Long |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 14 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 15 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 16 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 17 | `noticeId` | 成交通知书(主实体) | `notice_id` | fe00f7dc-a779-4468-91e5-93227f2f04df |
| 18 | `resultId` | 供应商报价情况(采购结果全部供应商数据) | `result_id` | 1b9a1d9c-4e40-4d84-9c9d-4603582e1bbd |
| 19 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 20 | `templateId` | 公告模板 | `template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 21 | `adviceNotes` | 说明 | `advice_notes` | String |
| 22 | `originalContent` | 内容 | `original_content` | String |
| 23 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 24 | `targetContent` | 内容 | `target_content` | String |
| 25 | `editStatus` | 通知书 | `edit_status` | Integer |
| 26 | `bidMaterials` | 通知书明细(全部供应商的全部物料数据) | `` | adc4a34a-c384-4719-8c91-2da0017b5cbf |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `resultId` | 供应商报价情况(采购结果全部供应商数据) | `lawbid.decisionresult.CpuDecisionResult` | None |  |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `bidMaterials` | 通知书明细(全部供应商的全部物料数据) | `lawbid.bidnotification.CpuBidMaterialNotice` | None | true |
| 5 | `chargeId` | 缴费表主键 | `lawbid.bidnotification.CpuServiceChargeNotice` | None |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 8 | `templateId` | 公告模板 | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 9 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 10 | `noticeId` | 成交通知书(主实体) | `lawbid.bidnotification.CpuBidInformationNotice` | None | true |

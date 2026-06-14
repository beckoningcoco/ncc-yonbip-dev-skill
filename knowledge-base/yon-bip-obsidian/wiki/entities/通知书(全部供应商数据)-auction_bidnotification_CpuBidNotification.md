---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidnotification.CpuBidNotification"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 通知书(全部供应商数据) (`auction.bidnotification.CpuBidNotification`)

> ycSouringAuction | 物理表：`cpu_bid_notification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通知书(全部供应商数据) |
| 物理表 | `cpu_bid_notification` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:29.2490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `chargeId` | 缴费表主键 | `charge_id` | 024b7d7a-f363-4489-b992-7806777a17b7 |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `ytenant` | 租户 | `ytenant_id` | String |
| 7 | `isBid` | 是否中标 | `isBid` | Boolean |
| 8 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 9 | `state` | 通知书发布状态 | `state` | Integer |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `transactionTypeId` | 采购类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 13 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 14 | `projectId` | 竞拍项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 15 | `sectionId` | 竞拍标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 16 | `noticeId` | 成交通知书(主实体) | `notice_id` | 8c661b09-e756-4d66-be51-5c836b7efe07 |
| 17 | `resultId` | 供应商报价情况(竞拍结果全部供应商数据) | `result_id` | 018f6cfc-19ee-4a10-9a10-4a817bf68cae |
| 18 | `templateId` | 公告模板 | `template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 19 | `adviceNotes` | 说明 | `advice_notes` | String |
| 20 | `originalContent` | 内容 | `original_content` | String |
| 21 | `targetContent` | 内容 | `target_content` | String |
| 22 | `supplierReview` | 竞拍方查看情况 | `supplier_review` | String |
| 23 | `editStatus` | 通知书 | `edit_status` | Integer |
| 24 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 25 | `bidMaterials` | 通知书明细(全部供应商的全部物料数据) | `` | 41fafeed-5fd0-4480-8664-cb50ad6fd984 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `resultId` | 供应商报价情况(竞拍结果全部供应商数据) | `auction.decisionresult.CpuDecisionResult` | None |  |
| 3 | `transactionTypeId` | 采购类型 | `bd.bill.TransType` | Service |  |
| 4 | `bidMaterials` | 通知书明细(全部供应商的全部物料数据) | `auction.bidnotification.CpuBidMaterialNotice` | None | true |
| 5 | `chargeId` | 缴费表主键 | `auction.bidnotification.CpuServiceChargeNotice` | None |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `sectionId` | 竞拍标段主键 | `auction.project.AuctionSection` | None |  |
| 8 | `templateId` | 公告模板 | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 9 | `projectId` | 竞拍项目主键 | `auction.project.AuctionProject` | None |  |
| 10 | `noticeId` | 成交通知书(主实体) | `auction.bidnotification.CpuBidInformationNotice` | None | true |

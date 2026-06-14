---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidsuppliernotification.CpuSupBidInformationNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交通知单主表 (`auction.bidsuppliernotification.CpuSupBidInformationNotice`)

> ycSouringAuction | 物理表：`cpu_bid_information_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交通知单主表 |
| 物理表 | `cpu_bid_information_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:40.8240` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户主键 | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 数据记录创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `decisionId` | 采购结果主键 | `decision_id` | cef2e51c-ec7a-4453-9655-76897331f5b9 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `id` | ID | `id` | Long |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Short |
| 15 | `noticePublish` | 成交通知书发布状态 | `notice_publish` | Integer |
| 16 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 17 | `noticeStatus` | 发布状态 | `notice_status` | String |
| 18 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 19 | `projectId` | 招标项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `sectionId` | 招标标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 22 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 23 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 24 | `unsuccessfulBidNotice` | 未中标通知书发布 | `unsuccessful_bid_notice` | Short |
| 25 | `ytenant` | 平台租户主键 | `ytenant_id` | String |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 招标标段主键 | `auction.project.AuctionSection` | None |  |
| 6 | `decisionId` | 采购结果主键 | `auction.decisionresult.CpuDecision` | None |  |
| 7 | `projectId` | 招标项目主键 | `auction.project.AuctionProject` | None |  |

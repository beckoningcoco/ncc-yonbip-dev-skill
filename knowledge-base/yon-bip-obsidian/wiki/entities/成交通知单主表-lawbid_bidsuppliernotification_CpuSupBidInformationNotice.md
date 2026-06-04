---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidsuppliernotification.CpuSupBidInformationNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交通知单主表 (`lawbid.bidsuppliernotification.CpuSupBidInformationNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_information_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交通知单主表 |
| 物理表 | `cpu_bid_information_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:26:01.2600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:24:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 成交通知主接口 | `lawdecision.itf.ICpuBidInformationNotice` | 161 |
| 2 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 5 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 6 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 数据记录创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `decisionId` | 采购结果主键 | `decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `id` | id | `id` | Long |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Short |
| 15 | `noticePublish` | 成交通知书发布状态 | `notice_publish` | Integer |
| 16 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 17 | `noticeStatus` | 发布状态 | `notice_status` | String |
| 18 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 19 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 22 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 23 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 24 | `unsuccessfulBidNotice` | 未中标通知书发布 | `unsuccessful_bid_notice` | Short |
| 25 | `ytenant` | 租户 | `ytenant_id` | String |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 6 | `decisionId` | 采购结果主键 | `lawbid.decisionresult.CpuDecision` | None |  |
| 7 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |

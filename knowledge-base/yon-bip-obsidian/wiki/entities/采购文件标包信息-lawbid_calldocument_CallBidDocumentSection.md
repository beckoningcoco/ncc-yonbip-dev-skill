---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.calldocument.CallBidDocumentSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购文件标包信息 (`lawbid.calldocument.CallBidDocumentSection`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_call_bid_document_section`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购文件标包信息 |
| 物理表 | `cpu_call_bid_document_section` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:47.1770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:52:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 招标文件标包信息 | `calldocument.itf.ICallBidDocumentSection` | 250 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `callBidDocumentSectionDefineCharacter` | 采购文件表体自定义项 | `define_character_id` | a5a653bc-24ed-4dd3-b4b2-42ae5dea51db |
| 2 | `bidSectionDocStatus` | 招标文件状态 | `bid_section_doc_status` | String |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `cngMakerId` | 委托单制单人ID | `ago_mark_group_id` | Long |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 7 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 8 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short |
| 9 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 10 | `multipleLatestStage` | 是否最新阶段 | `multiple_latest_stage` | Short |
| 11 | `multipleStageBid` | 是否两阶段招标 | `multiple_stage_bid` | Short |
| 12 | `bidEvaluationPlanId` | 初审办法id | `bid_evaluation_plan_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 13 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 14 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 15 | `issuance` | 选择文件发售 | `issuance` | Integer |
| 16 | `saleAmount` | 文件发售金额 | `sale_amount` | Decimal |
| 17 | `isBidEnsure` | 选择投标保证金 | `is_bid_ensure` | Integer |
| 18 | `bidEnsureMoney` | 投标保证金 | `bid_ensure_money` | Decimal |
| 19 | `paymentType` | 保证金缴纳方式 | `payment_type` | String |
| 20 | `hasFileEncrypt` | 投标文件是否加密 | `has_file_encrypt` | Short |
| 21 | `bidScorePlanId` | 评标办法id | `bid_score_plan_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 22 | `id` | ID | `id` | Long |
| 23 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 24 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 25 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 26 | `callBidDocumentId` | 招标文件主表 | `call_bid_document_id` | 0abbc965-d427-4894-8f28-b88624633703 |
| 27 | `projectSectionId` | 项目标段ID | `project_section_id` | ecfe849d-8880-4a81-ac60-5318b0a7915b |
| 28 | `bidSectionId` | 标段ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 29 | `purchaseTypeName` | 采购类型 | `purchase_type_name` | String |
| 30 | `bidExplain` | 备注 | `bid_explain` | String |
| 31 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 32 | `consignorOrgName` | 委托方组织名称 | `consignor_org_name` | String |
| 33 | `triedStartTime` | 试竞拍开始时间 | `tried_start_time` | DateTime |
| 34 | `triedEndTime` | 试竞拍结束时间 | `tried_end_time` | DateTime |
| 35 | `auctionStartTime` | 竞拍开始时间 | `auction_start_time` | DateTime |
| 36 | `auctionEndTime` | 竞拍结束时间 | `auction_end_time` | DateTime |
| 37 | `triedBidauction` | 是否试竞价 | `tried_bid_auction` | String |
| 38 | `bidType` | 采购方式 | `bid_type` | String |
| 39 | `callBidDoumentSectionFileList` | 项目标段投标文件 | `` | b252d54a-901a-4c5d-bdcb-5fb8d71a560c |
| 40 | `callBidPaymentMethodList` | 标书缴纳方式 | `` | c9c3fa35-7c2e-4759-95e5-839101bbd846 |
| 41 | `callDepositPaymentMethodList` | 保证金缴纳方式 | `` | 8c558c4f-dbfb-48c1-9abe-d71c000ac1e2 |
| 42 | `define` | 采购文件标包信息自由自定义项 | `` | ad7dabf6-c787-473d-8370-fb961890ce1e |
| 43 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 44 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 45 | `tenantId` | tenant租户 | `tenant_id` | String |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `callBidDocumentId` | 招标文件主表 | `lawbid.calldocument.CallBidDocument` | None | true |
| 2 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `define` | 采购文件标包信息自由自定义项 | `lawbid.calldocument.CallBidDocumentSectionFreedefine` | None | true |
| 4 | `bidScorePlanId` | 评标办法id | `lawbid.scoreplan.BidScorePlan` | None |  |
| 5 | `projectSectionId` | 项目标段ID | `lawbid.project.LawbidProjectSection` | None |  |
| 6 | `callBidDoumentSectionFileList` | 项目标段投标文件 | `lawbid.calldocument.CallBidDocumentSectionFile` | None | true |
| 7 | `callBidDocumentSectionDefineCharacter` | 采购文件表体自定义项 | `lawbid.calldocument.CallBidDocumentSectionDefineCharacter` | None |  |
| 8 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `callDepositPaymentMethodList` | 保证金缴纳方式 | `lawbid.calldocument.CallDepositPaymentMethod` | None | true |
| 10 | `callBidPaymentMethodList` | 标书缴纳方式 | `lawbid.calldocument.CallBidPaymentMethod` | None | true |
| 11 | `bidEvaluationPlanId` | 初审办法id | `lawbid.scoreplan.BidScorePlan` | None |  |
| 12 | `bidSectionId` | 标段ID | `lawbid.section.LawbidSection` | None |  |

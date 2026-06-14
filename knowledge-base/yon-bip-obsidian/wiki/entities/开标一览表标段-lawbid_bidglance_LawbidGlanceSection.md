---
tags: ["BIP", "元数据", "数据字典", "lawbid.bidglance.LawbidGlanceSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标一览表标段 (`lawbid.bidglance.LawbidGlanceSection`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_project_section`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标一览表标段 |
| 物理表 | `cpu_project_section` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 19:25:37.9500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 标段id |

## 部署信息

- 部署时间: 2025-10-24 23:57:21:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（63个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidBudgetMny` | 预算 | `bid_budget_mny` | Decimal |
| 2 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 3 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 4 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 5 | `bidOpenModeName` | 开标方式名称 | `bid_open_mode_name` | String |
| 6 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 7 | `bidSchemeId` | 竞拍方案模板id | `bid_scheme_id` | Long |
| 8 | `bidSchemeName` | 竞拍方案名称 | `bid_scheme_name` | String |
| 9 | `bidType` | 竞争方式 | `bid_type` | String |
| 10 | `bidTypeName` | 竞争方式名称 | `bid_type_name` | String |
| 11 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 12 | `canAlterPurchase` | 是否可以变更采购方式(purchase_code) | `can_alter_purchase` | Short |
| 13 | `controlPrice` | 控制价 | `control_price` | Decimal |
| 14 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String |
| 15 | `ctTranstypeName` | 合同类型名称 | `ct_transtype_name` | String |
| 16 | `defaultCalibration` | 默认定标方式 | `default_calibration` | String |
| 17 | `defaultCalibrationName` | 定标方式名称 | `default_calibration_name` | String |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 20 | `evalBidMethod` | 评标办法 | `eval_bid_method` | String |
| 21 | `evalBidMethodName` | 评标办法名称 | `eval_bid_method_name` | String |
| 22 | `evalBidMode` | 评标方式 | `eval_bid_mode` | String |
| 23 | `evalBidModeName` | 评标方式名称 | `eval_bid_mode_name` | String |
| 24 | `fillExplain` | 编制说明 | `fill_explain` | String |
| 25 | `firstStageBid` | 第一阶段评标类型 | `first_stage_bid` | String |
| 26 | `hasFileEncript` | 文件是否加密 | `has_file_encript` | Short |
| 27 | `hasPublishBiddoc` | 是否发布标书 | `has_publish_biddoc` | Short |
| 28 | `hasPublishNotice` | 是否发布公告 | `has_publish_notice` | Short |
| 29 | `meetingType` | 会议类型 | `meeting_type` | String |
| 30 | `meetingTypeName` | 会议类型名称 | `meeting_type_name` | String |
| 31 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short |
| 32 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 33 | `multipleStageBid` | 是否两阶段招标 | `multiple_stage_bid` | Short |
| 34 | `performType` | 定标履约类型 | `perform_type` | String |
| 35 | `performTypeName` | 定标履约类型名称 | `perform_type_name` | String |
| 36 | `personalCustomization` | 个性化定制字段 | `personal_customization` | String |
| 37 | `planEndTime` | 计划竣工日期 | `plan_end_time` | Date |
| 38 | `planPeriod` | 计划工期 | `plan_period` | String |
| 39 | `planStartTime` | 计划开始时间 | `plan_start_time` | Date |
| 40 | `pricingMethod` | 计价方式 | `pricing_method` | String |
| 41 | `projectNote` | 项目概况 | `project_note` | String |
| 42 | `pubts` | 时间戳 | `pubts` | DateTime |
| 43 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 44 | `purchaseId` | 采购方式id | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 45 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 46 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 47 | `purchaseTypeName` | 采购类型名称 | `purchase_type_name` | String |
| 48 | `qualificationGroupId` | 资格审核组id | `qualification_group_id` | Long |
| 49 | `qualifyCheckType` | 资格预审方式 | `qualify_check_type` | Short |
| 50 | `quoteType` | 含税类型 | `quote_type` | Short |
| 51 | `scoringGroupId` | 评标组id | `scoring_group_id` | Long |
| 52 | `secondStageBid` | 第二阶段评标类型 | `second_stage_bid` | String |
| 53 | `sectionStatus` | 标段状态 | `section_status` | String |
| 54 | `supplementItem` | 是否补录项目 | `supplement_item` | Short |
| 55 | `supplementNode` | 补录节点 | `supplement_node` | String |
| 56 | `supplierRequire` | 对供应商要求 | `supplier_require` | String |
| 57 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 58 | `transTypeName` | 交易类型名称 | `trans_type_name` | String |
| 59 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 60 | `id` | 标段id | `id` | Long |
| 61 | `code` | 标段(包)编号 | `section_code` | String |
| 62 | `sectionName` | 标段(包)名称 | `section_name` | String |
| 63 | `biddingList` | 开标一览表投标单 | `` | dcf3cae1-a2b4-4e72-aa36-6c678a7f628d |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `biddingList` | 开标一览表投标单 | `lawbid.bidglance.LawbidGlanceBiddingVO` | None | true |
| 3 | `purchaseId` | 采购方式id | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 4 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |

---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.project.AuctionSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞卖项目标段信息 (`saleauction.project.AuctionSection`)

> ycAuction | 物理表：`cpu_project_section`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞卖项目标段信息 |
| 物理表 | `cpu_project_section` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:44:48.2710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（96个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 4 | `code` | 标段(包)编号 | `section_code` | String |
| 5 | `sectionName` | 标段(包)名称 | `section_name` | String |
| 6 | `bidBudgetMnyYuan` | 采购预算 | `bid_budget_mny_yuan` | Decimal |
| 7 | `purchaseType` | 拍卖物类型 | `purchase_type` | String |
| 8 | `quoteType` | 供应商报价 | `quote_type` | Short |
| 9 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 10 | `supplementItem` | 项目补录 | `supplement_item` | Short |
| 11 | `purchaseId` | 采购方式id | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 12 | `bidType` | 竞争方式 | `bid_type` | String |
| 13 | `supplementNode` | 补录节点 | `supplement_node` | String |
| 14 | `AuctionSectionDefineCharacter` | 标段信息自定义项 | `define_character_id` | 5017fbcd-2bc9-4516-b0c4-8972909f1167 |
| 15 | `evalBidMethod` | 评标办法 | `eval_bid_method` | String |
| 16 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Short |
| 17 | `multipleStageBid` | 两阶段招标 | `multiple_stage_bid` | Short |
| 18 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 19 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short |
| 20 | `evalBidMode` | 评标方式 | `eval_bid_mode` | String |
| 21 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 22 | `bidProjectTypeId` | 采购内容id | `bid_project_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 23 | `meetingTypeName` | 会议类型 | `meeting_type_name` | String |
| 24 | `meetingTypeId` | 会议类型 | `meeting_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 25 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String |
| 26 | `ctTranstypeId` | 合同类型 | `ct_transtype_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 27 | `defaultCalibration` | 定标方式 | `default_calibration` | String |
| 28 | `performType` | 定标履行方式 | `perform_type` | String |
| 29 | `supplierRequire` | 对废旧拍卖方要求 | `supplier_require` | String |
| 30 | `taxRateModifiable` | 税率可修改 | `tax_rate_modifiable` | Short |
| 31 | `planStartTime` | 计划开始时间 | `plan_start_time` | Date |
| 32 | `planEndTime` | 计划竣工日期 | `plan_end_time` | Date |
| 33 | `planPeriod` | 计划工期 | `plan_period` | String |
| 34 | `projectNote` | 项目概况 | `project_note` | String |
| 35 | `controlPrice` | 控制价 | `control_price` | Decimal |
| 36 | `fillExplain` | 编制说明 | `fill_explain` | String |
| 37 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 38 | `sectionStatus` | 标段状态 | `section_status` | String |
| 39 | `canAlterPurchase` | 是否可以变更采购方式（purchase_code） | `can_alter_purchase` | Short |
| 40 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 41 | `scoringGroupId` | 评标组id | `scoring_group_id` | Long |
| 42 | `qualificationGroupId` | 资格审核组id | `qualification_group_id` | Long |
| 43 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String |
| 44 | `meetingType` | 会议方式 | `meeting_type` | String |
| 45 | `hasFileEncript` | 文件是否加密 | `has_file_encript` | Short |
| 46 | `bidSchemeId` | 废旧拍卖方案模板id | `bid_scheme_id` | 4a1692f6-66f0-4e73-9c1f-694244bf7e72 |
| 47 | `bidSchemeName` | 废旧拍卖方案名称 | `bid_scheme_name` | String |
| 48 | `pricingMethod` | 计价方式 | `pricing_method` | String |
| 49 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 50 | `personalCustomization` | 个性化定制字段 | `personal_customization` | String |
| 51 | `bidBudgetMny` | 预算 | `bid_budget_mny` | Decimal |
| 52 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 53 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 54 | `bidOpenModeName` | 开标方式名称 | `bid_open_mode_name` | String |
| 55 | `bidTypeName` | 竞争方式名称 | `bid_type_name` | String |
| 56 | `bidauctionRuleId` | 竞拍方案规则ID | `bid_auctionrule_id` | 7fc80044-d3dc-45e7-93a2-be1e14558b64 |
| 57 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 58 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 59 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 60 | `calibrationStrategy` | 定标策略 | `calibration_strategy` | String |
| 61 | `combineNoticeAndFile` | 文件公告合并 | `combine_notice_and_file` | Integer |
| 62 | `consignorOrgId` | 采购组织id | `consignor_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 63 | `createDate` | 创建日期 | `create_date` | Date |
| 64 | `createTime` | 创建时间 | `create_time` | DateTime |
| 65 | `creator` | 创建人名称 | `creator` | String |
| 66 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 67 | `currencyList` | 标包币种 | `` | 9cf50916-7954-4733-b600-e42c621592b4 |
| 68 | `defaultCalibrationName` | 定标方式名称 | `default_calibration_name` | String |
| 69 | `dr` | 逻辑删除标记 | `dr` | Short |
| 70 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 71 | `evalBidMethodName` | 评标办法名称 | `eval_bid_method_name` | String |
| 72 | `evalBidModeName` | 评标方式名称 | `eval_bid_mode_name` | String |
| 73 | `exactMatch` | '匹配供货目录策略 | `exact_match` | String |
| 74 | `exchangeRateTypeId` | 汇率类型 | `exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 75 | `firstStageBid` | 第一阶段评标类型 | `first_stage_bid` | String |
| 76 | `hasPublishBiddoc` | 是否发布标书 | `has_publish_biddoc` | Short |
| 77 | `hasPublishNotice` | 是否发布公告 | `has_publish_notice` | Short |
| 78 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 79 | `modifier` | 修改人名称 | `modifier` | String |
| 80 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 81 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 82 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 83 | `performTypeName` | 定标履约类型名称 | `perform_type_name` | String |
| 84 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 85 | `purchaseTypeName` | 采购类型名称 | `purchase_type_name` | String |
| 86 | `quotationCurrencyId` | 招标币种 | `quotation_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 87 | `secondStageBid` | 第二阶段评标类型 | `second_stage_bid` | String |
| 88 | `sectionMaterialList` | 竞卖项目标段包详情 | `` | a3dc80cd-0178-4f4f-95e2-5c450aa4e945 |
| 89 | `sectionMaterialTmpList` | 标段物料临时表 | `` | 27e120bb-f90b-4798-b5f9-a619a7c7ed8d |
| 90 | `sectionStageList` | 竞拍标段阶段信息 | `` | d066e210-edd3-4f46-a5f5-3aeb7e046c55 |
| 91 | `sectionSupplierList` | 竞卖项目邀请供应商 | `` | 694ab37c-4869-4983-baf4-4188b7b01df2 |
| 92 | `sourceSectionId` | 原标段id | `source_section_id` | Long |
| 93 | `supportCurrency` | 是否启用多币种 | `support_currency` | Short |
| 94 | `supportMaterialExceed` | 是否允许超量定标 | `support_material_exceed` | Short |
| 95 | `tenantId` | tenant租户 | `tenant_id` | String |
| 96 | `transTypeName` | 交易类型名称 | `trans_type_name` | String |

---

## 关联属性（22个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidProjectTypeId` | 采购内容id | `bctask.basedoc.CustomerDocVO` | Service |  |
| 2 | `bidauctionRuleId` | 竞拍方案规则ID | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO` | Service |  |
| 3 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `consignorOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 5 | `purchaseId` | 采购方式id | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `currencyList` | 标包币种 | `saleauction.project.AuctionSectionCurrency` | None | true |
| 9 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 10 | `AuctionSectionDefineCharacter` | 标段信息自定义项 | `saleauction.project.AuctionSectionDefineCharacter` | None |  |
| 11 | `sectionStageList` | 竞拍标段阶段信息 | `saleauction.project.AuctionSectionStage` | None | true |
| 12 | `bidProjectId` | 招标方案主表ID | `saleauction.project.AuctionProject` | None |  |
| 13 | `sectionMaterialList` | 竞卖项目标段包详情 | `saleauction.project.AuctionSectionMaterial` | None | true |
| 14 | `sectionMaterialTmpList` | 标段物料临时表 | `saleauction.project.AuctionSectionMaterialTmp` | None | true |
| 15 | `exchangeRateTypeId` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 16 | `bidSchemeId` | 废旧拍卖方案模板id | `yonbip-cpu-bcsourcing.bidauction.BidauctionVO` | Service |  |
| 17 | `quotationCurrencyId` | 招标币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `sectionSupplierList` | 竞卖项目邀请供应商 | `saleauction.project.AuctionSectionSupplier` | None | true |
| 19 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 20 | `ctTranstypeId` | 合同类型 | `bctask.basedoc.CustomerDocVO` | Service |  |
| 21 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 22 | `meetingTypeId` | 会议类型 | `bctask.basedoc.CustomerDocVO` | Service |  |

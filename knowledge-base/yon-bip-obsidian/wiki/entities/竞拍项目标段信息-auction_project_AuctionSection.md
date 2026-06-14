---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目标段信息 (`auction.project.AuctionSection`)

> ycSouringAuction | 物理表：`cpu_project_section`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目标段信息 |
| 物理表 | `cpu_project_section` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:20.9420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（103个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `AuctionSectionDefineCharacter` | 标段主表自定义项特征 | `define_character_id` | b599f0f7-54c3-4d06-8b11-6b1ad27fac44 |
| 2 | `bidBudgetMny` | 预算 | `bid_budget_mny` | Decimal |
| 3 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 4 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 5 | `bidOpenModeName` | 开标方式名称 | `bid_open_mode_name` | String |
| 6 | `bidTypeName` | 竞争方式名称 | `bid_type_name` | String |
| 7 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `quotationCurrencyId` | 竞拍币种ID | `quotation_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 10 | `consignorOrgId` | 采购组织id | `consignor_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `exchangeRateTypeId` | 汇率类型ID | `exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `creator` | 创建人名称 | `creator` | String |
| 15 | `supportCurrency` | 是否启用多币种 | `support_currency` | Short |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `defaultCalibrationName` | 定标方式名称 | `default_calibration_name` | String |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 20 | `evalBidMethodName` | 评标办法名称 | `eval_bid_method_name` | String |
| 21 | `evalBidModeName` | 评标方式名称 | `eval_bid_mode_name` | String |
| 22 | `firstStageBid` | 第一阶段评标类型 | `first_stage_bid` | String |
| 23 | `hasPublishBiddoc` | 是否发布标书 | `has_publish_biddoc` | Short |
| 24 | `hasPublishNotice` | 是否发布公告 | `has_publish_notice` | Short |
| 25 | `modifier` | 修改人名称 | `modifier` | String |
| 26 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `performTypeName` | 定标履约类型名称 | `perform_type_name` | String |
| 30 | `purchaseTypeName` | 采购类型名称 | `purchase_type_name` | String |
| 31 | `secondStageBid` | 第二阶段评标类型 | `second_stage_bid` | String |
| 32 | `id` | id | `id` | Long |
| 33 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 34 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 35 | `code` | 标段(包)编号 | `section_code` | String |
| 36 | `sectionName` | 标段(包)名称 | `section_name` | String |
| 37 | `bidBudgetMnyYuan` | 采购预算 | `bid_budget_mny_yuan` | Decimal |
| 38 | `purchaseType` | 拍卖物类型 | `purchase_type` | String |
| 39 | `quoteType` | 供应商报价 | `quote_type` | Short |
| 40 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 41 | `supplementItem` | 项目补录 | `supplement_item` | Short |
| 42 | `purchaseId` | 采购方式id | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 43 | `bidType` | 竞争方式 | `bid_type` | String |
| 44 | `supplementNode` | 补录节点 | `supplement_node` | String |
| 45 | `evalBidMethod` | 评标办法 | `eval_bid_method` | String |
| 46 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Short |
| 47 | `multipleStageBid` | 两阶段招标 | `multiple_stage_bid` | Short |
| 48 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 49 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short |
| 50 | `evalBidMode` | 评标方式 | `eval_bid_mode` | String |
| 51 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 52 | `bidProjectTypeId` | 采购内容id | `bid_project_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 53 | `meetingTypeName` | 会议类型 | `meeting_type_name` | String |
| 54 | `meetingTypeId` | 会议类型 | `meeting_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 55 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String |
| 56 | `ctTranstypeId` | 合同类型 | `ct_transtype_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 57 | `defaultCalibration` | 定标方式 | `default_calibration` | String |
| 58 | `performType` | 定标履行方式 | `perform_type` | String |
| 59 | `supplierRequire` | 对竞拍方要求 | `supplier_require` | String |
| 60 | `planStartTime` | 计划开始时间 | `plan_start_time` | Date |
| 61 | `planEndTime` | 计划竣工日期 | `plan_end_time` | Date |
| 62 | `planPeriod` | 计划工期 | `plan_period` | String |
| 63 | `projectNote` | 项目概况 | `project_note` | String |
| 64 | `controlPrice` | 控制价 | `control_price` | Decimal |
| 65 | `fillExplain` | 编制说明 | `fill_explain` | String |
| 66 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 67 | `sectionStatus` | 标段状态 | `section_status` | String |
| 68 | `canAlterPurchase` | 是否可以变更采购方式(purchase_code) | `can_alter_purchase` | Short |
| 69 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 70 | `scoringGroupId` | 评标组id | `scoring_group_id` | Long |
| 71 | `qualificationGroupId` | 资格审核组id | `qualification_group_id` | Long |
| 72 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String |
| 73 | `meetingType` | 会议方式 | `meeting_type` | String |
| 74 | `hasFileEncript` | 文件是否加密 | `has_file_encript` | Short |
| 75 | `bidSchemeId` | 竞拍方案模板id | `bid_scheme_id` | 4a1692f6-66f0-4e73-9c1f-694244bf7e72 |
| 76 | `bidSchemeName` | 竞拍方案名称 | `bid_scheme_name` | String |
| 77 | `pricingMethod` | 计价方式 | `pricing_method` | String |
| 78 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 79 | `personalCustomization` | 个性化定制字段 | `personal_customization` | String |
| 80 | `templateId` | 模板ID | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 81 | `billTemplateId` | 采购模板ID | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 82 | `bidauctionRuleId` | 竞拍方案规则ID | `bid_auctionrule_id` | 7fc80044-d3dc-45e7-93a2-be1e14558b64 |
| 83 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 84 | `calibrationStrategy` | 定标策略 | `calibration_strategy` | String |
| 85 | `combineNoticeAndFile` | 文件公告合并 | `combine_notice_and_file` | Integer |
| 86 | `currencyList` | 标包币种 | `` | 63378a30-8db6-4c8e-916c-b8616c221c24 |
| 87 | `exactMatch` | '匹配供货目录策略 | `exact_match` | String |
| 88 | `generateContractType` | 生成合同方式 | `generate_contract_type` | String |
| 89 | `generateOrderType` | 生成订单方式 | `generate_order_type` | String |
| 90 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 91 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 92 | `pushContractOrderType` | 推送合同或订单方式 | `push_contract_order_type` | String |
| 93 | `sectionMaterialList` | 竞拍项目标段包详情 | `` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 94 | `sectionMaterialTmpList` | 标段物料临时表 | `` | 372fb780-ea38-4eec-a9f2-2b8c113bac11 |
| 95 | `sectionStageList` | 竞拍标段阶段信息 | `` | a8264d86-da54-48d2-a367-6fdf3ab26bbf |
| 96 | `sectionSupplierList` | 竞拍项目邀请供应商 | `` | c0d33680-2082-4c5b-bb73-f6028dd223d3 |
| 97 | `sourceSectionId` | 原标段id | `source_section_id` | Long |
| 98 | `sourcingSolutionId` | 寻源方案主键 | `sourcing_solution_id` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 |
| 99 | `strategyId` | 管控策略id | `strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 100 | `supportMaterialExceed` | 是否允许超量定标 | `support_material_exceed` | Short |
| 101 | `taxRateModifiable` | 税率可修改 | `tax_rate_modifiable` | Short |
| 102 | `tenantId` | tenant租户 | `tenant_id` | String |
| 103 | `transTypeName` | 交易类型名称 | `trans_type_name` | String |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 采购模板ID | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `bidProjectTypeId` | 采购内容id | `bctask.basedoc.CustomerDocVO` | Service |  |
| 3 | `bidauctionRuleId` | 竞拍方案规则ID | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO` | Service |  |
| 4 | `purchaseId` | 采购方式id | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 8 | `templateId` | 模板ID | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 9 | `bidProjectId` | 招标方案主表ID | `auction.project.AuctionProject` | None |  |
| 10 | `sectionMaterialTmpList` | 标段物料临时表 | `auction.project.AuctionSectionMaterialTmp` | None | true |
| 11 | `bidSchemeId` | 竞拍方案模板id | `yonbip-cpu-bcsourcing.bidauction.BidauctionVO` | Service |  |
| 12 | `quotationCurrencyId` | 竞拍币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 13 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 14 | `strategyId` | 管控策略id | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | Service |  |
| 15 | `meetingTypeId` | 会议类型 | `bctask.basedoc.CustomerDocVO` | Service |  |
| 16 | `sourcingSolutionId` | 寻源方案主键 | `sourcing.businessRuleSolution.BusinessRuleSolution` | Service |  |
| 17 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 18 | `consignorOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 19 | `currencyList` | 标包币种 | `auction.project.AuctionSectionCurrency` | None | true |
| 20 | `AuctionSectionDefineCharacter` | 标段主表自定义项特征 | `auction.project.AuctionSectionDefineCharacter` | None |  |
| 21 | `sectionStageList` | 竞拍标段阶段信息 | `auction.project.AuctionSectionStage` | None | true |
| 22 | `sectionMaterialList` | 竞拍项目标段包详情 | `auction.project.AuctionSectionMaterial` | None | true |
| 23 | `exchangeRateTypeId` | 汇率类型ID | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 24 | `sectionSupplierList` | 竞拍项目邀请供应商 | `auction.project.AuctionSectionSupplier` | None | true |
| 25 | `ctTranstypeId` | 合同类型 | `bctask.basedoc.CustomerDocVO` | Service |  |
| 26 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |

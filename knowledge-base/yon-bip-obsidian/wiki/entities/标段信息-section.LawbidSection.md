---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.section.LawbidSection"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标段信息 (`lawbid.section.LawbidSection`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringBid 模块实体元数据字典。
> 物理表：`cpu_project_section` | 所属应用：`ycSouringBid`
> 来源：元数据API `queryByUri` 返回的 `lawbid.section.LawbidSection` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标段信息 |
| 物理表 | `cpu_project_section` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 业务对象ID | `f01fc94e-3996-4d8f-ad47-c7ae96a99125` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:43.9430` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-24 23:57:51:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202509111011_metadata_lawbid-section.zip`
- **安装人**: mongoTools
- **安装排名**: `6e46326b-721c-4730-9418-06edb620d439`

## 业务场景

- `extdevelop`
- `print`
- `workflow`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `transtype`
- `filegroup`
- `report`
- `ruleengine`
- `userdefine`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 9 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 2 | 企业ID (`IEnterprise`) | `cpu.itf.IEnterprise` | 6 | 1 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | lawbidTenant租户相关 (`ITenant`) | `lawbid.itf.ITenant` | 2 | 1 |
| 5 | 标段接口 (`ISection`) | `section.itf.ISection` | 546 | 68 |
| 6 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 7 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 8 | 采购模板-领域扩展字段 (`TplId`) | `tpl.itf.TplId` | 53 | 2 |
| 9 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |

---

## 直接属性（共 109 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `lawbidSectionDefineCharacter` | 标段信息自定义项 | `define_character_id` | b9ae79a2-fd65-44b7-a6cf-7eb59df4025b | `UserDefine` |  | ✓ |
| 2 | `bidBudgetMny` | 预算 | `bid_budget_mny` | Decimal | `number` |  | ✓ |
| 3 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String | `text` |  | ✓ |
| 4 | `priceComposition` | 启用成本项 | `price_composition` | Integer | `int` |  | ✓ |
| 5 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String | `text` |  | ✓ |
| 6 | `bidOpenModeName` | 开标方式名称 | `bid_open_mode_name` | String | `text` |  | ✓ |
| 7 | `bidTypeName` | 竞争方式名称 | `bid_type_name` | String | `text` |  | ✓ |
| 8 | `billMakerId` | 制单人ID | `bill_maker_id` | String | `text` |  | ✓ |
| 9 | `sourceSectionId` | 原标段id | `source_section_id` | Long | `long` |  | ✓ |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 11 | `consignorOrgId` | 采购组织id | `consignor_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 12 | `supportMaterialExceed` | 是否允许超量定标 | `support_material_exceed` | Short | `short` |  | ✓ |
| 13 | `tenantId` | tenant租户 | `tenant_id` | String | `text` |  | ✓ |
| 14 | `purchaseName` | 采购方式名称 | `purchase_name` | String | `text` |  | ✓ |
| 15 | `transTypeName` | 交易类型名称 | `trans_type_name` | String | `text` |  | ✓ |
| 16 | `taxRateModifiable` | 税率可修改 | `tax_rate_modifiable` | Short | `short` |  | ✓ |
| 17 | `exchangeRateTypeId` | 汇率类型ID | `exchange_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | ✓ |
| 18 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 19 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 20 | `quotationCurrencyId` | 招标币种 | `quotation_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 21 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 22 | `supportCurrency` | 是否启用多币种 | `support_currency` | Short | `short` |  | ✓ |
| 23 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 24 | `ctTranstypeId` | 合同类型 | `ct_transtype_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 25 | `defaultCalibrationName` | 定标方式名称 | `default_calibration_name` | String | `text` |  | ✓ |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 27 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 28 | `evalBidMethodName` | 评标办法名称 | `eval_bid_method_name` | String | `text` |  | ✓ |
| 29 | `evalBidModeName` | 评标方式名称 | `eval_bid_mode_name` | String | `text` |  | ✓ |
| 30 | `firstStageBid` | 第一阶段评标类型 | `first_stage_bid` | String | `text` |  | ✓ |
| 31 | `hasPublishBiddoc` | 是否发布标书 | `has_publish_biddoc` | Short | `short` |  | ✓ |
| 32 | `combineNoticeAndFile` | 公告文件合并 | `combine_notice_and_file` | Integer | `int` |  | ✓ |
| 33 | `hasPublishNotice` | 是否发布公告 | `has_publish_notice` | Short | `short` |  | ✓ |
| 34 | `meetingTypeId` | 会议类型 | `meeting_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 35 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 36 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 37 | `qualificationType` | 资格审核方式 | `qualification_type` | String | `text` |  | ✓ |
| 38 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 39 | `qualificationMethod` | 资格审核办法 | `qualification_method` | String | `text` |  | ✓ |
| 40 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 41 | `performTypeName` | 定标履约类型名称 | `perform_type_name` | String | `text` |  | ✓ |
| 42 | `purchaseTypeName` | 采购类型名称 | `purchase_type_name` | String | `text` |  | ✓ |
| 43 | `secondStageBid` | 第二阶段评标类型 | `second_stage_bid` | String | `text` |  | ✓ |
| 44 | `id` | id | `id` | Long | `long` |  | ✓ |
| 45 | `pubts` | 最后修改时间 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 46 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 | `quote` |  | ✓ |
| 47 | `code` | 标段(包)编号 | `section_code` | String | `text` |  | ✓ |
| 48 | `supplierLimitedNum` | 有限合格供应商数量 | `supplier_limited_num` | Decimal | `number` |  | ✓ |
| 49 | `sectionName` | 标段(包)名称 | `section_name` | String | `text` |  | ✓ |
| 50 | `bidBudgetMnyYuan` | 采购预算 | `bid_budget_mny_yuan` | Decimal | `number` |  | ✓ |
| 51 | `purchaseType` | 采购类型 | `purchase_type` | String | `text` |  | ✓ |
| 52 | `quoteType` | 供应商报价 | `quote_type` | Short | `short` |  | ✓ |
| 53 | `transTypeId` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 54 | `supplementItem` | 项目补录 | `supplement_item` | Short | `short` |  | ✓ |
| 55 | `purchaseId` | 采购方式id | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 | `quote` |  | ✓ |
| 56 | `bidType` | 竞争方式 | `bid_type` | String | `text` |  | ✓ |
| 57 | `supplementNode` | 补录节点 | `supplement_node` | String | `text` |  | ✓ |
| 58 | `evalBidMethod` | 评标办法 | `eval_bid_method` | String | `text` |  | ✓ |
| 59 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Short | `short` |  | ✓ |
| 60 | `multipleStageBid` | 是否两阶段招标 | `multiple_stage_bid` | Short | `short` |  | ✓ |
| 61 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String | `text` |  | ✓ |
| 62 | `multipleCollect` | 是否两阶段招标汇总 | `multiple_collect` | Short | `short` |  | ✓ |
| 63 | `evalBidMode` | 评标方式 | `eval_bid_mode` | String | `text` |  | ✓ |
| 64 | `bidProjectType` | 采购内容 | `bid_project_type` | String | `text` |  | ✓ |
| 65 | `bidProjectTypeId` | 采购内容id | `bid_project_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 66 | `meetingTypeName` | 会议类型 | `meeting_type_name` | String | `text` |  | ✓ |
| 67 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String | `text` |  | ✓ |
| 68 | `defaultCalibration` | 定标方式 | `default_calibration` | String | `text` |  | ✓ |
| 69 | `performType` | 定标履行类型 | `perform_type` | String | `text` |  | ✓ |
| 70 | `supplierRequire` | 对供应商要求 | `supplier_require` | String | `text` |  | ✓ |
| 71 | `planStartTime` | 计划开始时间 | `plan_start_time` | Date | `date` |  | ✓ |
| 72 | `planEndTime` | 计划竣工日期 | `plan_end_time` | Date | `date` |  | ✓ |
| 73 | `planPeriod` | 计划工期 | `plan_period` | String | `text` |  | ✓ |
| 74 | `projectNote` | 项目概况 | `project_note` | String | `text` |  | ✓ |
| 75 | `controlPrice` | 控制价 | `control_price` | Decimal | `number` |  | ✓ |
| 76 | `fillExplain` | 编制说明 | `fill_explain` | String | `text` |  | ✓ |
| 77 | `purchaseCode` | 采购方式编码 | `purchase_code` | String | `text` |  | ✓ |
| 78 | `sectionStatus` | 标段状态 | `section_status` | String | `text` |  | ✓ |
| 79 | `canAlterPurchase` | 是否可以变更采购方式(purchase_code) | `can_alter_purchase` | Short | `short` |  | ✓ |
| 80 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 81 | `scoringGroupId` | 评标组id | `scoring_group_id` | Long | `long` |  | ✓ |
| 82 | `qualificationGroupId` | 资格审核组id | `qualification_group_id` | Long | `long` |  | ✓ |
| 83 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String | `text` |  | ✓ |
| 84 | `meetingType` | 会议方式 | `meeting_type` | String | `text` |  | ✓ |
| 85 | `hasFileEncript` | 文件是否加密 | `has_file_encript` | Short | `short` |  | ✓ |
| 86 | `pricingMethod` | 计价方式 | `pricing_method` | String | `text` |  | ✓ |
| 87 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer | `int` |  | ✓ |
| 88 | `personalCustomization` | 个性化定制字段 | `personal_customization` | String | `text` |  | ✓ |
| 89 | `templateId` | 模板ID | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 | `quote` |  | ✓ |
| 90 | `billTemplateId` | 采购模板ID | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 | `quote` |  | ✓ |
| 91 | `priceTemplate` | 价格模板id | `price_template` | bc9cbd3d-b435-4aeb-a382-a6ccc21ab89f | `quote` |  | ✓ |
| 92 | `calibrationStrategy` | 定标策略 | `calibration_strategy` | String | `text` |  | ✓ |
| 93 | `allowPartialQuotes` | 是否允许部分报价 | `allow_partial_quotes` | Integer | `int` |  | ✓ |
| 94 | `priceTemplateName` | 价格模板 | `price_template_name` | String | `text` |  | ✓ |
| 95 | `exactMatch` | 匹配供货目录策略 | `exact_match` | String | `text` |  | ✓ |
| 96 | `currentEvaluationStage` | 当前开评标阶段 | `current_evaluation_stage` | Integer | `int` |  | ✓ |
| 97 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 98 | `currencyList` | 标包币种 | `` | 911016d2-6171-40f0-9fe0-2b3d2f86e3b4 | `` |  |  |
| 99 | `define` | 标段信息自由自定义项 | `` | 6bb6e945-5e86-4fce-a43e-3d5deba0f917 | `` |  |  |
| 100 | `evaluationStageList` | 标段开评标阶段 | `` | 034fbb03-f1fa-4dc0-96fc-0a1b73880ad0 | `` |  |  |
| 101 | `flowDefId` | 流程档案 | `flow_def_id` | 63da33d0-e4a3-40b5-8e85-839d78680826 | `quote` |  | ✓ |
| 102 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 103 | `pricePolicy` | 投标物料范围 | `price_policy` | Integer | `int` |  | ✓ |
| 104 | `purchaseDocFlowId` | 流程id | `purchasedoc_flow_id` | 51b620f3-fd52-4dbf-a38c-d40c310796ec | `quote` |  | ✓ |
| 105 | `sectionMaterialList` | 标段物料 | `` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 | `` |  |  |
| 106 | `sectionMaterialTmpList` | 标段物料临时表 | `` | 359385d3-9861-4151-8b6d-da63be743f49 | `` |  |  |
| 107 | `sectionStageList` | 标段阶段信息 | `` | a9be8309-59d4-4860-9742-5c8f5484581c | `` |  |  |
| 108 | `sectionSupplierList` | 标段邀请供应商 | `` | ee9fac8a-c357-421d-9722-4bf581e3b089 | `` |  |  |
| 109 | `sectionSwap` | 招标项目交换表 | `` | 3a99c05f-e898-4ba6-a6c3-819d07a1bd7f | `` |  |  |

---

## 关联属性（共 28 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `billTemplateId` | 采购模板ID | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |  →  |  |  | Service |  |
| 2 | `bidProjectTypeId` | 采购内容id | `bctask.basedoc.CustomerDocVO` | `bid_project_type_id` |  →  |  |  | Service |  |
| 3 | `purchaseId` | 采购方式id | `lawbid.purchasedoc.PurchaseDoc` | `purchase_id` |  →  |  |  | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 7 | `templateId` | 模板ID | `tpl.templateorginst.TplTemplateInst` | `template_id` |  →  |  |  | Service |  |
| 8 | `bidProjectId` | 招标方案主表ID | `lawbid.project.LawbidProject` | `bid_project_id` |  →  |  |  | None |  |
| 9 | `sectionMaterialTmpList` | 标段物料临时表 | `lawbid.section.LawbidSectionMaterialTmp` | `` | sectionMaterialTmpList → bidSectionId | 0..n | true | None |  |
| 10 | `priceTemplate` | 价格模板id | `aa.pricestructuretemplate.PriceStructureTemplate` | `price_template` |  →  |  |  | Service |  |
| 11 | `quotationCurrencyId` | 招标币种 | `bd.currencytenant.CurrencyTenantVO` | `quotation_currency_id` |  →  |  |  | Service |  |
| 12 | `lawbidSectionDefineCharacter` | 标段信息自定义项 | `lawbid.section.LawbidSectionDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 13 | `transTypeId` | 交易类型id | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 14 | `define` | 标段信息自由自定义项 | `lawbid.section.LawbidSectionFreedefine` | `` | define → id | 1 | true | None | ⚠️ |
| 15 | `meetingTypeId` | 会议类型 | `bctask.basedoc.CustomerDocVO` | `meeting_type_id` |  →  |  |  | Service |  |
| 16 | `sectionSwap` | 招标项目交换表 | `lawbid.section.LawbidSectionSwap` | `` | sectionSwap → id | 1 | true | None |  |
| 17 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 18 | `flowDefId` | 流程档案 | `flow.flowdef.FlowDefBasicInfo` | `flow_def_id` |  →  |  |  | Service |  |
| 19 | `consignorOrgId` | 采购组织id | `org.func.BaseOrg` | `consignor_org_id` |  →  |  |  | Service |  |
| 20 | `purchaseDocFlowId` | 流程id | `lawbid.purchasedoc.PurchaseDocFlow` | `purchasedoc_flow_id` |  →  |  |  | None |  |
| 21 | `currencyList` | 标包币种 | `lawbid.section.LawbidSectionCurrency` | `` | currencyList → bidSectionId | 0..n | true | None |  |
| 22 | `sectionStageList` | 标段阶段信息 | `lawbid.section.LawbidSectionStage` | `` | sectionStageList → bidSectionId | 0..n | true | None |  |
| 23 | `evaluationStageList` | 标段开评标阶段 | `lawbid.section.LawbidSectionEvaluationStage` | `` | evaluationStageList → bidSectionId | 0..n | true | None |  |
| 24 | `sectionMaterialList` | 标段物料 | `lawbid.section.LawbidSectionMaterial` | `` | sectionMaterialList → bidSectionId | 1..n | true | None |  |
| 25 | `exchangeRateTypeId` | 汇率类型ID | `bd.exchangeRate.ExchangeRateTypeVO` | `exchange_rate_type_id` |  →  |  |  | Service |  |
| 26 | `sectionSupplierList` | 标段邀请供应商 | `lawbid.section.LawbidSectionSupplier` | `` | sectionSupplierList → bidSectionId | 0..n | true | None |  |
| 27 | `ctTranstypeId` | 合同类型 | `bctask.basedoc.CustomerDocVO` | `ct_transtype_id` |  →  |  |  | Service |  |
| 28 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |

### Composition（子表）

- **sectionMaterialTmpList**: `sectionMaterialTmpList` → `lawbid.section.LawbidSectionMaterialTmp` | 0..n
- **define**: `define` → `lawbid.section.LawbidSectionFreedefine` | 1 ⚠️ 已废弃
- **sectionSwap**: `sectionSwap` → `lawbid.section.LawbidSectionSwap` | 1
- **currencyList**: `currencyList` → `lawbid.section.LawbidSectionCurrency` | 0..n
- **sectionStageList**: `sectionStageList` → `lawbid.section.LawbidSectionStage` | 0..n
- **evaluationStageList**: `evaluationStageList` → `lawbid.section.LawbidSectionEvaluationStage` | 0..n
- **sectionMaterialList**: `sectionMaterialList` → `lawbid.section.LawbidSectionMaterial` | 1..n
- **sectionSupplierList**: `sectionSupplierList` → `lawbid.section.LawbidSectionSupplier` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `billTemplateId` (采购模板ID) | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |
| `bidProjectTypeId` (采购内容id) | `bctask.basedoc.CustomerDocVO` | `bid_project_type_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `templateId` (模板ID) | `tpl.templateorginst.TplTemplateInst` | `template_id` |
| `priceTemplate` (价格模板id) | `aa.pricestructuretemplate.PriceStructureTemplate` | `price_template` |
| `quotationCurrencyId` (招标币种) | `bd.currencytenant.CurrencyTenantVO` | `quotation_currency_id` |
| `transTypeId` (交易类型id) | `bd.bill.TransType` | `trans_type_id` |
| `meetingTypeId` (会议类型) | `bctask.basedoc.CustomerDocVO` | `meeting_type_id` |
| `ytenant` (新租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `flowDefId` (流程档案) | `flow.flowdef.FlowDefBasicInfo` | `flow_def_id` |
| `consignorOrgId` (采购组织id) | `org.func.BaseOrg` | `consignor_org_id` |
| `exchangeRateTypeId` (汇率类型ID) | `bd.exchangeRate.ExchangeRateTypeVO` | `exchange_rate_type_id` |
| `ctTranstypeId` (合同类型) | `bctask.basedoc.CustomerDocVO` | `ct_transtype_id` |
| `enterpriseId` (所属租户id) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |

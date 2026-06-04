---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionresult.CpuDecision"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购结果主表 (`lawbid.decisionresult.CpuDecision`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringBid 模块实体元数据字典。
> 物理表：`cpu_decision` | 所属应用：`ycSouringBid`
> 来源：元数据API `queryByUri` 返回的 `lawbid.decisionresult.CpuDecision` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购结果主表 |
| 物理表 | `cpu_decision` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 业务对象ID | `8f10b12e-4cec-4d09-ac18-f3e72e3070c9` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:04.7980` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `bid_section_code` | `bid_section_code` | String | 标段(包)编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:55:24:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202603071524_metadata_lawbid-decisionresult_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `1873e5b6-94e4-4553-8458-71e1c52be073`

## 业务场景

- `transtype`
- `userdefine`
- `prewarning`
- `extdevelop`
- `print`
- `UITemplate`
- `imextmp`
- `filegroup`
- `report`
- `ruleengine`
- `msgtemplate`
- `api`
- `barcode`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `isMain`, `doc`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 10 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 定标单接口 (`ICpuDecision`) | `lawdecision.itf.ICpuDecision` | 658 | 124 |
| 2 | 审批兼容信息 (`ICompatibleFlowInfo`) | `lawbid.commonitf.ICompatibleFlowInfo` | 6 | 3 |
| 3 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 采购模板-领域扩展字段 (`TplId`) | `tpl.itf.TplId` | 53 | 2 |
| 6 | 企业ID (`IEnterprise`) | `cpu.itf.IEnterprise` | 6 | 1 |
| 7 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 8 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 9 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 10 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 176 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer | `int` |  | ✓ |
| 3 | `oldBillNum` | 原始单据号 | `old_bill_num` | String | `text` |  | ✓ |
| 4 | `flowSource` | 审批源 | `flow_source` | String | `text` |  | ✓ |
| 5 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer | `int` |  | ✓ |
| 6 | `historyFlowKey` | 历史businessKey | `historyFlowKey` | String | `text` |  | ✓ |
| 7 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 8 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 9 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 10 | `status` | 云审状态 | `workflow_status` | Short | `short` |  | ✓ |
| 11 | `purOrgName` | 采购组织 | `pur_org_name` | String | `text` |  | ✓ |
| 12 | `bidProjectType` | 采购内容 | `bid_project_type` | String | `text` |  | ✓ |
| 13 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 14 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 15 | `bidProjectId` | 项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 | `quote` |  | ✓ |
| 16 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 | `quote` |  | ✓ |
| 17 | `vouchdate` | 单据日期 | `vouchdate` | DateTime | `timestamp` |  | ✓ |
| 18 | `approveStartTime` | 审批开始时间 | `approve_start_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime | `timestamp` |  | ✓ |
| 20 | `quoteType` | 供应商报价 | `quote_type` | String | `text` |  | ✓ |
| 21 | `purchaseId` | 采购方式 | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 | `quote` |  | ✓ |
| 22 | `meetingType` | 会议类型 | `meeting_type` | String | `text` |  | ✓ |
| 23 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String | `text` |  | ✓ |
| 24 | `defaultCalibration` | 定标方式 | `default_calibration` | String | `text` |  | ✓ |
| 25 | `performType` | 定标履行类型 | `perform_type` | String | `text` |  | ✓ |
| 26 | `supplementItem` | 项目补录 | `supplement_item` | String | `text` |  | ✓ |
| 27 | `meetingTypeName` | 会议类型名称 | `meeting_type_name` | String | `text` |  | ✓ |
| 28 | `allowEditPerformType` | 是否允许修改履约方式 | `allowEditPerformType` | Integer | `int` |  | ✓ |
| 29 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String | `text` |  | ✓ |
| 30 | `purchaseName` | 采购方式 | `purchase_name` | String | `text` |  | ✓ |
| 31 | `purchaseCode` | 采购方式编码 | `purchase_code` | String | `text` |  | ✓ |
| 32 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String | `text` |  | ✓ |
| 33 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 34 | `generateContractType` | 生成合同方式 | `generate_contract_type` | String | `text` |  | ✓ |
| 35 | `generateOrderType` | 生成订单方式 | `generate_order_type` | String | `text` |  | ✓ |
| 36 | `purchaseType` | 采购类别 | `purchase_type` | String | `text` |  | ✓ |
| 37 | `bidType` | 竞争方式 | `bid_type` | String | `text` |  | ✓ |
| 38 | `sourcingStrategyId` | 寻源策略 | `sourcing_strategy_id` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 | `quote` |  | ✓ |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 40 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 41 | `purPsnId` | 采购负责人 | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 42 | `supportMaterialExceed` | 是否允许超量定标 | `support_material_exceed` | Short | `short` |  | ✓ |
| 43 | `effectReq` | 定标影响需求执行量 | `effect_req` | Short | `short` |  | ✓ |
| 44 | `decisionDefineCharacter` | 采购结果主表表头自定义项 | `decision_define_character` | f52ec76c-673c-4dac-8162-7d63e10aa2f0 | `UserDefine` |  | ✓ |
| 45 | `billstate` | 投标状态 | `billstate` | Integer | `int` |  | ✓ |
| 46 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer | `int` |  | ✓ |
| 47 | `consignationId` | 委托单主键 | `consignation_id` | Long | `long` |  | ✓ |
| 48 | `dr` | 逻辑删除标记 | `dr` | Integer | `int` |  | ✓ |
| 49 | `cdeStartTime` | 候选人公布日期 | `cde_start_time` | DateTime | `timestamp` |  | ✓ |
| 50 | `cdeEndTime` | 候选人公告日期 | `cde_end_time` | DateTime | `timestamp` |  | ✓ |
| 51 | `cdePushPublic` | 候选人结果公示是否推送到国家公共服务平台 | `cde_push_public` | Integer | `int` |  | ✓ |
| 52 | `cdeContent` | 候选人公告内容 | `cde_content` | String | `text` |  | ✓ |
| 53 | `dsnStartTime` | 中标结果公布日期 | `dsn_start_time` | DateTime | `timestamp` |  | ✓ |
| 54 | `dsnEndTime` | 中标结果公告日期 | `dsn_end_time` | DateTime | `timestamp` |  | ✓ |
| 55 | `dsnPushPublic` | 中标结果公示是否推送到国家公共服务平台 | `dsn_push_public` | Integer | `int` |  | ✓ |
| 56 | `dsnContent` | 中标公告内容 | `dsn_content` | String | `text` |  | ✓ |
| 57 | `predictedPrice` | 预计价格合计 | `predicted_price` | Decimal | `number` |  | ✓ |
| 58 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal | `number` |  | ✓ |
| 59 | `bidBottom` | 标底合计 | `bid_bottom` | Decimal | `number` |  | ✓ |
| 60 | `lawBid` | 法定招标 | `law_bid` | Integer | `int` |  | ✓ |
| 61 | `combination` | 是否是组合标 | `combination` | Integer | `int` |  | ✓ |
| 62 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal | `number` |  | ✓ |
| 63 | `evaluationMethod` | 评标办法 | `evaluation_method` | String | `text` |  | ✓ |
| 64 | `bidConfirm` | 是否同意招标结果 | `bid_confirm` | Integer | `int` |  | ✓ |
| 65 | `qualifyCheckStep` | 预审或者后审代表流程阶段 | `qualify_check_step` | Integer | `int` |  | ✓ |
| 66 | `csdPublish` | 是否发布候选人公示 | `csd_publish` | Integer | `int` |  | ✓ |
| 67 | `dsnPublish` | 是否中标结果公示 | `dsn_publish` | Integer | `int` |  | ✓ |
| 68 | `noticePublish` | 是否发中标通知书 | `notice_publish` | Integer | `int` |  | ✓ |
| 69 | `agencyorgId` | 代理机构组织主键 | `agencyOrg_id` | String | `text` |  | ✓ |
| 70 | `agencyorgName` | 代理机构组织 | `agencyOrg_name` | String | `text` |  | ✓ |
| 71 | `decisionOrgId` | 委托单编号 | `decision_org_id` | String | `text` |  | ✓ |
| 72 | `decisionOrgName` | 委托单位 | `decision_org_name` | String | `text` |  | ✓ |
| 73 | `decisionPersonId` | 委托人主键 | `decision_person_id` | String | `text` |  | ✓ |
| 74 | `decisionPersonName` | 委托人 | `decision_person_name` | String | `text` |  | ✓ |
| 75 | `agencyPersonId` | 代理机构组织人员主键 | `agency_person_id` | String | `text` |  | ✓ |
| 76 | `agencyPersonName` | 代理机构人员姓名 | `agency_person_name` | String | `text` |  | ✓ |
| 77 | `cdeContentId` | 候选人公告内容主键 | `cde_content_id` | Long | `long` |  | ✓ |
| 78 | `dsnContentId` | 采购结果内容主键 | `dsn_content_id` | Long | `long` |  | ✓ |
| 79 | `disagreeReason` | 委托人不同意原因 | `disagree_reason` | String | `text` |  | ✓ |
| 80 | `disagreeTime` | 不同意时间 | `disagree_time` | DateTime | `timestamp` |  | ✓ |
| 81 | `cloudApproveStatus` | 定标单云审状态 | `cloud_approve_status` | Integer | `int` |  | ✓ |
| 82 | `internationalBid` | 是否国际标 | `international_bid` | Integer | `int` |  | ✓ |
| 83 | `payMode` | 付款方式 | `pay_mode` | String | `text` |  | ✓ |
| 84 | `deliveryDate` | 交货期 | `delivery_date` | String | `text` |  | ✓ |
| 85 | `technical` | 技术指标 | `technical` | String | `text` |  | ✓ |
| 86 | `other` | 其他 | `other` | String | `text` |  | ✓ |
| 87 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer | `int` |  | ✓ |
| 88 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer | `int` |  | ✓ |
| 89 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer | `int` |  | ✓ |
| 90 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer | `int` |  | ✓ |
| 91 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer | `int` |  | ✓ |
| 92 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer | `int` |  | ✓ |
| 93 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer | `int` |  | ✓ |
| 94 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer | `int` |  | ✓ |
| 95 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer | `int` |  | ✓ |
| 96 | `otherShow` | 是否显示其他 | `other_show` | Integer | `int` |  | ✓ |
| 97 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer | `int` |  | ✓ |
| 98 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer | `int` |  | ✓ |
| 99 | `manager` | 项目经理 | `manager` | String | `text` |  | ✓ |
| 100 | `techleader` | 技术负责人 | `techleader` | String | `text` |  | ✓ |
| 101 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String | `text` |  | ✓ |
| 102 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String | `text` |  | ✓ |
| 103 | `supTechnical` | 供应商技术指标 | `sup_technical` | String | `text` |  | ✓ |
| 104 | `supOther` | 供应商其他 | `sup_other` | String | `text` |  | ✓ |
| 105 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer | `int` |  | ✓ |
| 106 | `singleFlag` | 单重 | `single_flag` | Integer | `int` |  | ✓ |
| 107 | `producerFlag` | 产地 | `producer_flag` | Integer | `int` |  | ✓ |
| 108 | `manufacturerFlag` | 制造 | `manufacturer_flag` | Integer | `int` |  | ✓ |
| 109 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer | `int` |  | ✓ |
| 110 | `resultTimeWt` | 委托方定标时间 | `result_time_wt` | DateTime | `timestamp` |  | ✓ |
| 111 | `resultTimeZb` | 招标公司授标时间 | `result_time_zb` | DateTime | `timestamp` |  | ✓ |
| 112 | `dollarTotal` | 美元金额 | `dollar_total` | Decimal | `number` |  | ✓ |
| 113 | `yenTotal` | 日元金额 | `yen_total` | Decimal | `number` |  | ✓ |
| 114 | `euroTotal` | 欧元金额 | `euro_total` | Decimal | `number` |  | ✓ |
| 115 | `poundTotal` | 英镑金额 | `pound_total` | Decimal | `number` |  | ✓ |
| 116 | `decisionStartTime` | 定标开始时间 | `decision_start_time` | DateTime | `timestamp` |  | ✓ |
| 117 | `decisionEndTime` | 定标结束时间 | `decision_end_time` | DateTime | `timestamp` |  | ✓ |
| 118 | `scoreCandidatePushTime` | 评标候选人公示发布时间 | `score_candidate_push_time` | DateTime | `timestamp` |  | ✓ |
| 119 | `resultNoticePushTime` | 中标结果公告发布时间 | `result_notice_push_time` | DateTime | `timestamp` |  | ✓ |
| 120 | `projectEndTime` | 项目结束时间/中标通知书发布时间 | `project_end_time` | DateTime | `timestamp` |  | ✓ |
| 121 | `projectReturnTime` | 项目回传结果时间 | `project_return_time` | DateTime | `timestamp` |  | ✓ |
| 122 | `hasPushContract` | 是否已推送合同 | `has_push_contract` | Boolean | `switch` |  | ✓ |
| 123 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean | `switch` |  | ✓ |
| 124 | `payUnit` | 缴纳单位 | `pay_unit` | String | `text` |  | ✓ |
| 125 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal | `number` |  | ✓ |
| 126 | `noticeShape` | 通知书形式 | `notice_shape` | String | `text` |  | ✓ |
| 127 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Boolean | `switch` |  | ✓ |
| 128 | `noticeStatus` | 通知书状态 | `notice_status` | String | `text` |  | ✓ |
| 129 | `editStatus` | 编辑状态 | `edit_status` | Integer | `int` |  | ✓ |
| 130 | `decisionRound` | 采购结果变更轮次 | `decision_round` | Integer | `int` |  | ✓ |
| 131 | `decisionRoundStatus` | 采购结果变更状态 | `decision_round_status` | Boolean | `switch` |  | ✓ |
| 132 | `decisionChange` | 采购结果是否变更 | `decision_change` | Boolean | `switch` |  | ✓ |
| 133 | `totalApproveNotes` | 总定标意见 | `total_approve_notes` | String | `text` |  | ✓ |
| 134 | `bidUnitPriceWay` | 中标单价取值 | `bid_unit_price_way` | Boolean | `switch` |  | ✓ |
| 135 | `selectSupplier` | 是否有审批记录 | `select_supplier` | Long | `long` |  | ✓ |
| 136 | `approveRecord` | 是否有审批记录 | `approve_record` | Boolean | `switch` |  | ✓ |
| 137 | `calibrationQuoteType` | 是否含税 | `calibration_quote_type` | Boolean | `switch` |  | ✓ |
| 138 | `cpuScoringGroupId` | 投票小组主键 | `cpu_scoring_group_id` | Long | `long` |  | ✓ |
| 139 | `voteStatus` | 投票状态 | `vote_status` | Integer | `int` |  | ✓ |
| 140 | `showStartDate` | 公告公示开始日期 | `show_start_date` | DateTime | `timestamp` |  | ✓ |
| 141 | `showEndDate` | 公告公示结束日期 | `show_end_date` | DateTime | `timestamp` |  | ✓ |
| 142 | `hasPushOrder` | 是否已推订单 | `has_push_order` | Boolean | `switch` |  | ✓ |
| 143 | `assessFileId` | 评审附件 | `assess_file_id` | String | `text` |  | ✓ |
| 144 | `decisionFileId` | 定标附件 | `decision_file_id` | String | `text` |  | ✓ |
| 145 | `bidProjectTypeId` | 采购内容主键 | `bid_project_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 | `quote` |  | ✓ |
| 146 | `currencyId` | 币种主键 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 147 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 148 | `bidProjectCode` | 项目编码 | `bid_project_code` | String | `text` |  | ✓ |
| 149 | `bidProjectName` | 项目名 | `bid_project_name` | String | `text` |  | ✓ |
| 150 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String | `text` |  | ✓ |
| 151 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String | `text` |  | ✓ |
| 152 | `consignationNo` | 委托单号 | `consignation_no` | String | `text` |  | ✓ |
| 153 | `consignationName` | 委托名称 | `consignation_name` | String | `text` |  | ✓ |
| 154 | `enterpriseId` | 企业 | `enterprise_id` | Long | `long` |  | ✓ |
| 155 | `enterpriseName` | 企业名称 | `enterprise_name` | String | `text` |  | ✓ |
| 156 | `linkDepartmentId` | 所属部门主键 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 157 | `linkPersonId` | 联系人主键 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 158 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 159 | `templateId` | 主模板主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 | `quote` |  | ✓ |
| 160 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 | `quote` |  | ✓ |
| 161 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 162 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 163 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 164 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 165 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 166 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 167 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 168 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 169 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 170 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 171 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 172 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 173 | `define` | 采购结果主表表头自定义项 | `` | d87df7d8-98f4-42b1-85f3-a0827a9dbb3f | `` |  |  |
| 174 | `materialList` | 中标物料明细 | `` | 23f77ada-9b2b-43f8-963c-0d689e9b2464 | `` |  |  |
| 175 | `resultAllList` | 供应商报价表 | `` | 7954f443-2fa6-4e3a-b7c9-7d9dffdcce59 | `` |  |  |
| 176 | `resultList` | 中标结果子表 | `` | 1b9a1d9c-4e40-4d84-9c9d-4603582e1bbd | `` |  |  |

---

## 关联属性（共 22 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 2 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |  →  |  |  | Service |  |
| 3 | `bidProjectTypeId` | 采购内容主键 | `cpu-basedoc.userdef.UserDefineVO` | `bid_project_type_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `linkPersonId` | 联系人主键 | `bd.staff.Staff` | `link_person_id` |  →  |  |  | Service |  |
| 6 | `purchaseId` | 采购方式 | `lawbid.purchasedoc.PurchaseDoc` | `purchase_id` |  →  |  |  | None |  |
| 7 | `materialList` | 中标物料明细 | `lawbid.decisionresult.CpuDsnMaterialDetail` | `` | materialList → decisionId | 1..n | true | None |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 10 | `linkDepartmentId` | 所属部门主键 | `org.func.BaseOrg` | `link_department_id` |  →  |  |  | Service |  |
| 11 | `templateId` | 主模板主键 | `tpl.templateorginst.TplTemplateInst` | `template_id` |  →  |  |  | Service |  |
| 12 | `bidProjectId` | 项目主键 | `lawbid.project.LawbidProject` | `bid_project_id` |  →  |  |  | None |  |
| 13 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 14 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 15 | `decisionDefineCharacter` | 采购结果主表表头自定义项 | `lawbid.decisionresult.DecisionDefineCharacter` | `decision_define_character` |  →  |  |  | None |  |
| 16 | `sourcingStrategyId` | 寻源策略 | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_strategy_id` |  →  |  |  | Service |  |
| 17 | `define` | 采购结果主表表头自定义项 | `lawbid.decisionresult.CpuDecisionFreeDefine` | `` | define → id | 1 | true | None | ⚠️ |
| 18 | `purPsnId` | 采购负责人 | `bd.staff.Staff` | `pur_psn_id` |  →  |  |  | Service |  |
| 19 | `resultAllList` | 供应商报价表 | `lawbid.decisionresult.CpuDecisionResultAll` | `` | resultAllList → decisionId | 0..n | true | None |  |
| 20 | `currencyId` | 币种主键 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 21 | `resultList` | 中标结果子表 | `lawbid.decisionresult.CpuDecisionResult` | `` | resultList → decisionId | 1..n | true | None |  |
| 22 | `bidSectionId` | 标段(包)编号主键 | `lawbid.section.LawbidSection` | `bid_section_id` |  →  |  |  | None |  |

### Composition（子表）

- **materialList**: `materialList` → `lawbid.decisionresult.CpuDsnMaterialDetail` | 1..n
- **define**: `define` → `lawbid.decisionresult.CpuDecisionFreeDefine` | 1 ⚠️ 已废弃
- **resultAllList**: `resultAllList` → `lawbid.decisionresult.CpuDecisionResultAll` | 0..n
- **resultList**: `resultList` → `lawbid.decisionresult.CpuDecisionResult` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (采购组织主键) | `org.func.BaseOrg` | `pur_org_id` |
| `billTemplateId` (单据模板主键) | `tpl.templateinst.TplBillTemplateInst` | `bill_template_id` |
| `bidProjectTypeId` (采购内容主键) | `cpu-basedoc.userdef.UserDefineVO` | `bid_project_type_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `linkPersonId` (联系人主键) | `bd.staff.Staff` | `link_person_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `linkDepartmentId` (所属部门主键) | `org.func.BaseOrg` | `link_department_id` |
| `templateId` (主模板主键) | `tpl.templateorginst.TplTemplateInst` | `template_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
| `sourcingStrategyId` (寻源策略) | `sourcing.businessRuleSolution.BusinessRuleSolution` | `sourcing_strategy_id` |
| `purPsnId` (采购负责人) | `bd.staff.Staff` | `pur_psn_id` |
| `currencyId` (币种主键) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |

---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tendersummary.CpuDecision"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标小结主表 (`lawbid.tendersummary.CpuDecision`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_tendersummary`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标小结主表 |
| 物理表 | `cpu_tendersummary` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:42.3650` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `bid_section_code` | String | 标段(包)编号 |

## 部署信息

- 部署时间: 2026-01-23 23:56:31:000

## 依赖接口（10个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 定标单接口 | `lawdecision.itf.ICpuDecision` | 658 |
| 2 | 审批兼容信息 | `lawbid.commonitf.ICompatibleFlowInfo` | 6 |
| 3 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 4 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 5 | 采购模板-领域扩展字段 | `tpl.itf.TplId` | 53 |
| 6 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 7 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 8 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 9 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 10 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（171个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 3 | `decisionDefineCharacter` | 表头自定义项特征属性 | `decision_define_character` | 3857bf28-b73f-4126-8401-36f16cb6965b |
| 4 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 5 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 6 | `decisionFileId` | 附件 | `decision_file_id` | String |
| 7 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 8 | `purchaseName` | 采购方式 | `purchase_name` | String |
| 9 | `flowSource` | 审批源 | `flow_source` | String |
| 10 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 11 | `verifystate` | 审批状态 | `verifystate` | Short |
| 12 | `returncount` | 退回次数 | `returncount` | Short |
| 13 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 14 | `historyFlowKey` | 历史businessKey | `historyFlowKey` | String |
| 15 | `status` | 云审状态 | `workflow_status` | Short |
| 16 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 17 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 18 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 19 | `approveStartTime` | 审批开始时间 | `approve_start_time` | DateTime |
| 20 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime |
| 21 | `ytenant` | 租户id | `ytenant_id` | String |
| 22 | `isReassignment` | 是否采购委托 | `isReassignment` | Integer |
| 23 | `reassignmentLog` | 转派日志 | `reassignment_user_id` | String |
| 24 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 25 | `cdeStartTime` | 候选人公布日期 | `cde_start_time` | DateTime |
| 26 | `cdeEndTime` | 候选人公告日期 | `cde_end_time` | DateTime |
| 27 | `cdePushPublic` | 候选人结果公示是否推送到国家公共服务平台 | `cde_push_public` | Integer |
| 28 | `cdeContent` | 候选人公告内容 | `cde_content` | String |
| 29 | `dsnStartTime` | 中标结果公布日期 | `dsn_start_time` | DateTime |
| 30 | `dsnEndTime` | 中标结果公告日期 | `dsn_end_time` | DateTime |
| 31 | `dsnPushPublic` | 中标结果公示是否推送到国家公共服务平台 | `dsn_push_public` | Integer |
| 32 | `dsnContent` | 中标公告内容 | `dsn_content` | String |
| 33 | `csdPublish` | 是否发布候选人公示 | `csd_publish` | Integer |
| 34 | `dsnPublish` | 是否中标结果公示 | `dsn_publish` | Integer |
| 35 | `noticePublish` | 是否发中标通知书 | `notice_publish` | Integer |
| 36 | `manager` | 项目经理 | `manager` | String |
| 37 | `techleader` | 技术负责人 | `techleader` | String |
| 38 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 39 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 40 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 41 | `supOther` | 供应商其他 | `sup_other` | String |
| 42 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 43 | `singleFlag` | 单重 | `single_flag` | Integer |
| 44 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 45 | `manufacturerFlag` | 制造 | `manufacturer_flag` | Integer |
| 46 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 47 | `dollarTotal` | 美元金额 | `dollar_total` | Decimal |
| 48 | `yenTotal` | 日元金额 | `yen_total` | Decimal |
| 49 | `euroTotal` | 欧元金额 | `euro_total` | Decimal |
| 50 | `poundTotal` | 英镑金额 | `pound_total` | Decimal |
| 51 | `scoreCandidatePushTime` | 评标候选人公示发布时间 | `score_candidate_push_time` | DateTime |
| 52 | `resultNoticePushTime` | 中标结果公告发布时间 | `result_notice_push_time` | DateTime |
| 53 | `projectEndTime` | 项目结束时间/中标通知书发布时间 | `project_end_time` | DateTime |
| 54 | `projectReturnTime` | 项目回传结果时间 | `project_return_time` | DateTime |
| 55 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 56 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Boolean |
| 57 | `noticeStatus` | 通知书状态 | `notice_status` | String |
| 58 | `decisionRound` | 采购结果变更轮次 | `decision_round` | Integer |
| 59 | `decisionRoundStatus` | 采购结果变更状态 | `decision_round_status` | Boolean |
| 60 | `decisionChange` | 采购结果是否变更 | `decision_change` | Boolean |
| 61 | `voteStatus` | 投票状态 | `vote_status` | Integer |
| 62 | `showStartDate` | 公告公示开始日期 | `show_start_date` | DateTime |
| 63 | `showEndDate` | 公告公示结束日期 | `show_end_date` | DateTime |
| 64 | `bidProjectTypeId` | 采购内容主键 | `bid_project_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 65 | `ts` | 时间戳 | `ts` | DateTime |
| 66 | `createTime` | 创建时间 | `create_time` | DateTime |
| 67 | `createDate` | 创建日期 | `create_date` | Date |
| 68 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 69 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 70 | `creator` | 创建人名称 | `creator` | String |
| 71 | `modifier` | 修改人名称 | `modifier` | String |
| 72 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 73 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 74 | `auditor` | 审批人名称 | `auditor` | String |
| 75 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 76 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 77 | `auditDate` | 审批日期 | `audit_date` | Date |
| 78 | `pubts` | 时间戳 | `pubts` | DateTime |
| 79 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 80 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 81 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 82 | `purOrgId` | 采购组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 83 | `purPsnId` | 采购负责人 | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 84 | `purOrgName` | 采购组织名称 | `pur_org_name` | String |
| 85 | `linkPersonId` | 联系人id | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 86 | `linkDepartmentId` | 所属部门id | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 87 | `bidProjectId` | 项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 88 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 89 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 90 | `billstate` | 投标状态 | `billstate` | Integer |
| 91 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer |
| 92 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String |
| 93 | `bidSectionId` | 标段(包)编号id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 94 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 95 | `quoteType` | 供应商报价 | `quote_type` | String |
| 96 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 97 | `purchaseId` | 采购方式 | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 98 | `bidType` | 竞争方式 | `bid_type` | String |
| 99 | `meetingType` | 会议类型 | `meeting_type` | String |
| 100 | `meetingTypeName` | 会议方式 | `meeting_type_name` | String |
| 101 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String |
| 102 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String |
| 103 | `defaultCalibration` | 定标方式 | `default_calibration` | String |
| 104 | `performType` | 定标履行类型 | `perform_type` | String |
| 105 | `supplementItem` | 项目补录 | `supplement_item` | String |
| 106 | `consignationId` | 委托单ID | `consignation_id` | Long |
| 107 | `totalApproveNotes` | 备注 | `total_approve_notes` | String |
| 108 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 109 | `consignationName` | 委托名称 | `consignation_name` | String |
| 110 | `predictedPrice` | 预计价格合计 | `predicted_price` | Decimal |
| 111 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 112 | `bidBottom` | 标底合计 | `bid_bottom` | Decimal |
| 113 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 114 | `combination` | 是否是组合标 | `combination` | Integer |
| 115 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 116 | `evaluationMethod` | 评标办法 | `evaluation_method` | String |
| 117 | `bidConfirm` | 是否同意招标结果 | `bid_confirm` | Integer |
| 118 | `qualifyCheckStep` | 预审或者后审代表流程阶段 | `qualify_check_step` | Integer |
| 119 | `templateId` | 主模板表实例主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 120 | `billTemplateId` | 单据级模板实例主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 121 | `agencyorgId` | 代理机构组织ID | `agencyOrg_id` | String |
| 122 | `agencyorgName` | 代理机构组织 | `agencyOrg_name` | String |
| 123 | `decisionOrgId` | 委托单编号 | `decision_org_id` | String |
| 124 | `decisionOrgName` | 委托单位 | `decision_org_name` | String |
| 125 | `decisionPersonId` | 委托人id | `decision_person_id` | String |
| 126 | `decisionPersonName` | 委托人 | `decision_person_name` | String |
| 127 | `agencyPersonId` | 代理机构组织人员d | `agency_person_id` | String |
| 128 | `agencyPersonName` | 代理机构人员姓名 | `agency_person_name` | String |
| 129 | `cdeContentId` | 候选人公告内容id | `cde_content_id` | Long |
| 130 | `dsnContentId` | 候选人公告内容id | `dsn_content_id` | Long |
| 131 | `disagreeReason` | 委托人不同意原因 | `disagree_reason` | String |
| 132 | `disagreeTime` | 不同意时间 | `disagree_time` | DateTime |
| 133 | `cloudApproveStatus` | 定标单云审状态 | `cloud_approve_status` | Integer |
| 134 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 135 | `payMode` | 付款方式 | `pay_mode` | String |
| 136 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 137 | `technical` | 技术指标 | `technical` | String |
| 138 | `other` | 其他 | `other` | String |
| 139 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 140 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 141 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 142 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 143 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 144 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 145 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 146 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 147 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 148 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 149 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 150 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 151 | `resultTimeWt` | 委托方定标时间 | `result_time_wt` | DateTime |
| 152 | `resultTimeZb` | 招标公司授标时间 预留 | `result_time_zb` | DateTime |
| 153 | `decisionStartTime` | 定标开始时间 | `decision_start_time` | DateTime |
| 154 | `decisionEndTime` | 定标结束时间 | `decision_end_time` | DateTime |
| 155 | `hasPushContract` | 是否已推送合同 | `has_push_contract` | Boolean |
| 156 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 157 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 158 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 159 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 160 | `editStatus` | 编辑状态0未1已 | `edit_status` | Integer |
| 161 | `bidUnitPriceWay` | 中标单价取值 | `bid_unit_price_way` | Boolean |
| 162 | `selectSupplier` | 指定供应商报价 | `select_supplier` | Long |
| 163 | `approveRecord` | 是否有审批记录 | `approve_record` | Boolean |
| 164 | `calibrationQuoteType` | 定标含税类型 | `calibration_quote_type` | Boolean |
| 165 | `cpuScoringGroupId` | 投票小组主键 | `cpu_scoring_group_id` | Long |
| 166 | `hasPushOrder` | 是否已推订单 | `has_push_order` | Boolean |
| 167 | `assessFileId` | 评审附件 | `assess_file_id` | String |
| 168 | `bidOpens` | 开标设置表 | `` | e2a2f17d-a31f-4408-aead-ff9b01573d5e |
| 169 | `define` | 招标小结主表表头自定义项 | `` | f3c49c40-ffa1-459a-9ed4-3807f0f1f1f4 |
| 170 | `materialList` | 招标小结物料明细 | `` | 500b2395-bbff-4fa2-bbeb-9e9b8fd737ab |
| 171 | `resultList` | 招标小结供应商子表 | `` | 848c184d-92e1-4f14-96bf-ae24b44c964f |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 2 | `billTemplateId` | 单据级模板实例主键 | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 3 | `bidProjectTypeId` | 采购内容主键 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
| 4 | `linkPersonId` | 联系人id | `bd.staff.Staff` | Service |  |
| 5 | `purchaseId` | 采购方式 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 6 | `materialList` | 招标小结物料明细 | `lawbid.tendersummary.CpuDsnMaterialDetail` | None | true |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `linkDepartmentId` | 所属部门id | `org.func.BaseOrg` | Service |  |
| 10 | `templateId` | 主模板表实例主键 | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 11 | `bidProjectId` | 项目ID | `lawbid.project.LawbidProject` | None |  |
| 12 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 13 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 14 | `decisionDefineCharacter` | 表头自定义项特征属性 | `lawbid.tendersummary.SummaryDefineCharacter` | None |  |
| 15 | `define` | 招标小结主表表头自定义项 | `lawbid.tendersummary.CpuDecisionFreeDefine` | None | true |
| 16 | `purPsnId` | 采购负责人 | `bd.staff.Staff` | Service |  |
| 17 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 18 | `resultList` | 招标小结供应商子表 | `lawbid.tendersummary.CpuDecisionResult` | None | true |
| 19 | `bidSectionId` | 标段(包)编号id | `lawbid.section.LawbidSection` | None |  |
| 20 | `bidOpens` | 开标设置表 | `lawbid.tendersummary.CpuDecisionBidOpen` | None | true |

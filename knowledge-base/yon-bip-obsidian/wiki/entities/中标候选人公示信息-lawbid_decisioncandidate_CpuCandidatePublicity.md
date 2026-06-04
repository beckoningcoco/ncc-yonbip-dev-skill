---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisioncandidate.CpuCandidatePublicity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标候选人公示信息 (`lawbid.decisioncandidate.CpuCandidatePublicity`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_candidate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标候选人公示信息 |
| 物理表 | `cpu_candidate` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:41.2200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `bid_section_code` | String | 标段(包)编号 |

## 部署信息

- 部署时间: 2026-01-23 23:56:30:000

## 依赖接口（9个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审批流信息 | `base.itf.IApprovalFlow` | 134 |
| 2 | 采购模板-领域扩展字段 | `tpl.itf.TplId` | 53 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 5 | 中标候选人公示主表接口 | `lawdecision.itf.ICpuCandidatePublicity` | 677 |
| 6 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 7 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 8 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 9 | 审批信息 | `base.itf.IApprovalInfo` | 172 |

---

## 直接属性（178个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `candidateDefineCharacter` | 表头自定义项特征属性 | `decision_define_character` | ad292022-50a1-436c-8d85-eccb6ece8ebb |
| 2 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 3 | `billstate` | 投标状态 | `billstate` | Integer |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `dr` | dr | `dr` | Integer |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `flowSource` | 审批源 | `flow_source` | String |
| 17 | `candidatePublicityType` | 公示类型 | `candidate_publicity_type` | Integer |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `publishDatetime` | 发布时间 | `publish_datetime` | DateTime |
| 20 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 21 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 22 | `bidExceptionFormId` | 异常处理 | `bid_exception_form_id` | Long |
| 23 | `ts` | ts | `ts` | DateTime |
| 24 | `pendingMessageId` | 门户消息 | `pending_message_id` | Long |
| 25 | `ytenant` | 租户ID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 26 | `totalApproveNotes` | 总定标意见 | `total_approve_notes` | String |
| 27 | `verifystate` | 审批状态 | `verifystate` | Short |
| 28 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 29 | `historyFlowKey` | 历史businessKey | `historyFlowKey` | String |
| 30 | `status` | 云审状态 | `workflow_status` | Short |
| 31 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 32 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 33 | `approveStartTime` | 审批开始时间 | `approve_start_time` | DateTime |
| 34 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime |
| 35 | `purchaseId` | 采购方式 | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 36 | `supplementItem` | 项目补录 | `supplement_item` | String |
| 37 | `templateId` | 主模板主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 38 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 39 | `dsnStartTime` | 中标结果公布日期 | `dsn_start_time` | DateTime |
| 40 | `dsnEndTime` | 中标结果公告日期 | `dsn_end_time` | DateTime |
| 41 | `dsnPushPublic` | 中标结果公示是否推送到国家公共服务平台 | `dsn_push_public` | Integer |
| 42 | `dsnContent` | 中标公告内容 | `dsn_content` | String |
| 43 | `dsnPublish` | 是否中标结果公示 | `dsn_publish` | Integer |
| 44 | `noticePublish` | 是否发中标通知书 | `notice_publish` | Integer |
| 45 | `manager` | 项目经理 | `manager` | String |
| 46 | `techleader` | 技术负责人 | `techleader` | String |
| 47 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 48 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 49 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 50 | `supOther` | 供应商其他 | `sup_other` | String |
| 51 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 52 | `singleFlag` | 单重 | `single_flag` | Integer |
| 53 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 54 | `manufacturerFlag` | 制造 | `manufacturer_flag` | Integer |
| 55 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 56 | `dollarTotal` | 美元金额 | `dollar_total` | Decimal |
| 57 | `yenTotal` | 日元金额 | `yen_total` | Decimal |
| 58 | `euroTotal` | 欧元金额 | `euro_total` | Decimal |
| 59 | `poundTotal` | 英镑金额 | `pound_total` | Decimal |
| 60 | `resultNoticePushTime` | 中标结果公告发布时间 | `result_notice_push_time` | DateTime |
| 61 | `projectEndTime` | 项目结束时间/中标通知书发布时间 | `project_end_time` | DateTime |
| 62 | `projectReturnTime` | 项目回传结果时间 | `project_return_time` | DateTime |
| 63 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 64 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 65 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 66 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 67 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Boolean |
| 68 | `noticeStatus` | 通知书状态 | `notice_status` | String |
| 69 | `decisionRound` | 采购结果变更轮次 | `decision_round` | Integer |
| 70 | `decisionRoundStatus` | 采购结果变更状态 | `decision_round_status` | Boolean |
| 71 | `decisionChange` | 采购结果是否变更 | `decision_change` | Boolean |
| 72 | `voteStatus` | 投票状态 | `vote_status` | Integer |
| 73 | `showStartDate` | 公告公示开始日期 | `show_start_date` | DateTime |
| 74 | `showEndDate` | 公告公示结束日期 | `show_end_date` | DateTime |
| 75 | `bidProjectTypeId` | 采购内容主键 | `bid_project_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 76 | `currencyId` | 币种主键 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 77 | `auditor` | 审批人名称 | `auditor` | String |
| 78 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 79 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 80 | `auditDate` | 审批日期 | `audit_date` | Date |
| 81 | `id` | ID | `id` | Long |
| 82 | `returncount` | 退回次数 | `returncount` | Short |
| 83 | `noticeType` | 公告模板 | `notice_type` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 84 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 85 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 86 | `noticeUrl` | 发布内容 | `notice_url` | String |
| 87 | `newNoticeUrl` | 修改后的发布内容 | `new_notice_url` | String |
| 88 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 89 | `purOrgId` | 采购组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 90 | `bidProjectId` | 项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 91 | `purPsnId` | 采购负责人 | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 92 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 93 | `purOrgName` | 采购组织名称 | `pur_org_name` | String |
| 94 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 95 | `bidSectionId` | 标段(包)编号id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 96 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 97 | `linkPersonId` | 联系人id | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 98 | `bidType` | 采购方式 | `bid_type` | String |
| 99 | `cdeStartTime` | 公示开始时间 | `cde_start_time` | DateTime |
| 100 | `linkDepartmentId` | 所属部门id | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 101 | `cdeEndTime` | 公示结束时间 | `cde_end_time` | DateTime |
| 102 | `releaseMedium` | 发布媒介 | `release_medium` | String |
| 103 | `cdePushPublic` | 候选人结果公示是否推送到国家公共服务平台 | `cde_push_public` | Integer |
| 104 | `cdeContent` | 候选人公告内容 | `cde_content` | String |
| 105 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 106 | `combination` | 是否是组合标 | `combination` | Integer |
| 107 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer |
| 108 | `evaluationMethod` | 评标办法 | `evaluation_method` | String |
| 109 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String |
| 110 | `csdPublish` | 是否发布候选人公示 | `csd_publish` | Integer |
| 111 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 112 | `cdeContentId` | 候选人公告内容ID | `cde_content_id` | Long |
| 113 | `dsnContentId` | 候选人公告内容ID | `dsn_content_id` | Long |
| 114 | `scoreCandidatePushTime` | 评标候选人公示发布时间 | `score_candidate_push_time` | DateTime |
| 115 | `quoteType` | 供应商报价 | `quote_type` | String |
| 116 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 117 | `fileId` | 公告附件 | `file_id` | String |
| 118 | `meetingType` | 会议类型 | `meeting_type` | String |
| 119 | `meetingTypeName` | 会议方式 | `meeting_type_name` | String |
| 120 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String |
| 121 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String |
| 122 | `defaultCalibration` | 定标方式 | `default_calibration` | String |
| 123 | `performType` | 定标履行类型 | `perform_type` | String |
| 124 | `consignationId` | 委托单ID | `consignation_id` | Long |
| 125 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 126 | `consignationName` | 委托名称 | `consignation_name` | String |
| 127 | `predictedPrice` | 预计价格合计 | `predicted_price` | Decimal |
| 128 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 129 | `bidBottom` | 标底合计 | `bid_bottom` | Decimal |
| 130 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 131 | `bidConfirm` | 是否同意招标结果 | `bid_confirm` | Integer |
| 132 | `qualifyCheckStep` | 预审或者后审代表流程阶段 | `qualify_check_step` | Integer |
| 133 | `agencyorgId` | 代理机构组织ID | `agencyOrg_id` | String |
| 134 | `agencyorgName` | 代理机构组织 | `agencyOrg_name` | String |
| 135 | `decisionOrgId` | 委托单编号 | `decision_org_id` | String |
| 136 | `decisionOrgName` | 委托单位 | `decision_org_name` | String |
| 137 | `decisionPersonId` | 委托人id | `decision_person_id` | String |
| 138 | `decisionPersonName` | 委托人 | `decision_person_name` | String |
| 139 | `agencyPersonId` | 代理机构组织人员id | `agency_person_id` | String |
| 140 | `agencyPersonName` | 代理机构人员姓名 | `agency_person_name` | String |
| 141 | `disagreeReason` | 委托人不同意原因 | `disagree_reason` | String |
| 142 | `disagreeTime` | 不同意时间 | `disagree_time` | DateTime |
| 143 | `cloudApproveStatus` | 定标单云审状态 | `cloud_approve_status` | Integer |
| 144 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 145 | `payMode` | 付款方式 | `pay_mode` | String |
| 146 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 147 | `technical` | 技术指标 | `technical` | String |
| 148 | `other` | 其他 | `other` | String |
| 149 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 150 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 151 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 152 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 153 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 154 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 155 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 156 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 157 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 158 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 159 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 160 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 161 | `resultTimeWt` | 委托方定标时间 | `result_time_wt` | DateTime |
| 162 | `resultTimeZb` | 招标公司授标时间 | `result_time_zb` | DateTime |
| 163 | `decisionStartTime` | 定标开始时间 | `decision_start_time` | DateTime |
| 164 | `decisionEndTime` | 定标结束时间 | `decision_end_time` | DateTime |
| 165 | `hasPushContract` | 是否已推送合同 | `has_push_contract` | Boolean |
| 166 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 167 | `bidUnitPriceWay` | 中标单价取值 | `bid_unit_price_way` | Boolean |
| 168 | `selectSupplier` | 指定供应商报价 | `select_supplier` | Long |
| 169 | `approveRecord` | 是否有审批记录 | `approve_record` | Boolean |
| 170 | `calibrationQuoteType` | 中标单价依据 | `calibration_quote_type` | Boolean |
| 171 | `cpuScoringGroupId` | 投票小组主键 | `cpu_scoring_group_id` | Long |
| 172 | `hasPushOrder` | 是否已推订单 | `has_push_order` | Boolean |
| 173 | `assessFileId` | 评审附件 | `assess_file_id` | String |
| 174 | `decisionFileId` | 定标附件 | `decision_file_id` | String |
| 175 | `bidPjtNotice` | 公示表 | `` | cc798cb0-d873-4c26-8fc9-f9899a4292eb |
| 176 | `define` | 中标候选人公示信息自定义项表 | `` | 59cc9090-4bb0-40a1-a2f0-e1f272773762 |
| 177 | `dsnCandidatePublicity` | 中标候选人信息 | `` | 47be073d-6095-48a4-aca1-f86083aeb288 |
| 178 | `materialList` | 中标物料明细 | `` | dcdff786-d0b5-4cb7-8ee5-c80fe56d5d5c |

---

## 关联属性（22个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 2 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 3 | `bidProjectTypeId` | 采购内容主键 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
| 4 | `ytenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
| 5 | `linkPersonId` | 联系人id | `bd.staff.Staff` | Service |  |
| 6 | `purchaseId` | 采购方式 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 7 | `materialList` | 中标物料明细 | `lawbid.decisioncandidate.CandidateMaterialDetail` | None | true |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `bidPjtNotice` | 公示表 | `lawbid.decisioncandidate.CpuBidPjtNotice` | None | true |
| 11 | `linkDepartmentId` | 所属部门id | `org.func.BaseOrg` | Service |  |
| 12 | `noticeType` | 公告模板 | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 13 | `templateId` | 主模板主键 | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 14 | `bidProjectId` | 项目ID | `lawbid.project.LawbidProject` | None |  |
| 15 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 16 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 17 | `candidateDefineCharacter` | 表头自定义项特征属性 | `lawbid.decisioncandidate.CandidateDefineCharacter` | None |  |
| 18 | `define` | 中标候选人公示信息自定义项表 | `lawbid.decisioncandidate.CpuCandidatePublicityFreeDefine` | None | true |
| 19 | `dsnCandidatePublicity` | 中标候选人信息 | `lawbid.decisioncandidate.CpuDsnCandidatePublicity` | None | true |
| 20 | `purPsnId` | 采购负责人 | `bd.staff.Staff` | Service |  |
| 21 | `currencyId` | 币种主键 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 22 | `bidSectionId` | 标段(包)编号id | `lawbid.section.LawbidSection` | None |  |

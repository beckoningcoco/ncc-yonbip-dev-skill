---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisioncandidate.CpuCandidatePublicity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标候选人公示主表 (`auction.decisioncandidate.CpuCandidatePublicity`)

> ycSouringAuction | 物理表：`cpu_candidate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标候选人公示主表 |
| 物理表 | `cpu_candidate` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:32.2160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `bid_section_code` | String | 标段(包)编号 |

---

## 直接属性（177个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `candidateDefineCharacter` | 表头自定义项特征属性 | `decision_define_character` | 52953007-2748-48f7-b65a-401c63a7fc51 |
| 3 | `noticeType` | 公告模板 | `notice_type` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 4 | `enterpriseId` | 租户ID | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `noticeUrl` | 发布内容 | `notice_url` | String |
| 6 | `newNoticeUrl` | 修改后的发布内容 | `new_notice_url` | String |
| 7 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 8 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 9 | `bidProjectId` | 项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 10 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 11 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 12 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 13 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 14 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 15 | `flowSource` | 审批源 | `flow_source` | String |
| 16 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 17 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 18 | `bidType` | 采购方式 | `bid_type` | String |
| 19 | `totalApproveNotes` | 总定标意见 | `total_approve_notes` | String |
| 20 | `verifystate` | 审批状态 | `verifystate` | Short |
| 21 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 22 | `historyFlowKey` | 历史businessKey | `historyFlowKey` | String |
| 23 | `status` | 云审状态 | `workflow_status` | Short |
| 24 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 25 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 26 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 27 | `approveStartTime` | 审批开始时间 | `approve_start_time` | DateTime |
| 28 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime |
| 29 | `purchaseId` | 采购方式 | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 30 | `candidatePublicityType` | 候选人公示类型 | `candidate_publicity_type` | Integer |
| 31 | `publishDatetime` | 候选人公示发布时间 | `publish_datetime` | DateTime |
| 32 | `bidExceptionFormId` | 异常处理ID | `bid_exception_form_id` | Long |
| 33 | `pendingMessageId` | 消息ID | `pending_message_id` | Long |
| 34 | `purchaseName` | 采购方式 | `purchase_name` | String |
| 35 | `createTime` | 创建时间 | `create_time` | DateTime |
| 36 | `createDate` | 创建日期 | `create_date` | Date |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 38 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 39 | `creator` | 创建人名称 | `creator` | String |
| 40 | `modifier` | 修改人名称 | `modifier` | String |
| 41 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 42 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 43 | `templateId` | 主模板主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 44 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 45 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 46 | `dsnStartTime` | 中标结果公布日期 | `dsn_start_time` | DateTime |
| 47 | `dsnEndTime` | 中标结果公告日期 | `dsn_end_time` | DateTime |
| 48 | `dsnPushPublic` | 中标结果公示是否推送到国家公共服务平台 | `dsn_push_public` | Integer |
| 49 | `dsnContent` | 中标公告内容 | `dsn_content` | String |
| 50 | `dsnPublish` | 是否中标结果公示 | `dsn_publish` | Integer |
| 51 | `noticePublish` | 是否发中标通知书 | `notice_publish` | Integer |
| 52 | `manager` | 项目经理 | `manager` | String |
| 53 | `techleader` | 技术负责人 | `techleader` | String |
| 54 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 55 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 56 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 57 | `supOther` | 供应商其他 | `sup_other` | String |
| 58 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 59 | `singleFlag` | 单重 | `single_flag` | Integer |
| 60 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 61 | `manufacturerFlag` | 制造 | `manufacturer_flag` | Integer |
| 62 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 63 | `dollarTotal` | 美元金额 | `dollar_total` | Decimal |
| 64 | `yenTotal` | 日元金额 | `yen_total` | Decimal |
| 65 | `euroTotal` | 欧元金额 | `euro_total` | Decimal |
| 66 | `poundTotal` | 英镑金额 | `pound_total` | Decimal |
| 67 | `resultNoticePushTime` | 中标结果公告发布时间 | `result_notice_push_time` | DateTime |
| 68 | `projectEndTime` | 项目结束时间/中标通知书发布时间 | `project_end_time` | DateTime |
| 69 | `projectReturnTime` | 项目回传结果时间 | `project_return_time` | DateTime |
| 70 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 71 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 72 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 73 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 74 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Boolean |
| 75 | `noticeStatus` | 通知书状态 | `notice_status` | String |
| 76 | `decisionRound` | 采购结果变更轮次 | `decision_round` | Integer |
| 77 | `decisionRoundStatus` | 采购结果变更状态 | `decision_round_status` | Boolean |
| 78 | `decisionChange` | 采购结果是否变更 | `decision_change` | Boolean |
| 79 | `voteStatus` | 投票状态 | `vote_status` | Integer |
| 80 | `showStartDate` | 公告公示开始日期 | `show_start_date` | DateTime |
| 81 | `showEndDate` | 公告公示结束日期 | `show_end_date` | DateTime |
| 82 | `ts` | 时间戳 | `ts` | DateTime |
| 83 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 84 | `auditor` | 审批人名称 | `auditor` | String |
| 85 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 86 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 87 | `auditDate` | 审批日期 | `audit_date` | Date |
| 88 | `pubts` | 时间戳 | `pubts` | DateTime |
| 89 | `returncount` | 退回次数 | `returncount` | Short |
| 90 | `cdeStartTime` | 公示开始时间 | `cde_start_time` | DateTime |
| 91 | `cdeEndTime` | 公示结束时间 | `cde_end_time` | DateTime |
| 92 | `releaseMedium` | 发布渠道 | `release_medium` | String |
| 93 | `cdePushPublic` | 候选人结果公示是否推送到国家公共服务平台 | `cde_push_public` | Integer |
| 94 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 95 | `cdeContent` | 候选人公告内容 | `cde_content` | String |
| 96 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 97 | `combination` | 是否是组合标 | `combination` | Integer |
| 98 | `bidProjectTypeId` | 采购内容主键 | `bid_project_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 99 | `evaluationMethod` | 评标办法 | `evaluation_method` | String |
| 100 | `purOrgId` | 采购组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 101 | `csdPublish` | 是否发布候选人公示 | `csd_publish` | Integer |
| 102 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 103 | `purPsnId` | 采购负责人 | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 104 | `purOrgName` | 采购组织名称 | `pur_org_name` | String |
| 105 | `cdeContentId` | 候选人公告内容主键 | `cde_content_id` | Long |
| 106 | `dsnContentId` | 候选人公告内容主键 | `dsn_content_id` | Long |
| 107 | `scoreCandidatePushTime` | 评标候选人公示发布时间 | `score_candidate_push_time` | DateTime |
| 108 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 109 | `linkPersonId` | 联系人id | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 110 | `fileId` | 公告附件 | `file_id` | String |
| 111 | `linkDepartmentId` | 所属部门ID | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 112 | `billstate` | 投标状态 | `billstate` | Integer |
| 113 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer |
| 114 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String |
| 115 | `quoteType` | 供应商报价 | `quote_type` | String |
| 116 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 117 | `meetingType` | 会议类型 | `meeting_type` | String |
| 118 | `meetingTypeName` | 会议方式 | `meeting_type_name` | String |
| 119 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String |
| 120 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String |
| 121 | `defaultCalibration` | 定标方式 | `default_calibration` | String |
| 122 | `performType` | 定标履行类型 | `perform_type` | String |
| 123 | `supplementItem` | 项目补录 | `supplement_item` | String |
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
| 175 | `define` | 中标候选人公示主表自定义自由项表 | `` | f2f397f8-612c-4d79-89d0-120cedfa5705 |
| 176 | `dsnCandidatePublicity` | 中标候选人公示供应商子表 | `` | d116492f-927d-4e2c-ae00-823cd44acfe4 |
| 177 | `materialList` | 中标候选人公示物料子表 | `` | a41af097-588b-4402-abeb-7337c9d4f847 |

---

## 关联属性（22个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 2 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 3 | `bidProjectTypeId` | 采购内容主键 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `linkPersonId` | 联系人id | `bd.staff.Staff` | Service |  |
| 6 | `purchaseId` | 采购方式 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 7 | `materialList` | 中标候选人公示物料子表 | `auction.decisioncandidate.CandidateMaterialDetail` | None | true |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `linkDepartmentId` | 所属部门ID | `org.func.BaseOrg` | Service |  |
| 11 | `noticeType` | 公告模板 | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 12 | `templateId` | 主模板主键 | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 13 | `bidProjectId` | 项目ID | `auction.project.AuctionProject` | None |  |
| 14 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 15 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 16 | `candidateDefineCharacter` | 表头自定义项特征属性 | `auction.decisioncandidate.CandidateDefineCharacter` | None |  |
| 17 | `define` | 中标候选人公示主表自定义自由项表 | `auction.decisioncandidate.CpuCandidatePublicityFreeDefine` | None | true |
| 18 | `dsnCandidatePublicity` | 中标候选人公示供应商子表 | `auction.decisioncandidate.CpuDsnCandidatePublicity` | None | true |
| 19 | `purPsnId` | 采购负责人 | `bd.staff.Staff` | Service |  |
| 20 | `enterpriseId` | 租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 21 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 22 | `bidSectionId` | 标段(包)编号主键 | `auction.project.AuctionSection` | None |  |

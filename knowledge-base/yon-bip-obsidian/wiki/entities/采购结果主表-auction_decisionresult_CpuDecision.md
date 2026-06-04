---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisionresult.CpuDecision"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购结果主表 (`auction.decisionresult.CpuDecision`)

> ycSouringAuction | 物理表：`cpu_decision`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购结果主表 |
| 物理表 | `cpu_decision` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:11.3280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（175个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 3 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 4 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 5 | `oldBillNum` | 原始单据号 | `old_bill_num` | String |
| 6 | `flowSource` | 审批源 | `flow_source` | String |
| 7 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 8 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 9 | `totalApproveNotes` | 总定标意见 | `total_approve_notes` | String |
| 10 | `verifystate` | 审批状态 | `verifystate` | Short |
| 11 | `returncount` | 退回次数 | `returncount` | Short |
| 12 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 13 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `isHistoryFlow` | 是否为历史审批流 | `is_history_flow` | Integer |
| 16 | `historyFlowKey` | 历史审批流键 | `historyFlowKey` | String |
| 17 | `status` | 云审状态 | `workflow_status` | Short |
| 18 | `supportMaterialExceed` | 是否允许超量定标 | `support_material_exceed` | Short |
| 19 | `sourcingStrategyId` | 寻源策略 | `sourcing_strategy_id` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 |
| 20 | `buyerTenant` | 采购商租户主键 | `buyer_tenant_id` | String |
| 21 | `vendorTenant` | 供应商租户主键 | `vendor_tenant_id` | String |
| 22 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 23 | `approveStartTime` | 审批开始时间 | `approve_start_time` | DateTime |
| 24 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime |
| 25 | `purchaseId` | 采购方式 | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 26 | `supplementItem` | 项目补录 | `supplement_item` | String |
| 27 | `purchaseName` | 采购方式 | `purchase_name` | String |
| 28 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 29 | `pushContractOrderType` | 推送合同或订单方式 | `push_contract_order_type` | String |
| 30 | `generateContractType` | 生成合同方式 | `generate_contract_type` | String |
| 31 | `generateOrderType` | 生成订单方式 | `generate_order_type` | String |
| 32 | `dr` | 逻辑删除标记 | `dr` | Short |
| 33 | `ts` | 时间戳 | `ts` | DateTime |
| 34 | `cdeStartTime` | 候选人公布日期 | `cde_start_time` | DateTime |
| 35 | `cdeEndTime` | 候选人公告日期 | `cde_end_time` | DateTime |
| 36 | `cdePushPublic` | 候选人结果公示是否推送到国家公共服务平台 | `cde_push_public` | Integer |
| 37 | `cdeContent` | 候选人公告内容 | `cde_content` | String |
| 38 | `dsnStartTime` | 中标结果公布日期 | `dsn_start_time` | DateTime |
| 39 | `dsnEndTime` | 中标结果公告日期 | `dsn_end_time` | DateTime |
| 40 | `dsnPushPublic` | 中标结果公示是否推送到国家公共服务平台 | `dsn_push_public` | Integer |
| 41 | `dsnContent` | 中标公告内容 | `dsn_content` | String |
| 42 | `csdPublish` | 是否发布候选人公示 | `csd_publish` | Integer |
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
| 56 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 57 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 58 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 59 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 60 | `scoreCandidatePushTime` | 评标候选人公示发布时间 | `score_candidate_push_time` | DateTime |
| 61 | `resultNoticePushTime` | 中标结果公告发布时间 | `result_notice_push_time` | DateTime |
| 62 | `projectEndTime` | 项目结束时间/中标通知书发布时间 | `project_end_time` | DateTime |
| 63 | `projectReturnTime` | 项目回传结果时间 | `project_return_time` | DateTime |
| 64 | `ytenantId` | 租户 | `ytenant_id` | String |
| 65 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 66 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 67 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 68 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 69 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Boolean |
| 70 | `noticeStatus` | 通知书状态 | `notice_status` | String |
| 71 | `decisionRound` | 采购结果变更轮次 | `decision_round` | Integer |
| 72 | `decisionRoundStatus` | 采购结果变更状态 | `decision_round_status` | Boolean |
| 73 | `decisionChange` | 采购结果是否变更 | `decision_change` | Boolean |
| 74 | `voteStatus` | 投票状态 | `vote_status` | Integer |
| 75 | `showStartDate` | 公告公示开始日期 | `show_start_date` | DateTime |
| 76 | `showEndDate` | 公告公示结束日期 | `show_end_date` | DateTime |
| 77 | `bidProjectTypeId` | 采购内容主键 | `bid_project_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 78 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 79 | `createTime` | 创建时间 | `create_time` | DateTime |
| 80 | `createDate` | 创建日期 | `create_date` | Date |
| 81 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 82 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 83 | `creator` | 创建人名称 | `creator` | String |
| 84 | `modifier` | 修改人名称 | `modifier` | String |
| 85 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 86 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 87 | `auditor` | 审批人名称 | `auditor` | String |
| 88 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 89 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 90 | `auditDate` | 审批日期 | `audit_date` | Date |
| 91 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 92 | `purOrgId` | 采购组织主键 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 93 | `purPsnId` | 采购负责人 | `pur_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 94 | `purOrgName` | 采购组织名称 | `pur_org_name` | String |
| 95 | `bidProjectId` | 项目主键 | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 96 | `linkPersonId` | 联系人主键 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 97 | `linkDepartmentId` | 所属部门主键 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 98 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 99 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 100 | `billstate` | 投标状态 | `billstate` | Integer |
| 101 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer |
| 102 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String |
| 103 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 104 | `quoteType` | 供应商报价 | `quote_type` | String |
| 105 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 106 | `bidType` | 竞争方式 | `bid_type` | String |
| 107 | `meetingType` | 会议类型 | `meeting_type` | String |
| 108 | `meetingTypeName` | 会议方式 | `meeting_type_name` | String |
| 109 | `ctTranstypeCode` | 采购合同交易类型编码 | `ct_transtype_code` | String |
| 110 | `ctTranstypeName` | 合同类型 | `ct_transtype_name` | String |
| 111 | `defaultCalibration` | 定标方式 | `default_calibration` | String |
| 112 | `performType` | 定标履行类型 | `perform_type` | String |
| 113 | `consignationId` | 委托单主键 | `consignation_id` | Long |
| 114 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 115 | `consignationName` | 委托名称 | `consignation_name` | String |
| 116 | `predictedPrice` | 预计价格合计 | `predicted_price` | Decimal |
| 117 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 118 | `bidBottom` | 标底合计 | `bid_bottom` | Decimal |
| 119 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 120 | `combination` | 是否是组合标 | `combination` | Integer |
| 121 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 122 | `evaluationMethod` | 评标办法 | `evaluation_method` | String |
| 123 | `decisionDefineCharacter` | 采购结果主表表头自定义项 | `decision_define_character` | a0876ed8-9b33-4904-b518-dae26f323266 |
| 124 | `bidConfirm` | 是否同意招标结果 | `bid_confirm` | Integer |
| 125 | `qualifyCheckStep` | 预审或者后审代表流程阶段 | `qualify_check_step` | Integer |
| 126 | `agencyorgId` | 代理机构组织主键 | `agencyOrg_id` | String |
| 127 | `agencyorgName` | 代理机构组织 | `agencyOrg_name` | String |
| 128 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 129 | `decisionOrgId` | 委托单编号 | `decision_org_id` | String |
| 130 | `decisionOrgName` | 委托单位 | `decision_org_name` | String |
| 131 | `decisionPersonId` | 委托人主键 | `decision_person_id` | String |
| 132 | `decisionPersonName` | 委托人 | `decision_person_name` | String |
| 133 | `agencyPersonId` | 代理机构组织人员d | `agency_person_id` | String |
| 134 | `agencyPersonName` | 代理机构人员姓名 | `agency_person_name` | String |
| 135 | `cdeContentId` | 候选人公告内容id | `cde_content_id` | Long |
| 136 | `dsnContentId` | 候选人公告内容id | `dsn_content_id` | Long |
| 137 | `disagreeReason` | 委托人不同意原因 | `disagree_reason` | String |
| 138 | `disagreeTime` | 不同意时间 | `disagree_time` | DateTime |
| 139 | `cloudApproveStatus` | 定标单云审状态 | `cloud_approve_status` | Integer |
| 140 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 141 | `payMode` | 付款方式 | `pay_mode` | String |
| 142 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 143 | `technical` | 技术指标 | `technical` | String |
| 144 | `other` | 其他 | `other` | String |
| 145 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 146 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 147 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 148 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 149 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 150 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 151 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 152 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 153 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 154 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 155 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 156 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 157 | `resultTimeWt` | 委托方定标时间 | `result_time_wt` | DateTime |
| 158 | `resultTimeZb` | 招标公司授标时间 | `result_time_zb` | DateTime |
| 159 | `decisionStartTime` | 定标开始时间 | `decision_start_time` | DateTime |
| 160 | `decisionEndTime` | 定标结束时间 | `decision_end_time` | DateTime |
| 161 | `hasPushContract` | 是否已推送合同 | `has_push_contract` | Boolean |
| 162 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 163 | `bidUnitPriceWay` | 中标单价取值 | `bid_unit_price_way` | Boolean |
| 164 | `selectSupplier` | 指定供应商报价 | `select_supplier` | Long |
| 165 | `approveRecord` | 是否有审批记录 | `approve_record` | Boolean |
| 166 | `calibrationQuoteType` | 中标单价依据 | `calibration_quote_type` | Boolean |
| 167 | `cpuScoringGroupId` | 投票小组主键 | `cpu_scoring_group_id` | Long |
| 168 | `hasPushOrder` | 是否已推订单 | `has_push_order` | Boolean |
| 169 | `assessFileId` | 评审附件 | `assess_file_id` | String |
| 170 | `decisionFileId` | 定标附件 | `decision_file_id` | String |
| 171 | `define` | 定标单主表自定义项表 | `` | 3e516b5e-4170-4893-bea1-b21d8cdaad71 |
| 172 | `effectReq` | 定标影响需求执行量 | `effect_req` | Short |
| 173 | `materialList` | 中标物料明细 | `` | aa63adff-d8eb-4dad-83ce-0bc6e33c0b3a |
| 174 | `resultAllList` | 供应商报价表 | `` | f348ca67-8517-4b9a-afb3-d95839b0719a |
| 175 | `resultList` | 中标结果子表 | `` | 018f6cfc-19ee-4a10-9a10-4a817bf68cae |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织主键 | `org.func.BaseOrg` | Service |  |
| 2 | `bidProjectTypeId` | 采购内容主键 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `linkPersonId` | 联系人主键 | `bd.staff.Staff` | Service |  |
| 5 | `purchaseId` | 采购方式 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 6 | `materialList` | 中标物料明细 | `auction.decisionresult.CpuDsnMaterialDetail` | None | true |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `linkDepartmentId` | 所属部门主键 | `org.func.BaseOrg` | Service |  |
| 10 | `bidProjectId` | 项目主键 | `auction.project.AuctionProject` | None |  |
| 11 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 12 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `decisionDefineCharacter` | 采购结果主表表头自定义项 | `auction.decisionresult.AuctionDecisionDefineCharacter` | None |  |
| 14 | `sourcingStrategyId` | 寻源策略 | `sourcing.businessRuleSolution.BusinessRuleSolution` | Service |  |
| 15 | `define` | 定标单主表自定义项表 | `auction.decisionresult.CpuDecisionFreeDefine` | None | true |
| 16 | `purPsnId` | 采购负责人 | `bd.staff.Staff` | Service |  |
| 17 | `resultAllList` | 供应商报价表 | `auction.decisionresult.CpuDecisionResultAll` | None | true |
| 18 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 19 | `resultList` | 中标结果子表 | `auction.decisionresult.CpuDecisionResult` | None | true |
| 20 | `bidSectionId` | 标段(包)编号主键 | `auction.project.AuctionSection` | None |  |

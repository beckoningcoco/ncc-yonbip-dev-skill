---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionsupplement.CpuSupplement"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 补录单主表 (`lawbid.decisionsupplement.CpuSupplement`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_supplement`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补录单主表 |
| 物理表 | `cpu_supplement` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:50.2280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:29:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 补录单接口 | `lawdecision.itf.ICpuSupplement` | 597 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 5 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 6 | 采购模板-领域扩展字段 | `tpl.itf.TplId` | 53 |

---

## 直接属性（130个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 7 | `linkDepartmentId` | 联系人部门主键 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `supplementDefineCharacter` | 补录单表头自定义项特征 | `define_character_id` | 9f6c03bc-6963-49b5-a290-b3097759f334 |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `ts` | 时间戳 | `ts` | DateTime |
| 15 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 16 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `id` | id | `id` | Long |
| 18 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 19 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 20 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 21 | `purchaseName` | 采购方式 | `purchase_name` | String |
| 22 | `purOrgId` | 采购组织主键 | `pur_org_id` | String |
| 23 | `purOrgName` | 采购组织名称 | `pur_org_name` | String |
| 24 | `bidProjectId` | 项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 25 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 26 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 27 | `billstate` | 投标状态 | `billstate` | Integer |
| 28 | `isPublished` | 发布状态 | `isPublished` | Integer |
| 29 | `bidType` | 采购方式 | `bid_type` | String |
| 30 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer |
| 31 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String |
| 32 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 33 | `consignationId` | 委托单主键 | `consignation_id` | Long |
| 34 | `consignationNo` | 委托单号 | `consignation_no` | String |
| 35 | `consignationName` | 委托名称 | `consignation_name` | String |
| 36 | `predictedPrice` | 预计价格合计 | `predicted_price` | Decimal |
| 37 | `highestPrice` | 最高限价合计 | `highest_price` | Decimal |
| 38 | `bidBottom` | 标底合计 | `bid_bottom` | Decimal |
| 39 | `lawBid` | 法定招标 | `law_bid` | Integer |
| 40 | `combination` | 是否是组合标 | `combination` | Integer |
| 41 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 42 | `evaluationMethod` | 评标办法 | `evaluation_method` | String |
| 43 | `bidConfirm` | 是否同意招标结果 | `bid_confirm` | Integer |
| 44 | `qualifyCheckStep` | 预审或者后审代表流程阶段 | `qualify_check_step` | Integer |
| 45 | `csdPublish` | 是否发布候选人公示 | `csd_publish` | Integer |
| 46 | `dsnPublish` | 是否中标结果公示 | `dsn_publish` | Integer |
| 47 | `noticePublish` | 是否发中标通知书 | `notice_publish` | Integer |
| 48 | `agencyorgId` | 代理机构组织主键 | `agencyOrg_id` | String |
| 49 | `agencyorgName` | 代理机构组织 | `agencyOrg_name` | String |
| 50 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 51 | `decisionOrgId` | 委托单编号 | `decision_org_id` | String |
| 52 | `decisionOrgName` | 委托单位 | `decision_org_name` | String |
| 53 | `decisionPersonId` | 委托人主键 | `decision_person_id` | String |
| 54 | `decisionPersonName` | 委托人 | `decision_person_name` | String |
| 55 | `agencyPersonId` | 代理机构组织人员主键 | `agency_person_id` | String |
| 56 | `agencyPersonName` | 代理机构人员姓名 | `agency_person_name` | String |
| 57 | `cdeContentId` | 候选人公告内容主键 | `cde_content_id` | Long |
| 58 | `dsnContentId` | 采购结果内容主键 | `dsn_content_id` | Long |
| 59 | `disagreeReason` | 委托人不同意原因 | `disagree_reason` | String |
| 60 | `disagreeTime` | 不同意时间 | `disagree_time` | DateTime |
| 61 | `cloudApproveStatus` | 定标单云审状态 | `cloud_approve_status` | Integer |
| 62 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 63 | `payMode` | 付款方式 | `pay_mode` | String |
| 64 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 65 | `technical` | 技术指标 | `technical` | String |
| 66 | `other` | 其他 | `other` | String |
| 67 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 68 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 69 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 70 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 71 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 72 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 73 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 74 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 75 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 76 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 77 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 78 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 79 | `manager` | 项目经理 | `manager` | String |
| 80 | `techleader` | 技术负责人 | `techleader` | String |
| 81 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 82 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 83 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 84 | `supOther` | 供应商其他 | `sup_other` | String |
| 85 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 86 | `singleFlag` | 单重 | `single_flag` | Integer |
| 87 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 88 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 89 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 90 | `resultTimeWt` | 委托方定标时间 | `result_time_wt` | DateTime |
| 91 | `resultTimeZb` | 招标公司授标时间 预留 | `result_time_zb` | DateTime |
| 92 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 93 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 94 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 95 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 96 | `decisionStartTime` | 定标开始时间 | `decision_start_time` | DateTime |
| 97 | `decisionEndTime` | 定标结束时间 | `decision_end_time` | DateTime |
| 98 | `projectEndTime` | 项目结束时间/中标通知书发布时间 | `project_end_time` | DateTime |
| 99 | `projectReturnTime` | 项目回传结果时间 | `project_return_time` | DateTime |
| 100 | `hasPushContract` | 是否已推送合同 | `has_push_contract` | Boolean |
| 101 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 102 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 103 | `payUnit` | 缴纳单位 | `pay_unit` | String |
| 104 | `totalAmountServiceFee` | 服务费总金额 | `total_amount_service_fee` | Decimal |
| 105 | `noticeShape` | 通知书形式 | `notice_shape` | String |
| 106 | `unsuccessfulBidNotice` | 未中标通知书 | `unsuccessful_bid_notice` | Boolean |
| 107 | `noticeStatus` | 通知书状态 | `notice_status` | String |
| 108 | `meetingType` | 会议类型 | `meeting_type` | String |
| 109 | `meetingTypeName` | 会议类型名称 | `meeting_type_name` | String |
| 110 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 111 | `decisionRound` | 采购结果变更轮次 | `decision_round` | Integer |
| 112 | `decisionRoundStatus` | 采购结果变更状态 | `decision_round_status` | Boolean |
| 113 | `decisionChange` | 采购结果是否变更 | `decision_change` | Boolean |
| 114 | `totalApproveNotes` | 总定标意见 | `total_approve_notes` | String |
| 115 | `bidUnitPriceWay` | 中标单价取值 | `bid_unit_price_way` | Boolean |
| 116 | `selectSupplier` | 指定供应商报价 | `select_supplier` | Long |
| 117 | `approveRecord` | 是否有审批记录 | `approve_record` | Boolean |
| 118 | `cpuScoringGroupId` | 投票小组主键 | `cpu_scoring_group_id` | Long |
| 119 | `voteStatus` | 投票状态 | `vote_status` | Integer |
| 120 | `hasPushOrder` | 是否已推订单 | `has_push_order` | Boolean |
| 121 | `assessFileId` | 评审附件 | `assess_file_id` | String |
| 122 | `decisionFileId` | 定标附件 | `decision_file_id` | String |
| 123 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 124 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 125 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 126 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 127 | `calibrationQuoteType` | 中标单价依据 | `calibration_quote_type` | Boolean |
| 128 | `materialList` | 补录物料明细表 | `` | ad3ee086-a563-48cc-9ceb-aede709bc1ad |
| 129 | `supplierList` | 补录供应商表 | `` | c5aef5c2-13bd-49cf-8d21-9d8f14e7deda |
| 130 | `templateId` | 主模板主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplementDefineCharacter` | 补录单表头自定义项特征 | `lawbid.decisionsupplement.CpuSupplementDefineCharacter` | None |  |
| 2 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 3 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 5 | `materialList` | 补录物料明细表 | `lawbid.decisionsupplement.CpuSupplementMaterial` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `linkDepartmentId` | 联系人部门主键 | `org.func.BaseOrg` | Service |  |
| 9 | `templateId` | 主模板主键 | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 10 | `supplierList` | 补录供应商表 | `lawbid.decisionsupplement.CpuSupplementSupplier` | None | true |
| 11 | `bidProjectId` | 项目主键 | `lawbid.project.LawbidProject` | None |  |
| 12 | `bidSectionId` | 标段(包)编号主键 | `lawbid.section.LawbidSection` | None |  |

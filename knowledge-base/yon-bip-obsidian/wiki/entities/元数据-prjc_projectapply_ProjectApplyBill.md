---
tags: [BIP, 元数据, 数据字典, prjc.projectapply.ProjectApplyBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 立项申请单 (`prjc.projectapply.ProjectApplyBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_projectapply` | domain：`yonbip-pm-projectme` | 应用：`PRJC` | 业务对象ID：`4a03f6c9-5bfa-45cf-999a-ece9d5154b9d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 立项申请单 |
| 物理表 | `prjc_projectapply` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PRJC` |
| 直连字段 | 121 个 |
| 子表 | 3 个 |
| 关联引用 | 40 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `deliveryList` | `prjc.projectapply.ProjectApplyDeliveryList` | composition |
| `SupplierSuggestList` | `prjc.projectapply.SupplierSuggest` | composition |
| `projectApplyRangeList` | `prjc.projectapply.ProjectApplyRange` | composition |

## 关联引用 (40个)

| 字段名 | 引用类型 |
|--------|---------|
| `cust_manager_id` | `ucf-staff-center.bd_staff_outer_ref` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `parent_id` | `` |
| `city` | `ucfbasedoc.bd_regionprovinceref` |
| `department_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `external_accentity_id` | `finbd.bd_allaccbodyref` |
| `sale_order_id` | `udinghuo.voucher_orderlistref` |
| `transi_type_id` | `ucfbasedoc.bd_billtyperef` |
| `template_id` | `yonbip-pm-projectme.prtp_projecttemplate_ref` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `costcenter_id` | `finbd.bd_costcenterref` |
| `working_calendar` | `` |
| `` | `` |
| `nat_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `province` | `ucfbasedoc.bd_regionprovinceref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `father_id` | `ucfbasedoc.bd_projectcardref` |
| `originator_id` | `iuap-ptc-yoncmm.sattUuser` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `exch_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `project_apply_define_character` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `project_file_id` | `ucfbasedoc.bd_projectcardref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `design_project_id` | `ucfbasedoc.bd_projectcardref` |
| `manager_id` | `ucf-staff-center.bd_staff_outer_ref` |
| `ytenant_id` | `` |
| `project_type_id` | `ucfbasedoc.bd_billtyperef` |
| `execute_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `budget_scheme_id` | `` |
| `team_id` | `` |
| `contract_id` | `developplatform.XXHT` |
| `invest_project_id` | `ucfbasedoc.bd_investprojectref` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `category_id` | `ucfbasedoc.bd_projectclasstreeref` |
| `sales_org_id` | `` |

## 继承接口 (8个, 31字段)

- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 121 个直连字段

### 文本字段 (39个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_code` | `bill_type_code` | `billTypeCode` | 单据类型编码 |
| `code` | `code` | `code` | 立项单编码 |
| `contract_progress` | `contract_progress` | `contractProgress` | 合同进展描述 |
| `delivery_mode` | `delivery_mode` | `deliveryMode` | 交付模式 |
| `detailed_address` | `detailed_address` | `detailedAddress` | 地址:详细地址 |
| `external_project_code` | `external_project_code` | `externalProjectCode` | 外部项目编码 |
| `external_project_id` | `external_project_id` | `externalProjectId` | 外部项目ID |
| `external_system_type` | `external_system_type` | `externalSystemType` | 外部系统标识 |
| `files` | `files` | `files` | 附件 |
| `gtx_id` | `gtx_id` | `gtxId` | 全局事务ID |
| `id_card_no` | `id_card_no` | `idCardNo` | 助记码 |
| `latitude` | `latitude` | `latitude` | 地址:纬度 |
| `longitude` | `longitude` | `longitude` | 地址:经度 |
| `project_code` | `project_code` | `projectCode` | 项目编码 |
| `relate_type` | `relate_type` | `relateType` | 关联类型 |
| `source_bill_type` | `source_bill_type` | `sourceBillType` | 来源单据单据类型 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表ID |
| `source_id` | `source_id` | `sourceId` | 来源单据ID |
| `source_type` | `source_type` | `sourceType` | 来源单据类型 |
| `system_code` | `system_code` | `systemCode` | 来源系统标志 |
| `transi_type_code` | `transi_type_code` | `transiTypeCode` | 交易类型编码 |
| `tx_id` | `tx_id` | `txId` | 本地事务ID |
| `clm_busi_obj` | `clm_busi_obj` | `clmBusiObj` | clm合同业务对象编码 |
| `clm_contract_id` | `clm_contract_id` | `clmContractId` | clm合同ID |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例ID |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流ID |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表ID |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表ID |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表ID |
| `path` | `path` | `path` | 路径 |

### 引用字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `team_id` | `team_id` | `applyTeamId` | 团队ID |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `category_id` | `category_id` | `categoryId` | 项目类别 |
| `city` | `city` | `city` | 地址:市 |
| `contract_id` | `contract_id` | `contractId` | 合同 |
| `costcenter_id` | `costcenter_id` | `costcenterId` | 成本中心 |
| `currency_id` | `currency_id` | `currencyId` | 合同币种 |
| `cust_manager_id` | `cust_manager_id` | `custManagerId` | 客户经理 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `department_id` | `department_id` | `departmentId` | 部门 |
| `design_project_id` | `design_project_id` | `designProjectId` | 设计项目ID |
| `exch_rate_type_id` | `exch_rate_type_id` | `exchRateTypeId` | 汇率类型 |
| `execute_org_id` | `execute_org_id` | `executeOrgId` | 执行组织ID |
| `external_accentity_id` | `external_accentity_id` | `externalAccentityId` | 对外会计主体 |
| `father_id` | `father_id` | `fatherId` | 父项目ID |
| `fin_org_id` | `fin_org_id` | `finOrgId` | 开票组织 |
| `invest_project_id` | `invest_project_id` | `investProjectId` | 投资项目 |
| `manager_id` | `manager_id` | `managerId` | 项目经理 |
| `nat_currency_id` | `nat_currency_id` | `natCurrencyId` | 本币 |
| `org_id` | `org_id` | `orgId` | 立项企业 |
| `originator_id` | `originator_id` | `originatorId` | 制单人 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `profit_center_id` | `profit_center_id` | `profitCenterId` | 利润中心 |
| `project_file_id` | `project_file_id` | `projectFileId` | 平台项目档案 |
| `project_type_id` | `project_type_id` | `projectTypeId` | 项目类型 |
| `province` | `province` | `province` | 地址:省份 |
| `sale_order_id` | `sale_order_id` | `saleOrderId` | 销售订单 |
| `sales_org_id` | `sales_org_id` | `salesOrgId` | 销售组织 |
| `template_id` | `template_id` | `templateId` | 项目模板 |
| `transi_type_id` | `transi_type_id` | `transiTypeId` | 交易类型 |
| `working_calendar` | `working_calendar` | `workingCalendar` | 工作日历 |
| `budget_scheme_id` | `budget_scheme_id` | `budgetSchemeId` | 预算编制方案 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户ID |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expect_sign_date` | `expect_sign_date` | `expectSignDate` | 预计签约日期 |
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划结束日期 |
| `plan_start_date` | `plan_start_date` | `planStartDate` | 计划开始日期 |
| `project_date` | `project_date` | `projectDate` | 立项日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `external_project_pubts` | `external_project_pubts` | `externalProjectPubts` | 外部项目同步时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_flag` | `advance_flag` | `advanceFlag` | 是否是提前立项单 |
| `registry_flag` | `registry_flag` | `registryFlag` | 补充立项 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_progress_status` | `contract_progress_status` | `contractProgressStatus` | 合同进展 |
| `key_flag` | `key_flag` | `keyFlag` | 是否重点项目 |
| `schedule_model_type` | `schedule_model_type` | `scheduleModelType` | 进度计划模型 |
| `settlement_basis` | `settlement_basis` | `settlementBasis` | 结算依据 |
| `status` | `status` | `status` | 单据状态 |
| `wbs_schedule_method` | `wbs_schedule_method` | `wbsScheduleMethod` | WBS编制方式 |
| `team_management_mode` | `team_management_mode` | `teamManagementMode` | 团队管理模式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `constr_period` | `constr_period` | `constrPeriod` | 工期 |
| `esti_man_days` | `esti_man_days` | `estiManDays` | 预计人天 |
| `frozen` | `frozen` | `frozen` | frozen |
| `isWfControlled` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `normal_flag` | `normal_flag` | `normalFlag` | 正常立项 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `parent_flag` | `parent_flag` | `parentFlag` | 是否为父项目 |
| `tx_status` | `tx_status` | `txStatus` | 事务状态 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oppt_id` | `oppt_id` | `opptId` | 商机 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ARR` | `ARR` | `ARR` | ARR |
| `esti_expend_mny` | `esti_expend_mny` | `estiExpendMny` | 预计支出(原币) |
| `esti_income_mny` | `esti_income_mny` | `estiIncomeMny` | 预计收入(原币) |
| `esti_profit_mny` | `esti_profit_mny` | `estiProfitMny` | 预计收益(原币) |
| `exch_rate` | `exch_rate` | `exchRate` | 汇率 |
| `nat_esti_expend_mny` | `nat_esti_expend_mny` | `natEstiExpendMny` | 预计支出(本币) |
| `nat_esti_income_mny` | `nat_esti_income_mny` | `natEstiIncomeMny` | 预计收入(本币) |
| `nat_esti_profit_mny` | `nat_esti_profit_mny` | `natEstiProfitMny` | 预计收益(本币) |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 项目名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_apply_define_character` | `project_apply_define_character` | `projectApplyBillDefineCharacter` | 立项自定义项特征属性 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_desc` | `project_desc` | `projectDesc` | 立项说明 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `SupplierSuggestList` | 供应商推荐 |
| `` | `` | `projectApplyRangeList` | 项目适用范围 |
| `` | `` | `deliveryList` | 立项单交付清单 |

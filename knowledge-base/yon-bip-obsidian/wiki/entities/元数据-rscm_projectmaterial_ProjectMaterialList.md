---
tags: [BIP, 元数据, 数据字典, rscm.projectmaterial.ProjectMaterialList]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目物资清单 (`rscm.projectmaterial.ProjectMaterialList`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prpr_project_materiallist` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`df40af34-9a0c-497b-a146-0041db0653e9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目物资清单 |
| 物理表 | `prpr_project_materiallist` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `RSCM` |
| 直连字段 | 74 个 |
| 子表 | 2 个 |
| 关联引用 | 26 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `PurchaseExecutionList` | `rscm.projectmaterial.PurchaseExecution` | composition |
| `items` | `rscm.projectmaterial.MaterialItem` | composition |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `bom_reference_point` | `` |
| `` | `` |
| `designated_contract_id` | `yonbip-ec-contract.RefTable_bf5ca95c96` |
| `supplier_suggest_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `transi_type_id` | `ucfbasedoc.bd_billtyperef` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `activity_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `submitter_id` | `ucf-staff-center.bd_staff_all_ref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `material_tpl_id` | `yonbip-pm-projectme.RefTable_46d4554598` |
| `compiler_id` | `ucf-staff-center.bd_staff_all_ref` |
| `define_characteristic` | `` |
| `wbs_template_item_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `project_type_id` | `ucfbasedoc.bd_billtyperef` |
| `compiler_department_id` | `ucf-org-center.org_unit_tree_ref` |
| `grouping_wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `canceler_id` | `ucf-staff-center.bd_staff_all_ref` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (6个, 24字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 74 个直连字段

### 文本字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type_code` | `bill_type_code` | `billTypeCode` | 单据类型编码 |
| `code` | `code` | `code` | 单据编码 |
| `mater_source_id` | `mater_source_id` | `materSourceId` | 来源 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 单据名称 |
| `oid` | `oid` | `oid` | 原始id |
| `req_accept_type` | `req_accept_type` | `reqAcceptType` | 受理类型 |
| `req_accept_type_name` | `req_accept_type_name` | `reqAcceptTypeName` | 受理类型名称 |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `transi_type_code` | `transi_type_code` | `transiTypeCode` | 交易类型编码 |
| `version` | `version` | `version` | 版本 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_id` | `activity_id` | `activityId` | 活动 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `bom_reference_point` | `bom_reference_point` | `bomReferencePoint` | BOM传输点 |
| `compiler_department_id` | `compiler_department_id` | `compilerDepartmentId` | 编制部门 |
| `compiler_id` | `compiler_id` | `compilerId` | 编制人 |
| `currency_id` | `currency_id` | `currencyId` | 本币 |
| `designated_contract_id` | `designated_contract_id` | `designatedContractId` | 指定合同 |
| `fin_org_id` | `fin_org_id` | `finOrgId` | 会计主体 |
| `grouping_wbs` | `grouping_wbs` | `groupingWbs` | 库存管理WBS |
| `material_tpl_id` | `material_tpl_id` | `materialTplId` | 物资清单模板 |
| `org_id` | `org_id` | `orgId` | 立项企业 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `project_type_id` | `project_type_id` | `projectTypeId` | 项目类型 |
| `supplier_suggest_id` | `supplier_suggest_id` | `supplierSuggestId` | 推荐供应商 |
| `transi_type_id` | `transi_type_id` | `transiTypeId` | 交易类型 |
| `wbs` | `wbs` | `wbs` | WBS |
| `submitter_id` | `submitter_id` | `submitterId` | 提交人 |
| `wbs_template_item_id` | `wbs_template_item_id` | `wbsTemplateItemId` | 计划模板明细id |
| `canceler_id` | `canceler_id` | `cancelerId` | 撤回人 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `compile_date` | `compile_date` | `compileDate` | 编制日期 |
| `demand_time` | `demand_time` | `demandTime` | 需求时间 |

### 日期时间 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `cancel_time` | `cancel_time` | `cancelTime` | 撤回时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auto_pull` | `auto_pull` | `autoPullProcure` | 是否自动推采购任务 |
| `dimension` | `dimension` | `dimension` | 物料维度 |
| `effect_flag` | `effect_flag` | `effectFlag` | 是否生效 |
| `material_method` | `material_method` | `materialMethod` | 物资编制方式 |
| `new_flag` | `new_flag` | `newFlag` | 是否最新版本 |
| `single_source` | `single_source` | `singleSource` | 单一来源 |
| `status` | `status` | `status` | 单据状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isWfControlled` | `isWfControlled` | `isWfControlled` | 是否受审批流控制 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_mny` | `tax_mny` | `taxMny` | 税额 |
| `total_mny` | `total_mny` | `totalMny` | 无税金额 |
| `total_tax_mny` | `total_tax_mny` | `totalTaxMny` | 价税合计 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristic` | `define_characteristic` | `defineCharacteristic` | 自定义项属性 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `PurchaseExecutionList` | 采购执行明细 |
| `` | `` | `items` | 项目物资清单明细 |

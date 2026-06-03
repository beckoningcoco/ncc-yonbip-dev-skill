---
tags: [BIP, 元数据, 数据字典, pgrm.wbstemplate.WbsTemplateMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目物资清单模板 (`pgrm.wbstemplate.WbsTemplateMaterial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_template_material` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5b1fe33b-f5ca-4a2f-96c1-94bf2d130a37`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目物资清单模板 |
| 物理表 | `pgrm_template_material` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 74 个 |
| 子表 | 1 个 |
| 关联引用 | 26 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `WbsTemplateMaterialItemList` | `pgrm.wbstemplate.WbsTemplateMaterialItem` | composition |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `bom_reference_point` | `` |
| `WbsTemplateItem_id` | `` |
| `designated_contract_id` | `yonbip-ec-contract.RefTable_bf5ca95c96` |
| `supplier_suggest_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `transi_type_id` | `ucfbasedoc.bd_billtyperef` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `activity_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `` | `` |
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

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 74 个直连字段

### 文本字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `bill_type_code` | `bill_type_code` | `billTypeCode` | 单据类型编码 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `code` | `code` | `code` | 单据编码 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `mater_source_id` | `mater_source_id` | `materSourceId` | 来源 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 单据名称 |
| `oid` | `oid` | `oid` | 原始id |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `req_accept_type` | `req_accept_type` | `reqAcceptType` | 受理类型 |
| `req_accept_type_name` | `req_accept_type_name` | `reqAcceptTypeName` | 受理类型名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `transi_type_code` | `transi_type_code` | `transiTypeCode` | 交易类型编码 |
| `version` | `version` | `version` | 版本 |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `WbsTemplateItem_id` | `WbsTemplateItem_id` | `WbsTemplateItem_id` | WBS模板明细 |
| `activity_id` | `activity_id` | `activityId` | 活动 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `bom_reference_point` | `bom_reference_point` | `bomReferencePoint` | BOM传输点 |
| `canceler_id` | `canceler_id` | `cancelerId` | 撤回人 |
| `compiler_department_id` | `compiler_department_id` | `compilerDepartmentId` | 编制部门 |
| `compiler_id` | `compiler_id` | `compilerId` | 编制人 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency_id` | `currency_id` | `currencyId` | 本币 |
| `designated_contract_id` | `designated_contract_id` | `designatedContractId` | 指定合同 |
| `fin_org_id` | `fin_org_id` | `finOrgId` | 会计主体 |
| `grouping_wbs` | `grouping_wbs` | `groupingWbs` | 库存管理WBS |
| `material_tpl_id` | `material_tpl_id` | `materialTplId` | 物资清单模板 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 立项企业 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `project_type_id` | `project_type_id` | `projectTypeId` | 项目类型 |
| `submitter_id` | `submitter_id` | `submitterId` | 提交人 |
| `supplier_suggest_id` | `supplier_suggest_id` | `supplierSuggestId` | 推荐供应商 |
| `transi_type_id` | `transi_type_id` | `transiTypeId` | 交易类型 |
| `wbs` | `wbs` | `wbs` | WBS |
| `wbs_template_item_id` | `wbs_template_item_id` | `wbsTemplateItemId` | 计划模板明细id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `compile_date` | `compile_date` | `compileDate` | 编制日期 |
| `demand_time` | `demand_time` | `demandTime` | 需求时间 |

### 日期时间 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `cancel_time` | `cancel_time` | `cancelTime` | 撤回时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |

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

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `WbsTemplateMaterialItemList` | 项目物资模板明细 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristic` | `define_characteristic` | `defineCharacteristic` | 自定义项属性 |

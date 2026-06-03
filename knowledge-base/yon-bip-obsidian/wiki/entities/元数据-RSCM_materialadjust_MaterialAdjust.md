---
tags: [BIP, 元数据, 数据字典, RSCM.materialadjust.MaterialAdjust]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目物资变更 (`RSCM.materialadjust.MaterialAdjust`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rscm_material_adjust` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`ff1278ee-29d0-4c6e-adfb-ca2c819c4679`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目物资变更 |
| 物理表 | `rscm_material_adjust` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `RSCM` |
| 直连字段 | 55 个 |
| 子表 | 1 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `MaterialAdjustItemList` | `RSCM.materialadjust.MaterialAdjustItem` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `adjust_department` | `ucf-org-center.org_unit_tree_ref` |
| `compiler_id` | `bd_staff_all_ref` |
| `define_characteristic` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `adjuster_id` | `ucf-staff-center.bd_staff_all_ref` |
| `designated_contract_id` | `yonbip-ec-contract.RefTable_bf5ca95c96` |
| `supplier_suggest_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `transi_type_id` | `ucfbasedoc.bd_billtyperef` |
| `` | `` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `activity_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `project_type_id` | `ucfbasedoc.bd_billtyperef` |
| `compiler_department_id` | `ucf-org-center.org_unit_tree_ref` |
| `purchaset_execution_id` | `` |
| `wbs_id` | `yonbip-pm-commonbd.RefTable_1906842236` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `contract_journal_id` | `yonbip-ec-contract.RefTable_bf5ca95c96` |

## 继承接口 (4个, 11字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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

> 共 55 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_context` | `adjust_context` | `adjustContext` | 变更内容 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `bill_type_code` | `bill_type_code` | `billTypeCode` | 单据类型编码 |
| `code` | `code` | `code` | 单据编码 |
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 单据名称 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `purchaset_contract_id` | `purchaset_contract_id` | `purchasetContractId` | 采购合同 |
| `source_id` | `source_id` | `sourceId` | 来源 |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `transi_type_code` | `transi_type_code` | `transiTypeCode` | 交易类型编码 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_id` | `activity_id` | `activityId` | 活动 |
| `adjust_department` | `adjust_department` | `adjustDepartment` | 变更部门 |
| `adjuster_id` | `adjuster_id` | `adjusterId` | 变更人 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `compiler_department_id` | `compiler_department_id` | `compilerDepartmentId` | 编制部门 |
| `compiler_id` | `compiler_id` | `compilerId` | 编制人 |
| `contract_journal_id` | `contract_journal_id` | `contractJournalId` | 合同台帐 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `designated_contract_id` | `designated_contract_id` | `designatedContractId` | 指定合同Id |
| `fin_org_id` | `fin_org_id` | `finOrgId` | 会计主体 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 立项企业 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `project_type_id` | `project_type_id` | `projectTypeId` | 项目类型 |
| `purchaset_execution_id` | `purchaset_execution_id` | `purchasetExecutionId` | 采购执行id |
| `supplier_suggest_id` | `supplier_suggest_id` | `supplierSuggestId` | 推荐供应商 |
| `transi_type_id` | `transi_type_id` | `transiTypeId` | 交易类型 |
| `wbs_id` | `wbs_id` | `wbsId` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `compile_date` | `compile_date` | `compileDate` | 编制日期 |

### 日期时间 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_date` | `adjust_date` | `adjustDate` | 变更日期 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `demand_time` | `demand_time` | `demandTime` | 需求时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_basis` | `adjust_basis` | `adjustBasis` | 变更依据 |
| `adjust_type` | `adjust_type` | `adjustType` | 变更类型 |
| `auto_pull` | `auto_pull` | `autoPullProcure` | 是否自动推采购任务 |
| `dimension` | `dimension` | `dimension` | 编制维度 |
| `single_source` | `single_source` | `singleSource` | 单一来源 |
| `status` | `status` | `status` | 单据状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isWfControlled` | `isWfControlled` | `isWfControlled` | 是否受审批流控制 |
| `version` | `version` | `version` | 版本 |

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
| `` | `` | `MaterialAdjustItemList` | 物资变更明细 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristic` | `define_characteristic` | `defineCharacteristic` | 自定义项特征 |

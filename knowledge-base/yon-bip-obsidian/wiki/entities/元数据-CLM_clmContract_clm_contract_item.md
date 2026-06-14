---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clm_contract_item]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同标的物 (`CLM.clmContract.clm_contract_item`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_item` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`fc155a0a-e12b-41cd-bc03-5a1b7af2ae3a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同标的物 |
| 物理表 | `clm_contract_item` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 直连字段 | 46 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `material_class_id` | `productcenter.pc_managementclassref` |
| `activity` | `` |
| `materialIdFreeCT` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `taxrate` | `ucfbasedoc.bd_taxrate` |
| `feature` | `` |
| `clm_contract_id` | `yonbip-ec-contract.clmContractRef1` |
| `unit_id` | `productcenter.pc_unitref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (6个, 21字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
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
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity` | `activity` | `activity` | 活动 |
| `clm_contract_id` | `clm_contract_id` | `contractId` | 合同信息 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `material_class_id` | `material_class_id` | `materialClassId` | 物料分类 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `project_id` | `project_id` | `projectId` | 关联项目 |
| `taxrate` | `taxrate` | `taxRate` | 税率 |
| `unit_id` | `unit_id` | `unitId` | 单位 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `plandeliv_date` | `plandeliv_date` | `plandelivDate` | 计划收发货日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `row_num` | `row_num` | `rowNum` | 行号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mny` | `mny` | `mny` | 本币无税金额 |
| `num` | `num` | `num` | 数量 |
| `ori_mny` | `ori_mny` | `oriMny` | 原币无税金额 |
| `ori_price` | `ori_price` | `oriPrice` | 原币无税单价 |
| `ori_tax` | `ori_tax` | `oriTax` | 原币税额 |
| `ori_tax_mny` | `ori_tax_mny` | `oriTaxMny` | 原币含税金额 |
| `ori_tax_price` | `ori_tax_price` | `oriTaxPrice` | 原币含税单价 |
| `price` | `price` | `price` | 本币无税单价 |
| `tax` | `tax` | `tax` | 本币税额 |
| `taxmny` | `taxmny` | `taxmny` | 本币含税金额 |
| `taxprice` | `taxprice` | `taxprice` | 本币含税单价 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feature` | `feature` | `feature` | 合同明细表特征 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `materialIdFreeCT` | `materialIdFreeCT` | `materialIdFreeCT` | 物料自由项特征组 |

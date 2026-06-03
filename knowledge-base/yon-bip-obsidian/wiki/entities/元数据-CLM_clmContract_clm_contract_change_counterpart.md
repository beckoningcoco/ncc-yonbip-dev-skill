---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clm_contract_change_counterpart]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同变更相对方 (`CLM.clmContract.clm_contract_change_counterpart`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_change_counterpart` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`18dc7fea-15f6-41e0-9ab9-b14c3e510b5f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更相对方 |
| 物理表 | `clm_contract_change_counterpart` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `change_feature` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `supplier_id` | `yssupplier.aa_vendorSimpleRef` |
| `clm_contract_change_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `customer_id` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `clm_counterpart_id` | `` |

## 继承接口 (5个, 19字段)

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
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clm_contract_id` | `clm_contract_id` | `contractId` | 合同信息 |
| `feature` | `feature` | `feature` | 原合同特征 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `sign_area_mapping_tag` | `sign_area_mapping_tag` | `signAreaMappingTag` | 签署区映射标志 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clm_contract_change_id` | `clm_contract_change_id` | `clmContractChangeId` | 合同变更 |
| `clm_counterpart_id` | `clm_counterpart_id` | `clmCounterpartId` | 相对方档案 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_type` | `merchant_type` | `merchantType` | 客商类型 |
| `participant` | `participant` | `participant` | 参与方 |
| `is_main_counterpart` | `is_main_counterpart` | `isMainCounterpart` | 是否主相对方 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tb_filter_type` | `tb_filter_type` | `tbFilterType` | 表过滤类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_sort` | `sign_sort` | `signSort` | 签署顺序 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_feature` | `change_feature` | `changeFeature` |  变更自定义项 |

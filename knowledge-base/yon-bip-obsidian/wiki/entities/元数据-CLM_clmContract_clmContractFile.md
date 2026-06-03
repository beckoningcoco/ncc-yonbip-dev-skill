---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractFile]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 文本对象 (`CLM.clmContract.clmContractFile`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contractfile` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`90e8f765-9e16-49e4-8e6a-bda0de99e9a6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文本对象 |
| 物理表 | `clm_contractfile` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clmContractFileDetailList` | `CLM.clmContract.clmContractFileDetail` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `contract_type` | `iuap-apcom-contract.contractTypeTreeRef` |
| `bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `contractfile_config_id` | `` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `tran_type` | `transtype.bd_billtyperef` |

## 继承接口 (4个, 7字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **主组织** (`iuap.busiObj.OrgItf`)
  - `org_id` → `org_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billid` | `billid` | `billid` | 单据id |
| `business_Object` | `business_Object` | `businessObject` | 业务对象(系统) |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `contract_type` | `contract_type` | `contractType` | 合同类型 |
| `contractfile_config_id` | `contractfile_config_id` | `contractfileConfigId` | 合同文件配置id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `tran_type` | `tran_type` | `tranType` | 交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_type` | `create_type` | `createType` | 创建方式 |
| `status` | `status` | `status` | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clmContractFileDetailList` | 合同文本对象明细 |

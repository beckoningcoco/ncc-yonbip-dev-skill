---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clm_contract_status_flow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同状态流水 (`CLM.clmContract.clm_contract_status_flow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_status_flow` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`fc155a0a-e12b-41cd-bc03-5a1b7af2ae3a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同状态流水 |
| 物理表 | `clm_contract_status_flow` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `CLM` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `clm_contract_id` | `yonbip-ec-contract.RefTable_59a857a034` |
| `ytenant_id` | `` |
| `operator` | `bip-usercenter.bip_user_ref` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cause` | `cause` | `cause` | 原因 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clm_contract_id` | `clm_contract_id` | `contractId` | 合同信息 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `operator` | `operator` | `operator` | 操作人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `operate_date` | `operate_date` | `operateTime` | 操作时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `operation` | `operation` | `operation` | 操作 |
| `sign_process_status` | `sign_process_status` | `signProcessStatus` | 签署流程状态 |
| `status` | `status` | `status` | 合同状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_process_order` | `sign_process_order` | `signProcessOrder` | 签署流程顺序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

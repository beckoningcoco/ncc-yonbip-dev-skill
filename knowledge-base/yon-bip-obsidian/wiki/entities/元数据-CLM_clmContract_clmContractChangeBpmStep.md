---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractChangeBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同变更审批业务阶段 (`CLM.clmContract.clmContractChangeBpmStep`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`clm_contract_change_bpm_step` | domain：`yonbip-ec-contract` | 应用：`CLM` | 业务对象ID：`18dc7fea-15f6-41e0-9ab9-b14c3e510b5f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更审批业务阶段 |
| 物理表 | `clm_contract_change_bpm_step` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `clmContractChange_id` | `yonbip-ec-contract.ClmContractChangeRef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `stepid` | `transtype.bd_businessstep_ref` |
| `ytenant_id` | `` |

## 继承接口 (4个, 12字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务活动YPD** (`iuap.busiObj.IYpdBpmStep`)
  - `flag` → `flag`
  - `processinstid` → `processinstid`
  - `stepid` → `stepid`
  - `stepcode_lastmodify` → `stepcode_lastmodify`
  - `stepparam` → `stepparam`
  - `taskid` → `taskid`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `flag` | `flag` | `flag` | 状态标志位 |
| `id` | `id` | `id` | 主键 |
| `processinstid` | `processinstid` | `processinstId` | 流程实例 |
| `stepparam` | `stepparam` | `stepparam` | 业务阶段参数 |
| `taskid` | `taskid` | `taskId` | 任务ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clmContractChange_id` | `clmContractChange_id` | `clmContractChange_id` | 合同变更 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `stepid` | `stepid` | `stepId` | 业务阶段ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stepcode_lastmodify` | `stepcode_lastmodify` | `stepLastModify` | 业务阶段编码最后修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付结算清单业务阶段信息 (`earap.payable.PayableBpmStep`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payable_b_bpmstep` | domain：`yonbip-ec-contract` | 应用：`STB` | 业务对象ID：`d610a7e5-78db-461c-a39c-57d3d42a26b8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付结算清单业务阶段信息 |
| 物理表 | `ap_payable_b_bpmstep` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `STB` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `stepid` | `transtype.bd_businessstep_ref` |
| `ytenant_id` | `` |
| `header_id` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **业务活动YPD** (`iuap.busiObj.IYpdBpmStep`)
  - `flag` → `flag`
  - `processinstid` → `processinstid`
  - `stepid` → `stepid`
  - `stepcode_lastmodify` → `stepcode_lastmodify`
  - `stepparam` → `stepparam`
  - `taskid` → `taskid`

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
| `header_id` | `header_id` | `headerId` | 应付结算清单基本信息ID |
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

---
tags: [BIP, 元数据, 数据字典, earap.payment.PaymentBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款单业务阶段信息 (`earap.payment.PaymentBpmStep`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payment_b_bpmstep` | domain：`yonbip-fi-earapbill` | 应用：`EAP` | 业务对象ID：`548e9989-20b1-473c-ba02-9284b575a695`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款单业务阶段信息 |
| 物理表 | `ap_payment_b_bpmstep` |
| 数据库 schema | `yonbip-fi-earapbill` |
| 所属应用 | `EAP` |
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

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

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
| `creator` | `creator` | `creator` | 创建人 |
| `header_id` | `header_id` | `headerId` | 付款单基本信息 |
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

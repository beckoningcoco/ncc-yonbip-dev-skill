---
tags: [BIP, 元数据, 数据字典, earap.apparam.PayableParamQuickType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付汇兑损益参数,款项类型不计算汇兑损益设置 (`earap.apparam.PayableParamQuickType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_param_quicktype` | domain：`yonbip-fi-earapbill` | 应用：`EAP` | 业务对象ID：`07aeeeb4-1ec8-4533-afcd-d781044f2bd4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付汇兑损益参数,款项类型不计算汇兑损益设置 |
| 物理表 | `ap_param_quicktype` |
| domain/服务域 | `yonbip-fi-earapbill` |
| schema | `fiearapbill` |
| 所属应用 | `EAP` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `mainid` | `finbd.bd_paymenttyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `fkid` | `` |

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

> 共 10 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `fkid` | `fkid` | `fkid` | 外键 |
| `mainid` | `mainid` | `gainLossUncalcQuickType` | 汇兑损益参数,款项类型不计算汇兑损益设置 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

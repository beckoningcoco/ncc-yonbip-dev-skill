---
tags: [BIP, 元数据, 数据字典, GL.GL.glExchangeGainsOrLossesDefine]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇兑损益定义 (`GL.GL.glExchangeGainsOrLossesDefine`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_exchange_gains_losses_rule_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`1cf5bef3-2a80-4694-96d9-12d66322d6a1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇兑损益定义 |
| 物理表 | `fi_exchange_gains_losses_rule_tb` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `pk_org` | `finbd.bd_allaccbodyref_inner` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accsubject_chart` | `fiepub.epub_accsubjectchartref` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 定义编号 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 名称 |
| `rate_collect` | `rate_collect` | `rateCollect` | 汇率采集 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject_chart` | `accsubject_chart` | `accsubjectChart` | 科目表 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `pk_org` | `pk_org` | `pkOrg` | 会计主体 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_verify` | `bln_verify` | `blnVerify` | 科目核销引用类型 |

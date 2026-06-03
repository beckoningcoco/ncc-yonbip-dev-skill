---
tags: [BIP, 元数据, 数据字典, st.salesout.SalesOutsSN]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售出库单序列号 (`st.salesout.SalesOutsSN`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_salesouts_sn` | domain：`ustock` | 应用：`ST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售出库单序列号 |
| 物理表 | `st_salesouts_sn` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 46 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `iProductSkuid` | `` |
| `ytenant_id` | `` |
| `salesouts_sn_character` | `` |
| `iDetailId` | `` |
| `iGrandpaId` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 38字段)

- **序列号** (`sn.serialnumber.ISN`)
  - `cMakeBillSign` → `cMakeBillSign`
  - `creSNstate` → `creSNstate`
  - `csn_code` → `csn_code`
  - `cSNstate` → `cSNstate`
  - `iSourceBillSNId` → `iSourceBillSNId`
  - `iUpdateCount` → `iUpdateCount`
- **固定自定义项（序列号）** (`base.itf.UserdefItemSerial`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (35个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `define1` | String | 自定义项1 |
| `lineno` | `lineno` | String | 物料行号 |
| `` | `define10` | String | 自定义项10 |
| `` | `define11` | String | 自定义项11 |
| `` | `define12` | String | 自定义项12 |
| `` | `define13` | String | 自定义项13 |
| `` | `define14` | String | 自定义项14 |
| `` | `define15` | String | 自定义项15 |
| `` | `define16` | String | 自定义项16 |
| `` | `define17` | String | 自定义项17 |
| `` | `define18` | String | 自定义项18 |
| `` | `define19` | String | 自定义项19 |
| `` | `define2` | String | 自定义项2 |
| `` | `define20` | String | 自定义项20 |
| `` | `define21` | String | 自定义项21 |
| `` | `define22` | String | 自定义项22 |
| `` | `define23` | String | 自定义项23 |
| `` | `define24` | String | 自定义项24 |
| `` | `define25` | String | 自定义项25 |
| `` | `define26` | String | 自定义项26 |
| `` | `define27` | String | 自定义项27 |
| `` | `define28` | String | 自定义项28 |
| `` | `define29` | String | 自定义项29 |
| `` | `define3` | String | 自定义项3 |
| `` | `define30` | String | 自定义项30 |
| `` | `define4` | String | 自定义项4 |
| `` | `define5` | String | 自定义项5 |
| `` | `define6` | String | 自定义项6 |
| `` | `define7` | String | 自定义项7 |
| `` | `define8` | String | 自定义项8 |
| `` | `define9` | String | 自定义项9 |
| `cMakeBillSign` | `cMakeBillSign` | String | 生单标识 |
| `creSNstate` | `creSNstate` | String | 序列号上一状态 |
| `cSNstate` | `cSNstate` | String | 序列号状态 |
| `csn_code` | `csn_code` | String | 序列号 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `iProductSkuid` | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | SKU编码 |
| `iGrandpaId` | `iGrandpaId` | 09b66409-4f08-4dc6-957b-3d5ac15e1ea8 | 主表id |
| `iDetailId` | `iDetailId` | 9d6edef7-90a4-419a-b3a6-058b118270e0 | 子表id |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `rowno` | `rowno` | Integer | 序号 |
| `iUpdateCount` | `iUpdateCount` | Integer | 序列号更新次数 |

### 长整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `iSourceBillSNId` | `iSourceBillSNId` | Long | 来源序列号行id |
| `id` | `id` | Long | ID |

### FreeCT (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `salesouts_sn_character` | `salesouts_sn_character` | dd9b11e6-cfa3-42a1-b8fb-3400f5a64b02 | 序列号自由项特征组 |

### timestamp (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |

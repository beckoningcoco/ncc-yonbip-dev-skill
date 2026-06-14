---
tags: [BIP, 元数据, 数据字典, fa.faaddition.AdditionAccessoryDevice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 新增单附属设备 (`fa.faaddition.AdditionAccessoryDevice`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_add_device` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`26f6782d-c405-466f-8424-c393cad9c921`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 新增单附属设备 |
| 物理表 | `fa_bill_add_device` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `addition_bill_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `measuring_unit_id` | `productcenter.pc_unitref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_date` | `change_date` | `changeDate` | 变动日期 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `model` | `model` | `model` | 规格型号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `usage_state` | `usage_state` | `usageState` | 使用情况 |
| `usage_date` | `usage_date` | `useDate` | 使用日期 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addition_bill_id` | `addition_bill_id` | `additionBillId` | 主表ID |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `measuring_unit_id` | `measuring_unit_id` | `measuringUnitId` | 计量单位 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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
| `quantity` | `quantity` | `quantity` | 数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `value` | `value` | `value` | 价值 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

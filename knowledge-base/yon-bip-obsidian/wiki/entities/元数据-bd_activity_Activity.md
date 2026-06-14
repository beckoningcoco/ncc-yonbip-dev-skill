---
tags: [BIP, 元数据, 数据字典, bd.activity.Activity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资源 (`bd.activity.Activity`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_activity` | domain：`finbd` | 应用：`GZTBDM` | 业务对象ID：`b5cd6ff9-52ca-4ad6-9de9-0fea6ba37ab2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资源 |
| 物理表 | `bd_activity` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 31 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity_character` | `` |
| `unit` | `` |
| `ytenant_id` | `` |
| `num_unit` | `` |
| `org_unit` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 11字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 资源编码 |
| `declare_occasion` | `declare_occasion` | String | 申报时机 |
| `del_log` | `del_log` | String | 删除提示信息 |
| `erp_code` | `erp_code` | String | NCC数据ID |
| `task_id` | `task_id` | String | 任务id(引用校验检查) |
| `` | `creator` | String | 创建人名称 |
| `` | `modifier` | String | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `num_unit` | `num_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 数量单位 |
| `org_unit` | `org_unit` | 14302233-1394-4a70-94e1-bed51636f312 | 组织单元 |
| `unit` | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 计量单位 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cal_cost` | `cal_cost` | Boolean | 计算成本 |

### 整数 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `activity_class` | `activity_class` | Integer | 资源类别 |
| `activity_status` | `activity_status` | Integer | 资源状态 |
| `measure_base` | `measure_base` | Integer | 计量基础 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `del_status` | `del_status` | Short | 删除操作状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | 主键 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `conversion_factor` | `conversion_factor` | Decimal | 折标系数 |
| `num` | `num` | Decimal | 数量 |
| `price_multiple` | `price_multiple` | Decimal | 价格倍数 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `activity_character` | `activity_character` | 46812a7a-4dbb-42fa-8f1c-8db9f05ba201 | 资源特征属性 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 资源名称 |
| `remark` | `remark` | String | 备注 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

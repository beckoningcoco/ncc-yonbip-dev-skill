---
tags: [BIP, 元数据, 数据字典, bd.costcollect.CostCollectorItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本收集器 (`bd.costcollect.CostCollectorItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_cost_collector_item` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：`6edbd0df-d555-411f-8793-90d87ed6a935`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本收集器 |
| 物理表 | `bd_cost_collector_item` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 31 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `cost_class` | `` |
| `free_ch_id` | `` |
| `product` | `` |
| `cc_setter_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `mat_ch_id` | `` |
| `department` | `` |
| `accentity` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 13字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 编码 |
| `` | `creator` | String | 创建人名称 |
| `del_log` | `del_log` | String | 删除提示信息 |
| `id` | `id` | String | ID |
| `` | `modifier` | String | 修改人名称 |
| `muster_fields_info` | `muster_fields_info` | String | 维度信息 |
| `muster_fields_names` | `muster_fields_names` | String | 维度  |
| `remark` | `remark` | String | 备注 |
| `task_id` | `task_id` | String | 任务id(引用校验检查) |

### 引用字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accentity` | `accentity` | 14302233-1394-4a70-94e1-bed51636f312 | 业务单元 |
| `cost_class` | `cost_class` | 80e9c421-f9e9-4752-b1e9-7c240cb2fc1f | 成本中心 |
| `cc_setter_id` | `cc_setter_id` | fb5608d6-28fc-4d29-928a-aeea2c414d14 | 成本收集器设置 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `department` | `department` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 部门 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `product` | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 产品 |
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
| `enable` | `enable` | Boolean | 启用 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `del_status` | `del_status` | Short | 删除操作状态 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `sortno` | `sortno` | Decimal | 排序 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `free_ch_id` | `free_ch_id` | 913cf218-324c-4f93-909b-494183de91c6 | 成本收集器自定义特征 |

### timestamp (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `disablets` | `disablets` | DateTime | 停用时间 |
| `enablets` | `enablets` | DateTime | 启用时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### FreeCT (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `mat_ch_id` | `mat_ch_id` | d6727f32-be99-4016-9a6d-39d33a1fe44c | 成本收集器物料特征组 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |

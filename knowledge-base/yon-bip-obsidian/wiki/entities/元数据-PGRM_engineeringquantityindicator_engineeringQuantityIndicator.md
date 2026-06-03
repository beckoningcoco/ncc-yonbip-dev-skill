---
tags: [BIP, 元数据, 数据字典, PGRM.engineeringquantityindicator.engineeringQuantityIndicator]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工程量指标 (`PGRM.engineeringquantityindicator.engineeringQuantityIndicator`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_eng_quantity_indicator` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`9c51cab6-10d6-458b-858c-d68e681be481`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工程量指标 |
| 物理表 | `pgrm_eng_quantity_indicator` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `unit_id` | `productcenter.pc_unitref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `metric_categorizer_id` | `yonbip-pm-projectme.pgrm_metric_categorizer_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `bill_form_id` | `ucfbasedoc.bd_billtypetreeref` |
| `ytenant_id` | `` |

## 继承接口 (6个, 16字段)

- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `remark` | `remark` | `remark` | 备注 |
| `name` | `name` | `name` | 名称 |
| `id` | `id` | `id` | 主键 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_form_id` | `bill_form_id` | `billForm` | 业务单据 |
| `metric_categorizer_id` | `metric_categorizer_id` | `metricCategorizer` | 指标分类 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `unit_id` | `unit_id` | `unit` | 计量单位 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `eschedule_update_method` | `eschedule_update_method` | `scheduleUpdateMethod` | 进度更新方式 |
| `enable` | `enable` | `enable` | 档案状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
| `ifend` | `ifend` | `isEnd` | 是否末级 |

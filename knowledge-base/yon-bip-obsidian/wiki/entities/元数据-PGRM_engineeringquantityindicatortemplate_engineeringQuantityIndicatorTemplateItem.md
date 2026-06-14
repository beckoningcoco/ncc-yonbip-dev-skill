---
tags: [BIP, 元数据, 数据字典, PGRM.engineeringquantityindicatortemplate.engineeringQuantityIndicatorTemplateItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工程量指标模板明细 (`PGRM.engineeringquantityindicatortemplate.engineeringQuantityIndicatorTemplateItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_eng_quantity_indicator_tpl_item` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`8f2403a8-a794-439f-9501-2d6be9a58b52`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工程量指标模板明细 |
| 物理表 | `pgrm_eng_quantity_indicator_tpl_item` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PGRM` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `engineering_quantity_indicator_id` | `yonbip-pm-projectme.pgrm_engineering_quantity_indicator_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `engineering_quantity_indicator_template_id` | `yonbip-pm-projectme.pgrm_engineering_quantity_template_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `engineering_indicator_item_define_character` | `` |
| `ytenant_id` | `` |

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

> 共 13 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `engineering_quantity_indicator_id` | `engineering_quantity_indicator_id` | `engineeringQuantityIndicatorId` | 工程量指标 |
| `engineering_quantity_indicator_template_id` | `engineering_quantity_indicator_template_id` | `engineeringQuantityIndicatorTemplateId` | 工程量指标模板 |
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

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `weight` | `weight` | `weight` | 权重 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `engineering_indicator_item_define_character` | `engineering_indicator_item_define_character` | `engineeringIndicatorItemDefineCharacter` | 自定义项目特征 |

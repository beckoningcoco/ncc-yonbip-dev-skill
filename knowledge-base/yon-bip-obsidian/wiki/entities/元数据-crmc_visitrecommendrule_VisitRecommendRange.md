---
tags: [BIP, 元数据, 数据字典, crmc.visitrecommendrule.VisitRecommendRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访推荐范围 (`crmc.visitrecommendrule.VisitRecommendRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_recommend_range` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访推荐范围 |
| 物理表 | `crmc_visit_recommend_range` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `field_doc_id` | `yycrm.crmc_visitfielddocref` |
| `rule_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field_code` | `field_code` | `fieldCode` | 字段编码 |
| `operator` | `operator` | `operator` | 比较符 |
| `field_value1` | `field_value1` | `fieldValue1` | 字段值1 |
| `field_value2` | `field_value2` | `fieldValue2` | 字段值2 |
| `value_name` | `value_name` | `valueName` | 字段值 |
| `field_type` | `field_type` | `fieldType` | 字段类型 |
| `refer_type` | `refer_type` | `referType` | 参照类型 |
| `refer_ret_id` | `refer_ret_id` | `referRetId` | 参照返回信息 |
| `refer_return` | `refer_return` | `referReturn` | 参照返回值 |
| `enum_type` | `enum_type` | `enumType` | 枚举类型 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `rule_id` | `rule_id` | `ruleId` | 推荐规则ID |
| `field_doc_id` | `field_doc_id` | `fieldDocId` | 字段档案ID |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

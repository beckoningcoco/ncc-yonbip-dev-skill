---
tags: [BIP, 元数据, 数据字典, bd.waitem.WaItemVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资项目 (`bd.waitem.WaItemVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`wa_item` | domain：`ucfbasedoc` | 应用：`DPMPRJ` | 业务对象ID：`0b37783f-f766-4c8e-9567-63ccca4049a2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 薪资项目 |
| 物理表 | `wa_item` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPRJ` |
| 直连字段 | 47 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (34个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `approve_flag` | `approve_flag` | String | 审批标识 |
| `base_day_type` | `base_day_type` | String | 日薪计算基准天数 |
| `busiorg` | `busiorg` | String | 所属组织 |
| `categoryid` | `categoryid` | String | 项目分类 |
| `clear_flag` | `clear_flag` | String | 清除标识 |
| `code` | `code` | String | 编码 |
| `creator` | `creator` | String | 创建人 |
| `data_type` | `data_type` | String | 数据类型 |
| `dbcode` | `dbcode` | String | 数据库对应字段表 |
| `formula` | `formula` | String | 公式 |
| `formulastr` | `formulastr` | String | 显示公式 |
| `from_flag` | `from_flag` | String | 来源 |
| `id` | `id` | String | 主键 |
| `isinhi` | `isinhi` | String | isinhi |
| `memo` | `memo` | String | 项目说明 |
| `modifier` | `modifier` | String | 修改人 |
| `name` | `name` | String | 名称 |
| `name2` | `name2` | String | 名称 |
| `name3` | `name3` | String | 名称 |
| `name4` | `name4` | String | 名称 |
| `name5` | `name5` | String | 名称 |
| `name6` | `name6` | String | 名称 |
| `payslip_flag` | `payslip_flag` | String | payslip_flag |
| `property` | `property` | String | 属性 |
| `round_type` | `round_type` | String | 进位方式 |
| `salary_rule` | `salary_rule` | String | 调薪规则 |
| `segment_day` | `segment_day` | String | 分段调薪天数取值 |
| `share_type` | `share_type` | String | 共享类型 |
| `tax_flag` | `tax_flag` | String | 纳税标识 |
| `tax_flag2` | `tax_flag2` | String | 纳税标识2 |
| `tax_flag3` | `tax_flag3` | String | 纳税标识3 |
| `tenantid` | `tenantid` | String | 租户废弃 |
| `tenantid` | `tenantid` | String | 租户标识 |
| `user_def_flag` | `user_def_flag` | String | 用户自定义标志 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 整数 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `computeseq` | `computeseq` | Integer | 计算顺序 |
| `enable` | `enable` | Integer | 状态 |
| `fld_decimal` | `fld_decimal` | Integer | 小数位数 |
| `fld_width` | `fld_width` | Integer | 数据长度 |
| `show_order` | `show_order` | Integer | 显示顺序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除标记 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `base_day` | `base_day` | Decimal | 基准天数 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cName` | `cName` | String | 新名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creationtime` | `creationtime` | DateTime | 创建时间 |
| `modifiedtime` | `modifiedtime` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `ts` | `ts` | DateTime | 时间戳 |

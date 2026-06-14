---
tags: [BIP, 元数据, 数据字典, crmc.highseas.HighSeasTemplateSet]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公海池列表显示设置 (`crmc.highseas.HighSeasTemplateSet`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_high_seas_template_set` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公海池列表显示设置 |
| 物理表 | `crmc_high_seas_template_set` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `seas_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `person_id` | `` |

## 继承接口 (2个, 9字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `c_caption` | `c_caption` | `cCaption` | 名称 |
| `c_caption_resid` | `c_caption_resid` | `cCaptionResid` | 名称多语 |
| `c_field_name` | `c_field_name` | `cFieldName` | 数据库列名 |
| `c_field_type` | `c_field_type` | `cFieldType` | 字段类型 区分普通|自定义项|特征字段 |
| `c_name` | `c_name` | `cItemName` | 字段名称 |
| `c_show_caption` | `c_show_caption` | `cShowCaption` | 显示名称 |
| `c_show_caption_resid` | `c_show_caption_resid` | `cShowCaptionResid` | 显示名称多语 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `voucher_type` | `voucher_type` | `voucherType` | 单据类型 线索: clue|商机:oppt|客户:customer |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `person_id` | `person_id` | `personId` | 人员id |
| `seas_id` | `seas_id` | `seasId` | 公海id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `b_show_it` | `b_show_it` | `bShowIt` | 是否显示 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `i_order` | `i_order` | `iOrder` | 排序 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `i_template_type` | `i_template_type` | `iTemplateType` | 模板类型 0:pc端|1:移动端 默认0 |
| `is_user_template` | `is_user_template` | `isUserTemplate` | 是否用户级模板 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

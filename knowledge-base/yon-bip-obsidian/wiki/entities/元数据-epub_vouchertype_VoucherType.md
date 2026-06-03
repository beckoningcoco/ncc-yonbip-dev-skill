---
tags: [BIP, 元数据, 数据字典, epub.vouchertype.VoucherType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 凭证类型 (`epub.vouchertype.VoucherType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_vouchertype` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`a84cd4f8-ea81-4fe6-b088-f1962948dfc4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 凭证类型 |
| 物理表 | `epub_vouchertype` |
| 数据库 schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 33 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `character` | `` |
| `ytenant_id` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `accentity` | `finbd.bd_allaccbodyref` |
| `tenant_id` | `` |

## 继承接口 (5个, 15字段)

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
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | ID |
| `code` | `code` | String | 编码 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `controltype` | `controltype` | String | 控制类型 |
| `cashcategory` | `cashcategory` | String | 限制科目 |
| `accbook` | `accbook` | String | 业务账簿id(老架构保留) |
| `creator` | `creator` | String | 创建人名称 |
| `modifier` | `modifier` | String | 修改人名称 |
| `objid` | `objid` | String | 友企连id |
| `srccoreid` | `srccoreid` | String | 社会化下发来源id |
| `sysid` | `sysid` | String | 来源主键 |
| `description` | `description` | String | 描述 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creatorId` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `modifierId` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `accentity` | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体id |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bsystem` | `bsystem` | Boolean | 是否预制 |
| `bisgl` | `bisgl` | Boolean | 总账 |
| `bisresp` | `bisresp` | Boolean | 责任会计 |
| `stopstatus` | `stopstatus` | Boolean | 状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |
| `sort` | `sort` | Integer | 排序 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |
| `voucherstr` | `voucherstr` | String | 凭证字 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `character` | `character` | 7b0a01a6-9e30-439d-84c3-d9f68b38e5c4 | 凭证类型特征属性 |

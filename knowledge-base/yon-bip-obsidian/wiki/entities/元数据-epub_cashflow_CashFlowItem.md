---
tags: [BIP, 元数据, 数据字典, epub.cashflow.CashFlowItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 现金流量项目 (`epub.cashflow.CashFlowItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_cashflowitem` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`306805af-26d2-4bcb-b725-a08123444456`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 现金流量项目 |
| 物理表 | `epub_cashflowitem` |
| 数据库 schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 40 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `cashflowtype` | `fiepub.fiepub_cashflowtyperef` |
| `parent_id` | `fiepub.fiepub_cashflowitemref` |
| `character` | `` |
| `cashflowtypesource` | `` |
| `ytenant_id` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `parentcashflowtype` | `` |
| `accentity` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 23字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 40 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creator` | `creator` | String | 创建人名称 |
| `def29` | `def29` | String | 自定义29 |
| `def30` | `def30` | String | 自定义30 |
| `levelcode` | `levelcode` | String | 层级编码 |
| `modifier` | `modifier` | String | 修改人名称 |
| `objid` | `objid` | String | 友企连id |
| `parentleaf` | `parentleaf` | String | 在父现金流量表中是否叶子节点 |
| `path` | `path` | String | 路径 |
| `srccoreid` | `srccoreid` | String | 社会化下发来源id |
| `srctype` | `srctype` | String | 派生类型来源id |
| `sysid` | `sysid` | String | 来源主键 |
| `id` | `id` | String | ID |
| `code` | `code` | String | 编码 |
| `direction` | `direction` | String | 方向属性 |
| `description` | `description` | String | 描述 |
| `internal_code` | `internal_code` | String | 内码 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creatorId` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `modifierId` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `cashflowtype` | `cashflowtype` | 3be4c758-4392-492a-8707-592ec2e5617f | 现金流量类型id |
| `parent_id` | `parent_id` | b109e775-1973-4764-95d6-5f6efd9f0070 | 上级项目id |
| `accentity` | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体 |
| `cashflowtypesource` | `cashflowtypesource` | 3be4c758-4392-492a-8707-592ec2e5617f | 现金流量类型来源 |
| `parentcashflowtype` | `parentcashflowtype` | 3be4c758-4392-492a-8707-592ec2e5617f | 父现金流量类型 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |
| `pubts` | `pubts` | Date | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `leaf` | `leaf` | Boolean | 是否末级(1是,0否) |
| `ismain` | `ismain` | Boolean | 主表/附表 |
| `bstrongctrl` | `bstrongctrl` | Boolean | 是否强管控 |

### 整数 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `level` | `level` | Integer | 层级 |
| `sort_num` | `sort_num` | Integer | 排序号 |
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |

### timestamp (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `createTime` | `createTime` | DateTime | 创建时间 |
| `modifyTime` | `modifyTime` | DateTime | 修改时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `character` | `character` | eb32ecaa-d6a9-472d-96fa-2c1a7e6151ca | 现金流量项目特征属性 |

---
tags: [BIP, 元数据, 数据字典, epub.sourceapplication.SourceApplication]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 来源应用列表 (`epub.sourceapplication.SourceApplication`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_source_application` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`7d4efebe-af1b-42a2-8c9f-8145332fa145`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 来源应用列表 |
| 物理表 | `epub_source_application` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 28 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |

## 继承接口 (3个, 13字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `category` | `category` | `domainCode` | 所属领域 |
| `src_app_id` | `src_app_id` | `mappingapplication` | 关联应用id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `category_name` | `category_name` | `categoryName` | 关联应用 |
| `category` | `category` | `category` | 所属领域 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `system` | `system` | `system` | 系统预置 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `frame_work` | `frame_work` | `frameWork` | 适用架构 |
| `sort_num` | `sort_num` | `sortnum` | 排序字段 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户编号 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `category_name` | `category_name` | `domainName` | 领域名称 |
| `mapping_application_domain` | `mapping_application_domain` | `mappingapplicationdomain` | 关联应用id |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

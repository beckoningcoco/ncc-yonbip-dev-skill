---
tags: [BIP, 元数据, 数据字典, pc.brand.Brand]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 品牌 (`pc.brand.Brand`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`brand` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`b34d16cc-4301-4b15-8101-00a4edc04a2d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品牌 |
| 物理表 | `brand` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 40 个 |
| 子表 | 3 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productTplBrands` | `pc.brand.ProductTplBrand` | composition |
| `brandUserDefines` | `pc.brand.BrandUserDefine` | composition |
| `defines` | `pc.brand.BrandDefine` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `brand_character_def` | `` |
| `brandClass` | `` |
| `tenant_id` | `` |

## 继承接口 (9个, 19字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **社会化核心企业档案** (`base.itf.ISociCoreArchive`)
  - `sociCoreArchive_id` → `sociCoreArchive_id`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 40 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `brand_logo_business_id` | `brand_logo_business_id` | `brandLogoBusinessId` | LOGO |
| `brand_logo` | `brand_logo` | `brandLogo` | 图片标识UP_image表中的image_id |
| `cfolder` | `cfolder` | `cfolder` | 图片目录 |
| `cimgname` | `cimgname` | `cimgname` | 图片文件名 |
| `code` | `code` | `code` | 编码 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `adImage_business_id` | `adImage_business_id` | `adImageBusinessId` | 广告图片 |
| `adImage` | `adImage` | `adImage` | 广告图片 |
| `coriginalname` | `coriginalname` | `coriginalname` | 图片原始文件名 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `rand_keywords` | `rand_keywords` | `brandKeywords` | 品牌别名(废弃) |
| `brand_name` | `brand_name` | `brandName` | 品牌名称(废弃) |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `brandClass` | `brandClass` | `brandClass` | 品牌分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ordernumber` | `ordernumber` | `ordernumber` | 排序号 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 品牌属性（自定义项）表（废弃） |
| `` | `` | `brandUserDefines` | 品牌自定义项 |
| `` | `` | `productTplBrands` | 品牌关联的物料模板 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `brand_name` | `brand_name` | `name` | 品牌名称 |
| `rand_keywords` | `rand_keywords` | `randKeywords` | 品牌别名 |
| `brand_url` | `brand_url` | `brandUrl` | 品牌网址 |
| `brand_desc` | `brand_desc` | `brandDesc` | 品牌介绍 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `brand_character_def` | `brand_character_def` | `brandCharacterDef` | 品牌特征自定义项 |

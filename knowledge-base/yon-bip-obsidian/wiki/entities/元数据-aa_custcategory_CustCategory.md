---
tags: [BIP, 元数据, 数据字典, aa.custcategory.CustCategory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户分类 (`aa.custcategory.CustCategory`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agentcategory` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：`9b48fe02-b024-43a7-b674-eea9d91949b9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户分类 |
| 物理表 | `agentcategory` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 45 个 |
| 子表 | 2 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `custCategoryDefines` | `aa.custcategory.CustCategoryDefine` | composition |
| `custCategoryApplyRanges` | `aa.custcategory.CustCategoryApplyRange` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `iParentId` | `productcenter.aa_custcategoryref` |
| `thirdLevelId` | `` |
| `ytenant_id` | `` |
| `fourthLevelId` | `` |
| `` | `` |
| `sixthLevelId` | `` |
| `firstLevelId` | `` |
| `eighthLevelId` | `` |
| `orgId` | `productcenter.aa_adminorgref` |
| `seventhLevelId` | `` |
| `secondLevelId` | `` |
| `org_group_id` | `` |
| `agentcategory_character` | `` |
| `fifthLevelId` | `` |
| `tenant_id` | `` |

## 继承接口 (7个, 20字段)

- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
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
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 45 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `cErpCode` | `cErpCode` | `erpCode` | 外部编码 |
| `cPath` | `cPath` | `path` | 路径 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 数据来源(废弃) |
| `` | `creator` | `creator` | 创建人 |
| `cCreatorName` | `cCreatorName` | `creatorName` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgId` | `orgId` | `orgId` | 管理组织 |
| `iParentId` | `iParentId` | `parent` | 上级分类 |
| `firstLevelId` | `firstLevelId` | `firstLevel` | 第一级分类 |
| `secondLevelId` | `secondLevelId` | `secondLevel` | 第二级分类 |
| `thirdLevelId` | `thirdLevelId` | `thirdLevel` | 第三级分类 |
| `fourthLevelId` | `fourthLevelId` | `fourthLevel` | 第四级分类 |
| `fifthLevelId` | `fifthLevelId` | `fifthLevel` | 第五级分类 |
| `sixthLevelId` | `sixthLevelId` | `sixthLevel` | 第六级分类 |
| `seventhLevelId` | `seventhLevelId` | `seventhLevel` | 第七级分类 |
| `eighthLevelId` | `eighthLevelId` | `eighthLevel` | 第八级分类 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 组织组 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
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
| `isEnabled` | `isEnabled` | `isEnabled` | 启用状态 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `order` | 排序 |
| `iDepth` | `iDepth` | `level` | 层级 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `iDeleted` | `iDeleted` | `iDeleted` | 删除状态 |
| `sort_num` | `sort_num` | `sort` | 排序(废弃) |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iShopID` | `iShopID` | `shop` | 商家 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |
| `cComment` | `cComment` | `comment` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agentcategory_character` | `agentcategory_character` | `custCategoryCharacter` | 客户分类表头自定义项 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCreatorType` | `iCreatorType` | `custType` | 创建者类型 |
| `logically_delete_type` | `logically_delete_type` | `logicallyDeleteType` | 逻辑删除类型 |
| `` | `` | `custCategoryApplyRanges` | 客户分类适用范围 |
| `` | `` | `custCategoryDefines` | 客户分类自定义项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

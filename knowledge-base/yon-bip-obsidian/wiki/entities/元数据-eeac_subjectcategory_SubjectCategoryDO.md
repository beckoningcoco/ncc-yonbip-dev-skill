---
tags: [BIP, 元数据, 数据字典, eeac.subjectcategory.SubjectCategoryDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目分类 (`eeac.subjectcategory.SubjectCategoryDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_subject_cat` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`ab370190-1090-4cb9-854f-6bd8fe4cf577`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目分类 |
| 物理表 | `epub_subject_cat` |
| domain/服务域 | `yonbip-fi-eeac` |
| schema | `fieeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 22 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `eeac.subjectcategory.SubjectCategoryInfluenceFactorDO` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `fi_service_id` | `yonbip-fi-eeac.eeac_fi_service_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accbook_type_id` | `fiepub.fiepub_accountbooktypelistref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 科目分类编码 |
| `id` | `id` | `id` | id |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sys_id` | `sys_id` | `sysId` | 关联0租户预置数据的id,取自本表的id |
| `using_status` | `using_status` | `usingStatus` | 对预置数据的使用控制,0:停用;1:启用 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbookId` | 账簿ID |
| `accbook_type_id` | `accbook_type_id` | `accbookTypeId` | 账簿类型ID |
| `accentity_id` | `accentity_id` | `accentityId` | 会计主体ID |
| `fi_service_id` | `fi_service_id` | `fiServiceId` | 财务服务ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_user_def` | `bln_user_def` | `blnUserDef` | 是否自定义 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 科目分类名称 |
| `remarks` | `remarks` | `remarks` | 备注 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 科目分类影响因素 |

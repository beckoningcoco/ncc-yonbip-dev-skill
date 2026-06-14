---
tags: [BIP, 元数据, 数据字典, pc.cls.ManagementClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料分类 (`pc.cls.ManagementClass`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_management_class` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`5ac274da-4507-488f-8fd4-84d896e14504`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料分类 |
| 物理表 | `product_management_class` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 48 个 |
| 子表 | 2 个 |
| 关联引用 | 21 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `managementClassApplyRanges` | `pc.cls.ManagementClassApplyRangeGroup` | composition |
| `managementClassDefines` | `pc.cls.ManagementClassDefine` | composition |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `expenseItem` | `finbd.bd_expenseitemref` |
| `tpl_id` | `productcenter.pc_producttplref` |
| `parent_id` | `productcenter.pc_managementclassref` |
| `oProductClass_id` | `productcenter.pc_presentationclassref` |
| `thirdLevelId` | `productcenter.pc_managementclassref` |
| `ytenant_id` | `` |
| `fourthLevelId` | `productcenter.pc_managementclassref` |
| `` | `` |
| `sixthLevelId` | `productcenter.pc_managementclassref` |
| `firstLevelId` | `productcenter.pc_managementclassref` |
| `eighthLevelId` | `productcenter.pc_managementclassref` |
| `orgId` | `productcenter.aa_adminorgref` |
| `management_class_character` | `` |
| `seventhLevelId` | `productcenter.pc_managementclassref` |
| `secondLevelId` | `productcenter.pc_managementclassref` |
| `org_group_id` | `` |
| `fifthLevelId` | `productcenter.pc_managementclassref` |
| `tenant_id` | `` |

## 继承接口 (4个, 13字段)

- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
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
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 48 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 分类编码 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `path` | `path` | `path` | 路径 |
| `cFullPath` | `cFullPath` | `fullPath` | 全路径 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgId` | `orgId` | `orgId` | 管理组织 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `tpl_id` | `tpl_id` | `template` | 物料模板 |
| `expenseItem` | `expenseItem` | `expenseItem` | 费用项目 |
| `firstLevelId` | `firstLevelId` | `firstLevel` | 第一级分类 |
| `secondLevelId` | `secondLevelId` | `secondLevel` | 第二级分类 |
| `thirdLevelId` | `thirdLevelId` | `thirdLevel` | 第三级分类 |
| `fourthLevelId` | `fourthLevelId` | `fourthLevel` | 第四级分类 |
| `fifthLevelId` | `fifthLevelId` | `fifthLevel` | 第五级分类 |
| `sixthLevelId` | `sixthLevelId` | `sixthLevel` | 第六级分类 |
| `seventhLevelId` | `seventhLevelId` | `seventhLevel` | 第七级分类 |
| `eighthLevelId` | `eighthLevelId` | `eighthLevel` | 第八级分类 |
| `oProductClass_id` | `oProductClass_id` | `productClass` | 管理分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 组织组 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `order` | 排序号 |
| `level` | `level` | `level` | 层级 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `sort_num` | `sort_num` | `sort` | 排序号(废弃) |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productCount` | `productCount` | `productCount` | 物料数量 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 分类名称 |
| `remark` | `remark` | `remark` | 备注 |

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
| `management_class_character` | `management_class_character` | `managementClassCharacter` | 物料分类自定义项 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `logically_delete_type` | `logically_delete_type` | `logicallyDeleteType` | 逻辑删除类型 |
| `` | `` | `managementClassApplyRanges` | 物料分类适用范围组 |
| `` | `` | `managementClassDefines` | 物料分类自定义项 |

---
tags: [BIP, 元数据, 数据字典, pc.userdef.UserDefineClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 自定义项 (`pc.userdef.UserDefineClass`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`userdef_base` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`1edc7f87-8ace-4d3c-b8a1-a36f02fb4fb6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义项 |
| 物理表 | `userdef_base` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 42 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `userdefines` | `pc.userdef.Userdefine` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 6字段)

- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **社会化核心企业档案** (`base.itf.ISociCoreArchive`)
  - `sociCoreArchive_id` → `sociCoreArchive_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `achive_code` | `achive_code` | `achiveCode` | 引用档案参照编码 |
| `achive_define_code` | `achive_define_code` | `achiveDefineCode` | 自定义档案参照编码 |
| `archive_define_name` | `archive_define_name` | `achiveDefineName` | 自定义引用档案名称 |
| `achive_domain` | `achive_domain` | `achiveDomain` | 来源域编码 |
| `achive_domain_name` | `achive_domain_name` | `achiveDomainName` | 来源域名称 |
| `achive_name` | `achive_name` | `achiveName` | 引用档案名称 |
| `achive_return` | `achive_return` | `achiveReturn` | 档案返回值 |
| `achive_return_caption` | `achive_return_caption` | `achiveReturnCaption` | 档案返回值名称 |
| `classId` | `classId` | `classId` | 分类ID |
| `defineId` | `defineId` | `defineId` | 编码 |
| `defineIdOther` | `defineIdOther` | `defineIdOther` | 编码2 |
| `erp_code` | `erp_code` | `erpCode` | 对应ERP中的规格字段名称 |
| `item` | `item` | `item` | 项目号 |
| `className` | `className` | `name` | 分类 |
| `showItem_resid` | `showItem_resid` | `showItemResid` | 属性名称资源编号 |
| `type` | `type` | `type` | 属性类型 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(旧) |

### 布尔字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |
| `isMultiSel` | `isMultiSel` | `isMultiSel` | 是否多选 |
| `isinput` | `isinput` | `isSerInput` | 管理端必输 |
| `isShowSpec` | `isShowSpec` | `isShowSpec` | 展示规格 |
| `sourcetype` | `sourcetype` | `sourcetype` | 属性来源 |
| `iswebinput` | `iswebinput` | `isWebInput` | 商城前端必输 |
| `iswebshow` | `iswebshow` | `isWebShow` | 前端显示 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iorder` | `iorder` | `iorder` | 系统顺序 |
| `propertyType` | `propertyType` | `propertyType` | 属性类型 |
| `length` | `length` | `length` | 属性长度 |
| `ordernum` | `ordernum` | `orderNum` | 排序 |
| `isEnabled` | `isEnabled` | `isEnabled` | 启用状态 |
| `userdef_mode` | `userdef_mode` | `userdefMode` | 录入方式 |
| `maxInputLen` | `maxInputLen` | `maxInputLen` | 录入长度 |
| `decimalDigits` | `decimalDigits` | `decimalDigits` | 小数位 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案id |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `showItem` | `showItem` | `showItem` | 属性名称 |
| `userdef_alias` | `userdef_alias` | `userdefAlias` | 属性别名 |
| `userdef_desc` | `userdef_desc` | `userdefDesc` | 备注 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `userdefines` | 自定义项值 |

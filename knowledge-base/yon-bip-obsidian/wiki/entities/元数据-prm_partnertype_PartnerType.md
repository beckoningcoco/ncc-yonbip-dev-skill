---
tags: [BIP, 元数据, 数据字典, prm.partnertype.PartnerType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 伙伴类型 (`prm.partnertype.PartnerType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prm_partnertype` | domain：`yycrm` | 应用：`PRM` | 业务对象ID：`c8e8004b-b662-44e1-8aba-6d8bfd5f2da8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 伙伴类型 |
| 物理表 | `prm_partnertype` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `PRM` |
| 直连字段 | 43 个 |
| 子表 | 2 个 |
| 关联引用 | 17 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `partnerTypeDefines` | `prm.partnertype.PartnerTypeDefine` | composition |
| `partnerTypeApplyRanges` | `prm.partnertype.PartnerTypeApplyRange` | composition |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `iParentId` | `prm_partnertyperef` |
| `partnerTypeDefineCharacter` | `` |
| `thirdLevelId` | `` |
| `ytenant_id` | `` |
| `fourthLevelId` | `` |
| `` | `` |
| `sixthLevelId` | `` |
| `firstLevelId` | `` |
| `eighthLevelId` | `` |
| `orgId` | `ucf-org-center.bd_salesorg_na` |
| `seventhLevelId` | `` |
| `secondLevelId` | `` |
| `fifthLevelId` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

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
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 43 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 类型编码 |
| `cErpCode` | `cErpCode` | `erpCode` | 外部编码 |
| `cPath` | `cPath` | `path` | 路径 |
| `picture` | `picture` | `picture` | 图片 |
| `` | `creator` | `creator` | 创建人名称 |
| `cCreatorName` | `cCreatorName` | `creatorName` | 创建者名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 数据来源ID |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgId` | `orgId` | `orgId` | 管理组织ID |
| `iParentId` | `iParentId` | `parent` | 上级类型id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `eighthLevelId` | `eighthLevelId` | `eighthLevel` | 第八级分类 |
| `fifthLevelId` | `fifthLevelId` | `fifthLevel` | 第五级分类 |
| `firstLevelId` | `firstLevelId` | `firstLevel` | 第一级分类 |
| `fourthLevelId` | `fourthLevelId` | `fourthLevel` | 第四级分类 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `secondLevelId` | `secondLevelId` | `secondLevel` | 第二级分类 |
| `seventhLevelId` | `seventhLevelId` | `seventhLevel` | 第七级分类 |
| `sixthLevelId` | `sixthLevelId` | `sixthLevel` | 第六级分类 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `thirdLevelId` | `thirdLevelId` | `thirdLevel` | 第三级分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCreatorType` | `iCreatorType` | `custType` | 创建者类型 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `order` | 排序号 |
| `iDepth` | `iDepth` | `level` | 层级 |
| `iEffectiveNum` | `iEffectiveNum` | `iEffectiveNum` | 有效期数值 |
| `iDeleted` | `iDeleted` | `iDeleted` | 状态 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iEffectiveType` | `iEffectiveType` | `iEffectiveType` | 有效期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 类型名称 |
| `cComment` | `cComment` | `comment` | 备注 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partnerTypeDefineCharacter` | `partnerTypeDefineCharacter` | `partnerTypeDefineCharacter` | 自定义项特征组 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `partnerTypeApplyRanges` | 伙伴类型适用范围 |
| `` | `` | `partnerTypeDefines` | 伙伴类型自定义项 |

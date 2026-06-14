---
tags: [BIP, 元数据, 数据字典, pc.tag.Tag]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签 (`pc.tag.Tag`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tag` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`39edae10-aff2-41bc-b800-91690cc35a4f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签 |
| 物理表 | `tag` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 31 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rules` | `pc.tag.TagRule` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `tagClass` | `productcenter.pc_tagclassref` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

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
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `scope` | `scope` | `scope` | 适用范围 |
| `tag_business_id` | `tag_business_id` | `tagBusinessId` | 标签图片 |
| `tag_image_url` | `tag_image_url` | `tag_image_url` | 图片URL地址 |
| `tag_bgcolor` | `tag_bgcolor` | `tag_bgcolor` | 背景颜色 |
| `ruleScope` | `ruleScope` | `ruleScope` | 自动标签范围 |
| `tag_fgcolor` | `tag_fgcolor` | `tag_fgcolor` | 字体颜色 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tagClass` | `tagClass` | `tagClass` | 标签分组 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dEndTime` | `dEndTime` | `dEndTime` | 结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isManage` | `isManage` | `isManage` | 管理端范围 |
| `isSmartSearch` | `isSmartSearch` | `isSmartSearch` | 智能搜索范围 |
| `isFront` | `isFront` | `isFront` | 前端范围 |
| `isFastSale` | `isFastSale` | `isFastSale` | 促销活动范围 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `style` | `style` | `style` | 标签样式 |
| `tag_image_position` | `tag_image_position` | `tag_position` | 标签位置 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tag_Name` | `tag_Name` | `name` | 标签名称 |
| `tag_abbr` | `tag_abbr` | `tagAbbr` | 备注 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rules` | 自动标签规则 |

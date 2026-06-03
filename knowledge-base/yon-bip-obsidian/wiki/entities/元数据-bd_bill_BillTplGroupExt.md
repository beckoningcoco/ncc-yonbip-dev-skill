---
tags: [BIP, 元数据, 数据字典, bd.bill.BillTplGroupExt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 表单属性拓展分组 (`bd.bill.BillTplGroupExt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`billtplgroup_base_extend_transtype` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`5a67ced1-559e-4302-a0d0-cde9569a0656`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 表单属性拓展分组 |
| 物理表 | `billtplgroup_base_extend_transtype` |
| 数据库 schema | `transtype` |
| 所属应用 | `BMMMM` |
| 直连字段 | 33 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `cName` | 分组名称 |
| `cCode` | `cCode` | `cCode` | 分组编码 |
| `cName_resid` | `cName_resid` | `cNameResid` | 分组名称多语词条 |
| `billTypeId` | `billTypeId` | `billTypeId` | 所属单据类型 |
| `cAlign` | `cAlign` | `cAlign` | group的排列方式 |
| `cDataSourceName` | `cDataSourceName` | `cDataSourceName` | 数据源名称,可能是一个表或者一个试图 |
| `cDesignProps` | `cDesignProps` | `cDesignProps` | 设计器扩展属性 默认为空 |
| `cExtProps` | `cExtProps` | `cExtProps` | 扩展属性 默认为空 |
| `cForeignKey` | `cForeignKey` | `cForeignKey` | 如果是子表,则该字段代表该子表中存的主表主键 |
| `cImage` | `cImage` | `cImage` | 图标 |
| `cParentDataSource` | `cParentDataSource` | `cParentDataSource` | 主表数据源名称,如果是子表填此项,否则为null |
| `cPrimaryKey` | `cPrimaryKey` | `cPrimaryKey` | cDsName主键名称 |
| `cStyle` | `cStyle` | `cStyle` | cStyle |
| `cSubId` | `cSubId` | `cSubId` | 子产品号 |
| `cType` | `cType` | `cType` | group标识类型,比如TabControl,Grid,Tree,Table等 |
| `dataRule` | `dataRule` | `dataRule` | dataRule |
| `defaultValKey` | `defaultValKey` | `defaultValKey` | defaultValKey |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenantid` | tenantid |
| `ytenant_id` | `ytenant_id` | `ytenant` | ytenant_id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bMain` | `bMain` | `bMain` | 是否主表 |
| `iSystem` | `iSystem` | `iSystem` | 0代表系统定义,其他再细分客户/行业等 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isFold` | `isFold` | `isFold` | 是否折叠 |
| `iOrder` | `iOrder` | `iOrder` | 分组排序 |
| `iCols` | `iCols` | `iCols` | iCols |
| `isDeleted` | `isDeleted` | `isDeleted` | 删除标识 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `iBillEntityId` | `iBillEntityId` | `iBillEntityId` | 所属billentity |
| `iBillId` | `iBillId` | `iBillId` | 所属bill |
| `iParentId` | `iParentId` | `iParentId` | 父级billtplgroupid |
| `iTplId` | `iTplId` | `iTplId` | 模板id |
| `sysid` | `sysid` | `sysid` | sysid |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

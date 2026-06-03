---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.DepreciationRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 折旧清单 (`fa.fixedasset.DepreciationRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_depreciation_record` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：`edb702d3-dc6a-4fd9-aa99-8399e885d24f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 折旧清单 |
| 物理表 | `at_depreciation_record` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 37 个 |
| 子表 | 2 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `depreRecDefines` | `fa.fixedasset.DepreciationRecordDefine` | composition |
| `headItem` | `fa.fixedasset.DepreciationRecordCustomItem` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `managedepredept` | `fixed_assets_categorytreeref` |
| `periodid` | `bd_period` |
| `busiaccbook` | `fiepub.fiepub_accountbookref` |
| `` | `` |
| `fixedassetsinfo` | `at_fixedassetsref` |
| `accpurpose` | `bd_accpurposeref` |
| `calculateinfo` | `` |
| `project` | `bd_projectcardref` |
| `accentity` | `finbd.bd_allaccbodyref` |
| `categoryParentId` | `fixed_assets_categorytreeref` |
| `natCurrency` | `bd_currencytenantreflist` |
| `usagestate` | `at_usagestateref` |
| `usedepredept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `category` | `fixed_assets_categorytreeref` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 固定资产编码 |
| `deptproportion` | `deptproportion` | `deptproportion` | 分配信息比例 |
| `assignment` | `assignment` | `assignment` | 分配信息 |
| `moredeptname` | `moredeptname` | `moredeptname` | 列表展示多部门名称 |
| `name` | `name` | `name` | 固定资产名称 |
| `periodcode` | `periodcode` | `periodcode` | 会计期间code |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busiaccbook` | `busiaccbook` | `busiaccbook` | 账簿 |
| `categoryParentId` | `categoryParentId` | `categoryParentId` | 资产类别一级节点id |
| `managedepredept` | `managedepredept` | `managedepredept` | 固定资产管理部门 |
| `periodid` | `periodid` | `periodid` | 会计期间id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `usagestate` | `usagestate` | `usagestate` | 使用状态 |
| `accpurpose` | `accpurpose` | `accpurpose` | 核算目的 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `category` | `category` | `category` | 固定资产类别 |
| `usedepredept` | `usedepredept` | `usedepredept` | 固定资产使用部门 |
| `project` | `project` | `project` | 项目 |
| `natCurrency` | `natCurrency` | `natCurrency` | 本位币币种 |
| `fixedassetsinfo` | `fixedassetsinfo` | `fixedassetsinfo` | 基本信息 |
| `calculateinfo` | `calculateinfo` | `calculateinfo` | 核算信息 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isupdate` | `isupdate` | `isupdate` | 是否修改折旧清单 |
| `moredepartment` | `moredepartment` | `moredepartment` | 是否多部门使用 |
| `isinherited` | `isinherited` | `isinherited` | 是否支持批改 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `originalvalue` | `originalvalue` | `originalvalue` | 原值 |
| `scrapvalue` | `scrapvalue` | `scrapvalue` | 净残值 |
| `unitdepreciation` | `unitdepreciation` | `unitdepreciation` | 单位折旧 |
| `accruedoriginalvalue` | `accruedoriginalvalue` | `accruedoriginalvalue` | 计提原值 |
| `monthdepreciationvalue` | `monthdepreciationvalue` | `monthdepreciationvalue` | 本月计提折旧额 |
| `depreciation` | `depreciation` | `depreciation` | 累计折旧 |
| `yeardepreciation` | `yeardepreciation` | `yeardepreciation` | 本年累计折旧 |
| `impairment` | `impairment` | `impairment` | 减值准备 |
| `netvalue` | `netvalue` | `netvalue` | 净值 |
| `monthdepreciationrate` | `monthdepreciationrate` | `monthdepreciationrate` | 月计提折旧率 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `depreRecDefines` | 折旧清单自由自定义项表 |
| `` | `` | `headItem` | 折旧清单固定自定义项 |

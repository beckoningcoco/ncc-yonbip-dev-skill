---
tags: [BIP, 元数据, 数据字典, hrcm.location.Location]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工作地点 (`hrcm.location.Location`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cs_location` | domain：`hrcloud-contract` | 应用：`HRCM` | 业务对象ID：`fbf2dfb7-fcfd-44fa-81da-b533f12b6226`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作地点 |
| 物理表 | `cs_location` |
| domain/服务域 | `hrcloud-contract` |
| schema | `corehr` |
| 所属应用 | `HRCM` |
| 直连字段 | 37 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `LocationScopeOrg` | `hrcm.location.LocationScopeOrg` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `permanreside` | `ucfbasedoc.bd_baseregiontreeref` |
| `` | `` |
| `country` | `ucfbasedoc.bd_countryref` |
| `parent_id` | `` |
| `creatorYhtId` | `` |
| `ytenant_id` | `` |
| `modifierYhtId` | `` |
| `distribution_site` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `userDefineCharacter001` | `` |

## 继承接口 (7个, 17字段)

- **启用** (`hrcm.common.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **站点** (`hrbase.hrbaseItf.IDistributionSource`)
  - `distribution_site` → `distribution_site`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `name2` | `name2` | `name2` | name2 |
| `name3` | `name3` | `name3` | name3 |
| `name4` | `name4` | `name4` | name4 |
| `name5` | `name5` | `name5` | name5 |
| `name6` | `name6` | `name6` | name6 |
| `address` | `address` | `address` | 详细地址 |
| `tenantid` | `tenantid` | `tenant` | 租户id |
| `timezone` | `timezone` | `timezone` | 时区 |
| `creator` | `creator` | `creatorName` | 创建人姓名 |
| `modifier` | `modifier` | `modifierName` | 修改人姓名 |
| `path` | `path` | `path` | 路径 |
| `memo` | `memo` | `memo` | 描述 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `permanreside` | `permanreside` | `permanreside` | 行政区划 |
| `distribution_site` | `distribution_site` | `distributionSite` | 站点 |
| `parent_id` | `parent_id` | `parent` | 上级地点 |
| `country` | `country` | `country` | 国家/地区 |
| `creatorId` | `creatorId` | `creatorId` | 创建人ID |
| `modifierId` | `modifierId` | `modifierId` | 修改人ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `creatorYhtId` | `creatorYhtId` | `creator` | 创建人 |
| `modifierYhtId` | `modifierYhtId` | `modifier` | 修改人 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `isDeleted` | 逻辑删除标记 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级节点 |
| `enable` | `enable` | `enable` | 启用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `userDefineCharacter001` | `userDefineCharacter001` | `userDefineCharacter001` | 特征 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `LocationScopeOrg` | 适用范围 |

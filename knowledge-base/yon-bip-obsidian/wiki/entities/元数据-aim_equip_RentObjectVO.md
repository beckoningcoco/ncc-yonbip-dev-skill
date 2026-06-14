---
tags: [BIP, 元数据, 数据字典, aim.equip.RentObjectVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 租赁对象 (`aim.equip.RentObjectVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_rent_object` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 租赁对象 |
| 物理表 | `pam_rent_object` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 33 个 |
| 子表 | 1 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aim.equip.RentObjectVODefine` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `pk_equip` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `` |
| `pk_house_type` | `ucf-amc-aim.ampub_house_type_ref` |
| `pk_equip_relation` | `` |
| `pk_location` | `` |
| `tenantid` | `` |
| `pk_org` | `` |
| `` | `` |

## 继承接口 (5个, 10字段)

- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 租赁对象主键 |
| `rent_object` | `rent_object` | `rent_object` | 租赁对象 |
| `rent_object_explain` | `rent_object_explain` | `rent_object_explain` | 对象描述 |
| `spec` | `spec` | `spec` | 规格 |
| `model` | `model` | `model` | 型号 |
| `building_number` | `building_number` | `building_number` | 楼号 |
| `unit` | `unit` | `unit` | 单元 |
| `floor` | `floor` | `floor` | 楼层 |
| `memo` | `memo` | `memo` | 备注 |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_location` | `pk_location` | `pk_location` | 位置 |
| `pk_org` | `pk_org` | `pk_org` | 资产组织 |
| `pk_equip_relation` | `pk_equip_relation` | `pk_equip_relation` | 关联资产 |
| `pk_equip` | `pk_equip` | `pk_equip` | 卡片主键 |
| `pk_house_type` | `pk_house_type` | `pk_house_type` | 户型主键 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `creator` | `creator` | `creator` | 创建人主键 |
| `modifier` | `modifier` | `modifier` | 最后修改人主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rent_status` | `rent_status` | `rent_status` | 租赁状态 |
| `business_type` | `business_type` | `business_type` | 经营类型 |
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `usable_area` | `usable_area` | `usableArea` | 可用面积 |
| `area` | `area` | `area` | 规划面积 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stop_time` | 停用时间 |
| `seal_time` | `seal_time` | `seal_time` | 启停用日期 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 租赁对象自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 租赁对象自定义项 |

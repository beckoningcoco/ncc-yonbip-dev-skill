---
tags: [BIP, 元数据, 数据字典, znbzbx.abodestand.AbodestandVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 住宿标准定义 (`znbzbx.abodestand.AbodestandVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_abodestand` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`3a1bc181-43c0-473f-b1de-2588c63df7ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 住宿标准定义 |
| 物理表 | `znbz_abodestand` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 42 个 |
| 子表 | 2 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `abodestandRegionCorpVOs` | `znbzbx.abodestand.AbodestandRegionCorpVO` | composition |
| `abodestandFinaceOrgVOs` | `znbzbx.abodestand.AbodestandFinaceOrgVO` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `pk_areaclass` | `znbzbx.znbzbx_areaclassref` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `ytenant_id` | `` |
| `pk_calendarrule` | `` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `abodestandDcs` | `` |
| `pk_regioncorp` | `ucfbasedoc.bd_countryaddbuttonref` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |

## 继承接口 (5个, 13字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `` | `creator` | `creator` | 创建者 |
| `` | `modifier` | `modifier` | 修改者 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务ID |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_calendarrule` | `pk_calendarrule` | `pk_calendarrule` | 差旅日历规则 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位ID |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级ID |
| `pk_areaclass` | `pk_areaclass` | `pk_areaclass` | 城市分级ID |
| `pk_regioncorp` | `pk_regioncorp` | `pk_regioncorp` | 地点id |
| `vcurrency` | `vcurrency` | `vcurrency` | 币种id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ihotelwelfaretype` | `ihotelwelfaretype` | `ihotelwelfaretype` | 补贴方式 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nhotelstandmny` | `nhotelstandmny` | `nhotelstandmny` | 住宿标准 |
| `nbusyseasonstdmny` | `nbusyseasonstdmny` | `nbusyseasonstdmny` | 旺季标准 |
| `nlowseasonstdmny` | `nlowseasonstdmny` | `nlowseasonstdmny` | 淡季标准 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

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
| `abodestandDcs` | `abodestandDcs` | `abodestandDcs` | 住宿标准自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `abodestandFinaceOrgVOs` | 适用业务单元 |
| `` | `` | `abodestandRegionCorpVOs` | 适用地点 |

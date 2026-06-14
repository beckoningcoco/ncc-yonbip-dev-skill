---
tags: [BIP, 元数据, 数据字典, bd.ranktype.RankType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职级类别 (`bd.ranktype.RankType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_rank_type` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`6028fbbb-fa6e-4412-a206-59af1a99cd29`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 职级类别 |
| 物理表 | `bd_rank_type` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `bd.ranktype.RankTypeDefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `user_define_character` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `org_id` | `` |
| `modifier` | `` |
| `tenantid` | `` |
| `` | `` |

## 继承接口 (9个, 15字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **时间轴档案** (`hred.itf.ITimeLineDoc`)
  - `end_time` → `end_time`
  - `start_time` → `start_time`
- **时间轴业务实体** (`hred.itf.ITimeLineBusiness`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 职级类别编码 |
| `sysid` | `sysid` | `sysid` | 应用主键 |
| `objid` | `objid` | `objid` | 友企联同步主键 |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `org_id` | 所属组织 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 职级类别名称 |
| `memo` | `memo` | `memo` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `ts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_time` | `start_time` | `starttime` | 开始时间 |
| `end_time` | `end_time` | `endtime` | 结束时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 职级类别自定义项 |

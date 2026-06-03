---
tags: [BIP, 元数据, 数据字典, bd.duty.Rank]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职级 (`bd.duty.Rank`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_rank` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`f266505e-2280-436b-93f8-c1909dd53d40`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 职级 |
| 物理表 | `bd_rank` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 42 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `user_define_character` | `` |
| `creator` | `` |
| `ranktype_id` | `ucf-staff-center.bd_rank_type_ref` |
| `ytenant_id` | `` |
| `maxrank_id` | `ucf-staff-center.bd_graderef` |
| `org_id` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `modifier` | `` |
| `minrank_id` | `ucf-staff-center.bd_graderef` |
| `jobtype_id` | `ucf-staff-center.bd_dutyType` |
| `tenantid` | `` |

## 继承接口 (8个, 15字段)

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
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 职级编码 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 适用组织范围 |
| `name2` | `name2` | `name2` | 名称备用2 |
| `name3` | `name3` | `name3` | 名称备用3 |
| `name4` | `name4` | `name4` | 名称备用4 |
| `name5` | `name5` | `name5` | 名称备用5 |
| `name6` | `name6` | `name6` | 名称备用6 |
| `memo2` | `memo2` | `memo2` | 备注备用2 |
| `memo3` | `memo3` | `memo3` | 备注备用3 |
| `memo4` | `memo4` | `memo4` | 备注备用4 |
| `memo5` | `memo5` | `memo5` | 备注备用5 |
| `memo6` | `memo6` | `memo6` | 备注备用6 |
| `objid` | `objid` | `objid` | 友企联同步主键 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |
| `log` | `log` | `log` | 删除引用日志 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `sysid` | `sysid` | `sysid` | 应用主键 |
| `bu_id` | `bu_id` | `bu_id` | 所属业务群 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `org_id` | 所属组织 |
| `ranktype_id` | `ranktype_id` | `ranktype_id` | 职级类别 |
| `maxrank_id` | `maxrank_id` | `maxrank_id` | 最高职等 |
| `minrank_id` | `minrank_id` | `minrank_id` | 最低职等 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `jobtype_id` | `jobtype_id` | `jobtype_id` | 职务类别 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order_no` | `order_no` | `orderNo` | 排序号 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 职级名称 |
| `memo` | `memo` | `memo` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `ts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `start_time` | `start_time` | `starttime` | 开始时间 |
| `end_time` | `end_time` | `endtime` | 结束时间 |

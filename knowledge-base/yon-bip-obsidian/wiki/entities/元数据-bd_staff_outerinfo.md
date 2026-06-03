---
tags: [BIP, 元数据, 数据字典, bd.staff.outerinfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 人员性质具体信息 (`bd.staff.outerinfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff_outer_info` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 人员性质具体信息 |
| 物理表 | `bd_staff_outer_info` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `tenantid` | `` |

## 继承接口 (6个, 13字段)

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
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `data_origin_source_code` | `data_origin_source_code` | `data_origin_source_code` | 数据来源code |
| `data_origin_source_name` | `data_origin_source_name` | `data_origin_source_name` | 数据来源name |
| `id` | `id` | `id` | 主键 |
| `outer_staff_type` | `outer_staff_type` | `outer_staff_type` | 外部人员身份类型 |
| `related_object` | `related_object` | `related_object` | 关联对象ID |
| `remark` | `remark` | `remark` | 备注 |
| `staff_id` | `staff_id` | `staff_id` | 员工ID |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `ytenant_id` | `ytenant_id` | `ytenant_id` | 友互通租户ID |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `biz_man_tag` | `biz_man_tag` | `biz_man_tag` | 是否业务员工 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `enable` | `enable` | `enable` | 状态 |
| `is_bind_user` | `is_bind_user` | `is_bind_user` | 是否绑定用户 |
| `shop_assis_tag` | `shop_assis_tag` | `shop_assis_tag` | 是否店员 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |

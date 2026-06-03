---
tags: [BIP, 元数据, 数据字典, os.post.PostSequenceVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职位序列 (`os.post.PostSequenceVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`os_post_sequence` | domain：`MDDHR` | 应用：`HRORG` | 业务对象ID：`c41bd3f1-6b4a-444a-ba70-586befbbd008`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 职位序列 |
| 物理表 | `os_post_sequence` |
| 数据库 schema | `MDDHR` |
| 所属应用 | `HRORG` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `MDDHR.postsequence_ref` |
| `user_define_character` | `` |
| `creator` | `` |
| `post_family_id` | `MDDHR.postfamily_ref` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `distribution_site` | `` |
| `job_type_id` | `ucf-staff-center.bd_dutyType` |
| `org_id` | `ucf-org-center.orgcenter_admin_tree_ref` |

## 继承接口 (10个, 20字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
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
- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **时间轴档案** (`hred.itf.ITimeLineDoc`)
  - `end_time` → `end_time`
  - `start_time` → `start_time`
- **时间轴业务实体** (`hred.itf.ITimeLineBusiness`)
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **站点** (`hrbase.hrbaseItf.IDistributionSource`)
  - `distribution_site` → `distribution_site`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 职位序列编码 |
| `memo` | `memo` | `memo` | 备注 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 适用组织范围 |
| `objid` | `objid` | `objid` | 同步主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 所属组织 |
| `post_family_id` | `post_family_id` | `postFamilyId` | 职位族群 |
| `parent_id` | `parent_id` | `parent` | 上级职位序列 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |
| `job_type_id` | `job_type_id` | `jobType` | 职务类别 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectivedate` | `effectivedate` | `effectiveDate` | 生效日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 职位序列名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `end_time` | `end_time` | `endtime` | 结束时间 |
| `start_time` | `start_time` | `starttime` | 开始时间 |

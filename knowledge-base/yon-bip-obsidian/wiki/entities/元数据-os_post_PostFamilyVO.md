---
tags: [BIP, 元数据, 数据字典, os.post.PostFamilyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职位族群 (`os.post.PostFamilyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`os_post_family` | domain：`MDDHR` | 应用：`HRORG` | 业务对象ID：`c0d300f2-5667-43df-ba58-3880555be6f2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 职位族群 |
| 物理表 | `os_post_family` |
| domain/服务域 | `MDDHR` |
| schema | `hr_orgsystem` |
| 所属应用 | `HRORG` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `user_define_character` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `distribution_site` | `` |
| `org_id` | `ucf-org-center.orgcenter_admin_tree_ref` |

## 继承接口 (7个, 12字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **站点** (`hrbase.hrbaseItf.IDistributionSource`)
  - `distribution_site` → `distribution_site`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 职位族群编码 |
| `objid` | `objid` | `objid` | 同步主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 所属组织 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |

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

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 职位族群名称 |
| `memo` | `memo` | `memo` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |

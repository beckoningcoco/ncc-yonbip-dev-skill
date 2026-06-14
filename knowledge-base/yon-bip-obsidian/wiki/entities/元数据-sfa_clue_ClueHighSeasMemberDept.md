---
tags: [BIP, 元数据, 数据字典, sfa.clue.ClueHighSeasMemberDept]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索公海成员 (`sfa.clue.ClueHighSeasMemberDept`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_cluehighseas_member` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索公海成员 |
| 物理表 | `sfa_cluehighseas_member` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `seas_id` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dept_id` | `dept_id` | `deptId` | 部门ID |
| `dept_name` | `dept_name` | `deptName` | 部门名称 |
| `member_id` | `member_id` | `memberId` | 成员ID |
| `member_name` | `member_name` | `memberName` | 成员名称 |
| `org_id` | `org_id` | `orgId` | 组织ID |
| `org_name` | `org_name` | `orgName` | 组织名称 |
| `seas_name` | `seas_name` | `seasName` | 公海名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seas_id` | `seas_id` | `seasId` | 公海ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

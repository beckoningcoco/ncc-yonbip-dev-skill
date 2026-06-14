---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.DeptOrgExtB]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 部门扩展信息B (`bd.adminOrg.DeptOrgExtB`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_dept_ext` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 部门扩展信息B |
| 物理表 | `org_dept_ext` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `dept_rank` | `ucf-staff-center.bd_dept_tier_ref` |
| `dept_category` | `ucf-staff-center.bd_dept_type_ref` |
| `dept_level` | `ucf-staff-center.bd_dept_level_ref` |
| `ytenant_id` | `` |
| `hrbp` | `ucf-staff-center.bd_staff_ref` |
| `other_principal` | `ucf-staff-center.bd_staff_ref` |
| `id` | `` |
| `manage_position_id` | `ucf-staff-center.bd_position_timeline_ref` |

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_org` | `approval_org` | `approvalOrg` | 批文单位 |
| `approval_code` | `approval_code` | `approvalCode` | 批文编码 |
| `attachment` | `attachment` | `attachment` | 附件 |
| `dept_responsibilities` | `dept_responsibilities` | `deptResponsibilities` | 部门职责 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `dept_level` | `dept_level` | `deptLevel` | 部门级别 |
| `dept_category` | `dept_category` | `deptCategory` | 部门分类 |
| `other_principal` | `other_principal` | `otherPrincipal` | 其他负责人 |
| `hrbp` | `hrbp` | `hrbp` | HRBP |
| `dept_rank` | `dept_rank` | `deptRank` | 部门层级 |
| `manage_position_id` | `manage_position_id` | `managepositionid` | 负责岗 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `establishment_date` | `establishment_date` | `establishmentDate` | 设立日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `authorized_strength` | `authorized_strength` | `authorizedStrength` | 编制 |

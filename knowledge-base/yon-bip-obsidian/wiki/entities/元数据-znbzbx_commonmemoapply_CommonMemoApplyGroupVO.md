---
tags: [BIP, 元数据, 数据字典, znbzbx.commonmemoapply.CommonMemoApplyGroupVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 通用申请项目团队子表 (`znbzbx.commonmemoapply.CommonMemoApplyGroupVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply_group` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通用申请项目团队子表 |
| 物理表 | `znbz_memoapply_group` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_memoapply` | `` |
| `organization` | `` |
| `staff` | `ucf-staff-center.bd_staff_ref` |
| `department` | `` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mobile` | `mobile` | `mobile` | 手机号 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 事项申请表头主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `staff` | `staff` | `staff` | 人员id |
| `department` | `department` | `department` | 任职/兼职部门id |
| `organization` | `organization` | `organization` | 任职/兼职组织id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `joindate` | `joindate` | `joindate` | 加入日期 |
| `leavedate` | `leavedate` | `leavedate` | 离开日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isleave` | `isleave` | `isleave` | 是否离开 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

---
tags: [BIP, 元数据, 数据字典, bd.staff.QuoteStaffNew]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工引入人员(新) (`bd.staff.QuoteStaffNew`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff_quote_info` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`5e2c84db-67eb-4784-93e9-f1b9b7a6b2ff`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工引入人员(新) |
| 物理表 | `bd_staff_quote_info` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 12 个 |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `user_define_character` | `` |
| `` | `` |
| `jobgrade_id` | `ucf-staff-center.bd_rankref` |
| `post_id` | `ucf-staff-center.bd_position_ref` |
| `ytenant_id` | `` |
| `jobrank_id` | `ucf-staff-center.bd_graderef` |
| `job_id` | `ucf-staff-center.bd_duty` |
| `org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `new_post_id` | `` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |

## 继承接口 (3个, 6字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 引入业务主键 |
| `memo` | `memo` | `memo` | 备注 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `staff_id` | `staff_id` | `staff_id` | 员工主键 |
| `org_id` | `org_id` | `org_id` | 业务单元 |
| `dept_id` | `dept_id` | `dept_id` | 部门 |
| `post_id` | `post_id` | `post_id` | 岗位 |
| `new_post_id` | `new_post_id` | `new_post_id` | 职位 |
| `job_id` | `job_id` | `job_id` | 职务 |
| `jobgrade_id` | `jobgrade_id` | `jobgrade_id` | 职级 |
| `jobrank_id` | `jobrank_id` | `jobrank_id` | 职等  |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auto_end` | `auto_end` | `auto_end` | 自动结束 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begindate` | `begindate` | `begindate` | 开始日期 |
| `enddate` | `enddate` | `enddate` | 结束日期 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 引入业务特征 |

---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffNewJob]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工任职兼职 (`bd.staff.StaffNewJob`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff_job` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`f38679b1-213d-44f5-ae3d-946f4a7dc562`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工任职兼职 |
| 物理表 | `bd_staff_job` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `jobrank_id` | `ucf-staff-center.bd_graderef` |
| `ytenant_id` | `` |
| `director` | `ucf-staff-center.bd_staff_ref` |
| `modifier` | `` |
| `account_org_id` | `ucf-org-center.bd_financeorgtableref` |
| `psncl_id` | `ucf-staff-center.bd_psnl_catg_ref` |
| `jobgrade_id` | `ucf-staff-center.bd_rankref` |
| `post_id` | `ucf-staff-center.bd_position_ref` |
| `job_id` | `ucf-staff-center.bd_duty` |
| `org_id` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `new_post_id` | `ucf-staff-center.bd_posts_ref` |
| `staff_id` | `ucf-staff-center.bd_staff_ref` |
| `dept_id` | `ucf-org-center.admin_dept_tree_ref` |
| `tenantid` | `` |

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `memo` | `memo` | `memo` | 备注 |
| `responsibilities` | `responsibilities` | `responsibilities` | 工作职责 |
| `sysid` | `sysid` | `sysid` | 来源系统标识 |
| `objid` | `objid` | `objid` | 混合云ID |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `id` | `id` | `id` | 主键 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性(隐藏) |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `org_id` | 组织 |
| `dept_id` | `dept_id` | `dept_id` | 部门 |
| `psncl_id` | `psncl_id` | `psncl_id` | 人员类别 |
| `post_id` | `post_id` | `post_id` | 岗位 |
| `new_post_id` | `new_post_id` | `new_post_id` | 职位 |
| `job_id` | `job_id` | `job_id` | 职务 |
| `jobgrade_id` | `jobgrade_id` | `jobgrade_id` | 职级 |
| `jobrank_id` | `jobrank_id` | `jobrank_id` | 职等  |
| `director` | `director` | `director` | 主管 |
| `account_org_id` | `account_org_id` | `account_org_id` | 会计主体 |
| `staff_id` | `staff_id` | `staff_id` | 员工ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismainjob` | `ismainjob` | `ismainjob` | 是否主职 |
| `lastestjob` | `lastestjob` | `lastestjob` | 是否当前最新 |
| `enable` | `enable` | `enable` | 任职生效状态 |
| `endflag` | `endflag` | `endflag` | 是否生效中 |
| `showorder` | `showorder` | `showorder` | 排序号 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `trnsevent` | `trnsevent` | `trnsevent` | 变动事件(隐藏) |
| `other_job_type` | `other_job_type` | `otherJobType` | 其他任职类型 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begindate` | `begindate` | `begindate` | 开始时间 |
| `enddate` | `enddate` | `enddate` | 结束时间 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间(隐藏) |
| `creationtime` | `creationtime` | `creationtime` | 创建时间(隐藏) |

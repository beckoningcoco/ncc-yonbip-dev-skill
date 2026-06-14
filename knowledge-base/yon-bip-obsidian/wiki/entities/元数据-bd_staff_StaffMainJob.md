---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffMainJob]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工任职(主职) (`bd.staff.StaffMainJob`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff_mainjob` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`f38679b1-213d-44f5-ae3d-946f4a7dc562`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工任职(主职) |
| 物理表 | `bd_staff_mainjob` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 38 个 |
| 子表 | 1 个 |
| 关联引用 | 17 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `mainjobdefines` | `bd.staff.StaffMainJobDefine` | composition |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creator` | `` |
| `jobrank_id` | `ucf-staff-center.bd_graderef` |
| `ytenant_id` | `` |
| `director` | `ucf-staff-center.bd_staff_ref` |
| `modifier` | `` |
| `account_org_id` | `ucf-org-center.bd_financeorgtableref` |
| `psncl_id` | `ucf-staff-center.bd_psnl_catg_ref` |
| `user_define_character` | `` |
| `jobgrade_id` | `ucf-staff-center.bd_rankref` |
| `post_id` | `ucf-staff-center.bd_position_ref` |
| `job_id` | `ucf-staff-center.bd_duty` |
| `org_id` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `new_post_id` | `ucf-staff-center.bd_posts_ref` |
| `staff_id` | `ucf-staff-center.bd_staff_ref` |
| `dept_id` | `ucf-org-center.admin_dept_tree_ref` |
| `tenantid` | `` |

## 继承接口 (7个, 13字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `responsibilities` | `responsibilities` | `responsibilities` | 工作职责 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `objid` | `objid` | `objid` | 混合云ID |
| `sysid` | `sysid` | `sysid` | 来源系统标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `org_id` | 组织 |
| `dept_id` | `dept_id` | `dept_id` | 部门 |
| `psncl_id` | `psncl_id` | `psncl_id` | 人员类别 |
| `new_post_id` | `new_post_id` | `new_post_id` | 职位 |
| `post_id` | `post_id` | `post_id` | 岗位 |
| `job_id` | `job_id` | `job_id` | 职务 |
| `jobgrade_id` | `jobgrade_id` | `jobgrade_id` | 职级 |
| `jobrank_id` | `jobrank_id` | `jobrank_id` | 职等  |
| `director` | `director` | `director` | 主管 |
| `account_org_id` | `account_org_id` | `account_org_id` | 会计主体 |
| `staff_id` | `staff_id` | `staff_id` | 员工 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用状态 |
| `showorder` | `showorder` | `showorder` | 顺序号 |
| `lastestjob` | `lastestjob` | `lastestjob` | 是否当前最新任职 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### timestamp (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begindate` | `begindate` | `begindate` | 开始时间 |
| `enddate` | `enddate` | `enddate` | 结束时间 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `ts` | `ts` | `ts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `mainjobdefines` | 员工任职自定义项 |

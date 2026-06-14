---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffJob]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工任职兼职 (`bd.staff.StaffJob`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_staff_job` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`f38679b1-213d-44f5-ae3d-946f4a7dc562`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工任职兼职 |
| 物理表 | `bd_staff_job` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
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
| `director` | `` |
| `modifier` | `` |
| `account_org_id` | `` |
| `psncl_id` | `` |
| `jobgrade_id` | `` |
| `post_id` | `` |
| `job_id` | `` |
| `org_id` | `` |
| `new_post_id` | `` |
| `staff_id` | `ucf-staff-center.bd_staff_ref` |
| `dept_id` | `` |
| `tenantid` | `` |

## 继承接口 (7个, 13字段)

- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
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
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `objid` | `objid` | `objid` | 友企联同步主键 |
| `id` | `id` | `id` | 主键 |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性(隐藏) |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |

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
| `modifier` | `modifier` | `modifier` | 修改人 |
| `creator` | `creator` | `creator` | 创建人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用状态 |
| `showorder` | `showorder` | `showorder` | 顺序号 |
| `lastestjob` | `lastestjob` | `lastestjob` | 是否当前最新 |
| `ismainjob` | `ismainjob` | `ismainjob` | 是否主职 |
| `endflag` | `endflag` | `endflag` | 是否生效中 |
| `trnsevent` | `trnsevent` | `trnsevent` | 变动事件 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `other_job_type` | `other_job_type` | `otherJobType` | 其他任职类型 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begindate` | `begindate` | `begindate` | 开始时间 |
| `enddate` | `enddate` | `enddate` | 结束时间 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `ts` | `ts` | `ts` | 时间戳 |

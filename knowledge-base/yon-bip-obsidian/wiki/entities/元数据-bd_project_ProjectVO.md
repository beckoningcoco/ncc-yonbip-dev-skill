---
tags: [BIP, 元数据, 数据字典, bd.project.ProjectVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目 (`bd.project.ProjectVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_project` | domain：`ucfbasedoc` | 应用：`DPMPRJ` | 业务对象ID：`6f708e5e-1eed-41ea-a668-1d3cbaf6f569`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目 |
| 物理表 | `bd_project` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPRJ` |
| 直连字段 | 44 个 |
| 子表 | 2 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `projectApplyRangeList` | `bd.project.ProjectApplyRange` | composition |
| `defines` | `bd.project.ProjectVODefine` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `ucfbasedoc.bd_projectcardref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `classifyid` | `ucfbasedoc.bd_projectclasstreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `deptid` | `ucf-org-center.bd_dept_list_ref` |
| `project_type` | `transtype.bd_billtyperef` |
| `` | `` |
| `orgid` | `ucf-org-center.org_pure_tree_ref` |
| `project_status` | `yonbip-pm-projectme.prjc_status_scheme_ref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `person` | `ucf-staff-center.bd_staff_ref` |
| `defineCharacter` | `` |

## 继承接口 (6个, 13字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `project_calendar` | `project_calendar` | `projectCalendar` | 项目日历 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `log` | `log` | `log` | 操作状态 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 适用范围集合 |
| `objid_inner` | `objid_inner` | `objidInner` | 内部系统 |
| `path` | `path` | `path` | 路径 |
| `source` | `source` | `source` | 来源 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgid` | `orgid` | `orgid` | 管理组织 |
| `classifyid` | `classifyid` | `classifyid` | 所属项目类别 |
| `parent_id` | `parent_id` | `parent` | 上级项目 |
| `project_type` | `project_type` | `projectType` | 项目类型 |
| `deptid` | `deptid` | `deptid` | 项目负责部门 |
| `person` | `person` | `person` | 项目负责人 |
| `warehouse_id` | `warehouse_id` | `warehouseId` | 收货仓库 |
| `project_status` | `project_status` | `projectStatus` | 项目状态 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_start_time` | `plan_start_time` | `planStartTime` | 计划开始时间 |
| `plan_end_time` | `plan_end_time` | `planEndTime` | 计划结束时间 |
| `real_start_time` | `real_start_time` | `realStartTime` | 实际开始日期 |
| `real_end_time` | `real_end_time` | `realEndTime` | 实际完成日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_date` | `plan_date` | `planDate` | 计划工期/天 |
| `real_date` | `real_date` | `realDate` | 实际工期/天 |
| `ordergrade` | `ordergrade` | `orderGrade` | 排序号 |
| `enable` | `enable` | `enable` | 启用状态 |
| `dr` | `dr` | `dr` | 删除状态 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `progress` | `progress` | `progress` | 进度% |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 备注 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defineCharacter` | `defineCharacter` | `defineCharacter` | 自定义项特征 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 项目(自定义项)表 |
| `` | `` | `projectApplyRangeList` | 项目适用范围 |

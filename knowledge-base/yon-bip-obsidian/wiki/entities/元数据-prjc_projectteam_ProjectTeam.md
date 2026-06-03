---
tags: [BIP, 元数据, 数据字典, prjc.projectteam.ProjectTeam]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目团队 (`prjc.projectteam.ProjectTeam`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`project_team` | domain：`yonbip-pm-projectme` | 应用：`PRJC` | 业务对象ID：`2f111a05-cb82-472d-be79-b39bd927b096`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目团队 |
| 物理表 | `project_team` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PRJC` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `details` | `prjc.projectteam.ProjectTeamMember` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project_team_define_character` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 团队编码 |
| `gid` | `gid` | `gid` | 项目群ID |
| `im_group_id` | `im_group_id` | `imGroupId` | IM群ID |
| `name` | `name` | `name` | 团队名称 |
| `org_id` | `org_id` | `orgId` | 组织ID |
| `source_id` | `source_id` | `sourceId` | 来源ID |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_id` | `project_id` | `projectId` | 平台项目档案 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_team_define_character` | `project_team_define_character` | `projectTeamDefineCharacter` | 自定义项属性 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `details` | 项目团队(成员)明细 |

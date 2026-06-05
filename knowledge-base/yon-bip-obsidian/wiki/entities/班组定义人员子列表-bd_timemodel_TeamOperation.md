---
tags: ["BIP", "元数据", "数据字典", "DPMWDC", "bd.timemodel.TeamOperation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 班组定义人员子列表 (`bd.timemodel.TeamOperation`)

> DPMWDC | 物理表：`bd_team_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 班组定义人员子列表 |
| 物理表 | `bd_team_b` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMWDC` |
| 构建时间 | `2026-06-05 09:22:42.0270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | String |
| 2 | `pk_team` | 主表id | `pk_team` | d1ce258a-6311-4719-846d-998458841d05 |
| 3 | `pk_operator` | 人员id | `pk_operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 4 | `is_master` | 负责人 | `is_master` | Integer |
| 5 | `pk_dept` | 部门 | `pk_dept` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 6 | `start_date` | 开始日期 | `start_date` | String |
| 7 | `end_date` | 结束日期 | `end_date` | String |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `operationDefineCharacter` | 自定义项特征 | `operationDefineCharacter` | b2f31319-1497-408d-b847-5e95ae2d7a93 |
| 10 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 11 | `creator` | 创建用户 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `creationtime` | 创建时间 | `creationtime` | DateTime |
| 13 | `modifier` | 最后修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 14 | `modifiedtime` | 最后修改时间 | `modifiedtime` | DateTime |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `tenant` | 租户ID | `tenantid` | String |
| 18 | `bodyDefines` | 班组明细(自定义项)表 | `` | 73a8a34e-425b-488d-8123-28ec8043d757 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `operationDefineCharacter` | 自定义项特征 | `bd.timemodel.TeamOperationDefineCharacter` | None |  |
| 2 | `pk_team` | 主表id | `bd.timemodel.TeamDefinition` | None | true |
| 3 | `creator` | 创建用户 | `base.user.BipUser` | Service |  |
| 4 | `pk_dept` | 部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `pk_operator` | 人员id | `bd.staff.Staff` | Service |  |
| 7 | `modifier` | 最后修改人 | `base.user.BipUser` | Service |  |
| 8 | `bodyDefines` | 班组明细(自定义项)表 | `bd.timemodel.TeamOperation_define` | None | true |

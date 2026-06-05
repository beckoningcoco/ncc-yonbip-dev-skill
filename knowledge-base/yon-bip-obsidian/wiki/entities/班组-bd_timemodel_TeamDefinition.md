---
tags: ["BIP", "元数据", "数据字典", "DPMWDC", "bd.timemodel.TeamDefinition"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 班组 (`bd.timemodel.TeamDefinition`)

> DPMWDC | 物理表：`bd_team`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 班组 |
| 物理表 | `bd_team` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMWDC` |
| 构建时间 | `2026-06-05 09:21:18.5500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | String |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `pk_org` | 工厂 | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `pk_dept` | 部门参照 | `pk_dept` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 6 | `is_shift` | 参与轮班 | `is_shift` | Integer |
| 7 | `memo` | 备注 | `memo` | String |
| 8 | `defineCharacter` | 自定义项特征 | `defineCharacter` | 3c3bbfcc-2779-4187-9ff0-4d8c84221312 |
| 9 | `sysid` | 应用标识 | `sysid` | String |
| 10 | `log` | 操作日志 | `log` | String |
| 11 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 12 | `enable` | 启用状态 | `is_enabled` | Integer |
| 13 | `creator` | 创建用户 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 14 | `creationtime` | 创建时间 | `creationtime` | DateTime |
| 15 | `modifier` | 最后修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 16 | `modifiedtime` | 最后修改时间 | `modifiedtime` | DateTime |
| 17 | `objid` | 友企连主键 | `objid` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `tenant` | 租户ID | `tenantid` | String |
| 21 | `defines` | 班组(自定义项)表 | `` | 1dafa99b-269d-4d2a-becd-829351df0d3b |
| 22 | `operationList` | 班组定义人员子列表 | `` | 8fccd842-13f4-4722-954d-4f77b81e8a82 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建用户 | `base.user.BipUser` | Service |  |
| 2 | `operationList` | 班组定义人员子列表 | `bd.timemodel.TeamOperation` | None | true |
| 3 | `pk_dept` | 部门参照 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `modifier` | 最后修改人 | `base.user.BipUser` | Service |  |
| 6 | `defineCharacter` | 自定义项特征 | `bd.timemodel.TeamDefinitionDefineCharacter` | None |  |
| 7 | `pk_org` | 工厂 | `org.func.BaseOrg` | Service |  |
| 8 | `defines` | 班组(自定义项)表 | `bd.timemodel.TeamDefinition_define` | None | true |

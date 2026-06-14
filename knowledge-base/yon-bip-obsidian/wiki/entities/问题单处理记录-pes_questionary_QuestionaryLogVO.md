---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.questionary.QuestionaryLogVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 问题单处理记录 (`pes.questionary.QuestionaryLogVO`)

> IMP_PES | 物理表：`sms_questionary_logs`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题单处理记录 |
| 物理表 | `sms_questionary_logs` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:04.8310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `operateType` | 业务操作 | `operate_type` | String |
| 2 | `orgId` | 操作组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `operatePerson` | 操作人id | `operate_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 4 | `operateTime` | 操作时间 | `operate_time` | DateTime |
| 5 | `acceptOrg` | 受理组织id | `accept_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 6 | `acceptPerson` | 受理人id | `accept_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 7 | `locationOrg` | 定位组织id | `location_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 8 | `locationPerson` | 定位人id | `location_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 9 | `solveOrg` | 解决组织id | `solve_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 10 | `solvePerson` | 解决人id | `solve_Person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 11 | `closeOrg` | 关闭组织id | `close_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `closePerson` | 关闭人id | `close_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 13 | `description` | 描述 | `description` | String |
| 14 | `questionaryId` | 问题单id | `questionary_id` | eeb14336-53d4-43c2-8fec-54c61718e8aa |
| 15 | `createUser` | 创建者 | `create_user` | String |
| 16 | `createTimeStr` | 创建时间 | `create_time` | String |
| 17 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 18 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 19 | `id` | id | `id` | Long |
| 20 | `dr` | 逻辑删除 | `dr` | Integer |
| 21 | `tenant` | 租户ID | `tenant_id` | String |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `solveOrg` | 解决组织id | `org.func.BaseOrg` | Service |  |
| 2 | `operatePerson` | 操作人id | `bd.staff.Staff` | Service |  |
| 3 | `closePerson` | 关闭人id | `bd.staff.Staff` | Service |  |
| 4 | `locationOrg` | 定位组织id | `org.func.BaseOrg` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `locationPerson` | 定位人id | `bd.staff.Staff` | Service |  |
| 7 | `acceptOrg` | 受理组织id | `org.func.BaseOrg` | Service |  |
| 8 | `acceptPerson` | 受理人id | `bd.staff.Staff` | Service |  |
| 9 | `questionaryId` | 问题单id | `pes.questionary.QuestionaryVO` | None | true |
| 10 | `closeOrg` | 关闭组织id | `org.func.BaseOrg` | Service |  |
| 11 | `orgId` | 操作组织id | `org.func.BaseOrg` | Service |  |
| 12 | `solvePerson` | 解决人id | `bd.staff.Staff` | Service |  |

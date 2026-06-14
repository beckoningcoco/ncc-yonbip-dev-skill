---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SoPersons"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单协助人员表 (`pes.sos.SoPersons`)

> IMP_PES | 物理表：`sms_so_persons`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单协助人员表 |
| 物理表 | `sms_so_persons` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:17.8460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | String |
| 2 | `node` | 环节 | `node` | String |
| 3 | `personId` | 参与人员 | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 4 | `role` | 参与人角色 | `role` | String |
| 5 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 6 | `createTimeStr` | 创建时间 | `create_time` | String |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `dr` | 逻辑删除 | `dr` | Integer |
| 10 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 11 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 12 | `createUser` | 创建者 | `create_user` | String |
| 13 | `ts` | 版本号 | `ts` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `soId` | 工单Id | `pes.sos.SmsSos` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `personId` | 参与人员 | `bd.staff.Staff` | Service |  |

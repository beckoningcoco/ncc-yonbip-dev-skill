---
tags: ["BIP", "元数据", "数据字典", "pes.serviceTeam.serviceTeamPerson"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务团队人员 (`pes.serviceTeam.serviceTeamPerson`)

>  | 物理表：`sms_serviceTeam_persons`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务团队人员 |
| 物理表 | `sms_serviceTeam_persons` |
| domain/服务域 | `imppes` |
| 所属应用 | `` |
| 构建时间 | `2026-06-05 17:20:25.5860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | String |
| 2 | `personCode` | 人员编码 | `person_code` | String |
| 3 | `personId` | 人员id | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 4 | `personName` | 人员名称 | `person_name` | String |
| 5 | `personPhone` | 联系电话 | `person_phone` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `serviceTeamId` | 服务团队id | `service_team_id` | 7b7859d5-26ea-433e-8fee-007cb85c64d7 |
| 8 | `tenant` | 租户ID | `tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `personId` | 人员id | `bd.staff.Staff` | Service |  |
| 3 | `serviceTeamId` | 服务团队id | `pes.serviceTeam.serviceTeam` | None | true |

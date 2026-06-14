---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.ps.CheckProjectItemVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检查项目明细子表 (`pes.ps.CheckProjectItemVO`)

> IMP_PES | 物理表：`imp_pes_ps_check_project_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检查项目明细子表 |
| 物理表 | `imp_pes_ps_check_project_detail` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:01.9610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNo` | 序号 | `line_no` | Integer |
| 2 | `serviceProjectId` | 服务项目 | `service_project_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 3 | `stdId` | 服务项目标准 | `std_id` | eb39b0ca-1f77-4946-83eb-9424e55b95ce |
| 4 | `content` | 备注 | `content` | String |
| 5 | `planId` | 计划工单Id | `plan_id` | fb011718-aab6-4d01-849c-15dcd313e46d |
| 6 | `id` | ID | `id` | String |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `stdId` | 服务项目标准 | `PES.standardAllot.StandardAllot` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `planId` | 计划工单Id | `pes.ps.PlanSoVO` | None | true |
| 4 | `serviceProjectId` | 服务项目 | `pes.serviceProject.ServiceProject` | None |  |

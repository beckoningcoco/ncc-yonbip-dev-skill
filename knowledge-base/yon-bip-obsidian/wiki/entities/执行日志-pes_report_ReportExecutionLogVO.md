---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.report.ReportExecutionLogVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 执行日志 (`pes.report.ReportExecutionLogVO`)

> IMP_PES | 物理表：`pes_dim_rpt_exection_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 执行日志 |
| 物理表 | `pes_dim_rpt_exection_log` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:10.3600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `executeTime` | 执行时间 | `execute_time` | DateTime |
| 2 | `isSuccess` | 是否成功 | `is_success` | Short |
| 3 | `failureCause` | 失败原因 | `failure_cause` | String |
| 4 | `executor` | 执行人 | `executor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 5 | `reportId` | 诊断报告ID | `report_id` | b5207eea-0c4f-4fee-8fd5-ec7f5285b246 |
| 6 | `id` | ID | `id` | String |
| 7 | `dr` | DR | `dr` | Short |
| 8 | `tenant` | 租户ID | `tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reportId` | 诊断报告ID | `pes.report.Report` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `executor` | 执行人 | `base.user.BipUser` | Service |  |

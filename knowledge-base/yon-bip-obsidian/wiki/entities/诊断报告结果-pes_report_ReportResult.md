---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.report.ReportResult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 诊断报告结果 (`pes.report.ReportResult`)

> IMP_PES | 物理表：`pes_dim_rpt_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 诊断报告结果 |
| 物理表 | `pes_dim_rpt_result` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:13.2600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `content` | 报告内容 | `content` | String |
| 2 | `count` | 生成次数 | `count` | Integer |
| 3 | `id` | ID | `id` | Long |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `reportId` | 诊断报告 | `report_id` | b5207eea-0c4f-4fee-8fd5-ec7f5285b246 |
| 6 | `type` | 文件类型 | `type` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reportId` | 诊断报告 | `pes.report.Report` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |

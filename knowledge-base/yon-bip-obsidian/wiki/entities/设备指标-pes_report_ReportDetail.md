---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.report.ReportDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备指标 (`pes.report.ReportDetail`)

> IMP_PES | 物理表：`pes_dim_rpt_det`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备指标 |
| 物理表 | `pes_dim_rpt_det` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:09.0170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `description` | 描述 | `description` | String |
| 2 | `equipmentIndex` | 设备指标 | `equipment_index` | 98445ec1-4f62-4ff1-8586-5f434484ce2e |
| 3 | `equipmentIndexValue` | 设备指标值 | `equipment_index_value` | String |
| 4 | `id` | ID | `id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `reportId` | 诊断报告 | `report_id` | b5207eea-0c4f-4fee-8fd5-ec7f5285b246 |
| 7 | `reportTemplateDetailId` | 诊断报告详情Id | `report_template_detail_id` | 35ec16a1-598c-4bc7-bf90-d86a76a51094 |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equipmentIndex` | 设备指标 | `pes.serviceProject.ServiceStandard` | None |  |
| 2 | `reportId` | 诊断报告 | `pes.report.Report` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `reportTemplateDetailId` | 诊断报告详情Id | `pes.reporttemplate.ReportTemplateDetail` | None |  |

---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.reporttemplate.ReportTemplateDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 详情 (`pes.reporttemplate.ReportTemplateDetail`)

> IMP_PES | 物理表：`pes_dim_rpt_tpl_det`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 详情 |
| 物理表 | `pes_dim_rpt_tpl_det` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:00.1780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `equipmentIndex` | 设备指标ID | `equipment_index` | 98445ec1-4f62-4ff1-8586-5f434484ce2e |
| 2 | `dataSource` | 数据来源 | `data_source` | String |
| 3 | `accessRule` | 取数规则 | `access_rule` | String |
| 4 | `description` | 描述 | `description` | String |
| 5 | `reportTemplateId` | 单据id | `report_template_id` | 1e97a78e-5f7f-4f01-abd6-a6d99845cd2e |
| 6 | `id` | ID | `id` | Long |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equipmentIndex` | 设备指标ID | `pes.serviceProject.ServiceStandard` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `reportTemplateId` | 单据id | `pes.reporttemplate.ReportTemplate` | None | true |

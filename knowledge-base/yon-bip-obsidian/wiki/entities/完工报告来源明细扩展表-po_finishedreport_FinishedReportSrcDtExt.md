---
tags: ["BIP", "元数据", "数据字典", "PO", "po.finishedreport.FinishedReportSrcDtExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 完工报告来源明细扩展表 (`po.finishedreport.FinishedReportSrcDtExt`)

> PO | 物理表：`po_finished_report_src_dt_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 完工报告来源明细扩展表 |
| 物理表 | `po_finished_report_src_dt_ext` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:54.3160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | fea3ef35-d0ef-4668-8e2f-9fdc36f96b75 | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 2 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 3 | `id` | ID | `id` | fea3ef35-d0ef-4668-8e2f-9fdc36f96b75 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `rowno` | 序号 | `rowno` | Integer |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | ID | `po.finishedreport.FinishedReportSrcDt` | None | true |

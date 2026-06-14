---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.report.ReportRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 诊断报告发布记录 (`pes.report.ReportRecord`)

> IMP_PES | 物理表：`pes_dim_rpt_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 诊断报告发布记录 |
| 物理表 | `pes_dim_rpt_record` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:11.8660` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `publishDateTime` | 发布时间 | `publish_date_time` | DateTime |
| 3 | `publisher` | 发布人 | `publisher` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `reason` | 原因 | `reason` | String |
| 6 | `recipient` | 接收人 | `recipient` | a0d0de2e-eacd-45cb-856f-ff883986ead1 |
| 7 | `reportId` | 诊断报告 | `report_id` | b5207eea-0c4f-4fee-8fd5-ec7f5285b246 |
| 8 | `success` | 状态 | `success` | Boolean |
| 9 | `views` | 浏览次数 | `views` | Integer |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reportId` | 诊断报告 | `pes.report.Report` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `recipient` | 接收人 | `pes.externaluser.ExternalUser` | None |  |
| 4 | `publisher` | 发布人 | `base.user.BipUser` | Service |  |

---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuQtOfferFile"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价单对供应商要求子表 (`sourcing.ibuyoffer.CpuQtOfferFile`)

> ycSouringInquiry | 物理表：`cpu_qtoffer_file`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价单对供应商要求子表 |
| 物理表 | `cpu_qtoffer_file` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:16.5440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `offerId` | 报价单主表ID | `offer_id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 3 | `fileName` | 附件 | `file_name` | String |
| 4 | `fileType` | 文件类型 | `file_type` | String |
| 5 | `fileCode` | 附件编码 | `file_code` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 2 | `offerId` | 报价单主表ID | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None | true |

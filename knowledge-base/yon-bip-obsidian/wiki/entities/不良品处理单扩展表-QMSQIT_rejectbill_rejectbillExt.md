---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.rejectbill.rejectbillExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 不良品处理单扩展表 (`QMSQIT.rejectbill.rejectbillExt`)

> QMSQIT | 物理表：`qms_qit_rejectbill_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 不良品处理单扩展表 |
| 物理表 | `qms_qit_rejectbill_ext` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:32.1280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 41f6d3f3-61a7-4bfd-a749-fc8d48b9f4e7 | 不良品id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `hasCheckApply` | 是否有检验申请 | `has_check_apply` | Short |
| 3 | `id` | 不良品id | `id` | 41f6d3f3-61a7-4bfd-a749-fc8d48b9f4e7 |
| 4 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 5 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 6 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 7 | `isGenerateBarcode` | 自动生码 | `is_generate_barcode` | Boolean |
| 8 | `isMultiInspect` | 是否多版本检验 | `is_multi_inspect` | Short |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `reexamination` | 复检状态 | `reexamination` | String |
| 11 | `sampleRecordCode` | 样品记录编码 | `sample_record_code` | String |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 不良品id | `QMSQIT.rejectbill.rejectbill` | None | true |

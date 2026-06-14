---
tags: ["BIP", "元数据", "数据字典", "BCD", "aa.barcoderule.BarcodeRuleAnalysis"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 解析类型 (`aa.barcoderule.BarcodeRuleAnalysis`)

> BCD | 物理表：`aa_barcoderule_analysis`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 解析类型 |
| 物理表 | `aa_barcoderule_analysis` |
| domain/服务域 | `uscmpub` |
| schema | `usp_plantransportroute` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:34:38.8910` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（4个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime |
| 3 | `ruleCode` | 类型code | `ruleCode` | String |
| 4 | `ruleDesc` | 解析类型描述 | `ruleDesc` | String |

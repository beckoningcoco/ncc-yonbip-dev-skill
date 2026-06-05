---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.inspectionstepconfig.InspectionStepConfigDCT"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验步骤配置自定义项 (`QMSQIT.inspectionstepconfig.InspectionStepConfigDCT`)

> QMSQIT | 物理表：`qms_qit_inspection_step_config_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验步骤配置自定义项 |
| 物理表 | `qms_qit_inspection_step_config_dct` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:44.0380` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（4个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | ID | `id` | String |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |

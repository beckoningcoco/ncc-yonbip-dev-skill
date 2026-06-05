---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlan.standardValue"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 标准值 (`QMSDFM.inspectionPlan.standardValue`)

> QIC | 物理表：`qms_dfm_standardvalue`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标准值 |
| 物理表 | `qms_dfm_standardvalue` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:10.9090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | String |
| 3 | `inspectionItemRID` | 检验方案项目信息行ID | `inspectionItemRID` | String |
| 4 | `inspectionItemID` | 检验方案项目信息id | `inspectionItemID` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `standardFormula` | 标准值公式 | `standard_formula` | String |
| 7 | `standValCharacId` | 标准值参照值id | `standval_charac_id` | String |
| 8 | `qualityLevelID` | 质量等级id | `qualityLevelID` | 0807260c-f881-4419-9dab-a412fad4e530 |
| 9 | `qualityLevelName` | 质量等级名称 | `qualityLevelName` | String |
| 10 | `bqualified` | 合格品 | `bqualified` | String |
| 11 | `standardvalue` | 标准值 | `standardvalue` | String |
| 12 | `qualityLevelCode` | 质量等级编码 | `qualityLevelCode` | String |
| 13 | `upperValue` | 上限值 | `upperValue` | String |
| 14 | `lowerValue` | 下限值 | `lowerValue` | String |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `upperComparisionOperator` | 上限比较符 | `upperComparisionOperator` | String |
| 17 | `tenant` | 租户ID | `tenant_id` | String |
| 18 | `lowerComparisionOperator` | 下限比较符 | `lowerComparisionOperator` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `qualityLevelID` | 质量等级id | `QMSDFM.qualityGrade.qualityGradeBody` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `inspectionItemID` | 检验方案项目信息id | `QMSDFM.inspectionPlan.inspectionItemB` | None | true |

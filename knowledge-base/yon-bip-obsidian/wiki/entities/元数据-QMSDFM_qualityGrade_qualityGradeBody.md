---
tags: [BIP, 元数据, 数据字典, QMSDFM.qualityGrade.qualityGradeBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 质量等级子表 (`QMSDFM.qualityGrade.qualityGradeBody`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `qms_dfm_qualitygrade_body` | 应用: `QIC`

## 属性（15 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 2 | `tenant` | tenant | `tenant_id` | String | `text` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pk_qualitygrade` | pk_qualitygrade | `pk_qualitygrade` | 8a7f6d68-6241-4364-be90-2b4b3d57e135 | `quote` |
| 5 | `bvcode` | bvcode | `bvcode` | String | `text` |
| 6 | `bvname` | bvname | `bvname` | String | `multiLanguage` |
| 7 | `rowno` | rowno | `rowno` | Decimal | `number` |
| 8 | `is_qualified` | 是否_qualified | `is_qualified` | String | `text` |
| 9 | `treat_method` | treat_method | `treat_method` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a | `quote` |
| 10 | `pk_inventorystate` | pk_inventorystate | `pk_inventorystate` | 5275f074-3e60-4b90-9771-20970f1e905c | `quote` |
| 11 | `externalSourceId` | externalSourceID | `externalSourceId` | String | `text` |
| 12 | `externalSourceType` | externalSourceType | `externalSourceType` | String | `text` |
| 13 | `qualityGradeBodyDef` | qualityGradeBodyDef | `qualityGradeBodyDef` | bd2b2bf6-9c52-482d-ae74-01b0d023c328 | `UserDefine` |
| 14 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（5 个）

- `pk_qualitygrade` -> `QMSDFM.qualityGrade.qualityGrade` (1..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `treat_method` -> `QMSDFM.treatmethod.treatmethod` () 
- `pk_inventorystate` -> `st.stockStatusRecord.stockStatusRecord` () 
- `qualityGradeBodyDef` -> `QMSDFM.qualityGrade.QualityGradeBodyDefine` () 

---
tags: [BIP, metadata, hrxc, WaGradeVersion]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资标准版本 (hrxc.grade.WaGradeVersion)

> Platform: BIP V5 | Table: wa_grade_version | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资标准版本 |
| uri | hrxc.grade.WaGradeVersion |
| tableName | wa_grade_version |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (22)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | effectDate | 生效日期 | EFFECT_DATE | date | Date |  |  | nullable |
| 2 | pkWaGrd | 薪资标准类别主键 | PK_WA_GRD | quote | hrxc.grade.WaGrade |  |  | nullable |
| 3 | prmlvCnt | 薪级数 | PRMLV_CNT | int | Integer |  |  | nullable |
| 4 | seclvCnt | 薪档数 | SECLV_CNT | int | Integer |  |  | nullable |
| 5 | endDate | 版本截止日期 | END_DATE | date | Date |  |  | nullable |
| 6 | effectFlag | 生效标志 | EFFECT_FLAG | text | String |  |  | nullable |
| 7 | syncFlag | 同步标识 | SYNC_FLAG | text | String |  |  | nullable |
| 8 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 9 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 10 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 11 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 12 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 13 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 14 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 15 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 16 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 17 | isPrmSec | 是否维护薪级薪裆 0:否 1:是 | IS_PRMSEC | text | String |  |  | nullable |
| 18 | waGradeCriterions | 薪资标准详情 | - | - | hrxc.grade.WaGradeCriterion |  |  |  |
| 19 | waGradeLevels | 薪资标准级别/档别 | - | - | hrxc.grade.WaGradeLevel |  |  |  |
| 20 | waGradePsninfos | 薪资标准人员信息属性 | - | - | hrxc.grade.WaGradePsninfo |  |  |  |
| 21 | waGradePsnsubs | 薪资标准人员子属性 | - | - | hrxc.grade.WaGradePsnsub |  |  |  |
| 22 | waVersionSettings | 薪资项目设置 | - | - | hrxc.grade.WaItemSetting |  |  |  |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkWaGrd | 薪资标准类别主键 | PK_WA_GRD | hrxc.grade.WaGrade |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | base.user.BipUser |
| 4 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 5 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | waGradeCriterions | 薪资标准详情 | hrxc.grade.WaGradeCriterion |
| 2 | waVersionSettings | 薪资项目设置 | hrxc.grade.WaItemSetting |
| 3 | waGradeLevels | 薪资标准级别/档别 | hrxc.grade.WaGradeLevel |
| 4 | waGradePsnsubs | 薪资标准人员子属性 | hrxc.grade.WaGradePsnsub |
| 5 | waGradePsninfos | 薪资标准人员信息属性 | hrxc.grade.WaGradePsninfo |

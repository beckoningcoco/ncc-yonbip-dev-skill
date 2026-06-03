---
tags: [BIP, metadata, hrjx, PmInterviewStaff]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效面谈人 (hrjx.pmInterview.PmInterviewStaff)

> Platform: BIP V5 | Table: pm_interview_staff | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效面谈人 |
| uri | hrjx.pmInterview.PmInterviewStaff |
| tableName | pm_interview_staff |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (9)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 4 | interviewId | 绩效面谈ID | interview_id | quote | hrjx.pmInterview.PmInterview |  |  | nullable |
| 5 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 6 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 7 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 8 | staffId | 面谈人ID | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 9 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | interviewId | 绩效面谈ID | interview_id | hrjx.pmInterview.PmInterview |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | staffId | 面谈人ID | staff_id | hred.staff.Staff |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

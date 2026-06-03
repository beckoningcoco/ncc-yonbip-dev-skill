---
tags: [BIP, metadata, hrjx, Sheet]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表信息 (hrjx.pmSheet.Sheet)

> Platform: BIP V5 | Table: pm_sheet | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表信息 |
| uri | hrjx.pmSheet.Sheet |
| tableName | pm_sheet |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (50)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 2 | staffid | 人员id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 3 | markStatus | 状态 | mark_status | int | Integer |  |  | nullable |
| 4 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 5 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 6 | submitter | 提交人id | submitter | quote | hred.staff.Staff |  |  | nullable |
| 7 | periodcode | 期间code | periodcode | text | String |  |  | nullable |
| 8 | enablestate | 是否有效 | enablestate | switch | Boolean |  |  | nullable |
| 9 | isrelease | 是否发布 | isrelease | switch | Boolean |  |  | nullable |
| 10 | isaudit | 是否审核 | isaudit | switch | Boolean |  |  | nullable |
| 11 | isover | 是否结束 | isover | switch | Boolean |  |  | nullable |
| 12 | iscalc | 是否计算 | iscalc | switch | Boolean |  |  | nullable |
| 13 | adjusttime | 流程调整时间 | adjusttime | timestamp | Timestamp |  |  | nullable |
| 14 | throughAdjust | 是否通过结果调整 | through_adjust | int | Integer |  |  | nullable |
| 15 | indiconfirm | 员工是否确认指标 | indiconfirm | int | Integer |  |  | nullable |
| 16 | isjoinpublish | 是否加入发布 | isjoinpublish | switch | Boolean |  |  | nullable |
| 17 | submittime | 提交时间 | submittime | timestamp | Timestamp |  |  | nullable |
| 18 | staffJobId | 任职id | staffjobid | quote | hred.staff.StaffJob |  |  | nullable |
| 19 | indisetid | 指标模板id | indisetid | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 20 | evaobjectid | 考核对象id | evaobjectid | quote | hrjx.pmScheme.EvaObject |  |  | nullable |
| 21 | stepid | 当前步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 22 | pmtemplateid | 绩效模板id | pmtemplateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 23 | defid | 绩效流程id | defid | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 24 | runtimeDefid | 实例绩效流程id | runtime_defid | quote | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |  |  | nullable |
| 25 | issyncstaff | 同步人员子集异步标识 | issyncstaff | int | Integer |  |  | nullable |
| 26 | publishStaffDate | 人员子集发布时间 | publish_staff_date | timestamp | Timestamp |  |  | nullable |
| 27 | pdate | 绩效发布时间 | pdate | timestamp | Timestamp |  |  | nullable |
| 28 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 29 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 30 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 31 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 32 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 33 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 34 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 35 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 36 | AppraiseList1 | 量表考核信息(虚拟) | - | - | hrjx.pmSheet.AppraiseVirTual |  |  |  |
| 37 | SheetBlockEvaList | 区域考核关系 | - | - | hrjx.pmSheet.SheetBlockEva |  |  |  |
| 38 | SheetDataList1 | 量表结构数据实体(虚拟) | - | - | hrjx.pmSheet.SheetDataVirTual |  |  |  |
| 39 | assesseeList | 指标制定人表 | - | - | hrjx.pmSheet.SheetAssessee |  |  |  |
| 40 | blockList | 绩效模板考核部分 | - | - | hrjx.pmSheet.TemplateBlock |  |  |  |
| 41 | isupdateasse | 是否调整过考核关系 | isupdateasse | int | Integer |  |  | nullable |
| 42 | oApprover | 指标审核人实体 | - | - | hrjx.pmSheet.Approver |  |  |  |
| 43 | resultEnterList | 结果录入 | - | - | hrjx.pmSheet.ResultEnter |  |  |  |
| 44 | scoreVirtualList | 量表总分(虚拟) | - | - | hrjx.pmSheet.ScoreVirtual |  |  |  |
| 45 | sheetAppraiserList | 量表评价人设置实体 | - | - | hrjx.pmSheet.SheetAppraiser |  |  |  |
| 46 | sheetApproverList | 量表指标审核人实体 | - | - | hrjx.pmSheet.SheetApprover |  |  |  |
| 47 | sheetDataList | 量表结构数据实体 | - | - | hrjx.pmSheet.SheetData |  |  |  |
| 48 | sheetIndicatorList | 量表对应指标表 | - | - | hrjx.pmSheet.SheetIndicator |  |  |  |
| 49 | staffJobChangeId | 任职变动id | staffjobchangeid | quote | hred.staff.StaffJob |  |  | nullable |
| 50 | tdate | 绩效开启时间 | tdate | timestamp | Timestamp |  |  | nullable |

---

## Reference Fields (16)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 2 | staffid | 人员id | staffid | hred.staff.Staff |
| 3 | orgid | 所属组织 | orgid | org.func.AdminOrg |
| 4 | deptid | 部门id | deptid | org.func.AdminOrg |
| 5 | submitter | 提交人id | submitter | hred.staff.Staff |
| 6 | staffJobId | 任职id | staffjobid | hred.staff.StaffJob |
| 7 | indisetid | 指标模板id | indisetid | hrjx.pmSheet.TemplateIndiSet |
| 8 | evaobjectid | 考核对象id | evaobjectid | hrjx.pmScheme.EvaObject |
| 9 | stepid | 当前步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 10 | pmtemplateid | 绩效模板id | pmtemplateid | hrjx.pmSheet.Template |
| 11 | defid | 绩效流程id | defid | hrjx.pmPhaseFlow.PhaseFlowDef |
| 12 | runtimeDefid | 实例绩效流程id | runtime_defid | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |
| 13 | creator | 创建人 | creator | base.user.BipUser |
| 14 | modifier | 修改人 | modifier | base.user.BipUser |
| 15 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 16 | staffJobChangeId | 任职变动id | staffjobchangeid | hred.staff.StaffJob |

---

## Child Tables (12)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | sheetDataList | 量表结构数据实体 | hrjx.pmSheet.SheetData |
| 2 | sheetIndicatorList | 量表对应指标表 | hrjx.pmSheet.SheetIndicator |
| 3 | scoreVirtualList | 量表总分(虚拟) | hrjx.pmSheet.ScoreVirtual |
| 4 | resultEnterList | 结果录入 | hrjx.pmSheet.ResultEnter |
| 5 | sheetAppraiserList | 量表评价人设置实体 | hrjx.pmSheet.SheetAppraiser |
| 6 | blockList | 绩效模板考核部分 | hrjx.pmSheet.TemplateBlock |
| 7 | AppraiseList1 | 量表考核信息(虚拟) | hrjx.pmSheet.AppraiseVirTual |
| 8 | assesseeList | 指标制定人表 | hrjx.pmSheet.SheetAssessee |
| 9 | sheetApproverList | 量表指标审核人实体 | hrjx.pmSheet.SheetApprover |
| 10 | SheetDataList1 | 量表结构数据实体(虚拟) | hrjx.pmSheet.SheetDataVirTual |
| 11 | oApprover | 指标审核人实体 | hrjx.pmSheet.Approver |
| 12 | SheetBlockEvaList | 区域考核关系 | hrjx.pmSheet.SheetBlockEva |

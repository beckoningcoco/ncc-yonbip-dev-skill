---
tags: [BIP, metadata, hrjx, Template]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效模板 (hrjx.pmSheet.Template)

> Platform: BIP V5 | Table: pm_template | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效模板 |
| uri | hrjx.pmSheet.Template |
| tableName | pm_template |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 4 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 5 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |

---

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | authorgid | 组织权限id | authorgid | quote | org.func.AdminOrgTimeline |  |  | nullable |
| 2 | code | 模版编码 | code | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 6 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 7 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 8 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 9 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 10 | indisetList | 绩效指标模板设置 | - | - | hrjx.pmSheet.TemplateIndiSet |  |  |  |
| 11 | isallowmtr | 是否允许创建中期回顾 | isallowmtr | int | Integer |  |  | nullable |
| 12 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 13 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 14 | mtrFlowDefCopyId | 中期回顾绩效流程引用id | mtr_flow_def_copy_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 15 | mtrFlowDefId | 中期回顾绩效流程id | mtr_flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 16 | mysheet | 历史绩效查看参数 | mysheet | text | String |  |  | nullable |
| 17 | name | 模板名称 | name | text | String |  |  | nullable |
| 18 | orgVid | 所属组织时间轴id | org_vid | quote | org.func.AdminOrgTimeline |  |  | nullable |
| 19 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 20 | parentId | 指向原始模版主键 | parent_id | quote | hrjx.pmSheet.Template |  |  | nullable |
| 21 | partList | 绩效模板区块表 | - | - | hrjx.pmSheet.TemplatePart |  |  |  |
| 22 | phasedFlowDefCopyId | 绩效流程引用id | phased_flow_def_copy_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 23 | phasedFlowDefId | 绩效流程id | phased_flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 24 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 25 | reftime | 引用时间 | reftime | timestamp | Timestamp |  |  | nullable,uiHide |
| 26 | remark | 描述 | remark | text | String |  |  | nullable |
| 27 | templateType | 模板类型 | template_type | int | Integer |  |  | nullable |
| 28 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 29 | versionid | 版本号 | versionid | int | Integer |  |  | nullable |
| 30 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (12)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | authorgid | 组织权限id | authorgid | org.func.AdminOrgTimeline |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | deptid | 部门id | deptid | org.func.AdminOrg |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | mtrFlowDefCopyId | 中期回顾绩效流程引用id | mtr_flow_def_copy_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 6 | mtrFlowDefId | 中期回顾绩效流程id | mtr_flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 7 | orgVid | 所属组织时间轴id | org_vid | org.func.AdminOrgTimeline |
| 8 | orgid | 所属组织 | orgid | org.func.AdminOrg |
| 9 | parentId | 指向原始模版主键 | parent_id | hrjx.pmSheet.Template |
| 10 | phasedFlowDefCopyId | 绩效流程引用id | phased_flow_def_copy_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 11 | phasedFlowDefId | 绩效流程id | phased_flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 12 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | indisetList | 绩效指标模板设置 | hrjx.pmSheet.TemplateIndiSet |
| 2 | partList | 绩效模板区块表 | hrjx.pmSheet.TemplatePart |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |

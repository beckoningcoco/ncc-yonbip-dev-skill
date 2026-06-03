---
tags: [BIP, metadata, hrjx, EvaApprSummaryTemplateVo]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核/审核流程设置模板 (hrjx.pmSummarySchemeTemplate.EvaApprSummaryTemplateVo)

> Platform: BIP V5 | Table: pm_eva_appraiser_summary_template | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核/审核流程设置模板 |
| uri | hrjx.pmSummarySchemeTemplate.EvaApprSummaryTemplateVo |
| tableName | pm_eva_appraiser_summary_template |
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

## All Fields (18)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | quote | hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO |  |  | nullable |
| 2 | stageName | 阶段名称 | stagename | text | String |  |  | isName,nullable |
| 3 | workStep | 环节 | workstep | int | Integer |  |  | nullable |
| 4 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 5 | weight | 轮次权重 | weight | number | Decimal |  |  | nullable |
| 6 | dimId | 考核人类别id | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 7 | appraiserelId | 考核关系id | appraiserelid | quote | hrjx.pmCore.AppraiseRelSetting |  |  | nullable |
| 8 | staffId | 审核/考核人id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 9 | pcTplId | pc端mddUI模板id | pctplid | text | String |  |  | nullable |
| 10 | mobileTplId | 移动端mddUI模板id | mobiletplid | text | String |  |  | nullable |
| 11 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 12 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 13 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 14 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 15 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 16 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 17 | tenant | 租户ID | tenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 18 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO |
| 2 | dimId | 考核人类别id | dimid | hrjx.pmCore.Dimensionality |
| 3 | appraiserelId | 考核关系id | appraiserelid | hrjx.pmCore.AppraiseRelSetting |
| 4 | staffId | 审核/考核人id | staffid | hred.staff.Staff |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |
| 7 | tenant | 租户ID | tenant_id | yht.tenant.YhtTenant |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

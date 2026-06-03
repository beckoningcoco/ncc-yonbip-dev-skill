---
tags: [BIP, metadata, hrjx, EvaApprTemplateVo]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核/审核流程设置模板 (hrjx.pmSchemeTemplate.EvaApprTemplateVo)

> Platform: BIP V5 | Table: pm_eva_appraiser_template | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核/审核流程设置模板 |
| uri | hrjx.pmSchemeTemplate.EvaApprTemplateVo |
| tableName | pm_eva_appraiser_template |
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

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | quote | hrjx.pmSchemeTemplate.SchemeTemplateVO |  |  | nullable |
| 2 | workStep | 指标下达/审核人/考核人 | workstep | int | Integer |  |  | nullable |
| 3 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 4 | dimId | 考核人类别 | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 5 | stageName | 审核阶段 | stagename | text | String |  |  | isName,nullable |
| 6 | appraiserelId | 指定考核关系 | appraiserelid | quote | hrjx.pmCore.AppraiseRelSetting |  |  | migrationIgnoreRef,nullable |
| 7 | staffId | 指定考核人 | staffid | quote | hred.staff.Staff |  |  | nullable |
| 8 | weight | 考核权重(%) | weight | number | Decimal |  |  | nullable |
| 9 | mobileTplId | 移动端mddUI模板id | mobiletplid | text | String |  |  | nullable |
| 10 | pcTplId | 指定考核模板 | pctplid | text | String |  |  | nullable |
| 11 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 12 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 13 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 14 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 15 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 16 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 17 | tenant | 租户ID | tenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 18 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 19 | ispreviousturn | 是否查看前轮评分 | ispreviousturn | int | Integer |  |  |  |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | hrjx.pmSchemeTemplate.SchemeTemplateVO |
| 2 | dimId | 考核人类别 | dimid | hrjx.pmCore.Dimensionality |
| 3 | appraiserelId | 指定考核关系 | appraiserelid | hrjx.pmCore.AppraiseRelSetting |
| 4 | staffId | 指定考核人 | staffid | hred.staff.Staff |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |
| 7 | tenant | 租户ID | tenant_id | yht.tenant.YhtTenant |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

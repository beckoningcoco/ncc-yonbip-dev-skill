---
tags: [BIP, metadata, hrxc, WaTaxOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 扣缴义务人 (hrxc.taxOrg.WaTaxOrg)

> Platform: BIP V5 | Table: wa_tax_org | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 扣缴义务人 |
| uri | hrxc.taxOrg.WaTaxOrg |
| tableName | wa_tax_org |
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
| 1 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (35)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 组织主键 | ORG_ID | quote | org.func.AdminOrg |  |  | nullable |
| 2 | belongOrg | 所属组织 | belong_org | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 3 | orgName | 法人公司 | ORG_NAME | text | String |  |  | nullable |
| 4 | showOrder | 排序字段 | show_order | int | Integer |  |  | nullable |
| 5 | businessRuleName | 业务规则名称 | BUSINESS_RULE_NAME | text | String |  |  | nullable |
| 6 | taxPeriodRuleNew | 纳税期间规则 | TAX_PERIOD_RULE_NEW | int | Integer |  |  | nullable |
| 7 | pwd | pwd | pwd | text | String |  |  | nullable |
| 8 | reportId |  | report_id | text | String |  |  | nullable |
| 9 | rptPwd | 申报密码 | rpt_pwd | text | String |  |  | nullable |
| 10 | isMultiTaxBureau | 是否多税务机关 | is_multi_tax_bureau | text | String |  |  | nullable |
| 11 | taxBureau | 主管税务机关 | tax_bureau | text | String |  |  | nullable |
| 12 | taxOrgLevelSn | 主管机关登记序列号 | tax_org_level_sn | quote | hrxc.taxOrg.WaTaxOrg |  |  | nullable |
| 13 | valid | 1:有效,0:无效 | valid | int | Integer |  |  | nullable |
| 14 | account | 账户 | account | text | String |  |  | nullable |
| 15 | areaId | 行政区域编码 | area_id | text | String |  |  | nullable |
| 16 | deptCode | 部门编码 | dept_code | text | String |  |  | nullable |
| 17 | errorInfo | 错误信息 | error_info | text | String |  |  | nullable |
| 18 | outboundNumber | 外出经营证件号 | outbound_number | text | String |  |  | nullable |
| 19 | taxName | 个税主体 | TAX_NAME | text | String |  |  | isName,nullable |
| 20 | taxMemberNumber | 纳税人识别号 | TAX_MEMBER_NUMBER | text | String |  |  | nullable |
| 21 | code | 编码 | CODE | text | String |  |  | isCode,nullable |
| 22 | enable | 是否启用 | ENABLE | int | Integer |  |  | nullable |
| 23 | businessRuleId | 适用范围 | BUSINESS_RULE_ID | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 24 | taxPeriodRule | 纳税期间规则 | TAX_PERIOD_RULE | int | Integer |  |  | nullable |
| 25 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 26 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 27 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 28 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 29 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 30 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 31 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 32 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 33 | yTenantId | 友户通租户主键 | YTENANT_ID | quote | yht.tenant.YhtTenant |  |  | nullable |
| 34 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  |  | nullable |
| 35 | applyOrgs | 扣缴义务人适用组织 | - | - | hrxc.taxOrg.WaTaxApplyOrg |  |  |  |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 组织主键 | ORG_ID | org.func.AdminOrg |
| 2 | belongOrg | 所属组织 | belong_org | org.func.BaseOrg |
| 3 | taxOrgLevelSn | 主管机关登记序列号 | tax_org_level_sn | hrxc.taxOrg.WaTaxOrg |
| 4 | businessRuleId | 适用范围 | BUSINESS_RULE_ID | hrcb.rule_bizrule.BizRule |
| 5 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 6 | creator | 创建人 | CREATOR | base.user.BipUser |
| 7 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 8 | yTenantId | 友户通租户主键 | YTENANT_ID | yht.tenant.YhtTenant |
| 9 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | applyOrgs | 扣缴义务人适用组织 | hrxc.taxOrg.WaTaxApplyOrg |

---
tags: [BIP, metadata, hrxc, WaSchemeItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资方案项目 (hrxc.scheme.WaSchemeItem)

> Platform: BIP V5 | Table: wa_scheme_item | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资方案项目 |
| uri | hrxc.scheme.WaSchemeItem |
| tableName | wa_scheme_item |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (75)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | busiOrg | 组织主键 | BUSIORG | quote | org.func.BaseOrg |  |  | nullable |
| 2 | country | 国家地区ID | country | quote | bd.country.CountryVO |  |  | migrationIgnoreRef,nullable |
| 3 | dbcode | dbcode | DBCODE | text | String |  |  | nullable |
| 4 | pkWaItem | 发薪项目id | PK_WA_ITEM | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 5 | pkWaScheme | 发薪方案id | PK_WA_SCHEME | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 6 | userDefFlag | 用户自定义标志 | USER_DEF_FLAG | text | String |  |  | nullable |
| 7 | name2 | 项目名称2 | NAME2 | text | String |  |  | nullable |
| 8 | name3 | 项目名称3 | NAME3 | text | String |  |  | nullable |
| 9 | name4 | 项目名称4 | NAME4 | text | String |  |  | nullable |
| 10 | name5 | 项目名称5 | NAME5 | text | String |  |  | nullable |
| 11 | name6 | 项目名称6 | NAME6 | text | String |  |  | nullable |
| 12 | itemKey | 公共薪资项目键值 | ITEM_KEY | text | String |  |  | nullable |
| 13 | payslipName2 | 工资条项目名称2 | PAYSLIP_NAME2 | text | String |  |  | nullable |
| 14 | payslipName3 | 工资条项目名称3 | PAYSLIP_NAME3 | text | String |  |  | nullable |
| 15 | payslipName4 | 工资条项目名称4 | PAYSLIP_NAME4 | text | String |  |  | nullable |
| 16 | payslipName5 | 工资条项目名称5 | PAYSLIP_NAME5 | text | String |  |  | nullable |
| 17 | payslipName6 | 工资条项目名称6 | PAYSLIP_NAME6 | text | String |  |  | nullable |
| 18 | socialInsurance | 社保福利 | SOCIAL_INSURANCE | int | Integer |  |  | nullable |
| 19 | isinhi | 0:不纳入 1:纳入 | ISINHI | text | String |  |  | nullable |
| 20 | showOrder | 显示顺序 | SHOW_ORDER | int | Integer |  |  | nullable |
| 21 | computeseq | 计算顺序 | COMPUTESEQ | int | Integer |  |  | nullable |
| 22 | sysFormula | 系统公式 | SYS_FORMULA | text | String |  |  | nullable |
| 23 | useDataset | 公式引用的信息集 | USE_DATASET | text | String |  |  | nullable |
| 24 | allowModify | 允许修改 0:否 1:是 | allow_modify | text | String |  |  | nullable |
| 25 | taxField | 个税接口字段 | tax_field | text | String |  |  | nullable |
| 26 | ownershipTable | code所属表空值时默认第一张租户表 | ownership_table | text | String |  |  | nullable |
| 27 | effectPeriodSegment | 生效期间分段 | effect_period_segment | int | Integer |  |  | nullable |
| 28 | segmentedSummaryRowRule | 分段汇总行规则 | segmented_summary_row_rule | int | Integer |  |  | nullable |
| 29 | pkSchemeVersion | 版本id | PK_SCHEME_VERSION | quote | hrxc.scheme.WaSchemeVersion |  |  | nullable |
| 30 | name | 发薪项目名称 | NAME | multiLanguage | String |  |  | nullable |
| 31 | categoryId | 项目分类ID | CATEGORYID | quote | hrxc.publicItem.WaItemCategory |  |  | nullable |
| 32 | code | 项目编码 | CODE | text | String |  |  | nullable |
| 33 | dataType | 数据类型 | DATA_TYPE | text | String |  |  | nullable |
| 34 | fldWidth | 数据长度 | FLD_WIDTH | text | String |  |  | nullable |
| 35 | fldDecimal | 小数位数 | FLD_DECIMAL | int | Integer |  |  | nullable |
| 36 | roundType | 舍位方式 | ROUND_TYPE | text | String |  |  | nullable |
| 37 | property | 增减属性 | PROPERTY | text | String |  |  | nullable |
| 38 | taxFlag | 个税申报属性 | TAX_FLAG | text | String |  |  | nullable |
| 39 | taxFlag2 | 专项扣除 | TAX_FLAG2 | text | String |  |  | nullable |
| 40 | taxFlag3 | 社保公积金 | TAX_FLAG3 | text | String |  |  | nullable |
| 41 | salaryChg | 定调薪标识 | SALARY_CHG | text | String |  |  | nullable |
| 42 | segmentAccount | 分段核算 | SEGMENT_ACCOUNT | text | String |  |  | nullable |
| 43 | fromFlag | 数据来源 | FROM_FLAG | text | String |  |  | nullable |
| 44 | projectIn | 所得项目 | PROJECT_IN | text | String |  |  | nullable |
| 45 | formula | 公式编辑 | FORMULA | text | String |  |  | nullable |
| 46 | formulastr | 公式编辑 | FORMULASTR | text | String |  |  | nullable |
| 47 | salaryRule | 取值规则 | SALARY_RULE | text | String |  |  | nullable |
| 48 | baseDayType | 计算日薪天数 | BASE_DAY_TYPE | text | String |  |  | nullable |
| 49 | baseDay | 固定天数 | BASE_DAY | number | Decimal |  |  | nullable |
| 50 | businessRuleId | 业务规则id | BUSINESS_RULE_ID | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 51 | segmentDay | 调薪天数取值 | SEGMENT_DAY | text | String |  |  | nullable |
| 52 | clearFlag | 下月清零 | CLEAR_FLAG | text | String |  |  | nullable |
| 53 | docFlag | 是否档案 | docFlag | text | String |  |  | nullable |
| 54 | approveFlag | 审批项目 | APPROVE_FLAG | text | String |  |  | nullable |
| 55 | payslipFlag | 工资单项目 | PAYSLIP_FLAG | text | String |  |  | nullable |
| 56 | customDocFlag | 是否自定义档案 | customDocFlag | text | String |  |  | nullable |
| 57 | payslipName | 工资单项目名称 | PAYSLIP_NAME | multiLanguage | String |  |  | nullable |
| 58 | memo | 项目说明 | MEMO | text | String |  |  | nullable |
| 59 | refCode | 参照编码 | refCode | text | String |  |  | nullable |
| 60 | entityUri | uri路径 | entityUri | text | String |  |  | nullable |
| 61 | docName | 引用档案 | docName | text | String |  |  | nullable |
| 62 | businessRuleName | 业务规则名称 | BUSINESS_RULE_NAME | text | String |  |  | nullable |
| 63 | isDisplay | 默认显示 | is_display | int | Integer |  |  | nullable |
| 64 | waItemDefineCharacter | 自定义特征 | wa_item_define_character | UserDefine | hrxc.publicItem.WaItemCharacteristics |  |  | nullable |
| 65 | id | 发薪项目id | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 66 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 67 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 68 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 69 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 70 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 71 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 72 | yTenantId | 友户通租户主键 | ytenant_id | quote | yht.tenant.YhtTenant |  |  | nullable |
| 73 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 74 | itemRefSource | 项目引用来源(10:预置(是)且手工添加, 11:预置(是)且系统自动带入, 20:预置(否)且手工添加, 21:预置(否)且系统自动带入) | item_ref_source | text | String |  |  | nullable |
| 75 | staticItemFlg | 统计项目标识 | static_item_flg | int | Integer |  |  | nullable |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | busiOrg | 组织主键 | BUSIORG | org.func.BaseOrg |
| 2 | country | 国家地区ID | country | bd.country.CountryVO |
| 3 | pkWaItem | 发薪项目id | PK_WA_ITEM | hrxc.publicItem.WaItem |
| 4 | pkWaScheme | 发薪方案id | PK_WA_SCHEME | hrxc.scheme.WaScheme |
| 5 | pkSchemeVersion | 版本id | PK_SCHEME_VERSION | hrxc.scheme.WaSchemeVersion |
| 6 | categoryId | 项目分类ID | CATEGORYID | hrxc.publicItem.WaItemCategory |
| 7 | businessRuleId | 业务规则id | BUSINESS_RULE_ID | hrcb.rule_bizrule.BizRule |
| 8 | creator | 创建人 | CREATOR | base.user.BipUser |
| 9 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 10 | yTenantId | 友户通租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 11 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |

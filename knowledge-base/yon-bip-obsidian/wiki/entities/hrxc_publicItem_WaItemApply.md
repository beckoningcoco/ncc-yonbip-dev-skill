---
tags: [BIP, metadata, hrxc, WaItemApply]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共薪资项目申请明细 (hrxc.publicItem.WaItemApply)

> Platform: BIP V5 | Table: wa_item_apply | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共薪资项目申请明细 |
| uri | hrxc.publicItem.WaItemApply |
| tableName | wa_item_apply |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (59)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | waItemApplyBillId | 主表主键 | wa_item_apply_bill_id | quote | hrxc.publicItem.WaItemApplyBill |  |  | nullable |
| 2 | busiOrgVid | 组织Vid | BUSIORGVID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 3 | name | 项目名称 | NAME | multiLanguage | String |  |  | nullable |
| 4 | busiOrg | 组织Id | BUSIORG | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 5 | dataType | 数据类型 | DATA_TYPE | text | String |  |  | nullable |
| 6 | property | 增减属性 | PROPERTY | text | String |  |  | nullable |
| 7 | formula | 公式 | FORMULA | text | String |  |  | nullable |
| 8 | isinhi | 0:纳入 1:不纳入 | ISINHI | text | String |  |  | nullable |
| 9 | shareType | 共享标识 0:不共享 1:直接下级 2:所有下级 | SHARE_TYPE | text | String |  |  | nullable |
| 10 | showOrder | 显示顺序 | SHOW_ORDER | int | Integer |  |  | nullable |
| 11 | socialInsurance | 社保福利 | SOCIAL_INSURANCE | int | Integer |  |  | nullable |
| 12 | userDefFlag | 用户自定义标志 0:系统预置 1:用户自定义 | USER_DEF_FLAG | text | String |  |  | nullable |
| 13 | allowModify | 允许修改 0:否 1:是 | allow_modify | text | String |  |  | nullable |
| 14 | itemStatus | 对应项目状态 | item_status | int | Integer |  |  | nullable |
| 15 | itemId | 对应项目主键 | item_id | text | String |  |  | nullable |
| 16 | scopeType | 公开范围 | scope_type | text | String |  |  | nullable |
| 17 | taxFlag | 个税申报属性 | TAX_FLAG | text | String |  |  | nullable |
| 18 | categoryId | 分类主键 | CATEGORYID | quote | hrxc.publicItem.WaItemCategory |  |  | nullable |
| 19 | salaryChg | 定调薪标识 | SALARY_CHG | text | String |  |  | nullable |
| 20 | fldWidth | 数据长度 | FLD_WIDTH | int | Integer |  |  | nullable |
| 21 | segmentAccount | 分段核算 | SEGMENT_ACCOUNT | text | String |  |  | nullable |
| 22 | fromFlag | 数据来源 | FROM_FLAG | text | String |  |  | nullable |
| 23 | clearFlag | 下月清零 | CLEAR_FLAG | text | String |  |  | nullable |
| 24 | fldDecimal | 小数位数 | FLD_DECIMAL | int | Integer |  |  | nullable |
| 25 | isDisplay | 默认显示 | IS_DISPLAY | int | Integer |  |  | nullable |
| 26 | roundType | 舍位方式 | ROUND_TYPE | text | String |  |  | nullable |
| 27 | approveFlag | 审批项目 | approve_flag | text | String |  |  | nullable |
| 28 | payslipFlag | 工资单项目 | PAYSLIP_FLAG | text | String |  |  | nullable |
| 29 | payslipName | 工资单项目名称 | PAYSLIP_NAME | multiLanguage | String |  |  | nullable |
| 30 | country | 国家地区ID | country | quote | bd.country.CountryVO |  |  | nullable |
| 31 | memo | 项目说明 | MEMO | text | String |  |  | nullable |
| 32 | projectIn | 所得项目 | PROJECT_IN | int | Integer |  |  | nullable |
| 33 | waItemApplyCharacteristics | 公共薪资项目申请明细特征组 | wa_item_apply_define_character | UserDefine | hrxc.publicItem.WaItemCharacteristics |  |  | nullable |
| 34 | taxFlag2 | 专项扣除 | TAX_FLAG2 | text | String |  |  | nullable |
| 35 | taxFlag3 | 基本养老保险 | TAX_FLAG3 | text | String |  |  | nullable |
| 36 | salaryRule | 取值规则 | SALARY_RULE | text | String |  |  | nullable |
| 37 | baseDayType | 计算日薪天数 | BASE_DAY_TYPE | text | String |  |  | nullable |
| 38 | baseDay | 固定天数 | BASE_DAY | number | Decimal |  |  | nullable |
| 39 | segmentDay | 调薪天数取值 | SEGMENT_DAY | text | String |  |  | nullable |
| 40 | formulastr | 公式 | FORMULASTR | text | String |  |  | nullable |
| 41 | businessRuleId | 业务规则id | BUSINESS_RULE_ID | text | String |  |  | nullable |
| 42 | docFlag | 是否档案 | docFlag | text | String |  |  | nullable |
| 43 | customDocFlag | 是否自定义档案 | customDocFlag | text | String |  |  | nullable |
| 44 | refCode | 参照编码 | refCode | text | String |  |  | nullable |
| 45 | entityUri | uri路径 | entityUri | text | String |  |  | nullable |
| 46 | docName | 引用档案 | docName | text | String |  |  | nullable |
| 47 | businessRuleName | 业务规则名称 | BUSINESS_RULE_NAME | text | String |  |  | nullable |
| 48 | id | ID | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 49 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 50 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 51 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 52 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 53 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 54 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 55 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 56 | tenant | 租户主键(旧) | TENANTID | text | String |  |  | nullable |
| 57 | effectPeriodSegment | 生效期间分段 | effect_period_segment | int | Integer |  |  | nullable |
| 58 | segmentedSummaryRowRule | 分段汇总行规则 | segmented_summary_row_rule | int | Integer |  |  | nullable |
| 59 | staticItemFlg | 统计项目标识 | static_item_flg | int | Integer |  |  | nullable |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | waItemApplyBillId | 主表主键 | wa_item_apply_bill_id | hrxc.publicItem.WaItemApplyBill |
| 2 | busiOrgVid | 组织Vid | BUSIORGVID | org.func.BaseOrgTimeline |
| 3 | busiOrg | 组织Id | BUSIORG | org.func.BaseOrgTimeline |
| 4 | categoryId | 分类主键 | CATEGORYID | hrxc.publicItem.WaItemCategory |
| 5 | country | 国家地区ID | country | bd.country.CountryVO |
| 6 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 7 | creator | 创建人 | CREATOR | base.user.BipUser |
| 8 | modifier | 修改人 | MODIFIER | base.user.BipUser |

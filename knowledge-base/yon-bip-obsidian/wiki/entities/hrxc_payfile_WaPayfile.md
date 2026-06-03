---
tags: [BIP, metadata, hrxc, WaPayfile]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资发放单 (hrxc.payfile.WaPayfile)

> Platform: BIP V5 | Table: wa_payfile | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资发放单 |
| uri | hrxc.payfile.WaPayfile |
| tableName | wa_payfile |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (6)

| # | Name | URI |
|---|------|-----|
| 1 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 5 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 6 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (67)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | salaryGroupId | 薪资核算组主键 | salary_group_id | quote | hrxc.salaryAccount.WaSalaryAccountGroup |  |  | nullable |
| 2 | pkWaScheme | 薪资方案ID | PK_WA_SCHEME | quote | hrxc.scheme.WaSchemeAuth |  |  | nullable |
| 3 | paymentStatus | 状态 | payment_status | text | String |  |  | nullable |
| 4 | isHistoricalTaxPeriod | 是否补录历史数据,默认0,0表示否,1表示是 | is_historical_tax_period | int | Integer |  |  | nullable |
| 5 | payfileCharacter | 薪资发放单特征组实体 | payfile_character | UserDefine | hrxc.payfile.WaPayfileCharacteristics |  |  | nullable |
| 6 | abnormalMemo | 预警备注 | ABNORMAL_MEMO | text | String |  |  | nullable |
| 7 | payFileOnly | 项目设置只对当前发放单有效 | pay_file_only | text | String |  |  | nullable |
| 8 | approveStatus | 审批状态 | APPROVE_STATUS | int | Integer |  |  | nullable |
| 9 | country | 国家地区 | country | quote | bd.country.CountryVO |  |  | nullable |
| 10 | slipmasterId | 工资条id | SLIPMASTER_ID | text | String |  |  | nullable |
| 11 | duplicate | 是否复制 | DUPLICATE | int | Integer |  |  | nullable |
| 12 | pkBonusDistribute | 按次发放ID | PK_BONUS_DISTRIBUTE | text | String |  |  | nullable |
| 13 | payFlag | 是否发放 | PAY_FLAG | text | String |  |  | nullable |
| 14 | submitter | 提交人 | SUBMITTER | text | String |  |  | nullable |
| 15 | approveMemo | 审批备注 | APPROVE_MEMO | text | String |  |  | nullable |
| 16 | duplicateId | 复制发放单的主键 | DUPLICATE_ID | text | String |  |  | nullable |
| 17 | payKind | 发放种类 | PAY_KIND | text | String |  |  | nullable |
| 18 | instanceId | 流程实例主键 | INSTANCEID | text | String |  |  | nullable |
| 19 | segmentAccount | 是否分段 | SEGMENT_ACCOUNT | text | String |  |  | nullable |
| 20 | overFlag | 是否结算 | OVER_FLAG | text | String |  |  | nullable |
| 21 | busiOrgVid | 组织VID | BUSIORGVID | quote | org.func.AdminOrgTimeline |  |  | nullable |
| 22 | billStatus | 状态 | BILL_STATUS | text | String |  |  | nullable |
| 23 | currency | 币种ID | CURRENCY | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 24 | busiOrg | 组织ID | BUSIORG | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 25 | exchangeRateType | 汇率类型ID | EXCHANGE_RATE_TYPE | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 26 | payPeriod | 发薪期间ID | PAY_PERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 27 | quotationDate | 汇率截止日期 | QUOTATION_DATE | int | Integer |  |  | nullable |
| 28 | pkWaSchemeVersion | 发薪方案版本id | PK_WA_SCHEME_VERSION | quote | hrxc.scheme.WaSchemeVersion |  |  | nullable |
| 29 | taxYear | 纳税年份 | TAX_YEAR | int | Integer |  |  | nullable |
| 30 | taxMonth | 纳税月份 | TAX_MONTH | int | Integer |  |  | nullable |
| 31 | payDate | 发薪日期 | PAYDATE | timestamp | Timestamp |  |  | nullable |
| 32 | code | 发放单编码 | CODE | text | String |  |  | isCode,nullable |
| 33 | name | 发放单名称 | NAME | multiLanguage | String | Y |  | nullable |
| 34 | memo | 发放说明 | MEMO | text | String |  |  | nullable |
| 35 | payNums | 发薪人数 | PAYNUMS | int | Integer |  |  | nullable |
| 36 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 37 | totals | 应发合计 | TOTALS | number | Decimal |  |  | nullable |
| 38 | actualTotals | 实发合计 | ACTUAL_TOTALS | number | Decimal |  |  | nullable |
| 39 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 40 | returncount | 发放单退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 41 | billTypeId | 单据类型 | bill_type_id | quote | bd.bill.BillTypeVO |  |  | nullable |
| 42 | billTypeCode | 退回次数 | bill_type_code | text | String |  |  | nullable |
| 43 | transiTypeId | 交易类型ID | transi_type_id | quote | bd.bill.TransType |  |  | data_auth,isTransactionType,nullable |
| 44 | cancelReason | 取消原因 | CANCEL_REASON | text | String |  |  | nullable |
| 45 | transiTypeCode | 交易类型编码 | transi_type_code | text | String |  |  | nullable |
| 46 | status | 单据状态 | status | short | Short |  |  | nullable |
| 47 | id | id | ID | text | String |  |  | nullable,REF.ID |
| 48 | dr | 删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 49 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 50 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 51 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 52 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 53 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 54 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 55 | yTenantId | 友户通租户 | ytenant_id | text | String |  |  | nullable |
| 56 | tenant | 薪资发放单租户 | TENANTID | text | String |  | Y | nullable,uiHide |
| 57 | adjustOpt | 薪资发放单明细个别调整优化 | - | - | hrxc.payfile.WaPayfileDeatilAdjustOptimize |  |  |  |
| 58 | attachlist | 附件 | attachlist | attachment | String |  |  | nullable |
| 59 | backtrackDetails | 发放单追溯事件明细 | - | - | hrxc.payfile.PayfileEventItemDetail |  |  |  |
| 60 | backtrackResults | 发放单追溯结果 | - | - | hrxc.payfile.PayfileEventItemResult |  |  |  |
| 61 | basePeriod | 基准期间 | BASE_PERIOD | text | String |  |  | nullable |
| 62 | defines | 薪资发放单自定义项 | - | - | hrxc.payfile.WaPayfileDefine |  |  |  |
| 63 | dispenses | 薪资分摊发放单关联 | - | - | hrxc.payfile.SalaryApportionDispense |  |  |  |
| 64 | docs | 发放单人员档案 | - | - | hrxc.payfile.WaPayfileDoc |  |  |  |
| 65 | items | 发薪项目 | - | - | hrxc.payfile.WaPayfileItem |  |  |  |
| 66 | payments | 银行支付单 | - | - | hrxc.payfile.WaPayment |  |  |  |
| 67 | taxPeriod | 纳税期间 | TAX_PERIOD | text | String |  |  | nullable |

---

## Reference Fields (14)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | salaryGroupId | 薪资核算组主键 | salary_group_id | hrxc.salaryAccount.WaSalaryAccountGroup |
| 2 | pkWaScheme | 薪资方案ID | PK_WA_SCHEME | hrxc.scheme.WaSchemeAuth |
| 3 | country | 国家地区 | country | bd.country.CountryVO |
| 4 | busiOrgVid | 组织VID | BUSIORGVID | org.func.AdminOrgTimeline |
| 5 | currency | 币种ID | CURRENCY | bd.currencytenant.CurrencyTenantVO |
| 6 | busiOrg | 组织ID | BUSIORG | org.func.AdminOrg |
| 7 | exchangeRateType | 汇率类型ID | EXCHANGE_RATE_TYPE | bd.exchangeRate.ExchangeRateTypeVO |
| 8 | payPeriod | 发薪期间ID | PAY_PERIOD | hrxc.period.PeriodDetail |
| 9 | pkWaSchemeVersion | 发薪方案版本id | PK_WA_SCHEME_VERSION | hrxc.scheme.WaSchemeVersion |
| 10 | billTypeId | 单据类型 | bill_type_id | bd.bill.BillTypeVO |
| 11 | transiTypeId | 交易类型ID | transi_type_id | bd.bill.TransType |
| 12 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 13 | creator | 创建人 | CREATOR | base.user.BipUser |
| 14 | modifier | 修改人 | MODIFIER | base.user.BipUser |

---

## Child Tables (8)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | dispenses | 薪资分摊发放单关联 | hrxc.payfile.SalaryApportionDispense |
| 2 | docs | 发放单人员档案 | hrxc.payfile.WaPayfileDoc |
| 3 | payments | 银行支付单 | hrxc.payfile.WaPayment |
| 4 | backtrackResults | 发放单追溯结果 | hrxc.payfile.PayfileEventItemResult |
| 5 | adjustOpt | 薪资发放单明细个别调整优化 | hrxc.payfile.WaPayfileDeatilAdjustOptimize |
| 6 | items | 发薪项目 | hrxc.payfile.WaPayfileItem |
| 7 | backtrackDetails | 发放单追溯事件明细 | hrxc.payfile.PayfileEventItemDetail |
| 8 | defines | 薪资发放单自定义项 | hrxc.payfile.WaPayfileDefine |

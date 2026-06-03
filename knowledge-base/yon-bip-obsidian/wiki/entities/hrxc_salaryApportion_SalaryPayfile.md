---
tags: [BIP, metadata, hrxc, SalaryPayfile]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资分摊薪资发放单 (hrxc.salaryApportion.SalaryPayfile)

> Platform: BIP V5 | Table: wa_payfile | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资分摊薪资发放单 |
| uri | hrxc.salaryApportion.SalaryPayfile |
| tableName | wa_payfile |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

---

## All Fields (36)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | approveMemo | 审批备注 | APPROVE_MEMO | text | String |  |  | nullable |
| 2 | approveStatus | 审批状态 | APPROVE_STATUS | int | Integer |  |  | nullable |
| 3 | billStatus | 单据状态 | BILL_STATUS | text | String |  |  | nullable |
| 4 | code | 编码 | CODE | text | String |  |  | isCode,nullable |
| 5 | duplicate | 是否复制 | DUPLICATE | int | Integer |  |  | nullable |
| 6 | duplicateId | 复制发放单的主键 | DUPLICATE_ID | text | String |  |  | nullable |
| 7 | instanceId | 流程实例主键 | INSTANCEID | text | String |  |  | nullable |
| 8 | memo | 说明 | MEMO | text | String |  |  | nullable |
| 9 | name | 发放单名称 | NAME | text | String |  |  | isName,nullable |
| 10 | overFlag | 0:未结算 1:已结算 | OVER_FLAG | int | Integer |  |  | nullable |
| 11 | payFlag | 0:未发放 1:已发放 | PAY_FLAG | int | Integer |  |  | nullable |
| 12 | payKind | 发放种类:0 按月,1 按次 | PAY_KIND | int | Integer |  |  | nullable |
| 13 | payPeriod | 发薪期间 | PAY_PERIOD | text | String |  |  | nullable |
| 14 | payDate | 发薪日期 | PAYDATE | timestamp | Timestamp |  |  | nullable |
| 15 | payment_status | 支付状态 | payment_status | int | Integer |  |  | nullable |
| 16 | paynums | 发薪人数 | PAYNUMS | int | Integer |  |  | nullable |
| 17 | pkBonusDistribute | 按次发放主键 | PK_BONUS_DISTRIBUTE | text | String |  |  | nullable |
| 18 | pkWaScheme |  | PK_WA_SCHEME | text | String |  |  | nullable |
| 19 | pkWaSchemeVersion |  | PK_WA_SCHEME_VERSION | text | String |  |  | nullable |
| 20 | segmentAccount | 0:不分段 1:是分段 | SEGMENT_ACCOUNT | int | Integer |  |  | nullable |
| 21 | slipmasterId | 工资条id | SLIPMASTER_ID | text | String |  |  | nullable |
| 22 | submitter | 提交人 | SUBMITTER | text | String |  |  | nullable |
| 23 | taxMonth | 纳税月份 | TAX_MONTH | int | Integer |  |  | nullable |
| 24 | taxYear | 纳税年份 | TAX_YEAR | int | Integer |  |  | nullable |
| 25 | totals | 应发合计 | TOTALS | number | Decimal |  |  | nullable |
| 26 | actualTotals | 实发合计 | ACTUAL_TOTALS | number | Decimal |  |  | nullable |
| 27 | currency | 本币 | CURRENCY | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 28 | id | 主键 | ID | text | String |  |  | nullable |
| 29 | dr | 逻辑删除标识 | DR | int | Integer |  |  | nullable |
| 30 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable |
| 31 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 32 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 33 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 34 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 35 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 36 | tenant | 租户主键(旧) | TENANTID | text | String |  |  | nullable |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | currency | 本币 | CURRENCY | bd.currencytenant.CurrencyTenantVO |
| 2 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 3 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

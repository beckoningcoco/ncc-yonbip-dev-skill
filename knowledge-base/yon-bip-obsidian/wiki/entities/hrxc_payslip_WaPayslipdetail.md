---
tags: [BIP, metadata, hrxc, WaPayslipdetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工资条主表 (hrxc.payslip.WaPayslipdetail)

> Platform: BIP V5 | Table: wa_payslipdetail | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 工资条主表 |
| uri | hrxc.payslip.WaPayslipdetail |
| tableName | wa_payslipdetail |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (41)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkPayslipMaster | Payslipmaster主键 | pk_payslipmaster | text | String |  |  | nullable |
| 2 | pkPeriod | period主键 | pk_period | text | String |  |  | nullable |
| 3 | cyear | 年 | cyear | text | String |  |  | nullable |
| 4 | cperiod | 期间 | cperiod | text | String |  |  | nullable |
| 5 | pkWaclass | waclass主键 | pk_waclass | text | String |  |  | nullable |
| 6 | pkPersion | 员工主键 | pk_persion | text | String |  |  | nullable |
| 7 | staffCode | 员工编码 | staffcode | text | String |  |  | nullable |
| 8 | staffName | 员工姓名 | staffname | text | String |  |  | nullable |
| 9 | telNo | 员工电话 | telno | text | String |  |  | nullable |
| 10 | email | 邮箱 | email | text | String |  |  | nullable |
| 11 | orgName | 组织名 | orgname | text | String |  |  | nullable |
| 12 | amtPayable | 应发工资 | amt_payable | number | Decimal |  |  | nullable |
| 13 | amtReality | 实发工资 | amt_reality | number | Decimal |  |  | nullable |
| 14 | amtDeduct | 扣款 | amt_deduct | number | Decimal |  |  | nullable |
| 15 | amtDeductTax | 扣税 | amt_deduct_tax | number | Decimal |  |  | nullable |
| 16 | payDatas | 支付数据 | paydatas | text | String |  |  | nullable |
| 17 | decimals | 小数位数 | decimals | text | String |  |  | nullable |
| 18 | isLock | 是否上锁 | islock | text | String |  |  | nullable |
| 19 | isPay | 是否支付 | ispay | text | String |  |  | nullable |
| 20 | payDate | 支付日期 | paydate | timestamp | Timestamp |  |  | nullable |
| 21 | payType | 支付类型 | paytype | text | String |  |  | nullable |
| 22 | isRead | 是否可读 | isread | text | String |  |  | nullable |
| 23 | checkResult | 检查结果 | check_result | text | String |  |  | nullable |
| 24 | memo | 备注 | MEMO | text | String |  |  | nullable |
| 25 | displayOrder | 展示顺序 | displayorder | int | Integer |  |  | nullable |
| 26 | ispayEmail | 是否支付邮箱 | ispay_email | text | String |  |  | nullable |
| 27 | ispaySms | 是否支付sms | ispay_sms | text | String |  |  | nullable |
| 28 | ispayApp | 是否支付app | ispay_app | text | String |  |  | nullable |
| 29 | staffId | 员工主键 | staff_id | text | String |  |  | nullable |
| 30 | sendDesc | 发送描述 | senddesc | text | String |  |  | nullable |
| 31 | overFlag | 0:未结算 1:已结算 2:已确认 | over_flag | int | Integer |  |  | nullable |
| 32 | pkPayfileDoc | 薪资发放单明细主键 | pk_payfile_doc | text | String |  |  | nullable |
| 33 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 34 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 35 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 36 | ytenant | 租户主键 | ytenant_id | text | String |  |  | nullable |
| 37 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 38 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 39 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 40 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 41 | tenant | 租户主键(旧) | tenantid | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | CREATOR | base.user.BipUser |
| 2 | modifier | 修改人 | MODIFIER | base.user.BipUser |

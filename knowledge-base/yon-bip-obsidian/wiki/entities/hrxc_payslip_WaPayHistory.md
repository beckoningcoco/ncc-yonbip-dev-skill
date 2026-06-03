---
tags: [BIP, metadata, hrxc, WaPayHistory]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 支付历史 (hrxc.payslip.WaPayHistory)

> Platform: BIP V5 | Table: wa_payhistory | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 支付历史 |
| uri | hrxc.payslip.WaPayHistory |
| tableName | wa_payhistory |
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

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | cperiod | 期间 | cperiod | text | String |  |  | nullable |
| 2 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 3 | creator | 创建者 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 4 | cyear | 年 | cyear | text | String |  |  | nullable |
| 5 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 6 | headcontent | 头内容 | headcontent | text | String |  |  | nullable |
| 7 | id | id | ID | text | String |  |  | nullable,REF.ID |
| 8 | memo | 备注 | MEMO | text | String |  |  | nullable |
| 9 | modifier | 修改者 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 10 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 11 | payCnt | 发薪人数 | paycnt | int | Integer |  |  | nullable |
| 12 | payType | 支付类型 | paytype | text | String |  |  | nullable |
| 13 | payer | 显示顺序 | payer | int | Integer |  |  | nullable |
| 14 | payername | period主键 | payername | text | String |  |  | nullable |
| 15 | paystate | period主键 | paystate | text | String |  |  | nullable |
| 16 | paytime | period主键 | paytime | text | String |  |  | nullable |
| 17 | pkPayslipMaster | Payslipmaster主键 | pk_payslipmaster | text | String |  |  | nullable |
| 18 | pkWaclass | waclass主键 | pk_waclass | text | String |  |  | nullable |
| 19 | pubts | ts | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 20 | tailcontent | 尾内容 | tailcontent | text | String |  |  | nullable |
| 21 | tenant | 租户ID | tenantid | text | String |  | Y | nullable,uiHide |
| 22 | waclassName | waclass名称 | waclass_name | text | String |  |  | nullable |
| 23 | ytenant | 租户ID | ytenant_id | text | String |  |  | nullable |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建者 | CREATOR | base.user.BipUser |
| 2 | modifier | 修改者 | MODIFIER | base.user.BipUser |

---
tags: [BIP, metadata, voucher, IBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 当前业务阶段 (voucher.salereturn.IBpmStep)

> Platform: BIP V5 | Module: voucher | Table: salereturn_ibpmstep | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 当前业务阶段 |
| uri | voucher.salereturn.IBpmStep |
| tableName | salereturn_ibpmstep |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 业务阶段 (IBpmStep) | ucfbase.ucfbaseItf.IBpmStep |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | flag | 状态标志位 | flag | text | String |  |  | nullable,uiHide |
| 2 | id | 主键ID | id | long | Long |  |  | nullable,REF.ID |
| 3 | processinstId | 流程实例 | processinstid | text | String |  |  | nullable,uiHide |
| 4 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 5 | saleReturnId | 退货单id | iSaleReturnId | quote | voucher.salereturn.SaleReturn |  |  | nullable |
| 6 | stepId | 业务阶段ID | stepid | quote | bd.businessstep.BusinessStep |  |  | nullable,uiHide |
| 7 | stepLastModify | 业务阶段编码最后修改时间 | stepcode_lastmodify | dateTime | Timestamp |  |  | nullable,uiHide |
| 8 | stepparam | 业务阶段参数 | stepparam | text | String |  |  | nullable,uiHide |
| 9 | taskId | 任务ID | taskid | text | String |  |  | nullable,uiHide |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | saleReturnId | 退货单id | iSaleReturnId | voucher.salereturn.SaleReturn |
| 2 | stepId | 业务阶段ID | stepid | bd.businessstep.BusinessStep |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

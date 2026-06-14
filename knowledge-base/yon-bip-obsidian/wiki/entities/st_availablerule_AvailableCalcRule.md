---
tags: [BIP, metadata, st, AvailableCalcRule]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 可用量计算规则 (st.availablerule.AvailableCalcRule)

> Platform: BIP V5 | Module: st | Table: availablecalcrule | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 可用量计算规则 |
| uri | st.availablerule.AvailableCalcRule |
| tableName | availablecalcrule |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户相关 (ITenant) | base.itf.ITenant |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 3 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |

---

## All Fields (50)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | availablestock | 库存 | availablestock | switch | Boolean |  |  | nullable |
| 2 | includeOrderReceipt | 订单预计入 | includeOrderReceipt | switch | Boolean |  |  | nullable |
| 3 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 4 | transferreq | 调拨申请 | transferreq | switch | Boolean |  |  | nullable |
| 5 | includeScheduledReceipt | 收货预计入 | includeScheduledReceipt | switch | Boolean |  |  | nullable |
| 6 | includeOrderOccupation | 订单预计出 | includeOrderOccupation | switch | Boolean |  |  | nullable |
| 7 | includePickingOccupation | 发货预计出 | includePickingOccupation | switch | Boolean |  |  | nullable |
| 8 | name | 名称 | name | multiLanguage | String |  |  | isGlobalization,isName,nullable,REF.NAME |
| 9 | transferapplyin | 调拨订单 | transferapplyin | switch | Boolean |  |  | nullable |
| 10 | pofreport | 完工报告 | pofreport | switch | Boolean |  |  | nullable |
| 11 | salesorder | 销售订单 | salesorder | switch | Boolean |  |  | nullable |
| 12 | delivery | 发货单 | delivery | switch | Boolean |  |  | nullable |
| 13 | usecase | 使用场景 | usecase | - | st.availablerule.StockUsecase |  |  | nullable |
| 14 | poin | 生产订单 | poin | switch | Boolean |  |  | nullable |
| 15 | arrivalorder | 采购到货 | arrivalorder | switch | Boolean |  |  | nullable |
| 16 | poout | 生产订单 | poout | switch | Boolean |  |  | nullable |
| 17 | materialreq | 领料申请 | materialreq | switch | Boolean |  |  | nullable |
| 18 | sddatemch | 供需日期匹配 | sddatemch | - | st.availablerule.SDDateMch |  |  | nullable |
| 19 | posubin | 委外订单 | posubin | switch | Boolean |  |  | nullable |
| 20 | posubout | 委外订单 | posubout | switch | Boolean |  |  | nullable |
| 21 | pickingreq | 出库申请 | pickingreq | switch | Boolean |  |  | nullable |
| 22 | sddimch | 供需维度匹配 | sddimch | text | String |  |  | nullable |
| 23 | applyorder | 请购单 | applyorder | switch | Boolean |  |  | nullable |
| 24 | posubarrivalorder | 委外到货 | posubarrivalorder | switch | Boolean |  |  | nullable |
| 25 | transferapplyout | 调拨订单 | transferapplyout | switch | Boolean |  |  | nullable |
| 26 | memo | 备注 | memo | text | String |  |  | nullable |
| 27 | purchaseorder | 采购退货 | purchaseorder | switch | Boolean |  |  | nullable |
| 28 | returnorder | 采购退货 | returnorder | switch | Boolean |  |  | nullable |
| 29 | tradedelivery | 电商发货单 | tradedelivery | switch | Boolean |  |  | nullable |
| 30 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 31 | salereturn | 销售退货 | salereturn | switch | Boolean |  |  | nullable |
| 32 | tradeorder | 电商订单 | tradeorder | switch | Boolean |  |  | nullable |
| 33 | retailTrade | 零售单 | retailTrade | switch | Boolean |  |  | nullable |
| 34 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 35 | aimequipcard | 资产卡片(发货预计出) | aimequipcard | switch | Boolean |  |  | nullable |
| 36 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 37 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 38 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 39 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 40 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 41 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 42 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 43 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 44 | morphologyconversionout | 形态转换单（转出） | morphologyconversionout | switch | Boolean |  |  | nullable |
| 45 | reservedArrival | 预留收货预计入(收货预计入) | reservedArrival | switch | Boolean |  |  | nullable |
| 46 | reservedShipping | 预留发货预计出(发货预计出) | reservedShipping | switch | Boolean |  |  | nullable |
| 47 | storenotice | 入库通知 | storenotice | switch | Boolean |  |  | nullable |
| 48 | storetransout | 转库（转出） | storetransout | switch | Boolean |  |  | nullable |
| 49 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 50 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creatorId | 创建人 | creatorId | base.user.User |
| 2 | modifierId | 修改人 | modifierId | base.user.User |
| 3 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createDate | 创建日期 | create_date | date |
| 2 | modifyDate | 修改日期 | modify_date | date |

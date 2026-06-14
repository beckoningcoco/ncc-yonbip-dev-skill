---
tags: [BIP, metadata, st, OsmInRecordExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 委外入库单主表平行表 (st.osminrecord.OsmInRecordExtend)

> Platform: BIP V5 | Module: st | Table: st_osminrecord_extend | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 委外入库单主表平行表 |
| uri | st.osminrecord.OsmInRecordExtend |
| tableName | st_osminrecord_extend |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (7)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | 委外入库单主表id | id | quote | st.osminrecord.OsmInRecord |  |  | nullable,REF.ID |
| 2 | isgodownentry | 是否采购对账 | is_godownentry | switch | Boolean |  |  | nullable |
| 3 | sourceVoucherType | 来源单据类型 | sourceVoucherType | quote | bd.bill.BillTypeVO |  |  | nullable |
| 4 | srcVoucherTypeBillNO | 来源单据编号 | srcVoucherTypeBillNO | text | String |  |  | nullable |
| 5 | tcOrgAccount | 跨组织委外结算 | tc_org_account | short | Short |  |  | nullable |
| 6 | tradeRouteID | 贸易路径 | trade_route_id | quote | sccs.multitrade.TradeRoute |  |  | nullable |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | id | 委外入库单主表id | id | st.osminrecord.OsmInRecord |
| 2 | sourceVoucherType | 来源单据类型 | sourceVoucherType | bd.bill.BillTypeVO |
| 3 | tradeRouteID | 贸易路径 | trade_route_id | sccs.multitrade.TradeRoute |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | tcOrgAccount | 跨组织委外结算 | tc_org_account | short |

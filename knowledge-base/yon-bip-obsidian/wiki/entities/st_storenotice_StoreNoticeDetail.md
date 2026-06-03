---
tags: [BIP, metadata, st, StoreNoticeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 入库通知单子表 (st.storenotice.StoreNoticeDetail)

> Platform: BIP V5 | Module: st | Table: st_storenotice_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 入库通知单子表 |
| uri | st.storenotice.StoreNoticeDetail |
| tableName | st_storenotice_b |
| domain | ustock |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (6)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 3 | 规格 (FreeItem) | base.itf.FreeItem |
| 4 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 5 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 6 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (80)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | product | 商品id | iProductid | quote | pc.product.Product |  |  | data_auth,nullable,dataPowerFlag |
| 2 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 3 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 4 | isGift | 赠品 | isGift | switch | Boolean |  |  | nullable |
| 5 | productsku | SKU | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 6 | storeNoticeDetailCharacteristics | 自由项特征组 | storeNoticeDetailCharacteristics | FreeCT | st.storenotice.StoreNoticeDetailCharacteristics |  |  | nullable |
| 7 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 8 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 9 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 10 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 11 | free5 | 商品规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 12 | free6 | 商品规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 13 | free7 | 商品规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 14 | free8 | 商品规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 15 | free9 | 商品规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 16 | free10 | 商品规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 17 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 18 | totalBillNatSum | 累计开票本币含税金额 | totalBillNatSum | number | Decimal |  |  | nullable |
| 19 | unit | 单位id | iunitid | quote | pc.unit.Unit |  |  | nullable |
| 20 | stockUnitId | 库存单位id | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 21 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 22 | mainid | 主表id | imainid | quote | st.storenotice.StoreNotice |  |  | nullable |
| 23 | qty | 通知数量 | dqty | number | Decimal |  |  | nullable,isCalcQty |
| 24 | subQty | 件数 | subQty | number | Decimal |  |  | nullable,isCalcQty |
| 25 | inqty | 累计入库数量 | dinqty | number | Decimal |  |  | nullable |
| 26 | closeqty | 已关闭数量 | dcloseqty | number | Decimal |  |  | nullable |
| 27 | batchno | 批号 | sBatchNo | text | String |  |  | nullable |
| 28 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 29 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 30 | oriUnitPrice | 无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 31 | oriTaxUnitPrice | 含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 32 | oriMoney | 无税金额 | oriMoney | number | Decimal |  |  |  |
| 33 | oriSum | 含税金额 | oriSum | number | Decimal |  |  |  |
| 34 | totalBillOriSum | 累计开票含税金额 | totalBillOriSum | number | Decimal |  |  | nullable |
| 35 | memo | 备注 | cmemo | text | String |  |  | nullable |
| 36 | srcBillRow | 来源上级单据ID | csrcbillbid | text | String |  |  | nullable |
| 37 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 38 | srcTopRow | 来源顶级单据ID | csrctopbid | text | String |  |  | nullable |
| 39 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 40 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 41 | natUnitPrice | 无税单价 | natUnitPrice | number | Decimal |  |  |  |
| 42 | natMoney | 无税金额 | natMoney | number | Decimal |  |  |  |
| 43 | natTaxUnitPrice | 含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 44 | natSum | 含税金额 | natSum | number | Decimal |  |  |  |
| 45 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 46 | oriTax | 税额 | oriTax | number | Decimal |  |  |  |
| 47 | define1 | 批次属性1 | define1 | text | String |  |  | isGlobalization,nullable |
| 48 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 49 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 50 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 51 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 52 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 53 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 54 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 55 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 56 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 57 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 58 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 59 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 60 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 61 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 62 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 63 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 64 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 65 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 66 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 67 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 68 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 69 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 70 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 71 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 72 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 73 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 74 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 75 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 76 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 77 | bodyItem | 入库通知单子表自定义项 | - | - | st.storenotice.StoreNoticeDetailCustomItem |  |  |  |
| 78 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 79 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 80 | storeNoticeDetailSNs | 入库通知单序列号 | - | - | st.storenotice.StoreNoticeDetailSN |  |  |  |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | product | 商品id | iProductid | pc.product.Product |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 4 | productsku | SKU | iProductSkuid | pc.product.ProductSKU |
| 5 | unit | 单位id | iunitid | pc.unit.Unit |
| 6 | stockUnitId | 库存单位id | stockUnitId | pc.unit.Unit |
| 7 | mainid | 主表id | imainid | st.storenotice.StoreNotice |

---

## Number Fields (21)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | natTax | 本币税额 | natTax | number |
| 2 | totalBillNatSum | 累计开票本币含税金额 | totalBillNatSum | number |
| 3 | invExchRate | 换算率 | invExchRate | number |
| 4 | qty | 通知数量 | dqty | number |
| 5 | subQty | 件数 | subQty | number |
| 6 | inqty | 累计入库数量 | dinqty | number |
| 7 | closeqty | 已关闭数量 | dcloseqty | number |
| 8 | oriUnitPrice | 无税单价 | oriUnitPrice | number |
| 9 | oriTaxUnitPrice | 含税单价 | oriTaxUnitPrice | number |
| 10 | oriMoney | 无税金额 | oriMoney | number |
| 11 | oriSum | 含税金额 | oriSum | number |
| 12 | totalBillOriSum | 累计开票含税金额 | totalBillOriSum | number |
| 13 | rowno | 行号 | rowno | int |
| 14 | natUnitPrice | 无税单价 | natUnitPrice | number |
| 15 | natMoney | 无税金额 | natMoney | number |
| 16 | natTaxUnitPrice | 含税单价 | natTaxUnitPrice | number |
| 17 | natSum | 含税金额 | natSum | number |
| 18 | taxRate | 税率 | taxRate | number |
| 19 | oriTax | 税额 | oriTax | number |
| 20 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 21 | invExchRateNum | 换算率分子 | invexchratenum | number |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeNoticeDetailSNs | 入库通知单序列号 | st.storenotice.StoreNoticeDetailSN |
| 2 | bodyItem | 入库通知单子表自定义项 | st.storenotice.StoreNoticeDetailCustomItem |

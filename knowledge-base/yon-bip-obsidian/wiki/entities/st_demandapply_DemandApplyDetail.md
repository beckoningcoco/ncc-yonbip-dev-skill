---
tags: [BIP, metadata, st, DemandApplyDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调拨申请单子表 (st.demandapply.DemandApplyDetail)

> Platform: BIP V5 | Module: st | Table: st_demandapply_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调拨申请单子表 |
| uri | st.demandapply.DemandApplyDetail |
| tableName | st_demandapply_b |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |
| description | 调拨申请单子表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (15)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 规格 (FreeItem) | base.itf.FreeItem |
| 3 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 4 | 行关闭信息 (ILineClosing) | base.itf.ILineClosing |
| 5 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 6 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 7 | 预留双向 (IReservationInOut) | st.reservation.IReservationInOut |
| 8 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 9 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 10 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 11 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 12 | 租户相关 (ITenant) | base.itf.ITenant |
| 13 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 14 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 15 | 外部来源行线索 (IOutSysObjLineClue) | base.itf.IOutSysObjLineClue |

---

## All Fields (114)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | isLineClose | 是否行关闭 | isLineClose | switch | Boolean |  |  | nullable |
| 2 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 3 | demandApplyDetailDefineCharacter | 自定义项特征组 | demandApplyDetailDefineCharacter | UserDefine | st.demandapply.DemandApplyDetailDefineCharacter |  |  | nullable |
| 4 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 5 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 6 | demandapply | 主表id | idemandapplyid | quote | st.demandapply.DemandApply |  |  | nullable |
| 7 | free8 | 规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 8 | transferReturnQuantity | 已退货调拨订单数量 | transfer_return_quantity | number | Decimal |  |  | nullable |
| 9 | erpqty | 总仓可用量 | erpqty | number | Decimal |  |  | nullable |
| 10 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 11 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 12 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 13 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 14 | out_sys_rowno | 外部来源行号 | out_sys_rowno | text | String |  |  | nullable |
| 15 | out_sys_lineid | 外部来源行 | out_sys_lineid | text | String |  |  | nullable |
| 16 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 17 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 18 | product | 商品id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 19 | demandApplyDetailCharacteristics | 自由项特征组 | demandApplyDetailCharacteristics | FreeCT | st.demandapply.DemandApplyDetailCharacteristics |  |  | nullable |
| 20 | finishinqty | 已入库数量 | fFinishInQty | number | Decimal |  |  | nullable |
| 21 | finishinnum | 已入库件数 | fFinishInNum | number | Decimal |  |  | nullable |
| 22 | finishoutqty | 已出库数量 | fFinishOutQty | number | Decimal |  |  | nullable |
| 23 | finishoutnum | 已出库件数 | fFinishOutNum | number | Decimal |  |  | nullable |
| 24 | markPriceRate | 建议零售价换算率 | productskumprate | number | Decimal |  |  | nullable |
| 25 | markPrice | 建议零售价 | productskumarkprice | number | Decimal |  |  | nullable |
| 26 | iunitId | 单位主键 | iunitId | quote | pc.unit.Unit |  |  | nullable |
| 27 | productsku | sku | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 28 | currentQty | 库存量 | dCurrentQty | number | Decimal |  |  | nullable |
| 29 | free1 | 物料规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 30 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 31 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 32 | free4 | 物料规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 33 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 34 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 35 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 36 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 37 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 38 | outreserveid | 调出预留对象 | outreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 39 | inreserveid | 调入预留对象 | inreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 40 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 41 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 42 | productStyle | 款式ID | productstyle | quote | pc.product.Product |  |  | nullable |
| 43 | num | 数量(废弃) | dnum | number | Decimal |  |  | nullable |
| 44 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 45 | unit | 主计量id | unit | quote | pc.unit.Unit |  |  | nullable |
| 46 | unitName | 主计量 | iunitName | text | String |  |  | nullable |
| 47 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 48 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 49 | stockUnitId | 库存单位id | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 50 | approvePcs | 已批复数量 | dapprovePcs | number | Decimal |  |  | nullable |
| 51 | approveNum | 已批复件数 | dapprovenum | number | Decimal |  |  | nullable |
| 52 | transferNum | 已调拨数量 | transfernum | number | Decimal |  |  | nullable |
| 53 | recieveDate | 希望到货日期 | recievedate | date | Date |  |  | nullable |
| 54 | saleQty | 销量 | dSaleQty | number | Decimal |  |  | nullable |
| 55 | innoticeQty | 在途量 | dInnoticeQty | number | Decimal |  |  | nullable |
| 56 | erpnum | 总仓库存 | erpnum | number | Decimal |  |  | nullable |
| 57 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 58 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 59 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 60 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 61 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 62 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 63 | linecloseTime | 行关闭时间 | lineclose_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 64 | linecloser | 行关闭人 | linecloser | text | String |  |  | isGlobalization,nullable |
| 65 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 66 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 67 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 68 | source | 来源单据类型 | source | text | String |  |  | nullable,reportHide |
| 69 | upcode | 来源单据 | upcode | text | String |  |  | nullable |
| 70 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 71 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 72 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 73 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 74 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 75 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 76 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 77 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 78 | sourceMainPubts | 来源主表时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 79 | groupTaskKey | 分组任务key | groupTaskKey | text | String |  |  | nullable,reportHide |
| 80 | bodyItem | 调拨申请单子表自定义项 | - | - | st.demandapply.DemandApplyDetailCustomItem |  |  |  |
| 81 | bodyParallel | 调拨申请单子表平行表 | - | - | st.demandapply.DemandApplyDetailParallel |  |  |  |
| 82 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 83 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 84 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 85 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 86 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 87 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 88 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 89 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 90 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 91 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 92 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 93 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 94 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 95 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 96 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 97 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 98 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 99 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 100 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 101 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 102 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 103 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 104 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 105 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 106 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 107 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 108 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 109 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 110 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 111 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 112 | defines | 调拨申请单子表自由自定义项 | - | - | st.demandapply.DemandapplyAttrextItems |  |  |  |
| 113 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 114 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |

---

## Reference Fields (18)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 2 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 3 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 4 | demandapply | 主表id | idemandapplyid | st.demandapply.DemandApply |
| 5 | productn | 物料 | iProductid | pc.product.Product |
| 6 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 7 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 8 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 10 | product | 商品id | iProductid | pc.aa.Product |
| 11 | iunitId | 单位主键 | iunitId | pc.unit.Unit |
| 12 | productsku | sku | iProductSkuid | pc.aa.ProductSKU |
| 13 | outreserveid | 调出预留对象 | outreserveid | st.reservation.Reservation |
| 14 | inreserveid | 调入预留对象 | inreserveid | st.reservation.Reservation |
| 15 | productStyle | 款式ID | productstyle | pc.product.Product |
| 16 | unit | 主计量id | unit | pc.unit.Unit |
| 17 | stockUnitId | 库存单位id | stockUnitId | pc.unit.Unit |
| 18 | project | 项目id | iProject | bd.project.ProjectVO |

---

## Number Fields (27)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | transferReturnQuantity | 已退货调拨订单数量 | transfer_return_quantity | number |
| 2 | erpqty | 总仓可用量 | erpqty | number |
| 3 | lineno | 行号 | lineno | number |
| 4 | finishinqty | 已入库数量 | fFinishInQty | number |
| 5 | finishinnum | 已入库件数 | fFinishInNum | number |
| 6 | finishoutqty | 已出库数量 | fFinishOutQty | number |
| 7 | finishoutnum | 已出库件数 | fFinishOutNum | number |
| 8 | markPriceRate | 建议零售价换算率 | productskumprate | number |
| 9 | markPrice | 建议零售价 | productskumarkprice | number |
| 10 | currentQty | 库存量 | dCurrentQty | number |
| 11 | num | 数量(废弃) | dnum | number |
| 12 | qty | 数量 | qty | number |
| 13 | invExchRate | 换算率 | invExchRate | number |
| 14 | subQty | 件数 | subQty | number |
| 15 | approvePcs | 已批复数量 | dapprovePcs | number |
| 16 | approveNum | 已批复件数 | dapprovenum | number |
| 17 | transferNum | 已调拨数量 | transfernum | number |
| 18 | saleQty | 销量 | dSaleQty | number |
| 19 | innoticeQty | 在途量 | dInnoticeQty | number |
| 20 | erpnum | 总仓库存 | erpnum | number |
| 21 | rowno | 行号 | rowno | int |
| 22 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 23 | uplineno | 来源单据行号 | uplineno | number |
| 24 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 25 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 26 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 27 | invExchRateNum | 换算率分子 | invexchratenum | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |
| 3 | recieveDate | 希望到货日期 | recievedate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 调拨申请单子表自定义项 | st.demandapply.DemandApplyDetailCustomItem |
| 2 | bodyParallel | 调拨申请单子表平行表 | st.demandapply.DemandApplyDetailParallel |
| 3 | defines | 调拨申请单子表自由自定义项 | st.demandapply.DemandapplyAttrextItems |

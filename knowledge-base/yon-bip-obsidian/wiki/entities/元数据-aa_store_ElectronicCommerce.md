---
tags: [BIP, 元数据, 数据字典, aa.store.ElectronicCommerce]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 电商业务 (`aa.store.ElectronicCommerce`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_electroniccommerce` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（116 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `platType` | platType | `plat_type` | PlatformType | `` |
| 2 | `store` | store | `iStoreId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 3 | `shopCode` | shop编码 | `shop_code` | String | `text` |
| 4 | `shopName` | shop名称 | `shop_name` | String | `text` |
| 5 | `appKey` | appKey | `appkey` | String | `text` |
| 6 | `invoiceType` | invoiceType | `invoice_type` | String | `text` |
| 7 | `dwtradetype` | dwtradetype | `dwtradetype` | String | `text` |
| 8 | `isAutoAccessOrder` | 是否AutoAccessOrder | `isAutoAccessOrder` | Boolean | `switch` |
| 9 | `secret` | secret | `secret` | String | `text` |
| 10 | `autoMergerDelivery` | autoMergerDelivery | `auto_merger_delivery` | Boolean | `switch` |
| 11 | `token` | token | `token` | String | `text` |
| 12 | `autoMatchWarehouse` | autoMatchWarehouse | `auto_match_warehouse` | Boolean | `switch` |
| 13 | `refresh_token` | refresh_token | `refreshToken` | String | `text` |
| 14 | `autoMatchLogistics` | autoMatchLogistics | `auto_match_logistics` | Boolean | `switch` |
| 15 | `authStatus` | authStatus | `auth_status` | EnumAuth | `` |
| 16 | `autoMatchWarehouseByInv` | autoMatchWarehouseByInv | `auto_match_warehousebyinv` | Boolean | `switch` |
| 17 | `authStartTime` | authStartTime | `auth_start_time` | DateTime | `timestamp` |
| 18 | `autoMatchExpressByWeight` | autoMatchExpressByWeight | `auto_match_expressbyweight` | Boolean | `switch` |
| 19 | `authEndTime` | authEndTime | `auth_end_time` | DateTime | `timestamp` |
| 20 | `shopNick` | shopNick | `shop_nick` | String | `text` |
| 21 | `elemeShopId` | elemeShopID | `eleme_shop_id` | String | `text` |
| 22 | `isModifyAdress` | 是否ModifyAdress | `isModifyAdress` | Boolean | `switch` |
| 23 | `isSplitRefund` | 是否SplitRefund | `isSplitRefund` | Boolean | `switch` |
| 24 | `vendorId` | vendorID | `vendor_id` | Long | `long` |
| 25 | `autoMatchRefund` | autoMatchRefund | `auto_matchRefund` | Boolean | `switch` |
| 26 | `elemePlatShopId` | elemePlatShopID | `eleme_plat_shop_id` | String | `text` |
| 27 | `taxPayer` | taxPayer | `taxPayer` | String | `text` |
| 28 | `cooperationNo` | cooperationNo | `cooperation_no` | String | `text` |
| 29 | `isModifySku` | 是否ModifySku | `isModifySku` | Boolean | `switch` |
| 30 | `isProviderShop` | 是否ProviderShop | `isProviderShop` | Boolean | `switch` |
| 31 | `isAgRefund` | 是否AgRefund | `isAgRefund` | Boolean | `switch` |
| 32 | `accordingTo` | accordingTo | `accordingTo` | String | `text` |
| 33 | `cn_session` | cn_session | `cn_session` | String | `text` |
| 34 | `aftersalerefundonly` | aftersalerefundonly | `aftersalerefundonly` | Boolean | `switch` |
| 35 | `autoDeliveryWarning` | autoDeliveryWarning | `auto_delivery_warning` | Boolean | `switch` |
| 36 | `cn_appkey` | cn_appkey | `cn_appkey` | String | `text` |
| 37 | `cn_secret` | cn_secret | `cn_secret` | String | `text` |
| 38 | `firstRemindInterval` | firstRemindInterval | `first_remind_interval` | String | `text` |
| 39 | `overTime` | overTime | `overtime` | String | `text` |
| 40 | `ys_salesman` | ys_salesman | `ys_salesman` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 41 | `ys_currency` | ys_currency | `ys_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 42 | `trade_transtype` | trade_transtype | `trade_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 43 | `trade_receivable_transtype` | trade_receivable_transtype | `trade_receivable_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 44 | `isSaRefund` | 是否SaRefund | `isSaRefund` | Boolean | `switch` |
| 45 | `storevalue_transtype` | storevalue_transtype | `storevalue_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 46 | `storevalue_receivable_transtype` | storevalue_receivable_transtype | `storevalue_receivable_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 47 | `is_sh_ship` | 是否_sh_ship | `is_sh_ship` | Boolean | `switch` |
| 48 | `refund_transtype` | refund_transtype | `refund_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 49 | `sourceOfReceivables` | sourceOfReceivables | `sourceOfReceivables` | String | `text` |
| 50 | `refund_receivable_transtype` | refund_receivable_transtype | `refund_receivable_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 51 | `memo` | 备注 | `memo` | String | `text` |
| 52 | `applicationOfMaturity` | applicationOfMaturity | `applicationOfMaturity` | Date | `date` |
| 53 | `isDouYinModifyAdress` | 是否DouYinModifyAdress | `isDouYinModifyAdress` | Boolean | `switch` |
| 54 | `customer_code` | customer_code | `customer_code` | String | `text` |
| 55 | `distributorShopType` | distributorShopType | `distributor_shop_type` | Integer | `int` |
| 56 | `returnWarehouse` | returnWarehouse | `return_warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 57 | `providerSettleType` | providerSettleType | `providerSettleType` | String | `text` |
| 58 | `salesType` | salesType | `sales_type` | String | `text` |
| 59 | `shopAccountName` | shopAccount名称 | `shop_account_name` | String | `text` |
| 60 | `businessType` | businessType | `business_type` | String | `text` |
| 61 | `payment_code` | payment_code | `payment_code` | String | `text` |
| 62 | `id` | ID | `id` | Long | `long` |
| 63 | `paymentgathtype_code` | paymentgathtype_code | `paymentgathtype_code` | String | `text` |
| 64 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 65 | `advpmtgathtype_code` | advpmtgathtype_code | `advpmtgathtype_code` | String | `text` |
| 66 | `feegathtype_code` | feegathtype_code | `feegathtype_code` | String | `text` |
| 67 | `ys_businesstype` | ys_businesstype | `ys_businesstype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 68 | `start_time` | start_time | `start_time` | DateTime | `timestamp` |
| 69 | `buId` | buID | `buId` | String | `text` |
| 70 | `operatePin` | operatePin | `operatePin` | String | `text` |
| 71 | `eclp_shopNo` | eclp_shopNo | `eclp_shopNo` | String | `text` |
| 72 | `eclp_deptNo` | eclp_deptNo | `eclp_deptNo` | String | `text` |
| 73 | `operateNick` | operateNick | `operateNick` | String | `text` |
| 74 | `sec_memberId` | sec_memberID | `sec_memberId` | String | `text` |
| 75 | `accessType` | accessType | `accessType` | Integer | `int` |
| 76 | `accountingBySubsidyBill` | accountingBySubsidyBill | `accountingType` | Integer | `int` |
| 77 | `activepricetype` | activepricetype | `activepricetype` | String | `text` |
| 78 | `cardroll_type` | cardroll_type | `cardroll_type` | String | `text` |
| 79 | `cexch_name` | cexch_name | `cexch_name` | String | `text` |
| 80 | `clientId` | clientID | `client_id` | String | `text` |
| 81 | `confirmCheckDay` | confirmCheckDay | `confirmCheckDay` | Integer | `int` |
| 82 | `createDate` | 创建日期 | `dCreateDate` | IntDate | `date` |
| 83 | `createTime` | 创建时间 | `dCreateTime` | IntDateTime | `dateTime` |
| 84 | `creator` | 创建人 | `cCreator` | String | `text` |
| 85 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 86 | `currency` | currency | `currency` | String | `text` |
| 87 | `customerCode` | customer编码 | `customerCode` | String | `text` |
| 88 | `customerCreditCheck` | customerCreditCheck | `customerCreditCheck` | Boolean | `switch` |
| 89 | `department` | department | `department_code` | String | `text` |
| 90 | `expand_authEndTime` | expand_authEndTime | `expand_authEndTime` | DateTime | `timestamp` |
| 91 | `expand_authStatus` | expand_authStatus | `expand_authStatus` | EnumAuth | `` |
| 92 | `expand_refresh_token` | expand_refresh_token | `expand_refresh_token` | String | `text` |
| 93 | `expand_token` | expand_token | `expand_token` | String | `text` |
| 94 | `historyOrg` | historyOrg | `history_org` | String | `text` |
| 95 | `invoiceTemp` | invoiceTemp | `invoice_temp` | EnumInvoiceTemp | `` |
| 96 | `isDeliveryReceivableWithFreight` | 是否DeliveryReceivableWithFreight | `isDeliveryReceivableWithFreight` | Boolean | `switch` |
| 97 | `modifier` | 修改人 | `cModifier` | String | `text` |
| 98 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 99 | `modifyDate` | 修改日期 | `dModifyDate` | IntDate | `date` |
| 100 | `modifyTime` | 修改时间 | `dModifyTime` | IntDateTime | `dateTime` |
| 101 | `onlinestaterange` | onlinestaterange | `onlinestaterange` | String | `text` |
| 102 | `org` | org | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 103 | `saleModel` | saleModel | `saleModel` | String | `text` |
| 104 | `salesman` | salesman | `salesman` | String | `text` |
| 105 | `salesoutAccountingMethod` | salesoutAccountingMethod | `salesoutAccountingMethod` | String | `text` |
| 106 | `shopType` | shopType | `shop_type` | Integer | `int` |
| 107 | `sjtShopid` | sjtShopid | `sjt_shopid` | String | `text` |
| 108 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 109 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 110 | `subtoken` | subtoken | `subtoken` | String | `text` |
| 111 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 112 | `warehouse` | warehouse | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 113 | `ys_cardrolltype` | ys_cardrolltype | `ys_cardrolltype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 114 | `ys_customer` | ys_customer | `ys_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 115 | `ys_department` | ys_department | `ys_department` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |
| 116 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（20 个）

- `ys_cardrolltype` -> `bd.bill.TransType` ()
- `org` -> `org.func.BaseOrg` ()
- `storevalue_receivable_transtype` -> `bd.bill.TransType` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `store` -> `aa.store.Store` (0..n)
- `warehouse` -> `aa.warehouse.Warehouse` ()
- `refund_transtype` -> `bd.bill.TransType` ()
- `storevalue_transtype` -> `bd.bill.TransType` ()
- `ys_department` -> `bd.adminOrg.DeptOrgVO` ()
- `ys_currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `ys_businesstype` -> `bd.bill.TransType` ()
- `refund_receivable_transtype` -> `bd.bill.TransType` ()
- `trade_receivable_transtype` -> `bd.bill.TransType` ()
- `ys_salesman` -> `bd.staff.Staff` ()
- `trade_transtype` -> `bd.bill.TransType` ()
- `tenant` -> `base.tenant.Tenant` ()
- `returnWarehouse` -> `aa.warehouse.Warehouse` ()
- `ys_customer` -> `aa.merchant.Merchant` ()

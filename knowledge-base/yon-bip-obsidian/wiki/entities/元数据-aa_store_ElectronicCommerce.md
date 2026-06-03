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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_electroniccommerce` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：`35fc56d6-c090-4cf2-8cde-7ec30cd1911e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电商业务 |
| 物理表 | `mp_electroniccommerce` |
| 数据库 schema | `yxybase` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 116 个 |
| 子表 | 0 个 |
| 关联引用 | 20 个 |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `ys_cardrolltype` | `` |
| `org_id` | `` |
| `storevalue_receivable_transtype` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `iStoreId` | `` |
| `warehouse` | `` |
| `refund_transtype` | `transtype.bd_billtyperef` |
| `storevalue_transtype` | `transtype.bd_billtyperef` |
| `ys_department` | `` |
| `ys_currency` | `ucfbasedoc.bd_currencytenantref` |
| `ys_businesstype` | `transtype.bd_billtyperef` |
| `refund_receivable_transtype` | `` |
| `trade_receivable_transtype` | `` |
| `ys_salesman` | `ucf-staff-center.bd_staff_outer_ref` |
| `trade_transtype` | `transtype.bd_billtyperef` |
| `tenant_id` | `` |
| `return_warehouse` | `productcenter.aa_warehouse` |
| `ys_customer` | `` |

## 继承接口 (4个, 10字段)

- **U会员审计信息** (`membase.itf.IYlAuditable`)
  - `dCreateDate` → `dCreateDate`
  - `dCreateTime` → `dCreateTime`
  - `cCreator` → `cCreator`
  - `cModifier` → `cModifier`
  - `dModifyDate` → `dModifyDate`
  - `dModifyTime` → `dModifyTime`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 116 个直连字段

### 文本字段 (54个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `shop_code` | `shop_code` | `shopCode` | 店铺编码 |
| `shop_name` | `shop_name` | `shopName` | 店铺名称 |
| `appkey` | `appkey` | `appKey` | 应用Key |
| `invoice_type` | `invoice_type` | `invoiceType` | 默认发货模式 |
| `dwtradetype` | `dwtradetype` | `dwtradetype` | 交易模式 |
| `secret` | `secret` | `secret` | 密钥 |
| `token` | `token` | `token` | 授权码 |
| `refreshToken` | `refreshToken` | `refresh_token` | 刷新授权码 |
| `shop_nick` | `shop_nick` | `shopNick` | 店铺昵称 |
| `eleme_shop_id` | `eleme_shop_id` | `elemeShopId` | 饿了么合作方门店ID |
| `eleme_plat_shop_id` | `eleme_plat_shop_id` | `elemePlatShopId` | 饿了么平台门店ID |
| `taxPayer` | `taxPayer` | `taxPayer` | 关税承担方 |
| `cooperation_no` | `cooperation_no` | `cooperationNo` | 常态合作编码 |
| `accordingTo` | `accordingTo` | `accordingTo` | 立账依据 |
| `cn_session` | `cn_session` | `cn_session` | 菜鸟授权 |
| `cn_appkey` | `cn_appkey` | `cn_appkey` | 菜鸟appkey |
| `cn_secret` | `cn_secret` | `cn_secret` | 菜鸟secret |
| `first_remind_interval` | `first_remind_interval` | `firstRemindInterval` | 提前预警时间（小时） |
| `overtime` | `overtime` | `overTime` | 最晚发货时间（小时） |
| `sourceOfReceivables` | `sourceOfReceivables` | `sourceOfReceivables` | 平台补贴立应收来源 |
| `memo` | `memo` | `memo` | 备注 |
| `customer_code` | `customer_code` | `customer_code` | 客户ERP编码 |
| `providerSettleType` | `providerSettleType` | `providerSettleType` | 经销结算方式 |
| `sales_type` | `sales_type` | `salesType` | 销售类型 |
| `shop_account_name` | `shop_account_name` | `shopAccountName` | 店铺账户 |
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `payment_code` | `payment_code` | `payment_code` | 结算方式编码 |
| `paymentgathtype_code` | `paymentgathtype_code` | `paymentgathtype_code` | 货款收款类型编码 |
| `advpmtgathtype_code` | `advpmtgathtype_code` | `advpmtgathtype_code` | 预收款收款类型编码 |
| `feegathtype_code` | `feegathtype_code` | `feegathtype_code` | 费用收款类型编码 |
| `buId` | `buId` | `buId` | 商家ID |
| `operatePin` | `operatePin` | `operatePin` | 操作人账号 |
| `eclp_shopNo` | `eclp_shopNo` | `eclp_shopNo` | ECLP店铺编号 |
| `eclp_deptNo` | `eclp_deptNo` | `eclp_deptNo` | ECLP事业部编号 |
| `operateNick` | `operateNick` | `operateNick` | 操作人密码 |
| `sec_memberId` | `sec_memberId` | `sec_memberId` | 二级商户号 |
| `activepricetype` | `activepricetype` | `activepricetype` | 商品价格优先取值 |
| `cardroll_type` | `cardroll_type` | `cardroll_type` | 卡券交易类型 |
| `cexch_name` | `cexch_name` | `cexch_name` | 币种 |
| `client_id` | `client_id` | `clientId` | 所属客户 |
| `cCreator` | `cCreator` | `creator` | 创建人 |
| `currency` | `currency` | `currency` | 币种 |
| `customerCode` | `customerCode` | `customerCode` | customerCode |
| `department_code` | `department_code` | `department` | 所属部门 |
| `expand_refresh_token` | `expand_refresh_token` | `expand_refresh_token` | 扩展刷新授权 |
| `expand_token` | `expand_token` | `expand_token` | 扩展授权 |
| `history_org` | `history_org` | `historyOrg` | 历史变更组织信息 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `onlinestaterange` | `onlinestaterange` | `onlinestaterange` | 原单转单线上交易状态范围 |
| `saleModel` | `saleModel` | `saleModel` | 销售模式 |
| `salesman` | `salesman` | `salesman` | 业务员 |
| `salesoutAccountingMethod` | `salesoutAccountingMethod` | `salesoutAccountingMethod` | 出库立账方式 |
| `sjt_shopid` | `sjt_shopid` | `sjtShopid` | 数据通店铺id |
| `subtoken` | `subtoken` | `subtoken` | 子授权 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStoreId` | `iStoreId` | `store` | 门店id |
| `ys_salesman` | `ys_salesman` | `ys_salesman` | 负责人 |
| `ys_currency` | `ys_currency` | `ys_currency` | 交易币种 |
| `trade_transtype` | `trade_transtype` | `trade_transtype` | 订单交易类型 |
| `trade_receivable_transtype` | `trade_receivable_transtype` | `trade_receivable_transtype` | 订单应收交易类型 |
| `storevalue_transtype` | `storevalue_transtype` | `storevalue_transtype` | 卡券订单交易类型 |
| `storevalue_receivable_transtype` | `storevalue_receivable_transtype` | `storevalue_receivable_transtype` | 卡券应收交易类型 |
| `refund_transtype` | `refund_transtype` | `refund_transtype` | 退换货单交易类型 |
| `refund_receivable_transtype` | `refund_receivable_transtype` | `refund_receivable_transtype` | 退换货单应收交易类型 |
| `return_warehouse` | `return_warehouse` | `returnWarehouse` | 退货仓库 |
| `ys_businesstype` | `ys_businesstype` | `ys_businesstype` | 业务类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `org_id` | `org_id` | `org` | 销售组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `warehouse` | `warehouse` | `warehouse` | 默认仓库 |
| `ys_cardrolltype` | `ys_cardrolltype` | `ys_cardrolltype` | 卡券交易类型 |
| `ys_customer` | `ys_customer` | `ys_customer` | 客户ID |
| `ys_department` | `ys_department` | `ys_department` | 所属部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicationOfMaturity` | `applicationOfMaturity` | `applicationOfMaturity` | 应用到期日 |
| `dCreateDate` | `dCreateDate` | `createDate` | 创建日期 |
| `dModifyDate` | `dModifyDate` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `modifyTime` | 修改时间 |

### 布尔字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isAutoAccessOrder` | `isAutoAccessOrder` | `isAutoAccessOrder` | 自动接单 |
| `auto_merger_delivery` | `auto_merger_delivery` | `autoMergerDelivery` | 自动合并发货 |
| `auto_match_warehouse` | `auto_match_warehouse` | `autoMatchWarehouse` | 智能分仓库 |
| `auto_match_logistics` | `auto_match_logistics` | `autoMatchLogistics` | 智能分物流 |
| `auto_match_warehousebyinv` | `auto_match_warehousebyinv` | `autoMatchWarehouseByInv` | 智能分仓库按商品匹配仓库 |
| `auto_match_expressbyweight` | `auto_match_expressbyweight` | `autoMatchExpressByWeight` | 智能分物流按重量匹配物流 |
| `isModifyAdress` | `isModifyAdress` | `isModifyAdress` | 自助修改地址 |
| `isSplitRefund` | `isSplitRefund` | `isSplitRefund` | 退款自动拆分 |
| `auto_matchRefund` | `auto_matchRefund` | `autoMatchRefund` | 售后自动转单 |
| `isModifySku` | `isModifySku` | `isModifySku` | 自助修改sku |
| `isProviderShop` | `isProviderShop` | `isProviderShop` | 经销商店铺 |
| `isAgRefund` | `isAgRefund` | `isAgRefund` | AG退款 |
| `aftersalerefundonly` | `aftersalerefundonly` | `aftersalerefundonly` | 售后均按仅退款处理 |
| `auto_delivery_warning` | `auto_delivery_warning` | `autoDeliveryWarning` | 启用发货预警 |
| `isSaRefund` | `isSaRefund` | `isSaRefund` | SA退款 |
| `is_sh_ship` | `is_sh_ship` | `is_sh_ship` | 平台仓发货店铺 |
| `isDouYinModifyAdress` | `isDouYinModifyAdress` | `isDouYinModifyAdress` | 自助修改地址 |
| `customerCreditCheck` | `customerCreditCheck` | `customerCreditCheck` | 启用客户信用检查 |
| `isDeliveryReceivableWithFreight` | `isDeliveryReceivableWithFreight` | `isDeliveryReceivableWithFreight` | 平台配送单据应收包含运费 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `distributor_shop_type` | `distributor_shop_type` | `distributorShopType` | 店铺类型 |
| `accessType` | `accessType` | `accessType` | 应用类型 |
| `accountingType` | `accountingType` | `accountingBySubsidyBill` | 补贴账单是否参与对账 |
| `confirmCheckDay` | `confirmCheckDay` | `confirmCheckDay` | 更新交易结束的时间 |
| `shop_type` | `shop_type` | `shopType` | 店铺类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendor_id` | `vendor_id` | `vendorId` | 平台供应商id |
| `id` | `id` | `id` | 电商业务信息id |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plat_type` | `plat_type` | `platType` | 平台类型 |
| `auth_status` | `auth_status` | `authStatus` | 授权状态 |
| `expand_authStatus` | `expand_authStatus` | `expand_authStatus` | 扩展授权状态 |
| `invoice_temp` | `invoice_temp` | `invoiceTemp` | 发货单模板 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auth_start_time` | `auth_start_time` | `authStartTime` | 订购时间 |
| `auth_end_time` | `auth_end_time` | `authEndTime` | 授权到期时间 |
| `pubts` | `pubts` | `pubts` | 电商业务信息时间戳 |
| `start_time` | `start_time` | `start_time` | 店铺启用时间 |
| `expand_authEndTime` | `expand_authEndTime` | `expand_authEndTime` | 扩展授权到期时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

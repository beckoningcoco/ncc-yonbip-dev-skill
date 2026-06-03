---
tags: [BIP, metadata, voucher, OrderChangeDetailGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单变更分组 (voucher.orderchange.OrderChangeDetailGroup)

> Platform: BIP V5 | Module: voucher | Table: orderchangedetailgroup | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 订单变更分组 |
| uri | voucher.orderchange.OrderChangeDetailGroup |
| tableName | orderchangedetailgroup |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.order.OrderDetailGroup |
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

## All Fields (35)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | apportionAttr | 优惠阶梯 | cApportionAttr | text | String |  |  | nullable |
| 2 | apportionMoney | 优惠金额 | fApportionMoney | number | Decimal |  |  | nullable |
| 3 | apportionName | 优惠名称 | cApportionName | text | String |  |  | nullable |
| 4 | apportionType | 优惠类型 | cApportionType | text | String |  |  | nullable |
| 5 | bMultiGiveaways | 是否包含多选赠品 | bMultiGiveaways | switch | Boolean |  |  | nullable |
| 6 | bizId | 商家id | bizId | long | Long |  |  | nullable |
| 7 | calcWithDisCount | 是否是按比例赠送 | bCalcWithDisCount | switch | Boolean |  |  | nullable |
| 8 | calcWithNum | 是否使用数量计算 | bCalcWithNum | switch | Boolean |  |  | nullable |
| 9 | canChangeGiveaway | 是否可以自由选择赠品 | bCanChangeGiveaway | switch | Boolean |  |  | nullable |
| 10 | code | 单据编号 | cOrderNo | text | String |  |  | nullable |
| 11 | comPromotionGroupId | 组合促销的分组ID | iComPromotionGroupId | long | Long |  |  | nullable |
| 12 | endDate | 结束时间 | pEndDate | timestamp | Timestamp |  |  | nullable |
| 13 | entireGroup | 是否是整单分组 | bEntireGroup | switch | Boolean |  |  | nullable |
| 14 | entityGiveawayPreId | 赠品类活动的ID | iEntityGiveawayPreId | long | Long |  |  | nullable |
| 15 | entityGiveawayPreName | 金额类活动的名称 | cEntityGiveawayPreName | text | String |  |  | nullable |
| 16 | entityMoneyPreId | 金额类活动的ID | iEntityMoneyPreId | long | Long |  |  | nullable |
| 17 | entityMoneyPreName | 金额类活动的名称 | cEntityMoneyPreName | text | String |  |  | nullable |
| 18 | existGroup | 是否存在分组 | existGroup | switch | Boolean |  |  | nullable |
| 19 | giveawayDes | 赠品描述 | cGiveawayDes | text | String |  |  | nullable |
| 20 | giveawayRule | 结算规则 | iGiveawayRule | int | Integer |  |  | nullable |
| 21 | groupQuantity | 组合促销的分组ID | iGroupQuantity | int | Integer |  |  | nullable |
| 22 | iIndex | 顺序 | iIndex | long | Long |  |  | nullable |
| 23 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 24 | orderId | 订单id | iorderId | quote | voucher.orderchange.OrderChange |  |  | nullable |
| 25 | originalOrderId | 原单id | iOriginalOrderId | long | Long |  |  | nullable |
| 26 | preId | 活动id | iPreId | long | Long |  |  | nullable |
| 27 | preType | 活动的类型 | iPreType | int | Integer |  |  | nullable |
| 28 | promotionType | 活动的类型 | cPromotionType | text | String |  |  | nullable |
| 29 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 30 | saleOrgId | 组织id | saleOrgId | long | Long |  |  | nullable |
| 31 | startDate | 开始时间 | pStartDate | timestamp | Timestamp |  |  | nullable |
| 32 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 33 | userAddGiveawayGroup | 是否可以自由选择赠品 | bUserAddGiveawayGroup | switch | Boolean |  |  | nullable |
| 34 | userSelected | 用户选择 | bUserSelected | switch | Boolean |  |  | nullable |
| 35 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orderId | 订单id | iorderId | voucher.orderchange.OrderChange |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

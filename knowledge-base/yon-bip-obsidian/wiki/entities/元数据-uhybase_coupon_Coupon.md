---
tags: [BIP, 元数据, 数据字典, uhybase, uhybase.coupon.Coupon]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 优惠券 (`uhybase.coupon.Coupon`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_coupon` | 应用: `SDMB`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 全部属性（170 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `cAppID` | cAppID | `cAppID` | 4556b717-b77c-4631-8314-70fc8d5ac99d | `quote` |  | true |
| 3 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | true |
| 4 | `scopeID` | scopeID | `iScopeID` | Long | `long` |  | true |
| 5 | `scopeLevel` | scopeLevel | `iScopeLevel` | Integer | `int` |  | true |
| 6 | `cEPName` | cEP名称 | `cEPName` | String | `text` |  | true |
| 7 | `iBurdenAmountType` | iBurdenAmountType | `iBurdenAmountType` | Integer | `int` |  | true |
| 8 | `iType` | iType | `iType` | Integer | `int` |  | true |
| 9 | `cTitle` | cTitle | `cTitle` | String | `text` |  | true |
| 10 | `cSubTitle` | cSubTitle | `cSubTitle` | String | `text` |  | true |
| 11 | `cSnPrefix` | cSnPrefix | `cSnPrefix` | String | `text` |  | true |
| 12 | `iCompanyBurdenAmount` | iCompanyBurdenAmount | `iCompanyBurdenAmount` | Decimal | `number` |  | true |
| 13 | `cRemind` | cRemind | `cRemind` | String | `text` |  | true |
| 14 | `iDistributorBurdenAmount` | iDistributorBurdenAmount | `iDistributorBurdenAmount` | Decimal | `number` |  | true |
| 15 | `bHideExpireDate` | bHideExpireDate | `bHideExpireDate` | Boolean | `switch` |  | true |
| 16 | `iStoreBurdenAmount` | iStoreBurdenAmount | `iStoreBurdenAmount` | Decimal | `number` |  | true |
| 17 | `cWelcome` | cWelcome | `cWelcome` | String | `text` |  | true |
| 18 | `iCompanyBurdenBl` | iCompanyBurdenBl | `iCompanyBurdenBl` | Decimal | `number` |  | true |
| 19 | `cEPLogoUrl` | cEPLogoUrl | `cEPLogoUrl` | String | `text` |  | true |
| 20 | `iDistributorBurdenBl` | iDistributorBurdenBl | `iDistributorBurdenBl` | Decimal | `number` |  | true |
| 21 | `cBackColor` | cBackColor | `cBackColor` | String | `text` |  | true |
| 22 | `cPosterBgUrl` | cPosterBgUrl | `cPosterBgUrl` | String | `text` |  | true |
| 23 | `iStoreBurdenBl` | iStoreBurdenBl | `iStoreBurdenBl` | Decimal | `number` |  | true |
| 24 | `iPosterQrPosition` | iPosterQrPosition | `iPosterQrPosition` | Integer | `int` |  | true |
| 25 | `iPromotionQrCodeSize` | iPromotionQrCodeSize | `iPromotionQrCodeSize` | Integer | `int` |  | true |
| 26 | `bShowQrCodeFrontImg` | bShowQrCodeFrontImg | `bShowQrCodeFrontImg` | Integer | `int` |  | true |
| 27 | `cQrCodeBgColor` | cQrCodeBgColor | `cQrCodeBgColor` | String | `text` |  | true |
| 28 | `cQrCodeFrontColor` | cQrCodeFrontColor | `cQrCodeFrontColor` | String | `text` |  | true |
| 29 | `cQrCodeOutsideBorderColor` | cQrCodeOutsideBorderColor | `cQrCodeOutsideBorderColor` | String | `text` |  | true |
| 30 | `cQrCodeInsideBorderColor` | cQrCodeInsideBorderColor | `cQrCodeInsideBorderColor` | String | `text` |  | true |
| 31 | `bMarketingSetting` | bMarketingSetting | `bMarketingSetting` | Boolean | `switch` |  | true |
| 32 | `bCrossMembershipGive` | bCrossMembershipGive | `bCrossMembershipGive` | Boolean | `switch` |  | true |
| 33 | `cNotice` | cNotice | `cNotice` | String | `text` |  | true |
| 34 | `iCouponRuleID` | iCouponRuleID | `iCouponRuleID` | fd5c219d-aad9-4ca1-b9a3-d306659a4192 | `quote` |  | true |
| 35 | `bUseForPremium` | bUseForPremium | `bUseForPremium` | Boolean | `switch` |  | true |
| 36 | `iElecCard` | iElecCard | `iElecCard` | Boolean | `switch` |  | true |
| 37 | `bEnablePassword` | bEnablePassword | `bEnablePassword` | Boolean | `switch` |  | true |
| 38 | `bOutImport` | bOutImport | `bOutImport` | Boolean | `switch` |  | true |
| 39 | `iQuantity` | iQuantity | `iQuantity` | Integer | `int` |  | true |
| 40 | `iReceiveLimit` | iReceiveLimit | `iReceiveLimit` | Integer | `int` |  | true |
| 41 | `bRepelWithPoints` | bRepelWithPoints | `bRepelWithPoints` | Boolean | `switch` |  | true |
| 42 | `fStartAmount` | fStartAmount | `fStartAmount` | Decimal | `number` |  | true |
| 43 | `iReceiveCount` | iReceiveCount | `iReceiveCount` | Integer | `int` |  | true |
| 44 | `iPreCouponCount` | iPreCouponCount | `iPreCouponCount` | Integer | `int` |  | true |
| 45 | `iStartAmountScope` | iStartAmountScope | `iStartAmountScope` | Integer | `int` |  | true |
| 46 | `iFirstAttentionSend` | iFirstAttentionSend | `iFirstAttentionSend` | Integer | `int` |  | true |
| 47 | `iMemberBind` | iMemberBind | `iMemberBind` | Boolean | `switch` |  | true |
| 48 | `fReduceAmount` | fReduceAmount | `fReduceAmount` | Decimal | `number` |  | true |
| 49 | `iAmount` | iAmount | `iAmount` | Integer | `int` |  | true |
| 50 | `iUnLimitCount` | iUnLimitCount | `iUnLimitCount` | Boolean | `switch` |  | true |
| 51 | `cCouponScene` | cCouponScene | `cCouponScene` | String | `text` |  | true |
| 52 | `fDiscount` | fDiscount | `fDiscount` | Decimal | `number` |  | true |
| 53 | `fReferencePrice` | fReferencePrice | `fReferencePrice` | Decimal | `number` |  | true |
| 54 | `iReceiveBySelf` | iReceiveBySelf | `iReceiveBySelf` | Boolean | `switch` |  | true |
| 55 | `iReceiveByOther` | iReceiveByOther | `iReceiveByOther` | Boolean | `switch` |  | true |
| 56 | `bCanSell` | bCanSell | `bCanSell` | Boolean | `switch` |  | true |
| 57 | `iAssociateGoodsID` | iAssociateGoodsID | `iAssociateGoodsID` | Long | `long` |  | true |
| 58 | `cAssociateOuterID` | cAssociateOuterID | `cAssociateOuterID` | String | `text` |  | true |
| 59 | `cAssociateGoodsName` | cAssociateGoods名称 | `cAssociateGoodsName` | String | `text` |  | true |
| 60 | `iManualValid` | iManualValid | `iManualValid` | Boolean | `switch` |  | true |
| 61 | `iDiscountType` | iDiscountType | `iDiscountType` | Integer | `int` |  | true |
| 62 | `iDownLinePayType` | iDownLinePayType | `iDownLinePayType` | Boolean | `switch` |  | true |
| 63 | `iStartQuantity` | iStartQuantity | `iStartQuantity` | Integer | `int` |  | true |
| 64 | `iRetailPayMethodID` | iRetailPayMethodID | `iRetailPayMethodID` | 4cf5c5f8-49a6-4e5a-b742-9b6d5832845e | `quote` |  | true |
| 65 | `iSaleDiscountType` | iSaleDiscountType | `iSaleDiscountType` | Integer | `int` |  | true |
| 66 | `iRefundType` | iRefundType | `iRefundType` | Integer | `int` |  | true |
| 67 | `iShopOrOrg` | iShopOrOrg | `iShopOrOrg` | Byte | `byte` |  | true |
| 68 | `iUnlimitShop` | iUnlimitShop | `iUnlimitShop` | Boolean | `switch` |  | true |
| 69 | `iUnlimitOrg` | iUnlimitOrg | `iUnlimitOrg` | Boolean | `switch` |  | true |
| 70 | `iScopeType` | iScopeType | `iScopeType` | Integer | `int` |  | true |
| 71 | `iExchangeGoodsCount` | iExchangeGoodsCount | `iExchangeGoodsCount` | Integer | `int` |  | true |
| 72 | `iScopeTypeException` | iScopeTypeException | `iScopeTypeException` | Integer | `int` |  | true |
| 73 | `bOlineMall` | bOlineMall | `bOlineMall` | Boolean | `switch` |  | true |
| 74 | `bUmallSettlement` | bUmallSettlement | `bUmallSettlement` | Boolean | `switch` |  | true |
| 75 | `iMaxUsedNum` | iMaxUsedNum | `iMaxUsedNum` | Integer | `int` |  | true |
| 76 | `bLimitStore` | bLimitStore | `bLimitStore` | Boolean | `switch` |  | true |
| 77 | `bApplyUDHShop` | bApplyUDHShop | `bApplyUDHShop` | Boolean | `switch` |  | true |
| 78 | `iExpMode` | iExpMode | `iExpMode` | Integer | `int` |  | true |
| 79 | `dCouponEffectDate` | dCouponEffectDate | `dCouponEffectDate` | DateTime | `timestamp` |  | true |
| 80 | `dCouponExpDate` | dCouponExpDate | `dCouponExpDate` | DateTime | `timestamp` |  | true |
| 81 | `iintervalDaysEffect` | iintervalDaysEffect | `iintervalDaysEffect` | Integer | `int` |  | true |
| 82 | `iintervalEffectUnit` | iintervalEffectUnit | `iintervalEffectUnit` | Byte | `byte` |  | true |
| 83 | `iintervalDaysExp` | iintervalDaysExp | `iintervalDaysExp` | Integer | `int` |  | true |
| 84 | `iintervalExpUnit` | iintervalExpUnit | `iintervalExpUnit` | Byte | `byte` |  | true |
| 85 | `iCanUseTime` | iCanUseTime | `iCanUseTime` | Integer | `int` |  | true |
| 86 | `cWeekDays` | cWeekDays | `cWeekDays` | String | `text` |  | true |
| 87 | `cServicePhone` | cServicePhone | `cServicePhone` | String | `text` |  | true |
| 88 | `bSyncWeChatCoupon` | bSyncWeChatCoupon | `bSyncWeChatCoupon` | Boolean | `switch` |  | true |
| 89 | `iWxCodeType` | iWxCodeType | `iWxCodeType` | Byte | `byte` |  | true |
| 90 | `cWechatLogoUrl` | cWechatLogoUrl | `cWechatLogoUrl` | String | `text` |  | true |
| 91 | `cWechatDesc` | cWechatDesc | `cWechatDesc` | String | `text` |  | true |
| 92 | `iWechatScope` | iWechatScope | `iWechatScope` | Boolean | `switch` |  | true |
| 93 | `cWechatAcceptGoods` | cWechatAcceptGoods | `cWechatAcceptGoods` | String | `text` |  | true |
| 94 | `cWechatUnAcceptGoods` | cWechatUnAcceptGoods | `cWechatUnAcceptGoods` | String | `text` |  | true |
| 95 | `cCouponColor` | cCouponColor | `cCouponColor` | String | `text` |  | true |
| 96 | `cExChangeGoodsDoc` | cExChangeGoodsDoc | `cExChangeGoodsDoc` | String | `text` |  | true |
| 97 | `iWCanUseWithOtherDiscount` | iWCanUseWithOtherDiscount | `iWCanUseWithOtherDiscount` | Boolean | `switch` |  | true |
| 98 | `iWCanUseWithOtherMemCard` | iWCanUseWithOtherMemCard | `iWCanUseWithOtherMemCard` | Boolean | `switch` |  | true |
| 99 | `cWechatAccountID` | cWechatAccountID | `cWechatAccountID` | f6bd275a-b88b-4a21-82ff-2f8e3fa236bc | `quote` |  | true |
| 100 | `bWXCreated` | bWXCreated | `bWXCreated` | Boolean | `switch` |  | true |
| 101 | `cApplicableScene` | cApplicableScene | `cApplicableScene` | String | `text` |  | true |
| 102 | `iDiscountMethod` | iDiscountMethod | `iDiscountMethod` | Integer | `int` |  | true |
| 103 | `iDiscountNum` | iDiscountNum | `iDiscountNum` | Integer | `int` |  | true |
| 104 | `couponDefineCharacter` | couponDefineCharacter | `couponDefineCharacter` | 06c6f67f-16af-4d73-b6cc-cfc34331d60e | `UserDefine` |  | true |
| 105 | `bAllowPremium` | bAllowPremium | `bAllowPremium` | Boolean | `switch` |  | true |
| 106 | `bAwardPoints` | bAwardPoints | `bAwardPoints` | Boolean | `switch` |  | true |
| 107 | `bGoodsDuplication` | bGoodsDuplication | `bGoodsDuplication` | Short | `short` |  | true |
| 108 | `bSelectAllGoods` | bSelectAllGoods | `bSelectAllGoods` | Short | `short` |  | true |
| 109 | `bUDHPayMethod` | bUDHPayMethod | `bUDHPayMethod` | Boolean | `switch` |  | true |
| 110 | `bWXCheckPass` | bWXCheckPass | `bWXCheckPass` | Boolean | `switch` |  | true |
| 111 | `bWXCheckRefuseReason` | bWXCheckRefuseReason | `bWXCheckRefuseReason` | String | `text` |  | true |
| 112 | `bWXCheckTime` | bWXCheckTime | `bWXCheckTime` | DateTime | `timestamp` |  | true |
| 113 | `cApplyType` | cApplyType | `cApplyType` | String | `text` |  | true |
| 114 | `cAppointTimes` | cAppointTimes | `cAppointTimes` | String | `text` |  | true |
| 115 | `cCouponID` | cCouponID | `cCouponID` | String | `text` |  | true |
| 116 | `cCreatorName` | cCreator名称 | `cCreatorName` | String | `text` |  | true |
| 117 | `cDescription` | cDescription | `cDescription` | String | `text` |  | true |
| 118 | `cDouYinPackageId` | cDouYinPackageID | `cDouYinPackageId` | String | `text` |  | true |
| 119 | `cExternalCouponCode` | cExternalCoupon编码 | `cExternalCouponCode` | String | `text` |  | true |
| 120 | `cLimitMemberLevelIDs` | cLimitMemberLevelIDs | `cLimitMemberLevelIDs` | String | `text` |  | true |
| 121 | `cMeituanPackageId` | cMeituanPackageID | `cMeituanPackageId` | String | `text` |  | true |
| 122 | `cMonthDays` | cMonthDays | `cMonthDays` | String | `text` |  | true |
| 123 | `cPicUrl` | cPicUrl | `cPicUrl` | String | `text` |  | true |
| 124 | `cRetailPayMethodName` | cRetailPayMethod名称 | `cRetailPayMethodName` | String | `text` |  | true |
| 125 | `cScopeName` | cScope名称 | `cScopeName` | String | `text` |  | true |
| 126 | `cStoreIDs` | cStoreIDs | `cStoreIDs` | String | `text` |  | true |
| 127 | `cUmallUrl` | cUmallUrl | `cUmallUrl` | String | `text` |  | true |
| 128 | `cUseDescription` | cUseDescription | `cUseDescription` | String | `text` |  | true |
| 129 | `cUserName` | cUser名称 | `cUserName` | String | `text` |  | true |
| 130 | `cWXAccountID` | cWXAccountID | `cWXAccountID` | f6bd275a-b88b-4a21-82ff-2f8e3fa236bc | `quote` |  | true |
| 131 | `cWXAccountIDs` | cWXAccountIDs | `cWXAccountIDs` | String | `text` |  | true |
| 132 | `cWXLogoUrl` | cWXLogoUrl | `cWXLogoUrl` | String | `text` |  | true |
| 133 | `couponConvertRule` | couponConvertRule | `` | e120ea04-8ab0-4901-b7bf-982882a7fe1c | `` |  |  |
| 134 | `couponExchangeRules` | couponExchangeRules | `` | 5e9bf2a8-ff16-4512-9ac5-e249e471d452 | `` |  |  |
| 135 | `couponExcluesion` | couponExcluesion | `` | ad953a67-4f37-4e82-b599-29b5e215ca46 | `` |  |  |
| 136 | `couponFreeDefine` | couponFreeDefine | `` | 72c4cd33-68af-4b4f-9269-61376838bdf6 | `` |  |  |
| 137 | `couponGoods` | couponGoods | `` | a9019cf3-d560-4c51-b900-e279b8b18e47 | `` |  |  |
| 138 | `couponGoodsClass` | couponGoodsClass | `` | d0ef3062-c700-4514-a09a-7eebbb29e42e | `` |  |  |
| 139 | `couponGoodsClassTemp` | couponGoodsClassTemp | `` | 66863552-3201-4803-b845-3db945219d92 | `` |  |  |
| 140 | `couponGoodsExclude` | couponGoodsExclude | `` | 97cc1e0e-cb4f-4e36-b325-3351307f1dcd | `` |  |  |
| 141 | `couponGoodsSKU` | couponGoodsSKU | `` | 77c4aca5-87ca-4ca4-a531-71c48faed87d | `` |  |  |
| 142 | `couponGoodsSKUExclude` | couponGoodsSKUExclude | `` | d3c5933f-eef9-408e-8d99-fc31ca83b7bf | `` |  |  |
| 143 | `couponGoodsTag` | couponGoodsTag | `` | c6f742f4-dbc7-4493-8fb9-735c02d24d55 | `` |  |  |
| 144 | `couponMemberLevel` | couponMemberLevel | `` | 691a87ba-5714-470b-a3e2-a933a89ae9b5 | `` |  |  |
| 145 | `couponShop` | couponShop | `` | 008d442e-a425-46d1-bdda-c03c83469d9c | `` |  |  |
| 146 | `couponStore` | couponStore | `` | 88bcfbf7-8166-45e4-89e5-3342a534eb6f | `` |  |  |
| 147 | `couponUmallSite` | couponUmallSite | `` | 86170c0d-4033-4cb5-a343-09d57c784475 | `` |  |  |
| 148 | `couponUsedTime` | couponUsedTime | `` | 2619e9a7-6198-4c95-b7a8-a7f8b2cfa138 | `` |  |  |
| 149 | `couponWXaccount` | couponWXaccount | `` | 3c51b051-87b5-48f3-b769-fe69a15be5a2 | `` |  |  |
| 150 | `dCreateDate` | dCreateDate | `dCreateDate` | DateTime | `timestamp` |  | true |
| 151 | `dCreateTime` | dCreateTime | `dCreateTime` | Integer | `int` |  | true |
| 152 | `dEffectDate` | dEffectDate | `dEffectDate` | Integer | `int` |  | true |
| 153 | `dExpDate` | dExpDate | `dExpDate` | Integer | `int` |  | true |
| 154 | `dUpdateTime` | dUpdateTime | `dUpdateTime` | Integer | `int` |  | true |
| 155 | `fReduceToAmount` | fReduceToAmount | `fReduceToAmount` | Decimal | `number` |  | true |
| 156 | `iAbandonCount` | iAbandonCount | `iAbandonCount` | Integer | `int` |  | true |
| 157 | `iAvailableCount` | iAvailableCount | `iAvailableCount` | Integer | `int` |  | true |
| 158 | `iAvailablePeriod` | iAvailablePeriod | `iAvailablePeriod` | Integer | `int` |  | true |
| 159 | `iConsumeCount` | iConsumeCount | `iConsumeCount` | Integer | `int` |  | true |
| 160 | `iExpiredCount` | iExpiredCount | `iExpiredCount` | Integer | `int` |  | true |
| 161 | `iScopeID` | iScopeID | `iScopeID` | Long | `long` |  | true |
| 162 | `iScopeLevel` | iScopeLevel | `iScopeLevel` | Byte | `byte` |  | true |
| 163 | `iServiceThreshold` | iServiceThreshold | `iServiceThreshold` | Integer | `int` |  | true |
| 164 | `iSource` | iSource | `iSource` | Integer | `int` |  | true |
| 165 | `iUnReceiveCount` | iUnReceiveCount | `iUnReceiveCount` | Integer | `int` |  | true |
| 166 | `iUseType` | iUseType | `iUseType` | Integer | `int` |  | true |
| 167 | `iVaildPreCount` | iVaildPreCount | `iVaildPreCount` | Integer | `int` |  | true |
| 168 | `membercorp` | membercorp | `iCorpId` | Long | `long` |  | true |
| 169 | `scopeName` | scope名称 | `cScopeName` | String | `text` |  | true |
| 170 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（24 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `cAppID` | `uhybase.basic.CorpHierarchyTemp` | `cAppID` |  |  |  |
| 2 | `iCouponRuleID` | `uhybase.coupon.CouponRule` | `iCouponRuleID` |  |  |  |
| 3 | `couponExchangeRules` | `uhybase.coupon.CouponExchangeRules` | `` | 0..n | Y |  |
| 4 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 5 | `couponGoodsSKUExclude` | `uhybase.coupon.CouponGoodsSKUExclude` | `` | 0..n | Y |  |
| 6 | `couponFreeDefine` | `uhybase.coupon.CouponFreeDefine` | `` | 1 | Y |  |
| 7 | `couponGoods` | `uhybase.coupon.CouponGoods` | `` | 0..n | Y |  |
| 8 | `couponShop` | `uhybase.coupon.CouponShop` | `` | 0..n | Y |  |
| 9 | `couponGoodsClass` | `uhybase.coupon.CouponGoodsClass` | `` | 0..n | Y |  |
| 10 | `couponExcluesion` | `uhybase.coupon.CouponExcluesion` | `` | 0..n | Y |  |
| 11 | `couponGoodsTag` | `uhybase.coupon.CouponGoodsTag` | `` | 0..n | Y |  |
| 12 | `cWXAccountID` | `uhybase.fan.WxAccount` | `cWXAccountID` |  |  |  |
| 13 | `cWechatAccountID` | `uhybase.fan.WxAccount` | `cWechatAccountID` |  |  |  |
| 14 | `couponWXaccount` | `uhybase.coupon.CouponWXaccount` | `` | 0..n | Y |  |
| 15 | `couponUsedTime` | `uhybase.coupon.CouponUsedTime` | `` | 0..n | Y |  |
| 16 | `couponGoodsSKU` | `uhybase.coupon.CouponGoodsSKU` | `` | 0..n | Y |  |
| 17 | `couponDefineCharacter` | `uhybase.coupon.CouponDefineCharacter` | `couponDefineCharacter` |  |  |  |
| 18 | `couponConvertRule` | `uhybase.coupon.CouponConvertRule` | `` | 0..n | Y |  |
| 19 | `couponGoodsClassTemp` | `uhybase.coupon.CouponGoodsClassTemp` | `` | 0..n | Y |  |
| 20 | `couponUmallSite` | `uhybase.coupon.CouponUmallSite` | `` | 0..n | Y |  |
| 21 | `iRetailPayMethodID` | `aa.paymentmethod.PaymentMethod` | `iRetailPayMethodID` |  |  |  |
| 22 | `couponGoodsExclude` | `uhybase.coupon.CouponGoodsExclude` | `` | 0..n | Y |  |
| 23 | `couponStore` | `uhybase.coupon.CouponStore` | `` | 0..n | Y |  |
| 24 | `couponMemberLevel` | `uhybase.coupon.CouponMemberLevel` | `` | 0..n | Y |  |

## 依赖接口（3 个）

- `IMembercorp` → `base.itf.IMembercorp` (v73)
- `Scope` → `uhy.itf.Scope` (v24)
- `IYTenantExt` → `ucfbase.ucfbaseItf.IYTenantExt` (v24)

## SQL 示例

```sql
SELECT id, cAppID, ts, iScopeID, iScopeLevel, cEPName, iBurdenAmountType, iType
FROM mp_coupon
```
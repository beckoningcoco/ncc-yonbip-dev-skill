---
tags: [BIP, 元数据, 数据字典, uhybase.coupon.Coupon]
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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_coupon` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`be8a6639-5944-4366-bc0b-48546b251258`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优惠券 |
| 物理表 | `mp_coupon` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 170 个 |
| 子表 | 17 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `couponExchangeRules` | `uhybase.coupon.CouponExchangeRules` | composition |
| `couponGoodsSKUExclude` | `uhybase.coupon.CouponGoodsSKUExclude` | composition |
| `couponFreeDefine` | `uhybase.coupon.CouponFreeDefine` | composition |
| `couponGoods` | `uhybase.coupon.CouponGoods` | composition |
| `couponShop` | `uhybase.coupon.CouponShop` | composition |
| `couponGoodsClass` | `uhybase.coupon.CouponGoodsClass` | composition |
| `couponExcluesion` | `uhybase.coupon.CouponExcluesion` | composition |
| `couponGoodsTag` | `uhybase.coupon.CouponGoodsTag` | composition |
| `couponWXaccount` | `uhybase.coupon.CouponWXaccount` | composition |
| `couponUsedTime` | `uhybase.coupon.CouponUsedTime` | composition |
| `couponGoodsSKU` | `uhybase.coupon.CouponGoodsSKU` | composition |
| `couponConvertRule` | `uhybase.coupon.CouponConvertRule` | composition |
| `couponGoodsClassTemp` | `uhybase.coupon.CouponGoodsClassTemp` | composition |
| `couponUmallSite` | `uhybase.coupon.CouponUmallSite` | composition |
| `couponGoodsExclude` | `uhybase.coupon.CouponGoodsExclude` | composition |
| `couponStore` | `uhybase.coupon.CouponStore` | composition |
| `couponMemberLevel` | `uhybase.coupon.CouponMemberLevel` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `mm_corphierarchyref` |
| `iCouponRuleID` | `pt_couponrule_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `cWXAccountID` | `` |
| `cWechatAccountID` | `pt_wxaccountref` |
| `couponDefineCharacter` | `` |
| `iRetailPayMethodID` | `aa_paymentmethodref` |

## 继承接口 (3个, 5字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **会员管理维度** (`uhy.itf.Scope`)
  - `iScopeID` → `iScopeID`
  - `iScopeLevel` → `iScopeLevel`
  - `cScopeName` → `cScopeName`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 170 个直连字段

### 文本字段 (47个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cEPName` | `cEPName` | `cEPName` | 商家名称 |
| `cTitle` | `cTitle` | `cTitle` | 卡券标题 |
| `cSubTitle` | `cSubTitle` | `cSubTitle` | 券副标题 |
| `cSnPrefix` | `cSnPrefix` | `cSnPrefix` | 编号前缀 |
| `cRemind` | `cRemind` | `cRemind` | 使用提醒 |
| `cWelcome` | `cWelcome` | `cWelcome` | 分享欢迎词 |
| `cEPLogoUrl` | `cEPLogoUrl` | `cEPLogoUrl` | 商家显示Logo |
| `cBackColor` | `cBackColor` | `cBackColor` | 背景色 |
| `cPosterBgUrl` | `cPosterBgUrl` | `cPosterBgUrl` | 海报背景 |
| `cQrCodeBgColor` | `cQrCodeBgColor` | `cQrCodeBgColor` | 海报背景色 |
| `cQrCodeFrontColor` | `cQrCodeFrontColor` | `cQrCodeFrontColor` | 海报前景色 |
| `cQrCodeOutsideBorderColor` | `cQrCodeOutsideBorderColor` | `cQrCodeOutsideBorderColor` | 海报二维码外圈色 |
| `cQrCodeInsideBorderColor` | `cQrCodeInsideBorderColor` | `cQrCodeInsideBorderColor` | 海报二维码内圈色 |
| `cNotice` | `cNotice` | `cNotice` | 购买须知 |
| `cCouponScene` | `cCouponScene` | `cCouponScene` | 卡券用于抵扣 |
| `cAssociateOuterID` | `cAssociateOuterID` | `cAssociateOuterID` | 关联商品 |
| `cAssociateGoodsName` | `cAssociateGoodsName` | `cAssociateGoodsName` | 关联商品 |
| `cWeekDays` | `cWeekDays` | `cWeekDays` | 时间段 |
| `cServicePhone` | `cServicePhone` | `cServicePhone` | 客服电话 |
| `cWechatLogoUrl` | `cWechatLogoUrl` | `cWechatLogoUrl` | 封面图片 |
| `cWechatDesc` | `cWechatDesc` | `cWechatDesc` | 封面介绍 |
| `cWechatAcceptGoods` | `cWechatAcceptGoods` | `cWechatAcceptGoods` | 适用商品 |
| `cWechatUnAcceptGoods` | `cWechatUnAcceptGoods` | `cWechatUnAcceptGoods` | 不适用商品 |
| `cCouponColor` | `cCouponColor` | `cCouponColor` | 卡券颜色 |
| `cExChangeGoodsDoc` | `cExChangeGoodsDoc` | `cExChangeGoodsDoc` | 兑换商品说明 |
| `cApplicableScene` | `cApplicableScene` | `cApplicableScene` | 适用场景 |
| `bWXCheckRefuseReason` | `bWXCheckRefuseReason` | `bWXCheckRefuseReason` | 微信卡券审核不通过原因 |
| `cApplyType` | `cApplyType` | `cApplyType` | 应用订单类型 |
| `cAppointTimes` | `cAppointTimes` | `cAppointTimes` | 指定的时间段 |
| `cCouponID` | `cCouponID` | `cCouponID` | 微信卡券id |
| `cCreatorName` | `cCreatorName` | `cCreatorName` | 创建人名称 |
| `cDescription` | `cDescription` | `cDescription` | 优惠说明 |
| `cDouYinPackageId` | `cDouYinPackageId` | `cDouYinPackageId` | 抖音券套餐ID |
| `cExternalCouponCode` | `cExternalCouponCode` | `cExternalCouponCode` | 三方券编码 |
| `cLimitMemberLevelIDs` | `cLimitMemberLevelIDs` | `cLimitMemberLevelIDs` | 限领会员等级 |
| `cMeituanPackageId` | `cMeituanPackageId` | `cMeituanPackageId` | 美团券套餐ID |
| `cMonthDays` | `cMonthDays` | `cMonthDays` | 每月几号 |
| `cPicUrl` | `cPicUrl` | `cPicUrl` | 图片路径 |
| `cRetailPayMethodName` | `cRetailPayMethodName` | `cRetailPayMethodName` | 零售收款方式名称 |
| `cScopeName` | `cScopeName` | `cScopeName` | 卡券管理维度名称 |
| `cStoreIDs` | `cStoreIDs` | `cStoreIDs` | 门店ID |
| `cUmallUrl` | `cUmallUrl` | `cUmallUrl` | U商城路径 |
| `cUseDescription` | `cUseDescription` | `cUseDescription` | 使用说明 |
| `cUserName` | `cUserName` | `cUserName` | 修改人姓名 |
| `cWXAccountIDs` | `cWXAccountIDs` | `cWXAccountIDs` | 微信公众号IDs |
| `cWXLogoUrl` | `cWXLogoUrl` | `cWXLogoUrl` | logo图片微信端URL |
| `cScopeName` | `cScopeName` | `scopeName` | 会员管理维度名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍code |
| `iCouponRuleID` | `iCouponRuleID` | `iCouponRuleID` | 卡券发放规则ID |
| `iRetailPayMethodID` | `iRetailPayMethodID` | `iRetailPayMethodID` | 零售收款方式 |
| `cWechatAccountID` | `cWechatAccountID` | `cWechatAccountID` | 微信服务号 |
| `cWXAccountID` | `cWXAccountID` | `cWXAccountID` | 微信账号ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bHideExpireDate` | `bHideExpireDate` | `bHideExpireDate` | 是否隐藏有效期 |
| `bMarketingSetting` | `bMarketingSetting` | `bMarketingSetting` | 是否启用 |
| `bCrossMembershipGive` | `bCrossMembershipGive` | `bCrossMembershipGive` | 允许跨会籍发放 |
| `bUseForPremium` | `bUseForPremium` | `bUseForPremium` | 可用于付费会员购买 |
| `iElecCard` | `iElecCard` | `iElecCard` | 电子卡券 |
| `bEnablePassword` | `bEnablePassword` | `bEnablePassword` | 卡券密码管理 |
| `bOutImport` | `bOutImport` | `bOutImport` | 外部系统卡券 |
| `bRepelWithPoints` | `bRepelWithPoints` | `bRepelWithPoints` | 不与积分共用 |
| `iMemberBind` | `iMemberBind` | `iMemberBind` | 绑定会员 |
| `iUnLimitCount` | `iUnLimitCount` | `iUnLimitCount` | 计次卡次数是否限制 |
| `iReceiveBySelf` | `iReceiveBySelf` | `iReceiveBySelf` | 会员可领取 |
| `iReceiveByOther` | `iReceiveByOther` | `iReceiveByOther` | 可转赠 |
| `bCanSell` | `bCanSell` | `bCanSell` | 可售卖 |
| `iManualValid` | `iManualValid` | `iManualValid` | 是否手工生效 |
| `iDownLinePayType` | `iDownLinePayType` | `iDownLinePayType` | 零售收款方式 |
| `iUnlimitShop` | `iUnlimitShop` | `iUnlimitShop` | 商家不限制 |
| `iUnlimitOrg` | `iUnlimitOrg` | `iUnlimitOrg` | 组织不限制 |
| `bOlineMall` | `bOlineMall` | `bOlineMall` | 线上商城 |
| `bUmallSettlement` | `bUmallSettlement` | `bUmallSettlement` | B2C商城作为结算方式 |
| `bLimitStore` | `bLimitStore` | `bLimitStore` | 线下门店 |
| `bApplyUDHShop` | `bApplyUDHShop` | `bApplyUDHShop` | 适用订货门户 |
| `bSyncWeChatCoupon` | `bSyncWeChatCoupon` | `bSyncWeChatCoupon` | 同步微信优惠券 |
| `iWechatScope` | `iWechatScope` | `iWechatScope` | 适用范围 |
| `iWCanUseWithOtherDiscount` | `iWCanUseWithOtherDiscount` | `iWCanUseWithOtherDiscount` | 与其他优惠共享 |
| `iWCanUseWithOtherMemCard` | `iWCanUseWithOtherMemCard` | `iWCanUseWithOtherMemCard` | 与会员卡共享 |
| `bWXCreated` | `bWXCreated` | `bWXCreated` | 微信卡券是否已创建 |
| `bAllowPremium` | `bAllowPremium` | `bAllowPremium` | 允许券面值溢价使用 |
| `bAwardPoints` | `bAwardPoints` | `bAwardPoints` | 是否参与计算积分 |
| `bUDHPayMethod` | `bUDHPayMethod` | `bUDHPayMethod` | 是否订货收款方式 |
| `bWXCheckPass` | `bWXCheckPass` | `bWXCheckPass` | 微信卡券是否审核通过 |

### 整数 (41个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iScopeLevel` | `iScopeLevel` | `scopeLevel` | 维度level |
| `iBurdenAmountType` | `iBurdenAmountType` | `iBurdenAmountType` | 费用分摊类型 |
| `iType` | `iType` | `iType` | 卡券类型 |
| `iPosterQrPosition` | `iPosterQrPosition` | `iPosterQrPosition` | 海报二维码显示位置 |
| `iPromotionQrCodeSize` | `iPromotionQrCodeSize` | `iPromotionQrCodeSize` | 海报二维码大小 |
| `bShowQrCodeFrontImg` | `bShowQrCodeFrontImg` | `bShowQrCodeFrontImg` | 海报二维码是否显示头像 |
| `iQuantity` | `iQuantity` | `iQuantity` | 发放数量 |
| `iReceiveLimit` | `iReceiveLimit` | `iReceiveLimit` | 限领张数 |
| `iReceiveCount` | `iReceiveCount` | `iReceiveCount` | 已发放数量 |
| `iPreCouponCount` | `iPreCouponCount` | `iPreCouponCount` | 已预发放数量 |
| `iStartAmountScope` | `iStartAmountScope` | `iStartAmountScope` | 启用金额依据 |
| `iFirstAttentionSend` | `iFirstAttentionSend` | `iFirstAttentionSend` | 首次关注赠送 |
| `iAmount` | `iAmount` | `iAmount` | 使用次数 |
| `iDiscountType` | `iDiscountType` | `iDiscountType` | 卡券优惠类型 |
| `iStartQuantity` | `iStartQuantity` | `iStartQuantity` | 启用数量 |
| `iSaleDiscountType` | `iSaleDiscountType` | `iSaleDiscountType` | 销售折扣处理 |
| `iRefundType` | `iRefundType` | `iRefundType` | 计次卡退货方式 |
| `iScopeType` | `iScopeType` | `iScopeType` | 适用商品 |
| `iExchangeGoodsCount` | `iExchangeGoodsCount` | `iExchangeGoodsCount` | 兑换商品数量 |
| `iScopeTypeException` | `iScopeTypeException` | `iScopeTypeException` | 例外商品 |
| `iMaxUsedNum` | `iMaxUsedNum` | `iMaxUsedNum` | 最大使用张数/单 |
| `iExpMode` | `iExpMode` | `iExpMode` | 有效期 |
| `iintervalDaysEffect` | `iintervalDaysEffect` | `iintervalDaysEffect` | 领取后 |
| `iintervalDaysExp` | `iintervalDaysExp` | `iintervalDaysExp` | 领取后 |
| `iCanUseTime` | `iCanUseTime` | `iCanUseTime` | 可用时段 |
| `iDiscountMethod` | `iDiscountMethod` | `iDiscountMethod` | 优惠方式 |
| `iDiscountNum` | `iDiscountNum` | `iDiscountNum` | 件数 |
| `dCreateTime` | `dCreateTime` | `dCreateTime` | 创建时间（时间戳） |
| `dEffectDate` | `dEffectDate` | `dEffectDate` | 生效时间 |
| `dExpDate` | `dExpDate` | `dExpDate` | 过期时间 |
| `dUpdateTime` | `dUpdateTime` | `dUpdateTime` | 修改时间 |
| `iAbandonCount` | `iAbandonCount` | `iAbandonCount` | 卡券废弃数 |
| `iAvailableCount` | `iAvailableCount` | `iAvailableCount` | 卡券待核销数 |
| `iAvailablePeriod` | `iAvailablePeriod` | `iAvailablePeriod` | 可用周期 |
| `iConsumeCount` | `iConsumeCount` | `iConsumeCount` | 卡券核销数 |
| `iExpiredCount` | `iExpiredCount` | `iExpiredCount` | 卡券过期数 |
| `iServiceThreshold` | `iServiceThreshold` | `iServiceThreshold` | 使用门槛 |
| `iSource` | `iSource` | `iSource` | 卡券来源 |
| `iUnReceiveCount` | `iUnReceiveCount` | `iUnReceiveCount` | 未发送数量 |
| `iUseType` | `iUseType` | `iUseType` | 使用方式 |
| `iVaildPreCount` | `iVaildPreCount` | `iVaildPreCount` | 已生效预发记录数 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bGoodsDuplication` | `bGoodsDuplication` | `bGoodsDuplication` | 商品是否可重复 |
| `bSelectAllGoods` | `bSelectAllGoods` | `bSelectAllGoods` | 是否可选择全部商品 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 商家名称 |
| `iScopeID` | `iScopeID` | `scopeID` | 维度id |
| `iAssociateGoodsID` | `iAssociateGoodsID` | `iAssociateGoodsID` | 关联商品 |
| `iScopeID` | `iScopeID` | `iScopeID` | 卡券管理维度id |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCompanyBurdenAmount` | `iCompanyBurdenAmount` | `iCompanyBurdenAmount` | 企业分摊金额 |
| `iDistributorBurdenAmount` | `iDistributorBurdenAmount` | `iDistributorBurdenAmount` | 分销商分摊金额 |
| `iStoreBurdenAmount` | `iStoreBurdenAmount` | `iStoreBurdenAmount` | 门店分摊金额 |
| `iCompanyBurdenBl` | `iCompanyBurdenBl` | `iCompanyBurdenBl` | 企业分摊比例 |
| `iDistributorBurdenBl` | `iDistributorBurdenBl` | `iDistributorBurdenBl` | 分销商分摊比例 |
| `iStoreBurdenBl` | `iStoreBurdenBl` | `iStoreBurdenBl` | 门店分摊比例 |
| `fStartAmount` | `fStartAmount` | `fStartAmount` | 启用金额 |
| `fReduceAmount` | `fReduceAmount` | `fReduceAmount` | 减免金额 |
| `fDiscount` | `fDiscount` | `fDiscount` | 折扣率 |
| `fReferencePrice` | `fReferencePrice` | `fReferencePrice` | 参考价格 |
| `fReduceToAmount` | `fReduceToAmount` | `fReduceToAmount` | 减至金额 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `dCouponEffectDate` | `dCouponEffectDate` | `dCouponEffectDate` | 固定时间 |
| `dCouponExpDate` | `dCouponExpDate` | `dCouponExpDate` | 至 |
| `bWXCheckTime` | `bWXCheckTime` | `bWXCheckTime` | 审核时间 |
| `dCreateDate` | `dCreateDate` | `dCreateDate` | 创建时间（日期） |

### byte (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iShopOrOrg` | `iShopOrOrg` | `iShopOrOrg` | 适用范围 |
| `iintervalEffectUnit` | `iintervalEffectUnit` | `iintervalEffectUnit` | 生效日期单位 |
| `iintervalExpUnit` | `iintervalExpUnit` | `iintervalExpUnit` | 失效日期单位 |
| `iWxCodeType` | `iWxCodeType` | `iWxCodeType` | 微信Code码类型 |
| `iScopeLevel` | `iScopeLevel` | `iScopeLevel` | 卡券管理维度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `couponDefineCharacter` | `couponDefineCharacter` | `couponDefineCharacter` | 自定义项特征属性组 |

### other (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `couponConvertRule` | 优惠券兑换规则关系 |
| `` | `` | `couponExchangeRules` | 优惠券兑换规则 |
| `` | `` | `couponExcluesion` | 卡券互斥关系表 |
| `` | `` | `couponFreeDefine` | 优惠券自由自定义项 |
| `` | `` | `couponGoods` | 优惠券商品关系 |
| `` | `` | `couponGoodsClass` | 优惠券商品分类关系 |
| `` | `` | `couponGoodsClassTemp` | 优惠券商品关系 |
| `` | `` | `couponGoodsExclude` | 卡券商品例外表 |
| `` | `` | `couponGoodsSKU` | 优惠券商品SKU关系 |
| `` | `` | `couponGoodsSKUExclude` | 卡券商品SKU例外表 |
| `` | `` | `couponGoodsTag` | 优惠券商品标签关系 |
| `` | `` | `couponMemberLevel` | 卡券会员等级关系表 |
| `` | `` | `couponShop` | 卡券商家关系表 |
| `` | `` | `couponStore` | 卡券适用门店关系表 |
| `` | `` | `couponUmallSite` | 卡券适用站点关系表 |
| `` | `` | `couponUsedTime` | 卡券可用时间段关系表 |
| `` | `` | `couponWXaccount` | 卡券公众号关系表 |

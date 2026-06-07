---
title: "B2C商城获取订单信息"
apiId: "1ac36d52449b4bf08428b588aecec222"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Marketplace Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketplace Order]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城获取订单信息

>  请求方式	GET | Marketplace Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/b2c/orders/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
orderno	string	query	否	订单号    示例: U-O-21-720-20151118-000002

## 3. 请求示例

Url: /yonbip/b2c/orders/detail?access_token=访问令牌&orderno=U-O-21-720-20151118-000002

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	int	否	是否成功标记 示例：200
message	string	否	请求成功消息 示例：操作成功
data	object	是	数据对象信息
iCorpId	long	否	企业ID 示例：2000049
cOrderNo	string	否	订单号 示例：O-2000049-32370-20200304-002
iAgentId	long	否	客户信息 示例：0
dAppointDate	string	否	预约送货日期 示例：2020-03-05
cAppointTime	string	否	预约送货时间段 示例：10:00-11:00
cpusecount	int	否	当前订单能使用的张数 示例：0
cpmoney	double	否	当前优惠券最大能抵扣金额 示例：0
iMemeberId	long	否	会员id 示例：32370
preferentialId	long	否	整单优惠信息 示例：0
preferentialMoney	double	否	整单优惠金额 示例：0
couponName	string	否	优惠券名 示例：代金券1212121212
couponMoney	double	否	分摊的优惠券抵扣 示例：3
couponBuyMoney	double	否	分摊优惠券抵扣的购买金额 示例：0
couponId	string	否	优惠券的编码ID 示例：190488996777600018225621399164
couponFileId	long	否	优惠券档案的ID 示例：1904889967776000
pointNum	int	否	使用积分 示例：0
recoverPointNum	int	否	恢复使用积分 示例：0
pointMoney	double	否	分摊的积分抵扣金额 示例：0
newPoints	int	否	获得平台积分 示例：0
newShopPoints	int	否	获得商家积分 示例：0
giftPoints	int	否	赠与的平台积分 示例：0
giftShopPoints	int	否	赠与的商家积分 示例：0
activityIds	string	否	满赠子活动id
wid	string	否	微信公众账号ID 示例：gh_824be94f968c
oid	string	否	粉丝ID 示例：gh_824be94f968c
clientType	string	否	客户端类型:1pc;2mobile;4微信 示例：1
isPointPreferential	boolean	否	是否是积分换购 示例：false
pointPrice	double	否	积分换购的原金额 示例：0
isCartOrder	boolean	否	积分换购是否从购物车下单 示例：false
isVirtualCard	boolean	否	订单是否纯虚拟卡券类型的订单 示例：false
storageMoney	double	否	储值卡使用金额 示例：10
unStorageMoney	double	否	非储值卡支付金额 示例：0
storageDisaccount	double	否	储值卡折扣金额 示例：0
iInvoiceMoney	double	否	发票金额 示例：0
cInvoiceType	string	否	发票类型 示例：NONE
oCustomSetting	object	否	商城配置信息
iPointNum	int	否	积分换购所需的积分 示例：0
dailyStatus	string	否	日报状态 示例：0
retailRequestStatus	boolean	否	零售要货状态 false 未要货 true 已要货 示例：false
invoice_enableflag	boolean	否	是否启用纸质发票 示例：false
eInvoiceEnable	boolean	否	是否启用纸质发票 示例：false
eInvoiceMemberBilling	boolean	否	是否启用电子发票 示例：false
oInvoiceContent	string	是	发票内容list 示例：["办公用品"]
cInvoiceStatus	short	否	开票状态 未开票 0, 待开票 1, 开票中 2, 开票成功 3, 开票失败 4 示例：0
isStorageCard	boolean	否	是否储值卡订单 示例：false
iVirtualOrderType	short	否	生成某个虚拟商品订单的虚拟商品模板(一般用于系统自己生成默认订单时使用, 该字段作为isStorageCard替换字段使用) 参照的值是：ProductVirtualType STORAGECARD(1) GIFTCARD(2) CARDTICKET(3) OTHER(4) ENTRYFEE(5) 示例：0
bHiddenRemark	boolean	否	订单结算页是否隐藏备注 示例：false
enableVirtualOrderReturn	boolean	否	是否支持退款 示例：false
bHiddden	boolean	否	是否隐藏 示例：false
iAgentShipToAddressId	long	否	收货地址ID 示例：0
iMemeberAddress	long	否	会员地址id 示例：169
ideliveryTypeid	long	否	运费模板ID 示例：15
ideliveryName	string	否	运费模板名称 示例：默认1
protect	boolean	否	是否保价 示例：false
cReceiver	string	否	收货人 示例：清風々浮雲
cReceiveMobile	string	否	收货人手机号 示例：15600908901
cReceiveAddress	string	否	收货地址 示例：中国 北京 北京市 海淀区 null 北清路68号
cRegion	string	否	区域ID 示例：110108
iPostage	double	否	订单邮费 示例：0
ipadPostage	long	否	运费模板名称 示例：0
iOriPostage	double	否	订单支持改运费后,用来记录原始邮费 示例：0
iPostagePoints	int	否	订单邮费平台赠送的积分 示例：0
iPostageShopPoints	int	否	订单邮费商家赠送的积分 示例：0
isPost	boolean	否	是否包邮 示例：false
iDispatchStatus	short	否	配送订单状态 暂时只用到11，其他状态没用到 0:未生成配送计划，1:已生成配送计划 11:已生成配送单 2:已配送完成 3:退订 4：终止(手动关闭订单时终止) 示例：0
iSubmiterId	long	否	提交人 示例：32370
iConfirmerId	string	否	分配店员ID 示例：0
dModifiedDate	string	否	修改时间 示例：2020-03-04 10:27:37
dOrderDate	string	否	订单日期 示例：2020-03-04 10:27:55
isGetPrice	boolean	否	预订商品是否按时间去取调价单价格 示例：false
isCardExchange	boolean	否	是否是卡券兑换 示例：false
isVirtualReservation	boolean	否	是否是虚拟预订商品订单 示例：false
fSumNetMoney	double	否	合计净额(减整单优惠,优惠券) 示例：0
maxIndex	int	否	金额最大的子表索引 示例：0
cOrderPayType	string	否	支付方式 示例：FIRSTPAY
cOrderTradeType	string	否	支付方式的类型 示例：STORAGE
payTypeCode	string	否	支付配置表(payment)里的支付类型编码payTypeCode 示例：storagecard
cPayType	string	否	支付类型 //来自于枚举OrderPayType 线上支付，线下支付 示例：FIRSTPAY
iSettlementId	long	否	解决方案id 示例：0
fExchangeRate	float	否	汇率 示例：0
iLogisticId	long	否	物流公司id 示例：0
oOrderDetails	object	是	订单子表数组
oOrderCustomItems	object	是	订单自定义项
promotionCode	string	否	推广码编码
promoter	string	否	推广商编码
isFinishDelivery	boolean	否	是否配送完成？ 示例：false
extendedField1	string	否	零售表头id 示例：1639856712749312
dDeliveryDate	string	否	交货日期 示例：2020-03-04 10:27:37
dConfirmDate	string	否	订单确认时间 示例：2020-03-04 10:28:26
dPayDate	string	否	订单支付时间 示例：2020-03-04 10:28:26
dReceiveDate	string	否	订单确认收货时间 示例：2020-03-04 10:27:37
isHandleClose	long	否	关闭来源 1代表系统自动关闭订单,2代表管理端手动关闭订单,3代表前台取消订单 示例：0
cStatusCode	string	否	当前状态 示例：PAYMONEY
cNextStatusName	string	否	下一状态名 示例：订单发货
cNextStatus	string	否	下一状态 :PAYMONEY待付款;DELIVERGOODS待发货;TAKEDELIVERY待收货;ENDORDER已完成;CLOSEORDER已关闭 示例：DELIVERGOODS
iCurrentStatus	int	否	当前在第几个状态 示例：1
cPayStatusCode	string	否	支付状态：FINISHPAYMENT付款完成；NOTPAYMENT未付款 示例：FINISHPAYMENT
iProductStatus	int	否	生产状态 示例：0
storeId	long	否	门店Id 示例：1185986663567616
storeName	string	否	门店名称 示例：北京西站
storeCode	string	否	门店编码 示例：m0418
storeType	int	否	门店类型 示例：1
cDeliverType	string	否	物流方式（快递物流EMS、门店自提PICKUP） 示例：STOREDELIVERY
ladingCode	string	否	提货码 示例：61705096
fPurePrice	double	否	订单不包含任何优惠的订单价格，同样也不包含邮费 示例：0
fDiscountFee	double	否	折扣额或者涨价的额度 示例：0
fPayMoney	double	否	实付金额 示例：10
depositPercentage	int	否	该商品支持的定金金额百分比 示例：0
depositDealPayType	short	否	该商品支持的定金金额类型 0(固定金额) 1(成交额百分比) 示例：0
fPendingDepositMoney	long	否	正处理定金金额 示例：0
fTotalMoney	double	否	订单总金额 示例：10
paidMoney	double	否	已支付金额,审核的金额 示例：0
restMoney	double	否	待付金额，也就是订单当前还需要支付多少金额 示例：0
preferentialSumMoney	double	否	优惠活动总计 示例：0
fCouponTotalMoney	double	否	优惠总额 示例：0
unConfirmMoney	double	否	已支付,未审核的金额 示例：0
cOrderIdentifyingCode	string	否	代客下单的时候标记这个订单当时使用的验证码
iSourceDetail	short	否	订单来源：1（PC官网） 2（移动WEB） 3(APP) 示例：2
iMarkType	short	否	订单标记类型：0（会员下单）1（店员开单）2(区域) 示例：0
iOrderType	short	否	订单类型 0普通订单 1团购 2周期购3拼团购订单 示例：0
iTagType	int	否	订单终端类型 0 平台型 1 直营门店 2 加盟店 3 示例：0
iType	int	否	订单类型 0普通订单 1送礼订单(喜马) 2零售预订单 3秒杀商品 示例：2
onLineOffLine	int	否	online 线上订单0 offline 线下订单1 示例：0
iDelete	int	否	删除标志 示例：0
iRegionArchiveId	long	否	区域档案ID 示例：51
iPrcsStatus	short	否	加工状态(供零售用) 示例：0
iEcontractStatus	short	否	总合同状态 示例：1
iEcontractBuyerStatus	short	否	买家合同状态 示例：1
iEcontractSellerStatus	short	否	卖家合同状态 示例：1
regionArchiveName	string	否	区域档案名称 示例：西站
isHaveMutexStrategy	boolean	否	总互斥是否启用 示例：false
autoAbolishJob	object	否	定时任务对象信息
isUploadOrderAttachments	boolean	否	是否支持买家上传订单附件 示例：false
isRetailOrder	boolean	否	标识订单行详情行是否来自零售线下订单， true 零售线下门店订单 false 不是零售线下门店订单 示例：false
pubuts	string	否	时间戳 示例：2020-03-04 10:28:35.000
id	long	否	订单id 示例：13455

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"iCorpId": 2000049,
			"cOrderNo": "O-2000049-32370-20200304-002",
			"iAgentId": 0,
			"dAppointDate": "2020-03-05",
			"cAppointTime": "10:00-11:00",
			"cpusecount": 0,
			"cpmoney": 0,
			"iMemeberId": 32370,
			"preferentialId": 0,
			"preferentialMoney": 0,
			"couponName": "代金券1212121212",
			"couponMoney": 3,
			"couponBuyMoney": 0,
			"couponId": "190488996777600018225621399164",
			"couponFileId": 1904889967776000,
			"pointNum": 0,
			"recoverPointNum": 0,
			"pointMoney": 0,
			"newPoints": 0,
			"newShopPoints": 0,
			"giftPoints": 0,
			"giftShopPoints": 0,
			"activityIds": "",
			"wid": "gh_824be94f968c",
			"oid": "gh_824be94f968c",
			"clientType": "1",
			"isPointPreferential": false,
			"pointPrice": 0,
			"isCartOrder": false,
			"isVirtualCard": false,
			"storageMoney": 10,
			"unStorageMoney": 0,
			"storageDisaccount": 0,
			"iInvoiceMoney": 0,
			"cInvoiceType": "NONE",
			"oCustomSetting": {
				"iCorpId": 0,
				"invoice_enableflag": false,
				"personal_invoice_rate": 0,
				"corp_invoice_rate": 0,
				"eInvoiceEnable": false,
				"eInvoiceSMSRecept": false,
				"eInvoiceMemberBilling": false,
				"isBillingByStoreCard": false,
				"storage_enableflag": false,
				"goods_list_showtype": 0,
				"market_price_showflag": false,
				"market_price_generate_symbol": 0,
				"market_price_generate_rate": 0,
				"goods_saveamount_showtype": 0,
				"member_price_showtype": 0,
				"goods_label_showflag": false,
				"goods_recommendation_enableflag": false,
				"goods_property_showtype": 0,
				"goods_list_pagesize": 0,
				"goods_list_maxpage": 0,
				"goods_inventory_amount_showtype": 0,
				"goods_inventory_status_showflag": false,
				"goods_inventory_emergency_amount": 0,
				"outofstock_goods_showflag": false,
				"goods_inventory_alarm_amount": 0,
				"paytype_online": true,
				"paytype_offline": false,
				"onlineDeduceStock": "FINISHPAYMENT",
				"offlineDeduceStock": "ORDERCOMMIT",
				"cartpromocode": false,
				"showfooter": true,
				"ischangeShowFootprint": false,
				"iPromotingPrice": false,
				"iOriginalPrice": false,
				"dlyType": "EMS",
				"deliverType": 0,
				"enabledPoint": false,
				"iCancellationOfRefunds": true,
				"iDepositUseIntegral": true,
				"multiDlyTypesFeeRule": 3,
				"bMobileOfflineCollect": true,
				"enableAppoint": 0,
				"bMemberChooseDeliveryStore": false,
				"isStoreInventory": false,
				"noLimitedPickupStore": false,
				"isEmsDispatchPlan": false,
				"isDeliveryFence": false,
				"isEnableAreaManage": false,
				"isEnableAreaPromotion": false,
				"ischangeAreaManage": false,
				"iFourAddressReference": false,
				"isCheckArea": false,
				"isDisplayReferee": true,
				"iInventoryQuantity": false,
				"iInventoryPrompt": false,
				"iStoreBuffetShopping": false,
				"iStoreBuffetInventoryCtrl": false,
				"isOrderStoreLimit": false,
				"enableVirtualOrderReturn": false,
				"bVirualConfirmTake": false,
				"iPaymentGameMode": 0,
				"iInvCalMode": 0,
				"pickUpCode": 1,
				"bDeliveryOrderPriceCanBeChanged": false,
				"iEnableCycleUnsubscribe": true,
				"iEnableUnmannedShelves": false,
				"iShowDistributeProcuct": false,
				"iShowComment": false,
				"iShowConsult": false,
				"iRecommendProduct": false,
				"isOrderSynchronizationMall": 0,
				"iMemScopeLevel": 0,
				"enablePolymerizePay": false,
				"iEnableEcontract": false,
				"polymerizePayWechat": false,
				"polymerizePayAlipay": false,
				"polymerizePayChanpay": false,
				"enableUnionPay": false,
				"unionPayWechat": false,
				"unionPayAlipay": false,
				"unionPayCloud": false,
				"isOpenShop": false,
				"isValidPromotion": false,
				"isBusinessPromotion": 0,
				"isOpenShopMem": 0,
				"isMerchantDistribution": 0,
				"oInvoiceContent": [
					"办公用品"
				],
				"isNotCheckStorage": false,
				"iShowAllLvPrice": false,
				"isTakeInventory": false,
				"isRecordRetailInv": false,
				"enableRetail": false,
				"enableUDH": false,
				"isShowPaidUpMemPrice": false,
				"isUploadOrderAttachments": false,
				"bSupportExtendDev": false,
				"bPayOfOffline": true,
				"iStartOrderPushMessage": false,
				"isProductListRealPrice": true,
				"iShowSellingPoint": false,
				"iShowModelDescription": false,
				"iShowPromotion": false,
				"iAutoSelAvailCoups": true,
				"iMemberPrice": true,
				"borderShowSkuName": false,
				"iMemberProduct": false,
				"iMemberProductType": 1,
				"isAddressNoRegion": false,
				"iSwitchState": true,
				"iEnableCacheMode": false,
				"iStartMemCheckRent": false,
				"isOrderReview": false,
				"isvirtualOrdFirstDeliver": false,
				"isOpenComment": true,
				"iStartEISplit": false,
				"isMemberRegister": false,
				"isReturnAutoComplete": false,
				"isProDefaultStart": true,
				"isUseEs": false,
				"iSystemPostage": true,
				"isEInvoiceAutoCheck": true,
				"isShowMemberPrice": false,
				"xjPointsCtr": false,
				"isRefundOnly": false,
				"styleType": 0,
				"isOpen": false,
				"couponCanReturn": false,
				"storeOrderCanReturn": true,
				"isIntelligentRecommend": false,
				"isStoreEnableWallet": false,
				"isDefineMemPrice": false,
				"eInvoiceChannel": true,
				"isCanOpenFreightInvoice": false,
				"isOpenDistributor": false,
				"distributorGoodsShowType": 1,
				"isDistributorPrice": false,
				"isSecKilOrdRedInv": false,
				"bCanUsePoints": false
			},
			"iPointNum": 0,
			"dailyStatus": "0",
			"retailRequestStatus": false,
			"invoice_enableflag": false,
			"eInvoiceEnable": false,
			"eInvoiceMemberBilling": false,
			"oInvoiceContent": [
				"办公用品"
			],
			"cInvoiceStatus": 0,
			"isStorageCard": false,
			"iVirtualOrderType": 0,
			"bHiddenRemark": false,
			"enableVirtualOrderReturn": false,
			"bHiddden": false,
			"iAgentShipToAddressId": 0,
			"iMemeberAddress": 169,
			"ideliveryTypeid": 15,
			"ideliveryName": "默认1",
			"protect": false,
			"cReceiver": "清風々浮雲",
			"cReceiveMobile": "15600908901",
			"cReceiveAddress": "中国 北京 北京市 海淀区 null 北清路68号",
			"cRegion": "110108",
			"iPostage": 0,
			"ipadPostage": 0,
			"iOriPostage": 0,
			"iPostagePoints": 0,
			"iPostageShopPoints": 0,
			"isPost": false,
			"iDispatchStatus": 0,
			"iSubmiterId": 32370,
			"iConfirmerId": "0",
			"dModifiedDate": "2020-03-04 10:27:37",
			"dOrderDate": "2020-03-04 10:27:55",
			"isGetPrice": false,
			"isCardExchange": false,
			"isVirtualReservation": false,
			"fSumNetMoney": 0,
			"maxIndex": 0,
			"cOrderPayType": "FIRSTPAY",
			"cOrderTradeType": "STORAGE",
			"payTypeCode": "storagecard",
			"cPayType": "FIRSTPAY",
			"iSettlementId": 0,
			"fExchangeRate": 0,
			"iLogisticId": 0,
			"oOrderDetails": [
				{
					"iCorpId": 1717,
					"cOrderNo": "O-1717-67501-20201106-004",
					"iSKUId": 1896088697966848,
					"orderSubsidiaryDetailList": [
						{
							"iSKUId": 1315936914133259,
							"productId": 1315936914133248,
							"iCorpId": 2000049,
							"realProductAttribute": 1,
							"iProductNum": 1,
							"strategyId": 1637350716461313,
							"iOrderDetailId": 17736,
							"skuName": "套餐酒水001",
							"cProductName": "套餐酒水",
							"cSkuCode": "1324356",
							"proportion": 50,
							"cPackageName": "选配套餐",
							"skuDescription": "颜色:白色;",
							"skuPrice": 30,
							"fDiscount": 25,
							"fPromotionDiscount": 25,
							"fGiftTokenDiscount": 3,
							"fPointDiscount": 0,
							"fSceneDiscount": 0,
							"fPreferentialMoney": 0,
							"fMoney": 5,
							"storageDiscount": 0,
							"storagePayMoney": 0,
							"cProductCode": "taocanjiu",
							"retailDetailId": 1639856712765696,
							"productClassId": 1262291339448576,
							"hvMainPt": true,
							"iRetailSkuId": 1315936914133259,
							"lRetailInventory": 1,
							"lRetailInventoryEx": 1,
							"iRetailProductId": 1315936914133248,
							"virtualProductAttribute": 0,
							"productAttribute": 1,
							"pubuts": "2020-03-04 10:28:31.000",
							"id": 3022
						}
					],
					"fixedSale": 1,
					"oOrderDetailPropertys": [
						{
							"iOrder": 1,
							"orderDetailId": 6752,
							"promptMessage": "门店自提",
							"propertyName": "配送方式",
							"propertyalias": "配送方式",
							"iCorpId": 2000049,
							"isShow": true,
							"pubuts": "2020-03-04 10:28:31.000",
							"id": 3022
						}
					],
					"DefaultImage": "http://ys-yxy-testres.yonyoucloud.com/15e4396e-99ce-4243-8910-95fe8f6ab191.png",
					"iCommentId": 0,
					"iQuantity": 1,
					"fProcessedQuantity": 1,
					"aQuantity": 0,
					"fReturnQuantity": 0,
					"fReturnMoney": 0,
					"thisQuantity": 0,
					"cProductCode": "taocao",
					"cSpecDescription": "",
					"iProductId": 1315932345372928,
					"iProductClassId": 1262291339448576,
					"cProductClassCode": "m002",
					"cProductClassName": "套餐",
					"cProductClassPath": "1262291339448576|",
					"iPointNum": 0,
					"pointPrice": 0,
					"fSaleCost": 10,
					"sumRowAmount": 0,
					"fSalePoint": 0,
					"fNetMoney": 0,
					"fCanReturnMoney": 0,
					"weight": 0,
					"cProductName": "bgy套餐",
					"iSendQuantity": 0,
					"fOriPricie": 10,
					"fSalePrice": 10,
					"fMarketPricie": 100,
					"fNewSalePrice": 0,
					"lPartNPricePreferentialId": 0,
					"warehouseid": 1185986392789248,
					"lPackageId": 1637350716461312,
					"iPackageNum": 1,
					"sPackageUUID": "40287b20759b6b6b01759c53fdbc0000",
					"bIsMain": true,
					"dCreated": "2020-03-04 10:27:39",
					"iShoppingCartId": 27386,
					"fTraderPrivilege": 0,
					"isGiftCard": false,
					"productAttribute": 1,
					"realProductAttribute": 1,
					"virtualProductAttribute": 9,
					"salePoints": 0,
					"activityType": 0,
					"iActivityCategory": 0,
					"isGiftProduct": false,
					"giftPoints": 0,
					"giftShopPoints": 0,
					"newPoints": 0,
					"newShopPoints": 0,
					"depositPayType": 0,
					"storageDiscount": 0,
					"storagePayMoney": 10,
					"pointMoney": 0,
					"preferentialMoney": 0,
					"couponMoney": 0,
					"couponBuyMoney": 0,
					"payMoney": 0,
					"changePrice": 0,
					"bEnableSubscribe": false,
					"iRegionArchiveId": 51,
					"postageMoney": 2,
					"isRetailOrder": false,
					"extendedField1": "1639856712749313",
					"dlyFeeRuleId": 0,
					"iOrderType": 0,
					"fCanReturnQuantity": 0,
					"iEnableEcontract": false,
					"isHaveMutexStrategy": false,
					"lRetailInventory": 0,
					"cSkuName": "bgy套餐",
					"cSkuCode": "taocao",
					"cProductShowName": "bgy套餐",
					"iDispatchTime": 0,
					"pubuts": "2020-03-04 10:28:31.000",
					"id": 17736
				}
			],
			"oOrderCustomItems": [
				{
					"iCorpId": 2000049,
					"cOrderNo": "O-2000049-32370-20200304-002",
					"cDefaultValue": "",
					"cDefineName": "cDefine1",
					"cFormat": "",
					"cTitle": "苏宁订单号",
					"cType": "text",
					"iLength": 256,
					"isNull": true,
					"isEnabled": true,
					"cTypeName": "文本",
					"cTip": "下单后自动带入",
					"pubuts": "2020-03-04 10:27:59.000",
					"id": 126859
				}
			],
			"promotionCode": "",
			"promoter": "",
			"isFinishDelivery": false,
			"extendedField1": "1639856712749312",
			"dDeliveryDate": "2020-03-04 10:27:37",
			"dConfirmDate": "2020-03-04 10:28:26",
			"dPayDate": "2020-03-04 10:28:26",
			"dReceiveDate": "2020-03-04 10:27:37",
			"isHandleClose": 0,
			"cStatusCode": "PAYMONEY",
			"cNextStatusName": "订单发货",
			"cNextStatus": "DELIVERGOODS",
			"iCurrentStatus": 1,
			"cPayStatusCode": "FINISHPAYMENT",
			"iProductStatus": 0,
			"storeId": 1185986663567616,
			"storeName": "北京西站",
			"storeCode": "m0418",
			"storeType": 1,
			"cDeliverType": "STOREDELIVERY",
			"ladingCode": "61705096",
			"fPurePrice": 0,
			"fDiscountFee": 0,
			"fPayMoney": 10,
			"depositPercentage": 0,
			"depositDealPayType": 0,
			"fPendingDepositMoney": 0,
			"fTotalMoney": 10,
			"paidMoney": 0,
			"restMoney": 0,
			"preferentialSumMoney": 0,
			"fCouponTotalMoney": 0,
			"unConfirmMoney": 0,
			"cOrderIdentifyingCode": "",
			"iSourceDetail": 2,
			"iMarkType": 0,
			"iOrderType": 0,
			"iTagType": 0,
			"iType": 2,
			"onLineOffLine": 0,
			"iDelete": 0,
			"iRegionArchiveId": 51,
			"iPrcsStatus": 0,
			"iEcontractStatus": 1,
			"iEcontractBuyerStatus": 1,
			"iEcontractSellerStatus": 1,
			"regionArchiveName": "西站",
			"isHaveMutexStrategy": false,
			"autoAbolishJob": {
				"number": 5,
				"unit": "50"
			},
			"isUploadOrderAttachments": false,
			"isRetailOrder": false,
			"pubuts": "2020-03-04 10:28:35.000",
			"id": 13455
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


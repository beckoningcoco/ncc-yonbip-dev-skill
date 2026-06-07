---
title: "销售日报新增API"
apiId: "1857336840432386055"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Sales Report"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Sales Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售日报新增API

>  请求方式	POST | Daily Sales Report (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/salesDailyRpt/addsalesDailyRpt
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	是	新增销售日报信息
cShopID	string	否	否	店铺id 示例：1862535281660160
cShopCode	string	否	否	店铺编码（店铺id有值时以id为准) 示例：0808001
tid	string	否	否	交易编号 示例：1234567
created	string	否	否	下单时间 示例：2023-10-24 15:15:15
pay_time	string	否	否	付款时间 示例：2023-10-24 15:15:15
stored_card_disrefund	BigDecimal	否	否	钱包折扣额 示例：0
is_storeOrder	string	否	否	是否是U商城门店日报(1:是 0:否) 示例：0
is_cardticket	string	否	否	是否卡券类型(1:是 0:否)
dDate	string	否	是	单据日期 示例：2023-10-24 00:00:00
dShipTime	string	否	否	发货时间 示例：2023-10-24 15:15:15
operatetime	string	否	否	制单时间 示例：2023-10-24 15:15:15
tradeTitle	string	否	否	交易标题
cshipcode	string	否	否	电商发货号 示例：1342354543543543
iinvoiceName	string	否	否	发票抬头 示例：用友网络科技
cinvoicetaxpayernum	string	否	否	发票纳税人识别码 示例：FX3342365467435P
cinvoicecompanybank	string	否	否	开票公司开户行 示例：招商银行
cinvoicecompanyaccount	string	否	否	发票公司银行账号 示例：3546576745324246576
cinvoicecompanyaddr	string	否	否	发票公司地址 示例：北京市海淀区北清路68号
cinvoicecompanyphone	string	否	否	发票公司电话 示例：010-209979696
receiveinvoicemail	string	否	否	接收发票邮箱 示例：jywieuy@yonyou.com
buyer_nick	string	否	否	买家昵称 示例：买家昵称
applier_nick	string	否	否	分销商昵称 示例：分销商昵称
cFenxiaoType	string	否	否	分销类型（1：淘分销，2：淘经销）
tc_order_id	string	否	否	分销采购单交易编号 示例：22222222168761321
customer	string	否	否	客户id（客户编码和客户id字段必选其一输入） 示例：1866583913795840
customer_code	string	否	否	客户编码(客户编码和客户id字段必选其一输入；存在客户id以id为准) 示例：stfl000002
department	string	否	否	部门id（部门编码和部门id字段必选其一输入） 示例：1930006511112960
department_code	string	否	否	部门编码(部门编码和部门id字段必选其一输入；存在部门id以id为准) 示例：0925
salesman	string	否	否	业务员id 示例：1930234991972608
salesman_code	string	否	否	业务员编码(存在业务员id以id为准) 示例：A000005
cexch_name	string	否	否	币种id（币种简称和币种id字段必选其一输入） 示例：2001078695171072
ys_currency_code	string	否	否	币种简称（币种简称和币种id字段必选其一输入；存在币种id，则以币种id为准） 示例：CNY
receiver_name	string	否	否	收货人姓名 示例：大老师
receiver_mobile	string	否	否	手机号 示例：18832533333
receiver_phone	string	否	否	电话 示例：18832533333
receiver_country	string	否	否	国家 示例：中国
receiver_state	string	否	否	省 示例：北京市
receiver_city	string	否	否	市 示例：北京市
receiver_district	string	否	否	区 示例：海淀区
receiver_town	string	否	否	乡镇/街道 示例：西北旺街道
receiver_address	string	否	否	详细地址 示例：北清路68号用友产业园
receiver_zip	string	否	否	邮编 示例：100080
buyer_email	string	否	否	收货人邮箱 示例：nweh@yonyou.com
seller_memo	string	否	否	线下客服备注 示例：赠品
receiver_card_id	string	否	否	收货人证件号 示例：234345456878534
cExpressCoID	string	否	否	快递公司id 示例：1865165875384576
expressCode	string	否	否	快递公司编码(存在快递公司id时以id为准) 示例：001
cExpressCode	string	否	否	快递单号 示例：SF5432324
shipping_type	string	否	否	物流方式（ems:EMS, express:快递, FAST:快速, free：卖家包邮， LOGISTICS：物流发货， MT_HUNHESONG：美团混合送， MT_KUAISONG：美团快送， MT_QISHOUPEISONG：骑手配送， MT_SHANGJIAPEISONG：商家配送， MT_TONGCHENGPEISONG：同城配送， MT_ZHUANSONG：美团专送， ORDINARY：平邮， post：平邮， SELF_PICKUP：自提， SELLER：卖家包邮， virtual：虚拟） 示例：EMS
isInvoice	string	否	否	需要发票(1:是 0:否) 示例：0
iinvoicetype	string	否	否	发票类型 示例：纸质普票
seller_memo_online	string	否	否	卖家备注 示例：发韵达
buyer_message	string	否	否	买家留言 示例：发韵达
memo	string	否	否	备注 示例：赠送
is_sh_ship	string	否	否	菜鸟仓京东仓(1:是 0:否) 示例：0
ys_businesstype	string	否	否	来源交易类型id（来源交易类型档案编码和来源交易类型档案id字段必选其一输入）
ys_businesstypecode	string	否	否	来源交易类型编码（来源交易类型档案编码和来源交易类型档案id字段必选其一输入；存在来源交易类型id时，以来源交易类型id为准）
salesType	string	否	否	销售类型
couponId	string	否	否	商城券号
dailyRptGenTye	string	否	否	汇总结转成本
dailyType	string	否	是	日报类型
dailyRptBizType	string	否	否	日报交易类型id（日报交易类型档案编码和日报交易类型档案id字段必选其一输入）
dailyRptBizTypecode	string	否	否	日报交易类型编码（日报交易类型档案编码和日报交易类型档案id字段必选其一输入；存在日报交易类型id，则以日报交易类型id为准）
operator	string	否	否	制单人
accentitycode	string	否	否	财务组织编码（若财务组织id存在，则以财务组织id为准）
accentity	string	否	否	财务组织id
orgcode	string	否	否	销售组织编码（组织编号和组织id字段必选其一输入；存在销售组织id时，以销售组织id为准）
iOrgID	string	否	否	销售组织id（组织编号和组织id字段必选其一输入）
SalesDailyRptDetail	object	是	是	销售日报表体字段

## 3. 请求示例

Url: /yonbip/sd/dst/salesDailyRpt/addsalesDailyRpt?access_token=访问令牌
Body: {
	"partParam": {
		"cShopID": "1862535281660160",
		"cShopCode": "0808001",
		"tid": "1234567",
		"created": "2023-10-24 15:15:15",
		"pay_time": "2023-10-24 15:15:15",
		"stored_card_disrefund": 0,
		"is_storeOrder": "0",
		"is_cardticket": "",
		"dDate": "2023-10-24 00:00:00",
		"dShipTime": "2023-10-24 15:15:15",
		"operatetime": "2023-10-24 15:15:15",
		"tradeTitle": "",
		"cshipcode": "1342354543543543",
		"iinvoiceName": "用友网络科技",
		"cinvoicetaxpayernum": "FX3342365467435P",
		"cinvoicecompanybank": "招商银行",
		"cinvoicecompanyaccount": "3546576745324246576",
		"cinvoicecompanyaddr": "北京市海淀区北清路68号",
		"cinvoicecompanyphone": "010-209979696",
		"receiveinvoicemail": "jywieuy@yonyou.com",
		"buyer_nick": "买家昵称",
		"applier_nick": "分销商昵称",
		"cFenxiaoType": "",
		"tc_order_id": "22222222168761321",
		"customer": "1866583913795840",
		"customer_code": "stfl000002",
		"department": "1930006511112960",
		"department_code": "0925",
		"salesman": "1930234991972608",
		"salesman_code": "A000005",
		"cexch_name": "2001078695171072",
		"ys_currency_code": "CNY",
		"receiver_name": "大老师",
		"receiver_mobile": "18832533333",
		"receiver_phone": "18832533333",
		"receiver_country": "中国",
		"receiver_state": "北京市",
		"receiver_city": "北京市",
		"receiver_district": "海淀区",
		"receiver_town": "西北旺街道",
		"receiver_address": "北清路68号用友产业园",
		"receiver_zip": "100080",
		"buyer_email": "nweh@yonyou.com",
		"seller_memo": "赠品",
		"receiver_card_id": "234345456878534",
		"cExpressCoID": "1865165875384576",
		"expressCode": "001",
		"cExpressCode": "SF5432324",
		"shipping_type": "EMS",
		"isInvoice": "0",
		"iinvoicetype": "纸质普票",
		"seller_memo_online": "发韵达",
		"buyer_message": "发韵达",
		"memo": "赠送",
		"is_sh_ship": "0",
		"ys_businesstype": "",
		"ys_businesstypecode": "",
		"salesType": "",
		"couponId": "",
		"dailyRptGenTye": "",
		"dailyType": "",
		"dailyRptBizType": "",
		"dailyRptBizTypecode": "",
		"operator": "",
		"accentitycode": "",
		"accentity": "",
		"orgcode": "",
		"iOrgID": "",
		"SalesDailyRptDetail": [
			{
				"SKUID": "1865168451588352",
				"product_skucode": "xss00001",
				"isGift": "0",
				"num": 2,
				"price": 10,
				"payment": 20,
				"iEBPlatDiscount": 0,
				"cWh": "2609500914586112",
				"Whouse_Code": "00000036",
				"oid": "",
				"tid": "4535365654",
				"stored_card_pay": 0,
				"stored_card_discount": 0,
				"cardpayment": 0,
				"feeType": "",
				"title": "",
				"sbatchno": "",
				"dproducedate": "",
				"dinvaliddate": "",
				"goodsposition": "",
				"sn": "",
				"offlineUnit": "",
				"offlineUnitcode": ""
			}
		]
	}
}

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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	返回值状态码 示例：200
message	string	否	返回值信息提示 示例：操作成功
data	object	否	返回数据
SalesDailyRptDetail	object	是	销售日报表体信息
tenant	long	否	组织id 示例：1857881280057600
type	string	否	平台交易类型 示例：1-货到付款
doctype	long	否	订单类别 示例：0
status	string	否	线上交易状态 示例：buyers_have_paid
receiver_name	string	否	收货人姓名 示例：111
receiver_mobile	string	否	手机号 示例：18832533333
receiver_phone	string	否	电话 示例：18832533333
receiver_country	string	否	国家 示例：中国
receiver_state	string	否	省 示例：北京市
receiver_city	string	否	市 示例：北京市
receiver_district	string	否	区 示例：海淀区
receiver_town	string	否	乡镇/街道 示例：永丰路
receiver_address	string	否	详细地址 示例：用友产业园
cstateid	long	否	省id 示例：1856503919580409
ccityid	long	否	市id 示例：1856503919580410
cdistrictid	long	否	区id 示例：1856503919580416
srctype	long	否	订单来源 示例：2
sys_Status	string	否	订单状态 示例：unapprove
refundStatus	string	否	退款状态 示例：refundNot
cTradeCode	string	否	订单编号 示例：DD000020231107000001
sourcestatus	string	否	原单线上状态 示例：buyers_have_paid
tid	string	否	交易编号 示例：apitest20231106002
buyer_nick	string	否	买家昵称 示例：买家昵称
isPickSelf	long	否	是否自提订单 示例：0
applier_nick	string	否	分销商昵称 示例：分销商昵称
isInvoice	long	否	需要发票 示例：0
created	string	否	下单时间 示例：2023-11-05 15:15:15
pay_time	string	否	付款时间 示例：2023-11-05 15:15:15
advance_paytime	string	否	预付定金时间 示例：2023-11-05 15:15:15
consign_time	string	否	线上发货时间 示例：2023-11-05 15:15:15
cShopID	long	否	店铺id 示例：1862535281660160
org	string	否	组织 示例：1862532516188416
plat	string	否	平台 示例：1
order_type	string	否	订单类型 示例：plat_code_TB
tradeType	string	否	交易类型 示例：2237393234612480
overTime	string	否	最晚发货时间 示例：2023-11-05 23:15:15
cConfirmer	string	否	确认人 示例：昵称-15733201096
dConfirmTime	string	否	确认时间 示例：2023-11-07 16:26:11
isconfirmed	long	否	已确认 示例：1
receiver_name_index	string	否	收货人姓名密文检索 示例：111
receiver_address_index	string	否	收货人地址密文检索 示例：用友产业园
receiver_mobile_index	string	否	收货人手机密文检索 示例：18832533333
receiver_phone_index	string	否	收货人电话密文检索 示例：18832533333
total_num	long	否	商品数量 示例：3
post_fee	long	否	运费 示例：0
discount_fee	long	否	商家优惠金额 示例：0
adjust_fee	double	否	手工调整金额 示例：0.1
payment	long	否	应收金额 示例：10
total_fee	double	否	商品金额 示例：9.9
order_tax_fee	long	否	关税 示例：0
iweight	long	否	商品毛重 示例：0
cShipMode	string	否	发货模式 示例：EnterpriseDeliver
makeInvoiceStatus	long	否	开票状态 示例：0
invoiceCode	string	否	税务云发票号码
invoiceUrl	string	否	电子发票URL
makeBlueInvoiceFailedReason	string	否	开蓝票失败原因
cInvoiceCode	string	否	税务云发票号码
cinvoiceurlpatch	string	否	电子发票URL
cinvoiceextractcode	string	否	发票提取码
id	long	否	订单id 示例：1856676317428187100
pubts	string	否	时间戳 示例：2023-11-07 16:26:12
ytenant	string	否	y租户id 示例：h6q8321v
yTenantId	string	否	y租户id 示例：h6q8321v

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"SalesDailyRptDetail": [
			{
				"goodtype": 0,
				"isGift": 0,
				"citemID": 1872334007750912,
				"newProductSku": 1872334007750912,
				"productID": 1872333994660096,
				"newProduct": 1872333994660096,
				"cWhCode": 1937438580592896,
				"storeOrg": "1862532516188416",
				"num": 3,
				"price": 3.3,
				"total_fee": 9.9,
				"sub_order_tax_fee": 0,
				"post_fee": 0,
				"discount_fee": 0,
				"iEBPlatDiscount": 0,
				"adjust_fee": 0.1,
				"tid": "apitest20231106002",
				"tenant": 1857881280057600,
				"org": "1862532516188416",
				"payment": 10,
				"id": 1856676317428187100,
				"parentid": 1856676317428187100,
				"pubts": "2023-11-07 16:26:11",
				"ytenant": "h6q8321v",
				"yTenantId": "h6q8321v"
			}
		],
		"tenant": 1857881280057600,
		"type": "1-货到付款",
		"doctype": 0,
		"status": "buyers_have_paid",
		"receiver_name": "111",
		"receiver_mobile": "18832533333",
		"receiver_phone": "18832533333",
		"receiver_country": "中国",
		"receiver_state": "北京市",
		"receiver_city": "北京市",
		"receiver_district": "海淀区",
		"receiver_town": "永丰路",
		"receiver_address": "用友产业园",
		"cstateid": 1856503919580409,
		"ccityid": 1856503919580410,
		"cdistrictid": 1856503919580416,
		"srctype": 2,
		"sys_Status": "unapprove",
		"refundStatus": "refundNot",
		"cTradeCode": "DD000020231107000001",
		"sourcestatus": "buyers_have_paid",
		"tid": "apitest20231106002",
		"buyer_nick": "买家昵称",
		"isPickSelf": 0,
		"applier_nick": "分销商昵称",
		"isInvoice": 0,
		"created": "2023-11-05 15:15:15",
		"pay_time": "2023-11-05 15:15:15",
		"advance_paytime": "2023-11-05 15:15:15",
		"consign_time": "2023-11-05 15:15:15",
		"cShopID": 1862535281660160,
		"org": "1862532516188416",
		"plat": "1",
		"order_type": "plat_code_TB",
		"tradeType": "2237393234612480",
		"overTime": "2023-11-05 23:15:15",
		"cConfirmer": "昵称-15733201096",
		"dConfirmTime": "2023-11-07 16:26:11",
		"isconfirmed": 1,
		"receiver_name_index": "111",
		"receiver_address_index": "用友产业园",
		"receiver_mobile_index": "18832533333",
		"receiver_phone_index": "18832533333",
		"total_num": 3,
		"post_fee": 0,
		"discount_fee": 0,
		"adjust_fee": 0.1,
		"payment": 10,
		"total_fee": 9.9,
		"order_tax_fee": 0,
		"iweight": 0,
		"cShipMode": "EnterpriseDeliver",
		"makeInvoiceStatus": 0,
		"invoiceCode": "",
		"invoiceUrl": "",
		"makeBlueInvoiceFailedReason": "",
		"cInvoiceCode": "",
		"cinvoiceurlpatch": "",
		"cinvoiceextractcode": "",
		"id": 1856676317428187100,
		"pubts": "2023-11-07 16:26:12",
		"ytenant": "h6q8321v",
		"yTenantId": "h6q8321v"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	后端服务异常	请联系开发人员

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


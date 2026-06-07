---
title: "订单发货"
apiId: "8076c5f2d5544f28ae059c01dae92287"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 订单发货

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradeorder/ship
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	否	订单-时间戳关系映射
path	string	否	是	调用类型，固定值2 示例：0 默认值：2
ids	string	否	是	订单id 示例：1228320612454656
externalData	object	否	是	externa订单支持修改的部分内容alData
shipdetails	object	是	否	实际发货的发货明细，保存后将把原发货明细替换成此发货明细，不需要修改发货明细则不传
Modify	object	是	否	修改订单的内容 不需要修改则不传
option	object	否	否	选项参数
expresslists	object	是	否	快递明细

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/ship?access_token=访问令牌
Body: {
	"partParam": {},
	"path": "0",
	"ids": "1228320612454656",
	"externalData": {
		"shipdetails": [
			{
				"warehouseCode": "YY005",
				"itemid": 6932,
				"bodyid": 0,
				"iquantity": 1,
				"product": 62240213683824,
				"cshipcode": "FH10272019020100000005",
				"sBatchNo": "",
				"skuCode": 1001,
				"iWarehouseId": 622402136887552,
				"parentid": 1228320612454656,
				"sn": "0700012",
				"locationCode": "T001"
			}
		],
		"Modify": [
			{
				"cuser": "测试",
				"cshipper": "张三",
				"dShipTime": "2019-01-01 12:12:12",
				"cExpressCode": "777777",
				"iweight": 7.99,
				"id": "1228320612454656",
				"cExpressCorp": ""
			}
		],
		"option": {
			"pushFlag": "true"
		},
		"expresslists": [
			{
				"dshiptime": "2025-11-05 16:10:09",
				"cshipcode": "FH10272019020100000005",
				"skucode": "",
				"actualaqty": "",
				"parentid": 1228320612454656,
				"cweighter": "2",
				"deliverstatus": "",
				"tid": "11111111",
				"skuname": "",
				"dweighttime": "2011-01-01 00:00:00",
				"cexpresscode": "0",
				"whcode": "001",
				"iweight": "1"
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
code	long	否	code 示例：200
cpickrowno	string	否	波次号
message	string	否	返回提示信息 示例：共0张订单发货成功,失败1张
data	object	是	返回数据
cpickrowno	string	否	波次号
cTradeCode	string	否	电商订单编号 示例：DSDD99992019040800000009
cpickrowno	string	否	波次号
tid	string	否	交易编号 示例：NewAdd20190408001
total_fee	Decimal	否	商品金额 示例：70
total_num	Decimal	否	商品数量 示例：4
refund_num	Decimal	否	累计退货数量 示例：0
refund_fee	Decimal	否	退款金额 示例：0
discount_fee	Decimal	否	系统优惠金额 示例：0
adjust_fee	Decimal	否	卖家手工调整金额 示例：0
post_fee	Decimal	否	邮费 示例：12
payment	Decimal	否	收款金额 示例：82
receiver_name	string	否	收货人姓名 示例：heylm
receiver_state	string	否	收货人省 示例：北京市
receiver_city	string	否	收货人城市 示例：海淀区
receiver_district	string	否	收货人区 示例：西北旺地区办事处
cstateid	long	否	收货人省ID 示例：6323
ccityid	long	否	收货人城市ID 示例：6433
cdistrictid	long	否	收货人地区ID 示例：6460
receiver_address	string	否	收货人详细地址 示例：用友软件园
receiver_mobile	string	否	收货人手机号 示例：132987911111
receiver_phone	string	否	收货人电话 示例：13298793341
created	long	否	交易时间 示例：1554708088000
pay_time	long	否	付款时间 示例：1554708116000
invoice_name	string	否	发票抬头 示例：个人
seller_cod_fee	Decimal	否	卖家货到付款服务费 示例：0
buyer_cod_fee	Decimal	否	买家货到付款服务费 示例：0
cod_fee	Decimal	否	货到付款服务费 示例：0
express_agency_fee	Decimal	否	快递代收费 示例：0
has_post_fee	Decimal	否	含运费 示例：0
trade_memo	string	否	交易备注 示例：手工新增
coupon_fee	Decimal	否	红包优惠金额 示例：0
status	string	否	线上交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：buyers_have_paid
type	string	否	交易类型，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：4-在线支付
commission_fee	Decimal	否	交易佣金 示例：0
available_confirm_fee	Decimal	否	交易中剩余的确认收货金额 示例：0
received_payment	Decimal	否	收款金额 示例：0
cShopID	long	否	店铺id 示例：1072275670683904
sys_Status	string	否	系统状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：shipconfirm
isHold	short	否	是否挂起 示例：1
isUpload	short	否	是否上传 示例：0
isCollection	short	否	是否对账 示例：0
isClosed	short	否	是否关账 示例：0
isBlend	short	否	是否勾对 示例：0
cExpressCoID	long	否	物流网点 示例：1116305501147392
cExpressCode	string	否	快递单号 示例：805271266490573671
cApproveLog	string	否	审核提示 示例：该店铺未设置免审策略！
isInvoice	short	否	是否开发票 示例：1
cShipMode	string	否	发货模式，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：EnterpriseDeliver
isconfirmed	short	否	已确认 示例：0
cBizAuditer	string	否	业务审核人 示例：AA
dBizAuditTime	DateTime	否	业务审核时间 示例：2025-11-05 16:10:09
isbizaudited	short	否	是否客审 示例：1
cFinAuditer	string	否	财务审核人 示例：AA
dFinAuditTime	DateTime	否	财务审核时间 示例：2025-11-05 16:10:09
isfinaudited	short	否	是否财审 示例：1
cshipper	string	否	发货人 示例：jinyidemotest
dShipTime	DateTime	否	发货时间 示例：2025-11-05 16:10:09
cModifier	string	否	修改人 示例：AA
cShipPrintStatus	short	否	发货单打印状态 示例：0
dshipprinttime	DateTime	否	发货单打印时间 示例：2025-11-05 16:10:09
dpickprinttime	DateTime	否	拣货单打印时间 示例：2025-11-05 16:10:09
dexpressprinttime	long	否	快递单打印时间 示例：1554720887000
iprintsn	long	否	打印序号 示例：0
print_operator	string	否	打印人 示例：AA
cExcoPrintStatus	short	否	快递单打印状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：0
bCreatePost	short	否	是否生成快递明细 示例：1
iEBPlatDiscount	Decimal	否	商城折扣 示例：0
cHoldReason	string	否	挂起原因
isPickSelf	short	否	是否自提订单 示例：0
buyer_payment	Decimal	否	代销订单买家实付金额 示例：0
coupon_point	Decimal	否	积分抵扣额 示例：0
coupon_ticket	Decimal	否	优惠券抵扣额 示例：0
coupon_card	Decimal	否	礼品卡抵扣额 示例：0
invoice_amount	Decimal	否	线上开票金额 示例：0
iweight	Decimal	否	包裹重量 示例：0
is_sh_ship	short	否	菜鸟仓订单 示例：0
cshipcode	string	否	发货单号 示例：FH10722019040800000004
cpickrowno	string	否	拣货行号 示例：1
ishipprintcount	int	否	发货单打印次数 示例：6
ipickprintcount	int	否	拣货单打印次数 示例：2
iexpressprintcount	int	否	快递单打印次数 示例：6
ismainorder	short	否	是否主订单 示例：1
ipackagecnt	int	否	包裹数 示例：1
isTradePosted	short	否	已过账 示例：0
cpickprintstatus	short	否	拣货单打印状态 示例：0
iinvoicetype	short	否	发票类型，1 电子发票 2 纸质发票 示例：3
cUnApproveReason	string	否	弃审原因 示例：其它
iMergeType	int	否	是否合并订单 示例：0
isSplitTrade	int	否	拆分单据数 示例：0
srctype	short	否	订单来源 示例：3
order_tax_fee	Decimal	否	关税金额 示例：0
iAutoDistributeBillCount	int	否	自动生成发货单数量 示例：3
has_buyer_message	short	否	有买家留言 示例：0
curErrlog	string	否	当前操作异常原因 示例：已挂起或已关闭订单不允许进行当前操作
holdtime	DateTime	否	挂起时间
versionguid	string	否	版本guid 示例：bd4c67bb-af40-4c91-ba16-04b720a3df2b
tradeOrderDetail	object	是	订单表体信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "共0张订单发货成功,失败1张",
	"data": [
		{
			"cTradeCode": "DSDD99992019040800000009",
			"tid": "NewAdd20190408001",
			"total_fee": 70,
			"total_num": 4,
			"refund_num": 0,
			"refund_fee": 0,
			"discount_fee": 0,
			"adjust_fee": 0,
			"post_fee": 12,
			"payment": 82,
			"receiver_name": "heylm",
			"receiver_state": "北京市",
			"receiver_city": "海淀区",
			"receiver_district": "西北旺地区办事处",
			"cstateid": 6323,
			"ccityid": 6433,
			"cdistrictid": 6460,
			"receiver_address": "用友软件园",
			"receiver_mobile": "132987911111",
			"receiver_phone": "13298793341",
			"created": 1554708088000,
			"pay_time": 1554708116000,
			"invoice_name": "个人",
			"seller_cod_fee": 0,
			"buyer_cod_fee": 0,
			"cod_fee": 0,
			"express_agency_fee": 0,
			"has_post_fee": 0,
			"trade_memo": "手工新增",
			"coupon_fee": 0,
			"status": "buyers_have_paid",
			"type": "4-在线支付",
			"commission_fee": 0,
			"available_confirm_fee": 0,
			"received_payment": 0,
			"cShopID": 1072275670683904,
			"sys_Status": "shipconfirm",
			"isHold": 1,
			"isUpload": 0,
			"isCollection": 0,
			"isClosed": 0,
			"isBlend": 0,
			"cExpressCoID": 1116305501147392,
			"cExpressCode": "805271266490573671",
			"cApproveLog": "该店铺未设置免审策略！",
			"isInvoice": 1,
			"cShipMode": "EnterpriseDeliver",
			"isconfirmed": 0,
			"cBizAuditer": "AA",
			"dBizAuditTime": "2025-11-05 16:10:09",
			"isbizaudited": 1,
			"cFinAuditer": "AA",
			"dFinAuditTime": "2025-11-05 16:10:09",
			"isfinaudited": 1,
			"cshipper": "jinyidemotest",
			"dShipTime": "2025-11-05 16:10:09",
			"cModifier": "AA",
			"cShipPrintStatus": 0,
			"dshipprinttime": "2025-11-05 16:10:09",
			"dpickprinttime": "2025-11-05 16:10:09",
			"dexpressprinttime": 1554720887000,
			"iprintsn": 0,
			"print_operator": "AA",
			"cExcoPrintStatus": 0,
			"bCreatePost": 1,
			"iEBPlatDiscount": 0,
			"cHoldReason": "",
			"isPickSelf": 0,
			"buyer_payment": 0,
			"coupon_point": 0,
			"coupon_ticket": 0,
			"coupon_card": 0,
			"invoice_amount": 0,
			"iweight": 0,
			"is_sh_ship": 0,
			"cshipcode": "FH10722019040800000004",
			"cpickrowno": "1",
			"ishipprintcount": 6,
			"ipickprintcount": 2,
			"iexpressprintcount": 6,
			"ismainorder": 1,
			"ipackagecnt": 1,
			"isTradePosted": 0,
			"cpickprintstatus": 0,
			"iinvoicetype": 3,
			"cUnApproveReason": "其它",
			"iMergeType": 0,
			"isSplitTrade": 0,
			"srctype": 3,
			"order_tax_fee": 0,
			"iAutoDistributeBillCount": 3,
			"has_buyer_message": 0,
			"curErrlog": "已挂起或已关闭订单不允许进行当前操作",
			"holdtime": "",
			"versionguid": "bd4c67bb-af40-4c91-ba16-04b720a3df2b",
			"tradeOrderDetail": [
				{
					"parentid": 1171593234125056,
					"tid": "NewAdd20190408001",
					"price": 10,
					"num": 2,
					"discount_fee": 0,
					"adjust_fee": 0,
					"total_fee": 20,
					"payment": 20,
					"is_service_order": 0,
					"citemID": 1161644612620546,
					"productID": 1161644612604160,
					"post_fee": 0,
					"cWhCode": 1147225595121920,
					"isGift": 0,
					"refund_num": 0,
					"refund_fee": 0,
					"isInPromotion": 0,
					"part_mjz_discount": 0,
					"divide_order_fee": 0,
					"isPtoSplit": 0,
					"bpto": 0,
					"bvirtual": 0,
					"iorderweight": 0,
					"oriItemNum": 0,
					"goodtype": 0,
					"onsale_num": 0,
					"onsale_fee": 0,
					"aftersale_num": 0,
					"aftersale_fee": 0
				}
			]
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
999	没有符合条件的单据或当前单据不是最新状态	请检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-16	
新增
请求参数 cshipper
更新
请求参数 skuCode
更新
请求参数 dshiptime
更新
返回参数 (5)
	2	2025-06-25	
更新
请求参数 (36)
更新
返回参数 (128)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


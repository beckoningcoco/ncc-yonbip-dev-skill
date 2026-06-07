---
title: "退换货订单导入"
apiId: "e82856f8b8d74dceabfe598019679b9d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Return & Exchange Document"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Return & Exchange Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 退换货订单导入

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/returnorder/import
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
externalData	object	是	是	退换货单主表[ec.ec_refundorder.RefundOrder]
plat	string	否	是	平台（含预留） 1—淘宝,2—京东,3—苏宁,4—U商城,5—亚马逊,6—小红书,7—有赞,8—1688,11—淘宝供销平台,99—其他,9—拼多多,10—工行融E购,12—友零售,13—楚楚街,23—唯品会mp,15—苏宁拼购,30—渠道云 示例：1
shop_id	long	否	是	店铺ID 示例：1106724684943616
refund_id	string	否	是	退款单号 示例：23641187311255314
tid	string	否	是	交易编号 示例：404818115517251453
oribillid	string	否	是	退款单原单id 示例：1174095616315648
refund_type	string	否	是	退款类型 ，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：2
refund_phase	string	否	是	退款阶段，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：aftersale
order_status	string	否	是	交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：sellers_have_been_shipped
good_status	string	否	是	货物状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：BUYER_RECEIVED
refundNum	Decimal	否	是	退货数量 示例：2
total_fee	Decimal	否	是	可退金额，精确到2位小数，单位元。如200.07，表示200元7分。 示例：0.01
created	string	否	是	退款申请时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2019-04-10 09:49:53
reason	string	否	是	退款/换货原因 示例：多拍/错拍/不想要
buyer_nick	string	否	是	买家昵称 示例：七海月
srctype	short	否	是	单据来源，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：1
code	string	否	否	单据编号 示例：20190410095412923001
tenant_id	long	否	否	租户ID 示例：123213211312
shop_name	string	否	否	店铺名称 示例：小黎测试店铺
sys_status	string	否	否	平台状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：refund_wait_buyer_returnGoods
refund_status	string	否	否	退货状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：换货成功
refund_fee	Decimal	否	否	退款申请金额，精确到2位小数，单位元。如200.07，表示200元7分。 示例：0.01
payment	Decimal	否	否	实际收款金额，精确到2位小数，单位元。如200.07，表示200元7分。 示例：0.01
distributor_nick	string	否	否	分销商昵称 示例：美的官方旗舰店
desc	string	否	否	退款说明 示例：仅退款
refund_version	string	否	否	退款版本号 示例：1554860993524
company_name	string	否	否	退货快递公司名称 示例：圆通速递
sid	string	否	否	退货快递单号 示例：202003309991
original_refund_phase	string	否	否	原始退款阶段，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：onsale
memo	string	否	否	备注 示例：有换货
down_time	string	否	否	下载时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2019-04-10 09:51:49
newAddTradePerson	string	否	否	制单人 示例：YonSuite默认用户
newAddTradeTime	string	否	否	制单时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2020-04-02 19:37:36
transferPerson	string	否	否	转单人 示例：肖静
convert_time	string	否	否	转单时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2019-04-10 09:54:12
modified	string	否	否	修改时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2020-04-02 19:37:36
isAuditing	string	否	否	已审核 示例：1
auditPerson	string	否	否	审核人 示例：肖静
auditDate	string	否	否	审核日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2019-04-11 19:47:42
inbound_status	string	否	否	入库状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：0
inbound_time	string	否	否	入库时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2019-04-11 19:47:42
isExchangeGood	string	否	否	已换货 示例：1
isSuccessReturn	string	否	否	已退款 示例：1
bsalerpt	string	否	否	已生日报 示例：0
salerpter	string	否	否	日报人 示例：YonSuite默认用户
salerpttime	string	否	否	销售日结时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2019-04-11 19:47:42
salerptcode	string	否	否	销售日报单号 示例：SR146520220602000003
isBlend	string	否	否	已勾对 示例：1
moneytype	string	否	否	币种 示例：RMB
org_id	long	否	否	组织档案节点 示例：1438312563825180675
refundOrderDetail	object	是	是	退换货单子表[ec.ec_refundorder.RefundOrderDetail]

## 3. 请求示例

Url: /yonbip/sd/dst/returnorder/import?access_token=访问令牌
Body: {
	"externalData": [
		{
			"plat": "1",
			"shop_id": 1106724684943616,
			"refund_id": "23641187311255314",
			"tid": "404818115517251453",
			"oribillid": "1174095616315648",
			"refund_type": "2",
			"refund_phase": "aftersale",
			"order_status": "sellers_have_been_shipped",
			"good_status": "BUYER_RECEIVED",
			"refundNum": 2,
			"total_fee": 0.01,
			"created": "2019-04-10 09:49:53",
			"reason": "多拍/错拍/不想要",
			"buyer_nick": "七海月",
			"srctype": 1,
			"code": "20190410095412923001",
			"tenant_id": 123213211312,
			"shop_name": "小黎测试店铺",
			"sys_status": "refund_wait_buyer_returnGoods",
			"refund_status": "换货成功",
			"refund_fee": 0.01,
			"payment": 0.01,
			"distributor_nick": "美的官方旗舰店",
			"desc": "仅退款",
			"refund_version": "1554860993524",
			"company_name": "圆通速递",
			"sid": "202003309991",
			"original_refund_phase": "onsale",
			"memo": "有换货",
			"down_time": "2019-04-10 09:51:49",
			"newAddTradePerson": "YonSuite默认用户",
			"newAddTradeTime": "2020-04-02 19:37:36",
			"transferPerson": "肖静",
			"convert_time": "2019-04-10 09:54:12",
			"modified": "2020-04-02 19:37:36",
			"isAuditing": "1",
			"auditPerson": "肖静",
			"auditDate": "2019-04-11 19:47:42",
			"inbound_status": "0",
			"inbound_time": "2019-04-11 19:47:42",
			"isExchangeGood": "1",
			"isSuccessReturn": "1",
			"bsalerpt": "0",
			"salerpter": "YonSuite默认用户",
			"salerpttime": "2019-04-11 19:47:42",
			"salerptcode": "SR146520220602000003",
			"isBlend": "1",
			"moneytype": "RMB",
			"org_id": 1438312563825180675,
			"refundOrderDetail": [
				{
					"cwhcode": 1158535624593664,
					"good_status": "BUYER_RECEIVED",
					"refund_phase": "aftersale",
					"tid": "404818115517251453",
					"oid": "404818115517251453",
					"product_name": "inv017保质期",
					"title": "办公用签字笔1012（ISV测试商品，不要拍）",
					"sku": "颜色分类:蓝色",
					"num": 1,
					"price": 0.01,
					"total_fee": 0.01,
					"citemID": 1162770732994816,
					"actualReturnQuantity": 1,
					"isGift": 0,
					"created": "2019-04-10 09:49:53",
					"productID": "1162770706141440",
					"cTradeCodeLine": "DSDD11062019041000000001",
					"cTradeLineId": "1174095207993601",
					"num_iid": "526421307171",
					"sku_id": 1162770732994816,
					"org_id": 1437524626317508617,
					"product_code": "593912690768",
					"exchange_lable": "th",
					"product_skucode": "1609017292361984",
					"product_skuname": "测试商品",
					"outer_id": "040001",
					"tenant_id": 123123213,
					"payment": 0.01,
					"memo": "备注tuihuo123",
					"goodtype": "2",
					"isInbound": "1",
					"isSplit": "1",
					"modified": "2019-04-10 09:49:53",
					"storeOrg": "",
					"storeOrgCode": ""
				}
			]
		}
	]
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
code	string	否	返回码，调用成功时返回200
message	string	否	导入成功提示信息
data	string	否	导入成功返回信息

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	参数校验异常，请检查入参	校验入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-24	
新增
请求参数 storeOrg
新增
请求参数 storeOrgCode
更新
请求参数 (84)
更新
返回参数 code
更新
返回参数 message
地址错了

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


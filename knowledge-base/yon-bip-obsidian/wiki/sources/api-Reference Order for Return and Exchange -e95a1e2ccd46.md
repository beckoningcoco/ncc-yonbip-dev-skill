---
title: "参照订单生退换货单"
apiId: "e95a1e2ccd464c338f660a6638574236"
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

# 参照订单生退换货单

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/refundorder/generatebytrade
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	是	单据id-时间戳关系映射(仅支持单张订单)
externalData	object	否	是	externalDataMap.put(“bodyIds”, bodyIdStr) bodyIdStr：所选订单行的id集合以逗号分隔的字符串
bodyIds	string	否	否	所选订单行的id集合以逗号分隔的字符串
ids	string	否	是	参照订单据ID(仅支持单张订单)

## 3. 请求示例

Url: /yonbip/sd/dst/refundorder/generatebytrade?access_token=访问令牌
Body: {
	"partParam": {},
	"externalData": {
		"bodyIds": ""
	},
	"ids": ""
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
message	string	否	返回信息 示例：操作成功
data	object	是	返回数据
shop_id	long	否	店铺id 示例：1505563505840384
distributor_nick	string	否	分销商昵称
oribillid	long	否	退款单原单id 示例：1513017685971200
order_status	string	否	订单交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：buyers_have_paid
tid	string	否	交易编号 示例：747182627676264085
total_fee	Decimal	否	退款金额 示例：0.11
refund_fee	Decimal	否	退款申请单金额 示例：0.11
payment	Decimal	否	实收金额 示例：0
buyer_nick	string	否	买家昵称 示例：小小321
created	DateTime	否	退款申请时间 示例：2019-12-10 19:12:25
moneytype	string	否	币种 示例：CNY
umall_memeberId	string	否	U商城会员id
shipMode	string	否	发货模式，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：EnterpriseDeliver
srctype	short	否	订单来源，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：5
newAddTradePerson	string	否	制单人 示例：wlb6
newAddTradeTime	DateTime	否	制单时间 示例：2019-12-10 19:12:25
receiver_name	string	否	收货人姓名 示例：小小
receiver_mobile	string	否	收货人手机号 示例：15733201096
shop_name	string	否	店铺名称 示例：LJ企业发货店铺
plat	string	否	平台 示例：1
refund_type	string	否	退款类型，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：1
refundNum	Decimal	否	退货数量 示例：1
refundOrderDetail	object	是	退换货单表体数据
refund_phase	string	否	退款阶段，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645 示例：onsale
inbound_status	DateTime	否	入库状态 示例：2

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"shop_id": 1505563505840384,
			"distributor_nick": "",
			"oribillid": 1513017685971200,
			"order_status": "buyers_have_paid",
			"tid": "747182627676264085",
			"total_fee": 0.11,
			"refund_fee": 0.11,
			"payment": 0,
			"buyer_nick": "小小321",
			"created": "2019-12-10 19:12:25",
			"moneytype": "CNY",
			"umall_memeberId": "",
			"shipMode": "EnterpriseDeliver",
			"srctype": 5,
			"newAddTradePerson": "wlb6",
			"newAddTradeTime": "2019-12-10 19:12:25",
			"receiver_name": "小小",
			"receiver_mobile": "15733201096",
			"shop_name": "LJ企业发货店铺",
			"plat": "1",
			"refund_type": "1",
			"refundNum": 1,
			"refundOrderDetail": [
				{
					"refund_phase": "onsale",
					"cTradeCodeLine": "DD15052019120500000003",
					"created": "2019-12-10 19:12:25",
					"tid": "747182627676264085",
					"oid": "747182627676264085",
					"num_iid": "593912690768",
					"title": "艾玛纸001",
					"sku_id": "1406289393684736",
					"sku": "颜色分类:金色",
					"citemID": 1406289393684736,
					"productID": 1406289391063296,
					"iWarehouseId": 1406594025165056,
					"outer_id": "",
					"num": 1,
					"enableNum": 1,
					"actualReturnQuantity": 1,
					"price": 0.1,
					"payment": 0.1,
					"total_fee": 0.1,
					"isGift": 0,
					"goodtype": 0,
					"isInbound": 0,
					"exchange_lable": "th",
					"provider": "",
					"cTradeLineId": "1513017685971201",
					"id": 1513017685971201,
					"product_skucode": "liujie00001",
					"product_skuname": "LJ测试商品",
					"product_code": "liujie00001",
					"product_name": "LJ测试商品",
					"Warehouse_code": "1002",
					"Warehouse_name": "LJ电商测试仓"
				}
			],
			"refund_phase": "onsale",
			"inbound_status": "2"
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
9999	参照订单生成退换货单异常	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2024-09-25	
更新
请求说明
更新
请求参数 bodyIds
更新
返回参数 (60)
支持集成

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


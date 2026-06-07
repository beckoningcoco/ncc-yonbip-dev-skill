---
title: "退款单原单信息查询"
apiId: "abfeb8b1752841969dde792706022e4b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Refund - Original Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Refund - Original Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 退款单原单信息查询

>  请求方式	POST | Refund - Original Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/refundsource/query
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
partParam	object	否	是	查询条件集合
shopcode	string	否	否	店铺编码
refund_phase	string	否	否	退款阶段，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
isClosed	string	否	否	关闭状态 0-未关闭，1-已关闭
ids	string	否	否	退款订单ids 多个id用英文逗号分隔
refund_type	string	否	否	退款类型，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
refund_id	string	否	否	退款单号
order_status	string	否	否	订单交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
tid	string	否	否	交易编号
plat	string	否	否	平台，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
bodyselectfields	string	否	是	需要返回的订单体字段，可参考 https://www.showdoc.com.cn/265424688438926?page_id=1949550079771742
end_created	string	否	否	退款申请时间结束。格式:yyyy-MM-dd HH:mm:ss
headselectfields	string	否	是	需要返回的订单头字段，可参考 https://www.showdoc.com.cn/265424688438926?page_id=1949550079771742
start_created	string	否	否	退款申请时间开始。格式:yyyy-MM-dd HH:mm:ss
pageIndex	int	否	是	页码
pageSize	int	否	是	每页数据行数

## 3. 请求示例

Url: /yonbip/sd/dst/refundsource/query?access_token=访问令牌
Body: {
	"partParam": {
		"shopcode": "",
		"refund_phase": "",
		"isClosed": "",
		"ids": "",
		"refund_type": "",
		"refund_id": "",
		"order_status": "",
		"tid": "",
		"plat": "",
		"bodyselectfields": "",
		"end_created": "",
		"headselectfields": "",
		"start_created": "",
		"pageIndex": 0,
		"pageSize": 0
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
code	string	否	单据编号
id	long	否	ID
plat	string	否	平台，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
shop_id	long	否	店铺ID
tid	string	否	淘宝交易编号
oid	string	否	子订单编号
refund_type	string	否	退款类型，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
refund_id	string	否	退款单号
order_status	string	否	交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
refund_phase	string	否	退款阶段，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
sys_status	string	否	平台状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
convert_type	string	否	转单状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
curErrlog	string	否	失败原因
convert_time	string	否	转单时间
total_fee	Decimal	否	订单交易总金额
refund_fee	Decimal	否	申请退款金额
payment	Decimal	否	实际退款金额
buyer_nick	string	否	买家昵称
seller_nick	string	否	卖家昵称
reason	string	否	退款原因
desc	string	否	退款说明
company_name	string	否	退货快递公司名称
sid	string	否	退货快递单号
created	string	否	退款申请时间
isClosed	string	否	关闭
modified	string	否	修改时间
down_time	string	否	下载时间
good_status	string	否	货物状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
refund_version	string	否	退款版本号
pubts	string	否	时间戳
org	string	否	组织
store_id	long	否	门店id
store_name	string	否	门店名称名称
refund_num	string	否	退货申请数量
refundSourceDetail	object	是	退款单原单子表[ec.ec_refundsource.RefundSourceDetail]

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"code": "",
		"id": 0,
		"plat": "",
		"shop_id": 0,
		"tid": "",
		"oid": "",
		"refund_type": "",
		"refund_id": "",
		"order_status": "",
		"refund_phase": "",
		"sys_status": "",
		"convert_type": "",
		"curErrlog": "",
		"convert_time": "",
		"total_fee": 0,
		"refund_fee": 0,
		"payment": 0,
		"buyer_nick": "",
		"seller_nick": "",
		"reason": "",
		"desc": "",
		"company_name": "",
		"sid": "",
		"created": "",
		"isClosed": "",
		"modified": "",
		"down_time": "",
		"good_status": "",
		"refund_version": "",
		"pubts": "",
		"org": "",
		"store_id": 0,
		"store_name": "",
		"refund_num": "",
		"refundSourceDetail": [
			{
				"id": 0,
				"parentid": 0,
				"good_status": "",
				"tid": "",
				"productID": "",
				"title": "",
				"sku": "",
				"outer_id": "",
				"num": 0,
				"price": 0,
				"total_fee": 0,
				"payment": 0,
				"refund_fee": 0,
				"memo": "",
				"created": "",
				"modified": "",
				"pubts": "",
				"product_code": "",
				"product_name": "",
				"stored_card_refund": 0,
				"stored_card_disrefund": 0,
				"refund_num": 0
			}
		]
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
999	店铺编码不存在	请输入正确的店铺编码

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (15)
更新
返回参数 (60)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


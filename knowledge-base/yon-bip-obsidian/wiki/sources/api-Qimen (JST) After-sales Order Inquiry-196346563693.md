---
title: "奇门(JST)售后单查询"
apiId: "1963465636934320137"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "WMS Inventory Status"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, WMS Inventory Status]
platform_version: "BIP"
source_type: community-api-docs
---

# 奇门(JST)售后单查询

>  请求方式	POST | WMS Inventory Status (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/jushuitan/refund/query
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
customer_id	string	否	是	商家链接标识，获取方式参考：https://open.jushuitan.com/document.aspx?doc_id=2356 示例：1231212
page_index	string	否	是	页索引 示例：1
page_size	string	否	是	页大小，最大100 示例：10
start_time	string	否	否	开始时间 示例：null
end_time	string	否	否	结束时间 示例：null
date_type	string	否	否	时间类型 0:修改时间modified;1:创建时间created;2:确认时间confirm_date;非必填,默认0 示例：0
wms_co_id	string	否	否	分仓id 示例：0
shop_id	string	否	否	店铺id 示例：0
as_ids	string	否	否	售后单号列表 示例：111,222,333
so_ids	string	否	否	线上单号列表,多个线上单号以逗号隔开 示例：111,222,333
o_ids	string	否	否	内部单号列表 示例：111,222,333
status	string	否	否	售后单状态（WaitConfirm:待确认,Confirmed:已确认,Cancelled:作废,Merged:被合并） 示例：null
type	string	否	否	售后类型，普通退货，其它，拒收退货，仅退款，投诉，补发，换货，维修 示例：null
good_status	string	否	否	货物状态（BUYER_NOT_RECEIVED:买家未收到货,BUYER_RECEIVED:买家已收到货,BUYER_RETURNED_GOODS:买家已退货,SELLER_RECEIVED:卖家已收到退货 示例：null
is_get_total	boolean	否	否	是否查询总条数 示例：true
is_offline_shop	boolean	否	否	shop_id为0且is_offline_shop为true查询线下店铺单据 示例：false
archive	boolean	否	否	是否查归档订单 示例：true
start_ts	string	否	否	ts开始时间 示例：0
end_ts	string	否	否	ts结束时间 示例：0

## 3. 请求示例

Url: /yonbip/sd/dst/jushuitan/refund/query?access_token=访问令牌
Body: {
	"customer_id": "1231212",
	"page_index": "1",
	"page_size": "10",
	"start_time": "null",
	"end_time": "null",
	"date_type": "0",
	"wms_co_id": "0",
	"shop_id": "0",
	"as_ids": "111,222,333",
	"so_ids": "111,222,333",
	"o_ids": "111,222,333",
	"status": "null",
	"type": "null",
	"good_status": "null",
	"is_get_total": true,
	"is_offline_shop": false,
	"archive": true,
	"start_ts": "0",
	"end_ts": "0"
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
page_size	string	否	页大小
page_index	string	否	页索引
data_count	string	否	数据总行数
page_count	string	否	页数
has_next	string	否	是否有下一页
datas	object	是	数据列表
as_id	string	否	售后单号
as_date	string	否	申请时间 示例：null
outer_as_id	string	否	外部售后单号 示例：null
so_id	string	否	原始线上单号 示例：null
type	string	否	售后类型：普通退货，其它，拒收退货，仅退款，投诉，补发，换货 示例：null
modified	string	否	最后更新时间 示例：null
status	string	否	状态（待确认:WaitConfirm;已确认:Confirmed;已取消:Cancelled;） 示例：null
remark	string	否	备注 示例：null
question_type	string	否	问题类型 示例：null
warehouse	string	否	仓库 示例：null
refund	string	否	退款金额 示例：null
payment	string	否	补偿金额 示例：null
good_status	string	否	货物状态：BUYER_NOT_RECEIVED:买家未收到货,BUYER_RECEIVED:买家已收到货,BUYER_RETURNED_GOODS:买家已退货,SELLER_RECEIVED:卖家已收到退货 示例：null
shop_buyer_id	string	否	买家帐号 示例：null
shop_id	string	否	店铺编号 示例：null
logistics_company	string	否	快递公司名称 示例：null
l_id	string	否	快递单号 示例：null
o_id	number
小数位数:0,最大长度:10	否	内部订单号 示例：0
order_status	string	否	原订单状态 示例：null
drp_co_id_to	string	否	供销商编号 示例：null
wh_id	string	否	仓库编号
drp_co_id_from	string	否	分销商编号 示例：null
node	string	否	线下备注 示例：null
wms_co_id	string	否	分仓公司编号
shop_status	string	否	WAIT_SELLER_AGREE:买家已经申请退款，等待卖家同意,WAIT_BUYER_RETURN_GOODS:卖家已经同意退款，等待买家退货,WAIT_SELLER_CONFIRM_GOODS:买家已经退货，等待卖家确认收货,SELLER_REFUSE_BUYER:卖家拒绝退款,CLOSED:退款关闭,SUCCESS:退款成功 示例：null
freight	string	否	卖家应补运费 示例：null
batchs	object	是	批次集合
labels	string	否	售后单标签 示例：null
refund_version	string	否	售后类型（refund_version = 1000 代表送仓售后） 示例：null
sns	object	是	唯一码集合
order_type	string	否	原订单类型 示例：null
confirm_date	string	否	确认时间 示例：null
items	object	是	货物明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"page_size": "",
		"page_index": "",
		"data_count": "",
		"page_count": "",
		"has_next": "",
		"datas": [
			{
				"as_id": "",
				"as_date": "null",
				"outer_as_id": "null",
				"so_id": "null",
				"type": "null",
				"modified": "null",
				"status": "null",
				"remark": "null",
				"question_type": "null",
				"warehouse": "null",
				"refund": "null",
				"payment": "null",
				"good_status": "null",
				"shop_buyer_id": "null",
				"shop_id": "null",
				"logistics_company": "null",
				"l_id": "null",
				"o_id": 0,
				"order_status": "null",
				"drp_co_id_to": "null",
				"wh_id": "",
				"drp_co_id_from": "null",
				"node": "null",
				"wms_co_id": "",
				"shop_status": "null",
				"freight": "null",
				"batchs": [
					{
						"batch_no": "null",
						"sku_id": "null",
						"qty": "",
						"product_date": "null",
						"supplier_id": "",
						"supplier_name": "null",
						"expiration_date": "null"
					}
				],
				"labels": "null",
				"refund_version": "null",
				"sns": [
					{
						"sku_id": "null",
						"sn": "null"
					}
				],
				"order_type": "null",
				"confirm_date": "null",
				"items": [
					{
						"sku_type": "null",
						"shop_sku_id": "null",
						"defective_qty": "",
						"outer_oi_id": "null",
						"receive_date": "null",
						"i_id": "null",
						"combine_sku_id": "null",
						"asi_id": "",
						"sku_id": "null",
						"qty": "",
						"price": "null",
						"amount": "null",
						"name": "null",
						"pic": "null",
						"type": "null",
						"properties_value": "null",
						"r_qty": ""
					}
				]
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
999	查询异常	请联系开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "退换货单查询"
apiId: "bfeea49763a04d829f43483b942e1050"
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

# 退换货单查询

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/refundorder/query
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	是	查询条件集合
order_status	string	否	否	订单交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
refund_type	string	否	否	退款类型，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
start_created	string	否	否	退款申请时间开始，格式:yyyy-MM-dd HH:mm:ss
end_created	string	否	否	退款申请时间结束，格式:yyyy-MM-dd HH:mm:ss
pageSize	int	否	是	每页数据行数
pageIndex	int	否	是	页码
isClosed	int	否	否	关闭状态 0-未关闭，1-已关闭
isAuditing	string	否	否	审核状态 0-未审核，1-已审核
shopcode	string	否	否	店铺编码
headselectfields	string	否	是	需要返回的退换货单头字段，字段可参考https://www.showdoc.cc/265424688438926?page_id=1968707423503684
headdefineselectfields	string	否	否	需要返回的退换货单头自定义字段，如define1,define2 如果不需要返回自定义项 此参数可不传
bodyselectfields	string	否	是	需要返回的退换货单体字段，字段可参考https://www.showdoc.cc/265424688438926?page_id=1968707423503684
bodydefineselectfields	string	否	否	需要返回的退换货单体自定义字段，如define1,define2 如果不需要返回自定义项 此参数可不传
start_inboundtime	string	否	否	查询入库时间开始，格式:yyyy-MM-dd HH:mm:ss
end_inboundtime	string	否	否	查询入库时间结束，格式:yyyy-MM-dd HH:mm:ss
tid	string	否	否	交易编号
tids	string	否	否	交易编号tids, 多个编号用英文逗号分隔(最多支持传入50个交易编号, 建议十个) 示例：tid1,tid2,tid3
start_modified	string	否	否	修改时间开始，格式:yyyy-MM-dd HH:mm:ss
end_modified	string	否	否	修改时间结束，格式:yyyy-MM-dd HH:mm:ss
oribillid	string	否	否	退款单原单id
wmsDeliveryCode	string	否	否	WMS入库单号
refund_id	string	否	否	退款单号
start_rpttime	string	否	否	查询日结时间开始，格式:yyyy-MM-dd HH:mm:ss
end_rpttime	string	否	否	查询日结时间结束，格式:yyyy-MM-dd HH:mm:ss
shipdetailfields	string	否	否	需要返回的退换货单退货明细自定义字段
plat	string	否	否	平台，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
ids	string	否	否	退换货订单ids 多个id用英文逗号分隔
refund_phase	string	否	否	退款阶段，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
salerptcode	string	否	否	销售日报单号
delivernumber	string	否	否	卖家发货快递单号
sid	string	否	否	退货快递单号

## 3. 请求示例

Url: /yonbip/sd/dst/refundorder/query?access_token=访问令牌
Body: {
	"partParam": {
		"order_status": "",
		"refund_type": "",
		"start_created": "",
		"end_created": "",
		"pageSize": 0,
		"pageIndex": 0,
		"isClosed": 0,
		"isAuditing": "",
		"shopcode": "",
		"headselectfields": "",
		"headdefineselectfields": "",
		"bodyselectfields": "",
		"bodydefineselectfields\t": "",
		"start_inboundtime": "",
		"end_inboundtime": "",
		"tid": "",
		"tids": "tid1,tid2,tid3",
		"start_modified": "",
		"end_modified": "",
		"oribillid": "",
		"wmsDeliveryCode": "",
		"refund_id": "",
		"start_rpttime": "",
		"end_rpttime": "",
		"shipdetailfields": "",
		"plat": "",
		"ids": "",
		"refund_phase": "",
		"salerptcode": "",
		"delivernumber": "",
		"sid": ""
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
pageIndex	int	否	页码
pageSize	int	否	每页行数
totalCount	int	否	查询数
info	object	是	info

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"totalCount": 0,
		"info": [
			{
				"code": "",
				"id": 0,
				"plat": "",
				"shop_id": 0,
				"shop_name": "",
				"tid": "",
				"refund_id": "",
				"oribillid": 0,
				"refund_type": "",
				"refund_phase": "",
				"order_status": "",
				"sys_status": "",
				"refund_status": "",
				"good_status": "",
				"refundNum": 0,
				"total_fee": 0,
				"refund_fee": 0,
				"payment": 0,
				"created": "",
				"distributor_nick": "",
				"buyer_nick": "",
				"reason": "",
				"desc": "",
				"refund_version": "",
				"company_name": "",
				"sid": "",
				"original_refund_phase": "",
				"memo": "",
				"down_time": "",
				"newAddTradePerson": "",
				"newAddTradeTime": "",
				"transferPerson": "",
				"convert_time": "",
				"modified": "",
				"isAuditing": "",
				"auditPerson": "",
				"auditDate": "",
				"inbound_status": "",
				"inbound_time": "",
				"isExchangeGood": "",
				"isSuccessReturn": "",
				"bsalerpt": "",
				"salerpter": "",
				"salerpttime": "",
				"salerptcode": "",
				"isBlend": "",
				"pubts": "",
				"moneytype": "",
				"srctype": "",
				"org": "",
				"refundOrderCustomItem_id": "",
				"stored_card_refund": "",
				"stored_card_disrefund": "",
				"dCloseTime": "",
				"cCloser": "",
				"isClosed": "",
				"cdistrictid": "",
				"ccityid": "",
				"cstateid": "",
				"receiver_district": "",
				"receiver_city": "",
				"receiver_state": "",
				"buyerchangeaddress": "",
				"receiver_phone": "",
				"receiver_mobile": "",
				"receiver_name": "",
				"wmsDeliveryCode": "",
				"turn_into_status": "",
				"cancel_status": "",
				"refundOrderCustomItem_define1": "",
				"refundOrderCustomItem_define60": "",
				"refundOrderDetail": [
					{
						"id": "",
						"parentid": 0,
						"exchange_lable": "",
						"good_status": "",
						"refund_phase": "",
						"tid": "",
						"oid": "",
						"Warehouse_code": "",
						"Warehouse_name": "",
						"provider_Name": "",
						"provider_Code": "",
						"provider": "",
						"product_code": "",
						"product_name": "",
						"title": "",
						"product_skucode": "",
						"product_skuname": "",
						"sku": "",
						"outer_id": "",
						"sBatchNo": "",
						"enableNum": 0,
						"num": 0,
						"price": 0,
						"payment": 0,
						"total_fee": 0,
						"actualReturnQuantity": "",
						"memo": "",
						"goodtype": "",
						"isGift": "",
						"isCP": "",
						"isInbound": "",
						"isSplit": "",
						"created": "",
						"modified": "",
						"pubts": "",
						"productID": 0,
						"cTradeCodeLine": "",
						"cTradeLineId": "",
						"num_iid": "",
						"sku_id": 0,
						"citemID": 0,
						"iWarehouseId": 0,
						"iWarehouseIdDefault": 0,
						"stored_card_refund": "",
						"stored_card_disrefund": "",
						"specs": "",
						"modelDescription": "",
						"cTradeId": "",
						"oriItemCode": "",
						"oriItemName": ""
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
999	店铺编码不存在	请输入正确店铺编码

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-10	
新增
请求参数 delivernumber
新增
请求参数 sid
添加 查询条件 卖家发货快递单号、退换货快递单号
	2	2025-06-04	
更新
请求说明
新增
请求参数 isAuditing
更新
请求参数 (27)
更新
返回参数 (129)
支持审核状态

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


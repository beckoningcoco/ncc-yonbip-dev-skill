---
title: "订单查询"
apiId: "244dd4893ef04ab0923f7f60a9e40869"
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

# 订单查询

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/tradeorder/query
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	是	查询条件集合
ids	string	否	否	订单ids 多个id用英文逗号分隔
headselectfields	string	否	是	需要返回的订单头字段，可参考 https://www.showdoc.cc/265424688438926?page_id=1999778270293645
headdefineselectfields	string	否	否	需要返回的订单头自定义字段 如define1,define2 如果不需要反馈自定义项 此参数可不传
bodyselectfields	string	否	是	需要返回的订单体字段，可参考 https://www.showdoc.cc/265424688438926?page_id=1999778270293645
bodydefineselectfields	string	否	否	需要返回的订单体自定义字段 如define1,define2 按逗号分隔 如果不需要反馈自定义项 此参数可不传
shipdetailselectfields	string	否	否	需要返回的发货明细，查询字段参考：https://www.showdoc.com.cn/265424688438926/1999778270293645
receiver_mobile	string	否	否	收货人手机号
shopcode	string	否	否	店铺编码(查询若不传id或ids，则必传shopcode)
end_rpttime	string	否	否	查询日结时间结束。格式:yyyy-MM-dd HH:mm:ss
start_shiptime	string	否	否	查询发货开始时间 格式:yyyy-MM-dd HH:mm:ss
end_shiptime	string	否	否	查询发货开始时间 格式:yyyy-MM-dd HH:mm:ss
ishold	string	否	否	挂起状态 0-未挂起，1-已挂起
start_pay	string	否	否	查询付款时间开始。格式:yyyy-MM-dd HH:mm:ss
end_pay	string	否	否	查询付款时间结束。格式:yyyy-MM-dd HH:mm:ss
status	string	否	否	线上交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
start_rpttime	string	否	否	查询日结时间开始。格式:yyyy-MM-dd HH:mm:ss
cExpressCode	string	否	否	快递单号
isBlend	string	否	否	是否勾兑（0，1）
start_dBlendTime	string	否	否	查询勾兑时间开始。格式:yyyy-MM-dd HH:mm:ss
end_dBlendTime	string	否	否	查询勾兑时间结束。格式:yyyy-MM-dd HH:mm:ss
start_created	string	否	否	查询交易创建时间开始。格式:yyyy-MM-dd HH:mm:ss
end_created	string	否	否	查询交易创建时间结束。格式:yyyy-MM-dd HH:mm:ss
start_pubts	string	否	否	查询更新时间开始。格式:yyyy-MM-dd HH:mm:ss
end_pubts	string	否	否	查询更新结束。格式:yyyy-MM-dd HH:mm:ss
tid	string	否	否	交易编号
tids	string	否	否	交易编号tids, 多个编号用英文逗号分隔(最多支持传入50个交易编号, 建议十个) 示例：tid1,tid2,tid3
isclosed	string	否	否	关闭状态 0-未关闭，1-已关闭
tradecode	string	否	否	电商订单号
shipcode	string	否	否	发货单号
isposted	string	否	否	是否日结 1-日结 2-未日结
shipmode	string	否	否	发货模式 ，多个模式用，分隔
pageIndex	int	否	是	页码
pageSize	int	否	是	每页数据行数
plat	string	否	否	平台，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
id	string	否	否	订单id
wmsDeliveryCode	string	否	否	WMS出库单号
sysstatus	string	否	否	oms系统订单处理状态，多个状态用，分隔，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
salerptcode	string	否	否	销售日报单号
salesmanId	string	否	否	业务员id(业务员id和编码同时存在以id为准)
salesmanCode	string	否	否	业务员编码(业务员id和编码同时存在以id为准)
customerId	string	否	否	客户id(客户id和编码同时存在以id为准) 示例：1866583913795840
customerCode	string	否	否	客户编码(客户id和编码同时存在以id为准) 示例：stfl000002
start_tradetime	string	否	否	交易结束时间开始
end_tradetime	string	否	否	交易结束时间结束
citemID	string	否	否	商品skuid（仅支持单个sku查询）
citemCode	string	否	否	商品sku编码（同时输入citemid时以citemid为准）
iWarehouseId	string	否	否	仓库id
warehouseCode	string	否	否	仓库编码
warehouseControl	boolean	否	否	是否根据绑定用户控制仓库权限 默认值：false
cpickcode	string	否	否	拣货单号

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/query?access_token=访问令牌
Body: {
	"partParam": {
		"ids": "",
		"headselectfields": "",
		"headdefineselectfields": "",
		"bodyselectfields": "",
		"bodydefineselectfields": "",
		"shipdetailselectfields": "",
		"receiver_mobile": "",
		"shopcode": "",
		"end_rpttime": "",
		"start_shiptime": "",
		"end_shiptime": "",
		"ishold": "",
		"start_pay": "",
		"end_pay": "",
		"status": "",
		"start_rpttime": "",
		"cExpressCode": "",
		"isBlend": "",
		"start_dBlendTime": "",
		"end_dBlendTime": "",
		"start_created": "",
		"end_created": "",
		"start_pubts": "",
		"end_pubts": "",
		"tid": "",
		"tids": "tid1,tid2,tid3",
		"isclosed": "",
		"tradecode": "",
		"shipcode": "",
		"isposted": "",
		"shipmode": "",
		"pageIndex": 0,
		"pageSize": 0,
		"plat": "",
		"id": "",
		"wmsDeliveryCode": "",
		"sysstatus": "",
		"salerptcode": "",
		"salesmanId": "",
		"salesmanCode": "",
		"customerId": "1866583913795840",
		"customerCode": "stfl000002",
		"start_tradetime": "",
		"end_tradetime": "",
		"citemID": "",
		"citemCode": "",
		"iWarehouseId": "",
		"warehouseCode": "",
		"warehouseControl": true,
		"cpickcode": ""
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
pageSize	int	否	每页数据行数
totalCount	int	否	返回记录数
info	object	是	返回具体数据

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
				"id": 0,
				"cShopID": 0,
				"Shop_Code": "",
				"Shop_Name": "",
				"tid": "",
				"doctype": "",
				"pay_time": "",
				"total_num": 0,
				"cApproveFlag": "",
				"seller_memo_online": "",
				"buyer_message": "",
				"seller_memo": "",
				"total_fee": 0,
				"payment": 0,
				"discount_fee": 0,
				"adjust_fee": 0,
				"post_fee": 0,
				"cExpressCoID": "",
				"expressName": "",
				"expressCode": "",
				"logisticId": "",
				"logisticCode": "",
				"logisticName": "",
				"cExpressCode": "",
				"receiver_name": "",
				"receiver_card_id": "",
				"receiver_state": "",
				"receiver_city": "",
				"receiver_district": "",
				"receiver_address": "",
				"receiver_zip": "",
				"receiver_mobile": "",
				"receiver_phone": "",
				"receiver_town": "",
				"receiver_country": "",
				"buyer_nick": "",
				"cApproveLog": "",
				"cUnApproveReason": "",
				"srctype": "",
				"status": "",
				"type": "",
				"cShipMode": "",
				"cTradeCode": "",
				"order_tax_fee": "",
				"ipackagecnt": "",
				"consign_time": "",
				"iinvoicetype": "",
				"deposit_bank": "",
				"taxpayer_ident": "",
				"bank_account": "",
				"registered_address": "",
				"iEBPlatDiscount": 0,
				"coupon_card": 0,
				"coupon_point": 0,
				"coupon_ticket": 0,
				"isInvoice": "",
				"invoice_name": "",
				"cInvoiceCode": "",
				"is_sh_ship": "",
				"cshipcode": "",
				"cpickcode": "",
				"cpickrowno": "",
				"cShipPrintStatus": "",
				"cExcoPrintStatus": "",
				"cpickprintstatus": "",
				"cConfirmer": "",
				"dConfirmTime": "",
				"cModifier": "",
				"dModifyTime": "",
				"cBizAuditer": "",
				"dBizAuditTime": "",
				"cFinAuditer": "",
				"dFinAuditTime": "",
				"print_operator": "",
				"dprinttime": "",
				"iprintsn": "",
				"cinspecter": "",
				"dinspecttime": "",
				"cshipper": "",
				"dShipTime": "",
				"autoupdtimes": "",
				"dUploadTime": "",
				"dCollectionTime": "",
				"cposter": "",
				"dposttime": "",
				"cCloser": "",
				"dCloseTime": "",
				"cBlender": "",
				"dBlendTime": "",
				"isbizaudited": "",
				"isfinaudited": "",
				"isUpload": "",
				"isHold": "",
				"isClosed": "",
				"isBlend": "",
				"isTradePosted": "",
				"isconfirmed": "",
				"iholdtype": "",
				"cHoldReason": "",
				"cuploader": "",
				"created": "",
				"modified": "",
				"end_time": "",
				"shipping_type": "",
				"seller_cod_fee": "",
				"buyer_cod_fee": "",
				"cod_fee": "",
				"express_agency_fee": "",
				"has_post_fee": "",
				"trade_memo": "",
				"seller_flag": "",
				"coupon_fee": 0,
				"point_fee": 0,
				"real_point_fee": 0,
				"buyer_obtain_point_fee": 0,
				"buyer_flag": "",
				"cod_status": "",
				"commission_fee": 0,
				"available_confirm_fee": 0,
				"received_payment": 0,
				"sys_Status": "",
				"isCollection": "",
				"cBlendGUID": "",
				"bCreatePost": "",
				"pubts": "",
				"isPickSelf": "",
				"cFenxiaoType": "",
				"applier_nick": "",
				"tc_order_id": "",
				"buyer_payment": "",
				"invoice_amount": "",
				"clocker": "",
				"iweight": "",
				"iprintcount": "",
				"ismainorder": "",
				"registered_phone": "",
				"igoldtaxcount": "",
				"dgoldtaxtime": "",
				"iBillingStatus": "",
				"dBillingtime": "",
				"cBillingCode": "",
				"cBillingNum": "",
				"iMergeType": "",
				"iinvoicestatus": "",
				"cinvoicepdfpatch": "",
				"cinvoiceurlpatch": "",
				"cinvoiceextractcode": "",
				"isSplitTrade": "",
				"autoholdtimes": "",
				"iAutoDistributeBillCount": "",
				"is_part_consign": "",
				"org": "",
				"tradeorderdetail": [
					{
						"id": 0,
						"citemID": "",
						"product_code": "",
						"product_name": "",
						"oriItemCode": "",
						"oriItemName": "",
						"oriItemNum": "",
						"price": 0,
						"num": 0,
						"refund_status": "",
						"total_fee": 0,
						"discount_fee": 0,
						"adjust_fee": 0,
						"post_fee": 0,
						"isGift": "",
						"sku_properties_name": "",
						"sku_id": "",
						"sub_order_tax_fee": 0,
						"payment": 0,
						"refund_num": 0,
						"refund_fee": 0,
						"cWhCode": "",
						"Whouse_Name": "",
						"invoice_no": "",
						"iorderweight": 0,
						"oid": "",
						"ref_order_id": 0,
						"num_iid": 0,
						"outer_iid": "",
						"parentid": 0,
						"outer_sku_id": "",
						"modified": "",
						"status": "",
						"refund_id": 0,
						"is_service_order": "",
						"buyer_nick": "",
						"tid": "",
						"belongProductsPromoID": "",
						"cRefundState": "",
						"isInPromotion": "",
						"guid": "",
						"tc_order_id": "",
						"part_mjz_discount": 0,
						"divide_order_fee": 0,
						"isPtoSplit": "",
						"exorderid": 0,
						"logistics_company": "",
						"store_code": "",
						"order_memo": "",
						"igroupid": 0,
						"cproducttype": "",
						"bind_oid": "",
						"consign_time": "",
						"shipping_type": "",
						"goodtype": "",
						"ecShipDetail": {
							"parentid": 0,
							"bodyid": 0,
							"iWarehouseId": 0,
							"itemid": 0,
							"product": 0,
							"cshipcode": "",
							"iquantity": 0,
							"ibakqty": 0,
							"sBatchNo": "",
							"dProduceDate": "",
							"dInvalidDate": "",
							"salerptshipid": "",
							"serialNo": "",
							"location": "",
							"locationName": "",
							"sn": "",
							"updatecount": 0,
							"presnstate": "",
							"snstate": "",
							"sourcebillsnid": 0,
							"makebillsign": ""
						}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


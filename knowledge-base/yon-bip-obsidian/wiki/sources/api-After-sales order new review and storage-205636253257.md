---
title: "售后单新增审核入库"
apiId: "2056362532579835906"
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

# 售后单新增审核入库

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/returnorder/addAudit
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	body 最大请求量：50
buyer_nick	string	否	否	买家昵称
refundOrderDetail	object	是	是	表体
applyId	string	否	否	申请单号
approveResult	string	否	否	审核结果
businessModel	string	否	是	业务模式
buyerchangeaddress	string	否	否	详细地址
code	string	否	否	退换货单号
company_name	string	否	否	线上物流公司
customer_code	string	否	否	客户编码
cycle_phase	string	否	否	退款期数
deliverlogistics	string	否	否	卖家发货物流公司
delivernumber	string	否	否	卖家发货快递单号
department_code	string	否	否	部门编码
desc	string	否	否	退款/换货说明
distributor_nick	string	否	否	分销商昵称
good_status	string	否	否	货物状态
expectPickwareType	string	否	否	期望取件类型
inbound_time	string	否	否	入库时间
isSuccessReturn	string	否	否	已退款
logisticName	string	否	否	退货快递公司
srctype	string	否	是	单据来源
tid	string	否	是	交易编号
sys_status	string	否	是	平台状态
refund_id	string	否	是	售后原单号
shopCode	string	否	是	店铺编码
refund_type	string	否	是	售后类型
refund_phase	string	否	是	退款/换货阶段
created	string	否	是	退款申请时间
wmsDeliveryCode	string	否	否	WMS入库单号
umall_memeberId	string	否	否	U商城会员id
tradeWmsCode	string	否	否	WMS出库单号
stored_card_refund	string	否	否	会员钱包退款
stored_card_disrefund	string	否	否	会员钱包折扣退款
store_serial_number	string	否	否	门店流水号
store_Name	string	否	否	门店名称
sid	string	否	否	退货快递单号
salesman_code	string	否	否	业务员编码
returnWareType	string	否	否	返件类型
returnShopId	string	否	否	售后门店ID
refundTypeName	string	否	否	退款方式
refundTransTypeName	string	否	否	交易类型
refundTransType	string	否	否	交易类型id
refundReceivableTransType	string	否	否	应收交易类型
refundOrderCustomCharacter	string	否	否	自定义项特征组
refund_status	string	否	否	退货状态
receiver_phone	string	否	否	电话
receiver_name	string	否	否	收货人姓名
receiver_mobile	string	否	否	手机号
receiveDate	string	否	否	收货时间
reason	string	否	否	退款/换货原因
processResult	string	否	否	处理结果
processDate	string	否	否	处理时间
pickwareType	string	否	否	取件类型
oribillid	string	否	否	退款单原单id
org_name	string	否	否	组织
orderShopId	string	否	否	订单门店ID
order_status	string	否	否	交易状态
newOrderId	string	否	否	换新订单号
moneytype_code	string	否	否	币种
menmber_order_id	string	否	否	会员系统电商订单ID
memo	string	否	否	卖家备注
refundNum	string	否	是	退货申请数量

## 3. 请求示例

Url: /yonbip/sd/dst/returnorder/addAudit?access_token=访问令牌
Body: {
	"data": [
		{
			"buyer_nick": "",
			"refundOrderDetail": [
				{
					"exchange_lable": "",
					"refund_phase": "",
					"Warehouse_code": "",
					"storeOrg": "",
					"storeOrgCode": "",
					"total_fee": "",
					"outer_id": "",
					"isCP": "",
					"refundDetailFreeCharacteristics": "",
					"cart_id": "",
					"oid": "",
					"online_sku_specifications": "",
					"sku_properties_name": "",
					"refundOrderDetailCustomCharacter": "",
					"iEBPlatDiscount": "",
					"memo": "",
					"skuType": "",
					"stored_card_refund": "",
					"会员钱包折扣退款": "",
					"created": "",
					"actualReturnQuantity": "",
					"sku": "",
					"num": "",
					"oriItemCode": "",
					"goodtype": "",
					"oriItemName": "",
					"isGift": "",
					"product_skucode": "",
					"refundShipDetail": [
						{
							"iquantity": "",
							"locationCode": "",
							"sBatchNo": "",
							"sn": "",
							"dProduceDate": "",
							"dInvalidDate": "",
							"refundShipDetailFreeCharacteristics": ""
						}
					],
					"batchno": "20250227"
				}
			],
			"applyId": "",
			"approveResult": "",
			"businessModel": "",
			"buyerchangeaddress": "",
			"code": "",
			"company_name": "",
			"customer_code": "",
			"cycle_phase": "",
			"deliverlogistics": "",
			"delivernumber": "",
			"department_code": "",
			"desc": "",
			"distributor_nick": "",
			"good_status": "",
			"expectPickwareType": "",
			"inbound_time": "",
			"isSuccessReturn": "",
			"logisticName": "",
			"srctype": "",
			"tid": "",
			"sys_status": "",
			"refund_id": "",
			"shopCode": "",
			"refund_type": "",
			"refund_phase": "",
			"created": "",
			"wmsDeliveryCode": "",
			"umall_memeberId": "",
			"tradeWmsCode": "",
			"stored_card_refund": "",
			"stored_card_disrefund": "",
			"store_serial_number": "",
			"store_Name": "",
			"sid": "",
			"salesman_code": "",
			"returnWareType": "",
			"returnShopId": "",
			"refundTypeName": "",
			"refundTransTypeName": "",
			"refundTransType": "",
			"refundReceivableTransType": "",
			"refundOrderCustomCharacter": "",
			"refund_status": "",
			"receiver_phone": "",
			"receiver_name": "",
			"receiver_mobile": "",
			"receiveDate": "",
			"reason": "",
			"processResult": "",
			"processDate": "",
			"pickwareType": "",
			"oribillid": "",
			"org_name": "",
			"orderShopId": "",
			"order_status": "",
			"newOrderId": "",
			"moneytype_code": "",
			"menmber_order_id": "",
			"memo": "",
			"refundNum": ""
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
message	string	否	调用失败时的错误信息

## 5. 正确返回示例

{
	"code": "",
	"message": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	保存失败	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-24	
更新
请求说明
新增
请求参数 storeOrg
新增
请求参数 storeOrgCode
新增
请求参数 batchno
支持库存组织

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


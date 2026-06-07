---
title: "发货单保存"
apiId: "2071280294025494531"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shipment Mgmt"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shipment Mgmt]
platform_version: "BIP"
source_type: community-api-docs
---

# 发货单保存

>  请求方式	POST | Shipment Mgmt (SS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/deliveryOrderApi/saveDeliveryOrder
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	发货单
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
status	string	否	是	发货单状态。枚举值 0:待发布,1:发货中,2:已妥投,3:已签收,4:拒签,7:部分签收,8:签收审批中,9:正在发布,10:发布失败 示例：0 默认值：0
transportType	string	否	是	运输工具（值为0代表火车；值为1代表汽车；值为2代表轮船；值为3代表飞机；值为4代表第三方物流；值为5代表其他）
id	number
小数位数:0,最大长度:20	否	否	发货单id（更新发货单场景下，该字段为必输项）
deliveryDate	date
格式:yyyy-MM-dd	否	是	发货日期
logisticalComp	string	否	否	物流公司id 当运输工具为第三方物流时，该字段为必输项。
logisticalCode	string	否	否	物流单号 当运输工具为第三方物流时，该字段为必输项
businessType	number
小数位数:0,最大长度:4	否	否	业务类型。枚举值 0:普通订单;1: VMI订单；4:全程委外；5:工序委外
logisticalCompCode	string	否	否	物流公司编码 当运输工具为第三方物流时，该字段为必输项 示例：ES
deliveryOrderType	string	否	是	发货单来源单据类型。枚举值: 0:销售订单,1:第三方电商,2:云采超市,3:交货计划,4:受托加工单 示例：1
receiveOrg	string	否	否	收货组织主键或编码 示例：ORG01
code	string	否	否	发货单code，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：FH24062200000005
purchaseOrg	string	否	是	采购组织主键或者编码 示例：123456789
supplier	string	否	否	供应商档案主键或者编码
otherLogisticalCode	string	否	否	其他物流公司名称(物流公司选择其他时刻填写) 示例：顺风
transportCode	string	否	否	车牌号 示例：K212
trainCode	string	否	否	车皮号 示例：012
linkpsn	string	否	否	联系人 示例：张三
linktype	string	否	否	联系方式 示例：178********
receivePersonName	string	否	否	收货人 示例：张三
receiveAddress	string	否	否	收货地址 示例：北京市
receivePersonTel	string	否	否	收货人电话 示例：178******
_status	string	否	是	操作标识, Insert:新增、Update:更新 示例：Insert
details	object	是	是	发货单物料子表

## 3. 请求示例

Url: /yonbip/cpu/deliveryOrderApi/saveDeliveryOrder?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"status": "0",
		"transportType": "",
		"id": 0,
		"deliveryDate": "2026-06-07",
		"logisticalComp": "",
		"logisticalCode": "",
		"businessType": 0,
		"logisticalCompCode": "ES",
		"deliveryOrderType": "1",
		"receiveOrg": "ORG01",
		"code": "FH24062200000005",
		"purchaseOrg": "123456789",
		"supplier": "",
		"otherLogisticalCode": "顺风",
		"transportCode": "K212",
		"trainCode": "012",
		"linkpsn": "张三",
		"linktype": "178********",
		"receivePersonName": "张三",
		"receiveAddress": "北京市",
		"receivePersonTel": "178******",
		"_status": "Insert",
		"details": [
			{
				"taxType": "",
				"lineno": "10",
				"material": "",
				"taxPrice": 0,
				"batchNo": "",
				"purchaseNum": 30,
				"purchaseUnit": "CD02",
				"mainNum": 10,
				"purchaseExchRate": 1,
				"purchaseExchRateNum": 1,
				"purchaseExchRateDen": 1,
				"mainMetrology": "CD02",
				"num": 0,
				"unit": "CD03",
				"priceExchRate": 1,
				"priceExchRateNum": 1,
				"priceExchRateDen": 1,
				"planArrivalDate": "2024-06-26",
				"taxAmount": 300,
				"projectId": 123,
				"projectCode": "hjk",
				"purchaseOrg": "123456789",
				"orderCode": "PO123456789",
				"purchase": "123456",
				"price": 10,
				"ticketOrg": "321",
				"tax": 321,
				"taxrate": 123,
				"productId": "123456",
				"deliveryOrderType": "4",
				"delplanId": 123,
				"logisticalComp": "",
				"logisticalCompCode": "321",
				"saleOrderCode": "SO",
				"saleOrderId": 21321,
				"saleOrderDetailId": 0,
				"upcode": "",
				"currency": "",
				"periodQuality": 1,
				"periodQualityType": 1,
				"productionDate": "2026-06-07",
				"expirationDate": "2026-06-07",
				"orderDetailId": 5976,
				"orderId": 5975,
				"_status": "Insert",
				"id": 0,
				"deliveryOrderId": 0,
				"delplanDetailId": 123
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
code	string	否	发货单编码 示例：A01

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "A01"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
新增
请求参数 (4)
更新
请求参数 (24)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


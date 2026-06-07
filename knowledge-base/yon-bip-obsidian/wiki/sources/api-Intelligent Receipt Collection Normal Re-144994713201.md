---
title: "智能收单正常收单结果保存V2"
apiId: "1449947132013314048"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intelligent Receipt Collection"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intelligent Receipt Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能收单正常收单结果保存V2

>  请求方式	POST | Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/appDevice/v1/save
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
data	object	否	是	参数实体
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	是	单据id：验符结果查询返回值获取 示例：1449943309498187778
timeConsuming	string	否	是	收单耗时：前端计算收单时间，应为整数字符串 单位：秒 示例：150
billNum	string	否	是	单据号：验符结果查询返回值获取 示例：GRRD220225000002
barCode	string	否	是	单据条码：验符结果查询返回值获取 示例：znbzbx_expensebill|2663540345934592
boxNum	string	否	否	归档箱号：单据所放归档箱号
deliveryBatch	long	否	是	收单批次号：验符结果查询返回值获取 示例：22
checkStatus	string	否	否	整单验符状态：单据整体验符状态，根据验符结果查询返回发票验符状态（如有缺票可进行人工调整匹配，改变发票验符状态），取所有发票验符状态最小值，即为整单验符状态（0：缺票 1：异常 2：多票-异常 3：多票 11：收录 12：验符） 示例：12
invoiceResult	object	是	否	手动调整票据数组，没有进行手工匹配时，该字段可以为空，仅传入手工匹配票据信息
deviceCode	string	否	是	设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001
manufacturer	string	否	是	终端所属厂商标识：由用友分发标识符 示例：yonyou

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1449943309498187778",
		"timeConsuming": "150",
		"billNum": "GRRD220225000002",
		"barCode": "znbzbx_expensebill|2663540345934592",
		"boxNum": "",
		"deliveryBatch": 22,
		"checkStatus": "12",
		"invoiceResult": [
			{
				"invoice": {
					"invoiceType": "invoice",
					"addedInvoiceType": "1",
					"invoiceCode": "011002000811",
					"invoiceNum": "61644195",
					"invoiceDate": "20211209",
					"hjje": "110",
					"jshj": "200.00000000",
					"jym": "72117059262835141041",
					"invoiceName": "增值税电子普通发票",
					"formName": "抵扣联",
					"coordinate": "{\"endY\":1919,\"endX\":1084,\"sourceWidth\":0,\"degree\":270,\"sourceHeight\":0,\"startY\":0,\"startX\":600}",
					"status": 12,
					"deductionStatus": 0,
					"uploadImageId": "sjLm9Tu0gFJatgxOcRiSUd9s9DRozfxK4IWE",
					"fileId": "625908057ca0ec3ccea206e9",
					"ifManualMatch": true
				},
				"targetInvoice": {
					"invoiceType": "other",
					"addedInvoiceType": "1",
					"invoiceCode": "011002000811",
					"invoiceNum": "61644195",
					"invoiceDate": "20220216",
					"hjje": "110",
					"jshj": "200.00000000",
					"jym": "72117059262835141041",
					"invoiceName": "其他",
					"formName": "抵扣联",
					"coordinate": "{\"endY\":1919,\"endX\":1084,\"sourceWidth\":0,\"degree\":270,\"sourceHeight\":0,\"startY\":0,\"startX\":600}",
					"status": 3,
					"deductionStatus": 0,
					"uploadImageId": "sjLm9Tu0gFJatgxOcRiSUd9s9DRozfxK4IWA",
					"fileId": "625908057ca0ec3ccea206e9",
					"ifManualMatch": true
				}
			}
		],
		"deviceCode": "yonyou00001",
		"manufacturer": "yonyou"
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
code	string	否	成功为200，错误提示为其他值 示例：200
message	string	否	成功提示或错误提示 示例：操作成功
data	object	否	返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-22	
更新
请求说明
删除
错误码 (4)
增加异常码
	2	2025-08-20	
更新
请求说明
修改API名称由 智能收单收单结果保存 -> 智能收单正常收单结果保存

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


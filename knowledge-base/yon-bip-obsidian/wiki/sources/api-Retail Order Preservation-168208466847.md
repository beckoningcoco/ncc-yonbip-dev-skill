---
title: "零售单保存"
apiId: "1682084668470460418"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Retail Document Card"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Retail Document Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 零售单保存

>  请求方式	POST | Retail Document Card (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/rmretailreceipt/save
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
data	object	否	是	数据节点
rm_retailvouch	object	否	是	零售单节点
rm_gatheringvouch	object	否	否	收款单节点
NOTransform	int	否	是	0:强转换，1:若转换，2，不转换，传id填2，填1兼容性最好 示例：2

## 3. 请求示例

Url: /yonbip/sd/uretail/rmretailreceipt/save?access_token=访问令牌
Body: {
	"data": {
		"rm_retailvouch": {
			"bDeliveryModify": true,
			"bHangUp": false,
			"bPreselllockStock": true,
			"billingStatus": "PresellBill",
			"cDeliveradd": "湖南文化大厦1906",
			"cGUID": "eqewcsddsfcsdadsd",
			"cStoreCode": "wjl002",
			"store": 2116831407018240,
			"cbillNo": "zyy0406",
			"controlType": 1,
			"dPlanShipmentDate": "2022-08-15 10:45:43",
			"fChangeMoney": 0,
			"fDiscountSum": 0,
			"fEffaceMoney": 0,
			"fGatheringMoney": 0,
			"fGiftApportion": 0,
			"fMoneySum": 22,
			"fPointPayMoney": 0,
			"fPresellPayMoney": 0,
			"fPromotionSum": 0,
			"fQuantitySum": 1,
			"fQuoteMoneySum": 22,
			"fSaleMoney": 0,
			"fSceneDiscountSum": 0,
			"fVIPDiscountSum": 0,
			"iBusinesstypeid": "A01002",
			"iDeliveryState": 0,
			"iDepartmentid": "",
			"iMaker": "1992244922421504",
			"iNegative": 0,
			"iOrgid": "1835511692120320",
			"iPayState": 0,
			"iPresellState": 1,
			"iTakeway": 1,
			"ibillSource": 50,
			"retailVouchDetails": [
				{
					"bCanDiscount": true,
					"fDiscountRate": 100,
					"fDiscount": 0,
					"fMoney": 22,
					"fPrice": 22,
					"fQuantity": 1,
					"fQuoteMoney": 22,
					"fQuotePrice": 22,
					"iEmployeeid": "1993638427480320",
					"iOrder": 0,
					"iWarehouseid": 0,
					"product": "1992322232226048",
					"_status": "Insert",
					"productsku": "1992322243924224"
				}
			],
			"sourceBill": "RetailOrder",
			"vouchdate": "2023-04-08",
			"_status": "Insert"
		},
		"rm_gatheringvouch": {
			"billingStatus": "PresellBill",
			"cGUID": "",
			"cStoreCode": "",
			"controlType": "",
			"dPlanShipmentDate": "2023-04-08",
			"fGatheringMoney": "",
			"fMoneySum": "",
			"fQuantitySum": "",
			"fQuoteMoneySum": "",
			"gatheringVouchDetail": [
				{
					"currency": "",
					"fExchangeRate": 0,
					"fExchangeRateType": "",
					"fMoney": "",
					"forigMoney": "",
					"iOrder": 0,
					"iPaymentid": 0,
					"_status": "",
					"iPaytype": 1
				}
			],
			"iEmployeeid": "",
			"iGathtype": 0,
			"iMaker": "",
			"iOrgid": "",
			"iPresellState": "",
			"iTakeway": "",
			"vouchdate": "2023-04-08",
			"_status": ""
		},
		"NOTransform": 2
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	BillDataDto对象
isCancel	boolean	否	是否取消 示例：false
isActionCancel	boolean	否	是否动作取消 示例：false
msgCode	long	否	状态码 示例：1
data	object	否	返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"isCancel": false,
		"isActionCancel": false,
		"msgCode": 1,
		"data": {
			"iBusinesstypeid": "10000002",
			"fQuantitySum": 1,
			"iMaker": 1988539357008128,
			"vouchdate": "2023-04-07 13:48:08",
			"fGatheringMoney": 0,
			"tenant": 1988539355861248,
			"cStoreCode": "wjl002",
			"store": 2116831407018240,
			"iOrgid": "1989485198545152",
			"billingStatus": "PresellBill",
			"cbillNo": "zyy0406",
			"ibillSource": 50,
			"retailVouchDetails": [
				{
					"fMoney": 22,
					"fPrice": 22,
					"iEmployeeid": "1993638427480320",
					"productsku": 1992322243924224,
					"fQuantity": 1,
					"iOrder": 0,
					"id": 1701370205506633737,
					"iRetailid": 1701370205506633736,
					"product": 1992322232226048
				}
			],
			"fMoneySum": 22,
			"id": 1701370205506633736,
			"code": "LSwjl020230407000006",
			"creatorId": 1988539357008128
		}
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
999	错误信息	请联系管理员

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


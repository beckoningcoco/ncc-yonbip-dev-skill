---
title: "生产订单简版保存"
apiId: "b7c6e112398a46b29eb4ce87ba3f4b3e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "MO"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产订单简版保存

>  请求方式	POST | MO (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/productionorder/save
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
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	单据编号，设置手工编号时必输，自动编号时输入无效 示例：SCDD20210508000001
orgId	string	否	否	工厂id，工厂id和工厂编码不能同时为空，id和编码同时存在，以id为准 示例：1866605942198528
orgCode	string	否	否	工厂编码，工厂id和工厂编码不能同时为空，id和编码同时存在，以id为准 示例：1000212
transTypeId	string	否	否	交易类型id，交易类型id和交易类型编码同时为空时取系统默认交易类型，id和编码同时存在，以id为准 示例：1248018423173517
transTypeCode	string	否	否	交易类型编码，交易类型id和交易类型编码同时为空时取系统默认交易类型，id和编码同时存在，以id为准 示例：PO-001
productionDepartmentId	string	否	否	部门id，部门id和部门编码不能同时为空，id和编码同时存在，以id为准 示例：1870534089855232
productionDepartmentCode	string	否	否	部门编码，部门id和部门编码不能同时为空，id和编码同时存在，以id为准 示例：5645646
vouchdate	string	否	否	单据日期，格式“2021-05-08”，为空默认取值业务日期 示例：2021-05-08
orderUserdefItem!*	string	否	否	表头固定自定义项，orderUserdefItem!为固定值，*需要传的自定义项字段，例如orderUserdefItem!define1
orderProduct	object	是	否	生产订单产品行数据集合

## 3. 请求示例

Url: /yonbip/mfg/productionorder/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "SCDD20210508000001",
		"orgId": "1866605942198528",
		"orgCode": "1000212",
		"transTypeId": "1248018423173517",
		"transTypeCode": "PO-001",
		"productionDepartmentId": "1870534089855232",
		"productionDepartmentCode": "5645646",
		"vouchdate": "2021-05-08",
		"orderUserdefItem!*": "",
		"orderProduct": [
			{
				"materialId": "",
				"materialCode": "",
				"productId": "",
				"skuId": "",
				"skuCode": "",
				"quantity": 10,
				"startDate": "2021-05-08",
				"finishDate": "2021-05-08",
				"orgId": "",
				"materialApplyFlag": true,
				"completedFlag": true,
				"sourceType": "",
				"sourceautoid": "",
				"orderProductUserdefItem!*": "",
				"retMaterialApplyFlag": 0
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
data	object	否	接口调用返回数据
sucessCount	long	否	成功数 示例：1
failCount	long	否	失败数 示例：0
count	long	否	记录总数 示例：1
messages	object	是	数据返回信息汇总
infos	object	是	返回详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			{
				"rowNum": "1",
				"message": "操作成功"
			}
		],
		"infos": [
			{
				"code": 200,
				"rowNum": 1,
				"message": "操作成功",
				"data": {
					"id": 2251405962776832,
					"code": "SCDD20210510000003",
					"vouchdate": 1620576000000,
					"transTypeId": "1248018423173517",
					"productionDepartmentId": "1870534089855232",
					"orgId": "1866605942198528",
					"status": 0,
					"creator": "YonSuite默认用户",
					"creatorId": 1861077977714944,
					"createTime": 1620614914000,
					"createDate": 1620614914000,
					"isWfControlled": false,
					"pubts": 1620614915000,
					"tenant": 1861077976273152,
					"yTenantId": "tl27pqwt",
					"orderProduct": [
						{
							"id": 2251405962793216,
							"quantity": 10,
							"productId": 1869775818379520,
							"finishDate": 1620576000000,
							"startDate": 1620576000000,
							"lineNo": 10,
							"mrpQuantity": 10,
							"bomSelect": "1",
							"orgId": "1866605942198528",
							"materialId": 1869775823737088,
							"skuId": 1869775821852928,
							"changeType": 0,
							"changeRate": 1,
							"productionUnitId": 1869676091724032,
							"auxiliaryQuantity": 10,
							"bomId": 2227281346762496,
							"orderId": 2251405962776832,
							"pubts": 1620614914965,
							"orderMaterial": [
								{
									"requirementDate": 1620576000000,
									"bomId": 2227281346762496,
									"supDirectShip": false,
									"scrap": 0,
									"bomMaterialId": 2227281346762497,
									"supplyType": "0",
									"truncUp": 0,
									"mustLossQuantity": 0,
									"usageType": 1,
									"fixedQuantity": 0,
									"alternateType": 0,
									"isWholeSet": false,
									"changeRate": 1,
									"changeType": 0,
									"orgId": "1866605942198528",
									"materialId": 1869781485211904,
									"productId": 1869781477576960,
									"materialCode": "LCL3",
									"materialName": "L材料3",
									"id": 2251405962793217,
									"skuId": 1869781481902336,
									"skuCode": "LCL3",
									"skuName": "L材料3",
									"mainUnitId": "1869676091724032",
									"mainUnitName": "件",
									"mainUnitPrecision": "3",
									"mainUnitTruncationType": "4",
									"numeratorQuantity": 1,
									"denominatorQuantity": 1,
									"unitUseQuantity": 0.51,
									"stockUnitId": 1869676091724032,
									"stockUnitName": "件",
									"stockUnitPrecision": "3",
									"stockUnitTruncationType": "4",
									"recipientQuantity": 0.51,
									"auxiliaryRecipientQuantity": 0.51,
									"orderProductId": 2251405962793216,
									"pubts": 1620614914965,
									"bomUnitUseQuantityNoloss": 10,
									"standardQty": 10,
									"bomRequireQty": 10,
									"doubleReplenish": 50,
									"replenishAdjustQuantity": 200,
									"auxiliaryReplenishAdjustQuantity": 200
								}
							]
						}
					]
				}
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
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

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


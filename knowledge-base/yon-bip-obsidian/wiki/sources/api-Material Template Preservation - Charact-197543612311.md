---
title: "物料模板保存-特征-幂等"
apiId: "1975436123117191172"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料模板保存-特征-幂等

>  请求方式	POST | Material Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/producttpl/savenewFromIdempotent
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
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
name	object	否	是	物料模板名称
involveSKUNaming	boolean	否	否	物料名称参与SKU名称命名 true: 参与命名，false：不参与命名，默认true 示例：true
isOptionalTemplate	number
小数位数:0,最大长度:16	否	否	是否选配模板（0标识不是选配模版，1为选配模版，默认为0） 示例：0
nameSpacer	number
小数位数:0,最大长度:16	否	否	名称间隔符号（枚举类型，0表示空格；1为中文顿号；2为反斜杠符号，3为中文逗号；其余值暂不支持） 示例：1
stopStatus	number
小数位数:0,最大长度:16	否	是	停用状态（0表示该模板启用，1表示该模板停用，默认为0） 示例：0
units	object	是	否	计量单位信息（该实体内字段优先级ID>编码>名称。即如填写ID以ID为准，ID未填写，编码填写则以编码为准，如果ID和编码都没填写则以名称为准）
productTplAssistUnitExchangesList	object	是	否	物料模板辅计量单位信息（启用辅计量单位时必输）
brands	object	是	否	关联品牌信息
orderPropertySums	object	是	否	订单属性信息
parameters	object	是	否	物料参数信息
freeCTCode	string	否	否	自由项特征组编码（isOptionalTemplate=1,是选配模板时，不可填写） 示例：ces009CT
freeCharacters	object	是	否	自由项特征组特征信息（isOptionalTemplate=1,是选配模板时，不可填写）
materialPropCTCode	string	否	否	物料属性特征组编码 示例：cg1656
skuPropCTCode	string	否	否	SKU属性特征组编码（isOptionalTemplate=1,是选配模板时，不可填写） 示例：disan3
optionCTCode	string	否	否	选配特征组编码（isOptionalTemplate=0,非选配模板时，不可填写 ） 示例：yuda013

## 3. 请求示例

Url: /yonbip/digitalModel/producttpl/savenewFromIdempotent?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"name": {
			"simplifiedName": "API-模板保存-特征-幂等",
			"englishName": "product template name",
			"traditionalName": "物料模板名稱"
		},
		"involveSKUNaming": true,
		"isOptionalTemplate": 0,
		"nameSpacer": 1,
		"stopStatus": 0,
		"units": [
			{
				"unit": 1550125586385993744,
				"unitCode": "HUR",
				"unitName": "小时",
				"purchaseUnit": 1550125586385993744,
				"purchaseUnitCode": "HUR",
				"purchaseUnitName": "小时",
				"purchasePriceUnit": 1550125586385993744,
				"purchasePriceUnitCode": "HUR",
				"purchasePriceUnitName": "小时",
				"stockUnit": 1550125586385993744,
				"stockUnitCode": "HUR",
				"stockUnitName": "小时",
				"batchUnit": 1550125586385993744,
				"batchUnitCode": "HUR",
				"batchUnitName": "小时",
				"onlineUnit": 1550125586385993744,
				"onlineUnitCode": "HUR",
				"onlineUnitName": "小时",
				"offlineUnit": 1550125586385993744,
				"offlineUnitCode": "HUR",
				"offlineUnitName": "小时",
				"requireUnit": 1550125586385993744,
				"requireUnitCode": "HUR",
				"requireUnitName": "小时",
				"batchPriceUnit": 1550125586385993744,
				"batchPriceUnitCode": "HUR",
				"batchPriceUnitName": "小时",
				"produceUnit": 1550125586385993744,
				"produceUnitCode": "HUR",
				"produceUnitName": "小时",
				"enableAssistUnit": true
			}
		],
		"productTplAssistUnitExchangesList": [
			{
				"unitExchangeType": 0,
				"assistUnitCount": 1,
				"assistUnit": 1550125586385993740,
				"assistUnitCode": "SEC",
				"assistUnitName": "秒",
				"mainUnitCount": 3,
				"order": 1
			}
		],
		"brands": [
			{
				"brandCode": "test1",
				"brandName": "a1"
			}
		],
		"orderPropertySums": [
			{
				"propertyTypeShowItem": "1",
				"isShow": false,
				"isRequired": false,
				"alias": "1",
				"limitNum": 50
			}
		],
		"parameters": [
			{
				"name": {
					"simplifiedName": "属性1",
					"englishName": "name1",
					"traditionalName": "名稱1"
				},
				"group": {
					"simplifiedName": "组1",
					"englishName": "group1",
					"traditionalName": "组1"
				},
				"isFilter": true
			}
		],
		"freeCTCode": "ces009CT",
		"freeCharacters": [
			{
				"characteristics": 1826061171976306689,
				"characteristicsName": "测试自由项特征组",
				"characterCode": "ces009CT",
				"twoDimensionalInput": 0,
				"batchSens": 0,
				"costAffec": 0,
				"manuAffec": 0,
				"skuSens": 0,
				"stockSens": 0,
				"snSens": 0,
				"bomAffec": 0,
				"characterOrder": 1
			}
		],
		"materialPropCTCode": "cg1656",
		"skuPropCTCode": "disan3",
		"optionCTCode": "yuda013"
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
code	string	否	返回码，调用成功时返回"200" 示例："200"
message	string	否	提示信息 示例：成功
data	object	否	返回结果,id
id	number
小数位数:0,最大长度:0	否	id 示例：123456

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "成功",
	"data": {
		"id": 123456
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	服务端逻辑异常

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


---
title: "协同委外到货单签收入库"
apiId: "1684330309312577542"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Arrival Notice"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Arrival Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 协同委外到货单签收入库

>  请求方式	POST | Subcontracting Arrival Notice (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/arriveorder/orderWrite
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	委外到货单数据集
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
arrorderdatas	object	是	否	委外到货单明细
sourcetype	string	否	是	数据来源 u9c,openapi,erp,yuncai,openapibip(非协同一体化场景使用,仅支持修改实收数量和拒收数量) 示例：openapi 默认值：openapi

## 3. 请求示例

Url: /yonbip/mfg/arriveorder/orderWrite?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"arrorderdatas": [
			{
				"acceptQuantity": 12,
				"refuseQuantity": 11,
				"arriveQuantity": 0,
				"replenishQuantity": 22,
				"arriveSubQuantity": 0,
				"acceptSubQuantity": 33,
				"refuseSubQuantity": 12,
				"replenishSubQuantity": 31,
				"warehouseSubQuantity": 0,
				"warehousingQuantity": 0,
				"signTime": "2023-02-01 12:00:00",
				"signPerson": "",
				"signStatus": "",
				"ncarrivecode": "",
				"ncarriveid": "",
				"ncarrivebid": "",
				"ycarriveid": "",
				"ycarrivebid": "",
				"isMany": ""
			}
		],
		"sourcetype": "openapi"
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
code	string	否	返回码，调用成功时返回200 示例：200
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
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
count	long	否	总数量 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	调用失败时返回的信息 示例：["WWDH202108040002不支持审批流"]
infos	object	是	调用成功时返回的信息
failinfos	object	是	有失败数据时返回的信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			"WWDH202108040002不支持审批流"
		],
		"infos": [
			{
				"ycarriveid": 1967600514994432,
				"ycarrivebid": "202108040002",
				"ncarriveid": 202108040002,
				"ncarrivebid": "202108040002"
			}
		],
		"failinfos": [
			{
				"ncarriveid": "202108040002",
				"ncarrivebid": "1967600514994432",
				"message": "WWDH202108040002不支持审批流"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-17	
新增
请求参数 isMany
更新
请求参数 signStatus
更新
请求参数 sourcetype

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


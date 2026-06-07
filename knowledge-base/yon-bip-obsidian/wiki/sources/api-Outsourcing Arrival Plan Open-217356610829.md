---
title: "委外到货计划打开"
apiId: "2173566108292349960"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Delivery Schedule"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Delivery Schedule]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外到货计划打开

>  请求方式	POST | Subcontracting Delivery Schedule (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/arriveplan/batchopen
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	业务数据
id	long	否	否	委外到货计划ID，委外到货计划ID和外部系统行ID至少有一个不为空，委外到货计划ID不为空时，按照委外到货计划ID进行操作，否则按照外部来源行ID进行操作 示例：2373477794877696
out_sys_lineid	string	否	否	外部来源行ID，委外到货计划ID和外部系统行ID至少有一个不为空，委外到货计划ID不为空时，按照委外到货计划ID进行操作，否则按照外部来源行ID进行操作 示例：00001

## 3. 请求示例

Url: /yonbip/mfg/arriveplan/batchopen?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2373477794877696,
			"out_sys_lineid": "00001"
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
count	number
小数位数:0,最大长度:10	否	总计数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功计数 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败计数 示例：0
messages	string	是	操作失败提示信息
infos	object	是	操作成功单据信息
failInfos	object	是	有失败数据时返回的信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"subcontractQuantityPU": 2,
				"orderProductLineNo": "10.00000000",
				"rcvOrgId": "1526180336229679105",
				"requireConsult": false,
				"orderId": 2173366538264903685,
				"modifier": "昵称-周晓冬",
				"initiator": 0,
				"productionType": "0",
				"creatorId": 2172775473530011656,
				"modifierId": 2172775473530011656,
				"out_sys_lineid": "8888",
				"lineNo": 20,
				"subcontractToPrice": 1,
				"modifyTime": "2025-01-07 09:32:32",
				"deliveryQuantity": 2,
				"confirmStatus": 0,
				"id": 2173367191188537348,
				"changeFlag": "0",
				"pubts": "2025-01-07 15:54:01",
				"changeRate": 1,
				"deliveryDate": "2025-01-07 00:00:00",
				"mainUnitId": 1535421241765134342,
				"createDate": "2025-01-07 00:00:00",
				"priceUnitId": 1535421241765134342,
				"creator": "昵称-周晓冬",
				"productId": 1741479796898004998,
				"modifyDate": "2025-01-07 00:00:00",
				"arriveQuantity": 1,
				"requireConfirm": false,
				"subcontractUnitId": 1535421241765134342,
				"orderProductPubts": "2025-01-07 09:26:09",
				"orderProductId": 2173366538264903686,
				"subcontractVendorId": 1550115046534152196,
				"createTime": "2025-01-07 09:27:21",
				"deliveryAuxiliaryQuantity": 2,
				"orderCode": "WWDD00000934",
				"consultStatus": 0,
				"status": 1
			}
		],
		"failInfos": [
			{
				"id": 2173367191188537348,
				"message": "到货计划未关闭，不可执行打开操作!"
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


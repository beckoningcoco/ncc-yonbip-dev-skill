---
title: "来款记录详情查询"
apiId: "1592522102008709124"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Incoming Payment Record"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Incoming Payment Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 来款记录详情查询

>  请求方式	POST | Incoming Payment Record (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/upayment/detail/new
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
id	number
小数位数:0,最大长度:30	否	否	来款记录id 示例：1794313632794279936
code	string	否	否	来款记录单号 示例：RECar2208030000606
settlementOrgId_code	string	否	否	会计主体编码 示例：ORG00001
salesOrgId_code	string	否	否	销售组织编码 示例：XS00001
agentId_code	string	否	否	客户编码 示例：KH00001

## 3. 请求示例

Url: /yonbip/sd/api/upayment/detail/new?access_token=访问令牌
Body: [{
	"id": 1794313632794279936,
	"code": "RECar2208030000606",
	"settlementOrgId_code": "ORG00001",
	"salesOrgId_code": "XS00001",
	"agentId_code": "KH00001"
}]

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
code	string	否	响应状态码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	是	响应数据
transactionTypeId_name	string	否	交易类型名称 示例：B2B订货收款
payFinishDate	string	否	单据日期 示例：2022-11-24 00:00:00
agentId	long	否	客户id 示例：1598192575609045000
code	string	否	来款记录单号 示例：RECar202211240008
masterOrgKeyField	string	否	主组织属性 示例：settlementOrgId
payCompleteDate	string	否	审核时间 示例：2022-11-24 12:34:43
modifier	string	否	修改人名称 示例：fhddzh@126.com
creatorId	long	否	制单人id 示例：1591845584582475800
source	long	否	来源[("UDH", 0), ("U8ERP", 1), ("优普商务系统", 2), ("企业空间", 3), ("钛合系统", 4), ("点睛系统", 5), ("OPENAPI", 6), ("开通系统专用", 7), ("超客营销", 8), ("NCERP", 9), ("U9ERP", 10), ("U8cloud", 11), ("UHT", 12), ("畅捷通T+", 13), ("U8C", 14), ("费用", 15), ("销售退货", 16), UNKNOWN("未知系统", 100)] 示例：0
settlementId	long	否	结算方式id 示例：1598197231353593900
settlementWayName	string	否	结算方式名称 示例：现金
settlementOrgId_name	string	否	会计组织名称 示例：宁德时代
payType	long	否	付款方式(1:在线支付, 2:线下支付, 3:返利) 示例：2
modifyTime	string	否	修改时间 示例：2022-11-24 11:12:25
exchangeStatus	long	否	同步状态(0:未同步, 1:同步中, 2:同步成功, 3:同步失败) 示例：0
bizId	long	否	供应商Id 示例：3036204506782176
usedMoney	BigDecimal	否	可用余额 示例：0
id	long	否	来款记录id 示例：1598239322029949000
originalPk	string	否	币种id 示例：1591845627531102184
pubts	string	否	时间戳 示例：2022-11-24 12:46:04
agentId_name	string	否	客户名称 示例：宁德时代客户1
paymentDetails	object	是	来款记录行信息
paymentStatus	object	是	处理记录
failedInfo	string	否	错误信息
originalPk_name	string	否	币种名称 示例：人民币
notUsedMoney	BigDecimal	否	余额 示例：188
amount	BigDecimal	否	付款金额 示例：188
creator	string	否	制单人名称 示例：唐衍成02
transactionTypeId	long	否	交易类型id 示例：1598206955160600600
voucherType	string	否	单据类型（NORMAL：普通 QICHU：期初） 示例：NORMAL
settlementWayErpCode	string	否	结算方式编码 示例：0
transactionTypeId_code	string	否	交易类型编码 示例：F2-Cxx-UO01
payCreateDate	string	否	单据创建时间 示例：2022-11-24 11:12:25
auditorId	long	否	审核人ID 示例：1591845584582475800
createTime	string	否	系统创建时间 示例：2022-11-24 11:12:25
settlementOrgId_code	string	否	会计主体编码 示例：T0
originalPk_code	string	否	币种编码 示例：CNY
settlementOrgId	long	否	会计主体id 示例：1598187816775843800
payVoucherType	string	否	进账类型(PAYMENT：收款单， REFUND：退款单) 示例：PAYMENT
payMentStatusCode	long	否	单据状态(0:未支付, 1:收款中, 2:收款成功, 3:收款失败, 4:开立, 5:审核中) 示例：2
agentId_code	string	否	客户编码 示例：T02
paymentVerification	object	是	核销记录

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"transactionTypeId_name": "B2B订货收款",
			"payFinishDate": "2022-11-24 00:00:00",
			"agentId": 1598192575609045000,
			"code": "RECar202211240008",
			"masterOrgKeyField": "settlementOrgId",
			"payCompleteDate": "2022-11-24 12:34:43",
			"modifier": "fhddzh@126.com",
			"creatorId": 1591845584582475800,
			"source": 0,
			"settlementId": 1598197231353593900,
			"settlementWayName": "现金",
			"settlementOrgId_name": "宁德时代",
			"payType": 2,
			"modifyTime": "2022-11-24 11:12:25",
			"exchangeStatus": 0,
			"bizId": 3036204506782176,
			"usedMoney": 0,
			"id": 1598239322029949000,
			"originalPk": "1591845627531102184",
			"pubts": "2022-11-24 12:46:04",
			"agentId_name": "宁德时代客户1",
			"paymentDetails": [
				{
					"notUsedMoney": 188,
					"amount": 188,
					"modifyTime": "2022-11-24 11:12:25",
					"createTime": "2022-11-24 11:12:25",
					"paymentVoucher": 1598239322029949000,
					"gatheringNature": 1,
					"remark": "0",
					"id": 1598239322029949000,
					"paymentType": "1",
					"paymentTypeId": 1598239322029949000,
					"collectionServiceType": "GLOBZ300000000000001"
				}
			],
			"paymentStatus": [
				{
					"modifyTime": "2022-11-24 11:12:25",
					"code": 4,
					"createTime": "2022-11-24 11:12:25",
					"created": "2022-11-24 11:12:25",
					"paymentVoucher": 1598239322029949000,
					"name": "开立",
					"id": 1598239322029949000,
					"createrId": 1598188117421981700,
					"createrId_name": "唐衍成02"
				}
			],
			"failedInfo": "",
			"originalPk_name": "人民币",
			"notUsedMoney": 188,
			"amount": 188,
			"creator": "唐衍成02",
			"transactionTypeId": 1598206955160600600,
			"voucherType": "NORMAL",
			"settlementWayErpCode": "0",
			"transactionTypeId_code": "F2-Cxx-UO01",
			"payCreateDate": "2022-11-24 11:12:25",
			"auditorId": 1591845584582475800,
			"createTime": "2022-11-24 11:12:25",
			"settlementOrgId_code": "T0",
			"originalPk_code": "CNY",
			"settlementOrgId": 1598187816775843800,
			"payVoucherType": "PAYMENT",
			"payMentStatusCode": 2,
			"agentId_code": "T02",
			"paymentVerification": [
				{
					"agentId": 1685911759222210565,
					"amount": 800,
					"calAmount": 0,
					"orderAmount": 800,
					"id": 1728089995927355400,
					"createTime": "2023-05-18 10:15:53",
					"modifyTime": "2023-05-18 10:15:53",
					"orderCurrency_name": "人民币",
					"orderCurrency": "2601061403054592",
					"orderCurrency_code": "CNY",
					"orderId": 1728088398210007047,
					"payCurrency": "2601061403054592",
					"payCurrency_code": "CNY",
					"payCurrency_name": "人民币",
					"payDate": "2023-05-18 10:15:54",
					"paymentVoucher": 1728087522026192899,
					"status": "CONFIRM",
					"voucherNo": "UO-16822023051816859117000001",
					"voucherType": "ORDER"
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	错误信息	请重新修改参数

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


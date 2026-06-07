---
title: "退款记录详情查询"
apiId: "1596759525326061576"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Refund Record"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Refund Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 退款记录详情查询

>  请求方式	POST | Refund Record (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/upayment/refund/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	long	是	否	退款记录id（退款记录id和单号不能不能同时为空) 示例：[1794313632794279936,1794313632794279936]
code	string	是	否	退款记录单号（退款记录id和单号不能不能同时为空) 示例：["CREFar202211170010","CREFar202211170010"]

## 3. 请求示例

Url: /yonbip/sd/api/upayment/refund/detail?access_token=访问令牌
Body: {
	"id": [
		1794313632794279936,
		1794313632794279936
	],
	"code": [
		"CREFar202211170010",
		"CREFar202211170010"
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
code	string	否	响应状态码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	是	响应数据
transactionTypeId_name	string	否	交易类型名称 示例：B2B收款
payFinishDate	string	否	单据日期 示例：2022-11-17 11:28:05
agentId	long	否	客户id 示例：1580533070149714000
code	string	否	退款记录单号 示例：CREFar202211170010
masterOrgKeyField	string	否	主组织属性 示例：settlementOrgId
payCompleteDate	string	否	审核时间 示例：2022-11-17 11:30:57
modifier	string	否	修改人名称 示例：昵称-fhddzh@126.com
creatorId	long	否	制单人id 示例：1580460571122729000
source	long	否	来源[("UDH", 0), ("U8ERP", 1), ("优普商务系统", 2), ("企业空间", 3), ("钛合系统", 4), ("点睛系统", 5), ("OPENAPI", 6), ("开通系统专用", 7), ("超客营销", 8), ("NCERP", 9), ("U9ERP", 10), ("U8cloud", 11), ("UHT", 12), ("畅捷通T+", 13), ("U8C", 14), ("费用", 15), ("销售退货", 16), UNKNOWN("未知系统", 100)] 示例：0
settlementId	long	否	结算方式id 示例：1580544237076217900
settlementWayName	string	否	结算方式名称 示例：转账支票
settlementOrgId_name	string	否	会计组织名称 示例：核销全职能公司
payType	long	否	付款方式(1:在线支付, 2:线下支付, 3:返利) 示例：2
modifyTime	string	否	修改时间 示例：2022-11-17 11:28:05
exchangeStatus	long	否	同步状态（0:未同步, 1:同步中, 2:同步成功, 3:同步失败） 示例：0
bizId	long	否	供应商id 示例：3014488980182432
usedMoney	BigDecimal	否	已使用金额 示例：0
id	long	否	退款记录id 示例：1593052204047007700
originalPk	string	否	币种id 示例：1580460614071353369
pubts	string	否	时间戳 示例：2022-11-17 11:30:58
agentId_name	string	否	客户名称 示例：客户A
paymentDetails	object	是	退款记录行
paymentStatus	object	是	处理记录
originalPk_name	string	否	币种名称 示例：人民币
notUsedMoney	BigDecimal	否	余额 示例：0
amount	BigDecimal	否	退款金额 示例：111
creator	string	否	创建人名称 示例：昵称-fhddzh@126.com
transactionTypeId	long	否	交易类型id 示例：1587442530087075800
voucherType	string	否	单据类型（NORMAL：普通 QICHU：期初） 示例：NORMAL
settlementWayErpCode	string	否	结算方式编码 示例：2
transactionTypeId_code	string	否	交易类型编码 示例：F2-Cxx-UO01
payCreateDate	string	否	单据创建时间 示例：2022-11-17 11:28:05
auditorId	long	否	审核人id 示例：1580460571122729000
createTime	string	否	系统创建时间 示例：2022-11-17 11:28:05
settlementOrgId_code	string	否	会计主体编码 示例：qzn1
originalPk_code	string	否	币种编码 示例：CNY
settlementOrgId	long	否	会计主体id 示例：1580528027885371400
payVoucherType	string	否	进账类型(PAYMENT：收款单， REFUND：退款单) 示例：REFUND
payMentStatusCode	long	否	单据状态(1:退款中, 2:退款成功, 3:退款失败, 4:开立, 5:审核中) 示例：4
agentId_code	string	否	客户编码 示例：001
salesOrgId_name	string	否	销售组织名称 示例：核销全职能公司
salesOrgId	long	否	销售组织id 示例：1580528027885371400

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"transactionTypeId_name": "B2B收款",
			"payFinishDate": "2022-11-17 11:28:05",
			"agentId": 1580533070149714000,
			"code": "CREFar202211170010",
			"masterOrgKeyField": "settlementOrgId",
			"payCompleteDate": "2022-11-17 11:30:57",
			"modifier": "昵称-fhddzh@126.com",
			"creatorId": 1580460571122729000,
			"source": 0,
			"settlementId": 1580544237076217900,
			"settlementWayName": "转账支票",
			"settlementOrgId_name": "核销全职能公司",
			"payType": 2,
			"modifyTime": "2022-11-17 11:28:05",
			"exchangeStatus": 0,
			"bizId": 3014488980182432,
			"usedMoney": 0,
			"id": 1593052204047007700,
			"originalPk": "1580460614071353369",
			"pubts": "2022-11-17 11:30:58",
			"agentId_name": "客户A",
			"paymentDetails": [
				{
					"notUsedMoney": 0,
					"amount": 111,
					"paymentVoucher": 1593052204047007700,
					"gatheringNature": 0,
					"remark": "0",
					"paymentType": "11",
					"paymentTypeId": 1593052204047007700,
					"modifyTime": "2022-11-17 11:28:05",
					"createTime": "2022-11-17 11:28:05",
					"id": 1593052204047007700,
					"salesOrgId_name": "核销全职能公司",
					"salesOrgId": 1580528027885371400,
					"collectionServiceType": "GLOBZ300000000000001"
				}
			],
			"paymentStatus": [
				{
					"modifyTime": "2022-11-17 11:28:05",
					"code": 4,
					"createTime": "2022-11-17 11:28:05",
					"created": "2022-11-17 11:28:05",
					"paymentVoucher": 1593052204047007700,
					"name": "开立",
					"id": 1593052204047007700,
					"createrId": 1580460571122729000,
					"createrId_name": "昵称-fhddzh@126.com"
				}
			],
			"originalPk_name": "人民币",
			"notUsedMoney": 0,
			"amount": 111,
			"creator": "昵称-fhddzh@126.com",
			"transactionTypeId": 1587442530087075800,
			"voucherType": "NORMAL",
			"settlementWayErpCode": "2",
			"transactionTypeId_code": "F2-Cxx-UO01",
			"payCreateDate": "2022-11-17 11:28:05",
			"auditorId": 1580460571122729000,
			"createTime": "2022-11-17 11:28:05",
			"settlementOrgId_code": "qzn1",
			"originalPk_code": "CNY",
			"settlementOrgId": 1580528027885371400,
			"payVoucherType": "REFUND",
			"payMentStatusCode": 4,
			"agentId_code": "001",
			"salesOrgId_name": "核销全职能公司",
			"salesOrgId": 1580528027885371400
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


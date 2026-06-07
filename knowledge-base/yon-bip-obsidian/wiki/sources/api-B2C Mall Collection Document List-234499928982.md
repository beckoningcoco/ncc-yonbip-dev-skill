---
title: "B2C商城收款单列表"
apiId: "2344999289821855745"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城收款单列表

>  请求方式	POST | Collection (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/B2C/SDMA/umall.um_payment/paymentvouchers/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	分页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	分页尺寸 示例：100 默认值：100
cPayNo	string	否	否	支付单号 示例：P-1a208cae0f300003231213010
cOrderNo	string	否	否	订单编号 示例：O-1a208cae0f300003231213010
agentName	string	否	否	会员手机号 示例：15891160778
cPayType	string	否	否	支付方式(alipay:支付宝支付,bestPay:翼支付,chanpay:畅捷支付,icbccard:工银银行卡,icbcmacao:工银支付,icbcweixin:工银微信,okCard:红宝石卡支付,storagecard:储值卡支付,unionpayWeixin:银联支付,weixin:微信支付) 示例：storagecardstoragecard
simpleVOs	object	是	否	扩展条件查询
field	string	否	否	条件字段 示例：dPayCreateDate
op	string	否	否	操作符 示例：between
value1	string	否	否	条件值1 示例：2025-08-01 00:00:00
value2	string	否	否	条件值2 示例：2025-08-31 23:59:59

## 3. 请求示例

Url: /yonbip/MCC/B2C/SDMA/umall.um_payment/paymentvouchers/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"cPayNo": "P-1a208cae0f300003231213010",
	"cOrderNo": "O-1a208cae0f300003231213010",
	"agentName": "15891160778",
	"cPayType": "storagecardstoragecard",
	"simpleVOs": [
		{
			"field": "dPayCreateDate",
			"op": "between",
			"value1": "2025-08-01 00:00:00",
			"value2": "2025-08-31 23:59:59"
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
code	number
小数位数:0,最大长度:10	否	状态码(200:成功,其他:失败) 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	结果集
pageIndex	number
小数位数:0,最大长度:10	否	分页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	分页尺寸 示例：100
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	记录集合
pageCount	number
小数位数:0,最大长度:10	否	分页数 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 100,
		"recordCount": 1,
		"recordList": [
			{
				"cPayType": "storagecard",
				"cPayNo": "P-1a208cae0f300003231213010",
				"fTotalMoney": 13200,
				"iMemberId": "1882659323447869443",
				"iPayMentStatusCode": 2,
				"remark": "钱包支付",
				"iAmount": 10570,
				"iMemberId_cphone": "15891160778",
				"cOrderNo": "O-1a208cae0f300003231213010",
				"trade_type": "STORAGE",
				"id": "1883220916200013829",
				"pubts": "2023-12-13 10:49:29",
				"dPayCompleteDate": "2023-12-13 10:49:29"
			}
		],
		"pageCount": 1
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
092-501-100407
	不被授权的接口调用者!	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	未知服务异常	

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


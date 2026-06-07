---
title: "包裹清单列表查询"
apiId: "1489169486449213443"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Express Details"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Express Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 包裹清单列表查询

>  请求方式	POST | Express Details (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/packInventory/list
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
partParam	object	否	是	查询条件集合
pageIndex	long	否	是	页号 示例：1 默认值：1
pageSize	long	否	是	每页行数;每页行数不能超过50 示例：10 默认值：10
cexpress_code	string	否	否	快递单号
cship_code	string	否	否	发货单号
tid	string	否	否	交易编号
dShipTimes_start	string	否	否	发货开始时间,格式:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00
dShipTimes_end	string	否	否	发货结束时间,格式:yyyy-MM-dd HH:mm:ss 示例：2022-05-15 00:00:00

## 3. 请求示例

Url: /yonbip/sd/dst/packInventory/list?access_token=访问令牌
Body: {
	"partParam": {
		"pageIndex": 1,
		"pageSize": 10,
		"cexpress_code": "",
		"cship_code": "",
		"tid": "",
		"dShipTimes_start": "2022-05-13 00:00:00",
		"dShipTimes_end": "2022-05-15 00:00:00"
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
code	long	否	返回码，调用成功时返回200 示例：0
message	string	否	调用提示信息 示例：操作成功
data	object	否	调用返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页数据条数 示例：10
recordCount	long	否	查询数据总条数 示例：5
recordList	object	是	返回具体数据
pageCount	long	否	每页记录数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结尾页码 示例：1

## 5. 正确返回示例

{
	"code": 0,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 5,
		"recordList": [
			{
				"tradeiweight": 0,
				"cexpress_code": "12343223",
				"trad_status": "buyers_have_paid",
				"express_name": "圆通",
				"trade_code": "DD146520220624000001",
				"shop_name": "商城默认店铺",
				"receiver_mobile": "157****1096",
				"bill_status": "shipconfirm",
				"tid": "O-6d1604e52d1060624001",
				"pay_time": "2022-06-24 09:38:18",
				"cship_code": "146520220624000000015781",
				"receiver_name": "徐颂爽",
				"receiver_address": "中国 河北 石家庄市 长安区 用友软件园",
				"id": "1484639824990175240",
				"iweight": 0,
				"dShipTimes": "2022-06-24 09:40:53"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	服务端逻辑异常	

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


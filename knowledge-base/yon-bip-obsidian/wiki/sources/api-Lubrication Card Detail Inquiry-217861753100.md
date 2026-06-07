---
title: "润滑方式列表查询"
apiId: "2178617531001470981"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lubrication Card"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lubrication Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 润滑方式列表查询

>  请求方式	POST | Lubrication Card (MRO)


## 1. 支持按照编码或者名称进行精确查询和下载，也支持模糊查询下载；


## 2. 支持全量下载所有档案；


## 3. 支持分页；


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/lmlubricationmethodlist/query
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
page	object	否	否	分页
pageIndex	number
小数位数:0,最大长度:10	否	否	页号 示例：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页条数 示例：20
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段：创建时间（creationtime）
order	string	否	否	排序顺序：正序ASC，倒序：DESC

## 3. 请求示例

Url: /yonbip/am/lmlubricationmethodlist/query?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "enablestate",
				"op": "in",
				"value1": "[1,2]"
			}
		]
	},
	"queryOrders": [
		{
			"field": "",
			"order": ""
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
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	返回http状态码(200:正常，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	查询到的数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	总共条数 示例：100
pageCount	number
小数位数:0,最大长度:10	否	总共页数 示例：5
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页 示例：5
recordList	object	否	详细数据列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 100,
		"pageCount": 5,
		"beginPageIndex": 1,
		"endPageIndex": 5,
		"recordList": {
			"pk_org": "666666",
			"pk_org__name": "全职能组织1",
			"bill_code": "RHFS202404020001",
			"name": "教学",
			"memo": "",
			"enablestate": 1,
			"creator": "",
			"creator__name": "",
			"creationtime": "2026-06-07 13:25:24",
			"modifier": "",
			"modifier__name": "",
			"modifiedtime": "2026-06-07 13:25:24"
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
0	未传入优惠券档案id	coupon_id值填写有误
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


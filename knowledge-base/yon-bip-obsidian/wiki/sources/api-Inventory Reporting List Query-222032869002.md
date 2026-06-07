---
title: "库存上报列表查询"
apiId: "2220328690023661570"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Stock reporting"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stock reporting]
platform_version: "BIP"
source_type: community-api-docs
---

# 库存上报列表查询

>  请求方式	POST | Stock reporting (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/cusstock/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	每页行数 示例：10 默认值：10
code	string	否	否	单据号 示例：20240417020010
bustype	string	否	否	交易类型 示例：168522735618988590
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数如：1:createTime(创建时间),2:modifyTime(修改时间)
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空）
value1	string	否	否	查询条件值1
value2	string	否	否	查询条件值2

## 3. 请求示例

Url: /yonbip/crm/cusstock/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "20240417020010",
	"bustype": "168522735618988590",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
recordList	object	是	子表集合
clientStockInquiryRecordList	object	否	总和记录集合

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"balanceCount": 66,
				"ower": "1686612861107830786",
				"ower_name": "王天驰",
				"professionalTime": "2024-04-17 00:00:00",
				"code": "20240417020010",
				"org": "1686561321477734406",
				"org_name": "集团",
				"bustype": "1685227356189885905",
				"bustype_name": "终端进货上报",
				"dept_name": "销管一部",
				"customerOrTerminal": "蒙牛终端01",
				"terminal": "1914374942443962372",
				"dept": "1686611675674312706",
				"terminal_name": "蒙牛终端01",
				"oldProfessionalTime": "2024-04-17 00:00:00",
				"id": "1976835500760629252",
				"pubts": "2024-04-17 14:05:41"
			}
		],
		"clientStockInquiryRecordList": {
			"stock": "1866978664076804",
			"stock_name": "AAA",
			"measurement": "443414423",
			"measurement_name": "克",
			"stockCount": "1",
			"balanceCount": "1",
			"id": "",
			"preBalanceCount": "11"
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
暂时没有数据哦~

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


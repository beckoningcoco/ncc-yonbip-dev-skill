---
title: "定价类型查询"
apiId: "31e6a8dffdcc4cc59e7f6e967ff8cbbd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Pricing Type"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Pricing Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 定价类型查询

>  请求方式	POST | Pricing Type (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/type
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
pageIndex	long	否	是	当前页数 示例：0 默认值：1
pageSize	long	否	是	分页条数 示例：1 默认值：10
code	string	否	否	定价类型编码 示例：5201
name	string	否	否	定价类型名称 示例：订单取价-基值
calculationType	string	否	否	计算类型，加成:MAKE_UP,数量乘积:PRODUCT 示例：MAKE_UP
isTaxIncluded	boolean	否	否	是否含税， true：是，false ：否, 不传值默认为是 示例：true 默认值：true
simpleVOs	object	是	否	查询条件
op	string	否	否	条件比较符(eq：相等,neq：不相等,lt：小于,gt：大于,elt：小于等于,egt：大于等于,between：区间,in：包含,nin：不包含,like：包含字符,leftlike：左侧包含,rightlike：右侧包含,is_null：为空,is_not_null：不为空,and：和,or：或) 示例：between
field	string	否	否	查询条件字段名(支持createDate：创建日期、createTime：创建时间、description：描述) 示例：createDate
value1	string	否	否	查询条件值1 示例：2021-05-05
value2	string	否	否	查询条件值2 示例：2021-06-17

## 3. 请求示例

Url: /yonbip/sd/pricing/type?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 1,
	"code": "5201",
	"name": "订单取价-基值",
	"calculationType": "MAKE_UP",
	"isTaxIncluded": true,
	"simpleVOs": [
		{
			"op": "between",
			"field": "createDate",
			"value1": "2021-05-05",
			"value2": "2021-06-17"
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
code	long	否	响应编码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	否	响应数据
pageIndex	long	否	页索引 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	响应数据统计 示例：0
recordList	object	是	响应数据集合
beginPageIndex	string	否	开始页索引
endPageIndex	string	否	结束页索引
pageCount	string	否	页数量

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"calculationType": "PRODUCT",
				"isPortalPrice": true,
				"isTaxIncluded": true,
				"inferiorEdit": true,
				"creator": "人员",
				"code": "5201",
				"isLadderPricing": true,
				"amountLadderType": "EXCEED_TOTAL",
				"priceLadderType": "GROUP_ROW",
				"createTime": "2021-05-20 17:04:16",
				"name": "订单取价-基值",
				"id": 2265931059745024,
				"bEditPrice": false,
				"transitionType": "UNIT_PRICE",
				"description": "描述示例",
				"iSystem": 0,
				"createDate": "\"2021-06-02 00:00:00\""
			}
		]
	},
	"beginPageIndex": "",
	"endPageIndex": "",
	"pageCount": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	错误信息	

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


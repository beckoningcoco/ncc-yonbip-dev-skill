---
title: "调价单查询V2"
apiId: "5e4e986beada4707b0cd4b86aac98397"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调价单查询V2

>  请求方式	POST | Price Adjustment Document (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/adjustment
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
code	string	否	否	调价单编码 示例：5201
name	string	否	否	调价单名称 示例：基价模板
creationOrgId	string	否	否	销售组织ID 示例：2142389797851392
status	short	否	否	状态，待审批:0,已生效:1,已驳回:2,审批中:3
path	long	否	是	价格模板ID
simpleVOs	object	是	否	查询条件
op	string	否	否	条件比较符(eq：相等,neq：不相等,lt：小于,gt：大于,elt：小于等于,egt：大于等于,between：区间,in：包含,nin：不包含,like：包含字符,leftlike：左侧包含,rightlike：右侧包含,is_null：为空,is_not_null：不为空,and：和,or：或) 示例：between
field	string	否	否	查询条件字段名(支持createDate：创建日期、createTime：创建时间、description：描述、销售组织Code：creationOrgId.code、价格模板Code：priceTemplateId.code) 示例：createDate
value1	string	否	否	查询条件值1 示例：2021-05-05
value2	string	否	否	查询条件值2 示例：2021-06-17

## 3. 请求示例

Url: /yonbip/sd/pricing/adjustment?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 1,
	"code": "5201",
	"name": "基价模板",
	"creationOrgId": "2142389797851392",
	"status": 0,
	"path": 0,
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
code	long	否	状态码 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页索引 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	数据统计 示例：1
recordList	object	是	数据集合
pageCount	long	否	页统计 示例：1
beginPageIndex	long	否	页开始索引 示例：1
endPageIndex	long	否	页结束索引 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"verifystate": 0,
				"creator": "王好",
				"code": "PA-93920111",
				"canEnable": true,
				"isWfControlled": false,
				"priceTemplateId": 2245921376129280,
				"canEdit": true,
				"creationOrgId": "1951523035419392",
				"priceTemplateId_name": "物料",
				"createTime": "2021-05-19 12:12:57",
				"creationOrgId_name": "斗罗大陆",
				"name": "lcy物料1价格0506",
				"id": 2264229101637888,
				"status": 0,
				"createDate": "2021-05-19 00:00:00"
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


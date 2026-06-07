---
title: "拜访小结列表查询"
apiId: "2070536706338586627"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Visit Summary"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Visit Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 拜访小结列表查询

>  请求方式	POST | Visit Summary (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/visitsummary/list
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
code	string	否	否	小结单号 示例：20240619140141
terminal	string	否	否	终端id 示例：1810590948969676802
bustype	string	否	否	交易类型 示例：1733475524147150858
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数如：1:createTime(创建时间),2:modifyTime(修改时间) 示例：bustype.billtype_id.form_id
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空） 示例：eq
value1	string	否	否	查询条件值1 示例：DSFA.dsfa_visitsummarycard

## 3. 请求示例

Url: /yonbip/crm/visitsummary/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "20240619140141",
	"terminal": "1810590948969676802",
	"bustype": "1733475524147150858",
	"simpleVOs": [
		{
			"field": "bustype.billtype_id.form_id",
			"op": "eq",
			"value1": "DSFA.dsfa_visitsummarycard"
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
recordList	object	是	记录列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"actionId_code": "20240619000014",
				"reviewReuslt": 2,
				"displayPicture": "0d1d7629-3b87-4d45-9e5a-606e390f553b",
				"picture9": "32709de3-2df6-46fe-b534-a33e93f432b8",
				"dept_code": "BJCP",
				"verifystate": 1,
				"picture8": "a6bc2efb-4385-40e1-8145-ea340cab579f",
				"picture7": "8f23d497-2ed5-4ccc-926b-fef492c69563",
				"code": "20240619140141",
				"picture6": "f5ad012b-a254-44e8-85c7-d733c8cc44ff",
				"bustype_name": "拜访小结",
				"picture1": "d28fa7fc-9eb1-420a-abed-a25e091a316d",
				"reformStatus": 0,
				"picture5": "316f5cb6-0287-4e9c-872a-266a03fb8b34",
				"picture4": "30bd1958-ecc0-465c-815b-1dec6cdcaaa5",
				"picture3": "b73bedd9-0408-4f32-b551-4f95644c9d7f",
				"picture2": "fcac8a8b-3e1b-476d-aa0a-515d80a0db20",
				"ower_name": "李雨珊",
				"id": "2023753010563776518",
				"pubts": "2024-08-07 09:36:05",
				"org_name": "集团",
				"ower": "1800973563700707336",
				"creator": "昵称-李雨珊",
				"org": "1686561321477734406",
				"isWfControlled": true,
				"dept_name": "昌平事业部",
				"terminal": "1810590948969676802",
				"dept": "1811240253549182980",
				"bustype": "1733475524147150858",
				"picture10": "254c1858-8e27-4844-b6d0-b74deaca43a8",
				"signInTime": "2024-06-19 18:33:57",
				"terminal_name": "铁锅扁豆焖面",
				"createTime": "2024-06-19 19:17:38",
				"actionId": "2023730470548144130",
				"terminalCode": "0088"
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


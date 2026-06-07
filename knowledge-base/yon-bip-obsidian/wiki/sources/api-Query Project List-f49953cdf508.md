---
title: "查询项目列表"
apiId: "f49953cdf5084b83974fee37d673a735"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Project"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询项目列表

>  请求方式	GET | Project (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/v1/open/projects
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
ts	long	query	否	时间戳    示例: 1631187744502
businesId	string	query	否	业务Id    示例: u2joiisw

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/open/projects?access_token=访问令牌&ts=1631187744502&businesId=u2joiisw

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
code	long	否	状态码 示例：200
data	object	是	返回值
id	long	否	主键 示例：54990
name	string	否	项目名 示例：项目1
beginDate	long	否	开始时间 示例：1628492750000
endDate	long	否	结束时间 示例：1628579150000
classify	string	否	分类 示例：协同云
projectCode	string	否	项目编码 示例：1028
attributes	object	否	拓展字端，暂时无数据
pubts	Date	否	时间戳
displayCode	string	否	displayCode

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"id": 54990,
			"name": "项目1",
			"beginDate": 1628492750000,
			"endDate": 1628579150000,
			"classify": "协同云",
			"projectCode": "1028",
			"attributes": {},
			"pubts": ""
		}
	],
	"displayCode": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
400	参数错误	传入正确参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-27	
新增
返回参数 displayCode
新增错误相应示例

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


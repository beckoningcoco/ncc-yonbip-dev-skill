---
title: "查询租户会议室接口"
apiId: "1982131848275296264"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Meeting Management"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Meeting Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询租户会议室接口

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/external/access/getMeetingRoom
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
ytenantId	string	query	是	租户ID
typeIds	string	query	否	会议室类型ID集合
pageNum	number
小数位数:0,最大长度:10	query	否	分页页码    默认值: 1
pageSize	number
小数位数:-1,最大长度:4	query	否	分页容量    默认值: 10

## 3. 请求示例

Url: /yonbip/uspace/external/access/getMeetingRoom?access_token=访问令牌&ytenantId=&typeIds=&pageNum=&pageSize=

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
code	number
小数位数:0,最大长度:10	否	code 示例：0
displayCode	string	否	发生错误时，错误的状态码 示例：999999
count	number
小数位数:0,最大长度:10	否	count 示例：11
data	object	是	data
id	string	否	id 示例：1603562341105401863
name	string	否	name 示例：普通会议室
typeId	string	否	typeId 示例：1603561997508018183
capacity	number
小数位数:0,最大长度:10	否	capacity 示例：10
state	number
小数位数:0,最大长度:10	否	state 示例：1
isApprove	number
小数位数:0,最大长度:10	否	isApprove 示例：0

## 5. 正确返回示例

{
	"code": 0,
	"displayCode": "999999",
	"count": 11,
	"data": [
		{
			"id": "1603562341105401863",
			"name": "普通会议室",
			"typeId": "1603561997508018183",
			"capacity": 10,
			"state": 1,
			"isApprove": 0
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-27	
新增
返回参数 displayCode
增加错误返回示例

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


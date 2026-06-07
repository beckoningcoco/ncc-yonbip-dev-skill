---
title: "获取假勤方案"
apiId: "d31bc219-8ba1-4c36-a6cc-b44b2cf1020a"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Timesheet Scheme Card"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Timesheet Scheme Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取假勤方案

>  请求方式	GET | Timesheet Scheme Card (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/attendScheme/attendExternal/getAttendScheme
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/hrcloud/time/attendScheme/attendExternal/getAttendScheme?access_token=访问令牌

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
code	string	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	返回信息结果集
baafe1f39b43c9bd9fee91a5d37a67ed	string	否	假勤方案键值对,key是假勤方案id,value是假勤方案名称 示例：函数测试

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"baafe1f39b43c9bd9fee91a5d37a67ed": "函数测试"
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
401	业务异常	查询假勤方案表数据异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-31	
更新
请求说明
更新
返回参数 data
更新
返回参数 baafe1f39b43c9bd9fee91a5d37a67ed

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


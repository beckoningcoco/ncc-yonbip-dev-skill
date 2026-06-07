---
title: "根据人员id查询期间信息"
apiId: "2548963472776888326"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Employee Performance"
domain: "PFMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Performance]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据人员id查询期间信息

>  请求方式	GET | Employee Performance (PFMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/pmresult/openapi/queryPeriodListByStaffid
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
staffid	string	query	是	人员id

## 3. 请求示例

Url: /yonbip/HCC/pmresult/openapi/queryPeriodListByStaffid?access_token=访问令牌&staffid=

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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	返回业务数据
status	number
小数位数:0,最大长度:10	否	业务数据返回码，0是成功，1是失败 示例：0
periods	object	是	期间列表
traceId	string	否	traceId 示例：5ffc7f597dd2c17f
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"status": 0,
		"periods": [
			{
				"periodcode": "2025",
				"tdate": "2025-12-31 00:00:00",
				"fdate": "2025-01-01 00:00:00",
				"periodname": "2025年year",
				"id": "2209022265917440002"
			}
		]
	},
	"traceId": "5ffc7f597dd2c17f",
	"uploadable": "0"
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
	1	2026-06-01	
删除
请求参数 Digital-Avatar-Id
删除
请求参数 Yht-Access-Token

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


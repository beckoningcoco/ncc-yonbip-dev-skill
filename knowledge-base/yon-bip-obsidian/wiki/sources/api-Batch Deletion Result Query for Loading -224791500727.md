---
title: "装载方式批量删除结果查询-新集成"
apiId: "2247915007275171844"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Loading Method"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Loading Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 装载方式批量删除结果查询-新集成

>  请求方式	GET | Loading Method (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/coredoc/async/loadway/batchDelete/getAsyncResult/{jobId}
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
jobId	string	path	是	任务ID

## 3. 请求示例

Url: /yonbip/digitalModel/coredoc/async/loadway/batchDelete/getAsyncResult/{jobId}?access_token=访问令牌

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
code	string	否	返回码，调用成功是返回200 示例：200
data	object	否	调用成功时的返回数据
count	number
小数位数:0,最大长度:10	否	总数 示例：10
successCount	number
小数位数:0,最大长度:10	否	成功总数 示例：9
failCount	number
小数位数:0,最大长度:10	否	失败总数 示例：1
messages	object	是	失败数据信息
infos	object	是	成功数据信息
displayCode	string	否	业务异常码 示例：000-525-000066
level	number
小数位数:0,最大长度:2	否	异常级别 示例：0：错误，1：警告

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "数据被使⽤不能删除！"
			}
		],
		"infos": [
			{
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000066",
	"level": NaN
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-01	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


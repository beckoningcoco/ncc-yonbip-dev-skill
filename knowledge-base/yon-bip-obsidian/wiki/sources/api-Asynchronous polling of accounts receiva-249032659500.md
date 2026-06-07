---
title: "应收结算清单异步轮询"
apiId: "2490326595004268552"
apiPath: "请求方式	GET"
method: "ContentType"
category: "AR Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AR Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收结算清单异步轮询

>  请求方式	GET | AR Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/FCC/receivable/bill/asyncBatchActionQuery/{actionCode}
请求方式	GET
ContentType	
应用场景	开放API/集成API
API类别	其他
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
actionCode	string	path	是	动作编码
asyncKey	string	query	是	异步处理key    示例: batchsubmit_8c0bcfb5-3668-446b-9742-d903b83452c3

## 3. 请求示例

Url: /yonbip/FCC/receivable/bill/asyncBatchActionQuery/{actionCode}?access_token=访问令牌&asyncKey=batchsubmit_8c0bcfb5-3668-446b-9742-d903b83452c3

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
code	number
小数位数:0,最大长度:2	否	返回码，调用成功时返回200 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	返回数据，字符串格式
count	number
小数位数:0,最大长度:10	否	已处理的条数 示例：100
successCount	number
小数位数:0,最大长度:10	否	成功记录数
failCount	number
小数位数:0,最大长度:10	否	失败记录数
flag	number
小数位数:0,最大长度:1	否	前端处理标志
percentage	number
小数位数:2,最大长度:10	否	完成百分比
totalCount	number
小数位数:0,最大长度:10	否	总条数
data	object	否	数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 100,
		"successCount": 0,
		"failCount": 0,
		"flag": 0,
		"percentage": 0,
		"totalCount": 0,
		"data": {
			"totalCount": 0,
			"count": 0,
			"sucessCount": 0,
			"failCount": 0,
			"messages": [
				""
			]
		}
	}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


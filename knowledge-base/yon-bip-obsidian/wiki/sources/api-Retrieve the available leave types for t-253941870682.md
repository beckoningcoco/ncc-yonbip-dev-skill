---
title: "获取当前登录用户可用的休假类型"
apiId: "2539418706828066821"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Leave Type"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取当前登录用户可用的休假类型

>  请求方式	GET | Leave Type (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/leave/getLeaveTypeInfo
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
language	string	query	否	多语参数zh_CN,zh_TW,en_US.错误或空参数系统默认租户默认语言    示例: zh_CN    默认值: zh_CN

## 3. 请求示例

Url: /yonbip/HCC/time/leave/getLeaveTypeInfo?access_token=访问令牌&language=zh_CN

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
小数位数:0,最大长度:10	否	响应编码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	否	数据
data	string	是	数据 示例：["事假","年假","加班转调休（天）"]
count	number
小数位数:0,最大长度:10	否	数量 示例：3
list	object	是	类型集合

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"data": [
			"事假",
			"年假",
			"加班转调休（天）"
		],
		"count": 3,
		"list": [
			{
				"businessData": "事假",
				"name": "事假"
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
500	获取休假类型失败	检查休假类型

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


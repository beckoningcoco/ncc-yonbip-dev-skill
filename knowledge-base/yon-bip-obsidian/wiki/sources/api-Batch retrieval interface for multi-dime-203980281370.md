---
title: "调剂单批量获取多维数据接口"
apiId: "2039802813707452425"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planning, Budgeting& Forecasting"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planning, Budgeting& Forecasting]
platform_version: "BIP"
source_type: community-api-docs
---

# 调剂单批量获取多维数据接口

>  请求方式	POST | Planning, Budgeting& Forecasting (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/bp/bill/data/get
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
sysCode	string	query	否	服务编码，预算服务编码为BP    默认值: BP
Body参数
名称	类型	数组	必填	描述
bustype	string	否	是	交易类型
budget_version	string	否	是	版本编码
scenario	string	否	是	业务方案编码
budget_bill_adjust_linesList	object	是	是	调整行列表
sheet_code	string	否	是	表单编码
entity_code	string	否	是	主体编码
years_code	string	否	是	年编码
period_code	string	否	是	期间编码
account_code	string	否	是	科目编码
reserved_field_1	string	否	否	预留字段1编码(按照调整单设置-字段设置中映射的预留字段编码)
reserved_field_2	string	否	否	预留字段2编码
reserved_field_3	string	否	否	预留字段3编码
reserved_field_4	string	否	否	预留字段4编码
reserved_field_5	string	否	否	预留字段5编码
reserved_field_6	string	否	否	预留字段6编码
reserved_field_7	string	否	否	预留字段7编码
reserved_field_8	string	否	否	预留字段8编码
reserved_field_9	string	否	否	预留字段9编码
reserved_field_10	string	否	否	预留字段10编码
reserved_field_11	string	否	否	预留字段11编码
reserved_field_12	string	否	否	预留字段12编码
reserved_field_13	string	否	否	预留字段13编码
reserved_field_14	string	否	否	预留字段14编码
reserved_field_15	string	否	否	预留字段15编码
reserved_field_16	string	否	否	预留字段16编码
reserved_field_17	string	否	否	预留字段17编码
reserved_field_18	string	否	否	预留字段18编码
reserved_field_19	string	否	否	预留字段19编码
reserved_field_20	string	否	否	预留字段10编码

## 3. 请求示例

Url: /yonbip/qyjx/bp/bill/data/get?access_token=访问令牌&sysCode=
Body: {
	"bustype": "",
	"budget_version": "",
	"scenario": "",
	"budget_bill_adjust_linesList": [
		{
			"sheet_code": "",
			"entity_code": "",
			"years_code": "",
			"period_code": "",
			"account_code": "",
			"reserved_field_1": "",
			"reserved_field_2": "",
			"reserved_field_3": "",
			"reserved_field_4": "",
			"reserved_field_5": "",
			"reserved_field_6": "",
			"reserved_field_7": "",
			"reserved_field_8": "",
			"reserved_field_9": "",
			"reserved_field_10": "",
			"reserved_field_11": "",
			"reserved_field_12": "",
			"reserved_field_13": "",
			"reserved_field_14": "",
			"reserved_field_15": "",
			"reserved_field_16": "",
			"reserved_field_17": "",
			"reserved_field_18": "",
			"reserved_field_19": "",
			"reserved_field_20": ""
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
code	string	否	响应编码
message	string	否	提示信息
data	object	是	返回结果
sheet_code	string	否	表单编码
cube_code	string	否	模型编码
entity_code	string	否	主体编码
years_code	string	否	年编码
period_code	string	否	期间编码
account_code	string	否	科目编码
value	string	否	预算数，如果为空，该字段为null
reserved_field_1	string	否	预留字段1编码
reserved_field_2	string	否	预留字段2编码
reserved_field_3	string	否	预留字段3编码
reserved_field_4	string	否	预留字段4编码
reserved_field_5	string	否	预留字段5编码
reserved_field_6	string	否	预留字段6编码
reserved_field_7	string	否	预留字段7编码
reserved_field_8	string	否	预留字段8编码
reserved_field_9	string	否	预留字段9编码
reserved_field_10	string	否	预留字段10编码
reserved_field_11	string	否	预留字段11编码
reserved_field_12	string	否	预留字段12编码
reserved_field_13	string	否	预留字段13编码
reserved_field_14	string	否	预留字段14编码
reserved_field_15	string	否	预留字段15编码
reserved_field_16	string	否	预留字段16编码
reserved_field_17	string	否	预留字段17编码
reserved_field_18	string	否	预留字段18编码
reserved_field_19	string	否	预留字段19编码
reserved_field_20	string	否	预留字段20编码

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"sheet_code": "",
			"cube_code": "",
			"entity_code": "",
			"years_code": "",
			"period_code": "",
			"account_code": "",
			"value": "",
			"reserved_field_1": "",
			"reserved_field_2": "",
			"reserved_field_3": "",
			"reserved_field_4": "",
			"reserved_field_5": "",
			"reserved_field_6": "",
			"reserved_field_7": "",
			"reserved_field_8": "",
			"reserved_field_9": "",
			"reserved_field_10": "",
			"reserved_field_11": "",
			"reserved_field_12": "",
			"reserved_field_13": "",
			"reserved_field_14": "",
			"reserved_field_15": "",
			"reserved_field_16": "",
			"reserved_field_17": "",
			"reserved_field_18": "",
			"reserved_field_19": "",
			"reserved_field_20": ""
		}
	]
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
	1	2026-04-02	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


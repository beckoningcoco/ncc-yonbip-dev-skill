---
title: "残疾人就业保障金计算表-编辑"
apiId: "1940524618878025734"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calculation of Employment Security for Disabled Persons"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calculation of Employment Security for Disabled Persons]
platform_version: "BIP"
source_type: community-api-docs
---

# 残疾人就业保障金计算表-编辑

>  请求方式	POST | Calculation of Employment Security for Disabled Persons (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/other-tax/api/disableempsecurity/update
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
orgCode	string	否	是	组织编码 示例：rzs2
totalWagesLastYear	number
小数位数:2,最大长度:15	否	是	上年在职职工工资总额 示例：12.00
employeesLastYear	number
小数位数:4,最大长度:17	否	是	上年在职职工人数 示例：10
arrangedEmployeesLastYear	number
小数位数:4,最大长度:17	否	是	上年实际安排残疾人就业人数 示例：12
avgWagesLastYear	number
小数位数:6,最大长度:15	否	是	上年在职职工年平均工资（或当地社会平均工资的2倍） 示例：1200.000000
currentFeeReduction	number
小数位数:0,最大长度:15	否	否	本期减免费额 示例：100
currentPaid	number
小数位数:2,最大长度:15	否	否	本期已缴费额 示例：1
proportionShouldArranged	string	否	否	应安排残疾人就业比例 示例：0.02
taxPeriodStart	string	否	是	税（费）款所属期起yyyy-MM-dd,注意:dd是月初第一天。 示例：2023-10-01
taxPeriodEnd	string	否	是	税（费）款所属期止yyyy-MM-dd,注意:dd是月末最后一天。 示例：2023-10-31
taxOffice	string	否	否	所属主管税务所 示例：国家税务总局绥中县税务局前所税务分局办税厅
taxDeducationCompleteName	string	否	否	减免政策代码和名称 示例：残保金
sourceId	string	否	是	来源ID 示例：2

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/disableempsecurity/update?access_token=访问令牌
Body: [{
	"orgCode": "rzs2",
	"totalWagesLastYear": 12,
	"employeesLastYear": 10,
	"arrangedEmployeesLastYear": 12,
	"avgWagesLastYear": 1200,
	"currentFeeReduction": 100,
	"currentPaid": 1,
	"proportionShouldArranged": "0.02",
	"taxPeriodStart": "2023-10-01",
	"taxPeriodEnd": "2023-10-31",
	"taxOffice": "国家税务总局绥中县税务局前所税务分局办税厅",
	"taxDeducationCompleteName": "残保金",
	"sourceId": "2"
}]

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
code	string	否	状态码 示例：0000
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	提示信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
9999	系统异常	错误提示信息

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


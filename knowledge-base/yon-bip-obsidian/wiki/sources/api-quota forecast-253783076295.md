---
title: "额度预测"
apiId: "2537830762953048066"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Leave Quota"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Quota]
platform_version: "BIP"
source_type: community-api-docs
---

# 额度预测

>  请求方式	POST | Leave Quota (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/leave/batchPredict
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
staffIds	string	是	是	员工Id 示例：["2402181496666325001"]
schemeId	string	否	是	假勤方案ID 示例：2139233273715884039
leaveTypeId	string	否	是	休假类型ID 示例：2111046691837714251
leaveDate	string	否	是	离职日期 示例：2026-05-13

## 3. 请求示例

Url: /yonbip/HCC/time/leave/batchPredict?access_token=访问令牌
Body: {
	"staffIds": [
		"2402181496666325001"
	],
	"schemeId": "2139233273715884039",
	"leaveTypeId": "2111046691837714251",
	"leaveDate": "2026-05-13"
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
code	string	否	响应码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	是	数据
staffId	string	否	员工ID 示例：2402181496666325001
staffName	string	否	员工姓名 示例：抵扣009
staffCode	string	否	员工编码 示例：00000098
leaveTypeId	string	否	休假类型ID 示例：2111046691837714251
leaveTypeName	string	否	休假类型名称 示例：年假
year	string	否	年 示例：2026
month	string	否	月
totalRestQuota	number
小数位数:0,最大长度:10	否	累计可休 示例：11
planQuota	number
小数位数:0,最大长度:10	否	预测计划额度 示例：10
curQuota	number
小数位数:0,最大长度:10	否	预测当期额度 示例：10
curPredictQuota	number
小数位数:0,最大长度:10	否	预测当期可休 示例：11
unit	string	否	单位 示例：2

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"staffId": "2402181496666325001",
			"staffName": "抵扣009",
			"staffCode": "00000098",
			"leaveTypeId": "2111046691837714251",
			"leaveTypeName": "年假",
			"year": "2026",
			"month": "",
			"totalRestQuota": 11,
			"planQuota": 10,
			"curQuota": 10,
			"curPredictQuota": 11,
			"unit": "2"
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
401	该用户无可用的休假类型！	在时间管理中配置用户适用的休假类型

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


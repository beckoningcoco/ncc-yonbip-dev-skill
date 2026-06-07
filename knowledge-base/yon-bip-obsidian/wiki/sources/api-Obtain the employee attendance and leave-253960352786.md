---
title: "获取人员假勤方案"
apiId: "2539603527861796869"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Timesheet Scheme Card"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Timesheet Scheme Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取人员假勤方案

>  请求方式	POST | Timesheet Scheme Card (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/scheme/querySchemeByStaffIds
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
staffIds	string	query	是	人员ids    示例: 2463586953230024711,2465270168103682049

## 3. 请求示例

Url: /yonbip/HCC/time/scheme/querySchemeByStaffIds?access_token=访问令牌&staffIds=2463586953230024711%2C2465270168103682049

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
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回结果集
2463586953230024711	object	否	人员id

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"2463586953230024711": {
			"outRuleName": "xqy外出规则",
			"attendRetrospect": 0,
			"overtimeRuleId": "0000ML0L0G0QF6Z8JL0000otrule0001",
			"leaveRuleName": "默认休假规则",
			"itemSchemeId": "0000ML0L0G0QF6Z8JL00000000000001",
			"retrospectPeriod": 0,
			"overtimeRuleName": "默认加班规则",
			"awayRuleName": "默认出差规则",
			"itemSchemeName": "默认考勤统计规则",
			"createTime": "2000-05-28 08:58:56",
			"name": "默认假勤方案",
			"id": "0000ML0L0G0QF6Z8JL00000000000001",
			"periodSchemeId": "0000ML0L0G0QF6Z8JL00000000000001",
			"periodSchemeName": "默认考勤周期",
			"outRuleId": "2506075982378565639",
			"leaveRuleId": "0000ML0L0G0QF6Z8JL00000000000001",
			"awayRuleId": "0000ML0L0G0QF6Z8JL00000000000001"
		}
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


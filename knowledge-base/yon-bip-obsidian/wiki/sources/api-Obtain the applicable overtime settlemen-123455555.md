---
title: "获取员工适用的加班结算方式"
apiId: "123455555"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "O/T Policy Card"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, O/T Policy Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取员工适用的加班结算方式

>  请求方式	POST | O/T Policy Card (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/overtime/getOtSettleInfo
请求方式	POST
ContentType	application/x-www-form-urlencoded
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
staffId	string	header	否	非必填，操作人员工id，可在假勤档案节点查询到    示例: 2059124616614144
staffIds	string	query	是	必填，要查询的员工id（可在假勤档案节点查询到），用逗号分隔    示例: 2425806511231232,2323819251978496,2253402457870592
beginTime	DateTime	query	是	开始时间，示例:2021-11-19，加班开始时间，加班结束时间不能跨2天以上    示例: 2021-11-19
endTime	DateTime	query	是	结束时间，示例:2021-11-20，加班开始时间，加班结束时间不能跨2天以上    示例: 2021-11-20

## 3. 请求示例

Url: /yonbip/hrcloud/time/overtime/getOtSettleInfo?access_token=访问令牌&staffIds=2425806511231232%2C2323819251978496%2C2253402457870592&beginTime=2021-11-19&endTime=2021-11-20
Header: 
	staffId : "2059124616614144"

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
data	object	否	结果集
2466781494448384	object	是	员工id
2466783907123456	object	是	员工id

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"2466781494448384": [
			{
				"date": "2024-06-13 00:00:00",
				"dateType": 2,
				"overtimeType": "ogt91cyx10000000babc",
				"otRuleSettleType": "1",
				"otTurnRate": 100,
				"otRuleId": "0000KR5QX2GOBNNR5L0000otrule0001",
				"overtimeRuleSettleTypeDtos": {
					"otRuleType": "1",
					"settleType": "0",
					"settleTypeRate": "70",
					"otTurnRate": "100"
				}
			}
		],
		"2466783907123456": [
			{
				"date": "2024-06-13 00:00:00",
				"dateType": 1,
				"overtimeType": "ogt91cyx10000000babc",
				"otRuleSettleType": "2",
				"otTurnRate": 100,
				"otRuleId": "0000KR5QX2GOBNNR5L0000otrule0001"
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
50004	参数JSON中缺少endTime	请输入endTime
50005	传的时间的单位为秒	开始日期，结束日期必须晚于2000-01-01
310036	非法token	请传入正确的token
50003	参数JSON中缺少beginTime！	请输入beginTime
50009	日期格式不符合要求,应为yyyy-MM-dd格式	请输入格式正确的日期
50008	开始日期不能晚于结束日期!	开始日期早于结束日期
50007	加班单据不允许跨两天以上！	开始日期，结束日期不能跨2天
999	未查询到该员工的任职记录	请输入正确的员工id

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


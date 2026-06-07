---
title: "查询某个人的可用休假类型和每种休假类型总的可用额度"
apiId: "2537818754224488456"
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

# 查询某个人的可用休假类型和每种休假类型总的可用额度

>  请求方式	POST | Leave Quota (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/leave/queryTypesAndBalance
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/HCC/time/leave/queryTypesAndBalance?access_token=访问令牌

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
小数位数:0,最大长度:10	否	响应码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	数据
enableTypes	object	是	额度假类型
disEnableTypes	object	是	非额度假类型

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"enableTypes": [
			{
				"id": "0000L6YQ8AVLFUZPXD00000000000003",
				"refId": "0000L6YQ8AVLFUZPXD0000lvtype003",
				"code": "10",
				"typeName": "加班转调休",
				"minTime": "1",
				"minUnit": "1",
				"islimit": "1",
				"showQuotaFlag": 1,
				"isAttachment": "0",
				"remark": "",
				"leaveSort": 0,
				"leaveOrder": 0,
				"leaveSequence": 4,
				"attachmentExcessHour": 0,
				"attachmentExcessDay": 0,
				"limitBillEntrance": "1,2,3",
				"leaveBalance": 0
			}
		],
		"disEnableTypes": [
			{
				"id": "0000L6YQ8AVLFUZPXD00000000000010",
				"refId": "0000L6YQ8AVLFUZPXD0000lvtype010",
				"code": "1",
				"typeName": "事假",
				"minTime": "1",
				"minUnit": "1",
				"islimit": "0",
				"showQuotaFlag": 1,
				"isAttachment": "0",
				"remark": "",
				"leaveSort": 0,
				"leaveOrder": 0,
				"leaveSequence": 2,
				"attachmentExcessHour": 0,
				"attachmentExcessDay": 0,
				"limitBillEntrance": "1,2,3"
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


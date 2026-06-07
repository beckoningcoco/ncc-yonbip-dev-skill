---
title: "根据待办的业务参数获取用户id"
apiId: "1601187533528498177"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "To-do Message"
domain: "APP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, To-do Message]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据待办的业务参数获取用户id

>  请求方式	GET | To-do Message (APP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/todo/query/businessKey
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
businessKey	string	query	是	创建待办时传过来businessKey,也是业务方唯一业务参数    示例: 10de5c02-6c98-11ed-98df-ee264a24440e

## 3. 请求示例

Url: /yonbip/uspace/todo/query/businessKey?access_token=访问令牌&businessKey=10de5c02-6c98-11ed-98df-ee264a24440e

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
code	string	否	http状态码，表示网关调用服务的后端是否成功 示例：200
message	string	否	只有请求失败时会出现的参数，为网关调用服务后端请求失败的提示语 示例：网关上没有注册此API[/yonbip/uspace/todo/query/businessKey]，请确认后重新调用
data	object	否	请求成功时的返回内容
flag	int	否	服务后端请求是否处理成功，0表示成功，其它数字表示失败 示例：0
msg	string	否	服务后端请求成功或失败的提示语 示例：success
result	object	是	返回的待办的数组
displayCode	string	否	错误码

## 5. 正确返回示例

{
	"code": "200",
	"message": "网关上没有注册此API[/yonbip/uspace/todo/query/businessKey]，请确认后重新调用",
	"data": {
		"flag": 0,
		"msg": "success",
		"result": [
			{
				"userId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"businessKey": "bcdd3b0e-6fa7-11ed-bc71-7af1a3149e4c",
				"mUrl": "https://bip-daily.yyuap.com/mdf-node/meta/voucher/st_purchaseorder/1602017424286679041?domainKey=upu&apptype=mdf&tenantId=0000KPDEKPDIBLPTSA0000&serviceCode=st_purchaseorderlist&taskId=bcdd3b0e-6fa7-11ed-bc71-7af1a3149e4c&apptype=mdf&systemCode=&from_service=iuap-apcom-messagecenter",
				"webUrl": "https://bip-daily.yyuap.com/mdf-node/meta/voucher/st_purchaseorder/1602017424286679041?domainKey=upu&tenantId=0000KPDEKPDIBLPTSA0000&apptype=mdf&serviceCode=st_purchaseorderlist&taskId=bcdd3b0e-6fa7-11ed-bc71-7af1a3149e4c&from_mc_workflow=1&from_service=iuap-apcom-messagecenter&",
				"content": "发起人：昵称-wsstest\\n发起时间：11-29 13:23\\n发起人部门：集团\\n当前租户：0601日常旗舰全",
				"title": "采购订单CGDD221129000005"
			}
		]
	},
	"displayCode": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
310404	通过openApi调用路径错误	传递正确的调用路径

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-04	
新增
返回参数 displayCode
支持返回错误码

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


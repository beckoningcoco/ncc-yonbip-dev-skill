---
title: "任务提交(有审批流)"
apiId: "2138655935620972549"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Task"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 任务提交(有审批流)

>  请求方式	POST | Task (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/task/submit
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	任务提交参数
systemSource	string	否	是	系统来源 api调用时不能为空，api来源的标识 示例：systemSource 默认值：systemSource
code	string	否	否	任务编码 示例：20241031000863
id	string	否	否	任务id 示例：1957591891206209600

## 3. 请求示例

Url: /yonbip/crm/task/submit?access_token=访问令牌
Body: {
	"data": [
		{
			"systemSource": "systemSource",
			"code": "20241031000863",
			"id": "1957591891206209600"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	string	否	返回码 示例：200
message	string	否	调用成功时返回的信息 示例：操作成功
data	object	否	调用成功时返回的数据
count	number
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数 示例：0
messages	string	是	提交不通过的提示信息
infos	object	是	提交通过返回的数据
failInfos	object	是	提交通过返回的信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"verifystate": 1,
				"obsoleteStatus": "0",
				"code": "2024032300412",
				"startDate": "2024-10-31 00:00:00",
				"endDate": "2024-11-05 23:59:59",
				"org": "1733604510595022850",
				"isWfControlled": "true",
				"saleArea": "",
				"planTask": "false",
				"taskTransType_visitType": "1",
				"dept": "1873577219907387395",
				"bustype": "1779393122472558598",
				"id": "1958299676065136645",
				"pubts": "2024-03-23 14:41:37",
				"auditor": "昵某",
				"auditorId": "1955975471679143940",
				"auditTime": "2024-03-23 14:41:37",
				"auditDate": "2024-03-23 00:00:00",
				"ytenant": "0000LI1EO7E96110660000"
			}
		],
		"failInfos": [
			{
				"id": "1957580801600651270",
				"message": "该单据已开启审批流，openAPI不支持未开启审批流的任务审核！"
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
999	服务端逻辑异常	请检查传入数据的正确性

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


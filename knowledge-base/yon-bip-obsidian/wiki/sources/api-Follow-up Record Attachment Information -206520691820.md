---
title: "跟进记录附件信息查询接口"
apiId: "2065206918200688643"
apiPath: "9. 接口变更日志"
method: "ContentType	application/json"
category: "Follow-up Record"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Follow-up Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 跟进记录附件信息查询接口

>  9. 接口变更日志 | Follow-up Record (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/rest/v1/openapi/queryBusinessFiles_followrecord
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
businessIds	string	是	是	业务标识集合 示例：["2056264186405060612"]

## 3. 请求示例

Url: /yonbip/crm/rest/v1/openapi/queryBusinessFiles_followrecord?access_token=访问令牌
Body: {
	"businessIds": [
		"2056264186405060612"
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
code	string	否	后端服务影响码 示例：200
data	object	否	返回具体数据对象
bussinessId	object	是	单据id

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"bussinessId": [
			{
				"fileId": "6565cf9f1xxa4b52490a9958",
				"filePath": "https://xxx.oss-cn-beijing-internal.aliyuncs.com/iuap-apcom-file-private/iuap-apcom-file/0000KN5SBWCXXXE9SF0000/2024072616/dfec9f76-1d2f-4481-b759-1b371a0ff65e.png?Expires=1722963021&OSSAccessKeyId=BFFAI5tByXGxxx8mi4vNB75r&Signature=vYZdkMiLPwQTvmibUlJ5HG",
				"fileSize": 695083,
				"name": "1721982353779821.png",
				"yhtUserId": "30950820-8b32-b7a60c037680",
				"tenantId": "0000KN5XXXX43JE9SF0000",
				"ctime": 1721982367540,
				"utime": 1722849828985,
				"fileExtension": ".jpg",
				"fileName": "xxx",
				"objectId": "2060880477380149249",
				"objectName": "yonbip-mkt-crm"
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
310071	请求地址[https://bip-daily.yonyoucloud.com/iuap-apcom-file/rest/v1/openapi/queryBusinessFiles],状态码[400],错误消息[null]	调用格式错误

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


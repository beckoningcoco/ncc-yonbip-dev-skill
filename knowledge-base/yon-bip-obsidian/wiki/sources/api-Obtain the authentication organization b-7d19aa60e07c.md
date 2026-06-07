---
title: "签章根据用户id获取认证组织"
apiId: "7d19aa60e07c4fa4a615b893542f88aa"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Approval"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Approval]
platform_version: "BIP"
source_type: community-api-docs
---

# 签章根据用户id获取认证组织

>  请求方式	POST | Approval (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openapi/iform/signature/querySignCompanysByUser
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
iformUserIds	string	是	是	查询认证组织的用户id集合 示例：["d2769a9a-e1e5-4775-b1da-907e666b46b3"]
appSource	string	否	否	新老租户区分（老租户传null,新租户传"approve"或不传）

## 3. 请求示例

Url: /yonbip/uspace/openapi/iform/signature/querySignCompanysByUser?access_token=访问令牌
Body: {
	"iformUserIds": [
		"d2769a9a-e1e5-4775-b1da-907e666b46b3"
	],
	"appSource": ""
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
code	long	否	返回状态码，200成功，其它异常 示例：200
message	string	否	返回信息描述
data	object	否	返回数据对象
userCompanyMap	object	否	返回对象内容

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"userCompanyMap": {
			"d2769a9a-e1e5-4775-b1da-907e666b46b3": [
				{
					"sourceId": "2019609293689088",
					"sourceType": "1",
					"companyName": "用友网络科技股份有限公司",
					"companyId": "4028a8e5798d35b501798d38c7b60000",
					"mainstayType": "2"
				}
			]
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
310036	非法token（token信息失效）	重新获取正确token参数

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


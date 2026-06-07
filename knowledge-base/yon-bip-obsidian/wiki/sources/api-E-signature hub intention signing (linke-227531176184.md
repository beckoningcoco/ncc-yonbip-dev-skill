---
title: "电子签hub意愿签（联动意愿认证接口）"
apiId: "2275311761842241544"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子签hub意愿签（联动意愿认证接口）

>  请求方式	POST | E-signature Configuration (PF)


## 1. 签署前需要校验意愿认证结果，通过后方可签署


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/id/signFlow/v1/action
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
signFlowId	string	否	是	签署流程ID 示例：13d37e0404d65f01e30a41b6396c2d08
authId	string	否	是	意愿认证id，意愿认证接口返回参数 示例：125a69842715d7666a8ed7f52f2967bd
signerId	string	否	是	签署节点id,创建签署流程返回参数 示例：SWDSRERW
actions	object	是	否	签署信息，节点中未指定的动作，按照创建签署流程时指定的印章和位置进行盖章
actionId	string	否	是	签署动作ID 示例：1240424de62174a908a376de3a50b496
sealId	string	否	否	印章ID,如果此处为空，则以签署流程定义，如果两者同时为空，使用默认的印章。 示例：da75fcbdcdbc4f1fab3f3c308598b832
sealPage	string	否	否	当签署流程，signType为1时生效 示例：1-2
positionX	string	否	否	当签署流程，signType为1时生效，X轴坐标：整份文档的X轴按照50000份计算，以左上角为原点 示例：25000
positionY	string	否	否	当签署流程，signType为1时生效，Y轴坐标：整份文档的Y轴按照50000份计算，以左上角为原点 示例：25000

## 3. 请求示例

Url: /yonbip/id/signFlow/v1/action?access_token=访问令牌
Body: {
	"signFlowId": "13d37e0404d65f01e30a41b6396c2d08",
	"authId": "125a69842715d7666a8ed7f52f2967bd",
	"signerId": "SWDSRERW",
	"actions": [
		{
			"actionId": "1240424de62174a908a376de3a50b496",
			"sealId": "da75fcbdcdbc4f1fab3f3c308598b832",
			"sealPage": "1-2",
			"positionX": "25000",
			"positionY": "25000"
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
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：success
data	object	否	响应数据
signerId	string	否	签署人节点id 示例：SWDSRERW
actionResult	object	是	签署成功动作信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"signerId": "SWDSRERW",
		"actionResult": [
			{
				"actionId": "da75fcbdcdbc4f1fab3f3c308598b832",
				"sealId": "1c6ab6041d6d4109b61b3cb8f84f6e19"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-15	
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


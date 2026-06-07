---
title: "第三方系统信息回写事项凭证"
apiId: "1752053628504375297"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Event Entry"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Event Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# 第三方系统信息回写事项凭证

>  请求方式	POST | Event Entry (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/AMP/task/merge/sendopenapi
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
code	long	否	是	响应编码（请求） 示例：200
msg	string	否	是	返回信息（请求入参） 示例：保存成功
dataInfo	object	否	是	单据信息（请求）
busiId	string	否	是	业务ID（请求） 示例：123
billVersion	long	否	是	单据版本（请求） 示例：123
data	object	否	是	返回报文体（请求）
busiId	string	否	是	业务ID（请求） 示例：123
id	string	否	是	总账凭证ID（请求） 示例：123456
code	long	否	是	总账凭证号（请求） 示例：100100
details	object	是	否	明细数据（请求）

## 3. 请求示例

Url: /yonbip/AMP/task/merge/sendopenapi?access_token=访问令牌
Body: {
	"code": 200,
	"msg": "保存成功",
	"dataInfo": {
		"busiId": "123",
		"billVersion": 123
	},
	"data": {
		"busiId": "123",
		"id": "123456",
		"code": 100100,
		"details": [
			{
				"busiId": "123",
				"id": "123456"
			}
		]
	}
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
code	string	否	编码（响应） 示例：200
message	string	否	返回信息（响应） 示例：成功
data	object	否	报文数据（响应）
busiId	string	否	业务ID（响应） 示例：表头业务id123

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": {
		"busiId": "表头业务id123"
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
310404	网关未注册	检查配置

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-27	
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


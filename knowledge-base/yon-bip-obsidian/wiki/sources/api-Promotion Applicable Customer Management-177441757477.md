---
title: "促销适用客户管理"
apiId: "1774417574771556361"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Promotion"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Promotion]
platform_version: "BIP"
source_type: community-api-docs
---

# 促销适用客户管理

>  请求方式	POST | Product Promotion (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/promotion/updateAgentDimension
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
preId	long	否	否	促销ID，促销编码和促销ID不能同时为空，其中一个必须有值 示例：1774306541163249700
code	string	否	否	促销编号，促销编码和促销ID不能同时为空，其中一个必须有值 示例：E00606
billNo	string	否	是	单据编码；商品促销：promotion_productlist，整单优惠: entire_promotionlist，累计量促销: promotion_accumulatelist，组合销售: promotion_combinationlist，自由选配: promotion_selectfreelist 示例：entire_promotion
agentRanges	object	是	否	适用客户
name	string	否	是	客户名称 示例：123
dataStatus	string	否	是	修改状态；Insert：插入数据；Delete：删除数据 示例：Insert
exceptionalAgents	object	是	否	例外客户
name	string	否	是	客户名称 示例：123
dataStatus	string	否	是	修改状态；Insert：插入数据；Delete：删除数据 示例：Insert

## 3. 请求示例

Url: /yonbip/sd/promotion/updateAgentDimension?access_token=访问令牌
Body: {
	"preId": 1774306541163249700,
	"code": "E00606",
	"billNo": "entire_promotion",
	"agentRanges": [
		{
			"name": "123",
			"dataStatus": "Insert"
		}
	],
	"exceptionalAgents": [
		{
			"name": "123",
			"dataStatus": "Insert"
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	返回数据
message	string	否	处理结果信息
exceptionalAgentsResult	object	否	例外客户更新结果

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"message": "",
		"exceptionalAgentsResult": {
			"totalCount": 1,
			"successfulCount": 0,
			"failureCount": 1,
			"failResult": [
				{}
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
400	错误信息	请重新修改参数
999	系统出错	联系开发人员处理

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


---
title: "根据订阅号ID查询已发送图文消息"
apiId: "aa703967779a4b2b8b8d6404deeb0ad5"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Subscriptions"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subscriptions]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据订阅号ID查询已发送图文消息

>  请求方式	GET | Subscriptions (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/rest/v1/third/article/data
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pubAccountIds	string	query	是	订阅号ID,之间用逗号隔开    默认值: NONE
skip	string	query	否	起始    默认值: 0
limit	string	query	否	每条限制    默认值: 10

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/third/article/data?access_token=访问令牌&pubAccountIds=&skip=&limit=

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
total	int	否	查询结果总数
id	string	否	文章id
title	string	否	文章标题
thumbId	string	否	文章缩略图地址
contentSourceUrl	string	否	文章地址
digest	string	否	简介
sendDate	long	否	发送时间戳

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"total": 0,
		"id": "",
		"title": "",
		"thumbId": "",
		"contentSourceUrl": "",
		"digest": "",
		"sendDate": 0
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


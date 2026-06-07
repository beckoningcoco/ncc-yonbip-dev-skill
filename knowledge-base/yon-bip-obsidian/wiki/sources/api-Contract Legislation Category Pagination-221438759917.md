---
title: "合同法律类别分页查询"
apiId: "2214387599178465288"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Legal Category"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Legal Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同法律类别分页查询

>  请求方式	POST | Contract Legal Category (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/rest/integration/legalType/pageQuery
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	法律类别主键 示例：22165490222222220003
ids	string	否	否	法律类别主键列表，如果多个，使用,拼接 示例：22165490222222220003,22165491122223333003
code	string	否	否	法律类别编码，模糊查询 示例：legalType001
name	string	否	否	法律类别名称，模糊查询 示例：法律类别001
enable	string	否	否	启用状态（1 启用 0 停用） 示例：1
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	增量查询时间，即查询该时间点后新增或修改的数据 示例：2024-12-12 12:12:12
page	object	否	否	分页信息
pageIndex	number
小数位数:0,最大长度:10	否	否	当前分页 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	分页大小，建议分页大小不要超过500 示例：10 默认值：10

## 3. 请求示例

Url: /yonbip/digitalModel/rest/integration/legalType/pageQuery?access_token=访问令牌
Body: {
	"id": "22165490222222220003",
	"ids": "22165490222222220003,22165491122223333003",
	"code": "legalType001",
	"name": "法律类别001",
	"enable": "1",
	"pubts": "2024-12-12 12:12:12",
	"page": {
		"pageIndex": 1,
		"pageSize": 10
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
code	string	否	接口状态 示例：200
message	string	否	接口信息 示例：操作成功
data	object	否	接口数据
pageIndex	number
小数位数:0,最大长度:10	否	当前分页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	分页大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	总数量 示例：15
recordList	object	是	数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 15,
		"recordList": [
			{
				"id": "1975231356142092306",
				"code": "O",
				"enable": "1",
				"name": {
					"en_US": "En_123",
					"zh_CN": "居间合同"
				},
				"remark": {
					"en_US": "En_12221",
					"zh_CN": "当事人双方约定一方接受他方的委托，并按照他方的指示要求，为他方报告订立合同的机会或者为订约提供媒介服务，委托人给付报酬的合同"
				},
				"pubts": "2025-02-24 15:40:15"
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
500	未知异常	未知异常，请联系管理员
10000	服务内部错误	服务内部异常，请联系管理员

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


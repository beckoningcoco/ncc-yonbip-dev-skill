---
title: "其他任职原因列表查询MDD"
apiId: "2445339518393909250"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Other Employment Reason"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Employment Reason]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他任职原因列表查询MDD

>  请求方式	POST | Other Employment Reason (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/HCC/partjobtype/list
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
pageSize	int	否	是	页面大小 默认值：10
pageIndex	int	否	是	页码 默认值：1
code	string	否	否	编码
name	string	否	否	名称
enable	string	否	否	启用状态，1启用 2停用 示例：1

## 3. 请求示例

Url: /yonbip/HCC/partjobtype/list?access_token=访问令牌
Body: {
	"pageSize": 0,
	"pageIndex": 0,
	"code": "",
	"name": "",
	"enable": "1"
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	返回数据
pageSize	number
小数位数:0,最大长度:10	否	页面大小 示例：20
pageIndex	number
小数位数:0,最大长度:10	否	当前页码 示例：1
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
recordCount	number
小数位数:0,最大长度:10	否	总记录数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页码 示例：1
recordList	object	是	记录列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageSize": 20,
		"pageIndex": 1,
		"pageCount": 1,
		"recordCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"id": "HRDIWORK030000000312",
				"name": {
					"en_US": "Unmarried2",
					"zh_TW": "未婚2",
					"zh_CN": "未婚"
				},
				"code": "1",
				"enable": 1,
				"description": {
					"en_US": "",
					"zh_TW": "",
					"zh_CN": ""
				},
				"ispreset": true,
				"sortnum": 1,
				"pubts": "2025-12-18 10:27:54"
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


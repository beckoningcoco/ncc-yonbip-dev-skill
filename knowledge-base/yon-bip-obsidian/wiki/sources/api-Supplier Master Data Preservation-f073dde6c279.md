---
title: "供应商主数据保存"
apiId: "f073dde6c279447abfdbdcac48e4f99a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Relationship Management"
domain: "PROSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Relationship Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商主数据保存

>  请求方式	POST | Supplier Relationship Management (PROSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/sync/sinochem/masterCode
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
ESB	object	否	是	ESB
DATA	object	否	是	DATA

## 3. 请求示例

Url: /yonbip/cpu/sync/sinochem/masterCode?access_token=访问令牌
Body: {
	"ESB": {
		"DATA": {
			"DATAINFOS": {
				"PUUID": "103F7241581B48068F26579E250B8251",
				"DATAINFO": [
					{
						"UUID": "873C71B303A0403B900B981CDC9B7981",
						"CODE": "10020484",
						"INDEX": "0",
						"DESC50": "CN630295",
						"CODEID": "26801022137717719"
					}
				]
			}
		}
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
code	string	否	状态码200成功 示例：200
message	string	否	失败时，返回错误信息
data	object	否	返回数据体

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	集团主数据编码同步失败！	联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
请求参数 (10)
新增
返回参数 code
新增
返回参数 message
新增
返回参数 data
新增
错误码 0

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


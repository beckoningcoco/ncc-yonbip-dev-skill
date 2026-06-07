---
title: "查看库存上报详情"
apiId: "2220388690716786691"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Stock reporting"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stock reporting]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看库存上报详情

>  请求方式	GET | Stock reporting (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/cusstock/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	库存上报主键    示例: 1976835500760629252

## 3. 请求示例

Url: /yonbip/crm/cusstock/getbyid?access_token=访问令牌&id=1976835500760629252

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
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
code	string	否	单据号 示例：20240417020010
balanceCount	number
小数位数:0,最大长度:10	否	总结存数量 示例：66
dept	string	否	部门 示例：1686611675674312706
dept_name	string	否	部门名称 示例：销管一部
dept_code	string	否	部门编码 示例：XG01
bustype	string	否	交易类型 示例：1685227356189885905
bustype_code	string	否	交易类型编码 示例：002
bustype_name	string	否	交易类型 示例：终端进货上报
ower	string	否	负责人 示例：1686612861107830786
ower_name	string	否	负责人名称 示例：王天驰
ower_code	string	否	负责人编码 示例：00000001
professionalTime	string	否	业务日期 示例：2024-04-17 00:00:00
org	string	否	组织 示例：1686561321477734406
org_name	string	否	组织名称 示例：集团
org_code	string	否	组织编码 示例：JT01
terminal	string	否	终端 示例：1914374942443962372
terminal_name	string	否	终端名称 示例：蒙牛终端01
oldProfessionalTime	string	否	上次业务日期 示例：2024-04-17 00:00:00
customer	string	否	客户
customer_name	string	否	客户名称
id	string	否	进货上报单据行ID 示例：1976835500760629252
pubts	string	否	时间戳 示例：2024-04-17 14:05:41
clientStockInquiryRecordList	object	是	库存上报子表数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "20240417020010",
		"balanceCount": 66,
		"dept": "1686611675674312706",
		"dept_name": "销管一部",
		"dept_code": "XG01",
		"bustype": "1685227356189885905",
		"bustype_code": "002",
		"bustype_name": "终端进货上报",
		"ower": "1686612861107830786",
		"ower_name": "王天驰",
		"ower_code": "00000001",
		"professionalTime": "2024-04-17 00:00:00",
		"org": "1686561321477734406",
		"org_name": "集团",
		"org_code": "JT01",
		"terminal": "1914374942443962372",
		"terminal_name": "蒙牛终端01",
		"oldProfessionalTime": "2024-04-17 00:00:00",
		"customer": "",
		"customer_name": "",
		"id": "1976835500760629252",
		"pubts": "2024-04-17 14:05:41",
		"clientStockInquiryRecordList": [
			{
				"inquiryRecordDefineCharacter": {
					"ytenant": "0000LFHZ398A0HRH1D0000",
					"id": "1976835500760629254",
					"pubts": "2024-04-17 14:05:41"
				},
				"stock_name": "拿铁咖啡（序列号管理是）",
				"clientStockUpId_code": "20240417020010",
				"measurement_code": "LTR",
				"measurement": "1686627223449108487",
				"measurement_precision": 4,
				"clientStockInquiryId": "1976835500760629252",
				"measurement_name": "升",
				"balanceCount": 242,
				"id": "1976835500760629253",
				"stock": "1686628082442567683",
				"stock_code": "000002",
				"stockCount": 11,
				"preBalanceCount": "22"
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


---
title: "供应商销售发票详情更新"
apiId: "1921066200845516800"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Invoice"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商销售发票详情更新

>  请求方式	POST | Sales Invoice (SS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/saleinvoice/update
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
id	string	否	是	销售发票主键 示例：18494554645
invCode	string	否	否	发票号码 示例：20240101
invId	string	否	否	发票代码 示例：20240101
billdate	date
格式:yyyy-MM-dd	否	否	开票日期 示例：2022-05-11
invDeliveryMethod	string	否	否	发票寄送方式，枚举：0:第三方物流 ; 1:随货送票 ;2:电子发票; 示例：1
expectDate	date
格式:yyyy-MM-dd	否	否	预计到票日期 示例：2022-05-11
logisticsCompanyCode	string	否	否	物流公司代码 示例：YZ
logisticsCode	string	否	否	物流单号 示例：454645646
description	string	否	否	物流信息说明 示例：物流信息说明
contactPerson	string	否	否	供应商联系人 示例：供应商联系人
contactPhone	string	否	否	供应商联系人电话 示例：供应商联系人电话
contactAddress	string	否	否	供应商联系地址 示例：供应商联系地址
memo	string	否	否	备注 示例：备注
saleInvoiceBody	object	是	否	销售发票子表
materiaList	object	是	否	销售发票孙表
id	string	否	否	销售发票子表主键 示例：1235656487
claimDeductionList	object	是	否	销售发票索赔扣款子表
id	string	否	否	销售发票索赔扣款子表主键 示例：454587
entityInvoiceList	object	是	否	销售发票实物发票子表
id	string	否	否	实物发票主键 示例：45645646
number	string	否	否	发票号码 示例：20210101
purName	string	否	否	发票抬头 示例：采购企业
code	string	否	否	发票代码 示例：20210101
openInvDate	date
格式:yyyy-MM-dd	否	否	开票日期 示例：2024-05-11
mnyTol	number
小数位数:8,最大长度:20	否	否	无税金额 示例：23.36
taxTol	number
小数位数:8,最大长度:20	否	否	税额 示例：3.36
taxMnyTol	number
小数位数:8,最大长度:20	否	否	含税金额 示例：20.00
checkCode	string	否	否	发票校验码 示例：546789464
billType	string	否	否	票据种类，枚举：custbook:海关缴款书; invoice:增值税发票; machine:机打发票; machine:其他发票; 示例：invoice
customerName	string	否	否	采购企业 示例：采购企业
selName	string	否	否	销售方名称 示例：供应商
invoiceTypeId	string	否	否	发票类型主键 示例：49646467
status	string	否	否	状态，枚举：0:保存; 1:已查验; 2:已匹配; 示例：0

## 3. 请求示例

Url: /yonbip/cpu/saleinvoice/update?access_token=访问令牌
Body: {
	"id": "18494554645",
	"invCode": "20240101",
	"invId": "20240101",
	"billdate": "2022-05-11",
	"invDeliveryMethod": "1",
	"expectDate": "2022-05-11",
	"logisticsCompanyCode": "YZ",
	"logisticsCode": "454645646",
	"description": "物流信息说明",
	"contactPerson": "供应商联系人",
	"contactPhone": "供应商联系人电话",
	"contactAddress": "供应商联系地址",
	"memo": "备注",
	"saleInvoiceBody": [
		{
			"materiaList": [
				{
					"id": "4544616",
					"memo": "备注"
				}
			],
			"id": "1235656487"
		}
	],
	"claimDeductionList": [
		{
			"id": "454587"
		}
	],
	"entityInvoiceList": [
		{
			"id": "45645646",
			"number": "20210101",
			"purName": "采购企业",
			"code": "20210101",
			"openInvDate": "2024-05-11",
			"mnyTol": 23.36,
			"taxTol": 3.36,
			"taxMnyTol": 20,
			"checkCode": "546789464",
			"billType": "invoice",
			"customerName": "采购企业",
			"selName": "供应商",
			"invoiceTypeId": "49646467",
			"status": "0"
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
code	string	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
data	object	否	返回数据
id	string	否	销售发票主键 示例：18494554645
invCode	string	否	发票号码 示例：20240101
invId	string	否	发票代码 示例：20240101
billdate	date
格式:yyyy-MM-dd	否	开票日期 示例：2024-05-11
invDeliveryMethod	string	否	发票寄送方式，枚举：0:第三方物流 ; 1:随货送票 ;2:电子发票; 示例：1
expectDate	date
格式:yyyy-MM-dd	否	预计到票日期 示例：2022-05-11
logisticsCompany	string	否	物流公司 示例：邮政
logisticsCompanyCode	string	否	物流公司代码 示例：YZ
logisticsCode	string	否	物流单号 示例：454645646
description	string	否	物流信息说明 示例：物流信息说明
contactPerson	string	否	供应商联系人 示例：供应商联系人
contactPhone	string	否	供应商联系人电话 示例：供应商联系人电话
contactAddress	string	否	供应商联系地址 示例：供应商联系地址
memo	string	否	备注 示例：备注
saleInvoiceBody	object	是	销售发票子表
claimDeductionList	object	是	销售发票索赔扣款子表
entityInvoiceList	object	是	销售发票实物发票子表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "18494554645",
		"invCode": "20240101",
		"invId": "20240101",
		"billdate": "2024-05-11",
		"invDeliveryMethod": "1",
		"expectDate": "2022-05-11",
		"logisticsCompany": "邮政",
		"logisticsCompanyCode": "YZ",
		"logisticsCode": "454645646",
		"description": "物流信息说明",
		"contactPerson": "供应商联系人",
		"contactPhone": "供应商联系人电话",
		"contactAddress": "供应商联系地址",
		"memo": "备注",
		"saleInvoiceBody": [
			{
				"id": "15456664986",
				"materiaList": [
					{
						"id": "4544616",
						"memo": "备注"
					}
				]
			}
		],
		"claimDeductionList": [
			{
				"id": "454587"
			}
		],
		"entityInvoiceList": [
			{
				"id": "45645646",
				"number": "20210101",
				"purName": "采购企业",
				"code": "20210101",
				"openInvDate": "2024-05-11",
				"mnyTol": 23.36,
				"taxTol": 3.36,
				"taxMnyTol": 20,
				"checkCode": "546789464",
				"billType": "invoice",
				"customerName": "采购企业",
				"selName": "供应商",
				"invoiceTypeId": "49646467",
				"status": "0"
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
999	更新错误	

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


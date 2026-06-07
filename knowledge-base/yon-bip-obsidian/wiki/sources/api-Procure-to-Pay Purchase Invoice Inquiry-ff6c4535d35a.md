---
title: "采购协同采购发票查询"
apiId: "ff6c4535d35a407ab18153ac3a898d6a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购协同采购发票查询

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/ycinvoice/getycinvoice
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
inv_code	string	否	否	发票号码--------（发票主键）和（发票号码、代码）二选一必填
inv_id	string	否	否	发票代码--------（发票主键）和（发票号码、代码）二选一必填
invoice_id	string	否	否	发票主键--------（发票主键）和（发票号码、代码）二选一必填

## 3. 请求示例

Url: /yonbip/cpu/ycinvoice/getycinvoice?access_token=访问令牌
Body: {
	"inv_code": "",
	"inv_id": "",
	"invoice_id": ""
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
code	string	否	code 示例：200
message	string	否	message 示例：查询成功
data	object	是	data
editstatus	string	否	编辑状态 UNSET未确定 UNCHANGE：不改变 INSERT：插入 UPDATE：更新 DELETE:删除 示例：UNSET
tenant_id	string	否	租户id 示例：72082
ts	string	否	ts 示例：2021-09-07 14:51:32
owner	object	否	用户
createtime	long	否	创建时间 示例：1630997441000
org	object	否	组织
invoice_id	string	否	发票id 示例：pu_invce100000001vil
title	string	否	发票抬头 示例：天海集团总公司
contact_person	string	否	联系人 示例：yc_18989999102
contact_phone	string	否	电话 示例：18989999102
contact_address	string	否	地址
inv_id	string	否	发票代码 示例：55555555555555
inv_code	string	否	发票号码 示例：555555555555555555
billdate	long	否	时间 示例：1630944000000
status	string	否	状态(0:保存,1:发布,2:发送ERP) 示例：0
type	string	否	发票类型(0:普通发票, 1:增值税普通发票,2:增值税专用发票) 示例：2
num	long	否	数量 示例：27
mny	double	否	无税单价 示例：9701.06
taxmny	double	否	含税单价 示例：10962.2
tax	double	否	税额 示例：1261.14
bodys	object	是	子表信息
cal_ajust_mny	long	否	计算调整单价 示例：0
cal_ajust_taxmny	long	否	计算调整含税单价 示例：0
cal_ajust_tax	long	否	计算调整税额 示例：0
memo	string	否	备注
nc_invoice_id	string	否	nc发票id
nc_invoice_billcode	string	否	nc发票code
his_nc_invoice_id	string	否	历史nc发票id
his_nc_invoice_billcode	string	否	历史nc发票code
currencyId	string	否	币种Id 示例：G001ZM0000DEFAULTCURRENCT00000000001
currencyName	string	否	币种Name 示例：人民币
currencyCode	string	否	币种Code 示例：CNY
currencySymbol	string	否	币种符号 示例：￥
invoice_taxmny	string	否	开票金额
reject_reason	string	否	拒绝理由
transaction_type_name	string	否	交易类型name
transaction_type_code	string	否	交易类型code
signStatus	string	否	签收状态 0未签收 1已签收 示例：0
signDate	string	否	签收时间
sendErpCode	string	否	发erp状态 0待发送 1无需发送 2失败 3.成功 4erp删除 5.发送中 示例：5
sendErpTime	long	否	发erp状态时间 示例：1630997492000
hfanOrgCode	string	否	组织编码
hfanOrgName	string	否	组织Name 示例：天海集团总公司
hfanOrgId	long	否	组织Id 示例：2063331945255168
owner_id	string	否	用户 示例：2090517
supplier	object	否	供应商
redMark	string	否	红票标识
primaryKey	string	否	主键 示例：pu_invce100000001vil
ytenantId	string	否	ytenantId

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"editstatus": "UNSET",
			"tenant_id": "72082",
			"ts": "2021-09-07 14:51:32",
			"owner": {
				"id": 2090517,
				"loginName": "YHT-26446-258941608884944236",
				"name": "yc_18989999102"
			},
			"createtime": 1630997441000,
			"org": {
				"id": 2063331945255168,
				"orgCode": "01",
				"orgName": "天海集团总公司"
			},
			"invoice_id": "pu_invce100000001vil",
			"title": "天海集团总公司",
			"contact_person": "yc_18989999102",
			"contact_phone": "18989999102",
			"contact_address": "",
			"inv_id": "55555555555555",
			"inv_code": "555555555555555555",
			"billdate": 1630944000000,
			"status": "0",
			"type": "2",
			"num": 27,
			"mny": 9701.06,
			"taxmny": 10962.2,
			"tax": 1261.14,
			"bodys": [
				{
					"editstatus": "UNSET",
					"ts": "2021-09-07 14:51:29",
					"invoice_id": "pu_invce100000001vil",
					"invoice_bid": "pu_inc_b100000001r9t",
					"relate_id": "sa_invce100000002ef5",
					"relate_bid": "sa_inc_b1000000029sh",
					"apply_bid": "",
					"apply_id": "",
					"apply_billcode": "",
					"checkbill_id": "puchkbil100000003afy",
					"checkbill_bid": "pu_chk_b100000001zrd",
					"checkbill_billcode": "",
					"mny": 2446.74,
					"taxmny": 2764.82,
					"tax": 318.08,
					"num": 21,
					"materials": [
						{
							"editstatus": "UNSET",
							"tenant_id": "",
							"ts": "2021-09-07 14:51:29",
							"invoice_mid": "pu_inc_m100000001tl5",
							"invoice_bid": "pu_inc_b100000001r9t",
							"invoice_id": "pu_invce100000001vil",
							"apply_mid": "",
							"apply_bid": "",
							"apply_id": "",
							"checkbill_id": "",
							"checkbill_bid": "pu_chk_b100000001zrd",
							"checkbill_mid": "pu_chk_m10000000240a",
							"relate_id": "sa_invce100000002ef5",
							"relate_bid": "sa_inc_b1000000029sh",
							"relate_mid": "sa_inc_m100000002d9h",
							"price": 108.85,
							"taxprice": 123,
							"mainUnit": {
								"id": "1001E2100000000001BL",
								"code": "03",
								"name": "个"
							},
							"priceUnit": {
								"id": "1001E2100000000001BL",
								"code": "03",
								"name": "个"
							},
							"purUnit": "",
							"num": 3,
							"mainNum": 3,
							"purNum": "",
							"invPriceExchRate": "",
							"invPurExchRate": "",
							"mny": 326.55,
							"taxmny": 369,
							"tax": 42.45,
							"taxrate": 13,
							"product": {
								"id": 2066143598727424,
								"code": "010106",
								"name": "婴儿营养米粉250g"
							},
							"ajust_mny": 0,
							"ajust_taxmny": 0,
							"ajust_tax": 0,
							"material_spec": "",
							"material_model": "",
							"sourceBillCode": "",
							"sourceBillRowno": "60",
							"contractBillno": "",
							"orderCode": "",
							"ncInvoiceBid": "",
							"projectId": "",
							"projectCode": "",
							"projectName": "",
							"erpProjectId": ""
						}
					],
					"ajust_mny": 0,
					"ajust_taxmny": 0,
					"ajust_tax": "",
					"sourceBillCode": "CR2021062600000055"
				}
			],
			"cal_ajust_mny": 0,
			"cal_ajust_taxmny": 0,
			"cal_ajust_tax": 0,
			"memo": "",
			"nc_invoice_id": "",
			"nc_invoice_billcode": "",
			"his_nc_invoice_id": "",
			"his_nc_invoice_billcode": "",
			"currencyId": "G001ZM0000DEFAULTCURRENCT00000000001",
			"currencyName": "人民币",
			"currencyCode": "CNY",
			"currencySymbol": "￥",
			"invoice_taxmny": "",
			"reject_reason": "",
			"transaction_type_name": "",
			"transaction_type_code": "",
			"signStatus": "0",
			"signDate": "",
			"sendErpCode": "5",
			"sendErpTime": 1630997492000,
			"hfanOrgCode": "",
			"hfanOrgName": "天海集团总公司",
			"hfanOrgId": 2063331945255168,
			"owner_id": "2090517",
			"supplier": {
				"id": 2104815576273152,
				"name": "云采测试用供应商02(yctest_gys02)修改名称",
				"code": "sup02_001"
			},
			"redMark": "",
			"primaryKey": "pu_invce100000001vil",
			"ytenantId": ""
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
201	错误信息	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


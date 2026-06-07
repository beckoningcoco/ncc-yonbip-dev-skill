---
title: "供应商销售发票详情查询"
apiId: "1935334271170904070"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Invoice"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商销售发票详情查询

>  请求方式	GET | Sales Invoice (SS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/saleinvoice/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	销售发票主表主键    示例: 1879490367641354249

## 3. 请求示例

Url: /yonbip/cpu/saleinvoice/detail?access_token=访问令牌&id=1879490367641354249

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
id	string	否	销售发票主键 示例：1879490367641354249
realTaxMny	number
小数位数:8,最大长度:20	否	实际含税金额 示例：268.5
num	number
小数位数:8,最大长度:20	否	数量 示例：1
memo	string	否	备注 示例：备注
ownerId	string	否	创建用户主键 示例：2414657
claimInvoiceTax	number
小数位数:8,最大长度:20	否	扣款税额 示例：0
realMny	number
小数位数:8,最大长度:20	否	实际无税金额 示例：268.5
pkSupplier	string	否	供应商档案主键 示例：1752058241321271298
puHfanorgId	string	否	收票组织主键 示例：1752012852082245634
bdInvoiceTypeName	string	否	发票类型 示例：增值税电子普通发票
invId	string	否	发票代码 示例：202312080003
contactAddress	string	否	供应商联系地址 示例：供应商联系地址
currencyId	string	否	币种主键 示例：1749829479690668787
invoiceImg	string	否	发票图片协同云businessId 示例：1879490367641354249
orgName	string	否	采购组织名称 示例：天海总公司
bdInvoiceTypeId	string	否	发票类型主键 示例：1
logisticsCode	string	否	物流单号 示例：3232
logisticsCompanyCode	string	否	物流公司代码 示例：DEPPON
logisticsCompany	string	否	物流公司 示例：德邦
tax	number
小数位数:8,最大长度:20	否	税额 示例：0
customerName	string	否	采购商 示例：230616日常旗舰全
pkOrg	string	否	采购组织主键 示例：1752012852082245634
sourceType	string	否	发票来源，枚举：1:对账单; 2:发货单; 示例：1
invDeliveryMethod	string	否	发票寄送方式，枚举：0:第三方物流; 1:随货送票; 2:电子发票; 示例：2
billdate	string	否	单据日期 示例：2023-12-08
pkInvoicevendor	string	否	开票供应商主键 示例：1752058241321271298
invCode	string	否	发票号码 示例：202312080003
paymentProcess	string	否	付款流程，枚举：0:应付管理; 1:费控报销; 示例：0
status	string	否	发票状态，枚举：0:待发布; 1:已发布; 2:发送ERP; 3:正在发布; 4:发布失败; 5:买方确认审核中; 6:已确认; 示例：0
code	string	否	单据编号 示例：202312080003
realTax	number
小数位数:8,最大长度:20	否	实际税额 示例：0
ownerCode	string	否	创建人编码 示例：ycpsn002
signStatus	string	否	签收状态，枚举：0:不启用; 1:未签收; 2:已签收; 3:退回; 示例：0
signDate	string	否	签收日期 示例：2023-12-08
signPersonName	string	否	签收人名称 示例：签收人
description	string	否	物流信息说明 示例：物流信息说明
contactPerson	string	否	供应商联系人 示例：供应商联系人
taxmnyDifference	number
小数位数:8,最大长度:20	否	含税金额差异 示例：-567.5
puHfanorgName	string	否	收票组织名称 示例：天海总公司
title	string	否	发票抬头 示例：亚信科技（中国）有限公司
rejectReason	string	否	驳回原因 示例：驳回原因
currencyId_name	string	否	币种名称 示例：人民币
puHfanorgCode	string	否	收票组织编码 示例：THZGS01
invoiceFile	string	否	其他附件协同云businessId 示例：invoice_other_file1879490367641354249
ownerName	string	否	创建人名称 示例：昵称-侯采购员002
orgCode	string	否	采购组织编码 示例：THZGS01
mnyDifference	number
小数位数:8,最大长度:20	否	无税金额差异 示例：-520.18
pubts	string	否	时间戳 示例：2024-02-22 16:40:43
supplierName	string	否	供应商名称 示例：实物发票供应商-云采测试供应商01
createtime	string	否	创建时间 示例：2023-12-08 10:06:06
claimInvoiceTaxMny	number
小数位数:8,最大长度:20	否	扣款含税金额 示例：0
entityInvMnyTol	number
小数位数:8,最大长度:20	否	实物发票无税金额合计 示例：788.68
currencySymbol	string	否	币种符号 示例：¥
taxmny	number
小数位数:8,最大长度:20	否	含税金额 示例：268.5
entityInvTaxTol	number
小数位数:8,最大长度:20	否	实物发票税额合计 示例：47.32
errorMsg	string	否	错误信息 示例：错误信息
taxDifference	number
小数位数:8,最大长度:20	否	税额差异 示例：-47.32
bdInvoiceTypeCode	string	否	发票类型编码 示例：1
claimInvoiceMny	number
小数位数:8,最大长度:20	否	扣款无税金额 示例：0
entityInvPricetaxTol	number
小数位数:8,最大长度:20	否	实物发票含税金额合计 示例：836
mny	number
小数位数:8,最大长度:20	否	无税金额 示例：268.5
contactPhone	string	否	供应商联系人电话 示例：供应商联系人电话
currencyCode	string	否	币种编码 示例：CNY
expectDate	string	否	预计票到日期 示例：2023-12-31
mnyTotal	number
小数位数:8,最大长度:20	否	无税金额合计 示例：268.5
taxmnyTotal	number
小数位数:8,最大长度:20	否	含税金额合计 示例：268.5
taxTotal	number
小数位数:8,最大长度:20	否	税额合计 示例：0
saleInvoiceBody	object	是	销售发票子表
claimDeductionList	object	是	销售发票索赔扣款单子表
entityInvoiceList	object	是	销售发票实物发票子表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1879490367641354249",
		"realTaxMny": 268.5,
		"num": 1,
		"memo": "备注",
		"ownerId": "2414657",
		"claimInvoiceTax": 0,
		"realMny": 268.5,
		"pkSupplier": "1752058241321271298",
		"puHfanorgId": "1752012852082245634",
		"bdInvoiceTypeName": "增值税电子普通发票",
		"invId": "202312080003",
		"contactAddress": "供应商联系地址",
		"currencyId": "1749829479690668787",
		"invoiceImg": "1879490367641354249",
		"orgName": "天海总公司",
		"bdInvoiceTypeId": "1",
		"logisticsCode": "3232",
		"logisticsCompanyCode": "DEPPON",
		"logisticsCompany": "德邦",
		"tax": 0,
		"customerName": "230616日常旗舰全",
		"pkOrg": "1752012852082245634",
		"sourceType": "1",
		"invDeliveryMethod": "2",
		"billdate": "2023-12-08",
		"pkInvoicevendor": "1752058241321271298",
		"invCode": "202312080003",
		"paymentProcess": "0",
		"status": "0",
		"code": "202312080003",
		"realTax": 0,
		"ownerCode": "ycpsn002",
		"signStatus": "0",
		"signDate": "2023-12-08",
		"signPersonName": "签收人",
		"description": "物流信息说明",
		"contactPerson": "供应商联系人",
		"taxmnyDifference": -567.5,
		"puHfanorgName": "天海总公司",
		"title": "亚信科技（中国）有限公司",
		"rejectReason": "驳回原因",
		"currencyId_name": "人民币",
		"puHfanorgCode": "THZGS01",
		"invoiceFile": "invoice_other_file1879490367641354249",
		"ownerName": "昵称-侯采购员002",
		"orgCode": "THZGS01",
		"mnyDifference": -520.18,
		"pubts": "2024-02-22 16:40:43",
		"supplierName": "实物发票供应商-云采测试供应商01",
		"createtime": "2023-12-08 10:06:06",
		"claimInvoiceTaxMny": 0,
		"entityInvMnyTol": 788.68,
		"currencySymbol": "¥",
		"taxmny": 268.5,
		"entityInvTaxTol": 47.32,
		"errorMsg": "错误信息",
		"taxDifference": -47.32,
		"bdInvoiceTypeCode": "1",
		"claimInvoiceMny": 0,
		"entityInvPricetaxTol": 836,
		"mny": 268.5,
		"contactPhone": "供应商联系人电话",
		"currencyCode": "CNY",
		"expectDate": "2023-12-31",
		"mnyTotal": 268.5,
		"taxmnyTotal": 268.5,
		"taxTotal": 0,
		"saleInvoiceBody": [
			{
				"materiaList": [
					{
						"mainNum": 1,
						"num": 1,
						"receOrg_name": "天海总公司",
						"wareName": "苹果",
						"puCheckbillMid": "1785996815181021191",
						"priceUnitName": "小时",
						"taxprice": 268.5,
						"price": 268.5,
						"sourcebillType": "45",
						"id": "1879490367641354251",
						"taxType": "0",
						"whWarrantno": "CGRK20230804000001",
						"skuId": "1752071117629030414",
						"priceUnit": "1749829522647678982",
						"purUnitName": "小时",
						"taxrate": 0,
						"mainUnit": "1749829522647678982",
						"orgName": "天海总公司",
						"checkbillMid": "1785996832360890374",
						"wareCode": "0001000002",
						"tax": 0,
						"ajustTaxmny": 0,
						"sourcebillDate": "2023-08-04",
						"mainUnitName": "小时",
						"ajustMny": 0,
						"pkOrg": "1752012852082245634",
						"sourceBillRowno": "1",
						"skuCode": "0001000002",
						"invPurExchRate": 1,
						"checkbillId": "1785996832360890373",
						"ajustTax": 0,
						"purUnitCode": "HUR",
						"receOrg": "1752012852082245634",
						"purchaseType": "0",
						"skuName": "苹果",
						"invPriceExchRate": 1,
						"orgCode": "THZGS01",
						"mainUnitCode": "HUR",
						"mnySign": "1",
						"invoiceBid": "1879490367641354250",
						"wareId": "1752071117629030401",
						"hstoName": "CK",
						"taxmny": 268.5,
						"sourcebillCode": "CGRK20230804000001",
						"mny": 268.5,
						"priceUnitCode": "HUR",
						"invoiceId": "1879490367641354249",
						"puCheckbillId": "1785996815181021190",
						"purNum": 1,
						"purUnit": "1749829522647678982",
						"invPriceExchRateNum": 1,
						"invPriceExchRateDen": 1,
						"invPurExchRateNum": 1,
						"invPurExchRateDen": 1
					}
				],
				"invoiceWareName": "苹果",
				"invoiceWareCode": "0001000002",
				"numSubtotal": 1,
				"mnySubtotal": 268.5,
				"taxmnySubtotal": 268.5,
				"taxSubtotal": 0,
				"id": "1879490367641354250"
			}
		],
		"claimDeductionList": [
			{
				"saleCheckId": "1918187189768290312",
				"expenseItemId": "1769071457164853251",
				"saleCheckCode": "SR-RKDZ2401290002",
				"supDocName": "供应商-乐园集团日常测新架构",
				"purchaseId": "1768174444670877704",
				"invoiceAmount": 88.88,
				"isShareMaterial": false,
				"expenseItemName": "清洁费",
				"purchaseOrgName": "乐园公司-总",
				"id": "1936060593077747723",
				"taxRateId": "10004",
				"taxTypeFlag": "0",
				"purchaseOrg": "1767620153367855109",
				"claimDescription": "1234",
				"currCheckAmount": 88.88,
				"puCheckClaim": "1918124921332432904",
				"receiveOrgName": "乐园公司-总",
				"invoiceRateAmount": 10.23,
				"saleCheckClaim": "1918187189768290317",
				"claimId": "3658506231779584",
				"claimTitle": "索赔扣款标题",
				"materialId": "1769070855875723264",
				"materialName": "扫地费-虚拟",
				"puCheckId": "1871465161143877638",
				"taxRate": 13,
				"supDocId": "1768178705280532482",
				"claimDate": "2024-01-29",
				"handleType": "2",
				"claimCode": "RD202401290001",
				"invoiceNoTaxAmount": 78.65,
				"receiveOrg": "1767620153367855109",
				"invoiceId": "1936060593077747717",
				"claimTotalAmount": 88.88,
				"purchaseName": "白居易",
				"priceMark": "1"
			}
		],
		"entityInvoiceList": [
			{
				"code": "011002200711",
				"invoiceTypeId": "1",
				"invoiceTypeId_code": "1",
				"invoiceTypeId_name": "增值税电子普通发票",
				"deviceNum": "661916531627",
				"selBankAccout": "中国银行股份有限公司北京中银大厦支行 340256696850",
				"number": "13381152",
				"openInvDate": "2023-02-14",
				"selTaxIdentiNum": "911103025695414934",
				"qtySubTol": 1,
				"selName": "海鸿达（北京）餐饮管理有限公司",
				"id": "1936095262070013957",
				"purTaxIdentiNum": "911101086000426500",
				"taxTol": 47.32,
				"billType": "invoice",
				"selAddrPhone": "北京市大兴区盛吉街13号院3号楼四层408室 4009107107",
				"customerName": "230616日常旗舰全",
				"taxMnyTol": 836,
				"checkCode": "44681124513217288069",
				"purName": "亚信科技（中国）有限公司",
				"invoiceId": "1879490367641354249",
				"taxSubTol": 47.32,
				"entityfile": "single1936095262070013957",
				"mnyTol": 788.68,
				"status": 1,
				"entityInvoiceBody": [
					{
						"code": "011002200711",
						"tax": 47.32,
						"entityInvId": "1936095262070013957",
						"taxmny": 836,
						"taxCode": "3070401000000000000",
						"number": "13381152",
						"rate": 0.06,
						"price": 788.67924528,
						"qty": 1,
						"prodName": "*餐饮服务*餐费",
						"mny": 788.68,
						"id": "1936095262070013958",
						"prodId": "1565689798",
						"prodCode": "H4232",
						"spec": "规格",
						"model": "型号",
						"unit": "袋"
					}
				]
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
999	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
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


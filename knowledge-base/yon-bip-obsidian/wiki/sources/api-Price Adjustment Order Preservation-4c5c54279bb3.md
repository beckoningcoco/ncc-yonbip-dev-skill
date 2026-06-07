---
title: "价格调整单保存"
apiId: "4c5c54279bb3486dba2ced21eb976c13"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格调整单保存

>  请求方式	POST | Price Adjustment (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/cpu-adjust/bill/apisave
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据分组标识
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	主表id。新增不需要填，修改时必须填，而且要填单据修改前的值，也就是填单据上次保存的id 示例：3839906679148800
organizationCode	string	否	是	组织编码 示例：A0001
organizationId	string	否	否	组织id 示例：1985588670189824
adjustPriceDepartmentCode	string	否	否	调价部门编码 示例：ztb
adjustPriceDepartmentId	string	否	否	调价部门id 示例：2155394489012480
adjustPricePersonCode	string	否	否	调价员编码：支持id或编码，id和编码只需填一个即可 示例：00000001
adjustPricePersonId	string	否	否	调价员ID：支持id或编码，id和编码只需填一个即可 示例：2155395297939968
priceFlag	long	否	是	是否含税 0：无税价格；1：含税价格； 示例：1
supplyType	long	否	是	供应类型，0：代管；1：委外；2：采购； 示例：0
vouchdate	string	否	是	调价日期 示例：2021-06-09 00:00:00
code	string	否	是	单据号 示例：TJ210609TJD000001
bustype_code	string	否	是	交易类型编码 示例：A80
bustype	string	否	否	交易类型ID 示例：1984005911646484
remark	string	否	否	备注 示例：备注
pubts	DateTime	否	否	时间戳。新增不需要填，修改时必须填，而且要填单据修改前的值，也就是填单据上次保存的时间戳 示例：2021-08-02 09:41:58
taxPriority	int	否	否	价格标识 1:无税优先 0 :含税优先 示例：0 默认值：0
businessType	long	否	是	业务类型 ，0：普通；1：VMI；2：全程委外；3：工序委外； 示例：0
bopenapi	string	否	是	是否来自openapi，必填，而且必须为true 示例：true 默认值：true
adjustpricedetail	object	是	是	调价单子表信息
applicableorganization	object	是	是	适用组织范围数据分组
_status	string	否	是	主表增删改状态标识，状态,Insert:新增;Update:修改;Delete:删除; 示例：Insert
isBegin	string	否	否	是否期初数据（1:是；0:否），默认为否 示例：1

## 3. 请求示例

Url: /yonbip/cpu/cpu-adjust/bill/apisave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "3839906679148800",
		"organizationCode": "A0001",
		"organizationId": "1985588670189824",
		"adjustPriceDepartmentCode": "ztb",
		"adjustPriceDepartmentId": "2155394489012480",
		"adjustPricePersonCode": "00000001",
		"adjustPricePersonId": "2155395297939968",
		"priceFlag": 1,
		"supplyType": 0,
		"vouchdate": "2021-06-09 00:00:00",
		"code": "TJ210609TJD000001",
		"bustype_code": "A80",
		"bustype": "1984005911646484",
		"remark": "备注",
		"pubts": "2021-08-02 09:41:58",
		"taxPriority": 0,
		"businessType": 0,
		"bopenapi": "true",
		"adjustpricedetail": [
			{
				"id": "3839906679148800",
				"pubts": "2021-08-02 09:41:58",
				"vendorCode": "A10",
				"vendorId": 2050792493420800,
				"productUnitCode": "A11",
				"productUnitId": 1985594750636288,
				"currency_code": "CNY",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000004",
				"taxRateCode": "VATR1",
				"taxRateId": "2247243306275072",
				"productCode": "A111",
				"product": 2145425640739072,
				"oriUnitPrice": 87.611,
				"taxRate": 13,
				"productskuCode": "SKU0001",
				"productsku": 2145425650274560,
				"quantityStart": 5,
				"oriTaxUnitPrice": 99,
				"effectiveDate": "2021-03-01 00:00:00",
				"_status": "Insert",
				"quantityEnd": 100,
				"oriTaxUnitPriceOriginal": 111,
				"oriUnitPriceOriginal": 98.231,
				"expiryDate": "2021-06-25 00:00:00",
				"discountRate": 13,
				"discountTaxType": "0",
				"operationId": "45635436563",
				"operationCode": "LS092",
				"priceScheme": "FA072401",
				"dBillDate": "2021-06-25 00:00:00"
			}
		],
		"applicableorganization": [
			{
				"id": "2294170546491640",
				"pubts": "2021-08-02 09:41:58",
				"organizationCode": "A000001",
				"organizationId": "1985588670189824",
				"_status": "Insert"
			}
		],
		"_status": "Insert",
		"isBegin": "1"
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
count	number
小数位数:0,最大长度:10	否	count 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	string	是	messages
infos	object	是	infos
failInfos	string	是	failInfos

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "TJTJ241212241212000005",
				"taxPriority": 0,
				"bopenapi": "true",
				"organizationId__transferValue": true,
				"priceFlag": 0,
				"organizationId": "1917641204945649665",
				"vouchdate": "2024-12-12 00:00:00",
				"supplyType": 0,
				"bustype__transferValue": true,
				"id": 2154865288206614535,
				"pubts": "2024-12-13 11:08:57",
				"bustype_code": "A80",
				"bustype": "1916745652704380078",
				"organizationCode": "zb",
				"businessType": 0,
				"creatorId": 1916745094376980485,
				"creator": "默认用户",
				"createTime": "2024-12-13 11:08:57",
				"createDate": "2024-12-13 11:08:57",
				"status": 0,
				"isWfControlled": true,
				"adjustpricedetail": [
					{
						"vendorId": 1936128840132722695,
						"vendorCode": "0000000003",
						"currency__transferValue": true,
						"id": 2154865288206614537,
						"taxRateId": "10004",
						"productUnitId__transferValue": true,
						"oriUnitPrice": 58.407,
						"priceDigit": 3,
						"currencyEnable": 1,
						"taxRate": 13,
						"adjustPriceId": 2154865288206614535,
						"quantityStart": 0,
						"oriTaxUnitPrice": 66,
						"discountTaxType": "0",
						"productUnitEnable": false,
						"priceRount": 4,
						"currency_code": "CNY",
						"productUnitId": 1917650318858387463,
						"currency": "1916745738603724840",
						"pubts": "2024-12-13 11:08:57",
						"product__transferValue": true,
						"product": 2048900963190177797,
						"productUnitCode": "KGM",
						"productCode": "0002000018",
						"vendorId__transferValue": true,
						"effectiveDate": "2024-12-12 00:00:00",
						"ytenant": "0000LRVPV7SW7YSA3W0000",
						"dBillDate": "2024-12-13 11:08:57",
						"productModelDescription": "规格",
						"productModel": "型号"
					}
				],
				"applicableorganization": [
					{
						"organizationId": "1917641204945649665",
						"adjustPriceId": 2154865288206614535,
						"organizationId__transferValue": true,
						"organizationCode": "zb",
						"id": 2154865288206614536,
						"pubts": "2024-12-13 11:08:57",
						"ytenant": "0000LRVPV7SW7YSA3W0000"
					}
				],
				"verifystate": 0,
				"ytenant": "0000LRVPV7SW7YSA3W0000",
				"isBegin": "1"
			}
		],
		"failInfos": [
			""
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
999	message	按照提示处理

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


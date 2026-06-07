---
title: "付款单批量更新"
apiId: "1950951124443332611"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款单批量更新

> `ContentType	application/json` 请求方式	POST | 分类: Payment Document (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/payment/batchupdate

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 付款单数据 |
| id | string | 否 | 是 | 主表id 示例：1960387451058913285 |
| extSystemCode | string | 否 | 否 | 外部系统编码 示例：NC65_UPGRADE |
| oriTaxExcludedAmount | number |
| 小数位数:8,最大长度:18 | 否 | 是 | 原币无税金额 示例：100 |
| oriTaxIncludedAmount | number |
| 小数位数:8,最大长度:18 | 否 | 是 | 原币含税金额 示例：100 |
| localTaxExcludedAmount | number |
| 小数位数:8,最大长度:18 | 否 | 是 | 本币无税金额 示例：100 |
| localTaxIncludedAmount | number |
| 小数位数:8,最大长度:18 | 否 | 是 | 本币含税金额 示例：100 |
| extVouchCode | string | 否 | 否 | 外部系统单号 示例：1856781913489410563 |
| code | string | 否 | 是 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：ap230317012217 |
| financeOrg | string | 否 | 否 | 付款组织id (付款组织id和付款组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1544896420846764040 |
| financeOrgCode | string | 否 | 否 | 付款组织编码 (付款组织id和付款组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1001012 |
| billDate | string | 否 | 是 | 单据日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| bustype | string | 否 | 否 | 交易类型id (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：1514492098255520719 |
| bustypeCode | string | 否 | 否 | 交易类型编码 (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：ap_paypurc |
| org | string | 否 | 否 | 业务组织id (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1544896420846764040 |
| orgCode | string | 否 | 否 | 业务组织编码 (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：44 |
| oriCurrency | string | 否 | 否 | 币种id (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：1514492081064640537 |
| oriCurrencyCode | string | 否 | 否 | 币种简称 (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：CNY |
| objectType | string | 否 | 是 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：ZJDX230511000023 |
| funder | string | 否 | 否 | 资金业务对象id (往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：222 |
| supplier | string | 否 | 否 | 供应商id (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：1570200967882211330 |
| supplierCode | string | 否 | 否 | 供应商编码 (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：0001000111 |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：1471440935115030536 |
| employeeCode | string | 否 | 否 | 员工编码 (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：00000002 |
| exchangeRateType | string | 否 | 否 | 汇率类型 示例：0000L6D9B8DDEQ7W2Z0000 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型编码 示例：01 |
| exchangeRate | Decimal | 否 | 是 | 汇率 示例：1 |
| exchangeRateDate | string | 否 | 否 | 汇率日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| settleMode | string | 否 | 否 | 结算方式id 示例：1536752888049568089 |
| settleModeCode | string | 否 | 否 | 结算方式编码 示例：system_0001 |
| funderBankAccount | string | 否 | 否 | 资金业务对象银行账户id 示例：2222 |
| funderBankAccount_no | string | 否 | 否 | 资金业务对象银行账号 示例：1514492081064640549 |
| enterpriseBankAccount | string | 否 | 否 | 企业银行账户id 示例：1552266344270397446 |
| enterpriseBankAccountNo | string | 否 | 否 | 企业银行账号 示例：11 |
| enterpriseCashAccount | string | 否 | 否 | 企业现金账户id 示例：1552266344270397446 |
| enterpriseCashAccountNo | string | 否 | 否 | 企业现金账号 示例：34 |
| supplierBankAccount | string | 否 | 否 | 供应商银行账户id 示例：1547303019945656322 |
| supplierBankAccountNo | string | 否 | 否 | 供应商银行账号 示例：789 |
| employeeBankAccount | string | 否 | 否 | 员工银行账户id 示例：1577744141747486723 |
| employeeBankAccountNo | string | 否 | 否 | 员工银行账号 示例：5566 |
| dept | string | 否 | 否 | 部门id 示例：1551794533528764418 |
| deptCode | string | 否 | 否 | 部门编码 示例：SS2 |
| staff | string | 否 | 否 | 业务员id 示例：1577862450987401221 |
| staffCode | string | 否 | 否 | 业务员编码 示例：009 |
| projectCode | string | 否 | 否 | 项目编码 示例：667 |
| project | string | 否 | 否 | 项目id 示例：1541277369785909249 |
| retailer | string | 否 | 否 | 散户名称 示例：小散户 |
| _status | string | 否 | 是 | update 示例：Update |
| remarks | string | 否 | 否 | 备注 示例：表头备注 |
| bodyItem | object | 是 | 是 | 表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/payment/batchupdate?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1960387451058913285",
			"extSystemCode": "NC65_UPGRADE",
			"oriTaxExcludedAmount": 100,
			"oriTaxIncludedAmount": 100,
			"localTaxExcludedAmount": 100,
			"localTaxIncludedAmount": 100,
			"extVouchCode": "1856781913489410563",
			"code": "ap230317012217",
			"financeOrg": "1544896420846764040",
			"financeOrgCode": "1001012",
			"billDate": "2022-10-24 00:00:00",
			"bustype": "1514492098255520719",
			"bustypeCode": "ap_paypurc",
			"org": "1544896420846764040",
			"orgCode": "44",
			"oriCurrency": "1514492081064640537",
			"oriCurrencyCode": "CNY",
			"objectType": "0",
			"funder_code": "ZJDX230511000023",
			"funder": "222",
			"supplier": "1570200967882211330",
			"supplierCode": "0001000111",
			"employee": "1471440935115030536",
			"employeeCode": "00000002",
			"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
			"exchangeRateTypeCode": "01",
			"exchangeRate": 1,
			"exchangeRateDate": "2022-10-24 00:00:00",
			"settleMode": "1536752888049568089",
			"settleModeCode": "system_0001",
			"funderBankAccount": "2222",
			"funderBankAccount_no": "1514492081064640549",
			"enterpriseBankAccount": "1552266344270397446",
			"enterpriseBankAccountNo": "11",
			"enterpriseCashAccount": "1552266344270397446",
			"enterpriseCashAccountNo": "34",
			"supplierBankAccount": "1547303019945656322",
			"supplierBankAccountNo": "789",
			"employeeBankAccount": "1577744141747486723",
			"employeeBankAccountNo": "5566",
			"dept": "1551794533528764418",
			"deptCode": "SS2",
			"staff": "1577862450987401221",
			"staffCode": "009",
			"projectCode": "667",
			"project": "1541277369785909249",
			"retailer": "小散户",
			"_status": "Update",
			"remarks": "表头备注",
			"bodyItem": [
				{
					"funder_code": "ZJDX230511000023",
					"funder": "1514492098231927563",
					"funderBankAccount": "1514492081064640549",
					"funderBankAccount_no": "222",
					"oriTaxExcludedAmount": 30,
					"objectType": "0",
					"oriCurrency": "1514492081064640537",
					"quickTypeCode": "6",
					"quickType": "1514492089653002546",
					"supplier": "1570200967882211330",
					"supplierCode": "0001000111",
					"employee": "1668901369000047910",
					"employeeCode": "em008",
					"employeeBankAccount": "1577744141747486723",
					"employeeBankAccountNo": "5566",
					"dept": "1551794533528764418",
					"deptCode": "SS2",
					"settleMode": "1536752888049568089",
					"settleModeCode": "567",
					"supplierBankAccount": "1547303019945656322",
					"supplierBankAccountNo": "456",
					"staff": "1577862450987401221",
					"staffCode": "6878",
					"enterpriseBankAccount": "1552266344270397446",
					"enterpriseBankAccountNo": "678",
					"enterpriseCashAccount": "1668901369499997910",
					"enterpriseCashAccountNo": "788",
					"project": "1541277369785909249",
					"projectCode": "002",
					"issueNo": 1,
					"oriTaxAmount": 0,
					"exchangeRate": 1,
					"orgCode": "44",
					"expireDate": "2022-10-24 00:00:00",
					"oriTaxIncludedAmount": 30,
					"org": "1544896420846764040",
					"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
					"exchangeRateDate": "2022-10-24 00:00:00",
					"oriCurrencyCode": "CNY",
					"exchangeRateTypeCode": "01",
					"extRowNo": "",
					"expenseItem": "1668900009457147910",
					"expenseItemCode": "ex999",
					"material": "1668908889457147910",
					"id": "1960387451058913286",
					"materialCode": "m555",
					"_status": "Update",
					"retailer": "小散户",
					"costCenter": "1489141053783015433",
					"supplierProCenter": "1472203515145748480",
					"demanderProCenter": "1473541844244103169",
					"noteNo": "1468336506962182285",
					"noteType": "1468336086076358677",
					"localTaxIncludedAmount": 20,
					"localTaxAmount": 0,
					"localTaxExcludedAmount": 20,
					"contractNo": "htbh002",
					"orderNo": "dd002",
					"invoiceNo": "fpbh002",
					"blnSettlePatch": false
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 业务状态信息 |
| infos | object | 是 | 业务数据 |

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
				"partner_code": "000023",
				"partner": "1664394763341660162",
				"partner_name": "业务伙伴-北京",
				"extSystemCode": "AB1234",
				"funderBankAccount_no": "44444567",
				"funderBankAccount": "1723022054772441095",
				"funder": "1723023935968116743",
				"extVouchCode": "AB1234",
				"funder_code": "ZJDX230511000025",
				"busiObj": "payment",
				"oriCurrency": "1514492081064640537",
				"financeOrg": "1544896420846764040",
				"settleState": "0",
				"oriOccupyAmount": 0,
				"objectType": "0",
				"exchangeRate": 1,
				"supplier": "1570200967882211330",
				"orgCurrency": "1514492081064640537",
				"settleMode": "1536752888049568089",
				"enterpriseBankAccount": "1552266344270397446",
				"supplierBankAccount": "1547303019945656322",
				"enterpriseCashAccount": "1567923991131193348",
				"employeeBankAccount": "1577744141747486723",
				"dept": "1551794533528764418",
				"staff": "1577862450987401221",
				"project": "1541277369785909249",
				"id": "1575441987716775942",
				"localTaxIncludedAmount": 30,
				"bodyItem": [
					{
						"partner_code": "000023",
						"partner": "1664394763341660162",
						"partner_name": "业务伙伴-北京",
						"funderBankAccount_no": "44444567",
						"funderBankAccount": "1723022054772441095",
						"funder": "1723023935968116743",
						"funder_code": "ZJDX230511000025",
						"project": "1541277369785909249",
						"staff": "1577862450987401221",
						"dept": "1551794533528764418",
						"oriCurrency": "1514492081064640537",
						"employeeBankAccount": "1577744141747486723",
						"enterpriseCashAccount": "1567923991131193348",
						"supplierBankAccount": "1547303019945656322",
						"enterpriseBankAccount": "1552266344270397446",
						"settleMode": "1536752888049568089",
						"quickTypeCode": "6",
						"settleState": "0",
						"oriOccupyAmount": 0,
						"headerId": "1575441987716775942",
						"objectType": "0",
						"exchangeRate": 1,
						"supplier": "1570200967882211330",
						"material": "1544997490009833473",
						"expenseItem": "1550998530002780169",
						"orgCurrency": "1514492081064640537",
						"id": "1575441987716775943",
						"localTaxIncludedAmount": 30,
						"_status": 0,
						"localTaxAmount": 0,
						"oriTaxExcludedAmount": 30,
						"quickType": "1514492089653002546",
						"extRowNo": "AB1234",
						"oriTaxAmount": 0,
						"expireDate": "2022-10-24 00:00:00",
						"pubts": "2022-10-24 17:59:46",
						"oriTaxIncludedAmount": 30,
						"org": "1544896420846764040",
						"exchangeRateType": "1514492081064642674",
						"exchangeRateDate": "2022-10-24 00:00:00",
						"createTime": "2022-10-24 17:59:46",
						"localTaxExcludedAmount": 30,
						"verifyState": 0
					}
				],
				"billDate": "2022-10-24 00:00:00",
				"srcApp": "94",
				"_status": 0,
				"verifyState": 0,
				"blnWriteOff": false,
				"settleSubmitType": "1",
				"srcSystem": "2",
				"status": "0",
				"code": "PAYap221024000632",
				"writeOffState": "0",
				"postStatus": "0",
				"cBillNo": "payment",
				"oriTaxExcludedAmount": 30,
				"effectState": "0",
				"pubts": "2022-10-24 17:59:46",
				"oriTaxIncludedAmount": 30,
				"org": "1544896420846764040",
				"billType": "2614249315406336",
				"bustype": "1514492098255520719",
				"exchangeRateType": "1514492081064642674",
				"exchangeRateDate": "2022-10-24 00:00:00",
				"createTime": "2022-10-24 17:59:46",
				"localTaxExcludedAmount": 30,
				"businessType": "4",
				"data": {
					"sourceUnique": "1858115999048400885",
					"targetUnique": "1858115999048400905"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	付款组织不允许为空!	请求参数中输入付款组织id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-05

更新

返回参数 (107)

重新发布


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


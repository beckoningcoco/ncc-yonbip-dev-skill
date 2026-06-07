---
title: "期初收款保存"
apiId: "1835924865095303168"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Collection"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初收款保存

> `ContentType	application/json` 请求方式	POST | 分类: Opening Collection (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fiear_collection_init/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 期初收款数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| financeOrg | string | 否 | 否 | 会计主体ID，会计主体ID和会计主体编码不能同时为空，ID和编码同时存在，以ID为准 示例：1812935142113017863 |
| financeOrg_code | string | 否 | 否 | 会计主体编码，会计主体ID和会计主体编码不能同时为空，ID和编码同时存在，以ID为准 示例：0909 |
| accDate | string | 否 | 是 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-06-30 00:00:00 |
| srcBillDate | string | 否 | 是 | 来源单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-06-30 00:00:00 |
| org | string | 否 | 否 | 业务组织ID 示例：1812935142113017863 |
| org_code | string | 否 | 否 | 业务组织编码 示例：0909 |
| objectType | string | 否 | 是 | 往来对象类型(枚举值 1：客户；2：员工；3：资金业务对象；） 示例：1 |
| customer | long | 否 | 否 | 客户ID(往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1814440459455954944 |
| customer_code | string | 否 | 否 | 客户编码 (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：chhs01 |
| employee | string | 否 | 否 | 员工ID(往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1834382868756299785 |
| employee_code | string | 否 | 否 | 员工编码(往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：00000077 |
| funder | string | 否 | 否 | 资金业务对象ID(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1757765857707032579 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：ZJDX230627000002 |
| partner | string | 否 | 否 | 业务伙伴ID 示例：1592493823945080836 |
| partner_code | string | 否 | 否 | 业务伙伴编码 示例：000001 |
| oriCurrency | string | 否 | 否 | 币种ID，币种ID和币种编码不能同时为空，ID和编码同时存在，以ID为准 示例：1580569439952699425 |
| oriCurrency_code | string | 否 | 否 | 币种编码，币种ID和币种编码不能同时为空，ID和编码同时存在，以ID为准 示例：CNY |
| remarks | string | 否 | 否 | 表头备注 示例：备注12 |
| bodyItem | object | 是 | 是 | 表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/fiear_collection_init/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"financeOrg": "1812935142113017863",
		"financeOrg_code": "0909",
		"accDate": "2023-06-30 00:00:00",
		"srcBillDate": "2023-06-30 00:00:00",
		"org": "1812935142113017863",
		"org_code": "0909",
		"objectType": "1",
		"customer": 1814440459455954944,
		"customer_code": "chhs01",
		"employee": "1834382868756299785",
		"employee_code": "00000077",
		"funder": "1757765857707032579",
		"funder_code": "ZJDX230627000002",
		"partner": "1592493823945080836",
		"partner_code": "000001",
		"oriCurrency": "1580569439952699425",
		"oriCurrency_code": "CNY",
		"remarks": "备注12",
		"bodyItem": [
			{
				"quickType": 1580569448542110004,
				"quickTypeCode": "2",
				"blnPrepare": 0,
				"oriCurrency": "1580569439952699425",
				"oriCurrency_code": "CNY",
				"expenseItem": 1659082902409838596,
				"expenseItem_code": "YF",
				"settleMode": "1691202935474880529",
				"settleMode_code": "01",
				"staff": "12491565687848",
				"staff_code": "02",
				"accExchangeRateType": "1580569448542633986",
				"accExchangeRateType_code": "02",
				"accExchangeRate": 1,
				"expireDate": "2023-06-30 00:00:00",
				"oriTaxIncludedAmount": 90,
				"accTaxIncludedAmount": 90,
				"orgTaxIncludedAmount": 0,
				"grpTaxIncludedAmount": 0,
				"gblTaxIncludedAmount": 0,
				"exchangeRateDate": "2023-06-30 00:00:00",
				"material": 1814953364432093192,
				"material_code": "561405",
				"enterpriseCashAccount": "5481556651",
				"remarks": "备注12",
				"dept": "1818042519668129796",
				"dept_code": "er",
				"project": "1815140547702554913",
				"project_code": "00000031",
				"accExchangeRateOps": "1",
				"orgExchangeRateOps": "1",
				"grpExchangeRateOps": "1",
				"gblExchangeRateOps": "1",
				"arSubjectVid": "1814206727330463756",
				"arSubjectVid_code": "1002",
				"orderNo": "123",
				"oriOcupyAmount": 1,
				"customerBankAccount": 56415481518,
				"customerBankAccount_no": "841599626484",
				"enterpriseBankAccount": "845616491984",
				"enterpriseBankAccount_no": "8749161988",
				"employeeBankAccount": "8416488511978",
				"employeeBankAccount_no": "894514949",
				"funderBankAccount": "78945198949515",
				"funderBankAccount_no": "49198492694941",
				"objectBankAccountNo": "8974981494949",
				"rowNo": 10,
				"orgExchangeRateType": "113114141",
				"orgExchangeRate": 1,
				"grpExchangeRateType": "1312232131",
				"grpExchangeRate": 1,
				"gblExchangeRateType": "23131231",
				"gblExchangeRate": "1",
				"contractNo": "1232131",
				"costCenter": "1587256454918176775",
				"costCenter_code": "111",
				"proCenter": "231312",
				"proCenter_code": "231321",
				"oppProCenter": "1581880753585127430",
				"oppProCenter_code": "HL+BZ+JD01"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 是 | 返回期初收款数据 |
| oriCurrency | string | 否 | 币种ID 示例：1580569439952699425 |
| accCurrency | string | 否 | 本币ID 示例：1580569439952699425 |
| financeOrg | string | 否 | 会计主体 示例：1812935142113017863 |
| settleState | string | 否 | 结算状态(0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；) 示例：2 |
| oriOcupyAmount | BigDecimal | 否 | 预占用金额 示例：0 |
| objectType | string | 否 | 往来对象类型(枚举值 1：客户；2：员工；3：资金业务对象；） 示例：1 |
| oriAmount | BigDecimal | 否 | 收款金额 示例：90 |
| accAmount | BigDecimal | 否 | 本币金额 示例：90 |
| modifyTime | string | 否 | 修改时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-12 19:12:59 |
| accYear | long | 否 | 会计年度ID 示例：1582788383257657347 |
| accYearCode | string | 否 | 会计年度编码 示例：2023 |
| srcBillDate | string | 否 | 来源单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-06-30 00:00:00 |
| id | string | 否 | 期初收款ID 示例：1837194758079905800 |
| eventType | string | 否 | 会计事务类型ID 示例：1436623525031968768 |
| accPurpose | string | 否 | 核算目的ID 示例：1580569448542109991 |
| oriBalance | BigDecimal | 否 | 余额 示例：90 |
| srcSystem | string | 否 | 来源系统ID 示例：2 |
| status | string | 否 | 事务状态(枚举值 0: 未审核； 1: 已审核) 示例：0 |
| blnEffect | string | 否 | 生效状态(枚举值 0：未生效；1：已生效) 示例：0 |
| code | string | 否 | 会计事务编码 示例：AR03230630000126 |
| accPeriod | long | 否 | 会计期间ID 示例：1582788383257657354 |
| accPeriodCode | string | 否 | 会计期间编码 示例：2023-07 |
| srcBillCode | string | 否 | 来源单据编号 示例：AR03230630000126 |
| bizBillCode | string | 否 | 业务单据编号 示例：AR03230630000126 |
| arapEventType | string | 否 | 会计事务 示例：106 |
| balanceState | string | 否 | 清账标识( 枚举值 0：未清账；1：已清账；2：部分清账；) 示例：0 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-06-30 00:00:00 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-12 10:26:59 |
| accBalance | BigDecimal | 否 | 本币余额 示例：90 |
| remarks | string | 否 | 备注 示例：备注12 |
| accBook | string | 否 | 财务账簿ID 示例：1814181773554221071 |
| srcApp | string | 否 | 来源应用ID 示例：95 |
| customer | string | 否 | 客户ID 示例：1814440459455954944 |
| org | string | 否 | 业务组织ID 示例：1812935142113017863 |
| creator | string | 否 | 创建人ID 示例：85e2cdaa-9f61-4606-b1ff-566eb8367340 |
| bodyItem | object | 是 | 表体数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"oriCurrency": "1580569439952699425",
			"accCurrency": "1580569439952699425",
			"financeOrg": "1812935142113017863",
			"settleState": "2",
			"oriOcupyAmount": 0,
			"objectType": "1",
			"oriAmount": 90,
			"accAmount": 90,
			"modifyTime": "2023-10-12 19:12:59",
			"accYear": 1582788383257657347,
			"accYearCode": "2023",
			"srcBillDate": "2023-06-30 00:00:00",
			"id": "1837194758079905800",
			"eventType": "1436623525031968768",
			"accPurpose": "1580569448542109991",
			"oriBalance": 90,
			"srcSystem": "2",
			"status": "0",
			"blnEffect": "0",
			"code": "AR03230630000126",
			"accPeriod": 1582788383257657354,
			"accPeriodCode": "2023-07",
			"srcBillCode": "AR03230630000126",
			"bizBillCode": "AR03230630000126",
			"arapEventType": "106",
			"balanceState": "0",
			"accDate": "2023-06-30 00:00:00",
			"createTime": "2023-10-12 10:26:59",
			"accBalance": 90,
			"remarks": "备注12",
			"accBook": "1814181773554221071",
			"srcApp": "95",
			"customer": "1814440459455954944",
			"org": "1812935142113017863",
			"creator": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
			"bodyItem": [
				{
					"quickType": "1580569448542110004",
					"quickTypeCode": "2",
					"settleState": "2",
					"oriOcupyAmount": 0,
					"id": "1837194758079905802",
					"rowNo": 10,
					"accExchangeRate": 1,
					"accTaxIncludedAmount": 90,
					"expireDate": "2023-06-30 00:00:00",
					"exchangeRateDate": "2023-06-30 00:00:00",
					"accBalance": 90,
					"modifyTime": "2023-10-12 19:12:59",
					"orderNo": "123",
					"arSubjectVid": "1814206727330463756",
					"arSubjectVid_code": "112201",
					"oriGrandsonId": "1837194758079905802",
					"oriBalance": 90,
					"settleMode": "1691202935474880529",
					"oriTaxIncludedAmount": 90,
					"remarks": "备注12",
					"dept": "1818042519668129796",
					"dept_code": "er",
					"expenseItem": "1659082902409838596",
					"expenseItem_code": "YF",
					"project_code": "00000031",
					"project": "1815140547702554913",
					"oriCurrency": "1580569439952699425",
					"oriCurrency_code": "CNY",
					"material": "1814953364432093192",
					"material_code": "561405",
					"eventId": "1837194758079905800",
					"accExchangeRateType": "1580569448542633986",
					"accExchangeRateType_code": "02",
					"blnPrepare": 0,
					"customerBankAccount": "56415481518",
					"customerBankAccount_no": "841599626484",
					"enterpriseBankAccount": "845616491984",
					"enterpriseBankAccount_no": "8749161988",
					"employeeBankAccount": "8416488511978",
					"employeeBankAccount_no": "894514949",
					"funderBankAccount": "78945198949515",
					"funderBankAccount_no": "49198492694941",
					"objectBankAccountNo": "8974981494949"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空!	请求参数中输入有效的会计主体id或编码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-11

更新

请求说明

新增

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


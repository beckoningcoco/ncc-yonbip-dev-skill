---
title: "期初应付详情查询"
apiId: "1835907040990986240"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Opening A/P"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening A/P]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初应付详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Opening A/P (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openningapsureevent/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 事务主表id    示例: 1572409517496336389 |

## 3. 请求示例

Url: /yonbip/EFI/openningapsureevent/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回期初应付数据 |
| oriCurrency | string | 否 | 原币币种ID 示例：1625145024310673435 |
| accConvertParam | string | 否 | 账簿币折算参数(枚举值 1:按原币折算) 示例：1 |
| financeOrg | string | 否 | 会计主体ID 示例：1705972022454517762 |
| srcBillId | string | 否 | 来源单据ID 示例：1705972022454517755 |
| gblCurrency | string | 否 | 全局币ID 示例：1625145024310673435 |
| voucher | string | 否 | 总账凭证ID 示例：~ |
| objectType | string | 否 | 往来对象类型(枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| srcTradeType_code | string | 否 | 来源交易类型编码 示例：cdss |
| accAmount | BigDecimal | 否 | 本币含税金额 示例：5 |
| gblBalance | BigDecimal | 否 | 全局币余额 示例：5 |
| srcBillType_code | string | 否 | 来源单据类型编码 示例：852 |
| supplier | string | 否 | 供应商ID 示例：1734183678338662404 |
| funder_code | string | 否 | 资金业务对象编码 示例：8852 |
| srcBillDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| srcBillType | string | 否 | 来源单据类型ID 示例：1734183678338662458 |
| srcTradeType | string | 否 | 来源交易类型ID 示例：173418337838562458 |
| employee_code | string | 否 | 员工编码 示例：dda |
| auditTime | string | 否 | 审核时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-30 00:00:00 |
| accCurrency | string | 否 | 本币币种ID 示例：1625145024310673435 |
| orgCurrency | string | 否 | 组织币ID 示例：1625145024310673435 |
| modifyTime | string | 否 | 修改时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-30 00:00:00 |
| employee | string | 否 | 员工ID 示例：8886477222215757317 |
| entryCode | string | 否 | 事项分录编码 示例：~ |
| funder | string | 否 | 资金业务对象ID 示例：1836477222215757317 |
| id | string | 否 | 事务ID 示例：1836477275215757317 |
| grpConvertParam | string | 否 | 集团币折算参数(枚举值 1:按原币折算；2:按组织币折算；3:按账簿币折算) 示例：1 |
| accPurpose_code | string | 否 | 核算目的编码 示例：01 |
| oriAmount | BigDecimal | 否 | 含税金额 示例：5 |
| bodyItem | object | 是 | 表体数据 |
| eventType | string | 否 | 会计事务类型ID 示例：2738951103406848 |
| srcApp | string | 否 | 来源应用(枚举值 94:应付管理; 102:现金管理; 123:项目采购; 125:采购管理; 127:库存管理; 130:委外管理; 132:供应链费用; 145:合同中心) 示例：94 |
| accPurpose | string | 否 | 核算目的ID 示例：1625145032916860933 |
| gblConvertParam | string | 否 | 全局币折算参数(枚举值 1:按原币折算；2:按组织币折算；3:按账簿币折算) 示例：3 |
| entry | string | 否 | 事项分录 示例：~ |
| orgBalance | BigDecimal | 否 | 组织币余额 示例：5 |
| accBook | string | 否 | 财务账簿ID 示例：1705984056939773967 |
| oriCurrency_code | string | 否 | 币种简称 示例：CNY |
| financeOrg_code | string | 否 | 会计主体编码 示例：01 |
| grpAmount | BigDecimal | 否 | 集团币金额 示例：1.786 |
| oriBalance | BigDecimal | 否 | 余额 示例：5 |
| grpBalance | BigDecimal | 否 | 集团币余额 示例：1.786 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理; 8:内部交易; 9:B2C订单中心; 10:营销管理) 示例：1 |
| supplier_code | string | 否 | 供应商编码 示例：0001000049 |
| org_code | string | 否 | 业务组织编码 示例：01 |
| status | string | 否 | 事务状态(枚举值 0:未审核；1:已审核) 示例：0 |
| blnEffect | string | 否 | 生效状态(枚举值 0:未生效；1:已生效) 示例：0 |
| accBook_code | string | 否 | 财务账簿编码 示例：收付组织 |
| code | string | 否 | 会计事务编号 示例：AP02220930000001 |
| writeOffState | string | 否 | 冲销状态(枚举值 0:未冲销；1:已冲销；2:部分冲销) 示例：0 |
| orgCurrency_moneyDigit | int | 否 | 组织币金额精度 示例：2 |
| accPeriodCode | string | 否 | 会计期间 示例：2022-10 |
| gblAmount | BigDecimal | 否 | 全局币金额 示例：5 |
| srcBillCode | string | 否 | 来源单据号 示例：AP02220930000001 |
| grpCurrency | string | 否 | 集团币ID 示例：1625145024310673438 |
| orgConvertParam | string | 否 | 组织币折算参数(枚举值 1:按原币折算；3:按账簿币折算) 示例：1 |
| gblCurrency_moneyDigit | int | 否 | 全局币金额精度 示例：2 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-11 11:14:54 |
| org_name | string | 否 | 业务组织 示例：收付组织 |
| oriCurrency_moneyDigit | int | 否 | 原币金额精度 示例：2 |
| voucherCode | string | 否 | 总账凭证号 示例：~ |
| creator | string | 否 | 制单人ID 示例：9e5d1e20-1b6d-46b5-a6bc-ad3902036ed7 |
| bizBillCode | string | 否 | 单据编号 示例：AP02220930000001 |
| org | string | 否 | 业务组织ID 示例：1705972022454517762 |
| voucherType | string | 否 | 凭证类型ID 示例：~ |
| arapEventType | string | 否 | 会计事务 示例：303 |
| postState | string | 否 | 过账状态(枚举值 0:未过账；1:过账中；2:过账成功；3:过账失败；4:不过账) 示例：0 |
| balanceState | string | 否 | 本币清账状态(枚举值 0:未清账；1:已清账；2:部分清账) 示例：0 |
| accCurrency_moneyDigit | int | 否 | 本币金额精度 示例：2 |
| orgAmount | BigDecimal | 否 | 组织币金额 示例：5 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| accPeriod | string | 否 | 会计期间ID 示例：1625145041506795548 |
| grpCurrency_moneyDigit | int | 否 | 集团币金额精度 示例：3 |
| oriCurrency_priceDigit | int | 否 | 原币单价精度 示例：4 |
| partner | string | 否 | 业务伙伴ID 示例：1734184236681789442 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-11 11:07:04 |
| accBalance | BigDecimal | 否 | 本币余额 示例：5 |
| localBalanceState | string | 否 | 本币清账状态(枚举值 0:未清账；1:已清账；2:部分清账) 示例：0 |
| accCurrency_priceDigit | int | 否 | 本币单位精度 示例：4 |
| remarks | string | 否 | 备注 示例：备注信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1625145024310673435",
		"accConvertParam": "1",
		"financeOrg": "1705972022454517762",
		"srcBillId": "1705972022454517755",
		"gblCurrency": "1625145024310673435",
		"voucher": "~",
		"objectType": "0",
		"srcTradeType_code": "cdss",
		"accAmount": 5,
		"gblBalance": 5,
		"srcBillType_code": "852",
		"supplier": "1734183678338662404",
		"funder_code": "8852",
		"srcBillDate": "2022-09-30 00:00:00",
		"srcBillType": "1734183678338662458",
		"srcTradeType": "173418337838562458",
		"employee_code": "dda",
		"auditTime": "2022-10-30 00:00:00",
		"accCurrency": "1625145024310673435",
		"orgCurrency": "1625145024310673435",
		"modifyTime": "2022-10-30 00:00:00",
		"employee": "8886477222215757317",
		"entryCode": "~",
		"funder": "1836477222215757317",
		"id": "1836477275215757317",
		"grpConvertParam": "1",
		"accPurpose_code": "01",
		"oriAmount": 5,
		"bodyItem": [
			{
				"dept_code": "部门02",
				"orgExchangeRateType": "1705981196498370567",
				"grpExchangeRateType_code": "SF02",
				"oriCurrency": "1625145024310673435",
				"orgExchangeRate": 1,
				"oppProCenter_code": "global00",
				"oriOcupyAmount": 0,
				"project": "1722967551648465041",
				"srcBillNo": "fph0001",
				"orgExchangeRateType_code": "SF01",
				"gblTaxExcludedAmount": 5,
				"gblBalance": 5,
				"invoiceType": "0",
				"unit_code": "001",
				"accTaxAmount": 0,
				"id": "1836477275215757320",
				"invoiceNo": "fph0001",
				"gblTaxAmount": 0,
				"accExchangeRateType_code": "SF01",
				"accTaxExcludedPrice": 2.5,
				"orderNo": "ytdjh001",
				"taxSubject": "10002",
				"grpExchangeRateType": "1705981531508441095",
				"gblExchangeRateType_code": "01",
				"project_code": "00000010",
				"payAgreement_code": "00000001",
				"grandsonItem": [
					{
						"rowNo": 1,
						"blnDeposit": 0,
						"oriOcupyAmount": 0,
						"body": "1836477275215757320",
						"issueNo": 1,
						"apSubjectVid_code": "2202",
						"accAmount": 1,
						"gblAmount": 1,
						"gblBalance": 1,
						"settleMode": "1625144947009650742",
						"expireDate": "2022-10-30 00:00:00",
						"id": "1836477275215757315",
						"accPeriod_name": "2022-10",
						"oriAmount": 1,
						"apSubjectVid": "1705979049004761176",
						"balanceState": "0",
						"orgAmount": 1,
						"settleMode_code": "system_0001",
						"accPeriod": "1625145041506795548",
						"orgBalance": 1,
						"convertWay": "0",
						"grpAmount": 0.357,
						"oriBalance": 1,
						"accBalance": 1,
						"localBalanceState": "0",
						"grpBalance": 0.357,
						"startDate": "2022-09-30 00:00:00",
						"ratio": 20,
						"blnPrepare": 0,
						"oriCurrencyDigit": 2
					}
				],
				"taxRate": 0,
				"accTaxIncludedPrice": 2.5,
				"unit": "1679106254706835463",
				"orgBalance": 5,
				"oriCurrency_code": "CNY",
				"gblExchangeRateType_digit": 6,
				"orgTaxIncludedAmount": 5,
				"grpExchangeRateType_name": "收付集团币汇率类型",
				"oppProCenter": "666666",
				"grpTaxAmount": 0,
				"oriBalance": 5,
				"grpBalance": 1.786,
				"deductTaxType": "0",
				"expenseItem": "1679109690651836420",
				"rowNo": 10,
				"accTaxExcludedAmount": 5,
				"gblExchangeRate": 1,
				"orgExchangeRateType_digit": 5,
				"contractNo": "htbh001",
				"taxSubject_code": "ZR",
				"grpExchangeRate": 0.35714,
				"oriTaxExcludedAmount": 5,
				"grpTaxIncludedAmount": 1.786,
				"accExchangeRate": 1,
				"oriTaxAmount": 0,
				"oriBillNo": "ytdjh001",
				"grpTaxExcludedAmount": 1.786,
				"grpExchangeRateType_digit": 5,
				"expenseItem_code": "01011",
				"accTaxIncludedAmount": 5,
				"event": "1836477275215757317",
				"oriCurrency_moneyDigit": 2,
				"oriTaxIncludedAmount": 5,
				"orgTaxExcludedAmount": 5,
				"unit_precision": 2,
				"quantity": 2,
				"oriTaxIncludedPrice": 2.5,
				"orgTaxAmount": 0,
				"accExchangeRateType": "1705981196498370567",
				"accExchangeRateType_digit": 5,
				"accPeriod_code": "2022-10",
				"gblTaxIncludedAmount": 5,
				"staff": "",
				"dept": "1731969081545850886",
				"invoiceDate": "2023-10-11 00:00:00",
				"gblExchangeRateType": "0000LCAALQGPE642KN0000",
				"accPeriod": "1625145041506795548",
				"oriCurrency_priceDigit": 4,
				"payAgreement": "1712613399111663624",
				"exchangeRateDate": "2022-09-30 00:00:00",
				"material": "1705240958878613511",
				"oriTaxExcludedPrice": 2.5,
				"accBalance": 5,
				"remarks": "备注信息",
				"material_code": "GJp4",
				"proCenter_code": "xx",
				"staff_name": "业务员",
				"costCenter_code": "0001",
				"srcBillType": "1625145000016860933",
				"oriBillRowId": "1625155555916860933",
				"proCenter": "2738955863406848",
				"staff_code": "yyy001",
				"oriBillType_id": "2550545255916860933",
				"srcBillRowId": "1625145032916860988",
				"costCenter": "8521951103406848",
				"srcBillType_code": "885d",
				"oriBillType": "1625185232916860988"
			}
		],
		"eventType": "2738951103406848",
		"srcApp": "94",
		"accPurpose": "1625145032916860933",
		"gblConvertParam": "3",
		"entry": "~",
		"orgBalance": 5,
		"accBook": "1705984056939773967",
		"oriCurrency_code": "CNY",
		"financeOrg_code": "01",
		"grpAmount": 1.786,
		"oriBalance": 5,
		"grpBalance": 1.786,
		"srcSystem": "1",
		"supplier_code": "0001000049",
		"org_code": "01",
		"status": "0",
		"blnEffect": "0",
		"accBook_code": "收付组织",
		"code": "AP02220930000001",
		"writeOffState": "0",
		"orgCurrency_moneyDigit": 2,
		"accPeriodCode": "2022-10",
		"gblAmount": 5,
		"srcBillCode": "AP02220930000001",
		"grpCurrency": "1625145024310673438",
		"orgConvertParam": "1",
		"gblCurrency_moneyDigit": 2,
		"pubts": "2023-10-11 11:14:54",
		"org_name": "收付组织",
		"oriCurrency_moneyDigit": 2,
		"voucherCode": "~",
		"creator": "9e5d1e20-1b6d-46b5-a6bc-ad3902036ed7",
		"bizBillCode": "AP02220930000001",
		"org": "1705972022454517762",
		"voucherType": "~",
		"arapEventType": "303",
		"postState": "0",
		"balanceState": "0",
		"accCurrency_moneyDigit": 2,
		"orgAmount": 5,
		"accDate": "2022-09-30 00:00:00",
		"accPeriod": "1625145041506795548",
		"grpCurrency_moneyDigit": 3,
		"oriCurrency_priceDigit": 4,
		"partner": "1734184236681789442",
		"createTime": "2023-10-11 11:07:04",
		"accBalance": 5,
		"localBalanceState": "0",
		"accCurrency_priceDigit": 4,
		"remarks": "备注信息"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	请求参数中输入有效的事务id


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


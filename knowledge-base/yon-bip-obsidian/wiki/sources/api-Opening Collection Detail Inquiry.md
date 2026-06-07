---
title: "期初收款详情查询"
apiId: "1835910743252795398"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Opening Collection"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初收款详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Opening Collection (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fiear_collection_init/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 事务id    示例: 1572409517496336389 |

## 3. 请求示例

Url: /yonbip/EFI/fiear_collection_init/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回期初收款数据 |
| oriCurrency | string | 否 | 原币ID 示例：1525643705855773169 |
| accConvertParam | string | 否 | 账簿币折算参数(枚举值 1：按原币折算；2：按组织币折算；3：按账簿币折算；) 示例：1 |
| grpConvertParam | string | 否 | 集团币折算参数(枚举值 1：按原币折算；2：按组织币折算；3：按账簿币折算；) 示例：2 |
| financeOrg | string | 否 | 会计主体 示例：1649571233377812482 |
| gblCurrency | string | 否 | 全局币ID 示例：1668885220284694533 |
| settleState | string | 否 | 结算状态(枚举值 0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；) 示例：2 |
| gblCurrency_priceDigit | int | 否 | 全局币单价精度 示例：1 |
| creator_userName | string | 否 | 创建人名称 示例：测试管理员 |
| objectType | string | 否 | 往来对象类型(枚举值 1：客户；2：员工；3：资金业务对象；） 示例：1 |
| accAmount | BigDecimal | 否 | 本币金额 示例：55 |
| modifyTime | string | 否 | 修改时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-05-15 18:58:48 |
| gblBalance | BigDecimal | 否 | 全局币余额 示例：330 |
| oriCurrency_name | string | 否 | 原币名称 示例：人民币2 |
| accYear | long | 否 | 会计年度ID 示例：1709652628922695680 |
| srcBillDate | string | 否 | 来源单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-12-31 00:00:00 |
| accCurrency | string | 否 | 本币币种ID 示例：1525643705855773169 |
| orgCurrency | string | 否 | 组织币币种ID 示例：1525643705855773169 |
| entryCode | string | 否 | 事项分录编号 示例：02012023010100067977 |
| eventType_name | string | 否 | 会计事务类型名称 示例：期初收款 |
| id | string | 否 | 事务ID 示例：1726078233058738180 |
| partner_code | string | 否 | 业务伙伴编码 示例：00000000000001 |
| accPurpose_code | string | 否 | 核算目的编码 示例：01 |
| customer_retailInvestors | boolean | 否 | 客户散户标记 示例：false |
| orgCurrency_name | string | 否 | 组织币币种名称 示例：人民币2 |
| oriAmount | BigDecimal | 否 | 收款金额 示例：55 |
| funderBankAccount | string | 否 | 资金业务对象账户 |
| employeeBankAccount | string | 否 | 员工银行账户 |
| bodyItem | object | 是 | 表体数据 |
| eventType | string | 否 | 会计事务类型ID 示例：1436623525031968768 |
| srcApp | string | 否 | 来源应用ID 示例：95 |
| accPurpose | long | 否 | 核算目的ID 示例：1525643714430500871 |
| gblConvertParam | string | 否 | 全局币折算参数(枚举值 1：按原币折算；2：按组织币折算；3：按账簿币折算；) 示例：2 |
| orgBalance | BigDecimal | 否 | 组织币余额 示例：55 |
| accBook | string | 否 | 财务账簿ID 示例：1649573105972019221 |
| oriCurrency_code | string | 否 | 原币编码 示例：CNY2 |
| auditTime | string | 否 | 审核时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-05-15 17:12:45 |
| accPurpose_name | string | 否 | 核算目的名称 示例：法人核算目的 |
| srcApp_name | string | 否 | 来源应用名称 示例：应收管理 |
| financeOrg_code | string | 否 | 会计主体编码 示例：0201 |
| grpAmount | BigDecimal | 否 | 集体团币金额 示例：0 |
| oriBalance | BigDecimal | 否 | 余额 示例：55 |
| srcSystem | string | 否 | 来源系统 示例：0 |
| grpBalance | BigDecimal | 否 | 集团币余额 示例：0 |
| org_code | string | 否 | 业务组织编码 示例：0201 |
| status | string | 否 | 事务状态(枚举值 0: 未审核； 1: 已审核) 示例：1 |
| blnEffect | string | 否 | 生效状态(枚举值 0：未生效；1：已生效) 示例：1 |
| accBook_code | string | 否 | 财务账簿编码 示例：0201 |
| code | string | 否 | 会计事务编号 示例：AR03221231001505 |
| orgCurrency_moneyDigit | int | 否 | 组织币金额精度 示例：8 |
| accPeriodCode | string | 否 | 会计期间 示例：2023-01 |
| gblAmount | BigDecimal | 否 | 全局币金额 示例：330 |
| orgConvertParam | string | 否 | 组织币折算参数(1：按原币折算；2：按组织币折算；3：按账簿币折算；) 示例：1 |
| gblCurrency_moneyDigit | int | 否 | 全局币金额精度 示例：1 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-09-08 10:39:18 |
| org_name | string | 否 | 业务组织名称 示例：味多美组织 |
| oriCurrency_moneyDigit | long | 否 | 原币金额精度 示例：8 |
| financeOrg_name | string | 否 | 会计主体 示例：味多美组织 |
| creator | string | 否 | 创建人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| bizBillCode | string | 否 | 业务单据编号 示例：AR03221231001505 |
| org | string | 否 | 业务组织ID 示例：1649571233377812482 |
| accCurrency_name | string | 否 | 本币名称 示例：人民币2 |
| accBook_name | string | 否 | 财务账簿 示例：味多美 |
| arapEventType | string | 否 | 会计事务 示例：106 |
| postState | string | 否 | 过账状态(枚举值 0:未过账;1:过账中;2:过账成功;3:过账失败;4:不过账) 示例：2 |
| auditor | string | 否 | 审核人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| balanceState | string | 否 | 清账标识( 枚举值 0：未清账；1：已清账；2：部分清账；) 示例：2 |
| accCurrency_moneyDigit | int | 否 | 本币金额精度 示例：8 |
| orgAmount | BigDecimal | 否 | 组织币金额 示例：55 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-12-31 00:00:00 |
| accPeriod | long | 否 | 会计期间ID 示例：1529511366840287239 |
| oriCurrency_priceDigit | int | 否 | 原币单价精度 示例：8 |
| partner | string | 否 | 业务伙伴 示例：1539685586018762760 |
| orgCurrency_priceDigit | long | 否 | 组织币单价精度 示例：8 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-05-15 17:12:07 |
| accBalance | BigDecimal | 否 | 本币余额 示例：55 |
| customer_name | string | 否 | 客户名称 示例：客户A |
| accCurrency_priceDigit | int | 否 | 本币单价精度 示例：8 |
| customer | long | 否 | 客户ID 示例：1526228774896533510 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1525643705855773169",
		"accConvertParam": "1",
		"grpConvertParam": "2",
		"financeOrg": "1649571233377812482",
		"gblCurrency": "1668885220284694533",
		"settleState": "2",
		"gblCurrency_priceDigit": 1,
		"creator_userName": "测试管理员",
		"objectType": "1",
		"accAmount": 55,
		"modifyTime": "2023-05-15 18:58:48",
		"gblBalance": 330,
		"oriCurrency_name": "人民币2",
		"accYear": 1709652628922695680,
		"srcBillDate": "2022-12-31 00:00:00",
		"accCurrency": "1525643705855773169",
		"orgCurrency": "1525643705855773169",
		"entryCode": "02012023010100067977",
		"eventType_name": "期初收款",
		"id": "1726078233058738180",
		"partner_code": "00000000000001",
		"accPurpose_code": "01",
		"customer_retailInvestors": false,
		"orgCurrency_name": "人民币2",
		"oriAmount": 55,
		"funderBankAccount": "",
		"employeeBankAccount": "",
		"bodyItem": [
			{
				"orgExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"oriCurrency": "1525643705855773169",
				"quickTypeCode": "1",
				"settleState": "2",
				"orgExchangeRate": 1,
				"arSubjectVid_name": "112201",
				"oriOcupyAmount": 0,
				"orgExchangeRateType_code": "01",
				"arSubjectVid": "1649572075179868173",
				"gblBalance": 330,
				"oriCurrency_name": "人民币2",
				"id": "1726078233058738184",
				"eventId": "1726078233058738180",
				"customerBankAccount": 1628623294906236935,
				"accExchangeRateType_code": "01",
				"gblExchangeRateType_code": "CWGGZDH_QJUHLLX1",
				"quickType_name": "预收款",
				"orgBalance": 55,
				"oriCurrency_code": "CNY2",
				"gblExchangeRateType_digit": 5,
				"orgTaxIncludedAmount": 55,
				"oriBalance": 55,
				"grpBalance": 0,
				"rowNo": 10,
				"gblExchangeRate": 6,
				"orgExchangeRateType_digit": 8,
				"grpTaxIncludedAmount": 0,
				"quickType": 1525643714430500879,
				"accExchangeRate": 1,
				"settleMode": 1525649083156923163,
				"accTaxIncludedAmount": 55,
				"accExchangeRateType_name": "基准汇率",
				"expireDate": "2022-12-31 00:00:00",
				"pubts": "2023-09-08 10:39:18",
				"oriCurrency_moneyDigit": 8,
				"oriTaxIncludedAmount": 55,
				"customerBankAccount_no": "123456789098876",
				"accExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"accExchangeRateType_digit": 8,
				"gblTaxIncludedAmount": 330,
				"staff": "",
				"gblExchangeRateType": "1668887711365726215",
				"oriCurrency_priceDigit": 8,
				"exchangeRateDate": "2022-12-31 00:00:00",
				"arSubjectVid_code": "112201",
				"accBalance": 55,
				"objectBankAccountNo": "123456789098876",
				"blnPrepare": 1,
				"expenseItem": 0,
				"expenseItem_code": "",
				"material_code": "",
				"material": ""
			}
		],
		"eventType": "1436623525031968768",
		"srcApp": "95",
		"accPurpose": 1525643714430500871,
		"gblConvertParam": "2",
		"orgBalance": 55,
		"accBook": "1649573105972019221",
		"oriCurrency_code": "CNY2",
		"auditTime": "2023-05-15 17:12:45",
		"accPurpose_name": "法人核算目的",
		"srcApp_name": "应收管理",
		"financeOrg_code": "0201",
		"grpAmount": 0,
		"oriBalance": 55,
		"srcSystem": "0",
		"grpBalance": 0,
		"org_code": "0201",
		"status": "1",
		"blnEffect": "1",
		"accBook_code": "0201",
		"code": "AR03221231001505",
		"orgCurrency_moneyDigit": 8,
		"accPeriodCode": "2023-01",
		"gblAmount": 330,
		"orgConvertParam": "1",
		"gblCurrency_moneyDigit": 1,
		"pubts": "2023-09-08 10:39:18",
		"org_name": "味多美组织",
		"oriCurrency_moneyDigit": 8,
		"financeOrg_name": "味多美组织",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"bizBillCode": "AR03221231001505",
		"org": "1649571233377812482",
		"accCurrency_name": "人民币2",
		"accBook_name": "味多美",
		"arapEventType": "106",
		"postState": "2",
		"auditor": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"balanceState": "2",
		"accCurrency_moneyDigit": 8,
		"orgAmount": 55,
		"accDate": "2022-12-31 00:00:00",
		"accPeriod": 1529511366840287239,
		"oriCurrency_priceDigit": 8,
		"partner": "1539685586018762760",
		"orgCurrency_priceDigit": 8,
		"createTime": "2023-05-15 17:12:07",
		"accBalance": 55,
		"customer_name": "客户A",
		"accCurrency_priceDigit": 8,
		"customer": 1526228774896533510
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


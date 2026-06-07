---
title: "期初应收详情查询"
apiId: "1835909892849270785"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Opening Receivable"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初应收详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Opening Receivable (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fiear_receivable_init/detail

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

Url: /yonbip/EFI/fiear_receivable_init/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回期初应收数据 |
| oriCurrency | string | 否 | 原币币种ID 示例：1580569439952699425 |
| financeOrg | string | 否 | 会计主体ID 示例：1779297207368286213 |
| accConvertParam | string | 否 | 本币折算参数(枚举值：1：按原币折算；2：按组织币折算；3：按账簿币折算) 示例：1 |
| modifier | string | 否 | 修改人ID 示例：85e2cdaa-9f61-4606-b1ff-566eb8367340 |
| creator_userName | string | 否 | 创建人名称 示例：昵称-高贝贝 |
| objectType | string | 否 | 往来对象类型(枚举值 1:客户; 2:员工 3：资金业务对象) 示例：1 |
| accAmount | BigDecimal | 否 | 本币含税金额 示例：800 |
| modifyTime | string | 否 | 修改时间（yyyy-MM-dd HH:mm:ss） 示例：2023-10-10 09:45:52 |
| gblBalance | BigDecimal | 否 | 全局币余额 示例：0 |
| oriCurrency_name | string | 否 | 原币币种名称 示例：人民币 |
| accYear | string | 否 | 会计年度ID 示例：1591544722069913603 |
| srcBillDate | string | 否 | 来源单据日期（yyyy-MM-dd HH:mm:ss） 示例：2023-06-30 00:00:00 |
| accCurrency | string | 否 | 本币币种ID 示例：1580569439952699425 |
| orgCurrency | string | 否 | 组织本币ID 示例：1580569439952699425 |
| entryCode | string | 否 | 事项分录编码 示例：072620230701000504 |
| eventType_name | string | 否 | 会计事务类型名称 示例：期初确认应收 |
| id | string | 否 | 表头主键 示例：1835688332663717891 |
| accPurpose_code | string | 否 | 核算目的编码 示例：01 |
| customer_code | string | 否 | 客户编码 示例：0000000000001 |
| orgCurrency_name | string | 否 | 组织币名称 示例：人民币 |
| oriAmount | BigDecimal | 否 | 含税金额 示例：800 |
| bodyItem | object | 是 | 表体对象 |
| eventType | string | 否 | 会计事务类型ID 示例：1436622906556678151 |
| srcApp | string | 否 | 来源应用(枚举值 95:应收管理;94:应付管理;125:采购管理;123:项目采购;145:合同中心;143:销售合同;130:委外管理;102:现金管理;131:销售管理;127:库存管理;132:供应链费用) 示例：95 |
| accPurpose | string | 否 | 核算目的ID 示例：1580569448542109991 |
| blnWriteOff | long | 否 | 是否冲销单(枚举值：0:否; 1:是) 示例：0 |
| entry | string | 否 | 事项分录ID 示例：1835689603981901834 |
| orgBalance | BigDecimal | 否 | 组织币余额 示例：0 |
| grpBalance | BigDecimal | 否 | 集团币余额 示例：0 |
| accBook | string | 否 | 财务账簿ID 示例：1779300608996016144 |
| oriCurrency_code | string | 否 | 原币编码 示例：CNY |
| auditTime | string | 否 | 审批时间（yyyy-MM-dd HH:mm:ss） 示例：2023-10-10 09:46:33 |
| accPurpose_name | string | 否 | 核算目的名称 示例：法人核算目的 |
| srcApp_name | string | 否 | 来源应用名称 示例：应收管理 |
| financeOrg_code | string | 否 | 会计主体编码 示例：0726 |
| oriBalance | BigDecimal | 否 | 原币余额 示例：800 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：0 |
| org_code | string | 否 | 业务组织编码 示例：0726 |
| blnEffect | string | 否 | 生效状态（枚举值：0：未生效；1：已生效） 示例：1 |
| status | string | 否 | 事务状态（枚举值：0: 未审核； 1: 已审核） 示例：1 |
| accBook_code | string | 否 | 财务账簿编码 示例：0726 |
| code | string | 否 | 会计事务编号 示例：AR02230630000132 |
| accCurrency_code | string | 否 | 本币币种简称 示例：CNY |
| writeOffState | string | 否 | 冲销状态（枚举值：0： 未冲销； 1：已冲销； 2: 部分冲销） 示例：0 |
| orgCurrency_moneyDigit | long | 否 | 组织本币金额精度 示例：3 |
| accPeriodCode | string | 否 | 会计期间 示例：2023-07 |
| gblAmount | BigDecimal | 否 | 全局币含税金额 示例：0 |
| srcBillCode | string | 否 | 来源单据编号 示例：AR02230630000132 |
| pubts | string | 否 | 时间戳(yyyy-MM-dd HH:mm:ss) 示例：2023-10-10 09:46:42 |
| org_name | string | 否 | 业务组织名称 示例：坏账测试组织 |
| oriCurrency_moneyDigit | long | 否 | 币种金额精度 示例：3 |
| financeOrg_name | string | 否 | 会计主体名称 示例：坏账测试组织 |
| creator | string | 否 | 创建人编码 示例：85e2cdaa-9f61-4606-b1ff-566eb8367340 |
| org | string | 否 | 业务组织ID 示例：1779297207368286213 |
| voucherType | string | 否 | 凭证类型ID 示例：1580569379809525946 |
| accCurrency_name | string | 否 | 本币 示例：人民币 |
| accBook_name | string | 否 | 财务账簿 示例：坏账测试组织 |
| arapEventType | string | 否 | 会计事务（枚举值：101：期初暂估应收； 103 ： 期初确认应收） 示例：103 |
| postState | string | 否 | 过账状态（枚举值：0: 未过账； 1: 过账中； 2：过账成功； 3：过账失败； 4: 不过账） 示例：2 |
| auditor | string | 否 | 审批人ID 示例：85e2cdaa-9f61-4606-b1ff-566eb8367340 |
| balanceState | string | 否 | 清账状态（枚举值：0：未清账；1：已清账；2：部分清账；） 示例：0 |
| accCurrency_moneyDigit | long | 否 | 本币金额精度 示例：3 |
| orgAmount | BigDecimal | 否 | 组织币含税金额 示例：0 |
| grpAmount | BigDecimal | 否 | 集团币含税金额 示例：0 |
| accDate | string | 否 | 记账日期(yyyy-MM-dd HH:mm:ss） 示例：2023-06-30 00:00:00 |
| accPeriod | string | 否 | 会计期间ID 示例：1582788383257657354 |
| oriCurrency_priceDigit | long | 否 | 币种单价精度 示例：3 |
| createTime | string | 否 | 创建时间（yyyy-MM-dd HH:mm:ss） 示例：2023-10-10 09:44:08 |
| accBalance | BigDecimal | 否 | 本币余额 示例：800 |
| customer_name | string | 否 | 客户名称 示例：月度集成测试-客户 |
| accCurrency_priceDigit | long | 否 | 本币单价精度 示例：3 |
| customer | string | 否 | 客户ID 示例：1581882394278887426 |
| employee | string | 否 | 员工ID 示例：1581882394278887426 |
| employee_code | string | 否 | 员工编码 示例：1 |
| funder | string | 否 | 资金业务对象ID 示例：1581882394278887426 |
| funder_code | string | 否 | 资金业务对象编码 示例：2 |
| srcTradeType | string | 否 | 来源交易类型ID 示例：173418337838562458 |
| srcTradeType_code | string | 否 | 来源交易类型编码 示例：cdss |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1580569439952699425",
		"financeOrg": "1779297207368286213",
		"accConvertParam": "1",
		"modifier": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
		"creator_userName": "昵称-高贝贝",
		"objectType": "1",
		"accAmount": 800,
		"modifyTime": "2023-10-10 09:45:52",
		"gblBalance": 0,
		"oriCurrency_name": "人民币",
		"accYear": "1591544722069913603",
		"srcBillDate": "2023-06-30 00:00:00",
		"accCurrency": "1580569439952699425",
		"orgCurrency": "1580569439952699425",
		"entryCode": "072620230701000504",
		"eventType_name": "期初确认应收",
		"id": "1835688332663717891",
		"accPurpose_code": "01",
		"customer_code": "0000000000001",
		"orgCurrency_name": "人民币",
		"oriAmount": 800,
		"bodyItem": [
			{
				"oriCurrency": "1580569439952699425",
				"oriOcupyAmount": 0,
				"dr": 0,
				"gblTaxExcludedAmount": 0,
				"gblBalance": 0,
				"oriCurrency_name": "人民币",
				"unit_code": "KGM",
				"accTaxAmount": 0,
				"id": "1835688332663717893",
				"gblTaxAmount": 0,
				"accExchangeRateType_code": "01",
				"accTaxExcludedPrice": 16,
				"taxSubject": "10002",
				"grandsonItem": [
					{
						"rowNo": 10,
						"blnDeposit": 0,
						"arSubjectVid_name": "应收账款",
						"oriOcupyAmount": 0,
						"body": "1835688332663717893",
						"issueNo": 1,
						"dr": 0,
						"arSubjectVid": "1818013047607263242",
						"accAmount": 800,
						"gblAmount": 0,
						"gblBalance": 0,
						"expireDate": "9999-12-31 00:00:00",
						"id": "1835689226016915463",
						"oriAmount": 800,
						"balanceState": "0",
						"arSubject": "1779297997650657293",
						"orgAmount": 0,
						"grpAmount": 0,
						"orgBalance": 0,
						"grpBalance": 0,
						"convertWay": "0",
						"amountDirection": "1",
						"arSubjectVid_code": "1122",
						"oriBalance": 800,
						"accBalance": 800,
						"localBalanceState": "0",
						"arSubject_name": "应收账款",
						"startDate": "2023-06-30 00:00:00",
						"ratio": 100,
						"blnPrepare": 0,
						"quickType": "1580569448542110004",
						"quickType_code": "2"
					}
				],
				"taxRate": 0,
				"accTaxIncludedPrice": 16,
				"unit": "1584180768715833352",
				"orgBalance": 0,
				"grpBalance": 0,
				"orgTaxIncludedAmount": 0,
				"grpTaxIncludedAmount": 0,
				"oriBalance": 800,
				"taxSubject_name": "0%增值税税率",
				"rowNo": 10,
				"accTaxExcludedAmount": 800,
				"taxSubject_code": "ZR",
				"oriTaxExcludedAmount": 800,
				"accExchangeRate": 1,
				"oriTaxAmount": 0,
				"accTaxIncludedAmount": 800,
				"accExchangeRateType_name": "基准汇率",
				"event": "1835688332663717891",
				"pubts": "2023-10-10 09:45:52",
				"oriCurrency_moneyDigit": 3,
				"oriTaxIncludedAmount": 800,
				"orgTaxExcludedAmount": 0,
				"grpTaxExcludedAmount": 0,
				"unit_precision": 4,
				"quantity": 50,
				"oriTaxIncludedPrice": 16,
				"orgTaxAmount": 0,
				"grpTaxAmount": 0,
				"accExchangeRateType": "0000L9WH2UZ56SI9FH0000",
				"accExchangeRateType_digit": 7,
				"gblTaxIncludedAmount": 0,
				"oriCurrency_priceDigit": 3,
				"material": "1614554270628577286",
				"exchangeRateDate": "2023-06-30 00:00:00",
				"oriTaxExcludedPrice": 16,
				"accBalance": 800,
				"material_code": "100147"
			}
		],
		"eventType": "1436622906556678151",
		"srcApp": "95",
		"accPurpose": "1580569448542109991",
		"blnWriteOff": 0,
		"entry": "1835689603981901834",
		"orgBalance": 0,
		"grpBalance": 0,
		"accBook": "1779300608996016144",
		"oriCurrency_code": "CNY",
		"auditTime": "2023-10-10 09:46:33",
		"accPurpose_name": "法人核算目的",
		"srcApp_name": "应收管理",
		"financeOrg_code": "0726",
		"oriBalance": 800,
		"srcSystem": "0",
		"org_code": "0726",
		"blnEffect": "1",
		"status": "1",
		"accBook_code": "0726",
		"code": "AR02230630000132",
		"accCurrency_code": "CNY",
		"writeOffState": "0",
		"orgCurrency_moneyDigit": 3,
		"accPeriodCode": "2023-07",
		"gblAmount": 0,
		"srcBillCode": "AR02230630000132",
		"pubts": "2023-10-10 09:46:42",
		"org_name": "坏账测试组织",
		"oriCurrency_moneyDigit": 3,
		"financeOrg_name": "坏账测试组织",
		"creator": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
		"org": "1779297207368286213",
		"voucherType": "1580569379809525946",
		"accCurrency_name": "人民币",
		"accBook_name": "坏账测试组织",
		"arapEventType": "103",
		"postState": "2",
		"auditor": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
		"balanceState": "0",
		"accCurrency_moneyDigit": 3,
		"orgAmount": 0,
		"grpAmount": 0,
		"accDate": "2023-06-30 00:00:00",
		"accPeriod": "1582788383257657354",
		"oriCurrency_priceDigit": 3,
		"createTime": "2023-10-10 09:44:08",
		"accBalance": 800,
		"customer_name": "月度集成测试-客户",
		"accCurrency_priceDigit": 3,
		"customer": "1581882394278887426",
		"employee": "1581882394278887426",
		"employee_code": "1",
		"funder": "1581882394278887426",
		"funder_code": "2",
		"srcTradeType": "173418337838562458",
		"srcTradeType_code": "cdss"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	传入未删除且有效的单据id


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


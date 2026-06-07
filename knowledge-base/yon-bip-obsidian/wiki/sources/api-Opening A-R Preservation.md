---
title: "期初应收保存"
apiId: "1835924272389816328"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Receivable"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初应收保存

> `ContentType	application/json` 请求方式	POST | 分类: Opening Receivable (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fiear_receivable_init/save

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
| data | object | 否 | 是 | 期初应收数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| financeOrg | string | 否 | 否 | 会计主体id（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：1705972022454517762 |
| financeOrg_code | string | 否 | 否 | 会计主体编码（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：01 |
| srcBillType | string | 否 | 否 | 来源单据类型id 示例：1815122611831046152 |
| srcBillType_code | string | 否 | 否 | 来源单据类型编码 示例：4 |
| srcBillId | string | 否 | 否 | 来源单据id 示例：1013021821227885065 |
| srcTradeType | string | 否 | 否 | 来源交易类型id 示例：19951062891982132485 |
| arapEventType | string | 否 | 否 | 会计事务（枚举值：101：期初暂估应收； 103 ： 期初确认应收） 示例：103 |
| accDate | string | 否 | 是 | 记账日期（yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| srcBillDate | string | 否 | 是 | 单据日期（yyyy-MM-dd HH:mm:ss） 示例：2022-09-30 00:00:00 |
| srcBillCode | string | 否 | 否 | 单据编号 示例：15408923951104198502 |
| org | string | 否 | 否 | 业务组织id，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692 |
| org_code | string | 否 | 否 | 业务组织编码，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：11 |
| objectType | string | 否 | 是 | 往来对象类型(枚举值：1：客户；2：员工；3：资金业务对象；） 示例：1 |
| customer | string | 否 | 否 | 客户id (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1515940421356224512 |
| customer_code | string | 否 | 否 | 客户编码 (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：0805 |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1232132121211 |
| employee_code | string | 否 | 否 | 员工编码 (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：22 |
| funder | string | 否 | 否 | 资金业务对象id(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1732613498433699840 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：ZJDX230524000051 |
| partner | string | 否 | 否 | 业务伙伴id 示例：1734183798595125256 |
| partner_code | string | 否 | 否 | 业务伙伴编码 示例：7898344501821762798 |
| oriCurrency | string | 否 | 否 | 原币币种id（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：1514492081064640537 |
| oriCurrency_code | string | 否 | 否 | 原币币种编码（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：CNY |
| remarks | string | 否 | 否 | 备注 示例：api测试 |
| srcSystem | string | 否 | 否 | 来源系统(枚举值：0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：1 |
| srcApp | string | 否 | 否 | 来源应用（传值需要实现沟通） 示例：94 |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert 默认值：Insert |
| bodyItem | object | 是 | 是 | 期初应收表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/fiear_receivable_init/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"financeOrg": "1705972022454517762",
		"financeOrg_code": "01",
		"srcBillType": "1815122611831046152",
		"srcBillType_code": "4",
		"srcBillId": "1013021821227885065",
		"srcTradeType": "19951062891982132485",
		"arapEventType": "103",
		"accDate": "2022-09-30 00:00:00",
		"srcBillDate": "2022-09-30 00:00:00",
		"srcBillCode": "15408923951104198502",
		"org": "1514558842038386692",
		"org_code": "11",
		"objectType": "1",
		"customer": "1515940421356224512",
		"customer_code": "0805",
		"employee": "1232132121211",
		"employee_code": "22",
		"funder": "1732613498433699840",
		"funder_code": "ZJDX230524000051",
		"partner": "1734183798595125256",
		"partner_code": "7898344501821762798",
		"oriCurrency": "1514492081064640537",
		"oriCurrency_code": "CNY",
		"remarks": "api测试",
		"srcSystem": "1",
		"srcApp": "94",
		"_status": "Insert",
		"bodyItem": [
			{
				"expenseItem": "1570324310872555520",
				"expenseItem_code": "TEST0987",
				"material": "1551616919384096777",
				"material_code": "000156",
				"quantity": "1",
				"oriCurrency": "1625145024310673435",
				"oriCurrency_code": "CNY",
				"taxRate": 1.5,
				"oriTaxExcludedPrice": 15,
				"oriTaxIncludedPrice": 10,
				"oriTaxIncludedAmount": 15,
				"oriTaxAmount": 5,
				"oriTaxExcludedAmount": 10,
				"oriBalance": 15,
				"exchangeRateDate": "2022-09-30 00:00:00",
				"grpExchangeRateType": "1705981531508441095",
				"grpExchangeRateType_code": "SF02",
				"grpExchangeRate": 0.5,
				"grpTaxIncludedAmount": 7.5,
				"grpTaxAmount": 2.5,
				"grpTaxExcludedAmount": 5,
				"grpBalance": 5,
				"accExchangeRate": 1,
				"gblExchangeRateType": "1705981531508441095",
				"gblExchangeRateType_code": "SF02",
				"gblExchangeRate": 1,
				"gblTaxIncludedAmount": 15,
				"gblTaxAmount": 5,
				"gblTaxExcludedAmount": 10,
				"gblBalance": 10,
				"receiveAgreement": "1536752888049568089",
				"receiveAgreement_code": "system_0001",
				"dept": "1551794533528764418",
				"dept_code": "SS2",
				"staff": "15185342251336354581",
				"staff_code": "009",
				"project": "1541277369785909249",
				"project_code": "667",
				"orderNo": "UO-701520230518000002",
				"accExchangeRateOps": "1",
				"orgExchangeRateOps": "1",
				"grpExchangeRateOps": "1",
				"gblExchangeRateOps": "1",
				"contractNo": "HTBH00001",
				"invoiceNo": "642745868659654543",
				"invoiceType": "11",
				"invoiceType_code": "11",
				"invoiceDate": "2022-09-30 00:00:00",
				"remarks": "api测试",
				"costCenter": "85621547187942100",
				"costCenter_code": "1761831188803694221",
				"proCenter": "3214589211538709698",
				"proCenter_code": "19565673482024859289",
				"oppProCenter": "1656292359063207940",
				"oppProCenter_code": "2321001",
				"srcBillId": "19723205091118799620",
				"srcBillRowId": "7170781191760216867",
				"srcBillNo": "353370044699646993",
				"srcBillType": "4269312751384693654",
				"srcBillType_code": "13744131231631771650",
				"oriBillId": "3952747011393121215",
				"oriBillRowId": "12084956841505797683",
				"oriBillNo": "420366671761252038",
				"grandsonItem": [
					{
						"issueNo": 1,
						"startDate": "2022-09-30 00:00:00",
						"expireDate": "2022-09-30 00:00:00",
						"ratio": 6548982761538684231,
						"oriAmount": 15,
						"oriBalance": 15,
						"oriOcupyAmount": 15,
						"grpAmount": 7.5,
						"grpBalance": 5,
						"gblAmount": 15,
						"gblBalance": 10,
						"blnPrepare": "0",
						"blnDeposit": "0",
						"settleMode_code": "0",
						"arSubjectVid": "1686542483765329937",
						"arSubjectVid_code": "1122",
						"convertWay": "0",
						"quickType": "1580569448542110004",
						"quickType_code": "2",
						"_status": "Insert"
					}
				],
				"_status": "Insert"
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
| data | object | 否 | 调用成功时的返回期初应收数据 |
| oriCurrency | string | 否 | 原币币种ID 示例：1580569439952699425 |
| financeOrg | string | 否 | 会计主体ID 示例：1779297207368286213 |
| accConvertParam | string | 否 | 本币折算参数（枚举值：1：按原币折算；2：按组织币折算；3：按账簿币折算) 示例：1 |
| objectType | string | 否 | 往来对象类型(枚举值： 1:客户; 2:员工 3：资金业务对象) 示例：1 |
| accAmount | BigDecimal | 否 | 本币含税金额 示例：800 |
| modifyTime | string | 否 | 修改时间（yyyy-MM-dd HH:mm:ss） 示例：2023-10-10 09:45:52 |
| accYear | string | 否 | 会计年度ID 示例：1591544722069913603 |
| srcBillDate | string | 否 | 来源单据日期（yyyy-MM-dd HH:mm:ss） 示例：2023-06-30 00:00:00 |
| accCurrency | string | 否 | 本币币种ID 示例：1580569439952699425 |
| entryCode | string | 否 | 事项分录编码 示例：072620230701000504 |
| id | string | 否 | 表头主键 示例：1835688332663717891 |
| accPurpose_code | string | 否 | 核算目的编码 示例：01 |
| customer_code | string | 否 | 客户编码 示例：0000000000001 |
| oriAmount | BigDecimal | 否 | 含税金额 示例：800 |
| bodyItem | object | 是 | 表体对象 |
| eventType | string | 否 | 会计事务类型ID 示例：1436622906556678151 |
| srcApp | string | 否 | 来源应用(枚举值：95:应收管理;94:应付管理;125:采购管理;123:项目采购;145:合同中心;143:销售合同;130:委外管理;102:现金管理;131:销售管理;127:库存管理;132:供应链费用) 示例：95 |
| accPurpose | string | 否 | 核算目的ID 示例：1580569448542109991 |
| blnWriteOff | long | 否 | 是否冲销单(枚举值：0:否; 1:是) 示例：0 |
| entry | string | 否 | 事项分录ID 示例：1835689603981901834 |
| accBook | string | 否 | 财务账簿ID 示例：1779300608996016144 |
| oriCurrency_code | string | 否 | 原币编码 示例：CNY |
| auditTime | string | 否 | 审批时间（YYYY-MM-DD HH:mm:ss） 示例：2023-10-10 09:46:33 |
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
| accPeriodCode | string | 否 | 会计期间 示例：2023-07 |
| srcBillCode | string | 否 | 来源单据编号 示例：AR02230630000132 |
| pubts | string | 否 | 时间戳(YYYY-MM-DD HH:mm:ss) 示例：2023-10-10 09:46:42 |
| org | string | 否 | 业务组织ID 示例：1779297207368286213 |
| voucherType | string | 否 | 凭证类型ID 示例：1580569379809525946 |
| arapEventType | string | 否 | 会计事务编码（枚举值：101：期初暂估应收； 103 ： 期初确认应收） 示例：103 |
| postState | string | 否 | 过账状态（枚举值：0: 未过账； 1: 过账中； 2：过账成功； 3：过账失败； 4: 不过账） 示例：2 |
| balanceState | string | 否 | 清账状态（枚举值：0：未清账；1：已清账；2：部分清账；） 示例：0 |
| accDate | string | 否 | 记账日期，（yyyy-MM-dd HH:mm:ss） 示例：2023-06-30 00:00:00 |
| accPeriod | string | 否 | 会计期间ID 示例：1582788383257657354 |
| createTime | string | 否 | 创建时间（yyyy-MM-dd HH:mm:ss） 示例：2023-10-10 09:44:08 |
| accBalance | BigDecimal | 否 | 本币余额 示例：800 |
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
		"objectType": "1",
		"accAmount": 800,
		"modifyTime": "2023-10-10 09:45:52",
		"accYear": "1591544722069913603",
		"srcBillDate": "2023-06-30 00:00:00",
		"accCurrency": "1580569439952699425",
		"entryCode": "072620230701000504",
		"id": "1835688332663717891",
		"accPurpose_code": "01",
		"customer_code": "0000000000001",
		"oriAmount": 800,
		"bodyItem": [
			{
				"oriCurrency": "1580569439952699425",
				"oriOcupyAmount": 0,
				"dr": 0,
				"unit_code": "KGM",
				"accTaxAmount": 0,
				"id": "1835688332663717893",
				"accExchangeRateType_code": "01",
				"accTaxExcludedPrice": 16,
				"taxSubject": "10002",
				"grandsonItem": [
					{
						"rowNo": 10,
						"blnDeposit": false,
						"oriOcupyAmount": 0,
						"body": "1835688332663717893",
						"issueNo": 1,
						"dr": 0,
						"arSubjectVid": "1818013047607263242",
						"accAmount": 800,
						"expireDate": "9999-12-31 00:00:00",
						"id": "1835689226016915463",
						"oriAmount": 800,
						"balanceState": "0",
						"arSubject": "1779297997650657293",
						"convertWay": "0",
						"amountDirection": "1",
						"arSubjectVid_code": "1122",
						"oriBalance": 800,
						"accBalance": 800,
						"localBalanceState": "0",
						"startDate": "2023-06-30 00:00:00",
						"ratio": 100,
						"blnPrepare": false
					}
				],
				"taxRate": 0,
				"accTaxIncludedPrice": 16,
				"unit": "1584180768715833352",
				"oriBalance": 800,
				"rowNo": 10,
				"accTaxExcludedAmount": 800,
				"taxSubject_code": "ZR",
				"oriTaxExcludedAmount": 800,
				"accExchangeRate": 1,
				"oriTaxAmount": 0,
				"accTaxIncludedAmount": 800,
				"event": "1835688332663717891",
				"pubts": "2023-10-10 09:45:52",
				"oriTaxIncludedAmount": 800,
				"quantity": 50,
				"oriTaxIncludedPrice": 16,
				"accExchangeRateType": "0000L9WH2UZ56SI9FH0000",
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
		"accBook": "1779300608996016144",
		"oriCurrency_code": "CNY",
		"auditTime": "2023-10-10 09:46:33",
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
		"accPeriodCode": "2023-07",
		"srcBillCode": "AR02230630000132",
		"pubts": "2023-10-10 09:46:42",
		"org": "1779297207368286213",
		"voucherType": "1580569379809525946",
		"arapEventType": "103",
		"postState": "2",
		"balanceState": "0",
		"accDate": "2023-06-30 00:00:00",
		"accPeriod": "1582788383257657354",
		"createTime": "2023-10-10 09:44:08",
		"accBalance": 800,
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

999	基本信息:会计主体不能为空!	请求参数中输入有效的会计主体d或编码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-11

更新

请求说明

新增

请求参数 (4)

新增折算参数


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "期初应付保存"
apiId: "1835922210805514244"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening A/P"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening A/P]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初应付保存

> `ContentType	application/json` 请求方式	POST | 分类: Opening A/P (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openningapsureevent/save

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
| data | object | 否 | 是 | 期初应付数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| financeOrg | string | 否 | 否 | 会计主体id(会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准) 示例：1705972022454517762 |
| financeOrg_code | string | 否 | 否 | 会计主体编码(会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准) 示例：01 |
| arapEventType | string | 否 | 否 | 会计事务(枚举值 301:期初暂估应付; 303:期初应付) 示例：301 |
| code | string | 否 | 否 | 会计事务编号(设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值) 示例：16135463181312922359 |
| accDate | string | 否 | 是 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| srcTradeType | string | 否 | 否 | 来源交易类型id 示例：18392447411761156998 |
| srcBillDate | string | 否 | 是 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| srcBillCode | string | 否 | 否 | 单据编号 示例：1546948011499304213 |
| org | string | 否 | 否 | 业务组织id 示例：1705972022454517762 |
| org_code | string | 否 | 否 | 业务组织编码 示例：01 |
| srcBillId | string | 否 | 否 | 来源单据id 示例：1212357746454207150 |
| objectType | string | 否 | 是 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| supplier | string | 否 | 否 | 供应商id (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：1734182415618277382 |
| supplier_code | string | 否 | 否 | 供应商编码 (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：0001000046 |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：8628255692081062953 |
| employee_code | string | 否 | 否 | 员工编码 (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：15995480341897092117 |
| funder | string | 否 | 否 | 资金业务对象id(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：1607078208358371145 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：10746488789021436 |
| oriCurrency | string | 否 | 否 | 原币币种id(原币币种id和币种简称不能同时为空，id和编码同时存在，以id为准) 示例：1625145024310673435 |
| oriCurrency_code | string | 否 | 否 | 币种简称(原币币种id和币种简称不能同时为空，id和编码同时存在，以id为准) 示例：CNY |
| remarks | string | 否 | 否 | 备注 示例：api测试 |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |
| bodyItem | object | 是 | 是 | 表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/openningapsureevent/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"financeOrg": "1705972022454517762",
		"financeOrg_code": "01",
		"arapEventType": "301",
		"code": "16135463181312922359",
		"accDate": "2022-09-30 00:00:00",
		"srcTradeType": "18392447411761156998",
		"srcBillDate": "2022-09-30 00:00:00",
		"srcBillCode": "1546948011499304213",
		"org": "1705972022454517762",
		"org_code": "01",
		"srcBillId": "1212357746454207150",
		"objectType": "0",
		"supplier": "1734182415618277382",
		"supplier_code": "0001000046",
		"employee": "8628255692081062953",
		"employee_code": "15995480341897092117",
		"funder": "1607078208358371145",
		"funder_code": "10746488789021436",
		"oriCurrency": "1625145024310673435",
		"oriCurrency_code": "CNY",
		"remarks": "api测试",
		"_status": "Insert",
		"bodyItem": [
			{
				"rowNo": 10,
				"expenseItem": "1679109690651836420",
				"expenseItem_code": "01011",
				"material": "1679106349196115976",
				"material_code": "000001",
				"quantity": 438965302348407004,
				"oriCurrency": "1625145024310673435",
				"oriCurrency_code": "CNY",
				"taxRate": 0,
				"oriTaxIncludedAmount": 10,
				"oriTaxAmount": 0,
				"oriTaxExcludedAmount": 10,
				"oriBalance": 10,
				"exchangeRateDate": "2022-09-30 00:00:00",
				"accExchangeRateType": "1705981196498370567",
				"accExchangeRateType_code": "SF01",
				"accExchangeRate": 1,
				"grpExchangeRateType": "1705981531508441095",
				"grpExchangeRateType_code": "SF02",
				"grpExchangeRate": 1,
				"grpTaxIncludedAmount": 10,
				"grpTaxAmount": 0,
				"grpTaxExcludedAmount": 10,
				"grpBalance": 10,
				"gblExchangeRate": 1,
				"gblTaxIncludedAmount": 10,
				"gblTaxAmount": 0,
				"gblTaxExcludedAmount": 10,
				"gblBalance": 10,
				"payAgreement": "15172089441127890341",
				"payAgreement_code": "8128565012093994876",
				"accExchangeRateOps": "1",
				"orgExchangeRateOps": "1",
				"grpExchangeRateOps": "1",
				"gblExchangeRateOps": "1",
				"dept": "15511431101796404916",
				"dept_code": "1802149988850033422",
				"staff": "39295599018570658",
				"staff_code": "1382805013514245907",
				"project": "1628068892010610691",
				"project_code": "00000001",
				"orderNo": "6345735834364574",
				"remarks": "api测试",
				"contractNo": "53534654735734",
				"costCenter": "2005575892499454825",
				"costCenter_code": "19384456301291987624",
				"proCenter": "2100324116305404850",
				"proCenter_code": "5626198811046523820",
				"oppProCenter": "1656292359063207940",
				"oppProCenter_code": "2321001",
				"srcBillId": "18333330661317086057",
				"srcBody": "19544741151055002339",
				"srcBillRowId": "20731142681944496815",
				"srcBillNo": "18691081911815687739",
				"oriBillNo": "1423808379571218235",
				"oriBillRowId": "1874929262113388481",
				"oriBillId": "17042393591865957184",
				"oriBillType_id": "1992051875347936389",
				"invoiceType": "4902348271522018430",
				"invoiceType_name": "1448365700914702526",
				"invoiceNo": "642745868659654543",
				"invoiceDate": "13771595881749496964",
				"deductTaxType": "0",
				"_status": "Insert",
				"grandsonItem": [
					{
						"issueNo": "5",
						"rowNo": "103466960106818152",
						"startDate": "2022-10-30 00:00:00",
						"expireDate": "2022-10-30 00:00:00",
						"ratio": 1,
						"oriAmount": 10,
						"oriBalance": 10,
						"grpAmount": 10,
						"grpBalance": 10,
						"gblAmount": 10,
						"gblBalance": 10,
						"blnPrepare": "0",
						"blnDeposit": "0",
						"quickType": "2101215767993356741",
						"quickType_code": "10019147351379333001",
						"settleMode": "2120199211336352554",
						"settleMode_code": "001",
						"apSubjectVid": "2569045491705567201",
						"apSubjectVid_code": "9828669451028515748",
						"convertWay": "0",
						"_status": "Insert"
					}
				]
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
| data | object | 否 | 返回期初应付数据 |
| oriCurrency | string | 否 | 原币币种ID 示例：1468336086076358677 |
| accConvertParam | string | 否 | 账簿币折算参数(枚举值 1:按原币折算) 示例：1 |
| financeOrg | string | 否 | 会计主体ID 示例：1474252334897823749 |
| objectType | string | 否 | 往来对象类型(枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| accAmount | BigDecimal | 否 | 本币含税金额 示例：10 |
| supplier | string | 否 | 供应商ID 示例：1472239051706728452 |
| srcBillDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2021-03-31 00:00:00 |
| accCurrency | string | 否 | 本币币种ID 示例：1468336086076358677 |
| id | string | 否 | 事务ID 示例：1841667081751756802 |
| oriAmount | BigDecimal | 否 | 含税金额 示例：10 |
| eventType | string | 否 | 会计事务类型ID 示例：2738951103406848 |
| srcApp | string | 否 | 来源应用(枚举值 94:应付管理; 102:现金管理; 123:项目采购; 125:采购管理; 127:库存管理; 130:委外管理; 132:供应链费用; 145:合同中心) 示例：94 |
| accPurpose | string | 否 | 核算目的ID 示例：1468336103164477443 |
| accBook | string | 否 | 财务账簿ID 示例：1474253022100979729 |
| oriBalance | BigDecimal | 否 | 余额 示例：10 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理; 8:内部交易; 9:B2C订单中心; 10:营销管理) 示例：3 |
| status | string | 否 | 事务状态(枚举值 0:未审核；1:已审核) 示例：0 |
| blnEffect | string | 否 | 生效状态(枚举值 0:未生效；1:已生效) 示例：0 |
| code | string | 否 | 会计事务编号 示例：AP022021033100000104 |
| writeOffState | string | 否 | 冲销状态(枚举值 0:未冲销；1:已冲销；2:部分冲销) 示例：0 |
| accPeriodCode | string | 否 | 会计期间 示例：2021-04 |
| srcBillCode | string | 否 | 来源单据号 示例：AP022021033100000104 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-18 11:04:26 |
| creator | string | 否 | 创建人ID 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| org | string | 否 | 业务组织ID 示例：1474252334897823749 |
| bizBillCode | string | 否 | 单据编号 示例：AP022021033100000104 |
| arapEventType | string | 否 | 会计事务 示例：303 |
| postState | string | 否 | 过账状态(枚举值 0:未过账；1:过账中；2:过账成功；3:过账失败；4:不过账) 示例：0 |
| balanceState | string | 否 | 本币清账状态(枚举值 0:未清账；1:已清账；2:部分清账) 示例：0 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2021-03-31 00:00:00 |
| accPeriod | string | 否 | 会计期间ID 示例：1471484889718063108 |
| accBalance | BigDecimal | 否 | 本币余额 示例：10 |
| localBalanceState | string | 否 | 本币清账状态(枚举值 0:未清账；1:已清账；2:部分清账) 示例：0 |
| bodyItem | object | 是 | 表体数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1468336086076358677",
		"accConvertParam": "1",
		"financeOrg": "1474252334897823749",
		"objectType": "0",
		"accAmount": 10,
		"supplier": "1472239051706728452",
		"srcBillDate": "2021-03-31 00:00:00",
		"accCurrency": "1468336086076358677",
		"id": "1841667081751756802",
		"oriAmount": 10,
		"eventType": "2738951103406848",
		"srcApp": "94",
		"accPurpose": "1468336103164477443",
		"accBook": "1474253022100979729",
		"oriBalance": 10,
		"srcSystem": "3",
		"status": "0",
		"blnEffect": "0",
		"code": "AP022021033100000104",
		"writeOffState": "0",
		"accPeriodCode": "2021-04",
		"srcBillCode": "AP022021033100000104",
		"pubts": "2023-10-18 11:04:26",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"org": "1474252334897823749",
		"bizBillCode": "AP022021033100000104",
		"arapEventType": "303",
		"postState": "0",
		"balanceState": "0",
		"accDate": "2021-03-31 00:00:00",
		"accPeriod": "1471484889718063108",
		"accBalance": 10,
		"localBalanceState": "0",
		"bodyItem": [
			{
				"oriCurrency": "1468336086076358677",
				"id": "1841667081751756804",
				"deductTaxType": "0",
				"oriTaxExcludedAmount": 10,
				"accExchangeRate": 1,
				"oriTaxAmount": 0,
				"accTaxIncludedAmount": 10,
				"event": "1841667081751756802",
				"exchangeRateDate": "2021-03-31 00:00:00",
				"accBalance": 10,
				"accTaxAmount": 0,
				"taxSubject": "10000",
				"taxRate": 0,
				"oriBalance": 10,
				"accTaxExcludedAmount": 10,
				"oriTaxIncludedAmount": 10,
				"accExchangeRateType": "1468336086076358690",
				"accPeriod": "1471484889718063108",
				"grandsonItem": [
					{
						"blnDeposit": false,
						"body": "1841667081751756804",
						"accAmount": 10,
						"id": "1841667081751756805",
						"oriAmount": 10,
						"apSubjectVid": "1472306748890021899",
						"oriBalance": 10,
						"startDate": "2021-03-31 00:00:00",
						"issueNo": 1,
						"expireDate": "9999-12-31 00:00:00",
						"balanceState": "0",
						"accPeriod": "1471484889718063108",
						"accBalance": 10,
						"localBalanceState": "0",
						"ratio": 100,
						"blnPrepare": false
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	基本信息:会计主体不能为空!	请求参数中输入有效的会计主体id或编码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-11

更新

请求说明

新增

请求参数 (4)

折算方式更新


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


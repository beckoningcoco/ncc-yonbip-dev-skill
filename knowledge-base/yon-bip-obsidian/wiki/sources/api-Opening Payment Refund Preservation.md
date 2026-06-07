---
title: "期初付款退款保存"
apiId: "1835923636734656520"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Payment Refund"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Payment Refund]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初付款退款保存

> `ContentType	application/json` 请求方式	POST | 分类: Opening Payment Refund (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openingpaymentrefundevent/save

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
| data | object | 否 | 是 | 期初付款退款数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| financeOrg | string | 否 | 否 | 会计主体id（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：1705972022454517762 |
| financeOrg_code | string | 否 | 否 | 会计主体编码（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：01 |
| org | string | 否 | 否 | 业务组织id（id和编码同时存在，以id为准） 示例：1705972022454517790 |
| org_code | string | 否 | 否 | 业务组织编码（id和编码同时存在，以id为准） 示例：02 |
| code | string | 否 | 否 | 会计事务编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：7147535671121851280 |
| accDate | string | 否 | 是 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| srcBillDate | string | 否 | 是 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| bizBillCode | string | 否 | 否 | 单据编号（存在来源单据时，填来源单据编码，不存在时和会计事务编号一致） 示例：4440262521242689908 |
| objectType | string | 否 | 是 | 往来对象类型（枚举值 0：供应商；2：员工；3：资金业务对象；） 示例：0 |
| supplier | string | 否 | 否 | 供应商id（往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准） 示例：1734182415618277382 |
| supplier_code | string | 否 | 否 | 供应商编码（往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准） 示例：0001000046 |
| employee | string | 否 | 否 | 员工id(往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：2093351089707802156 |
| employee_code | string | 否 | 否 | 员工编码(往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：20090578762099224815 |
| funder | string | 否 | 否 | 资金业务对象id往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空 示例：19618345902145850940 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：2633023061557437630 |
| oriCurrency | string | 否 | 否 | 币种id（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：1625145024310673435 |
| oriCurrency_code | string | 否 | 否 | 币种编码（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：CNY |
| remarks | string | 否 | 否 | 备注 示例：api测试 |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |
| bodyItem | object | 是 | 是 | 表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/openingpaymentrefundevent/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"financeOrg": "1705972022454517762",
		"financeOrg_code": "01",
		"org": "1705972022454517790",
		"org_code": "02",
		"code": "7147535671121851280",
		"accDate": "2022-09-30 00:00:00",
		"srcBillDate": "2022-09-30 00:00:00",
		"bizBillCode": "4440262521242689908",
		"objectType": "0",
		"supplier": "1734182415618277382",
		"supplier_code": "0001000046",
		"employee": "2093351089707802156",
		"employee_code": "20090578762099224815",
		"funder": "19618345902145850940",
		"funder_code": "2633023061557437630",
		"oriCurrency": "1625145024310673435",
		"oriCurrency_code": "CNY",
		"remarks": "api测试",
		"_status": "Insert",
		"bodyItem": [
			{
				"rowNo": 10,
				"quickType": "1625145032916860948",
				"quickType_code": "6",
				"blnPrepare": "0",
				"expenseItem": "1679109690651836420",
				"expenseItem_code": "01011",
				"material": "1679106349196115976",
				"material_code": "000001",
				"settleMode": "1625144947009650742",
				"settleMode_code": "system_0001",
				"enterpriseBankAccount": "1732063751194017796",
				"enterpriseBankAccount_no": "1110111",
				"enterpriseCashAccount": "7426301381059632950",
				"supplierBankAccount": "4059418871758638230",
				"supplierBankAccount_accountno": "552371004337852049",
				"employeeBankAccount": "18482457841874805446",
				"employeeBankAccount_account": "314838015325220483",
				"funderBankAccount": "803084817793060483",
				"funderBankAccount_no": "1409282824454731078",
				"oriCurrency": "1625145024310673435",
				"oriCurrency_code": "CNY",
				"oriTaxIncludedAmount": -100,
				"accExchangeRateType": "1705981196498370567",
				"accExchangeRateType_code": "SF01",
				"exchangeRateDate": "2022-09-30 00:00:00",
				"accExchangeRate": 1,
				"accTaxIncludedAmount": -100,
				"grpExchangeRateType": "1705981531508441095",
				"grpExchangeRateType_code": "SF02",
				"grpExchangeRate": 1.396,
				"grpTaxIncludedAmount": -35.714,
				"gblExchangeRateType": "0000LCAALQGPE642KN0000",
				"accExchangeRateOps": "1",
				"orgExchangeRateOps": "1",
				"grpExchangeRateOps": "1",
				"gblExchangeRateOps": "1",
				"gblExchangeRateType_code": "01",
				"gblExchangeRate": 1.23,
				"gblTaxIncludedAmount": -100,
				"dept": "1003812802207441560",
				"dept_code": "9950211662101669681",
				"staff": "1308091133592608494",
				"staff_code": "18825351361717306816",
				"project": "1628068892010610691",
				"project_code": "00000001",
				"orderNo": "6345735834364574",
				"contractNo": "53534654735734",
				"issueNo": "1",
				"invoiceNo": "642745868659654543",
				"remarks": "api测试",
				"apSubjectVid_code": "2228743181467531416",
				"apSubjectVid": "1705979049004761176",
				"oriBillNo": "19105152451634944065",
				"oriBillId": "1472493824480395228",
				"oriBillRowId": "11696946051809755327",
				"srcBillType": "617467612619834024",
				"srcBillNo": "2488782002087831567",
				"srcBillId": "6463541522015002668",
				"srcBillRowId": "3206709771352276082",
				"costCenter": "1837653491720102993",
				"costCenter_code": "564816272181968276",
				"proCenter": "1203494435895753126",
				"proCenter_code": "16925408531976203801",
				"expireDate": "2023-10-31",
				"oppProCenter": "1656292359063207940",
				"oppProCenter_code": "2321001",
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
| data | object | 否 | 返回应付发票数据 |
| id | string | 否 | 期初付款退款主表id 示例：1838114611226214400 |
| financeOrg | string | 否 | 会计主体id 示例：1705972022454517762 |
| accBook | string | 否 | 财务账簿id 示例：1705984056939773967 |
| accPurpose | string | 否 | 核算目的id 示例：1625145032916860933 |
| arapEventType | string | 否 | 会计事务（枚举值 307：期初付款退款;） 示例：307 |
| eventType | string | 否 | 会计事务类型id 示例：2738987604747008 |
| code | string | 否 | 会计事务编号 示例：AP04220930000002 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| accPeriod | string | 否 | 会计期间id 示例：1625145041506795548 |
| srcBillDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| srcBillCode | string | 否 | 来源单据编号 示例：AP04220930000002 |
| bizBillCode | string | 否 | 单据编号 示例：AP04220930000002 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理; 8:内部交易; 9:B2C订单中心; 10:营销管理) 示例：1 |
| org | string | 否 | 业务组织id 示例：1705972022454517762 |
| objectType | string | 否 | 往来对象类型（枚举值 0：供应商；2：员工；3：资金业务对象；） 示例：0 |
| supplier | string | 否 | 供应商id 示例：1734182415618277382 |
| partner | string | 否 | 业务伙伴id 示例：1734183798595125256 |
| oriCurrency | string | 否 | 币种id 示例：1625145024310673435 |
| oriAmount | BigDecimal | 否 | 金额 示例：-30 |
| oriBalance | BigDecimal | 否 | 余额 示例：-30 |
| accCurrency | string | 否 | 本币id 示例：1625145024310673435 |
| accAmount | BigDecimal | 否 | 本币金额 示例：-30 |
| accBalance | BigDecimal | 否 | 本币余额 示例：-30 |
| status | string | 否 | 事务状态（枚举值 0：未审核；1：已审核；） 示例：0 |
| settleState | string | 否 | 结算状态（枚举值 0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；） 示例：2 |
| blnEffect | string | 否 | 生效状态（枚举值 0：未生效；1：已生效；） 示例：0 |
| postState | string | 否 | 过账状态（枚举值 0：未过账；1：过账中；2：过账成功；3：过账失败；4：不过账；） 示例：0 |
| oriOcupyAmount | BigDecimal | 否 | 预占用金额 示例：0 |
| localBalanceState | string | 否 | 本币清账状态（枚举值 0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；） 示例：0 |
| srcApp | string | 否 | 来源应用id 示例：94 |
| pubts | string | 否 | 期初付款退款主表时间戳 示例：2023-10-13 16:55:54 |
| bodyItem | object | 是 | 期初付款表体数据（必输） |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1838114611226214400",
		"financeOrg": "1705972022454517762",
		"accBook": "1705984056939773967",
		"accPurpose": "1625145032916860933",
		"arapEventType": "307",
		"eventType": "2738987604747008",
		"code": "AP04220930000002",
		"accDate": "2022-09-30 00:00:00",
		"accPeriod": "1625145041506795548",
		"srcBillDate": "2022-09-30 00:00:00",
		"srcBillCode": "AP04220930000002",
		"bizBillCode": "AP04220930000002",
		"srcSystem": "1",
		"org": "1705972022454517762",
		"objectType": "0",
		"supplier": "1734182415618277382",
		"partner": "1734183798595125256",
		"oriCurrency": "1625145024310673435",
		"oriAmount": -30,
		"oriBalance": -30,
		"accCurrency": "1625145024310673435",
		"accAmount": -30,
		"accBalance": -30,
		"status": "0",
		"settleState": "2",
		"blnEffect": "0",
		"postState": "0",
		"oriOcupyAmount": 0,
		"localBalanceState": "0",
		"srcApp": "94",
		"pubts": "2023-10-13 16:55:54",
		"bodyItem": [
			{
				"event": "1838114611226214400",
				"rowNo": 10,
				"quickType": "1625145032916860948",
				"blnPrepare": "0",
				"expenseItem": "1679109690651836420",
				"expenseItem_code": "01011",
				"material": "1679106349196115976",
				"material_code": "000001",
				"settleMode": "1625144947009650742",
				"oriCurrency": "1625145024310673435",
				"oriCurrency_code": "CNY",
				"oriTaxIncludedAmount": -30,
				"oriBalance": -30,
				"accExchangeRateType": "1705981196498370567",
				"accExchangeRateType_code": "SF01",
				"exchangeRateDate": "2022-09-30 00:00:00",
				"accExchangeRate": 1,
				"accTaxIncludedAmount": -30,
				"accBalance": -30,
				"project": "1628068892010610691",
				"project_code": "00000001",
				"settleState": "2",
				"apSubjectVid": "1705979049004761176",
				"balanceState": "0",
				"id": "1838114611226214402",
				"expireDate": "2022-09-30 00:00:00"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	收票组织不允许为空!	请求参数中输入有效的收票组织id或编码


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


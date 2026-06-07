---
title: "期初付款保存"
apiId: "1835922975309692932"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Payment"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初付款保存

> `ContentType	application/json` 请求方式	POST | 分类: Opening Payment (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openingpaymenteventnew/save

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
| data | object | 否 | 是 | 期初付款数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| financeOrg | string | 否 | 否 | 会计主体id（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：1705972022454517762 |
| financeOrg_code | string | 否 | 否 | 会计主体编码（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：01 |
| code | string | 否 | 否 | 会计事务编号 示例：1166441146228213408 |
| accDate | string | 否 | 是 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| bizBillCode | string | 否 | 否 | 单据编号（存在来源单据时，填来源单据编码，不存在时和会计事务编号一致） 示例：246174151644766097 |
| srcBillDate | string | 否 | 是 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| org | string | 否 | 否 | 业务组织id（业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准） 示例：1705972022454517762 |
| org_code | string | 否 | 否 | 业务组织编码（业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准） 示例：01 |
| objectType | string | 否 | 是 | 往来对象类型（枚举值 0：供应商；2：员工；3：资金业务对象；） 示例：0 |
| supplier | string | 否 | 否 | 供应商id（往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准） 示例：1734182415618277382 |
| supplier_code | string | 否 | 否 | 供应商编码（往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准） 示例：0001000046 |
| employee | string | 否 | 否 | 员工id(往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：770099871753055005 |
| employee_code | string | 否 | 否 | 员工编码(往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：139619100680908228 |
| funder | string | 否 | 否 | 资金业务对象id往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空 示例：1390181402911335802 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：6682868821426374596 |
| oriCurrency | string | 否 | 否 | 币种id（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：1625145024310673435 |
| oriCurrency_code | string | 否 | 否 | 币种编码（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：CNY |
| remarks | string | 否 | 否 | 备注 示例：api测试 |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |
| bodyItem | object | 是 | 是 | 期初付款表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/openingpaymenteventnew/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"financeOrg": "1705972022454517762",
		"financeOrg_code": "01",
		"code": "1166441146228213408",
		"accDate": "2022-09-30 00:00:00",
		"bizBillCode": "246174151644766097",
		"srcBillDate": "2022-09-30 00:00:00",
		"org": "1705972022454517762",
		"org_code": "01",
		"objectType": "0",
		"supplier": "1734182415618277382",
		"supplier_code": "0001000046",
		"employee": "770099871753055005",
		"employee_code": "139619100680908228",
		"funder": "1390181402911335802",
		"funder_code": "6682868821426374596",
		"oriCurrency": "1625145024310673435",
		"oriCurrency_code": "CNY",
		"remarks": "api测试",
		"_status": "Insert",
		"bodyItem": [
			{
				"rowNo": "10",
				"quickType": "1625145032916860948",
				"quickTypeCode": "19925881632135974491",
				"blnPrepare": "0",
				"expenseItem": "1679109690651836420",
				"expenseItem_code": "01011",
				"material": "1679106349196115976",
				"material_code": "000001",
				"settleMode": "1625144947009650742",
				"settleMode_code": "system_0001",
				"oriCurrency": "1625145024310673435",
				"oriCurrency_code": "CNY",
				"enterpriseBankAccount": "1732063751194017796",
				"enterpriseBankAccount_no": "1110111",
				"enterpriseCashAccount": "2119095713287747176",
				"enterpriseCashAccount_no": "999791885591982611",
				"supplierBankAccount": "2832456151481497452",
				"supplierBankAccount_accountno": "14144676301906268106",
				"employeeBankAccount": "189494224637366971",
				"employeeBankAccount_account": "20005321821757604964",
				"funderBankAccount": "2164010761012018262",
				"funderBankAccount_no": "8088645591329015152",
				"oriTaxIncludedAmount": 100,
				"accExchangeRateType": "1705981196498370567",
				"accExchangeRateType_code": "SF01",
				"exchangeRateDate": "2022-09-30 00:00:00",
				"accExchangeRate": 1,
				"accTaxIncludedAmount": -100,
				"grpExchangeRateType": "1705981531508441095",
				"grpExchangeRateType_code": "SF02",
				"grpExchangeRate": "0.35714",
				"grpTaxIncludedAmount": 35.714,
				"accExchangeRateOps": "1",
				"orgExchangeRateOps": "1",
				"grpExchangeRateOps": "1",
				"gblExchangeRateOps": "1",
				"gblExchangeRateType": "0000LCAALQGPE642KN0000",
				"gblExchangeRateType_code": "01",
				"gblExchangeRate": "1",
				"gblTaxIncludedAmount": -100,
				"dept": "17910276311178684803",
				"dept_code": "1803003258280531709",
				"staff": "5720284481635554042",
				"staff_code": "735750149730754775",
				"project": "1628068892010610691",
				"project_code": "00000001",
				"orderNo": "6345735834364574",
				"contractNo": "53534654735734",
				"remarks": "api测试",
				"apSubjectVid": "1705979049004761176",
				"apSubjectVid_code": "cd05465",
				"noteType": "20818477622025062307",
				"noteType_billtypeno": "13647578231782239672",
				"noteNo": "13647578231782234561",
				"noteNo_noteno": "pj1564617",
				"issueNo": "1",
				"invoiceNo": "642745868659654543",
				"oriBillNo": "13092668841832613012",
				"oriBillRowId": "127876640777876562",
				"oriBillId": "1660480311898219454",
				"oriBillType": "1344770547341911313",
				"srcBillNo": "12076043041830347990",
				"srcBillRowId": "18271943061160710920",
				"srcBillId": "10447866860447411",
				"srcBody": "1239188431867110867",
				"srcBillType": "15491365682087006369",
				"proCenter": "175786514312841140",
				"proCenter_code": "428445103791422077",
				"oppProCenter": "1656292359063207940",
				"oppProCenter_code": "2321001",
				"costCenter": "87271703202233718",
				"costCenter_code": "1562710481443255698",
				"expireDate": "2023-10-31",
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
| data | object | 否 | 期初付款数据 |
| id | string | 否 | 事务ID 示例：1841029751569907731 |
| pubts | string | 否 | 时间戳 示例：2023-10-17 14:27:51 |
| financeOrg | string | 否 | 会计主体id 示例：1718421354514481153 |
| financeOrg_code | string | 否 | 会计主体编码 示例：SF002 |
| accBook | string | 否 | 财务账簿id 示例：1718429961642573841 |
| accPurpose | string | 否 | 核算目的id 示例：1625145032916860933 |
| arapEventType | string | 否 | 会计事务（306：期初付款;） 示例：306 |
| code | string | 否 | 会计事务编号 示例：AP03230430000102 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-04-30 00:00:00 |
| accPeriod | string | 否 | 会计期间id 示例：1658321095469039623 |
| accPeriodCode | string | 否 | 会计期间 示例：2023-05 |
| bizBillCode | string | 否 | 单据编号 示例：AP03230430000102 |
| srcBillDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-04-30 00:00:00 |
| srcBillCode | string | 否 | 来源单据编号 示例：AP03230430000102 |
| org | string | 否 | 业务组织id 示例：1718421354514481153 |
| org_code | string | 否 | 业务组织编码 示例：SF002 |
| objectType | string | 否 | 往来对象类型（枚举值 0：供应商；2：员工；3：资金业务对象；） 示例：0 |
| supplier | string | 否 | 供应商id 示例：1722256571342782467 |
| supplier_code | string | 否 | 供应商编码 示例：0000000001 |
| supplier_retailInvestors | boolean | 否 | 是否散户 示例：false |
| oriCurrency | string | 否 | 币种id 示例：1717763331189112841 |
| oriCurrency_code | string | 否 | 币种简称 示例：ZL |
| oriAmount | BigDecimal | 否 | 金额 示例：20 |
| oriBalance | BigDecimal | 否 | 余额 示例：20 |
| accCurrency | string | 否 | 本币id 示例：1718420753246846983 |
| accAmount | BigDecimal | 否 | 本币金额 示例：139 |
| accBalance | BigDecimal | 否 | 本币余额 示例：139 |
| remarks | string | 否 | 备注 示例：测试 |
| status | string | 否 | 事务状态（枚举值 0：未审核；1：已审核；） 示例：0 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理; 8:内部交易; 9:B2C订单中心; 10:营销管理) 示例：1 |
| settleState | string | 否 | 结算状态（枚举值 0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；） 示例：2 |
| balanceState | string | 否 | 清账状态（枚举值 0：未清账；1：已清账；2：部分清账；） 示例：0 |
| blnEffect | string | 否 | 生效状态（枚举值 0：未生效；1：已生效；） 示例：0 |
| postState | string | 否 | 过账状态（枚举值 0：未过账；1：过账中；2：过账成功；3：过账失败；4：不过账；） 示例：0 |
| localBalanceState | string | 否 | 本币清账状态（枚举值 0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；） 示例：0 |
| eventType | string | 否 | 会计事务类型id 示例：2738985708905216 |
| srcApp | string | 否 | 来源应用id 示例：94 |
| bodyItem | object | 是 | 表体数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1841029751569907731",
		"pubts": "2023-10-17 14:27:51",
		"financeOrg": "1718421354514481153",
		"financeOrg_code": "SF002",
		"accBook": "1718429961642573841",
		"accPurpose": "1625145032916860933",
		"arapEventType": "306",
		"code": "AP03230430000102",
		"accDate": "2023-04-30 00:00:00",
		"accPeriod": "1658321095469039623",
		"accPeriodCode": "2023-05",
		"bizBillCode": "AP03230430000102",
		"srcBillDate": "2023-04-30 00:00:00",
		"srcBillCode": "AP03230430000102",
		"org": "1718421354514481153",
		"org_code": "SF002",
		"objectType": "0",
		"supplier": "1722256571342782467",
		"supplier_code": "0000000001",
		"supplier_retailInvestors": false,
		"oriCurrency": "1717763331189112841",
		"oriCurrency_code": "ZL",
		"oriAmount": 20,
		"oriBalance": 20,
		"accCurrency": "1718420753246846983",
		"accAmount": 139,
		"accBalance": 139,
		"remarks": "测试",
		"status": "0",
		"srcSystem": "1",
		"settleState": "2",
		"balanceState": "0",
		"blnEffect": "0",
		"postState": "0",
		"localBalanceState": "0",
		"eventType": "2738985708905216",
		"srcApp": "94",
		"bodyItem": [
			{
				"id": "1841029751569907738",
				"event": "1841029751569907731",
				"rowNo": 10,
				"quickType": "1625145032916860948",
				"quickTypeCode": "6",
				"blnPrepare": "0",
				"expenseItem": "1679109690651836420",
				"expenseItem_code": "01011",
				"material": "1679312267079843843",
				"material_code": "000002",
				"settleMode": "1625144947009650742",
				"settleMode_code": "system_0001",
				"oriCurrency": "1717763331189112841",
				"oriCurrency_code": "ZL",
				"oriTaxIncludedAmount": 20,
				"oriBalance": 20,
				"accExchangeRateType": "0000LCAALQGPE642KN0000",
				"accExchangeRateType_code": "01",
				"exchangeRateDate": "2023-04-30 00:00:00",
				"accExchangeRate": 6.98,
				"accTaxIncludedAmount": 139.6,
				"accBalance": 139.6,
				"dept": "1712699341404110853",
				"dept_code": "0427",
				"staff": "1722963591694385156",
				"project": "1628068892010610691",
				"project_code": "00000001",
				"remarks": "测试",
				"apSubjectVid": "1717708364185075802",
				"issueNo": 1,
				"settleState": "2",
				"invoiceNo": "fp1564985",
				"expireDate": "2023-04-30 00:00:00"
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

更新

请求参数 srcBillType

2	2025-06-25

更新

请求参数 srcBillType


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


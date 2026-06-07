---
title: "期初收款退款保存"
apiId: "1835925337541705732"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Collection Refund"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Collection Refund]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初收款退款保存

> `ContentType	application/json` 请求方式	POST | 分类: Opening Collection Refund (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openingreceivementrefundevent/save

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
| data | object | 否 | 是 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| financeOrg | string | 否 | 否 | 会计主体id（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：1705972022454517762 |
| financeOrg_code | string | 否 | 否 | 会计主体编码（会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准） 示例：01 |
| code | string | 否 | 否 | 会计事务编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：7147535671121851280 |
| accDate | string | 否 | 是 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| srcBillDate | string | 否 | 是 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-09-30 00:00:00 |
| bizBillCode | string | 否 | 否 | 单据编号（存在来源单据时，填来源单据编码，不存在时和会计事务编号一致） 示例：4440262521242689908 |
| objectType | string | 否 | 是 | 往来对象类型（枚举值 1：客户；2：员工；3：资金业务对象；） 示例：1 |
| customer | string | 否 | 否 | 客户ID（往来对象类型是1时必输：客户id和客户编码不能同时为空，id和编码同时存在，以id为准） 示例：1734182415618277382 |
| customer_code | string | 否 | 否 | 客户编码（往来对象类型是1时必输：客户id和客户编码不能同时为空，id和编码同时存在，以id为准） 示例：4440262521242689908 |
| employee | string | 否 | 否 | 员工ID（往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准） 示例：2093351089707802156 |
| employee_code | string | 否 | 否 | 员工编码（往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准） 示例：20090578762099224815 |
| funder | string | 否 | 否 | 资金业务对象ID（往来对象类型是3时必输：奖金业务对象id和资金业务对象编码不能同时为空，id和编码同时存在，以id为准） 示例：19618345902145850940 |
| funder_code | string | 否 | 否 | 资金业务对象编码（往来对象类型是3时必输：奖金业务对象id和资金业务对象编码不能同时为空，id和编码同时存在，以id为准） 示例：2633023061557437630 |
| oriCurrency | string | 否 | 否 | 币种id（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：1580569439952699425 |
| oriCurrency_code | string | 否 | 否 | 币种编码（币种id和币种编码不能同时为空，id和编码同时存在，以id为准） 示例：CNY |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |
| remarks | string | 否 | 否 | 备注 示例：采购退款 |
| bodyItem | object | 是 | 否 | 表体数据 |

## 3. 请求示例

Url: /yonbip/EFI/openingreceivementrefundevent/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"financeOrg": "1705972022454517762",
		"financeOrg_code": "01",
		"code": "7147535671121851280",
		"accDate": "2022-09-30 00:00:00",
		"srcBillDate": "2022-09-30 00:00:00",
		"bizBillCode": "4440262521242689908",
		"objectType": "1",
		"customer": "1734182415618277382",
		"customer_code": "4440262521242689908",
		"employee": "2093351089707802156",
		"employee_code": "20090578762099224815",
		"funder": "19618345902145850940",
		"funder_code": "2633023061557437630",
		"oriCurrency": "1580569439952699425",
		"oriCurrency_code": "CNY",
		"_status": "Insert",
		"remarks": "采购退款",
		"bodyItem": [
			{
				"rowNo": 10,
				"quickType": "1580569448542110004",
				"quickTypeCode": "2",
				"blnPrepare": "0",
				"expenseItem": "1791319611115307017",
				"expenseItem_code": "adoo6",
				"material": "1814953364432093192",
				"material_code": "561405",
				"settleMode": "1691202935474880529",
				"settleMode_code": "system_0001",
				"enterpriseBankAccount": "1732063751194017796",
				"enterpriseBankAccount_no": "1110111",
				"enterpriseCashAccount": "7426301381059632950",
				"customerBankAccount": "4059418871758638230",
				"customerBankAccount_no": "552371004337852049",
				"employeeBankAccount": "18482457841874805446",
				"employeeBankAccount_no": "314838015325220483",
				"funderBankAccount": "803084817793060483",
				"funderBankAccount_no": "1409282824454731078",
				"oriTaxIncludedAmount": -80,
				"accExchangeRateType": "0000L9WH2UZ56SI9FH0000",
				"accExchangeRateType_code": "01",
				"exchangeRateDate": "2023-06-30 00:00:00",
				"accExchangeRate": 1,
				"accTaxIncludedAmount": -80,
				"grpExchangeRateType": "1705981531508441095",
				"grpExchangeRateType_code": "SF02",
				"grpExchangeRate": 1.396,
				"grpTaxIncludedAmount": -100,
				"accExchangeRateOps": "1",
				"orgExchangeRateOps": "1",
				"grpExchangeRateOps": "1",
				"gblExchangeRateOps": "1",
				"gblExchangeRateType": "0000LCAALQGPE642KN0000",
				"gblExchangeRateType_code": "SF02",
				"gblExchangeRate": 1.396,
				"gblTaxIncludedAmount": -100,
				"dept": "1818042519668129796",
				"dept_code": "er",
				"staff": "1308091133592608494",
				"staff_code": "18825351361717306816",
				"project": "1815140547702554913",
				"project_code": "00000031",
				"oriCurrency": "1580569439952699425",
				"oriCurrency_code": "CNY",
				"orderNo": "order123",
				"contractNo": "3845629333345667",
				"issueNo": "1",
				"expireDate": "2023-06-30 00:00:00",
				"remarks": "采购退款",
				"arSubjectVid": "1814206727330463772",
				"arSubjectVid_code": "1403",
				"costCenter": "1837653491720102993",
				"costCenter_code": "564816272181968276",
				"proCenter": "1203494435895753126",
				"proCenter_code": "16925408531976203801",
				"oppProCenter": "1581880753585127430",
				"oppProCenter_code": "HL+BZ+JD01",
				"oriBillNo": "19105152451634944065",
				"oriBillId": "1472493824480395228",
				"oriBillRowId": "11696946051809755327",
				"srcBillId": "6463541522015002668",
				"srcBillNo": "2488782002087831567",
				"srcBillType": "617467612619834024",
				"srcBillRowId": "3206709771352276082",
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
| data | object | 否 | 返回期初收款退款保存数据 |
| id | string | 否 | 主表ID 示例：1837196072339898377 |
| financeOrg | string | 否 | 会计主体ID 示例：1812935142113017863 |
| financeOrg_code | string | 否 | 会计主体编码 示例：0909 |
| accBook | string | 否 | 财务账簿ID 示例：1814181773554221071 |
| accBook_code | string | 否 | 财务账簿编码 示例：w3232kk3gv4k |
| accPurpose | string | 否 | 核算目的ID 示例：1580569448542109991 |
| accPurpose_code | string | 否 | 核算目的编码 示例：0911 |
| arapEventType | string | 否 | 会计事务 示例：107 |
| code | string | 否 | 会计事务编号 示例：AR04230630000015 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-06-30 00:00:00 |
| accPeriod | string | 否 | 会计期间ID 示例：1582788383257657354 |
| accYear | string | 否 | 会计年度ID 示例：1591544722069913603 |
| accPeriodCode | string | 否 | 会计期间 示例：2023-07 |
| srcBillDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-06-30 00:00:00 |
| bizBillCode | string | 否 | 单据编号 示例：AR04230630000020 |
| srcSystem | string | 否 | 来源系统 示例：0 |
| org | string | 否 | 业务组织ID 示例：1812935142113017863 |
| org_code | string | 否 | 业务组织编码 示例：0909 |
| objectType | string | 否 | 往来对象类型（1：客户；2：员工；3：资金业务对象；） 示例：1 |
| customer | string | 否 | 客户ID 示例：1814472164876222466 |
| customer_code | string | 否 | 客户编码 示例：091329473764 |
| employee | string | 否 | 员工ID 示例：193837337278473368 |
| employee_code | string | 否 | 员工编码 示例：249823453323 |
| funder | string | 否 | 资金业务对象ID 示例：184384748943837 |
| funder_code | string | 否 | 资金业务对象编码 示例：13440382938427 |
| partner | string | 否 | 业务伙伴ID 示例：344432283288 |
| partner_code | string | 否 | 业务伙伴编码 示例：244523224982229722 |
| oriCurrency | string | 否 | 币种ID 示例：1580569439952699425 |
| oriCurrency_code | string | 否 | 币种简称 示例：CNY |
| oriAmount | BigDecimal | 否 | 退款金额 示例：0 |
| bodyItem | object | 是 | 表体数据 |
| oriBalance | BigDecimal | 否 | 余额 示例：-80 |
| accCurrency | string | 否 | 本币币种ID 示例：184384908943843 |
| accConvertParam | string | 否 | 账簿币折算参数（1：按原币折算；2：按组织币折算；3：按账簿币折算；） 示例：1 |
| accCurrency_code | string | 否 | 本币币种编码 示例：CNY |
| accAmount | BigDecimal | 否 | 本币金额 示例：0 |
| accBalance | BigDecimal | 否 | 本币余额 示例：-80 |
| remarks | string | 否 | 备注 示例：采购退款 |
| status | string | 否 | 事务状态（枚举值 0: 未审核； 1: 已审核；） 示例：1 |
| eventType | string | 否 | 会计事务类型ID 示例：182494837363 |
| entryCode | string | 否 | 事项分录编码 示例：item18327 |
| settleState | string | 否 | 结算状态 示例：2 |
| blnEffect | string | 否 | 生效状态（枚举值 0：未生效；1：已生效；） 示例：1 |
| balanceState | string | 否 | 清账状态（枚举值 0：未清账；1：已清账；2：部分清账；） 示例：1 |
| postState | string | 否 | 过账状态 示例：1 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-12 10:29:33 |
| srcApp | string | 否 | 来源应用列表ID 示例：13847394737 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1837196072339898377",
		"financeOrg": "1812935142113017863",
		"financeOrg_code": "0909",
		"accBook": "1814181773554221071",
		"accBook_code": "w3232kk3gv4k",
		"accPurpose": "1580569448542109991",
		"accPurpose_code": "0911",
		"arapEventType": "107",
		"code": "AR04230630000015",
		"accDate": "2023-06-30 00:00:00",
		"accPeriod": "1582788383257657354",
		"accYear": "1591544722069913603",
		"accPeriodCode": "2023-07",
		"srcBillDate": "2023-06-30 00:00:00",
		"bizBillCode": "AR04230630000020",
		"srcSystem": "0",
		"org": "1812935142113017863",
		"org_code": "0909",
		"objectType": "1",
		"customer": "1814472164876222466",
		"customer_code": "091329473764",
		"employee": "193837337278473368",
		"employee_code": "249823453323",
		"funder": "184384748943837",
		"funder_code": "13440382938427",
		"partner": "344432283288",
		"partner_code": "244523224982229722",
		"oriCurrency": "1580569439952699425",
		"oriCurrency_code": "CNY",
		"oriAmount": 0,
		"bodyItem": [
			{
				"id": "1837196072339898377",
				"rowNo": 10,
				"event": "1837196072339898375",
				"quickType": "1580569448542110004",
				"quickTypeCode": "2",
				"blnPrepare": "0",
				"expenseItem": "1791319611115307017",
				"expenseItem_code": "adoo6",
				"material": "1814953364432093192",
				"material_code": "561405",
				"settleMode": "1691202935474880529",
				"settleMode_code": "system_0001",
				"settleMode_serviceAttr": "sdf234f233",
				"oriCurrency": "1580569439952699425",
				"oriCurrency_code": "CNY",
				"enterpriseBankAccount": "2344345669233243",
				"enterpriseBankAccount_no": "3487g8238283",
				"enterpriseCashAccount": "34828237327273",
				"customerBankAccount": "2382823727293922727",
				"customerBankAccount_no": "2383828f88d83w",
				"employeeBankAccount": "3489394382828",
				"employeeBankAccount_no": "184384748943843",
				"funderBankAccount": "184384748943843",
				"funderBankAccount_no": "184384748943845",
				"objectBankAccountNo": "184384748943843",
				"oriTaxIncludedAmount": -80,
				"oriOcupyAmount": 0,
				"oriBalance": -80,
				"accExchangeRateType": "0000L9WH2UZ56SI9FH0000",
				"accExchangeRateType_code": "01",
				"exchangeRateDate": "2023-06-30 00:00:00",
				"accExchangeRate": 0.3,
				"accTaxIncludedAmount": -80,
				"accBalance": -80,
				"dept": "1818042519668129796",
				"dept_code": "er",
				"staff": "182494837363",
				"staff_code": "182494837363",
				"project": "1815140547702554913",
				"project_code": "00000031",
				"orderNo": "order123",
				"contractNo": "3845629333345667",
				"noteType": "3233283288",
				"noteNo": "324355334",
				"noteNo_noteno": "238288288328328",
				"noteDate": "2023-06-30 00:00:00",
				"issueNo": 1,
				"expireDate": "2023-06-30 00:00:00",
				"remarks": "采购退款",
				"arSubjectVid": "1814206727330463772",
				"arSubject": "1814179823639068699",
				"arSubjectVid_code": "1403",
				"costCenter": "2382832828238828",
				"costCenter_code": "3443343282823",
				"proCenter": "2323298482883",
				"proCenter_code": "32482348ff827237",
				"oppProCenter": "1581880753585127430",
				"oppProCenter_code": "HL+BZ+JD01",
				"oriBillNo": "184384748943843",
				"oriBillId": "184384748943843",
				"oriBillType": "184384748943843",
				"oriBillRowId": "184384748943843",
				"srcBillNo": "184384748943843",
				"srcBillId": "184384748943843",
				"srcBillType": "184384748943843",
				"srcBillRowId": "184384748943843",
				"settleState": "2",
				"settleDate": "2023-06-30 00:00:00",
				"pubts": "2023-10-12 10:29:33"
			}
		],
		"oriBalance": -80,
		"accCurrency": "184384908943843",
		"accConvertParam": "1",
		"accCurrency_code": "CNY",
		"accAmount": 0,
		"accBalance": -80,
		"remarks": "采购退款",
		"status": "1",
		"eventType": "182494837363",
		"entryCode": "item18327",
		"settleState": "2",
		"blnEffect": "1",
		"balanceState": "1",
		"postState": "1",
		"pubts": "2023-10-12 10:29:33",
		"srcApp": "13847394737"
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


---
title: "期初付款退款详情查询"
apiId: "1835908956546400256"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Opening Payment Refund"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Payment Refund]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初付款退款详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Opening Payment Refund (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openingpaymentrefundevent/detail

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

Url: /yonbip/EFI/openingpaymentrefundevent/detail?access_token=访问令牌&id=1572409517496336389

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回期初付款退款数据 |
| oriCurrency | string | 否 | 表头原币币种id 示例：1625145024310673435 |
| financeOrg | string | 否 | 会计主体id 示例：1711169422492172295 |
| gblCurrency | string | 否 | 全局币币种id 示例：1625145024310673435 |
| settleState | string | 否 | 结算状态（枚举值 0：待结算；1：结算中；2：不结算；3：全部成功；4：部分成功；5：全部止付；） 示例：2 |
| gblCurrency_priceDigit | int | 否 | 全局币金额精度 示例：4 |
| oriOcupyAmount | BigDecimal | 否 | 预占用金额 示例：0 |
| objectType | string | 否 | 往来对象类型（枚举值 0：供应商；2：员工；3：资金业务对象；） 示例：0 |
| grpCurrency_priceDigit | int | 否 | 集团币金额精度 示例：1 |
| accAmount | BigDecimal | 否 | 本币金额 示例：-100 |
| gblBalance | BigDecimal | 否 | 全局币余额 示例：-100 |
| supplier | string | 否 | 供应商id 示例：1734182415618277382 |
| srcBillDate | string | 否 | 来源单据日期(格式为:yyyy-MM-dd HH:mm:ss)) 示例：2022-12-31 00:00:00 |
| accCurrency | string | 否 | 本币币种id 示例：1625145024310673435 |
| orgCurrency | string | 否 | 组织币币种id 示例：1625145024310673435 |
| entryCode | string | 否 | 事项分录编码 示例：~ |
| id | string | 否 | 期初付款退款事务主表id 示例：1835996685555204096 |
| grpConvertParam | string | 否 | 集团币折算参数(枚举值 1:按原币折算；2:按组织币折算；3:按账簿币折算) 示例：2 |
| supplier_retailInvestors | boolean | 否 | 是否散户 示例：false |
| accPurpose_code | string | 否 | 核算目的编码 示例：01 |
| oriAmount | BigDecimal | 否 | 原币金额 示例：-100 |
| bodyItem | object | 是 | 表体数据 |
| eventType | string | 否 | 会计事务id 示例：2738987604747008 |
| srcApp | string | 否 | 来源应用id 示例：94 |
| accPurpose | string | 否 | 核算目的id 示例：1625145032916860933 |
| gblConvertParam | string | 否 | 全局币折算参数（枚举值 1：按原币折算；2：按组织币折算；3：按账簿币折算；） 示例：3 |
| orgBalance | BigDecimal | 否 | 组织币余额 示例：-100 |
| accBook | string | 否 | 财务账簿id 示例：1711172085380808721 |
| oriCurrency_code | string | 否 | 原币币种编码 示例：CNY |
| financeOrg_code | string | 否 | 会计主体编码 示例：1001011 |
| grpAmount | BigDecimal | 否 | 集团币金额 示例：-200 |
| oriBalance | BigDecimal | 否 | 原币余额 示例：-100 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理; 8:内部交易; 9:B2C订单中心; 10:营销管理) 示例：3 |
| grpBalance | BigDecimal | 否 | 集团币余额 示例：-200 |
| supplier_code | string | 否 | 供应商编码 示例：0001000046 |
| org_code | string | 否 | 业务组织编码 示例：1001011 |
| status | string | 否 | 事务状态（枚举值 0：未审核；1：已审核；） 示例：0 |
| blnEffect | string | 否 | 生效状态（枚举值 0：未生效；1：已生效；） 示例：0 |
| code | string | 否 | 会计事务编号 示例：AP04221231000102 |
| accCurrency_code | string | 否 | 本币币种编码 示例：CNY |
| orgCurrency_moneyDigit | int | 否 | 组织币金额精度 示例：2 |
| accPeriodCode | string | 否 | 会计期间 示例：2023-01 |
| gblAmount | BigDecimal | 否 | 全局币金额 示例：-100 |
| srcBillCode | string | 否 | 来源单据编号 示例：AP04221231000102 |
| grpCurrency | string | 否 | 集团本币ID 示例：1625145024310673438 |
| orgConvertParam | string | 否 | 组织币折算参数（枚举值 1：按原币折算；3：按账簿币折算；） 示例：1 |
| gblCurrency_moneyDigit | int | 否 | 全局币金额精度 示例：2 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-10 19:42:25 |
| oriCurrency_moneyDigit | int | 否 | 表头原币金额精度 示例：2 |
| voucherCode | string | 否 | 总账凭证号 示例：~ |
| creator | string | 否 | 创建人id 示例：9e5d1e20-1b6d-46b5-a6bc-ad3902036ed7 |
| bizBillCode | string | 否 | 单据编号 示例：AP04221231000102 |
| org | string | 否 | 业务组织id 示例：1711169422492172295 |
| arapEventType | string | 否 | 会计事务（枚举值 307：期初付款退款） 示例：307 |
| postState | string | 否 | 过账状态（枚举值 0：未过账；1：过账中；2：过账成功；3：过账失败；4：不过账；） 示例：0 |
| balanceState | string | 否 | 清账状态（枚举值 0：未清账；1：已清账；2：部分清账；） 示例：0 |
| accCurrency_moneyDigit | int | 否 | 本币金额精度 示例：2 |
| orgAmount | BigDecimal | 否 | 组织币金额 示例：-100 |
| accDate | string | 否 | 记账日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-12-31 00:00:00 |
| accPeriod | string | 否 | 会计期间ID 示例：1658321095469039619 |
| grpCurrency_moneyDigit | int | 否 | 集团本币金额精度 示例：3 |
| oriCurrency_priceDigit | int | 否 | 表头原币单价精度 示例：4 |
| partner | string | 否 | 业务伙伴id 示例：1734183798595125256 |
| orgCurrency_priceDigit | int | 否 | 组织本币单价精度 示例：4 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-10-10 19:42:25 |
| accBalance | BigDecimal | 否 | 本币余额 示例：-100 |
| localBalanceState | string | 否 | 本币清账状态（枚举值 0：未清账；1：已清账；2：部分清账；） 示例：0 |
| accCurrency_priceDigit | int | 否 | 本币单位精度 示例：4 |
| remarks | string | 否 | 备注 示例：Api测试 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1625145024310673435",
		"financeOrg": "1711169422492172295",
		"gblCurrency": "1625145024310673435",
		"settleState": "2",
		"gblCurrency_priceDigit": 4,
		"oriOcupyAmount": 0,
		"objectType": "0",
		"grpCurrency_priceDigit": 1,
		"accAmount": -100,
		"gblBalance": -100,
		"supplier": "1734182415618277382",
		"srcBillDate": "2022-12-31 00:00:00",
		"accCurrency": "1625145024310673435",
		"orgCurrency": "1625145024310673435",
		"entryCode": "~",
		"id": "1835996685555204096",
		"grpConvertParam": "2",
		"supplier_retailInvestors": false,
		"accPurpose_code": "01",
		"oriAmount": -100,
		"bodyItem": [
			{
				"dept_code": "10010111",
				"orgExchangeRateType": "1625145024310673448",
				"grpExchangeRateType_code": "02",
				"oriCurrency": "1625145024310673435",
				"settleState": "2",
				"clearTime": "9999-12-31 00:00:00",
				"orgExchangeRate": 1,
				"oriOcupyAmount": 0,
				"project": "1628068892010610691",
				"orgExchangeRateType_code": "02",
				"gblBalance": -100,
				"id": "1835996685555204099",
				"invoiceNo": "1234667893",
				"accExchangeRateType_code": "02",
				"grpExchangeRateType": "1625145024310673448",
				"gblExchangeRateType_code": "02",
				"apSubject": "1705979049004761094",
				"apSubjectVid": "1705979049004761094",
				"project_code": "00000001",
				"settleMode_code": "system_0003",
				"orgBalance": -100,
				"oriCurrency_code": "CNY",
				"gblExchangeRateType_digit": 6,
				"amountDirection": "1",
				"orgTaxIncludedAmount": -100,
				"grpExchangeRateType_name": "用户自定义汇率",
				"apSubjectVid_name": "库存现金",
				"oriBalance": -100,
				"grpBalance": -200,
				"expenseItem": "1679132591417458691",
				"rowNo": 0,
				"gblExchangeRate": 1,
				"orgExchangeRateType_digit": 6,
				"grpExchangeRate": 2,
				"grpTaxIncludedAmount": -200,
				"issueNo": "1",
				"quickType": "1625145032916860948",
				"accExchangeRate": 1,
				"apSubjectVid_code": "1001",
				"settleMode": "1625144947009650744",
				"grpExchangeRateType_digit": 6,
				"expenseItem_code": "0003",
				"accTaxIncludedAmount": -100,
				"expireDate": "2022-12-31 00:00:00",
				"event": "1835996685555204096",
				"oriCurrency_moneyDigit": 2,
				"oriTaxIncludedAmount": -100,
				"apSubject_id": "1705979049004761094",
				"accExchangeRateType": "1625145024310673448",
				"accExchangeRateType_digit": 6,
				"gblTaxIncludedAmount": -100,
				"staff": "1712638997092851248",
				"dept": "1712638997092106248",
				"balanceState": "0",
				"gblExchangeRateType": "1625145024310673448",
				"oriCurrency_priceDigit": 4,
				"exchangeRateDate": "2022-12-31 00:00:00",
				"material": "1679312267079843843",
				"accBalance": -100,
				"remarks": "Api测试",
				"blnPrepare": 0,
				"material_code": "000002"
			}
		],
		"eventType": "2738987604747008",
		"srcApp": "94",
		"accPurpose": "1625145032916860933",
		"gblConvertParam": "3",
		"orgBalance": -100,
		"accBook": "1711172085380808721",
		"oriCurrency_code": "CNY",
		"financeOrg_code": "1001011",
		"grpAmount": -200,
		"oriBalance": -100,
		"srcSystem": "3",
		"grpBalance": -200,
		"supplier_code": "0001000046",
		"org_code": "1001011",
		"status": "0",
		"blnEffect": "0",
		"code": "AP04221231000102",
		"accCurrency_code": "CNY",
		"orgCurrency_moneyDigit": 2,
		"accPeriodCode": "2023-01",
		"gblAmount": -100,
		"srcBillCode": "AP04221231000102",
		"grpCurrency": "1625145024310673438",
		"orgConvertParam": "1",
		"gblCurrency_moneyDigit": 2,
		"pubts": "2023-10-10 19:42:25",
		"oriCurrency_moneyDigit": 2,
		"voucherCode": "~",
		"creator": "9e5d1e20-1b6d-46b5-a6bc-ad3902036ed7",
		"bizBillCode": "AP04221231000102",
		"org": "1711169422492172295",
		"arapEventType": "307",
		"postState": "0",
		"balanceState": "0",
		"accCurrency_moneyDigit": 2,
		"orgAmount": -100,
		"accDate": "2022-12-31 00:00:00",
		"accPeriod": "1658321095469039619",
		"grpCurrency_moneyDigit": 3,
		"oriCurrency_priceDigit": 4,
		"partner": "1734183798595125256",
		"orgCurrency_priceDigit": 4,
		"createTime": "2023-10-10 19:42:25",
		"accBalance": -100,
		"localBalanceState": "0",
		"accCurrency_priceDigit": 4,
		"remarks": "Api测试"
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


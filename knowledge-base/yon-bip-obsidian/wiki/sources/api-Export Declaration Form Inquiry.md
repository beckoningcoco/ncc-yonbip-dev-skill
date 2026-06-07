---
title: "出口报关单查询"
apiId: "2086162750826872832"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Export declaration form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Export declaration form]
platform_version: "BIP"
source_type: community-api-docs
---

# 出口报关单查询

> `ContentType	application/json` 请求方式	POST | 分类: Export declaration form (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/export-custorm-declare/query-list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| taxPayerCode | string | 否 | 否 | 纳税主体编码 示例：ABC |
| nsrsbh | string | 否 | 否 | 纳税人识别号 示例：12445100MB2D54880K |
| exportDateBegin | string | 否 | 否 | 出口日期-起始 示例：2024-09-13 |
| exportDateEnd | string | 否 | 否 | 出口日期-结束 示例：2024-09-13 |
| declarationDateBegin | string | 否 | 否 | 申报日期-起始 示例：2024-09-13 |
| declarationDateEnd | string | 否 | 否 | 申报日期-结束 示例：2024-09-13 |
| exportDeclarationNo | string | 否 | 否 | 报关单号 示例：12345678 |
| withDetail | string | 否 | 否 | 是否包含子表明细 Y-包含 否则 不包含是否包含子表明细 Y-包含 否则 不包含 示例：N |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页码，从1开始 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页大小 示例：1 |

## 3. 请求示例

Url: /yonbip/tax/api/export-custorm-declare/query-list?access_token=访问令牌
Body: {
	"taxPayerCode": "ABC",
	"nsrsbh": "12445100MB2D54880K",
	"exportDateBegin": "2024-09-13",
	"exportDateEnd": "2024-09-13",
	"declarationDateBegin": "2024-09-13",
	"declarationDateEnd": "2024-09-13",
	"exportDeclarationNo": "12345678",
	"withDetail": "N",
	"pageIndex": 1,
	"pageSize": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | totalCount 示例：1 |
| bills | object | 是 | bills |
| preentryNo | string | 否 | 预录入编号 示例：L001 |
| exportDeclarationNo | string | 否 | 出口报关单号 示例：CK002 |
| taxPayerCode | string | 否 | 纳税主体编码 示例：AABB |
| registrationNo | string | 否 | 备案号 示例：B001 |
| exportDate | string | 否 | 出口日期 示例：2024-05-28 |
| declarationDate | string | 否 | 申报日期 示例：2024-05-28 |
| domesticShipperReceiver | string | 否 | 境内收发货人 示例：税务云测试删除校验 |
| domesticShipperReceiverTaxNo | string | 否 | 境内收发货人税号 示例：S001 |
| transportMode | string | 否 | 运输方式 示例：水上运输 |
| transportVehicleName | string | 否 | 运输工具名称 示例：卡车 |
| transportVehicleCode | string | 否 | 运输工具编号 示例：F78916 |
| deliveryNo | string | 否 | 提运单号 示例：Y001 |
| productionSalesUnit | string | 否 | 生产销售单位 示例：北汽 |
| productionSalesUnitTaxNo | string | 否 | 生产销售单位税号 示例：BQ001 |
| taxExemptionNature | string | 否 | 征免性质 示例：020 |
| convertCurrencyMethod | string | 否 | 结汇方式 示例：1 |
| licenseNumber | string | 否 | 许可证号 示例：X001 |
| approvalNumber | string | 否 | 批准文号 示例：BZ001 |
| transactionMethod | string | 否 | 成交方式 示例：1 |
| exchangeRate | number |
| 小数位数:8,最大长度:16 | 否 | 汇率 示例：22.22 |
| freight | number |
| 小数位数:2,最大长度:18 | 否 | 运费 示例：3333 |
| insurancePremium | number |
| 小数位数:2,最大长度:18 | 否 | 保费 示例：1000 |
| incidentalExpenses | number |
| 小数位数:2,最大长度:18 | 否 | 杂费 示例：500 |
| contractAgreementNo | string | 否 | 合同协议号 示例：KT001 |
| itemCount | number |
| 小数位数:5,最大长度:18 | 否 | 件数 示例：1000 |
| grossWeight | number |
| 小数位数:6,最大长度:18 | 否 | 毛重 示例：11000 |
| netWeight | number |
| 小数位数:6,最大长度:18 | 否 | 净重 示例：10000 |
| containerNo | string | 否 | 集装箱号 示例：60 |
| containerStandardQuantity | number |
| 小数位数:6,最大长度:18 | 否 | 集装箱标准数量 示例：100 |
| remarks | string | 否 | 备注 示例：汽车产品零部件 |
| tradeMode | string | 否 | 贸易方式 示例：一般贸易 |
| declarationFormProductDetailsList | object | 是 | 明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"totalCount": 1,
		"bills": [
			{
				"preentryNo": "L001",
				"exportDeclarationNo": "CK002",
				"taxPayerCode": "AABB",
				"registrationNo": "B001",
				"exportDate": "2024-05-28",
				"declarationDate": "2024-05-28",
				"domesticShipperReceiver": "税务云测试删除校验",
				"domesticShipperReceiverTaxNo": "S001",
				"transportMode": "水上运输",
				"transportVehicleName": "卡车",
				"transportVehicleCode": "F78916",
				"deliveryNo": "Y001",
				"productionSalesUnit": "北汽",
				"productionSalesUnitTaxNo": "BQ001",
				"taxExemptionNature": "020",
				"convertCurrencyMethod": "1",
				"licenseNumber": "X001",
				"approvalNumber": "BZ001",
				"transactionMethod": "1",
				"exchangeRate": 22.22,
				"freight": 3333,
				"insurancePremium": 1000,
				"incidentalExpenses": 500,
				"contractAgreementNo": "KT001",
				"itemCount": 1000,
				"grossWeight": 11000,
				"netWeight": 10000,
				"containerNo": "60",
				"containerStandardQuantity": 100,
				"remarks": "汽车产品零部件",
				"tradeMode": "一般贸易",
				"declarationFormProductDetailsList": [
					{
						"taxClassificationCode": "10001011111111111111",
						"productName": "比亚迪",
						"productCode": "coee3423",
						"specModel": "234234",
						"legalQuantity": 1,
						"legalUnit": "比亚迪工厂",
						"secondQuantity": 1148877,
						"secondUnit": "第二单位",
						"declaredQuantity": 999.889,
						"declaredOrganization": "申报单位",
						"unitPriceWithoutTax": 12,
						"amountWithoutTax": 0,
						"currencyType": "1623643074168094746",
						"levyOrExempt": "1",
						"taxRate": 0.008,
						"taxRefundRate": 0.005,
						"zeroTaxRefundRateMark": "1",
						"availableTaxRefundAmount": 1,
						"rmbunitPriceWithoutTax": 12,
						"rmbamountWithoutTax": 1
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	查询数据异常


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


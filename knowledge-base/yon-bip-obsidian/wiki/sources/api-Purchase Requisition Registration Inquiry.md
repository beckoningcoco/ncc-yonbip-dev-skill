---
title: "申购登记查询"
apiId: "1822490679866556422"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Requisition Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 申购登记查询

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/puechase/open/query

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 当前页 |
| pageSize | int | 否 | 是 | 页面数据大小 |
| accentity | string | 否 | 是 | 会计主体 |
| accentityCode | string | 否 | 否 | 会计主体编码 |
| protocolNumber | string | 否 | 否 | 协议号 |
| purchaseCode | string | 否 | 否 | 申购单号 |
| purchaseDateBegin | Date | 否 | 否 | 申购日期-开始 |
| purchaseDateEnd | Date | 否 | 否 | 申购日期-结束 |
| financialProduct | string | 否 | 否 | 金融产品id |
| financialProductCode | string | 否 | 否 | 金融产品编码 |
| financingOrgType | object | 否 | 否 | 投资机构类型 ， customer:客户,capital_business:资金业务对象,supplier:供应商 |
| financingOrgForBankName | string | 否 | 否 | 投资机构名称 |
| purchaseAmount | BigDecimal | 否 | 否 | 申购金额 |

## 3. 请求示例

Url: /yonbip/ctm/puechase/open/query?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "",
	"accentityCode": "",
	"protocolNumber": "",
	"purchaseCode": "",
	"purchaseDateBegin": "",
	"purchaseDateEnd": "",
	"financialProduct": "",
	"financialProductCode": "",
	"financingOrgType": {},
	"financingOrgForBankName": "",
	"purchaseAmount": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 页面数据大小 |
| recordCount | int | 否 | 总数量 |
| data | object | 否 | 数据集合 |
| id | string | 否 | 申购id |
| accentity | string | 否 | 会计主体 |
| accentityCode | string | 否 | 会计主体编码 |
| accentityName | string | 否 | 会计主体名称 |
| protocolNumber | string | 否 | 协议号 |
| protocolNumberCode | string | 否 | 协议号编码 |
| purchaseCode | string | 否 | 申购单号 |
| financialProduct | string | 否 | 金融产品id |
| financialProductCode | string | 否 | 金融产品编码 |
| financialProductName | string | 否 | 金融产品名称 |
| financingOrgType | string | 否 | 投资机构类型 customer:客户,capital_business:资金业务对象,supplier:供应商 |
| financingOrgForBank | string | 否 | 投资机构id |
| financingOrgForBankCode | string | 否 | 投资机构编码 |
| financingOrgForBankName | string | 否 | 投资机构名称 |
| customer | long | 否 | 客户id |
| customerCode | string | 否 | 客户编码 |
| customerName | string | 否 | 客户名称 |
| supplier | long | 否 | 供应商id |
| supplierCode | string | 否 | 供应商编码 |
| supplierName | string | 否 | 供应商名称 |
| purchaseDate | Date | 否 | 申购日期 |
| purchaseEnddate | Date | 否 | 申购到期日期 |
| purchaseTermNumber | int | 否 | 申购期限数值 |
| protocolCurrency | string | 否 | 协议币种id |
| protocolCurrencyCode | string | 否 | 协议币种编码 |
| protocolCurrencyName | string | 否 | 协议币种名称 |
| purchaseTermUnit | string | 否 | 申购期限单位， day:日, month:月,year:年,half_year半年 |
| purchaseAmount | BigDecimal | 否 | 申购金额 |
| purchaseBalance | BigDecimal | 否 | 申购单余额 |
| purchaseRate | BigDecimal | 否 | 申购单利率 |
| purchaseStatus | short | 否 | 申购单状态， 1:在申购,2:正常,3:结束,4:在变更,5:展期,6:在展期 |
| settlementStatus | short | 否 | 结算状态， "0":未结算,"1":结算中,"2":结算成功 |
| purchaseRegisterCharacterDef | object | 否 | 特征 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"data": {
			"id": "",
			"accentity": "",
			"accentityCode": "",
			"accentityName": "",
			"protocolNumber": "",
			"protocolNumberCode": "",
			"purchaseCode": "",
			"financialProduct": "",
			"financialProductCode": "",
			"financialProductName": "",
			"financingOrgType": "",
			"financingOrgForBank": "",
			"financingOrgForBankCode": "",
			"financingOrgForBankName": "",
			"customer": 0,
			"customerCode": "",
			"customerName": "",
			"supplier": 0,
			"supplierCode": "",
			"supplierName": "",
			"purchaseDate": "",
			"purchaseEnddate": "",
			"purchaseTermNumber": 0,
			"protocolCurrency": "",
			"protocolCurrencyCode": "",
			"protocolCurrencyName": "",
			"purchaseTermUnit": "",
			"purchaseAmount": 0,
			"purchaseBalance": 0,
			"purchaseRate": 0,
			"purchaseStatus": 0,
			"settlementStatus": 0,
			"purchaseRegisterCharacterDef": {}
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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


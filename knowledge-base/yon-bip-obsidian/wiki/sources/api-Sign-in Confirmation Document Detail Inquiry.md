---
title: "签收确认单个详情查询"
apiId: "1440339298779398144"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sign-in Confirmation Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sign-in Confirmation Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 签收确认单个详情查询

> `ContentType` 请求方式	GET | 分类: Sign-in Confirmation Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/signconfirm/detail

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 否 | 签收确认单据编码（编码和id二选一必填，同时填入时以id为准）    示例: QSQR202204290001 |
| id | string | query | 否 | 签收确认单据id（编码和id二选一必填，同时填入时以id为准）    示例: 1904806103110400 |

## 3. 请求示例

Url: /yonbip/scm/signconfirm/detail?access_token=访问令牌&code=QSQR202204290001&id=1904806103110400

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| saleArea | long | 否 | 销售区域id 示例：1471497053137272835 |
| saleArea_name | string | 否 | 销售区域 示例：华北大区 |
| contactid | long | 否 | 客户联系人ID 示例：2296977581920512 |
| autoGeneratePurchase | boolean | 否 | 门户签收协同商家入库 示例：false |
| cReceiveAddress | string | 否 | 客户签收人地址 示例：中国山西省山西省阳泉市山西省阳泉市盂　县 |
| natCurrencyCode | string | 否 | 本币编码 示例：CNY |
| corpContact_name | string | 否 | 销售业务员 示例：zhy2001 |
| currency_priceDigit | BigDecimal | 否 | 币种单价精度 示例：4 |
| invoiceOrg | string | 否 | 开票组织ID 示例：2356392404080640 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：org |
| bustype_name | string | 否 | 交易类型名称 示例：销售签收确认 |
| modifier | string | 否 | 修改人 示例：lyz |
| memo | string | 否 | 备注 示例：111 |
| srcBill | string | 否 | 来源单据id 示例：2741779106779904 |
| modifyTime | string | 否 | 修改时间 示例：2022-04-29 09:06:43 |
| natCurrency | string | 否 | 本币id 示例：2351874939032064 |
| receiveContacterPhone | string | 否 | 客户联系人手机 示例：132411111111 |
| details | object | 是 | 签收确认子表 |
| natCurrencyName | string | 否 | 本币 示例：人民币 |
| salesOrg_name | string | 否 | 销售组织 示例：全职能组织 |
| corpContact | string | 否 | 销售业务员 示例：2352120424288512 |
| modifyDate | string | 否 | 修改日期 示例：2022-04-29 00:00:00 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：true |
| contactName | string | 否 | 客户联系人 示例：联系苹果 |
| srcBillNO | string | 否 | 来源单据号 示例：XSCK20220421000005 |
| warehouse | long | 否 | 仓库id 示例：2697297732866560 |
| barCode | string | 否 | 单据条码 示例：usp_signconfirmation|1442569451948998660 |
| warehouse_name | string | 否 | 仓库 示例：借出仓001 |
| natCurrency_moneyDigit | BigDecimal | 否 | 本币金额精度 示例：2 |
| natCurrency_priceDigit | BigDecimal | 否 | 本币单价精度 示例：4 |
| exchRateType | string | 否 | 汇率类型 示例：0000KRBF48WG59AUYJ0000 |
| status | string | 否 | 单据状态, 0:未提交、1:已提交、 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审核状态(0：开立，1：审核中，2：已审核) 示例：0 |
| currency_moneyDigit | BigDecimal | 否 | 币种金额精度 示例：2 |
| code | string | 否 | 单据编号 示例：QSQR202204280012 |
| exchRate | BigDecimal | 否 | 汇率 示例：1 |
| salesOrg | string | 否 | 销售组织id 示例：2356392404080640 |
| invoiceOrg_name | string | 否 | 开票组织 示例：全职能组织 |
| vouchdate | string | 否 | 单据日期 示例：2022-04-28 00:00:00 |
| currencyName | string | 否 | 币种 示例：人民币 |
| cust_name | string | 否 | 客户 示例：小苹果商家 |
| currency | string | 否 | 币种id 示例：2351874939032064 |
| warehouse_isGoodsPosition | boolean | 否 | 仓库是否货位管理 示例：false |
| org_name | string | 否 | 库存组织 示例：全职能组织 |
| department | string | 否 | 销售部门id 示例：2352115363698176 |
| pubts | string | 否 | 时间戳 示例：2022-04-29 09:06:44 |
| cReceiveMobile | string | 否 | 客户签收人手机 示例：13637383940 |
| createDate | string | 否 | 创建日期 示例：2022-04-28 00:00:00 |
| creator | string | 否 | 创建人 示例：门浩 |
| cReceiveZipCode | string | 否 | 客户签收人邮编 示例：111 |
| org | string | 否 | 库存组织 示例：2356392404080640 |
| department_name | string | 否 | 销售部门 示例：天和 |
| exchRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号严格管理 示例：true |
| transTypeKeyField | string | 否 | 交易类型字段 示例：bustype |
| bustype | string | 否 | 交易类型id 示例：2592843724003328 |
| cReceiver | string | 否 | 客户签收人 示例：收货联系人 |
| receiveId | long | 否 | 客户签收人ID 示例：2495120881194240 |
| createTime | string | 否 | 创建时间 示例：2022-04-28 17:13:07 |
| cust | object | 否 | 客户自定义项 |
| currencyCode | string | 否 | 币种编码 示例：CNY |
| headItem | object | 否 | 表头自定义项 |
| postAccountStatus | number |
| 小数位数:0,最大长度:6 | 否 | 过账状态 0 不过账 1 过账中 2 过账成功 3 过账失败 99 未过账 示例：99 |
| postAccountVersion | number |
| 小数位数:0,最大长度:20 | 否 | 过账版本 示例：1 |
| noPostReasonMsg | string | 否 | 不过账原因信息 示例：过账未知 |
| exchRateDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 汇率日期 示例：2024-04-04 12:12:12 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"saleArea": 1471497053137272835,
		"saleArea_name": "华北大区",
		"contactid": 2296977581920512,
		"autoGeneratePurchase": false,
		"cReceiveAddress": "中国山西省山西省阳泉市山西省阳泉市盂　县",
		"natCurrencyCode": "CNY",
		"corpContact_name": "zhy2001",
		"currency_priceDigit": 4,
		"invoiceOrg": "2356392404080640",
		"masterOrgKeyField": "org",
		"bustype_name": "销售签收确认",
		"modifier": "lyz",
		"memo": "111",
		"srcBill": "2741779106779904",
		"modifyTime": "2022-04-29 09:06:43",
		"natCurrency": "2351874939032064",
		"receiveContacterPhone": "132411111111",
		"details": [
			{
				"bodyItem": {
					"id": 1,
					"define1": "1"
				},
				"stockUnit_name": "件",
				"goodsposition": 2318145801933056,
				"product_model": "刘的普通物料型号",
				"goodsposition_cName": "货位",
				"goodsposition_cCode": "whhw2467516",
				"modelDescription": "规格说明",
				"sactCode": "SACT20220420000452",
				"receivedSubQty": 1,
				"oriTax": 0.13,
				"product_cCode": "000078",
				"orderId": 2741770455013376,
				"priceUOM_Precision": 2,
				"varianceSubQty": 0,
				"firstsource": "udinghuo.voucher_order",
				"firstupcode": "UO-064020220421000001",
				"natTax": 0.13,
				"source": "ustock.st_salesout",
				"subQty": 11,
				"taxItems": "13%",
				"product_cName": "芬达",
				"isExpiryDateManage": false,
				"stockUnitId_Precision": 2,
				"id": 1442569451948998700,
				"receivedBilling": false,
				"mainid": 1442569451948998700,
				"isSerialNoManage": false,
				"subWarehouse": "1442569451948998701",
				"varianceQty": 0,
				"unitName": "件",
				"oriUnitPrice": 0.96,
				"firstSrcBillRow": "10",
				"natSum": 1.09,
				"taxCode": "VAT13",
				"variancePriceQty": 0,
				"taxRate": 13,
				"rejectQty": 10,
				"rejectSubQty": 10,
				"lossQty": 5,
				"lossSubQty": 5,
				"approvedLossQty": 8,
				"approvedLossSubQty": 8,
				"unit": 2352410771869952,
				"productsku": 2510715476775936,
				"productsku_cCode": "000078",
				"receivedQty": 1,
				"sourceType": "st_salesout",
				"taxId": "8b99f589-bc47-4c3a-bf1c-13d47caa20b0",
				"qty": 11,
				"unit_Precision": 2,
				"subWarehouse_name": "仓库",
				"outcode": "XSCK20220421000005",
				"oriTaxUnitPrice": 1.0909,
				"oriMoney": 0.96,
				"invExchRate": 1,
				"stockUnitId": 2352410771869952,
				"natUnitPrice": 0.96,
				"firstsourceautoid": 2741770455013377,
				"receiveableQty": 11,
				"makeRuleCode": "saleOutToSignconfirmation",
				"productsku_cName": "芬达",
				"priceUOM": 2352410771869952,
				"invPriceExchRate": 1,
				"isBatchManage": false,
				"firstsourceid": 2741770455013376,
				"pubts": "2022-04-28 17:13:07",
				"sourceid": 2741779106779904,
				"product": 2510715463406592,
				"oriSum": 1.09,
				"priceUOM_name": "件",
				"detailid": 1442569451948998700,
				"unitExchangeType": 0,
				"orderDetailId": 2741770455013377,
				"sourceautoid": 2741779106796288,
				"lineno": 10,
				"priceQty": 1,
				"outBillRow": "10",
				"invPriceExchRateDen": 1,
				"invPriceExchRateNum": 1,
				"invExchRateDen": 1,
				"invExchRateNum": 1,
				"taxUnitPriceTag": true,
				"upcode": "XSCK20220421000005",
				"srcBillRow": "10",
				"orderCode": "UO-064020220421000001",
				"natTaxUnitPrice": 1.0909,
				"natMoney": 0.96,
				"orderProductType": "SALE",
				"ptoId": 1909928517413896200,
				"ptoRowId": 1909936342842736600,
				"ptoQty": 1,
				"ptoSonQty": 2,
				"ptoCostScrap": 100,
				"salesoutAccountingMethod": "invoiceConfirm",
				"stockAccount": "beginningBill",
				"isUpdateCost": 0,
				"costBillNoType": "st_salesout",
				"costCenter_code": "11",
				"costCenter_name": "11",
				"providerProfitCenter_name": "11",
				"providerProfitCenter_code": "11",
				"consumerProfitCenter_code": "11",
				"consumerProfitCenter_name": "11",
				"invoiceCust_name": "张三",
				"invoiceCust": 1933704391227867144,
				"providerProfitCenter": "1942697717723561992",
				"consumerProfitCenter": "1942697717723561992",
				"costCenter": 1942697717723561992,
				"checkByRevenueManagement": 1,
				"rclRecconfirmed": 1,
				"excessiveSigning": 1,
				"inventoryowner": 0,
				"ownertype": 0
			}
		],
		"natCurrencyName": "人民币",
		"salesOrg_name": "全职能组织",
		"corpContact": "2352120424288512",
		"modifyDate": "2022-04-29 00:00:00",
		"isWfControlled": true,
		"contactName": "联系苹果",
		"srcBillNO": "XSCK20220421000005",
		"warehouse": 2697297732866560,
		"barCode": "usp_signconfirmation|1442569451948998660",
		"warehouse_name": "借出仓001",
		"natCurrency_moneyDigit": 2,
		"natCurrency_priceDigit": 4,
		"exchRateType": "0000KRBF48WG59AUYJ0000",
		"status": "0",
		"returncount": 0,
		"verifystate": 0,
		"currency_moneyDigit": 2,
		"code": "QSQR202204280012",
		"exchRate": 1,
		"salesOrg": "2356392404080640",
		"invoiceOrg_name": "全职能组织",
		"vouchdate": "2022-04-28 00:00:00",
		"currencyName": "人民币",
		"cust_name": "小苹果商家",
		"currency": "2351874939032064",
		"warehouse_isGoodsPosition": false,
		"org_name": "全职能组织",
		"department": "2352115363698176",
		"pubts": "2022-04-29 09:06:44",
		"cReceiveMobile": "13637383940",
		"createDate": "2022-04-28 00:00:00",
		"creator": "门浩",
		"cReceiveZipCode": "111",
		"org": "2356392404080640",
		"department_name": "天和",
		"exchRateType_name": "基准汇率",
		"warehouse_iSerialManage": true,
		"transTypeKeyField": "bustype",
		"bustype": "2592843724003328",
		"cReceiver": "收货联系人",
		"receiveId": 2495120881194240,
		"createTime": "2022-04-28 17:13:07",
		"cust": {
			"customerDefine6": "8B"
		},
		"currencyCode": "CNY",
		"headItem": {
			"define1": "222",
			"id": 1442569451948998700
		},
		"postAccountStatus": 99,
		"postAccountVersion": 1,
		"noPostReasonMsg": "过账未知",
		"exchRateDate": "2024-04-04 12:12:12"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务器逻辑错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-12

新增

返回参数 (6)

更新

返回参数 (5)

仅返回参数中携带货主及货权归属

2	2025-09-29

更新

请求说明

新增

返回参数 subWarehouse

新增

返回参数 subWarehouse_name

3	2025-08-25

更新

返回参数 stockAccount


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


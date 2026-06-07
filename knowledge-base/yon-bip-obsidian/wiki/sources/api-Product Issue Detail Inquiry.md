---
title: "销售出库详情查询"
apiId: "31fca409294742e990ed46d3d3b54cdf"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Issue"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Issue]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售出库详情查询

> `ContentType` 请求方式	GET | 分类: Sales Issue (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/salesout/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID 新增时无需填写，修改时必填 新增时无需填写，修改时必填 新增时无需填写，修改时必填 |

## 3. 请求示例

Url: /yonbip/scm/salesout/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| accountOrg | string | 否 | 会计主体id |
| accountOrg_name | string | 否 | 会计主体名称 |
| org | string | 否 | 发货组织id |
| org_name | string | 否 | 发货组织名称 |
| salesOrg | string | 否 | 销售组织id |
| salesOrg_name | string | 否 | 销售组织名称 |
| invoiceOrg | string | 否 | 开票组织IDid |
| invoiceOrg_name | string | 否 | 开票组织名称 |
| impactStockTiming | string | 否 | 更新存量传财务时机,0:保存;1:审核 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| bustype_extend_attrs_json | string | 否 | 销售出库业务类型 |
| stockDirection | string | 否 | 出库方向, 0:出库、1:退库、 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| storeType | string | 否 | 门店类型 |
| warehouse | string | 否 | 仓库id |
| warehouse_name | string | 否 | 仓库名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| merchant | string | 否 | 商家id |
| merchant_name | string | 否 | 商家名称 |
| invoiceCust | string | 否 | 开票客户IDid |
| invoiceCust_name | string | 否 | 开票客户名称 |
| cust | string | 否 | 客户id |
| cust_name | string | 否 | 客户名称 |
| contactid | string | 否 | 联系人ID |
| tradeRouteID | long | 否 | 贸易路径id |
| contactName | string | 否 | 联系人 |
| receiveContacterTelephone | string | 否 | 客户联系人固定电话 |
| isEndTrade | short | 否 | 是否末级 |
| receiveContacterPhone | string | 否 | 客户联系人移动电话 |
| tradeRouteLineno | string | 否 | 站点 |
| department | string | 否 | 销售部门id |
| department_name | string | 否 | 销售部门名称 |
| operator | string | 否 | 销售员id |
| operator_name | string | 否 | 销售员名称 |
| cReceiver | string | 否 | 收货人 |
| cReceiveMobile | string | 否 | 收货人手机号 |
| cReceiveAddress | string | 否 | 收货地址 |
| cReceiveZipCode | string | 否 | 收货人邮编 |
| diliverStatus | string | 否 | 发货状态 |
| iLogisticId | string | 否 | 物流公司IDid |
| iLogisticId_name | string | 否 | 物流公司名称 |
| cLogisticsBillNo | string | 否 | 物流单号 |
| cLogisticsCarNum | string | 否 | 车牌号 |
| cLogisticsUserName | string | 否 | 司机姓名 |
| cLogisticsUserPhone | string | 否 | 司机电话 |
| status | string | 否 | 单据状态 |
| memo | string | 否 | 备注 |
| srcBill | string | 否 | 来源单据id |
| srcBillNO | string | 否 | 来源单据号 |
| srcBillType | string | 否 | 来源类型, 0:无来源、st_purinrecord:采购入库单、1:发货单、2:销售订单、3:退货单、tradeorder:电商订单、refundorder:电商退换货订单、retailvouch:零售单、mallvouch:商城发货单、 |
| id | string | 否 | 出库单主表ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | string | 否 | 模板id |
| totalQuantity | string | 否 | 整单数量 |
| totalPieces | string | 否 | 整单件数 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| retailAgentName | string | 否 | 散户名称 |
| retailInvestors | string | 否 | 是否散户, true:是、false:否、 |
| modifyInvoiceType | string | 否 | 发票类型可改, true:是、false:否、 |
| invoiceUpcType | string | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、 |
| tradeRoute_name | string | 否 | 贸易路径 |
| invoiceTitleType | string | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 发票抬头 |
| taxNum | string | 否 | 纳税识别号 |
| bankName | string | 否 | 开户银行 |
| subBankName | string | 否 | 开户支行 |
| bankAccount | string | 否 | 银行账号 |
| invoiceTelephone | string | 否 | 营业电话 |
| invoiceAddress | string | 否 | 营业地址 |
| taxRate | string | 否 | 税率 |
| natCurrency | string | 否 | 本币id |
| natCurrencyCode | string | 否 | 本币编码 |
| natCurrencyName | string | 否 | 本币 |
| currency | string | 否 | 币种id |
| currencyCode | string | 否 | 币种编码 |
| currencyName | string | 否 | 币种 |
| exchRateType | string | 否 | 汇率类型id |
| exchRateType_name | string | 否 | 汇率类型名称 |
| exchRate | int | 否 | 汇率 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 |
| sourcesys | string | 否 | 来源系统 |
| bizFlow_version | string | 否 | 版本信息 |
| receiveAccountingBasis | string | 否 | 立账开票依据, voucher_order:销售订单、voucher_delivery:销售发货单、st_salesout:销售出库单、unsettle:不结算、 |
| salesoutAccountingMethod | string | 否 | 出库立账方式, salesoutEstimate:出库暂估应收、salesoutConfirm:出库确认应收、invoiceConfirm:开票确认应收、 |
| bizFlow | string | 否 | 流程IDid |
| bizFlow_name | string | 否 | 流程名称 |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| details | object | 是 | 销售出库单子表[st.salesout.SalesOuts] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accountOrg": "",
		"accountOrg_name": "",
		"org": "",
		"org_name": "",
		"salesOrg": "",
		"salesOrg_name": "",
		"invoiceOrg": "",
		"invoiceOrg_name": "",
		"impactStockTiming": "",
		"vouchdate": "",
		"code": "",
		"bustype": "",
		"bustype_name": "",
		"bustype_extend_attrs_json": "",
		"stockDirection": "",
		"store": "",
		"store_name": "",
		"storeType": "",
		"warehouse": "",
		"warehouse_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"merchant": "",
		"merchant_name": "",
		"invoiceCust": "",
		"invoiceCust_name": "",
		"cust": "",
		"cust_name": "",
		"contactid": "",
		"tradeRouteID": 0,
		"contactName": "",
		"receiveContacterTelephone": "",
		"isEndTrade": 0,
		"receiveContacterPhone": "",
		"tradeRouteLineno": "",
		"department": "",
		"department_name": "",
		"operator": "",
		"operator_name": "",
		"cReceiver": "",
		"cReceiveMobile": "",
		"cReceiveAddress": "",
		"cReceiveZipCode": "",
		"diliverStatus": "",
		"iLogisticId": "",
		"iLogisticId_name": "",
		"cLogisticsBillNo": "",
		"cLogisticsCarNum": "",
		"cLogisticsUserName": "",
		"cLogisticsUserPhone": "",
		"status": "",
		"memo": "",
		"srcBill": "",
		"srcBillNO": "",
		"srcBillType": "",
		"id": "",
		"pubts": "",
		"tplid": "",
		"totalQuantity": "",
		"totalPieces": "",
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"retailAgentName": "",
		"retailInvestors": "",
		"modifyInvoiceType": "",
		"invoiceUpcType": "",
		"tradeRoute_name": "",
		"invoiceTitleType": "",
		"invoiceTitle": "",
		"taxNum": "",
		"bankName": "",
		"subBankName": "",
		"bankAccount": "",
		"invoiceTelephone": "",
		"invoiceAddress": "",
		"taxRate": "",
		"natCurrency": "",
		"natCurrencyCode": "",
		"natCurrencyName": "",
		"currency": "",
		"currencyCode": "",
		"currencyName": "",
		"exchRateType": "",
		"exchRateType_name": "",
		"exchRate": 0,
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"sourcesys": "",
		"bizFlow_version": "",
		"receiveAccountingBasis": "",
		"salesoutAccountingMethod": "",
		"bizFlow": "",
		"bizFlow_name": "",
		"isFlowCoreBill": "",
		"ecsuiteperson": "",
		"details": [
			{
				"rowno": 0,
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"modelDescription": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"isExpiryDateManage": "",
				"isBatchManage": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"mainid": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"purinrecordQty": 0,
				"synergisticQty": 0,
				"qty": 0,
				"unit": "",
				"unitName": "",
				"invExchRate": 0,
				"unitExchangeType": 0,
				"subQty": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"priceUOM": "",
				"priceUOM_Precision": "",
				"priceUOM_name": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"id": "",
				"detailid": "",
				"pubts": "",
				"costUnitPrice": 0,
				"costMoney": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"natSum": 0,
				"natTax": 0,
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"oriSum": 0,
				"oriTax": 0,
				"taxRate": 0,
				"project": "",
				"project_code": "",
				"project_name": "",
				"source": "",
				"collaborationSource": "",
				"upcode": "",
				"srcBillRow": "",
				"firstsource": "",
				"firstupcode": "",
				"collaborationPocode": "",
				"firstSrcBillRow": "",
				"sourceid": "",
				"sourceautoid": "",
				"firstsourceid": "",
				"collaborationPodetailid": "",
				"collaborationPoid": "",
				"firstsourceautoid": "",
				"autoCalcCost": "",
				"memo": "",
				"receivedQuantity": 0,
				"rebateMoney": 0,
				"freight": 0,
				"saleStyle": "",
				"saleReturnQty": 0,
				"invoiceQty": 0,
				"invoiceOriSum": 0,
				"retNotNeedInvoiceQty": 0,
				"unInvoiceQty": 0,
				"taxUnitPriceTag": "",
				"taxId": "",
				"taxItems": 0,
				"taxCode": 0,
				"specDescription": 0,
				"makeRuleCode": "",
				"receiveAgreementId": "",
				"goodsposition": "",
				"salesOutsSNs": [
					{
						"id": 0,
						"sn": "",
						"snstate": "",
						"presnstate": "",
						"updatecount": 0
					}
				],
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"tradeRouteID": 0,
				"isEndTrade": 0,
				"tradeRouteLineno": "",
				"collaborationPolineno": "",
				"salesOutsExtend!coUpcode": "",
				"salesOutsExtend!coSourceid": 0,
				"salesOutsExtend!coSourceautoid": 0,
				"salesOutsExtend!coSourceLineNo": "",
				"salesOutsExtend!coSourceType": "",
				"tradeRoute_name": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	单据未找到	检查单据id是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-12

新增

返回参数 impactStockTiming

UKC-154939【承诺项目紧急上线】【项目出现阻断】【销售出】销售出库的OpenAPI的详情查询接口-支持按企业账号通过ID查询商家数据 使用/report/detail4Api接口有api标识用于后台判断


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


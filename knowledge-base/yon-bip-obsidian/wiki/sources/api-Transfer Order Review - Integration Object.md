---
title: "调拨订单审核-集成对象"
apiId: "1814260766599020548"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨订单审核-集成对象

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferapply/batchauditToErp

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
| barcode | string | 否 | 否 | 条码 |
| creatorId | string | 否 | 否 | 创建人id |
| bustype_code | string | 否 | 否 | 交易类型编码 |
| outorg | string | 否 | 是 | 调出组织id或code |
| outorg_name | string | 否 | 否 | 调出组织名称 |
| outaccount | string | 否 | 是 | 调出会计主体id或code |
| outaccount_name | string | 否 | 否 | 调出会计主体名称 |
| code | string | 否 | 是 | 单据编号 |
| vouchdate | string | 否 | 是 | 单据日期 |
| bustype | string | 否 | 是 | 交易类型id或code |
| bustype_name | string | 否 | 否 | 交易类型名称 |
| breturn | string | 否 | 否 | 调拨退货 |
| merchant | string | 否 | 否 | 商家id |
| merchant_name | string | 否 | 否 | 商家名称 |
| outstore | string | 否 | 否 | 调出门店id或code |
| outstore_name | string | 否 | 否 | 调出门店名称 |
| instore | string | 否 | 否 | 调入门店id或code |
| instore_name | string | 否 | 否 | 调入门店名称 |
| outwarehouse | string | 否 | 否 | 调出仓库id或code |
| outwarehouse_name | string | 否 | 否 | 调出仓库名称 |
| inorg | string | 否 | 是 | 调入组织id或code |
| inorg_name | string | 否 | 否 | 调入组织名称 |
| inaccount | string | 否 | 是 | 调入会计主体id或code |
| inaccount_name | string | 否 | 否 | 调入会计主体名称 |
| inwarehouse | string | 否 | 否 | 调入仓库id或code |
| inwarehouse_name | string | 否 | 否 | 调入仓库名称 |
| status | string | 否 | 否 | 单据状态 |
| bizstatus | string | 否 | 否 | 单据状态_bizstatus |
| outdepartment | string | 否 | 否 | 调出部门id或code |
| outdepartment_name | string | 否 | 否 | 调出部门名称 |
| outbizperson | string | 否 | 否 | 调出业务员id或code |
| outbizperson_name | string | 否 | 否 | 调出业务员名称 |
| indepartment | string | 否 | 否 | 调入部门id或code |
| indepartment_name | string | 否 | 否 | 调入部门名称 |
| inbizperson | string | 否 | 否 | 调入业务员id或code |
| inbizperson_name | string | 否 | 否 | 调入业务员名称 |
| operator | string | 否 | 否 | 经办人id或code |
| operator_name | string | 否 | 否 | 经办人名称 |
| settlementAccount | string | 否 | 否 | 结算主体id |
| settlementAccount_name | string | 否 | 否 | 结算主体名称 |
| id | int | 否 | 否 | 主表ID |
| pubts | string | 否 | 否 | 时间戳 |
| tplid | string | 否 | 否 | 模板id |
| totalQuantity | int | 否 | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 否 | 气泡联系人 |
| cust | string | 否 | 否 | 客户id |
| cust_name | string | 否 | 否 | 客户名称 |
| vendor | string | 否 | 否 | 供应商id |
| vendor_name | string | 否 | 否 | 供应商名称 |
| currency | string | 否 | 否 | 币种id |
| currency_name | string | 否 | 否 | 币种名称 |
| natCurrency | string | 否 | 否 | 本币id |
| natCurrency_name | string | 否 | 否 | 本币名称 |
| exchRate | string | 否 | 否 | 汇率 |
| srcBillType | string | 否 | 否 | 来源类型 |
| totalPieces | int | 否 | 否 | 整单件数 |
| dplanshipmentdate | string | 否 | 是 | 计划发货日期 |
| dplanarrivaldate | string | 否 | 是 | 计划到货日期 |
| receiver | string | 否 | 否 | 收货人 |
| receivemobile | string | 否 | 否 | 收货人电话 |
| receiveaddr | string | 否 | 否 | 收货人地址 |
| receivezipcode | string | 否 | 否 | 邮编 |
| memo | string | 否 | 否 | 备注 |
| creator | string | 否 | 否 | 创建人 |
| createTime | string | 否 | 否 | 创建时间 |
| createDate | string | 否 | 否 | 创建日期 |
| modifier | string | 否 | 否 | 修改人 |
| modifyTime | string | 否 | 否 | 修改时间 |
| modifyDate | string | 否 | 否 | 修改日期 |
| auditor | string | 否 | 否 | 审批人 |
| auditTime | string | 否 | 否 | 审批时间 |
| auditDate | string | 否 | 否 | 审批日期 |
| closer | string | 否 | 否 | 关闭人 |
| closeTime | string | 否 | 否 | 关闭时间 |
| currency_priceDigit | string | 否 | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 否 | 本币金额精度 |
| _status | string | 否 | 是 | 操作标识 |
| transferApplys | object | 是 | 是 | 调拨订单子表 |
| product | string | 否 | 是 | 物料id或code |
| priceUOM | string | 否 | 否 | 计价单位 |
| priceQty | string | 否 | 否 | 计价数量 |
| invPriceExchRate | string | 否 | 否 | 计价换算率 |
| product_cCode | string | 否 | 否 | 物料编码 |
| product_cName | string | 否 | 否 | 物料名称 |
| product_model | string | 否 | 否 | 型号 |
| modelDescription | string | 否 | 否 | 规格说明 |
| manageClass | string | 否 | 否 | 物料分类 |
| isSerialNoManage | string | 否 | 否 | 是否序列号管理 |
| productsku | string | 否 | 否 | 商品SKUid或code |
| productsku_cCode | string | 否 | 否 | 物料sku编码 |
| productsku_cName | string | 否 | 否 | 物料sku名称 |
| propertiesValue | string | 否 | 否 | 规格 |
| isExpiryDateManage | string | 否 | 否 | 是否效期管理 |
| isBatchManage | string | 否 | 否 | 是否批次管理 |
| batchno | string | 否 | 否 | 批次号 |
| producedate | string | 否 | 否 | 生产日期 |
| invaliddate | string | 否 | 否 | 有效期至 |
| expireDateNo | string | 否 | 否 | 保质期 |
| expireDateUnit | string | 否 | 否 | 保质期单位 |
| mainid | string | 否 | 否 | 主表id |
| id | int | 否 | 否 | 子表ID |
| pubts | string | 否 | 否 | 时间戳 |
| qty | int | 否 | 是 | 数量 |
| unit | string | 否 | 否 | 主计量id或code |
| unitName | string | 否 | 否 | 主计量 |
| invExchRate | int | 否 | 是 | 换算率 |
| subQty | int | 否 | 是 | 件数 |
| stockUnitId | string | 否 | 否 | 库存单位id或code |
| stockUnit_name | string | 否 | 否 | 库存单位名称 |
| unitExchangeType | string | 否 | 否 | 库存换算率换算方式 |
| unit_Precision | string | 否 | 否 | 主计量精度 |
| stockUnitId_Precision | string | 否 | 否 | 库存单位精度 |
| isCanModPrice | string | 否 | 否 | 价格可改 |
| taxUnitPriceTag | string | 否 | 否 | 价格含税 |
| oriUnitPrice | int | 否 | 否 | 无税单价 |
| oriTaxUnitPrice | int | 否 | 否 | 含税单价 |
| oriMoney | int | 否 | 否 | 无税金额 |
| oriSum | int | 否 | 否 | 含税金额 |
| oriTax | int | 否 | 否 | 税额 |
| taxRate | string | 否 | 否 | 税率 |
| natUnitPrice | int | 否 | 否 | 本币无税单价 |
| natTaxUnitPrice | int | 否 | 否 | 本币含税单价 |
| natMoney | int | 否 | 否 | 本币无税金额 |
| natSum | int | 否 | 否 | 本币含税金额 |
| natTax | int | 否 | 否 | 本币税额 |
| project | string | 否 | 否 | 项目id或code |
| project_name | string | 否 | 否 | 项目名称 |
| sourceid | string | 否 | 否 | 上游单据主表id |
| sourceautoid | string | 否 | 否 | 上游单据子表id |
| source | string | 否 | 否 | 上游单据类型 |
| upcode | string | 否 | 否 | 上游单据号 |
| memo | string | 否 | 否 | 备注 |
| _status | string | 否 | 是 | 操作标识 |

## 3. 请求示例

Url: /yonbip/scm/transferapply/batchauditToErp?access_token=访问令牌
Body: {
	"barcode": "",
	"creatorId": "",
	"bustype_code": "",
	"outorg": "",
	"outorg_name": "",
	"outaccount": "",
	"outaccount_name": "",
	"code": "",
	"vouchdate": "",
	"bustype": "",
	"bustype_name": "",
	"breturn": "",
	"merchant": "",
	"merchant_name": "",
	"outstore": "",
	"outstore_name": "",
	"instore": "",
	"instore_name": "",
	"outwarehouse": "",
	"outwarehouse_name": "",
	"inorg": "",
	"inorg_name": "",
	"inaccount": "",
	"inaccount_name": "",
	"inwarehouse": "",
	"inwarehouse_name": "",
	"status": "",
	"bizstatus": "",
	"outdepartment": "",
	"outdepartment_name": "",
	"outbizperson": "",
	"outbizperson_name": "",
	"indepartment": "",
	"indepartment_name": "",
	"inbizperson": "",
	"inbizperson_name": "",
	"operator": "",
	"operator_name": "",
	"settlementAccount": "",
	"settlementAccount_name": "",
	"id": 0,
	"pubts": "",
	"tplid": "",
	"totalQuantity": 0,
	"ecsuiteperson": "",
	"cust": "",
	"cust_name": "",
	"vendor": "",
	"vendor_name": "",
	"currency": "",
	"currency_name": "",
	"natCurrency": "",
	"natCurrency_name": "",
	"exchRate": "",
	"srcBillType": "",
	"totalPieces": 0,
	"dplanshipmentdate": "",
	"dplanarrivaldate": "",
	"receiver": "",
	"receivemobile": "",
	"receiveaddr": "",
	"receivezipcode": "",
	"memo": "",
	"creator": "",
	"createTime": "",
	"createDate": "",
	"modifier": "",
	"modifyTime": "",
	"modifyDate": "",
	"auditor": "",
	"auditTime": "",
	"auditDate": "",
	"closer": "",
	"closeTime": "",
	"currency_priceDigit": "",
	"currency_moneyDigit": "",
	"natCurrency_priceDigit": "",
	"natCurrency_moneyDigit": "",
	"_status": "",
	"transferApplys": [
		{
			"product": "",
			"priceUOM": "",
			"priceQty": "",
			"invPriceExchRate": "",
			"product_cCode": "",
			"product_cName": "",
			"product_model": "",
			"modelDescription": "",
			"manageClass": "",
			"isSerialNoManage": "",
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
			"id": 0,
			"pubts": "",
			"qty": 0,
			"unit": "",
			"unitName": "",
			"invExchRate": 0,
			"subQty": 0,
			"stockUnitId": "",
			"stockUnit_name": "",
			"unitExchangeType": "",
			"unit_Precision": "",
			"stockUnitId_Precision": "",
			"isCanModPrice": "",
			"taxUnitPriceTag": "",
			"oriUnitPrice": 0,
			"oriTaxUnitPrice": 0,
			"oriMoney": 0,
			"oriSum": 0,
			"oriTax": 0,
			"taxRate": "",
			"natUnitPrice": 0,
			"natTaxUnitPrice": 0,
			"natMoney": 0,
			"natSum": 0,
			"natTax": 0,
			"project": "",
			"project_name": "",
			"sourceid": "",
			"sourceautoid": "",
			"source": "",
			"upcode": "",
			"memo": "",
			"_status": ""
		}
	]
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
| code | string | 否 | 状态码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": ""
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


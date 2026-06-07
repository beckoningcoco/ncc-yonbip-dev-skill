---
title: "到货单列表查询"
apiId: "92c18e8cadbb4106a27dcc6bba32a661"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Arrival Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Arrival Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 到货单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Arrival Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/arrivalorder/list

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
| product | long | 否 | 否 | 物料id 示例：1847989053460736 |
| pageIndex | long | 否 | 是 | 页号 示例：1 |
| pageSize | long | 否 | 是 | 每页行数 示例：10 |
| isSum | boolean | 否 | 否 | 是否按照表头查询：true or false 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件集合 |
| field | string | 否 | 否 | 查询条件字段(单据状态,到货单号,到货日期,交易类型,供货供应商,开票供应商,采购组织,收货组织,采购部门,采购业务员,物料,物料SKU,入库状态,仓库) 示例：单据状态 |
| op | string | 否 | 否 | 判断条件：eq：等于、neq：不等于、lt：小于、gt：大于、between：介于、in：包含、nin：不包含、like：模糊匹配、leftlike：左模糊匹配、rightlike：右模糊匹配、is_null：为空、is_not_null：不为空、and：并且、or：或者 示例：eq |
| value1 | string | 否 | 否 | 查询条件值1 示例：0 |
| logicOp | string | 否 | 否 | 连接条件：and 或者 or 示例：and |
| conditions | string | 否 | 否 | 查询条件集合 就是根据哪些字段查询的条件集合 示例：status |
| queryOrders | object | 是 | 否 | 排序字段 |
| field | string | 否 | 否 | 排序条件字段:必须传实体上有的字段;主表字段查询时字段名(例: id);子表字段查询是子表对象.字段名(例：arrivalOrders.id);参照类型只能传id(例:按物料查询只能传物料id,不能传物料code) 示例：id |
| order | string | 否 | 否 | 顺序：asc：正序、desc：倒序 示例：asc |

## 3. 请求示例

Url: /yonbip/scm/arrivalorder/list?access_token=访问令牌
Body: {
	"product": 1847989053460736,
	"pageIndex": 1,
	"pageSize": 10,
	"isSum": false,
	"simpleVOs": [
		{
			"field": "单据状态",
			"op": "eq",
			"value1": "0",
			"logicOp": "and",
			"conditions": "status"
		}
	],
	"queryOrders": [
		{
			"field": "id",
			"order": "asc"
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-10 12:48:41 |
| endPageIndex | long | 否 | 查询结束页 示例：1 |
| recordList | object | 是 | 返回结果对象 |
| pageCount | long | 否 | 页数 示例：1 |
| recordCount | long | 否 | 总记录数 示例：2 |
| sumRecordList | object | 是 | 合计信息 |
| pageSize | long | 否 | 分页大小 示例：10 |
| beginPageIndex | long | 否 | 查询开始页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pubts": "2020-09-10 12:48:41",
		"endPageIndex": 1,
		"recordList": [
			{
				"code": "DH200904000002",
				"natTax": 0,
				"busType_name": "普通到货",
				"productsku_cName": "原材料1-繁體",
				"vendor": 1875147747332352,
				"priceQty": 6,
				"product_cCode": "yx01000001",
				"taxRate": 0,
				"virtualProductAttribute": 0,
				"productsku_cCode": "yx01000001",
				"product_cName": "原材料1-繁體",
				"valuation_RefuseQty": 0,
				"priceUOM_Name": "个",
				"currency_moneyDigit": 2,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"natCurrency_moneyDigit": 2,
				"valuation_AcceptQty": 6,
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"totalInQuantity": 0,
				"id": 1900290228211968,
				"realProductAttributeType": 1,
				"oriTaxUnitPrice": 5,
				"currency_priceDigit": 2,
				"qty": 6,
				"org": "1855091490394368",
				"createTime": "2020-09-04 09:55:11",
				"natCurrency_priceDigit": 2,
				"oriSum": 30,
				"pubts": "2020-09-04 09:55:11",
				"vendor_name": "我的供应商",
				"natMoney": 30,
				"returncount": 0,
				"currency_code": "CNY",
				"oriMoney": 30,
				"priceUOM_Precision": 2,
				"invoiceSupplier_name": "我的供应商",
				"oriTax": 0,
				"refuseqty": 0,
				"isWfControlled": false,
				"purchaseOrg": "1855091490394368",
				"sourceid": 1900287953064192,
				"natTaxUnitPrice": 5,
				"acceptqty": 6,
				"oriUnitPrice": 5,
				"priceUOM": 1875215514866432,
				"status": 0,
				"arrivalOrders_id": 1900290228211969,
				"invoiceSupplier": 1875147747332352,
				"unit": 1875215514866432,
				"productsku": 1875216044987136,
				"realProductAttribute": 1,
				"unit_Precision": 2,
				"product": 1875216040530688,
				"natSum": 30,
				"vouchdate": "2020-09-04 00:00:00",
				"memo": "准备到货单数据",
				"creator": "张三",
				"busType": "110000000000001",
				"natUnitPrice": 5
			}
		],
		"pageCount": 1,
		"recordCount": 2,
		"sumRecordList": [
			{
				"totalInQuantity": 0,
				"natCurrency_moneyDigit": 2,
				"oriTax": 0,
				"qty": 12,
				"oriMoney": 60,
				"valuation_RefuseQty": 0,
				"acceptqty": 12,
				"currency_priceDigit": 2,
				"refuseqty": 0,
				"oriSum": 60,
				"currency_moneyDigit": 4,
				"valuation_AcceptQty": 12,
				"unit_Precision": 2,
				"natMoney": 60,
				"priceUOM_Precision": 2,
				"natSum": 60,
				"natCurrency_priceDigit": 2,
				"natTax": 0,
				"priceQty": 12
			}
		],
		"pageSize": 10,
		"beginPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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


---
title: "销售订单变更列表查询"
apiId: "2365654354482429961"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SO Change"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SO Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单变更列表查询

> `ContentType	application/json` 请求方式	POST | 分类: SO Change (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/voucherorderchange/list

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
| pageIndex | number |
| 小数位数:0,最大长度:28 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:28 | 否 | 是 | 每页行数 示例：10 默认值：10 |
| isSum | boolean | 否 | 否 | 查询表头 默认值：true |
| isVersions | boolean | 否 | 否 | 是否最新版本 默认值：true |
| changeVersion | number |
| 小数位数:0,最大长度:28 | 否 | 否 | 版本号 |
| code | string | 否 | 否 | 单据编号 示例：UO-20220513000001 |
| nextStatusName | string | 否 | 否 | 订单状态, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 示例：CONFIRMORDER |
| open_orderDate_begin | string | 否 | 否 | 制单日期开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_orderDate_end | string | 否 | 否 | 制单结束时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 23:59:59 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据截止时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 23:59:59 |
| simpleVOs | object | 是 | 否 | 查询条件 |
| field | string | 否 | 否 | 查询条件字段名 示例：code |
| op | string | 否 | 否 | 比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：eq |
| value1 | string | 否 | 否 | 查询条件值1 示例：UO-20220513000001 |
| value2 | string | 否 | 否 | 查询条件值2 |
| logicOp | string | 否 | 否 | 分级逻辑符(and,or) |
| queryOrders | object | 否 | 否 | 排序字段 |
| field | string | 否 | 否 | 排序条件字段:必须传实体上有的字段;主表字段查询时字段名(例: id);子表字段查询是子表对象.字段名(例：orderDetails.id);参照类型只能传id(例:按物料查询只能传物料id,不能传物料code)????示例：id 示例：vouchdate |
| order | string | 否 | 否 | 顺序:正序(asc);倒序(desc) 示例：asc |

## 3. 请求示例

Url: /yonbip/SCC/voucherorderchange/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"isSum": true,
	"isVersions": true,
	"changeVersion": 0,
	"code": "UO-20220513000001",
	"nextStatusName": "CONFIRMORDER",
	"open_orderDate_begin": "2022-05-13 00:00:00",
	"open_orderDate_end": "2022-05-13 23:59:59",
	"open_vouchdate_begin": "2022-05-13 00:00:00",
	"open_vouchdate_end": "2022-05-13 23:59:59",
	"simpleVOs": [
		{
			"field": "code",
			"op": "eq",
			"value1": "UO-20220513000001",
			"value2": "",
			"logicOp": ""
		}
	],
	"queryOrders": {
		"field": "vouchdate",
		"order": "asc"
	}
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
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
| pageIndex | number |
| 小数位数:0,最大长度:28 | 否 | 页号 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:28 | 否 | 每页记录数 示例：1 |
| recordCount | number |
| 小数位数:0,最大长度:28 | 否 | 总共记录数 示例：276 |
| recordList | object | 是 | 记录列表 |
| sumRecordList | object | 是 | 合计 |
| pageCount | number |
| 小数位数:0,最大长度:28 | 否 | 总共记录数 |
| beginPageIndex | number |
| 小数位数:0,最大长度:28 | 否 | 页码列表的开始索引 |
| endPageIndex | number |
| 小数位数:0,最大长度:28 | 否 | 页码列表的结束索引 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 276,
		"recordList": [
			{
				"code": "",
				"vouchdate": "",
				"id": 0,
				"originalOrderId": "",
				"salesOrgId": "",
				"salesOrgId_name": "",
				"saleDepartmentId": "",
				"isLowestPrice": true,
				"printCount": 0,
				"inquiry": true,
				"closeReason": "",
				"billBusinessType": 0,
				"orderPrices": {
					"exchangeRateType": "",
					"exchRate": 0,
					"currency": "",
					"natCurrency": "",
					"changeBusinessType": 0
				},
				"createSource": 0,
				"changeVersion": 0,
				"isVersions": true,
				"reasonMemo": "",
				"transactionTypeId": "",
				"transactionTypeId_name": "",
				"agentId": 0,
				"agentId_name": "",
				"receiveContacter": "",
				"receiveContacterPhone": "",
				"purchaseNo": "",
				"corpContact": "",
				"corpContactUserName": "",
				"settlementOrgId_name": "",
				"corpContactUserErpCode": "",
				"payMoney": 0,
				"orderPayMoney": 0,
				"realMoney": 0,
				"orderRealMoney": 0,
				"statusCode": "",
				"nextStatus": "",
				"currentStatus": 0,
				"payStatusCode": "",
				"settlementOrgId": "",
				"lockIn": true,
				"confirmDate": "",
				"payDate": "",
				"orderPayType": "",
				"settlement": "",
				"shippingChoiceId": "",
				"sendDate": "",
				"hopeReceiveDate": "",
				"opposeMemo": "",
				"haveDelivery": true,
				"occupyInventory": "",
				"separatePromotionType": "",
				"reight": 0,
				"totalMoney": 0,
				"rebateCashMoney": 0,
				"particularlyMoney": 0,
				"promotionMoney": 0,
				"unConfirmPrice": 0,
				"confirmPrice": 0,
				"bizId": "",
				"bizName": "",
				"agentRelationId": "",
				"points": "",
				"pubts": "",
				"pubuts": "",
				"orderInvoice": "",
				"orderShippingAddress": "",
				"orderErp": "",
				"deliveryDate": "",
				"isWfControlled": true,
				"verifystate": 0,
				"status": 0,
				"isFinishDelivery": true,
				"productUnitName": "",
				"pointsMoney": 0,
				"createDate": "",
				"creatorId": "",
				"auditorId": "",
				"auditDate": "",
				"closerId": "",
				"closeDate": "",
				"modifierId": "",
				"modifyDate": "",
				"purUOM_Precision": 0,
				"unit_Precision": 0,
				"creator": "",
				"createTime": "",
				"auditor": "",
				"auditTime": "",
				"closeTime": "",
				"closer": "",
				"modifier": "",
				"modifyTime": "",
				"tradeRouteID": "",
				"tradeRouteID_code": "",
				"tradeRouteID_name": "",
				"isEndTrade": 0,
				"tradeRouteLineno": ""
			}
		],
		"sumRecordList": [
			{
				"advRecInvMoney": 0,
				"advRecInvQty": 0,
				"natAdvRecInvMoney": 0,
				"advRecInvTaxMoney": 0,
				"natAdvRecInvTaxMoney": 0,
				"offsetAdvRecInvMoney": 0,
				"offsetAdvRecInvQty": 0,
				"offsetNatAdvRecInvMoney": 0,
				"offsetAdvRecInvTaxMoney": 0,
				"offsetNatAdvRecInvTaxMoney": 0,
				"orderDetailPrices": {
					"totalOutStockConfirmQuantity": 0,
					"totalOutStockConfirmSubQty": 0,
					"totalNewOrderRepQuantity": 0,
					"totalTransferQty": 0
				}
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
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


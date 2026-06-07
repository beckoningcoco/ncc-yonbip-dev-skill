---
title: "库存状态/预留调整详情查询"
apiId: "2179519371042357248"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Adjustment Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 库存状态/预留调整详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Adjustment Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/stockstatuschange/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | number |
| 小数位数:0,最大长度:19 | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/scm/stockstatuschange/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 响应结果描述信息 示例：操作成功 |
| data | object | 否 | 库存状态/预留调整单详情 |
| creator | string | 否 | 创建人 示例：昵称-赵建军 |
| code | string | 否 | 单据编码 示例：TZD20250114000001 |
| modifyDate | string | 否 | 修改时间 示例：2025-01-14 00:00:00 |
| org | string | 否 | 组织id 示例：2033101101360218122 |
| adjustType | string | 否 | 调整类型，预留调整使用该字段，0代表其他，1代表预留到期日调整 示例：0 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| modifier | string | 否 | 修改人 示例：昵称-赵建军 |
| changeType | string | 否 | 单据类型，库存状态调整为statuschange，预留调整为reservechange 示例：statuschange |
| memo | string | 否 | 备注 示例：1 |
| accountOrg | string | 否 | 会计组织id 示例：2033101101360218122 |
| vouchdate | string | 否 | vouchdate 示例：2025-01-14 00:00:00 |
| modifyTime | string | 否 | 单据日期 示例：2025-01-14 17:18:43 |
| stockStatusChanges | object | 是 | 库存状态/预留调整子表详情 |
| createTime | string | 否 | 创建时间 示例：2025-01-14 17:18:28 |
| accountOrg_name | string | 否 | 会计组织名称 示例：JS-全职能 |
| id | string | 否 | 主表id 示例：2178805195405262848 |
| pubts | string | 否 | 时间戳 示例：2025-01-14 17:18:43 |
| org_name | string | 否 | 库存组织名称 示例：JS-全职能 |
| createDate | string | 否 | 创建日期 示例：2025-01-14 00:00:00 |
| status | number |
| 小数位数:0,最大长度:10 | 否 | status 示例：0 |
| traceId | string | 否 | traceId 示例：00dbfd752fd11f0e |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"creator": "昵称-赵建军",
		"code": "TZD20250114000001",
		"modifyDate": "2025-01-14 00:00:00",
		"org": "2033101101360218122",
		"adjustType": "0",
		"isWfControlled": false,
		"modifier": "昵称-赵建军",
		"changeType": "statuschange",
		"memo": "1",
		"accountOrg": "2033101101360218122",
		"vouchdate": "2025-01-14 00:00:00",
		"modifyTime": "2025-01-14 17:18:43",
		"stockStatusChanges": [
			{
				"stockUnit_name": "包",
				"product_cCode": "0002000002",
				"availableSubQty": 10,
				"memo": "3",
				"currentqty": 100,
				"source": "stockanalysis_statuschange_list",
				"subQty": 0,
				"outStockStatusDoc_name": "合格",
				"currentSubQty": 10,
				"product_cName": "JS-条码管理-批次管理",
				"isExpiryDateManage": false,
				"stockUnitId_Precision": 0,
				"id": "2178805195405262849",
				"preStockType": "2028823442781372422",
				"mainid": "2178805195405262848",
				"isSerialNoManage": false,
				"stockSensClue": "～",
				"warehouse": "2033114536018968578",
				"outreserveid": 0,
				"unit": "2028829679090139148",
				"productsku": 0,
				"warehouse_name": "JS-wms仓库",
				"qty": 1,
				"unit_Precision": 2,
				"inreserveid": 0,
				"invExchRate": 10,
				"inventoryowner": 0,
				"stockUnitId": "2028829687680073737",
				"batchno": "JSPC2407020002",
				"makeRuleCode": "stockanalysisTostockStatusChangeReceive",
				"manageByInventory": 0,
				"afterStockType": "2028823442781372422",
				"afterStockType_name": "普通库存",
				"preStockType_name": "普通库存",
				"isBatchManage": true,
				"pubts": "2025-01-14 17:18:43",
				"org_name": "JS-全职能",
				"rowno": 1,
				"product": "2033103412053671945",
				"outStockStatusDoc": "2028823391241765013",
				"org": "2033101101360218122",
				"stockType": 0,
				"unitExchangeType": 0,
				"warehouse_iSerialManage": true,
				"inStockStatusDoc": "2028823391241765016",
				"lineno": 10,
				"ownertype": 0,
				"inStockStatusDoc_name": "不合格",
				"availableqty": 100
			}
		],
		"createTime": "2025-01-14 17:18:28",
		"accountOrg_name": "JS-全职能",
		"id": "2178805195405262848",
		"pubts": "2025-01-14 17:18:43",
		"org_name": "JS-全职能",
		"createDate": "2025-01-14 00:00:00",
		"status": 0
	},
	"traceId": "00dbfd752fd11f0e"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	联系技术人员


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


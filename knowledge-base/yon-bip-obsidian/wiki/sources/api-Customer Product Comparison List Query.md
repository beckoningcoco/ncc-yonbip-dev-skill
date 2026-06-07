---
title: "客户商品对照列表查询"
apiId: "1706712809815932934"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Product Mapping"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Product Mapping]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户商品对照列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer Product Mapping (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/saagentproduct/list

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
| pageIndex | int | 否 | 否 | 页号 默认值：1 |
| pageSize | int | 否 | 否 | 每页行数 默认值：10 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false 默认值：false |
| productId | string | 否 | 否 | 物料id |
| productCode | string | 否 | 否 | 物料编码 |
| agentId | string | 否 | 否 | 客户id |
| agentId_code | string | 否 | 否 | 客户编码 |
| salesOrgId_name | string | 否 | 否 | 销售组织id |
| salesOrgId_code | string | 否 | 否 | 销售组织编码 |
| simpleVOs | object | 是 | 否 | 查询条件 |
| op | string | 否 | 否 | 比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：eq |
| value1 | string | 否 | 否 | 查询条件值1 |
| field | string | 否 | 否 | 查询条件字段名 |
| logicOp | string | 否 | 否 | 分级逻辑符(and,or) 示例：and |
| value2 | string | 否 | 否 | 查询条件值2 |

## 3. 请求示例

Url: /yonbip/digitalModel/saagentproduct/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"isSum": true,
	"productId": "",
	"productCode": "",
	"agentId": "",
	"agentId_code": "",
	"salesOrgId_name": "",
	"salesOrgId_code": "",
	"simpleVOs": [
		{
			"op": "",
			"value1": "",
			"field": "",
			"logicOp": "",
			"value2": ""
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
| data | object | 是 | 调用成功时的返回数据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| pageIndex | int | 否 | 页号 |
| pageSize | int | 否 | 每页记录数 |
| recordCount | int | 否 | 总共记录数 |
| recordList | object | 否 | 记录列表 |
| pageCount | int | 否 | 统计页数 |
| beginPageIndex | int | 否 | 起始页 |
| endPageIndex | int | 否 | 结束页 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"pageIndex": 0,
			"pageSize": 0,
			"recordCount": 0,
			"recordList": {
				"agentId": 0,
				"code": 0,
				"productName": "",
				"skuName": "",
				"id": 0,
				"pubts": "",
				"agentId_name": "",
				"productClassId_name": "",
				"skuId": 0,
				"createDate": "",
				"creator": "",
				"productClassId": 0,
				"productId": 0,
				"unitName": "",
				"agentRelationId": 0,
				"productCode": "",
				"createTime": "",
				"salesOrgId_name": "",
				"skuCode": "",
				"agentId_code": "",
				"salesOrgId": "",
				"detail": {
					"agentSkuCode": "",
					"agentProductName": "",
					"agentProductCode": "",
					"agentSkuName": ""
				}
			},
			"pageCount": 0,
			"beginPageIndex": 0,
			"endPageIndex": 0
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


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


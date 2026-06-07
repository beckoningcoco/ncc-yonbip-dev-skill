---
title: "合同变更单列表查询"
apiId: "2154209214786437122"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Change"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同变更单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Change (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/changelist

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
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 |
| ctCode | string | 否 | 否 | 合同单据号 |
| code | string | 否 | 否 | 变更单单据号 |
| name | string | 否 | 否 | 合同名称 |
| signOrgId | string | 是 | 是 | 签约组织 |
| status | string | 否 | 否 | 变更单状态（0自由3审批中1审批通过2审批不通过6664已取消，） |
| open_createDate_begin | string | 否 | 否 | 单据日期开始时间格式为:yyyy-MM-dd 示例：2021-09-07 |
| open_createDate_end | string | 否 | 否 | 单据日期结束时间格式为:yyyy-MM-dd 示例：2021-09-09 |
| ctBustype | string | 否 | 否 | 合同类型 |
| simpleVOs | object | 否 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 字段(pubts:时间戳、creator:创建人名称) |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |
| value1 | string | 否 | 否 | 查询条件值1 |
| value2 | string | 否 | 否 | 查询条件值2 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/changelist?access_token=访问令牌
Body: {
	"pageSize": 0,
	"pageIndex": 0,
	"ctCode": "",
	"code": "",
	"name": "",
	"signOrgId": [
		""
	],
	"status": "",
	"open_createDate_begin": "2021-09-07",
	"open_createDate_end": "2021-09-09",
	"ctBustype": "",
	"simpleVOs": {
		"field": "",
		"op": "",
		"value1": "",
		"value2": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | number |
| 小数位数:1,最大长度:10 | 否 | 页码 |
| pageSize | number |
| 小数位数:1,最大长度:10 | 否 | 每页条数 |
| recordList | object | 是 | 列表数据 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordList": [
			{
				"code": "",
				"ctCode": "",
				"createDate": "2026-06-07 12:01:22",
				"acctEntityId": "",
				"acctEntity_name": "",
				"businessCode": "",
				"name": "",
				"status": "",
				"ctVouchdate": "2026-06-07 12:01:22",
				"bustype": "",
				"bustype_name": "",
				"ctVersion": "",
				"signOrgId": "",
				"signOrgId_name": "",
				"supplierId": "",
				"supplierId_name": "",
				"currencyId": "",
				"currencyId_name": "",
				"current_auditor": "",
				"creatorId": "",
				"creator": "",
				"modifyTime": "2026-06-07 12:01:22",
				"modifyDate": "2026-06-07 12:01:22",
				"modifierId": "",
				"modifier": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	系统异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


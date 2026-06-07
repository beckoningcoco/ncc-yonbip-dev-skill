---
title: "异构单据对账"
apiId: "1851548667644215304"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 异构单据对账

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/query/queryReconciliation

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
| busiSysCode | string | 否 | 是 | 业务系统编码 |
| billCode | string | 否 | 是 | 单据类型编码 |
| startDate | string | 否 | 是 | 开始时间 |
| endDate | string | 否 | 是 | 结束时间 |
| pageIndex | string | 否 | 是 | 当前页 |
| pageSize | string | 否 | 是 | 每页条数 |
| billNos | string | 是 | 否 | 单据号批量查询 |
| billIds | string | 否 | 否 | 单据id批量查询 |
| transacCode | string | 否 | 否 | 交易类型编码 |
| queryCondition | object | 否 | 否 | 其他查询条件 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/query/queryReconciliation?access_token=访问令牌
Body: {
	"busiSysCode": "",
	"billCode": "",
	"startDate": "",
	"endDate": "",
	"pageIndex": "",
	"pageSize": "",
	"billNos": [
		""
	],
	"billIds": "",
	"transacCode": "",
	"queryCondition": {}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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


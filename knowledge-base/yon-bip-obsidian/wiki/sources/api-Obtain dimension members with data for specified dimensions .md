---
title: "根据数据集获取指定维度有数据的维度成员"
apiId: "1900358806311272454"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planning, Budgeting& Forecasting"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planning, Budgeting& Forecasting]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据数据集获取指定维度有数据的维度成员

> `ContentType	application/json` 请求方式	POST | 分类: Planning, Budgeting& Forecasting (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/bp/dataset/getHasDataMembers

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| datasetCode | string | 否 | 是 | 数据集编码 |
| dimMembers | object | 否 | 否 | 维度及其成员Map<String, List<String>> |
| dimNames | string | 是 | 是 | 指定需要的维度 |
| type | number |
| 小数位数:0,最大长度:2 | 否 | 否 | dimMembers维度成员类型，0：成员编码；1：预算报表组织业务编码 默认值：1 |
| dimAttrIds | object | 否 | 否 | 返回维度对应的属性 |

## 3. 请求示例

Url: /yonbip/qyjx/bp/dataset/getHasDataMembers?access_token=访问令牌
Body: {
	"datasetCode": "",
	"dimMembers": {},
	"dimNames": [
		""
	],
	"type": 0,
	"dimAttrIds": {}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| dimMembersMap | object | 否 | 维度及其成员Map<String, List<DimMemberVo>> |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"dimMembersMap": {}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


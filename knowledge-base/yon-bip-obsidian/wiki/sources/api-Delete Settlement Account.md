---
title: "结算账户删除"
apiId: "909ee939820140c7b6f17898f0af8157"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Account Details"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Account Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算账户删除

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Account Details (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/settlementaccount/delete

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
| data | object | 否 | 是 | 结算账户[bd.settlement.SettlementAccountVO] |
| id | string | 否 | 是 | 主键 |
| name | string | 否 | 是 | 账户代码 |
| accountTypeCode | string | 否 | 是 | 账户类型 |
| salesTypeCode | string | 否 | 是 | s-销售类型 |
| accountDesc | string | 否 | 是 | 账户描述 |
| payTypeCode | string | 否 | 是 | 付款类型 |
| labourRateCode | string | 否 | 是 | 默认工时率代码 |
| labourDiscountCode | string | 否 | 是 | 工时折扣代码 |
| controlAccount | string | 否 | 是 | 控制科目 |
| saleCode | string | 否 | 是 | p-销售类型 |
| taxCode | string | 否 | 是 | 税率代码 |
| partsMaintainCode | string | 否 | 是 | 配件维修折扣代码 |
| partsDiscountCode | string | 否 | 是 | 配件折扣代码 |
| ownerCode_name | string | 否 | 否 | 经销商代码名称名称 |
| ownerCode | string | 否 | 是 | 经销商代码主键 |
| subjectId_name | string | 否 | 否 | 财务云科目名称名称 |
| subjectId | string | 否 | 是 | 财务云科目主键 |
| dataSource | string | 否 | 是 | 数据来源 |
| enable | string | 否 | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| pubts | string | 否 | 否 | 时间戳，yyyy-MM-dd HH:mm:ss |
| log | string | 否 | 是 | 日志 |
| dr | string | 否 | 是 | 删除状态，0未删除 1已删除 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |

## 3. 请求示例

Url: /yonbip/digitalModel/settlementaccount/delete?access_token=访问令牌
Body: {
	"data": {
		"id": "",
		"name": "",
		"accountTypeCode": "",
		"salesTypeCode": "",
		"accountDesc": "",
		"payTypeCode": "",
		"labourRateCode": "",
		"labourDiscountCode": "",
		"controlAccount": "",
		"saleCode": "",
		"taxCode": "",
		"partsMaintainCode": "",
		"partsDiscountCode": "",
		"ownerCode_name": "",
		"ownerCode": "",
		"subjectId_name": "",
		"subjectId": "",
		"dataSource": "",
		"enable": "",
		"pubts": "",
		"log": "",
		"dr": "",
		"_status": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 主键 |
| name | string | 否 | 账户代码 |
| accountTypeCode | string | 否 | 账户类型 |
| salesTypeCode | string | 否 | s-销售类型 |
| accountDesc | string | 否 | 账户描述 |
| payTypeCode | string | 否 | 付款类型编码 |
| labourRateCode | string | 否 | 默认工时率代码 |
| labourDiscountCode | string | 否 | 工时折扣代码 |
| controlAccount | string | 否 | 控制科目 |
| saleCode | string | 否 | p-销售类型 |
| taxCode | string | 否 | 税率代码 |
| partsMaintainCode | string | 否 | 配件维修折扣代码 |
| partsDiscountCode | string | 否 | 配件折扣代码 |
| ownerCode_name | string | 否 | 经销商代码名称名称 |
| ownerCode | string | 否 | 经销商代码主键 |
| subjectId_name | string | 否 | 财务云科目名称名称 |
| subjectId | string | 否 | 财务云科目主键 |
| dataSource | string | 否 | 数据来源 |
| enable | string | 否 | 启用状态，0初始化 1启用 2停用 |
| dr | string | 否 | 删除状态，0未删除 1已删除 |
| pubts | string | 否 | 时间戳，yyyy-MM-dd HH:mm:ss |
| log | string | 否 | 日志 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"name": "",
		"accountTypeCode": "",
		"salesTypeCode": "",
		"accountDesc": "",
		"payTypeCode": "",
		"labourRateCode": "",
		"labourDiscountCode": "",
		"controlAccount": "",
		"saleCode": "",
		"taxCode": "",
		"partsMaintainCode": "",
		"partsDiscountCode": "",
		"ownerCode_name": "",
		"ownerCode": "",
		"subjectId_name": "",
		"subjectId": "",
		"dataSource": "",
		"enable": "",
		"dr": "",
		"pubts": "",
		"log": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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


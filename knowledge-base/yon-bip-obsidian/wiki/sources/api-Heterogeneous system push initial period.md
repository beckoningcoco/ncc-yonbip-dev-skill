---
title: "异构系统推期初"
apiId: "1851554001993596929"
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

# 异构系统推期初

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/isomeryPushOpening

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
| ruleStartInfo | string | 否 | 是 | 规则启动唯一标识 |
| uniqueKey | string | 否 | 否 | 子级消息id |
| collectionAlgorithm | string | 否 | 否 | 业务方期初数据归集算法 |
| compressFlag | string | 否 | 是 | 单据信息是否压缩 |
| compressBills | string | 否 | 否 | 压缩后的单据信息 |
| isBatches | object | 否 | 否 | 是否分批消费消息 |
| batchindex | int | 否 | 否 | 当前批次,从1开始 |
| batchTotal | int | 否 | 否 | 总批次 |
| bills | object | 是 | 是 | 单据信息 |
| requestUniqueId | string | 否 | 是 | 幂等标识 |
| ytenantId | string | 否 | 否 | 租户id |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/isomeryPushOpening?access_token=访问令牌
Body: {
	"busiSysCode": "",
	"ruleStartInfo": "",
	"uniqueKey": "",
	"collectionAlgorithm": "",
	"compressFlag": "",
	"compressBills": "",
	"isBatches": {
		"batchindex": 0,
		"batchTotal": 0
	},
	"bills": [
		{}
	],
	"requestUniqueId": "",
	"ytenantId": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 响应码 示例：200 |
| message | string | 否 | 提示信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	校验失败


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


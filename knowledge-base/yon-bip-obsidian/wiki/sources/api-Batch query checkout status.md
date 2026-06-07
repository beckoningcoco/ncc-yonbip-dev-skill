---
title: "批量查询结账状态"
apiId: "2209903979768840199"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Ledger"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量查询结账状态

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/settleInfo

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
| books | string | 是 | 是 | 账簿（可批量） 示例：[1566777788889999001, 1566777788889999002] |
| period | string | 否 | 是 | 期间 示例：'2025-02' |

## 3. 请求示例

Url: /yonbip/EFI/settleInfo?access_token=访问令牌
Body: {
	"books": [
		1566777788889999001,
		1566777788889999002
	],
	"period": "'2025-02'"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| settleStatus | boolean | 否 | 结账状态 示例：true |
| settleTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 结账时间戳 示例：2025-02-25 14:54:29 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"settleStatus": true,
		"settleTime": "2025-02-25 14:54:29"
	}
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


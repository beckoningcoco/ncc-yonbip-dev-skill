---
title: "电子影像新增影像任务（客开场景使用）"
apiId: "2115508312445812744"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子影像新增影像任务（客开场景使用）

> `ContentType	application/json` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/img/OtherSystem/addScanTask

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
| billid | string | 否 | 是 | BIP单据id 示例：2107483208898576395 |
| data | object | 否 | 是 | BIP单据数据 |
| businesskey | string | 否 | 是 | BIP单据唯一标识（单据卡片billnum_业务单据id） 示例：ssc_general_work_order_card_2107483208898576395 |
| billno | string | 否 | 是 | BIP单据编号 示例：TYGD241010000002 |
| billdate | string | 否 | 是 | BIP单据日期 示例：2024-10-10 00:00:00 |
| formid | string | 否 | 是 | BIP单据类型关联的formid 示例：GXGD.ssc_general_work_order_card |
| pk_tradetype | string | 否 | 否 | BIP单据交易类型id 示例：2352325289186048 |
| billmaker | string | 否 | 是 | BIP单据制单人（友互通用户id） 示例：48a95bc2-71a8-4c21-9379-db5554a5f667 |
| pk_org | string | 否 | 是 | BIP单据组织id 示例：1977493816082432005 |

## 3. 请求示例

Url: /yonbip/ssc/img/OtherSystem/addScanTask?access_token=访问令牌
Body: {
	"billid": "2107483208898576395",
	"data": {
		"businesskey": "ssc_general_work_order_card_2107483208898576395",
		"billno": "TYGD241010000002",
		"billdate": "2024-10-10 00:00:00",
		"formid": "GXGD.ssc_general_work_order_card",
		"pk_tradetype": "2352325289186048",
		"billmaker": "48a95bc2-71a8-4c21-9379-db5554a5f667",
		"pk_org": "1977493816082432005"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回值编码 |
| message | string | 否 | 返回值信息 |
| data | object | 否 | 返回值内容 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023070105411	抱歉~系统异常，请联系管理员。


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


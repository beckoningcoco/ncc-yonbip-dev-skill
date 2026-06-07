---
title: "维度管理丨维度体系丨维度体系信息查询"
apiId: "1892985223619018755"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Dimension Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Dimension Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 维度管理丨维度体系丨维度体系信息查询

> `ContentType	application/json` 请求方式	POST | 分类: Dimension Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/bp/v1.0/dimhiers

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
| cubeId | string | 否 | 否 | 模型主键 示例：1889341287354073097 |

## 3. 请求示例

Url: /yonbip/qyjx/bp/v1.0/dimhiers?access_token=访问令牌
Body: {
	"cubeId": "1889341287354073097"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回状态码 示例：200 |
| data | object | 是 | data |
| dimId | string | 否 | 维度主键 示例：TB_DIMDEF_ENTITY_000 |
| dimCode | string | 否 | 维度编码 示例：ENTITY |
| dimHierId | string | 否 | 维度体系主键 示例：1834253246538973190 |
| dimHierCode | string | 否 | 维度体系编码 示例：gg |
| multiLang | object | 否 | 维度体系多语对象 |
| success | boolean | 否 | success 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"dimId": "TB_DIMDEF_ENTITY_000",
			"dimCode": "ENTITY",
			"dimHierId": "1834253246538973190",
			"dimHierCode": "gg",
			"multiLang": {
				"simplifiedName": "ggg",
				"englishName": "",
				"traditionalName": ""
			}
		}
	],
	"success": true
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


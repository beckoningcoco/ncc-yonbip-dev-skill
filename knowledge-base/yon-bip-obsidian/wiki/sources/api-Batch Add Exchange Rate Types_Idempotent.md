---
title: "汇率类型批量新增_幂等"
apiId: "1941874604430589952"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Exchange Rate Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Exchange Rate Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率类型批量新增_幂等

> `ContentType	application/json` 请求方式	POST | 分类: Exchange Rate Type (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/exchangeratetype/batchSave_idempotent

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 业务数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| enable | int | 否 | 是 | 启用状态，0未启用，1启用， 2停用 |
| code | string | 否 | 是 | 编码 |
| name | muti_lang | 否 | 是 | 名称 |
| digit | int | 否 | 是 | 精度,请输入0-18范围内的数字 |
| _status | string | 否 | 是 | 操作标识，Insert插入 Update更新 |
| id | string | 否 | 否 | 主键，更新时ID必传 |
| description | string | 否 | 否 | 描述 |
| syncOriginBank | string | 否 | 否 | 请选择同步源, ICBC:工商银行、BANKCOMM:交通银行、CEBBANK:光大银行、BOC:中国银行、CCB:建设银行、SPDB:浦发银行、SAFE:国家外汇局、ABCHINA:农业银行、CMBCHINA:招商银行、 |
| syncOriginExchangeRate | string | 否 | 否 | 请选择同步规则, 0:现汇买入、1:现汇卖出、3:现钞卖出、2:现钞买入、4:平均价、 |
| autoUpdate | boolean | 否 | 否 | 是否同步更新，true是 false否，当“是否同步更新”传值为true时，参数 同步源、同步规则、同步范围为必填。 |
| syncScope | string | 否 | 否 | 请选择同步范围, 1:仅同步现有币种对、0:同步全部云端币种对、2:自定义币种对同步 同步范围传值为"2:自定义币种对同步"时，参数 汇率类型同步配置自定义表 为必填 |
| exchangeRateTypeConfigDefineVO | object | 是 | 否 | 汇率类型同步配置自定义表 |

## 3. 请求示例

Url: /yonbip/digitalModel/exchangeratetype/batchSave_idempotent?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"enable": 0,
			"code": "",
			"name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"digit": 0,
			"_status": "",
			"id": "",
			"description": "",
			"syncOriginBank": "",
			"syncOriginExchangeRate": "",
			"autoUpdate": true,
			"syncScope": "",
			"exchangeRateTypeConfigDefineVO": [
				{
					"targetCurrencyId": "",
					"targetCurrencyCode": "",
					"sourceCurrencyId": "",
					"sourceCurrencyCode": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 操作数 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 数据集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "test-er",
				"enable": 1,
				"name": {
					"zh_CN": "测试-234"
				},
				"digit": 4,
				"id": "2391951993753856",
				"autoUpdate": false,
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creationtime": "2021-08-17 17:39:23",
				"pubts": "2021-08-17 17:39:24",
				"yhtTenantId": "0000KRFP13N1AJ3BI90000",
				"yhtTenant": "0000KRFP13N1AJ3BI90000",
				"tenant": "0000KRFP13N1AJ3BI90000",
				"yTenantId": "0000KRFP13N1AJ3BI90000"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-30

更新

请求参数 sourceCurrencyId

更新

请求参数 sourceCurrencyCode

api文档中，所有的“源币种”都改为“原币种”


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


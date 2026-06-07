---
title: "应付结算清单批量审核"
apiId: "2486898120180367361"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "AP Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AP Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付结算清单批量审核

> `ContentType	application/json` 请求方式	POST | 分类: AP Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/payable/batchaudit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 业务数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 单据id 示例：2497885067567693829 |
| externalData | object | 否 | 否 | 额外参数 |
| isAsync | boolean | 否 | 否 | 是否异步 默认值：true |

## 3. 请求示例

Url: /yonbip/FCC/payable/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2497885067567693829"
		}
	],
	"externalData": {
		"isAsync": true
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:2 | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data-async | object | 否 | 异步调用返回数据 示例：参数实际名称为data，参照返回示例。 |
| infos | object | 是 | 数据信息 |
| data | object | 否 | 同步调用返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 本次选择记录数 示例：100 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功记录数 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败记录数 |
| messages | string | 是 | 失败原因列表 |
| infos | object | 是 | 成功数据列表 |
| failInfos | object | 是 | 失败数据列表 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data-async": {
		"0": "参",
		"1": "数",
		"2": "实",
		"3": "际",
		"4": "名",
		"5": "称",
		"6": "为",
		"7": "d",
		"8": "a",
		"9": "t",
		"10": "a",
		"11": "，",
		"12": "参",
		"13": "照",
		"14": "返",
		"15": "回",
		"16": "示",
		"17": "例",
		"18": "。",
		"infos": [
			{
				"url": "/bill/asyncBatchActionQuery/batchaudit",
				"asyncKey": "batchaudit_ee75bc18-2045-44a6-bb8b-cec0b30beed4"
			}
		]
	},
	"data": {
		"count": 100,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": ""
			}
		],
		"failInfos": [
			{
				"id": "",
				"message": ""
			}
		]
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


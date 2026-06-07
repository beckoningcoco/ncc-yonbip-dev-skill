---
title: "管控范围删除"
apiId: "2339104000533069826"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Control Scope"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Control Scope]
platform_version: "BIP"
source_type: community-api-docs
---

# 管控范围删除

> `ContentType	application/json` 请求方式	POST | 分类: Control Scope (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/iuap-apdoc-finbd/bill/batchdelete

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
| billnum | string | 否 | 否 | billnum 示例：bd_controlscopelist |
| data | object | 是 | 否 | data |
| accpurpose_name | string | 否 | 否 | accpurpose_name 示例：利润中心核算目的 |
| code | string | 否 | 否 | code 示例：1115test |
| name | object | 否 | 否 | name |
| currency_name | string | 否 | 否 | currency_name 示例：人民币 |
| rate_class_name | string | 否 | 否 | rate_class_name 示例：基准汇率 |
| accperiodscheme_name | string | 否 | 否 | accperiodscheme_name 示例：基准会计期间方案 |
| accsubjectchart_name | string | 否 | 否 | accsubjectchart_name 示例：责任km1 |
| converparam | string | 否 | 否 | converparam 示例：1 |
| accountingMode | string | 否 | 否 | accountingMode 示例：opl |
| currency | string | 否 | 否 | currency 示例：1525643705855773169 |
| blnMultilevelAccounting | boolean | 否 | 否 | blnMultilevelAccounting 示例：false |
| rate_class | string | 否 | 否 | rate_class 示例：0000L6YQ8AVLFUZPXD0000 |
| accsubjectchart | string | 否 | 否 | accsubjectchart 示例：1528697590795206662 |
| id | string | 否 | 否 | id 示例：1591801500887678978 |
| stopstatus | boolean | 否 | 否 | stopstatus 示例：false |
| accperiodscheme | string | 否 | 否 | accperiodscheme 示例：1525643714430500925 |
| accpurpose_property | number |
| 小数位数:0,最大长度:10 | 否 | 否 | accpurpose_property 示例：0 |
| externalData | object | 否 | 否 | externalData |
| isAsync | boolean | 否 | 否 | isAsync 示例：true |

## 3. 请求示例

Url: /yonbip/FCC/iuap-apdoc-finbd/bill/batchdelete?access_token=访问令牌
Body: {
	"billnum": "bd_controlscopelist",
	"data": [
		{
			"accpurpose_name": "利润中心核算目的",
			"code": "1115test",
			"name": {
				"zh_CN": "1115test"
			},
			"currency_name": "人民币",
			"rate_class_name": "基准汇率",
			"accperiodscheme_name": "基准会计期间方案",
			"accsubjectchart_name": "责任km1",
			"converparam": "1",
			"accountingMode": "opl",
			"currency": "1525643705855773169",
			"blnMultilevelAccounting": false,
			"rate_class": "0000L6YQ8AVLFUZPXD0000",
			"accsubjectchart": "1528697590795206662",
			"id": "1591801500887678978",
			"stopstatus": false,
			"accperiodscheme": "1525643714430500925",
			"accpurpose_property": 0
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
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：0 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | sucessCount 示例：0 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | string | 是 | messages |
| infos | object | 是 | infos |
| failInfos | string | 是 | failInfos |
| traceId | string | 否 | traceId 示例：be3be8ee811c4137 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"url": "/bill/status/getBatchDoProcess",
				"asyncKey": "delete_E1337439-E5EB-5E57-C24D-B16FDBD2E828"
			}
		],
		"failInfos": [
			""
		]
	},
	"traceId": "be3be8ee811c4137",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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


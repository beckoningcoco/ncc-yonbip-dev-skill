---
title: "账簿类型批量同步"
apiId: "2315317372146679810"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Book"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Book]
platform_version: "BIP"
source_type: community-api-docs
---

# 账簿类型批量同步

> `ContentType	application/json` 请求方式	POST | 分类: Account Book (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/accbooktype/bill/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| key | string | 否 | 否 | 来源系统的唯一主键字段名称 示例：objid 默认值：objid |
| billnum | string | 否 | 否 | 单据编码 示例：fiepub_accountbooktypecard 默认值：fiepub_accountbooktypecard |
| data | object | 是 | 否 | 请求数据 |
| code | string | 否 | 否 | 编码 示例：0090 |
| name | object | 否 | 否 | 名称 |
| shortname | object | 否 | 否 | 简称 |
| accperiodscheme | string | 否 | 否 | 会计期间方案id 示例：1525696894715559940 |
| accperiodscheme_code | string | 否 | 否 | 期间方案编码 |
| accsubjectchart | string | 否 | 否 | 科目表id 示例：1549337837826473987 |
| accsubjectchart_code | string | 否 | 否 | 科目表编码 示例：20222 |
| currency | string | 否 | 否 | 币种id 示例：1625100244877836315 |
| currency_code | string | 否 | 否 | 币种编码 示例：CNY |
| isexternal | boolean | 否 | 否 | 对外核算 示例：true |
| isinner | boolean | 否 | 否 | 对内核算 示例：false |
| _status | string | 否 | 否 | 操作状态 示例：Insert |
| objid | string | 否 | 否 | 来源系统的唯一主键值 |

## 3. 请求示例

Url: /yonbip/FCC/accbooktype/bill/save?access_token=访问令牌
Body: {
	"key": "objid",
	"billnum": "fiepub_accountbooktypecard",
	"data": [
		{
			"code": "0090",
			"name": {
				"zh_CN": "账簿类型",
				"en_US": "",
				"zh_TW": ""
			},
			"shortname": {
				"zh_CN": "检查",
				"en_US": "",
				"zh_TW": ""
			},
			"accperiodscheme": "1525696894715559940",
			"accperiodscheme_code": "",
			"accsubjectchart": "1549337837826473987",
			"accsubjectchart_code": "20222",
			"currency": "1625100244877836315",
			"currency_code": "CNY",
			"isexternal": true,
			"isinner": false,
			"_status": "Insert",
			"objid": ""
		}
	]
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 提示信息集合 |
| infos | object | 是 | 同步成功的数据 |
| failInfos | string | 是 | 失败提示信息 |

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
				"code": "0091",
				"name": {
					"zh_CN": "账簿类型1",
					"en_US": "",
					"zh_TW": ""
				},
				"shortname": {
					"zh_CN": "检查",
					"en_US": "",
					"zh_TW": ""
				},
				"accperiodscheme": "1525696894715559940",
				"accperiodscheme_code": "",
				"accsubjectchart": "1549337837826473987",
				"accsubjectchart_code": "20222",
				"currency": "1625100244877836315",
				"currency_code": "CNY",
				"isexternal": true,
				"isinner": false,
				"id": "2315318076519219204",
				"ytenant": "0000L6YTYEY5FUZPXE0000",
				"objid": "111"
			}
		],
		"failInfos": [
			""
		]
	}
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


---
title: "科目分页查询"
apiId: "1564116983613489158"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目分页查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounts (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/fipub/basedoc/querybd/accsubjectByPager

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| fields | string | 是 | 否 | 档案属性:主键、编码、名称、辅助核算、助记码 示例：["id","code","name","multidimension","mnemoniccode"] |
| pageIndex | long | 否 | 否 | 页号 示例：1 |
| pageSize | long | 否 | 否 | 每页行数 示例：20 |
| conditions | object | 是 | 否 | 自定义查询条件 |
| value | string | 否 | 否 | 值 示例：2019-10-23 14:00:37 |
| field | string | 否 | 否 | 作为查询条件的字段，ts：时间戳（示例：2021-04-24 01:15:48）,accsubjectchart：科目表id（示例：000002F7-3387-4D1A-86FB-6C0B54F66A61）,pk_org：组织机构id（示例：1210882798489856），pk_orgCode：组织机构code（示例：050901），mnemoniccode：助记码（示例：KCXJ），pk_org、pk_orgCode -是通过组织机构查询已启用总账主账簿下的科目表，然后将科目表作为查询条件进行过滤。 |
| operator | string | 否 | 否 | 操作符,>=,=,<= 示例：>= |

## 3. 请求示例

Url: /yonbip/AMP/fipub/basedoc/querybd/accsubjectByPager?access_token=访问令牌
Body: {
	"fields": [
		"id",
		"code",
		"name",
		"multidimension",
		"mnemoniccode"
	],
	"pageIndex": 1,
	"pageSize": 20,
	"conditions": [
		{
			"value": "2019-10-23 14:00:37",
			"field": "",
			"operator": ">="
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
| code | string | 否 | 接口调用返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：查询成功！ |
| data | object | 否 | 业务数据 |
| pageIndex | long | 否 | 页号 示例：1 |
| pageSize | long | 否 | 每页行数 示例：20 |
| recordCount | long | 否 | 总条数 示例：100 |
| recordList | object | 是 | 业务数据 |
| pageCount | long | 否 | 总页数 示例：6 |
| beginPageIndex | long | 否 | 开始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：3 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 100,
		"recordList": [
			{
				"code": "1003",
				"name": "资产",
				"id": "1530831657091203076",
				"mnemoniccode": "PLOK"
			}
		],
		"pageCount": 6,
		"beginPageIndex": 1,
		"endPageIndex": 3
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

0	参数异常	需确认参数正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-03

更新

请求说明

更新

请求参数 fields

更新

请求参数 field

新增

返回参数 mnemoniccode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


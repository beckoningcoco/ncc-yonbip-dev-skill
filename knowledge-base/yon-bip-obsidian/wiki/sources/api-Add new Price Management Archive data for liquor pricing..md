---
title: "新增白酒核价价格管理档案数据"
apiId: "2143981385828270085"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Liquor Price Management Archive"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Liquor Price Management Archive]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增白酒核价价格管理档案数据

> `ContentType	application/json` 请求方式	POST | 分类: Liquor Price Management Archive (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/excise/liquor/price-archive/add

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
| sourceId | string | 否 | 是 | 数据提供方提供的ID，添加时用来做幂等校验，防止出现重复数据 示例：1112222 |
| orgCode | string | 否 | 是 | 税务组织编码 示例：KK11223 |
| productCode | string | 否 | 是 | 产品编码 示例：001234 |
| priceDetails | object | 是 | 否 | 价格档案明细记录 |
| priceType | string | 否 | 是 | 价格类型(0-出厂价、1-终端销售均价、2-税务局核定价格、3-申报销售均价、4-备案价、5-同类产品计税价) 示例：1 |
| price | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 价格（不含税） 示例：87.99 |
| taxIncludingPrice | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 价格（含税） 示例：90.31 |
| startTime | string | 否 | 是 | 有效期起，格式yyyy-MM-dd 示例：2024-11-01 |
| endTime | string | 否 | 否 | 有效期止，格式yyyy-MM-dd 示例：2024-11-30 |
| remark | string | 否 | 否 | 备注，最大长度50个字符 示例：具体备注内容 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/excise/liquor/price-archive/add?access_token=访问令牌
Body: {
	"sourceId": "1112222",
	"orgCode": "KK11223",
	"productCode": "001234",
	"priceDetails": [
		{
			"priceType": "1",
			"price": 87.99,
			"taxIncludingPrice": 90.31,
			"startTime": "2024-11-01",
			"endTime": "2024-11-30",
			"remark": "具体备注内容"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：成功 |
| data | object | 否 | 数据 |
| id | string | 否 | 新增数据主键 示例：1843482212234166276 |
| sourceId | string | 否 | 业务来源ID 示例：1124213696524 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": {
		"id": "1843482212234166276",
		"sourceId": "1124213696524"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-25

更新

请求参数 priceType

更新返回映射字段

2	2025-07-03

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "批量更新消费税销售数据表"
apiId: "1847680568546820098"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Consumption Tax Sales Data Sheet"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Consumption Tax Sales Data Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量更新消费税销售数据表

> `ContentType	application/json` 请求方式	POST | 分类: Consumption Tax Sales Data Sheet (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/excise/sale-collection/batch-update

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
| id | string | 否 | 是 | 数据唯一标识 示例：1845471203002679300 |
| orgCode | string | 否 | 是 | 主组织编码 示例：MT0000001 |
| period | string | 否 | 是 | 所属期间，格式：yyyy-MM 示例：2023-10 |
| goodsTaxName | string | 否 | 是 | 应税消费品名称 示例：白酒（复合计税） |
| productCode | string | 否 | 否 | 产品编码 示例：2534000004 |
| tax | string | 否 | 否 | 征免税，枚举值（1:征税，2:免税），产品编码为空则必传 示例：1 |
| completePolicy | string | 否 | 否 | 减（免）性质代码。产品编码为空，征免税为免税时必填 示例：0002061004|节能环保涂料免税|《财政部 国家税务总局关于对电池涂料征收消费的通知》财税〔2015〕16号第二条第三款 |
| reliefProductName | string | 否 | 否 | 减免项目名称。产品编码为空，征免税为免税时必填 示例：节能环保涂料免税 |
| saleNumber | BigDecimal | 否 | 否 | 销售数量 示例：896 |
| originalValue | BigDecimal | 否 | 否 | 账面销售数量 示例：754 |
| accountSales | BigDecimal | 否 | 否 | 账面金额 示例：4.82 |
| remark | string | 否 | 否 | 备注 示例：备注信息 |
| projectCode | string | 否 | 否 | 项目编码 示例：30001 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/excise/sale-collection/batch-update?access_token=访问令牌
Body: [{
	"id": "1845471203002679300",
	"orgCode": "MT0000001",
	"period": "2023-10",
	"goodsTaxName": "白酒（复合计税）",
	"productCode": "2534000004",
	"tax": "1",
	"completePolicy": "0002061004|节能环保涂料免税|《财政部 国家税务总局关于对电池涂料征收消费的通知》财税〔2015〕16号第二条第三款",
	"reliefProductName": "节能环保涂料免税",
	"saleNumber": 896,
	"originalValue": 754,
	"accountSales": 4.82,
	"remark": "备注信息",
	"projectCode": "30001"
}]

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
| data | object | 否 | 数据 示例：[{"id":"1843482212234166276","sourceId":"aaf9469e1eb1581fbd66a977e4df3601"}] |
| id | string | 否 | 新增数据主键ID 示例：1843482212234166276 |
| sourceId | string | 否 | 业务来源ID 示例：aaf9469e1eb1581fbd66a977e4df3601 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": [
		{
			"id": "1843482212234166276",
			"sourceId": "aaf9469e1eb1581fbd66a977e4df3601"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-24

更新

请求说明

新增

请求参数 defineTerm


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "未开票记录变更查询(废弃)"
apiId: "c839ea68def44e12a03997a62c688c84"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoice Request"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoice Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 未开票记录变更查询(废弃)

> `ContentType	application/json` 请求方式	POST | 分类: Invoice Request (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/invoice-will/changes

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
| beginTime | string | 否 | 是 | 查询未开票变更开始时间 时间格式yyyy-MM-dd hh:mm:ss 示例：2021-02-01 01:01:10 |
| orgCode | string | 否 | 否 | 开票点编码：在开票点档案中查询，非必填，未填写默认查询所有开票点编码时间段内的变更记录 示例：121231 |
| pageNum | string | 否 | 是 | 页数 示例：1 |
| pageSize | string | 否 | 是 | 每页条数 示例：10 |
| endTime | string | 否 | 是 | 查询未开票变更结束时间 时间格式yyyy-MM-dd hh:mm:ss 示例：2021-02-02 01:01:10 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoice-will/changes?access_token=访问令牌
Body: {
	"beginTime": "2021-02-01 01:01:10",
	"orgCode": "121231",
	"pageNum": "1",
	"pageSize": "10",
	"endTime": "2021-02-02 01:01:10"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 操作信息 示例：SUCCESS |
| data | object | 否 | 返回内容 |
| invoiceWillChangeList | object | 是 | 返回数据 |
| totalCount | string | 否 | 总条数：查询变更的总的记录数 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "SUCCESS",
	"data": {
		"invoiceWillChangeList": [
			{
				"djqqlsh": "12112122",
				"orgCode": "1212121"
			}
		],
		"totalCount": "10"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	开始时间小于结束时间请检查	根据提示修改


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


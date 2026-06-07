---
title: "税费缴款单-编辑实缴金额"
apiId: "2137777752247894019"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Payment Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Payment Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 税费缴款单-编辑实缴金额

> `ContentType	application/json` 请求方式	POST | 分类: Tax Payment Form (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/declare/deduct/edit

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
| records | object | 是 | 是 | 缴款单信息 |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：52370300MJE1351122 |
| deductId | string | 否 | 是 | 缴款单明细表id 示例：2128899633838030850 |
| taxCategory | string | 否 | 是 | 税种 示例：增值税 |
| actualPayAmount | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 实缴金额 示例：146400 |
| deductStatus | string | 否 | 否 | 缴款状态(0-未缴款；2-缴款成功；3-缴款失败) 示例：2 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/declare/deduct/edit?access_token=访问令牌
Body: {
	"records": [
		{
			"nsrsbh": "52370300MJE1351122",
			"deductId": "2128899633838030850",
			"taxCategory": "增值税",
			"actualPayAmount": 146400,
			"deductStatus": "2"
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
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	错误提示信息	错误提示信息


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


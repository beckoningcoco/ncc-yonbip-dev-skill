---
title: "融资预提生单"
apiId: "2359694520439275527"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financing Accrual"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financing Accrual]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资预提生单

> `ContentType	application/json` 请求方式	POST | 分类: Financing Accrual (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/withholding/openapi/create

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 资金组织(可传入ID/编码/名称) 示例：收入中台演示销售组织1 |
| protocolNumber | string | 否 | 是 | 协议号(可传入协议ID/编码/协议号) 示例：YK付息9M19 |
| debtcode | string | 否 | 是 | 借据号(可传入借据ID/编码/借据号) 示例：YK付息9M190001 |
| beginDate | string | 否 | 否 | 预提起息日（未传值由系统默认计算） 示例：2024-07-01 |
| endDate | string | 否 | 是 | 预提止息日 示例：2025-07-01 |
| amountInt | number |
| 小数位数:2,最大长度:20 | 否 | 否 | 预提金额合计（计息币种）未传值由系统默认计算 示例：802.20 |
| localAmount | number |
| 小数位数:2,最大长度:20 | 否 | 否 | 预提金额合计（本币币种） 示例：802.20 |
| deptid | string | 否 | 否 | 部门(可传入ID/编码/名称) 示例：市场部 |
| costCenter | string | 否 | 否 | 成本中心(可传入ID/编码/名称) 示例：组织#20220819A |
| profitCenter | string | 否 | 否 | 利润中心(可传入ID/编码/名称) 示例：项目成本专用 |
| exchangerateType | string | 否 | 否 | 汇率类型(可传入ID/编码/名称) 示例：基准汇率 |
| exchangeRate | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 汇率 示例：1.000000 |
| appointRate | number |
| 小数位数:0,最大长度:15 | 否 | 否 | 利息约定汇率 示例：1.000000 |
| withholdingDetail | object | 是 | 否 | 预提明细（未传值由系统默认计算） |
| beginDate | string | 否 | 否 | 预提起息日 示例：2024-07-01 |
| endDate | string | 否 | 否 | 预提止息日 示例：2025-07-01 |
| interestDays | string | 否 | 否 | 计息天数 示例：365 |
| interestRate | number |
| 小数位数:8,最大长度:15 | 否 | 否 | 利率 示例：2.000000 |
| receiptBalance | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 借据余额（协议币种） 示例：8000.00 |
| withholdingAmountInt | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 预提金额（协议币种） 示例： 802.20 |

## 3. 请求示例

Url: /yonbip/ctm/fm/withholding/openapi/create?access_token=访问令牌
Body: {
	"accentity": "收入中台演示销售组织1",
	"protocolNumber": "YK付息9M19",
	"debtcode": "YK付息9M190001",
	"beginDate": "2024-07-01",
	"endDate": "2025-07-01",
	"amountInt": 802.2,
	"localAmount": 802.2,
	"deptid": "市场部",
	"costCenter": "组织#20220819A",
	"profitCenter": "项目成本专用",
	"exchangerateType": "基准汇率",
	"exchangeRate": 1,
	"appointRate": 1,
	"withholdingDetail": [
		{
			"beginDate": "2024-07-01",
			"endDate": "2025-07-01",
			"interestDays": "365",
			"interestRate": 2,
			"receiptBalance": 8000,
			"withholdingAmountInt": 802.2
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
| code | number |
| 小数位数:2,最大长度:10 | 否 | 状态码 示例：200 |
| data | object | 否 | 数据集 |
| code | string | 否 | 单据编码 示例：YT2509080566 |
| id | string | 否 | 单据ID 示例：2354458534394462224 |
| message | string | 否 | 返回消息 |
| timestamp | string | 否 | 时间戳 示例：1735611415146 |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"code": "YT2509080566",
		"id": "2354458534394462224"
	},
	"message": "",
	"timestamp": "1735611415146"
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


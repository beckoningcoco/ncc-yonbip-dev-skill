---
title: "生成审批通过的融资结息"
apiId: "2053352756925693955"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financing Interest Settlement"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financing Interest Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 生成审批通过的融资结息

> `ContentType	application/json` 请求方式	POST | 分类: Financing Interest Settlement (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tlm/openapi/settleInterest

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
| accentityName | string | 否 | 是 | 会计主体 |
| initialization | string | 否 | 是 | 是否初始化:yes/no |
| protocolNumber | string | 否 | 是 | 协议号 |
| debtCode | string | 否 | 是 | 借据号 |
| planVoucher | string | 否 | 是 | 是否计划结息:yes/no |
| beginDate | string | 否 | 是 | 结息起息日 |
| endDate | string | 否 | 是 | 结息止息日 |
| protocolSumInt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 结息金额合计（计息币种） |
| protocolSumIntAfter | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 结息调整后金额合计（计息币种） |
| appointRate | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 利息约定汇率 |
| protocolSum | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 结息金额合计（协议币种） |
| protocolSumAfter | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 结息调整后金额（协议币种） |
| withHoldingAmountSumInt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已预提金额合计（计息币种），非计划结息时必填 |
| settleInterestDetail | object | 是 | 否 | 结息明细，非计划结息时必填 |
| beginDate | string | 否 | 是 | 结息起息日 |
| endDate | string | 否 | 是 | 结息止息日 |
| interestRate | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 利率（%） |
| receiptBalance | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 借据余额（协议币种） |
| protocolSumInt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 结息金额（计息币种） |
| withHoldingAmountInt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 已预提金额（计息币种） |

## 3. 请求示例

Url: /yonbip/ctm/tlm/openapi/settleInterest?access_token=访问令牌
Body: {
	"accentityName": "",
	"initialization": "",
	"protocolNumber": "",
	"debtCode": "",
	"planVoucher": "",
	"beginDate": "",
	"endDate": "",
	"protocolSumInt": 0,
	"protocolSumIntAfter": 0,
	"appointRate": 0,
	"protocolSum": 0,
	"protocolSumAfter": 0,
	"withHoldingAmountSumInt": 0,
	"settleInterestDetail": [
		{
			"beginDate": "",
			"endDate": "",
			"interestRate": 0,
			"receiptBalance": 0,
			"protocolSumInt": 0,
			"withHoldingAmountInt": 0
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
| code | string | 否 | 错误码，200成功 |
| msg | string | 否 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "",
		"msg": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-31

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


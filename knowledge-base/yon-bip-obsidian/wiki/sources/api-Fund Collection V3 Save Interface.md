---
title: "资金归集V3保存接口"
apiId: "2022168940698927104"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Funds Accumulation (V3)"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Funds Accumulation (V3)]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金归集V3保存接口

> `ContentType	application/json` 请求方式	POST | 分类: Funds Accumulation (V3) (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fdtr/collect/save

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
| accentity | string | 否 | 是 | 归集资金组织，可以传入id或code 示例："2029398873896648709" 或 "ZSZB" |
| receiveCurrency | string | 否 | 是 | 归集币种，可以传入id或code 示例："2029362297966166280" 或 "CNY" |
| receiverSettleMode | string | 否 | 否 | 收款方结算方式，可输入code或者name 示例："system_0001"或者"银行转账" |
| receiveAccount | string | 否 | 是 | 收款方银行账户，可以传入id或code 示例："1956702034117787648" 或 "BH3210003" |
| receiveOlcratetype | string | 否 | 是 | 收款方汇率类型，可以传入id或code 示例："0000LXWJE34WA58UB40000" 或 "01" |
| vouchdate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 单据日期 示例：2024-11-12 |
| remark | string | 否 | 否 | 说明 示例：描述信息 |
| code | string | 否 | 否 | 编码 示例：FUNDCLLECT240617000025 |
| fundCollectBodyList | object | 是 | 是 | 子表实体引用 |
| paymentAccentity | string | 否 | 是 | 付款方资金组织，可以传入id或code 示例："1949249432653398023" 或 "ZSFB" |
| paymentSettleMode | string | 否 | 否 | 付款方结算方式，可输入code或者name 示例："system_0001"或者"银行转账" |
| epayflag | boolean | 否 | 否 | 是否直联: true、false 示例：false |
| paymentAccount | string | 否 | 是 | 付款方银行账户，可以传入id或code 示例："1956702034117787648" 或 "BH3210003" |
| payOlcratetype | string | 否 | 是 | 付款方汇率类型，可以传入id或code 示例："0000LXWJE34WA58UB40000" 或 "01" |
| collectAmount | number |
| 小数位数:8,最大长度:22 | 否 | 是 | 归集金额 示例：100 |
| innerAccount | string | 否 | 否 | 内部账户，可以传入id或code 示例："2012675293473406978" 或 "JSZXH" |
| remark | string | 否 | 否 | 备注 示例：备注信息 |

## 3. 请求示例

Url: /yonbip/ctm/fdtr/collect/save?access_token=访问令牌
Body: {
	"accentity": "\"2029398873896648709\" 或 \"ZSZB\"",
	"receiveCurrency": "\"2029362297966166280\" 或 \"CNY\"",
	"receiverSettleMode": "\"system_0001\"或者\"银行转账\"",
	"receiveAccount": "\"1956702034117787648\" 或 \"BH3210003\"",
	"receiveOlcratetype": "\"0000LXWJE34WA58UB40000\" 或 \"01\"",
	"vouchdate": "2024-11-12",
	"remark": "描述信息",
	"code": "FUNDCLLECT240617000025",
	"fundCollectBodyList": [
		{
			"paymentAccentity": "\"1949249432653398023\" 或 \"ZSFB\"",
			"paymentSettleMode": "\"system_0001\"或者\"银行转账\"",
			"epayflag": false,
			"paymentAccount": "\"1956702034117787648\" 或 \"BH3210003\"",
			"payOlcratetype": "\"0000LXWJE34WA58UB40000\" 或 \"01\"",
			"collectAmount": 100,
			"innerAccount": "\"2012675293473406978\" 或 \"JSZXH\"",
			"remark": "备注信息"
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| accentity | string | 否 | 资金组织 示例：1957418804026802180 |
| receiveCurrency | string | 否 | 币种 |
| receiveAccount | string | 否 | 银行账号 |
| paymentnum | number |
| 小数位数:0,最大长度:10 | 否 | 总笔数 |
| totalamount | number |
| 小数位数:8,最大长度:22 | 否 | 总金额 |
| id | string | 否 | ID |
| code | string | 否 | 编码 |
| fundCollectBodyList | object | 是 | 子表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity": "1957418804026802180",
		"receiveCurrency": "",
		"receiveAccount": "",
		"paymentnum": 0,
		"totalamount": 0,
		"id": "",
		"code": "",
		"fundCollectBodyList": [
			{
				"paymentAccentity": "",
				"paymentAccount": "",
				"payOlcratetype": "",
				"collectAmount": 0,
				"id": ""
			}
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

1	2026-02-27

更新

请求说明

更新

请求参数 fdtrDefineCharacter

更新

请求参数 fdtrDefineCharacter

2	2025-07-29

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


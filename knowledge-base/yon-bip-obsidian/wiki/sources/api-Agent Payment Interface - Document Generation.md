---
title: "代理付款接口-生单"
apiId: "2310086024655011849"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Agent Payment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Agent Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 代理付款接口-生单

> `ContentType	application/json` 请求方式	POST | 分类: Agent Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/fdtr/agentpayment/openapi/save

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
| agentPayments | object | 是 | 否 | 代理付款单对象列表 |
| sourceSystem | string | 否 | 是 | 上游业务系统，支持编码和名称 示例：3 |
| sourceBillType | string | 否 | 是 | 上游单据类型，支持编码和名称 示例：90 |
| settlementCenter | string | 否 | 是 | 结算中心的业务单元名称或编码 示例：用友集团或YYJT |
| businessDate | string | 否 | 是 | 单据日期 示例：2025-05-30 |
| verifyState | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 单据状态，仅支持 0 :开立态 示例：开立态：0 |
| oriCurrency | string | 否 | 是 | 原币币种，支持编码和名称 示例：人民币或CNY |
| tradeType | string | 否 | 是 | 交易类型，支持编码和名称 示例：代理付款：stct_batch_agentpayment，现金支取：stct_batch_agentpayment_cashWithdraw |
| remark | string | 否 | 否 | 备注 |
| sourceId | string | 否 | 否 | 上游业务单据主表id 示例：2414626636856033285 |
| details | object | 是 | 否 | 代理付款单明细 |

## 3. 请求示例

Url: /yonbip/FCC/fdtr/agentpayment/openapi/save?access_token=访问令牌
Body: {
	"agentPayments": [
		{
			"sourceSystem": "3",
			"sourceBillType": "90",
			"settlementCenter": "用友集团或YYJT",
			"businessDate": "2025-05-30",
			"verifyState": NaN,
			"oriCurrency": "人民币或CNY",
			"tradeType": "代理付款：stct_batch_agentpayment，现金支取：stct_batch_agentpayment_cashWithdraw",
			"remark": "",
			"sourceId": "2414626636856033285",
			"details": [
				{
					"supplementary": "是",
					"settleMode": "银行转账或system_0001",
					"expectSettleDate": "2025-06-26",
					"currAcctNo": "曾式分部或6226033845759225",
					"directPay": "是",
					"currCashAcct": "曾式总部或者6226033845759225",
					"note": "512345678901234567890000012003",
					"incomeRelate": "",
					"accentity": "曾式总部或者ZSZB",
					"interAcc": "曾式分部或者INT00158793448852",
					"payProject": "",
					"natRateType": "本币汇率类型，支持编码和名称    示例: 01",
					"natRate": 1,
					"natRateOps": 1,
					"oriAmount": 0,
					"oppType": "1",
					"opp": "",
					"oppAcctType": "2",
					"oppBankAcct": "6228844517796330",
					"oppBankAcctName": "XXX公司",
					"oppBankDotName": "中国工商银行股份有限公司北京樱桃园支行",
					"oppBankLineNo": "102100000064",
					"dept": "",
					"expenseItem": "",
					"project": "",
					"wbs": "",
					"activity": "",
					"purpose": "",
					"postScript": "",
					"relateClaimBillId": "",
					"sourceChildId": "2414626636856033285"
				}
			]
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-17

更新

请求说明

新增

请求参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


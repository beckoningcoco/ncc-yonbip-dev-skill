---
title: "执行单保存"
apiId: "1858718849264254984"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Execution"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Execution]
platform_version: "BIP"
source_type: community-api-docs
---

# 执行单保存

> `ContentType	application/json` 请求方式	POST | 分类: Credit Execution (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/camCreditExecuteOpenApi/creditExecuteSave

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
| accentity | string | 否 | 是 | 会计主体 示例：1524864006176636931 |
| agreement | long | 否 | 是 | 授信协议号 示例：1858094979486318596 |
| agreementb | long | 否 | 是 | 授信明细 示例：1858094979486318597 |
| oriPushSerNum | string | 否 | 是 | 外部系统推送唯一编码（流水号 不可重复） 示例：1858094971826918153 |
| oriPushSystem | short | 否 | 是 | 来源系统，7代表外部系统 示例：7 |
| businessNo | string | 否 | 是 | 业务编号 示例：LGKDJ231121001 |
| creditExecutionType | short | 否 | 是 | 类型：1-占用、2-释放 示例：1 |
| businessDate | Date | 否 | 是 | 业务日期 示例：2023-11-11 |
| endDate | Date | 否 | 是 | 到期日期：到期日期需大于等于业务日期 示例：2023-11-30 |
| currency | string | 否 | 是 | 业务币种 示例：1524777565678469141 |
| businessAmt | BigDecimal | 否 | 是 | 金额（业务币种） 示例：10 |
| amt | BigDecimal | 否 | 是 | 金额(授信币种) 示例：10 |
| exchangeRateType | string | 否 | 是 | 汇率类型 示例：0000L6X2BKUY48HCZN0000 |
| exchangeRate | BigDecimal | 否 | 是 | 核算汇率 示例：1 |
| associationNo | string | 否 | 是 | 匹配关联编号：根据业务需要传 示例：LGKDJ231121001 |
| associationId | string | 否 | 是 | 匹配关联主键，根据业务需要传，匹配关联编号+匹配关联主键 需要确定授信执行单唯一性用于释放授信执行单 示例：1858094971826918153 |

## 3. 请求示例

Url: /yonbip/ctm/camCreditExecuteOpenApi/creditExecuteSave?access_token=访问令牌
Body: {
	"accentity": "1524864006176636931",
	"agreement": 1858094979486318596,
	"agreementb": 1858094979486318597,
	"oriPushSerNum": "1858094971826918153",
	"oriPushSystem": 7,
	"businessNo": "LGKDJ231121001",
	"creditExecutionType": 1,
	"businessDate": "2023-11-11",
	"endDate": "2023-11-30",
	"currency": "1524777565678469141",
	"businessAmt": 10,
	"amt": 10,
	"exchangeRateType": "0000L6X2BKUY48HCZN0000",
	"exchangeRate": 1,
	"associationNo": "LGKDJ231121001",
	"associationId": "1858094971826918153"
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | 返回数据 |
| creditExecution | object | 否 | 授信执行单信息 |
| carryForwardAgreement | object | 否 | 结转对应合同主表，传入的合同是失效状态才会返回此参数 |
| carryForwardAgreementb | object | 否 | 结转对应合同子表，传入的合同是失效状态才会返回此参数 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"creditExecution": {
			"id": 1861070068975665158,
			"agreement": 1858094979486318596,
			"agreementb": 1858094979486318597,
			"associationNo": "外部系统调用存入执行单",
			"associationId": "1858094971826918153",
			"endDate": "2023-11-30 00:00:00",
			"amt": 10,
			"oriPushSystem": 7,
			"accentity": "1524864006176636931",
			"oriPushSerNum": "1858094979499918986",
			"businessAmt": 10,
			"businessDate": "2023-11-11 00:00:00",
			"exchangeRateType": "0000L6X2BKUY48HCZN0000",
			"businessNo": "外部系统调用释放执行单",
			"creditExecutionType": 2,
			"exchangeRate": 1,
			"currency": "1524777565678469141",
			"unReleaseAmt": 0,
			"oriCreditExecutionNotReleaseQuota": 10,
			"oriCreditExecution": 1861125156226203655,
			"isCarry": false,
			"code": "CAMEXEC100020230440",
			"creditExecutionStatus": 3,
			"tenant": 2908281797875168,
			"yTenantId": "0000L6X2BKUY48HCZN0000",
			"creditExecutionOriVo": {
				"id": 1861125156226203656,
				"code": "CAMEXEC100020230439",
				"mainid": 1861125156226203655,
				"oriCreditExecution": 1861098304090669064,
				"releaseAmt": 10
			}
		},
		"carryForwardAgreement": {
			"id": 0
		},
		"carryForwardAgreementb": {
			"id": 0
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	错误信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-17

新增

请求参数 creditExecutionCharacterDef

新增

返回参数 creditExecutionCharacterDef


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "风险检查结果查询接口"
apiId: "2074015956239646720"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Risk Management"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Risk Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 风险检查结果查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Risk Management (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/riskresult/queryResult

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
| params | object | 是 | 否 | 请求参数 |
| entityCode | string | 否 | 否 | 资金组织编码 |
| riskConfirmResult | string | 否 | 否 | 风险检查结果 |
| pass | string | 否 | 否 | 规则执行结果 |
| executeDate | string | 否 | 否 | 执行日期 |
| billtypeName | string | 否 | 否 | 适用业务 |
| billNO | string | 否 | 否 | 单据编号 |
| checkSchemaCode | string | 否 | 否 | 风险检查方案 |
| riskItemtemCode | string | 否 | 否 | 风险项 |
| riskOperatorCode | string | 否 | 否 | 触发操作 |
| riskStrategyCode | string | 否 | 否 | 风险策略 |
| riskRuleCode | string | 否 | 否 | 风险规则 |

## 3. 请求示例

Url: /yonbip/ctm/riskresult/queryResult?access_token=访问令牌
Body: {
	"params": [
		{
			"entityCode": "",
			"riskConfirmResult": "",
			"pass": "",
			"executeDate": "",
			"billtypeName": "",
			"billNO": "",
			"checkSchemaCode": "",
			"riskItemtemCode": "",
			"riskOperatorCode": "",
			"riskStrategyCode": "",
			"riskRuleCode": ""
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
| params | object | 否 | 响应参数 |
| entityCode | string | 否 | 资金组织编码 |
| entityName | string | 否 | 资金组织名称 |
| checkSchemaCode | string | 否 | 风险检查方案编码 |
| checkSchemaName | string | 否 | 风险检查方案名称 |
| riskItemtemCode | string | 否 | 风险项 |
| billtypeName | string | 否 | 适用业务 |
| riskOperatorCode | string | 否 | 触发操作 |
| riskLabelCode | string | 否 | 风险标签 |
| riskStrategyCode | string | 否 | 风险策略 |
| billNO | string | 否 | 单据编号 |
| billDetailRowNo | string | 否 | 明细行号 |
| executeDate | string | 否 | 执行日期 |
| riskRuleCode | string | 否 | 风险规则编号 |
| riskRuleName | string | 否 | 风险规则名称 |
| riskConfirmResult | string | 否 | 风险检查结果 |
| pass | string | 否 | 规则执行结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"params": {
			"entityCode": "",
			"entityName": "",
			"checkSchemaCode": "",
			"checkSchemaName": "",
			"riskItemtemCode": "",
			"billtypeName": "",
			"riskOperatorCode": "",
			"riskLabelCode": "",
			"riskStrategyCode": "",
			"billNO": "",
			"billDetailRowNo": "",
			"executeDate": "",
			"riskRuleCode": "",
			"riskRuleName": "",
			"riskConfirmResult": "",
			"pass": ""
		}
	}
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


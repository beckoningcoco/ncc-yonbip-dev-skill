---
title: "上存申请保存接口"
apiId: "2153567074226012161"
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

# 上存申请保存接口

> `ContentType	application/json` 请求方式	POST | 分类: Funds Accumulation (V3) (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fdtr/collectPayUpper/save

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
| requestSeqNo | string | 否 | 是 | 请求流水号（保证唯一性） 示例：req2024121100001 |
| sourceSystem | string | 否 | 是 | 来源系统（CTMFA：资金分析，StwbSettlement：资金结算，ConcentrationOfFunds：资金集中，CapitalPlan：资金计划，ControlOfCash：现金管理，Heterogeneous：异构系统）（外部系统赋值 Heterogeneous 即可） 示例：Heterogeneous |
| paymentAccentity | string | 否 | 是 | 申请方资金组织（支持编码） 示例："ZSZB" |
| applyDate | string | 否 | 是 | 申请日期（yyyy-MM-dd） 示例：2024-12-11 |
| paymentCurrency | string | 否 | 是 | 币种（支持编码） 示例："CNY" |
| auditstatus | string | 否 | 是 | 审批状态（"1"：待提交；"4"：已通过），目前只支持待提交状态 示例："1" |
| paymentExchangerateType | string | 否 | 否 | 申请组织汇率类型（支持编码） 示例："01" |
| paymentExchangerateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 申请组织汇率折算方式，1: *；2: / 示例：1 |
| paymentExchangerate | number |
| 小数位数:8,最大长度:32 | 否 | 否 | 申请组织汇率，①当手工输入汇率时，汇率类型默认为随单自定义汇率；②当原币币种与本币币种一致时，汇率默认为1； 示例：1 |
| remark | string | 否 | 否 | 备注 示例：备注信息 |
| applyReason | string | 否 | 否 | 申请原因 |
| receAccentity | string | 否 | 否 | 收款方资金组织 |
| collectPayUpperBodyList | object | 是 | 是 | 上存申请子表（一个主表最多支持200个子表） |
| strategyBody | string | 否 | 否 | 归集策略编码和归集策略子表付款方银行账户（支持编码、账户号），用分号隔开 示例：strategyCode111;bam600302 |
| paySupplementary | boolean | 否 | 否 | 申请方是否结算补单（未填写则系统默认为否；该字段V5升级新结算流程后生效；未升级，则不生效；） |
| paymentSettleMode | string | 否 | 否 | 申请结算方式，可输入code或name 示例："system_0001"或者"银行转账" |
| paymentAccount | string | 否 | 否 | 申请银行账户（支持编码、账户号）（如果填写归集策略，该字段由归集策略自动带出；如果未填写归集策略，则该字段必填） 示例："BH3210003" |
| superiorOrg | string | 否 | 否 | 收款方资金组织（支持编码）（如果填写归集策略，该字段由归集策略自动带出；如果未填写归集策略，则该字段必填） 示例：“ZSFB” |
| recSupplementary | boolean | 否 | 否 | 收款方是否结算补单（未填写则系统默认为是；该字段V5升级新结算流程后生效；未升级，则不生效；） |
| receiverSettleMode | string | 否 | 否 | 收款方结算方式，可输入code或者name 示例："system_0001"或者"银行转账" |
| superiorAccount | string | 否 | 否 | 收款方账户（支持编码、账户号）（如果填写归集策略，该字段由归集策略自动带出；如果未填写归集策略，则该字段必填） 示例："ZSZB3210003" |
| superiorExchangerateType | string | 否 | 否 | 收款方汇率类型（支持编码） 示例："01" |
| epayflag | boolean | 否 | 否 | 是否直联 示例：true |
| innerAccount | string | 否 | 否 | 内部账户（支持编码、账户号） 示例：“INIF00001” |
| paymentMoney | number |
| 小数位数:8,最大长度:20 | 否 | 是 | 申请金额 示例：300 |
| applyMatter | string | 否 | 否 | 申请事由 示例：上存申请事由 |
| purpose | string | 否 | 否 | 用途 |
| postScript | string | 否 | 否 | 附言 |

## 3. 请求示例

Url: /yonbip/ctm/fdtr/collectPayUpper/save?access_token=访问令牌
Body: [{
	"requestSeqNo": "req2024121100001",
	"sourceSystem": "Heterogeneous",
	"paymentAccentity": "\"ZSZB\"",
	"applyDate": "2024-12-11",
	"paymentCurrency": "\"CNY\"",
	"auditstatus": "\"1\"",
	"paymentExchangerateType": "\"01\"",
	"paymentExchangerateOps": 1,
	"paymentExchangerate": 1,
	"remark": "备注信息",
	"applyReason": "",
	"receAccentity": "",
	"collectPayUpperBodyList": [
		{
			"strategyBody": "strategyCode111;bam600302",
			"paySupplementary": true,
			"paymentSettleMode": "\"system_0001\"或者\"银行转账\"",
			"paymentAccount": "\"BH3210003\"",
			"superiorOrg": "“ZSFB”",
			"recSupplementary": true,
			"receiverSettleMode": "\"system_0001\"或者\"银行转账\"",
			"superiorAccount": "\"ZSZB3210003\"",
			"superiorExchangerateType": "\"01\"",
			"epayflag": true,
			"innerAccount": "“INIF00001”",
			"paymentMoney": 300,
			"applyMatter": "上存申请事由",
			"purpose": "",
			"postScript": ""
		}
	]
}]

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
| data | object | 是 | 返回数据 |
| requestSeqNo | string | 否 | 请求流水号 示例：REQ2024121600005 |
| code | string | 否 | 操作码，单笔数据成功时返回200，单笔数据失败时返回400 示例：400 |
| message | string | 否 | 返回信息 示例：保存成功！ |
| data | string | 否 | 保存成功时返回保存后的数据，code为200时才有值 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"requestSeqNo": "REQ2024121600005",
			"code": "400",
			"message": "保存成功！",
			"data": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	示例：上存申请批量保存接口最多支持20条主表数据！	整体失败时错误码：999

400	示例：申请日期输入有误！	单笔失败时的错误码：400


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-01

新增

请求参数 paymentExchangerateOps

新增

请求参数 paymentExchangerate

新增申请组织汇率、申请组织汇率折算方式

2	2025-09-13

更新

请求说明

新增

请求参数 (6)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "进项税设置"
apiId: "1759383101870440448"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 进项税设置

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/vat-category/set

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
| failMode | string | 否 | 否 | 失败模式 (batch : 批量成功/失败, single : 逐条成功/失败 ) 示例：batch 默认值：batch |
| billType | string | 否 | 是 | 票种类型 invoice:增值税发票/tolls:过路费/train:火车票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票 示例：invoice |
| invoiceCode | string | 否 | 否 | 发票代码（票种为invoice/passenger时必传） 示例：5100194130 |
| invoiceNum | string | 否 | 是 | 发票号码 示例：24427924 |
| ctgryCode | string | 否 | 否 | 进项税分类编码（为空时做取消分类操作，清空进项税分类信息。不抵扣的进项:deduction_input_not_allow 一次性抵扣的进项:deduction_total 用于出口退税的进项:input_export_tax_rebate ） 示例：deduction_total |
| ctgryDetailName | string | 否 | 否 | 进项税分类明细（ctgryCode非空时，此字段必输。如果有值，会和进项税分类里自定义的明细值做一致性校验） 示例：进项税分类1(用途) |
| suggestTax | BigDecimal | 否 | 否 | 建议认证税额（两位小数）票种为invoice时可填入此值 选择了“可抵扣农产品发票”，建议抵扣税额：增值税普通发票、增值税普通收购发票、增值税电子收购发票、增值税电子普通发票：无建议抵扣税额（不可编辑）；增值税专用发票（税率3%）、增值税电子专用发票（税率3%）：选择“一次性抵扣的进项”，等于票面税额，不可编辑；选择“不抵扣的进项”，为“0”不可编辑；增值税专用发票（非3%税率）、增值税电子专用发票（非3%税率）：与“一般可抵扣增值税发票”逻辑一致 示例：10 |
| deductAmount | BigDecimal | 否 | 否 | 可抵扣价税合计（票种为air/train/passenger时可填入此值，两位小数） 示例：0.01 |
| ctgryPeriod | string | 否 | 否 | 应税期（yyyy-MM）抵扣业务必填，不抵扣必不填 示例：2021-03 |
| ctgryBusiType | string | 否 | 否 | 进项税分类类型（common:一般可抵扣增值税发票;agriculture:可抵扣农产品发票;passenger:可抵扣客运服务发票）通行费增值税电子普通发票、机动车销售统一发票：默认为“一般可抵扣增值税发票”。 增值税专用发票、增值税电子专用发票：默认为“一般可抵扣增值税发票”，可选“可抵扣农产品发票”，若该张发票在“退税勾选”中“已勾选”，则选项仅为默认“一般可抵扣增值税发票”。增值税普通发票、增值税普通收购发票、增值税电子收购发票：默认为“可抵扣农产品发票”。增值税电子普通发票：默认为“可抵扣客运 示例：common |
| agriAddDeduction | string | 否 | 否 | 是否加计扣除（Y/N）不填默认为N 增值税专用发票、增值税电子专用发票：待选项为“一次性抵扣的进项”（默认）、“不抵扣的进项”，是否加计扣除选项可选。增值税普通发票、增值税普通收购发票、增值税电子收购发票、增值税电子普通发票：进项税分类仅为默认的“一次性抵扣的进项”，是否加计扣除选项可选。 示例：Y |
| agriDeductionTax | BigDecimal | 否 | 否 | 建议计算抵扣税额（两位小数）增值税普通发票、增值税普通收购发票、增值税电子收购发票、增值税电子普通发票、增值税专用发票（税率3%）、增值税电子专用发票（税率3%）：0<建议计算抵扣税额<=（金额9%），默认（金额9%）可修改。增值税专用发票（非3%税率）、增值税电子专用发票（非3%税率）：无建议计算抵扣税额（不可编辑）。 示例：0.01 |
| precheckStatus | string | 否 | 否 | 预勾选状态（1：预勾选，0：撤销预勾选） 示例：1 |
| deductionInputNotAllowReason | string | 否 | 否 | 不抵扣原因（1 用于非应税项目 2 用于免税项目 3 用于集体福利或者个人消费 4 遭受非正常损失 5 其他） 示例：1 |
| srcBillCode | string | 否 | 否 | 业务系统单据号(当一张发票，分次进入进项业务台账，在台账存在多笔数据时，建议填写。) 示例：GRRD2603030008 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/vat-category/set?access_token=访问令牌
Body: [{
	"failMode": "batch",
	"billType": "invoice",
	"invoiceCode": "5100194130",
	"invoiceNum": "24427924",
	"ctgryCode": "deduction_total",
	"ctgryDetailName": "进项税分类1(用途)",
	"suggestTax": 10,
	"deductAmount": 0.01,
	"ctgryPeriod": "2021-03",
	"ctgryBusiType": "common",
	"agriAddDeduction": "Y",
	"agriDeductionTax": 0.01,
	"precheckStatus": "1",
	"deductionInputNotAllowReason": "1",
	"srcBillCode": "GRRD2603030008"
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
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 是 | 数据 |
| fpDm | string | 否 | 发票代码 |
| fpHm | string | 否 | 发票号码 |
| billType | string | 否 | 发票类型 |
| code | string | 否 | 状态码 |
| msg | string | 否 | 消息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"fpDm": "",
			"fpHm": "",
			"billType": "",
			"code": "",
			"msg": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-23

新增

请求参数 srcBillCode

添加业务系统单据号

2	2025-12-01

更新

请求说明

新增

请求参数 failMode

新增

返回参数 (6)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


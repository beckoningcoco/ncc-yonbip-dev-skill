---
title: "投资利息调整生单"
apiId: "2397724024884428800"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment Interest Adjustment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Interest Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资利息调整生单

> `ContentType	application/json` 请求方式	POST | 分类: Investment Interest Adjustment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/payadjustcollection/openapi/create

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
| action | string | 否 | 否 | 动作(save-保存;submit-提交) 示例：save |
| accentity | string | 否 | 是 | 资金组织(可传入ID/编码/名称) 示例：收入中台演示销售组织 |
| deptid | string | 否 | 否 | 部门 示例：销售部 |
| costCenter | string | 否 | 否 | 成本中心 示例：成本中心A |
| profitCenter | string | 否 | 否 | 利润中心 示例：集团利润中心 |
| protocolNumber | string | 否 | 是 | 协议号(可传入协议ID/编码/协议号) 示例：定期存款A |
| debtcode | string | 否 | 是 | 申购单号(可传入ID/编码/申购单号) 示例：定期存款A001 |
| interestcollection | string | 否 | 否 | 关联收息单号(可传入ID/收息单号) 示例：SX2510240001 |
| interestCollectionStartDate | string | 否 | 是 | 收息起息日 示例：2024-07-24 |
| interestCollectionEndDate | string | 否 | 是 | 收息止息日 示例：2024-08-24 |
| settleParam | string | 否 | 否 | 结算集成参数(资金结算:stwb,不结算:no) 示例：stwb |
| tradeAmount | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 利息调整金额(计息币种) 示例：1000000.00 |
| rateType | string | 否 | 否 | 本币币种汇率类型 示例：基准汇率 |
| rate | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 本币币种汇率 示例：1.00 |
| functionalCurrencyAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 利息调整金额(本币币种) 示例：1000000.00 |
| settledAddition | string | 否 | 否 | 已结算补单( yes:是 no:否) 示例：yes |
| settleStatus | string | 否 | 否 | 结算状态(待结算:0,结算成功:2) 示例：2 |
| settleMethod | string | 否 | 否 | 结算方式 示例：银行转账 |
| ourBankAccount | string | 否 | 否 | 本方银行账户(可传入ID/账号) 示例：INT000000FM02000002 |
| otherType | string | 否 | 否 | 对方类型(资金业务对象:0,其他:1) 示例：1 |
| otherTypeObject | string | 否 | 否 | 对方银行账号(可传入ID/账号) 示例：INT000000FM02000001 |

## 3. 请求示例

Url: /yonbip/ctm/fm/payadjustcollection/openapi/create?access_token=访问令牌
Body: {
	"action": "save",
	"accentity": "收入中台演示销售组织",
	"deptid": "销售部",
	"costCenter": "成本中心A",
	"profitCenter": "集团利润中心",
	"protocolNumber": "定期存款A",
	"debtcode": "定期存款A001",
	"interestcollection": "SX2510240001",
	"interestCollectionStartDate": "2024-07-24",
	"interestCollectionEndDate": "2024-08-24",
	"settleParam": "stwb",
	"tradeAmount": 1000000,
	"rateType": "基准汇率",
	"rate": 1,
	"functionalCurrencyAmount": 1000000,
	"settledAddition": "yes",
	"settleStatus": "2",
	"settleMethod": "银行转账",
	"ourBankAccount": "INT000000FM02000002",
	"otherType": "1",
	"otherTypeObject": "INT000000FM02000001"
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
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| data | object | 否 | 数据集 |
| code | string | 否 | 单据编码 示例：LXTZSX202511050001 |
| id | string | 否 | 单据ID 示例：2354458534394462224 |
| message | string | 否 | 返回消息 |
| timestamp | string | 否 | 时间戳 示例：1735611415146 |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"code": "LXTZSX202511050001",
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


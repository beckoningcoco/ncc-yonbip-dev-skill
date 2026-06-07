---
title: "资源税台账-编辑"
apiId: "2419992408113545222"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Resource tax account"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Resource tax account]
platform_version: "BIP"
source_type: community-api-docs
---

# 资源税台账-编辑

> `ContentType	application/json` 请求方式	POST | 分类: Resource tax account (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/TAX/TAXOHTER/yonbip-fi-taxoth/api/taxRCollection/update

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
| sourceId | string | 否 | 是 | 资源税台账来源ID |
| isTaxCoefficient | string | 否 | 是 | 涉及组成计税系数(是：1；否：2) 示例：1 |
| taxCoefficient | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 组成计税系数(涉及组成计税系数为是时，必填,只能上送大于0的数值) |
| taxablePrice | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 从价-组成计税价格(涉及组成计税系数为“是”并且资源税税源为从价计征时，必填) |
| salesNum | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 从量-销售量(涉及组成计税系数为“是”并且资源税税源为从量计征时，必填) |
| salesNumTotal | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 从价&从量-总销售数量(（涉及组成计税系数为“否”并且资源税税源为从量计征）或者资源税税源为从价计征时，必填) |
| salesAccount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 从价-销售额(涉及组成计税系数为“否”并且资源税税源为从价计征时，必填) |
| miscellaneousAccount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 从价-准予扣除的运杂费(资源税税源为从价计征时，可上送，否则不允许上送) |
| deductionAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 从价-准予扣减的外购应税产品购进金额(资源税税源为从价计征时，可上送，否则不允许上送) |
| purchaseNum | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 从量-准予扣减的外购应税产品购进数量(资源税税源为从量计征，可上送，时否则不允许上送) |
| taxPaid | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 从价&从量-已缴税额 |

## 3. 请求示例

Url: /yonbip/FCC/TAX/TAXOHTER/yonbip-fi-taxoth/api/taxRCollection/update?access_token=访问令牌
Body: [{
	"sourceId": "",
	"isTaxCoefficient": "1",
	"taxCoefficient": 0,
	"taxablePrice": 0,
	"salesNum": 0,
	"salesNumTotal": 0,
	"salesAccount": 0,
	"miscellaneousAccount": 0,
	"deductionAmount": 0,
	"purchaseNum": 0,
	"taxPaid": 0
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 响应信息 示例： 操作成功 |
| data | string | 否 | 响应结果 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "\t操作成功",
	"data": ""
}

## 6. 业务异常码

037-502-102999

获取所有的会计主体异常


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	新增异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-22

新增

请求参数 defineTerm

更新

请求参数 (10)

新增

异常码 037-502-102999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


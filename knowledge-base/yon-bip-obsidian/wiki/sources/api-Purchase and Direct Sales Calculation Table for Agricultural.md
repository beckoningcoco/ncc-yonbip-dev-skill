---
title: "购进农产品直接销售计算表-新增"
apiId: "2007259941011193856"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calculation Sheet for Direct Sales of Purchased Agricultural Products"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calculation Sheet for Direct Sales of Purchased Agricultural Products]
platform_version: "BIP"
source_type: community-api-docs
---

# 购进农产品直接销售计算表-新增

> `ContentType	application/json` 请求方式	POST | 分类: Calculation Sheet for Direct Sales of Purchased Agricultural Products (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/tax-agricultural-sell/add

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
| orgCode | string | 否 | 是 | 组织编码 示例：rzs2 |
| period | string | 否 | 是 | 税款所属期 示例：2024-05 |
| productName | string | 否 | 是 | 产品名称 长度最大100 示例：其他植物|其他 植物 |
| currentSellProduceAmount | number |
| 小数位数:4,最大长度:17 | 否 | 是 | 当期销售货物数量(吨) 示例：100.0009 |
| consumeAmount | number |
| 小数位数:4,最大长度:17 | 否 | 是 | 损耗数量(吨) 示例：0.0009 |
| produceAmount | number |
| 小数位数:4,最大长度:17 | 否 | 是 | 农产品购进数量(吨) 示例：50 |
| initProduceAmount | number |
| 小数位数:4,最大长度:17 | 否 | 否 | 期初库存农产品数量(吨) |
| initAveragePrice | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 期初平均买价(元/吨) |
| currentBuyProduceAmount | number |
| 小数位数:4,最大长度:17 | 否 | 否 | 当期购进农产品数量(吨) |
| currentPrice | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 当期买价(元/吨) |
| deductionRate | number |
| 小数位数:2,最大长度:5 | 否 | 是 | 扣除率(%) 示例：9.00 |
| remark | string | 否 | 否 | 备注 长度最大200 |
| lyid | string | 否 | 是 | 来源id 长度最大200 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/tax-agricultural-sell/add?access_token=访问令牌
Body: [{
	"orgCode": "rzs2",
	"period": "2024-05",
	"productName": "其他植物|其他 植物",
	"currentSellProduceAmount": 100.0009,
	"consumeAmount": 0.0009,
	"produceAmount": 50,
	"initProduceAmount": 0,
	"initAveragePrice": 0,
	"currentBuyProduceAmount": 0,
	"currentPrice": 0,
	"deductionRate": 9,
	"remark": "",
	"lyid": ""
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
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


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


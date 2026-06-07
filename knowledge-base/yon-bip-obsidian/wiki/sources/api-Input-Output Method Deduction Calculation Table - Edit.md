---
title: "投入产出法核定扣除计算表-编辑"
apiId: "2006505074717622275"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calculation Table of Approved Deduction of Input-output Method"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calculation Table of Approved Deduction of Input-output Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 投入产出法核定扣除计算表-编辑

> `ContentType	application/json` 请求方式	POST | 分类: Calculation Table of Approved Deduction of Input-output Method (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/tax-agricultural-output/update

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
| productName | string | 否 | 是 | 产品名称 示例：产品名称 |
| produceName | string | 否 | 是 | 耗用农产品名称 示例：耗用农产品名称 |
| consumeAmount | number |
| 小数位数:6,最大长度:19 | 否 | 是 | 核定的单耗数量(吨) 示例：1.01 |
| initProduceAmount | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 期初库存农产品数量(吨) 示例：1.02 |
| initAveragePrice | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 期初平均买价(元/吨) 示例：1 |
| currentBuyProduceAmount | number |
| 小数位数:6,最大长度:19 | 否 | 是 | 当期购进农产品数量(吨) 示例：1 |
| currentPrice | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 当期买价(元/吨) 示例：1.02 |
| currentAmount | number |
| 小数位数:6,最大长度:19 | 否 | 是 | 当期销售货物数量(吨) 示例：1 |
| deductionRate | number |
| 小数位数:2,最大长度:5 | 否 | 是 | 扣除率(%) 示例：20.01 |
| remark | string | 否 | 否 | 备注 |
| lyid | string | 否 | 是 | 来源ID 示例：22344 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/tax-agricultural-output/update?access_token=访问令牌
Body: {
	"productName": "产品名称",
	"produceName": "耗用农产品名称",
	"consumeAmount": 1.01,
	"initProduceAmount": 1.02,
	"initAveragePrice": 1,
	"currentBuyProduceAmount": 1,
	"currentPrice": 1.02,
	"currentAmount": 1,
	"deductionRate": 20.01,
	"remark": "",
	"lyid": "22344"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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


---
title: "城镇土地使用税台账-变更"
apiId: "1982039824306012163"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Urban land use tax account"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Urban land use tax account]
platform_version: "BIP"
source_type: community-api-docs
---

# 城镇土地使用税台账-变更

> `ContentType	application/json` 请求方式	POST | 分类: Urban land use tax account (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/land-tax-info/alter

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
| orgCode | string | 否 | 是 | 组织编码 示例：91110106MACNT33F8Q |
| landNumber | string | 否 | 否 | 土地编号，土地编号、土地税源编号、土地税源来源id不可同时为空，同时上送时需要校验匹配关系，用于识别土地税源 示例：123123123 |
| changeTime | date |
| 格式:yyyy-MM-dd | 否 | 是 | 变更时间，只可以选择最近应税信息纳税义务有效期起当前及之后月份的时间 示例：2024-01-20 |
| landTaxArea | number |
| 小数位数:2,最大长度:13 | 否 | 是 | 占用土地面积（平米）,0<值<=土地台账基础信息的“土地面积”。 示例：2000.00 |
| landLevel | string | 否 | 否 | 土地等级，需与纳税主体中的【纳税人基本信息】中-【税费种认定信息】城镇土地使用税的税目保持一致 示例：环保税税目 |
| code | string | 否 | 否 | 土地税源编号，土地编号、土地税源编号、土地税源来源id不可同时为空，同时上送时需要校验匹配关系，用于识别土地税源 示例：TDSY20250703000002 |
| lyid | string | 否 | 否 | 土地税源来源id，土地编号、土地税源编号、土地税源来源id不可同时为空，同时上送时需要校验匹配关系，用于识别土地税源 示例：5668546545632423 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/land-tax-info/alter?access_token=访问令牌
Body: {
	"orgCode": "91110106MACNT33F8Q",
	"landNumber": "123123123",
	"changeTime": "2024-01-20",
	"landTaxArea": 2000,
	"landLevel": "环保税税目",
	"code": "TDSY20250703000002",
	"lyid": "5668546545632423"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-04

新增

请求参数 code

新增

请求参数 lyid

更新

请求参数 landNumber

更新

请求参数 landLevel

增加参数


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "汇率方案新增修改删除接口"
apiId: "2069474492183216133"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "EPM Foundation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Foundation]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率方案新增修改删除接口

> `ContentType	application/json` 请求方式	POST | 分类: EPM Foundation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/openapi/exchangerateapi/modify

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
| saveRates | object | 是 | 否 | 新增修改参数列表，该列表用于汇率数据的新增和修改，汇率数据以（源币种，目标币种，汇率编码）为单位，当为修改操作的时候，uniqKey需要传参，代表是修改操作；当为新增操作的时候，uniqKey不需要传参 |
| oriCurr | string | 否 | 是 | 原币种编码；从维度管理中【企业绩效平台】的币种维度获取 |
| tarCurr | string | 否 | 是 | 目标币种编码；从维度管理中【企业绩效平台】的币种维度获取 |
| currRate | string | 否 | 是 | 汇率编码；从维度管理中【企业绩效平台】的【科目-汇率科目】维度获取 |
| rate | number |
| 小数位数:8,最大长度:15 | 否 | 否 | 汇率值，默认最大整数位18，小数位15的正数，不可为0，最终展示以汇率科目对应的精度为准 |
| uniqKey | string | 否 | 否 | 汇率值唯一键，唯一键的生成规范为：md5(汇率方案编码+主体编码+年编码+期间编码+业务方案编码+源币种编码+目标币种编码+汇率编码)，该码值由后端生成，当为修改操作时，需要带上uniqKey参数；当为新增操作时，则不需要传参uniqKey |
| deleteRates | object | 是 | 否 | 删除参数列表,当需要删除某行数据的时候，则需要传参该数组，数组中每条数据是每行中以（源币种，目标币种，汇率编码）为单位，也就是说，如果一行中有平均汇率和期末汇率两种汇率编码，则该数组需要传参两条数据，一条是平均汇率，一条是期末汇率 |
| uniqKey | string | 否 | 是 | 汇率值唯一键，唯一键的生成规范为：md5(汇率方案编码+主体编码+年编码+期间编码+业务方案编码+源币种编码+目标币种编码+汇率编码)，该码值由后端生成，当为删除操作时，需要带上uniqKey参数 |
| exchangeRateId | string | 否 | 是 | 汇率方案id |
| period | string | 否 | 否 | 期间编码 |
| scenario | string | 否 | 是 | 业务方案编码 |
| year | string | 否 | 是 | 年编码 |
| entityCode | string | 否 | 否 | 主体编码 |

## 3. 请求示例

Url: /yonbip/qyjx/openapi/exchangerateapi/modify?access_token=访问令牌
Body: {
	"saveRates": [
		{
			"oriCurr": "",
			"tarCurr": "",
			"currRate": "",
			"rate": 0,
			"uniqKey": ""
		}
	],
	"deleteRates": [
		{
			"uniqKey": ""
		}
	],
	"exchangeRateId": "",
	"period": "",
	"scenario": "",
	"year": "",
	"entityCode": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| error | object | 否 | 错误信息对象 |
| message | string | 否 | 具体的错误信息 |
| code | number |
| 小数位数:8,最大长度:9 | 否 | 错误码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"error": {
			"message": "",
			"code": 0
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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


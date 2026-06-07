---
title: "余额类报表项目数据查询"
apiId: "34251308f32940e6b6e193c0dc1932c3"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Reports"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Reports]
platform_version: "BIP"
source_type: community-api-docs
---

# 余额类报表项目数据查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Reports (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/rpt/balance

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
| accbook | string | 否 | 是 | 账簿id 示例：50890548-D0DD-40BF-92AF-6B2E2AAC7D1C |
| period | string | 否 | 是 | 期间 示例：2021-05 |

## 3. 请求示例

Url: /yonbip/fi/rpt/balance?access_token=访问令牌
Body: {
	"accbook": "50890548-D0DD-40BF-92AF-6B2E2AAC7D1C",
	"period": "2021-05"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 结果信息 |
| data | object | 否 | 数据集 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| accCode | string | 否 | 账簿编码 示例：7001010510 |
| accName | string | 否 | 账簿名称 示例：我的分公司0510 |
| items | object | 是 | 报表项目数据集 |
| code | long | 否 | 状态码 示例：1 |

## 5. 正确返回示例

{
	"message": "",
	"data": {
		"accCode": "7001010510",
		"accName": "我的分公司0510",
		"items": [
			{
				"TERMINAL": 223109,
				"code": "01",
				"name": "通用类",
				"BEGINNING": 157844.25
			}
		]
	},
	"code": 1
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

0	查询失败	根据message提示修改


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


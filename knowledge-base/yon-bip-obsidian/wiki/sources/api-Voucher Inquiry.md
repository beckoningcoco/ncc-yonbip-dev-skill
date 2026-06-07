---
title: "凭证查询"
apiId: "1892318704841523208"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/vouch/open/queryallvouch

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
| pk_cube | string | 否 | 是 | 应用模型主键 |
| displayProp | string | 否 | 是 | 展示格式 示例：codeAndName |
| month | string | 否 | 是 | 月 |
| year | string | 否 | 是 | 年 |
| pageIndex | string | 否 | 是 | 页码索引 示例：0 默认值：0 |
| pageNum | string | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | string | 否 | 是 | 每页行数 示例：20 默认值：20 |
| version | string | 否 | 否 | 版本 默认值：v0 |
| scenario | string | 否 | 是 | 业务参数 示例：Actual 默认值：Actual |
| sysParamJson | object | 否 | 是 | 节点编码 |
| appcode | string | 否 | 是 | 节点编码 示例：BCS09008 默认值：BCS09008 |

## 3. 请求示例

Url: /yonbip/qyjx/vouch/open/queryallvouch?access_token=访问令牌
Body: {
	"pk_cube": "",
	"displayProp": "codeAndName",
	"month": "",
	"year": "",
	"pageIndex": "0",
	"pageNum": "1",
	"pageSize": "20",
	"version": "",
	"scenario": "Actual",
	"sysParamJson": {
		"appcode": "BCS09008"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 |
| data | object | 否 | 数据 |
| allpks | object | 是 | pk集合 |
| pageInfo | object | 否 | 分页信息 |
| rows | object | 是 | 凭证信息 |
| total | object | 否 | 合计 |
| titleList | object | 是 | 列头自定义维度 |

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"allpks": [
			{}
		],
		"pageInfo": {
			"startRow": 0,
			"pageIndex": 0,
			"pageSize": 0,
			"total": 0,
			"totalPage": 0,
			"valueScale": 0,
			"needPaging": true,
			"showUpDown": true
		},
		"rows": [
			{
				"values": {}
			}
		]
	},
	"total": {},
	"titleList": [
		{}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

更新

请求说明

新增

返回参数 (11)

更新

返回参数 (5)

删除

返回参数 success


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


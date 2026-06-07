---
title: "表单版本信息查询"
apiId: "1956086032735141891"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Reports"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Reports]
platform_version: "BIP"
source_type: community-api-docs
---

# 表单版本信息查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Reports (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/queryData/externalFormatInfo

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
| sheetCode | string | 否 | 是 | 表单编码 示例：bd001 |
| params | object | 是 | 是 | 期间组合 |
| years | string | 否 | 是 | 期间年 示例：2023 |
| period | string | 否 | 是 | 期间维度取值范围：月报时：1，2，3，4，5，6，7，8，9，10，11，12； 季报时：Q1,Q2,Q3,Q4 ；半年报时：HY1,HY2 ；年报：自然年；周报：维度管理周类型期间对应的成员编码 示例：1 |

## 3. 请求示例

Url: /yonbip/qyjx/queryData/externalFormatInfo?access_token=访问令牌
Body: {
	"sheetCode": "bd001",
	"params": [
		{
			"years": "2023",
			"period": "1"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| paramDim | object | 是 | 表单关联的维度集合 示例：[{"name":"主体","code":"ENTITY"},{"name":"年","code":"YEARS"}] |
| name | string | 否 | 维度名称 示例：主体 |
| code | string | 否 | 维度编码 示例：ENTITY |
| periodToVersion | object | 否 | 期间组合和版本的对应关系 |
| version | string | 否 | 版本号,如果找不到对应版本返回空 示例：0 |
| years | string | 否 | 期间年 示例：2023 |
| period | string | 否 | 期间 示例：5 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"paramDim": [
			{
				"name": "主体",
				"code": "ENTITY"
			},
			{
				"name": "年",
				"code": "YEARS"
			}
		],
		"periodToVersion": {
			"version": "0",
			"years": "2023",
			"period": "5"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1026111600001	期间参数不能为空

1026111600002	期间参数数量超过{0}个

1026111600003	表单{0}对应的表单组不存在

1026111600004	表单{0}不存在,请核查

1026111600005	表单{0}存在多个,请核查


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


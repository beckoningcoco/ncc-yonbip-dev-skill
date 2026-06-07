---
title: "预算系统取执行数接口"
apiId: "1711895641336578057"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算系统取执行数接口

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/openQueryData

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
| cubeCode | string | 否 | 是 | 查询的预算模型编码（必填） 示例：openCube |
| pageIndex | long | 否 | 是 | 查询页码(查询第几页数据) 示例：1 |
| pageNum | long | 否 | 是 | 每页数量（有最大限制） 示例：200 |
| sysCode | string | 否 | 是 | 系统编码（必填） 示例：openSys |
| dimDatas | object | 是 | 是 | 查询条件(以下条件均为示例条件，由用户注册决定)（必填） |
| cfinaceorg_id | string | 否 | 否 | 示例维度费用承担组织id（模型维度参照） 示例：1665830064185409541 |
| pk_busimemo_id | string | 否 | 否 | 示例维度费用项目 id（模型维度参照） 示例：1763729102030766086 |
| StartDate | string | 否 | 否 | 示例维度开始日期 示例：2023-04-01 |
| pk_project_id | string | 否 | 否 | 示例维度项目id（模型维度参照） 示例：1681648256839319600 |
| month_id | string | 否 | 否 | 示例维度期间（模型维度参照） 示例：2023-04 |
| EndDate | string | 否 | 否 | 示例维度结束日期 示例：2023-04-30 |
| pk_cusdoc_id | string | 否 | 否 | 示例维度供应商id（模型维度参照） 示例：1784824323546021897 |
| pk_customer_id | string | 否 | 否 | 示例维度客户id（模型维度参照） 示例：1784824323546021897 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/openQueryData?access_token=访问令牌
Body: {
	"cubeCode": "openCube",
	"pageIndex": 1,
	"pageNum": 200,
	"sysCode": "openSys",
	"dimDatas": [
		{
			"cfinaceorg_id": "1665830064185409541",
			"pk_busimemo_id": "1763729102030766086",
			"StartDate": "2023-04-01",
			"pk_project_id": "1681648256839319600",
			"month_id": "2023-04",
			"EndDate": "2023-04-30",
			"pk_cusdoc_id": "1784824323546021897",
			"pk_customer_id": "1784824323546021897"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码 示例：200 |
| data | object | 否 | 数据集合 |
| sysCode | string | 否 | 业务系统编码 示例：BP |
| fetchData | object | 是 | 取数规则数据 |
| cubeCode | string | 否 | 模型编码 示例：LucyTest |
| pageTotal | number |
| 小数位数:0,最大长度:300000 | 否 | 当前请求下总页码 示例：1 |
| controlData | object | 是 | 控制规则数据 |
| yTenantId | string | 否 | 租户id 示例：0000LFB1LXT42AAA7X0000 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"sysCode": "BP",
		"fetchData": [
			{
				"CURRENCY": "CNY",
				"P1": "1_FSSC002",
				"actual": "",
				"EndDate": "2023-07-31 23:59:59",
				"StartDate": "2023-07-01 00:00:00",
				"YEARS": "2023",
				"ruleCode": "",
				"ACCOUNT": "AverageRate",
				"ENTITY": "10",
				"XM": "[XM_None]",
				"PERIOD": "7",
				"beforeActual": "",
				"VERSION": "v0",
				"ruleName": "",
				"SCENARIO": "Budget",
				"budget": 0
			}
		],
		"cubeCode": "LucyTest",
		"pageTotal": 1,
		"controlData": [
			{
				"CURRENCY": "CNY",
				"actual": "0.000000000000000",
				"P1": "1_FSSC002",
				"EndDate": "2023-04-30 23:59:59",
				"ruleCode": "LucyRule",
				"StartDate": "2023-04-01 00:00:00",
				"YEARS": "2023",
				"ACCOUNT": "AverageRate",
				"ENTITY": "10",
				"XM": "[XM_None]",
				"beforeActual": "0.000000000000000",
				"PERIOD": "4",
				"VERSION": "v0",
				"ruleName": "Lucy测试规则",
				"SCENARIO": "Budget",
				"budget": 4000
			}
		],
		"yTenantId": "0000LFB1LXT42AAA7X0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	系统错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-27

更新

返回参数 pageTotal


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


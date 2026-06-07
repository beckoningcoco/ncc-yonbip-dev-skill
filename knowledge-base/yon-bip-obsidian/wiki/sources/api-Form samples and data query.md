---
title: "表样及数据查询"
apiId: "1877385722026000385"
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

# 表样及数据查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Reports (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/queryData/externalFormatDataQuery

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
| dimCode | object | 否 | 是 | 参数维度 示例：{ "PERIOD": "12", "ENTITY": "testlongname", "YEARS": "2023" } |
| ENTITY | string | 否 | 是 | 主体维度，必填 示例：[None] |
| YEARS | string | 否 | 是 | 年期间维度,必填 示例：2023 |
| PERIOD | string | 否 | 否 | 期间 根据周期类型 选择月份,季度 Q1,Q2,Q3,Q4或者上半年-HY1,下半年-HY2等 示例：1 |
| ACCOUNT | string | 否 | 否 | 科目,根据表单挂的维度判断是否传递 示例：CurrRate |
| VIEW | string | 否 | 否 | 度量维,根据表单挂的维度判断是否传递 示例：HYTD |
| SCENARIO | string | 否 | 否 | 业务方案,根据表单挂的维度判断是否传递 示例：Actual |
| CURRENCY | string | 否 | 否 | 币种,根据表单挂的维度判断是否传递 示例：CNY |
| VERSION | string | 否 | 否 | 版本,根据表单挂的维度进行判断是否传递 示例：v0 |
| ISTALLY | string | 否 | 否 | 是否计账维度,根据表单挂的维度判断是否传递 示例：N |
| P1~P12 | string | 否 | 否 | P维度,根据表单挂的维度进行判断是否传递这里泛指 示例：[None] |

## 3. 请求示例

Url: /yonbip/qyjx/queryData/externalFormatDataQuery?access_token=访问令牌
Body: {
	"sheetCode": "bd001",
	"dimCode": {
		"PERIOD": "1",
		"ENTITY": "[None]",
		"YEARS": "2023",
		"ACCOUNT": "CurrRate",
		"VIEW": "HYTD",
		"SCENARIO": "Actual",
		"CURRENCY": "CNY",
		"VERSION": "v0",
		"ISTALLY": "N",
		"P1~P12": "[None]"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | int | 否 | 状态码 示例：200 |
| data | object | 否 | 响应业务数据 |
| spans | object | 否 | 合并区域 |
| dataTable | object | 否 | 表样数据 |
| rowCount | string | 否 | 当前表多少行 示例：20 |
| columnCount | string | 否 | 当前表多少列 示例：15 |
| rows | object | 是 | 每行的高度:按行号顺序排列；如果为空则由调用方设置 示例：[{"size":38},{"size":28},{"size":28},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32},{"size":32}] |
| columns | object | 否 | 每列的宽度:按列号顺序排列，如果为空则由调用方自定义 示例：[{"size":319},{"size":44},{"size":218},{"size":218},{"size":343},{"size":50},{"size":211},{"size":211}] |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"spans": {
			"row": "1",
			"col": "1",
			"rowCount": "2",
			"colCount": "3"
		},
		"dataTable": {
			"0": {
				"0": {
					"style": {
						"backColor": "#e6e9f0",
						"foreColor": "#000000",
						"font": "normal normal 21.3333px 宋体"
					},
					"value": "显示值",
					"tag": {
						"itemCode": "ZB1",
						"itemName": "年收入",
						"itemType": "0-货币、1-数量、3-枚举、5-文本、6-日期、7-参照、11-单价、13-百分比、14-长文本、15-附件"
					}
				}
			}
		},
		"rowCount": "20",
		"columnCount": "15",
		"rows": [
			{
				"size": 38
			},
			{
				"size": 28
			},
			{
				"size": 28
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			},
			{
				"size": 32
			}
		],
		"columns": [
			{
				"size": 319
			},
			{
				"size": 44
			},
			{
				"size": 218
			},
			{
				"size": 218
			},
			{
				"size": 343
			},
			{
				"size": 50
			},
			{
				"size": 211
			},
			{
				"size": 211
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

50003	企业报表{0}表单不存在，请确认表单是否启用、发布及有可读权限!

50006	表单已被删除,请刷新重试!

50007	未获取到可用的版本


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-23

更新

请求说明

更新

请求参数 sheetCode

更新

请求参数 PERIOD

表单编码必传

2	2025-11-26

更新

请求说明

更新

请求参数 PERIOD


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


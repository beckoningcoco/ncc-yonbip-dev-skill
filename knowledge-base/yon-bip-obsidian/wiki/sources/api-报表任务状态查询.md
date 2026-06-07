---
title: "报表任务状态查询"
apiId: "2425152562223120390"
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

# 报表任务状态查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Reports (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/EPM/BR/queryData/queryProcessStatus

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
| taskCode | string | 否 | 是 | 报表任务编码 |
| sheetCode | string | 是 | 否 | 表单编码 最大请求量：100 |
| params | object | 是 | 是 | 表单关联的维度集合 最大请求量：100 |
| ENTITY | string | 否 | 否 | 组织编码 |
| YEARS | string | 否 | 否 | 年 |
| PERIOD | string | 否 | 否 | period |

## 3. 请求示例

Url: /yonbip/FCC/EPM/BR/queryData/queryProcessStatus?access_token=访问令牌
Body: {
	"taskCode": "",
	"sheetCode": [
		""
	],
	"params": [
		{
			"ENTITY": "",
			"YEARS": "",
			"PERIOD": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| taskCode | string | 否 | 报表任务编码 |
| sheetCode | string | 是 | 表单编码 |
| status | object | 是 | 维度组合的流程状态 |
| taskStatus | string | 否 | 按任务上报模式使用;1-编制中，2-已提交，3-审批中，4-已上报，5-已退回 |
| sheetCode | string | 否 | 按表单模式上报使用 |
| sheetStatus | string | 否 | 按表单模式上报模式使用；1-编制中，2-已提交，3-审批中，4-已上报，5-已退回 |
| param | object | 否 | 表单关联的维度组合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"taskCode": "",
		"sheetCode": [
			""
		],
		"status": [
			{
				"taskStatus": "",
				"sheetCode": "",
				"sheetStatus": "",
				"param": {
					"ENTITY": "",
					"YERAS": "",
					"PERIOD": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

034-502-000000	报表任务编码不能为空

034-502-000001	报表任务不存在

034-502-000002	按表单上报模式模式表单编码必填

034-502-000003	维度组合不能为空

034-502-000004	表单不存在

034-502-000005	存在表单不属于该任务


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


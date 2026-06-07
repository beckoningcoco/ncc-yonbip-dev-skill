---
title: "要货申请单状态"
apiId: "dfbccd530f3a44a1be1ec5cfed39976c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 要货申请单状态

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/stock/demandapply/save

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
| data | object | 是 | 是 | 表头参数 |
| _status | string | 否 | 是 | 数据状态 （Update） 示例：Update |
| bizstatus | string | 否 | 是 | 0未提交 1已提交 2已审核 3已驳回 示例：2 |
| demandapplydetails | object | 是 | 是 | 表体参数 |
| id | string | 否 | 是 | 要货申请单主表主键 示例：1919094487765504 |
| id__pk | string | 否 | 是 | erp单据主键 示例：1001A11000000071MPCO |

## 3. 请求示例

Url: /yonbip/sd/stock/demandapply/save?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "Update",
			"bizstatus": "2",
			"demandapplydetails": [
				{
					"_status": "Update",
					"approveNum": "31.8",
					"id": "1919094487765505"
				}
			],
			"id": "1919094487765504",
			"id__pk": "1001A11000000071MPCO"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | long | 否 | 接口请求返回编码 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 请求返回总计 |
| count | long | 否 | 返回总条目数 示例：1 |
| sucessCount | long | 否 | 返回成功数 示例：1 |
| failCount | long | 否 | 返回失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 单据信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"data": {
					"bizstatus": "2",
					"demandapplydetails": [
						{
							"approveNum": 10,
							"id": 1919094487765504,
							"demandapply": 1919094487765501
						}
					],
					"id": 1919094487765501,
					"id__pk": "1001A11000000071MPCO",
					"modifier": "YonSuite默认用户",
					"modifierId": 1966881374474496,
					"modifyTime": "2021-03-23 16:35:56",
					"modifyDate": "2021-03-23 16:35:56",
					"barCode": "st_demandapply|1919094487765501",
					"isWfControlled": false,
					"tenant": 1966881373753600
				},
				"key": "1001A11000000071MPCO"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	要货申请单主表的ID数据格式不正确(YHSQ1900366585172224)	检查主表id格式是否为Long型


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


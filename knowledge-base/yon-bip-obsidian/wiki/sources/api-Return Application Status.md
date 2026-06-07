---
title: "退货申请单状态"
apiId: "05e275e30746470f845d73e3b1a06aee"
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

# 退货申请单状态

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/stock/returnapply/save

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
| bizstatus | string | 否 | 是 | 单据状态 （2审核3关闭） 示例：3 |
| id | string | 否 | 是 | 退货申请单主键 示例：1918955228599040 |
| id__pk | string | 否 | 是 | 调入申请单主键 示例：1001A11000000071M6JW |
| demandapplydetails | object | 是 | 是 | 表体参数 |
| key | string | 否 | 是 | 主键字段 示例：id__pk |

## 3. 请求示例

Url: /yonbip/sd/stock/returnapply/save?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "Update",
			"bizstatus": "3",
			"id": "1918955228599040",
			"id__pk": "1001A11000000071M6JW",
			"demandapplydetails": [
				{
					"_status": "Update",
					"approveNum": "0.0",
					"id": "1918955228599041"
				}
			]
		}
	],
	"key": "id__pk"
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
| failInfos | string | 是 | 失败信息 |

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
					"bizstatus": "3",
					"id": 2254187328541440,
					"id__pk": "2254187328541440",
					"fromApi_ustock": true,
					"poiExcelSheetName": "DemandApply(1)",
					"poiExcelRowNum": "1",
					"modifier": "YonSuite默认用户",
					"modifierId": 2035319672344832,
					"modifyTime": "2021-09-02 15:19:57",
					"modifyDate": "2021-09-02 15:19:57",
					"barCode": "st_returnapply|2254187328541440",
					"isWfControlled": false,
					"tenant": 2035319671738624,
					"code": "THSQ000120210512000001",
					"totalQuantity": 1,
					"pubts": "2021-09-02 15:19:59"
				},
				"key": "2254187328541440"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	BillBiz.batchSave4Api : st.demandapply.DemandApply	检查请求报文是否完整


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


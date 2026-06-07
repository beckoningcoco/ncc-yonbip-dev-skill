---
title: "装箱单单个新增"
apiId: "1733329117278896135"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Packing Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Packing Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 装箱单单个新增

> `ContentType	application/json` 请求方式	POST | 分类: Packing Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/boxingrecord/file/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| serviceCode | string | query | 否 | serviceCode    默认值: bcd_boxingrecordlist |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | data |
| org | string | 否 | 是 | 库存组织，传id或code 示例：1541788788672954370 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：ZXD0001 |
| vouchdate | string | 否 | 是 | 单据日期，日期格式:YYYY-MM-DD 示例：2022-05-20 |
| boxingRecords | object | 是 | 是 | 装箱单子表 |

## 3. 请求示例

Url: /yonbip/scm/boxingrecord/file/save?access_token=访问令牌&serviceCode=
Body: {
	"data": [
		{
			"org": "1541788788672954370",
			"code": "ZXD0001",
			"vouchdate": "2022-05-20",
			"boxingRecords": [
				{
					"inBoxCode": "00092230",
					"boxCode": "BOX1",
					"barcodeQty": 2
				}
			]
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数量 示例：1 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 调用成功时的返回数据 |
| failInfos | string | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
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
				"id": 1737040132249747500,
				"code": "ZXD000235",
				"org": "1541788788672954370",
				"vouchdate": "2023-05-30 00:00:00",
				"boxingRecords": [
					{
						"inBoxCode": "00092230",
						"boxCode": "1480",
						"product": 1523263692779552800,
						"product_cCode": "000922",
						"product_cName": "条码动态物料03",
						"productsku": 1705073841701126100,
						"productsku_cCode": "001249",
						"productsku_cName": "条码动态物料03中国共产党党员SYS002",
						"qty": 2,
						"subQty": 2,
						"isBatchManage": false,
						"isExpiryDateManage": false,
						"unit": 1499805955680370700,
						"unit_code": "HUR",
						"unit_name": "小时",
						"unit_Precision": 2,
						"stockUnitId": 1499805955680370700,
						"stockUnit_code": "HUR",
						"stockUnit_name": "小时",
						"stockUnitId_Precision": 2,
						"invExchRate": 1,
						"scanTime": "2023-05-30 11:41:26",
						"rowno": 1,
						"inBoxQty": 1,
						"contactsQuantity": 0,
						"curInBoxQty": 1,
						"id": 1737040132249747500,
						"mainid": 1737040132249747500,
						"pubts": "2023-05-30 11:41:26",
						"tenant": 2860649253051568
					}
				],
				"creatorId": 1499804074584309800,
				"creator": "默认用户",
				"createTime": "2023-05-30 11:41:26",
				"createDate": "2023-05-30 11:41:26",
				"pubts": "2023-05-30 11:41:26",
				"tenant": 2860649253051568
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

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-22

新增

请求参数 serviceCode

222


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


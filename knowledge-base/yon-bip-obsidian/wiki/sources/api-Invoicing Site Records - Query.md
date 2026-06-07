---
title: "开票点档案-查询"
apiId: "1758667388529147905"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Common Settings"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Common Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票点档案-查询

> `ContentType	application/json` 请求方式	POST | 分类: Tax Common Settings (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/station/query

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
| pageSize | int | 否 | 是 | 每页多少条 示例：3 |
| pageNum | int | 否 | 是 | 当前页从1开始 示例：1 |
| code | string | 否 | 否 | 开票点编码 示例：lsq测试开票点 |
| name | string | 否 | 否 | 开票点名称 示例：dd117 |
| nsrshbList | string | 是 | 否 | 纳税人识别号 示例：["555123456888888"] |
| taxbodyIdList | string | 是 | 否 | 纳税主体id列表 示例：[31,42] |
| enable | string | 否 | 否 | 开票点状态，Y-启用，N-停用 示例：Y |
| createtime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间（yyyy-MM-dd HH:mm:ss） 示例：2021-05-21 00:00:00 |
| ts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳（yyyy-MM-dd HH:mm:ss） 示例：2021-05-21 00:00:00 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/station/query?access_token=访问令牌
Body: {
	"pageSize": 3,
	"pageNum": 1,
	"code": "lsq测试开票点",
	"name": "dd117",
	"nsrshbList": [
		"555123456888888"
	],
	"taxbodyIdList": [
		31,
		42
	],
	"enable": "Y",
	"createtime": "2021-05-21 00:00:00",
	"ts": "2021-05-21 00:00:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应编码 示例：200 |
| datas | object | 否 | 开票点档案数据 |
| currentPage | int | 否 | 当前页 示例：10 |
| data | object | 是 | 开票点档案列表 |
| pageSize | int | 否 | 每页多少条数据 示例：1 |
| totalNum | long | 否 | 总页数 示例：26 |
| msg | string | 否 | 消息 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "200",
		"datas": {
			"currentPage": 10,
			"data": [
				{
					"address": "北京市海淀区西北旺镇",
					"bankInfo": [
						{
							"bank": "工商银行",
							"bankAccount": "123456789"
						}
					],
					"basePhone": "13533332222",
					"billingOrgList": [
						{
							"orgcode": "aaa",
							"orgname": "组织啊",
							"type": "finance"
						}
					],
					"contact": "limomo",
					"fhr": "aass",
					"houseRentEntType": 0,
					"kpr": "",
					"logoName": "ddss",
					"meshInfoList": [
						{
							"taxMechCode": "aasss",
							"taxMechName": "税控设备名称",
							"invoiceType": "1",
							"mechType": "a",
							"billingLimit": "1000"
						}
					],
					"motoCompanyType": "",
					"nsrmc": "消费税纳税主体lp",
					"nsrsbh": "20230322",
					"secondMotorType": "1",
					"skr": "",
					"stationCode": "912001123112345678",
					"stationName": "lsq测试11",
					"stationPhone": "15833775798",
					"taxOrgName": "消费税纳税主体lp",
					"enable": "Y",
					"taxbodyId": "21",
					"createtime": "2021-05-21 00:00:00",
					"ts": "2021-05-21 00:00:00",
					"id": 2175598177746419716
				}
			],
			"pageSize": 1,
			"totalNum": 26
		},
		"msg": "success"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	分页参数不合法请检查	分页参数不合法请检查


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-11

新增

返回参数 id

新增API


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


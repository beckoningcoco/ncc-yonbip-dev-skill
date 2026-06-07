---
title: "待开票单据池查询"
apiId: "1821609593067798537"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Doc Pool"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Doc Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 待开票单据池查询

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing Doc Pool (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/yonbip-fi-taxotypd/api/tax-bill-pool/query

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| djId | string | query | 是 | 业务单据号    示例: 12345678901234567890 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxotypd/api/tax-bill-pool/query?access_token=访问令牌&djId=12345678901234567890

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：success |
| data | object | 否 | 返回数据 |
| billPool | object | 否 | 单据池数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"billPool": {
			"djId": "10000000000000IS3X10",
			"djNo": "BJ2304200001Q4",
			"define": {
				"key": "value"
			},
			"billPoolBList": [
				{
					"djmxId": "10000000000002IS3XQB",
					"hh": "1",
					"hisJshj": 80,
					"willJshj": 20,
					"define": {
						"key": "value"
					},
					"fpmxList": [
						{
							"fplx": "1",
							"fpqqlsh": "P1814304738528722949",
							"fpDm": "202311141553",
							"fpHm": "22927813",
							"fpzt": "3",
							"failReason": "网络问题",
							"gmfMc": "雅安市新汇茶业有限公司",
							"gmfNsrsbh": "123123123123123",
							"je": 25.04,
							"jshj": 28.29,
							"se": 3.25,
							"sl": 0.13
						}
					]
				}
			],
			"invoiceList": [
				{
					"ewm": "01,10,202311141553,22927813,29.21,20230911,77432162363170653878,7036",
					"fhr": "复核人",
					"fpDm": "202311141553",
					"fpHm": "22927813",
					"fpMw": "03-188574<*7-9*56458*81-9><>0-9>988*2<-188574<*7-9*5+08364**59*2171+84<6086-7/<11>4/9115>7-/*1011670065918/267*7",
					"fplx": "1",
					"zsfs": "0",
					"fpqqlsh": "P1814304738528722949",
					"bmbBbh": "48.34",
					"zfbz": "N",
					"gmfDz": "北京",
					"gmfDh": "1111111111",
					"gmfDzdh": "北京1111",
					"gmfMc": "雅安市新汇茶业有限公司",
					"gmfNsrsbh": "1111111111",
					"gmfYh": "北京银行",
					"gmfZh": "123123123123",
					"gmfYhzh": "123123123123",
					"hjje": 29.21,
					"hjse": 3.79,
					"jqbh": "661624294025",
					"jshj": 33,
					"jym": "77432162363170653878",
					"kplx": 0,
					"kpr": "刘玲",
					"kprq": "20230911141553",
					"lyid": "SWY1814295298190606345",
					"lylx": "1",
					"skr": "刘玲",
					"xsfDz": "北京市海淀区",
					"xsfDh": "62881722",
					"xsfDzdh": "北京市海淀区 62881722",
					"xsfMc": "用友税务云",
					"xsfNsrsbh": "111222333456777",
					"xsfYh": "北京银行",
					"xsfZh": "13123123",
					"xsfYhzh": "北京银行 13123123",
					"bred": "N",
					"bz": "",
					"items": [
						{
							"dw": "单位",
							"fphxz": "0",
							"ggxh": "规格型号",
							"hh": "1",
							"kce": 0,
							"se": 3.25,
							"sl": 0.13,
							"spbm": "1040101010000000000",
							"xmdj": 25.04,
							"xmhsdj": 28.29,
							"xmje": 25.04,
							"xmjshj": 28.29,
							"xmmc": "*纺织产品*NCCloud1909(在线注册）动态建模平台",
							"xmsl": 1,
							"yhzcbs": "0",
							"zxbm": "10",
							"ysxmmc": "NCCloud1909(在线注册）动态建模平台",
							"einvoiceHisBMotor": {
								"cllx": "",
								"sfzhm": "",
								"hgzh": "",
								"jkzmsh": "",
								"sjdh": "",
								"fdjhm": "",
								"dunwei": "",
								"xcrs": "",
								"cd": "",
								"cjhm": "",
								"cpxh": "",
								"scqymc": "",
								"swjgdm": "",
								"swjgmc": "",
								"wspzh": ""
							}
						}
					]
				}
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	未知错误	根据错误码提示，确认数据正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明

新增

返回参数 (17)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


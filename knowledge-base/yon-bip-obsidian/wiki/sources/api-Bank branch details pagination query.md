---
title: "银行网点详情分页查询V4"
apiId: "2183191190134849545"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Branch"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Branch]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行网点详情分页查询V4

> `ContentType	application/json` 请求方式	POST | 分类: Bank Branch (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/bankDot/batchQueryDetail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页大小 示例：50 默认值：50 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-02-28 11:16:47 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-02-29 11:16:47 |
| ids | string | 是 | 否 | 主键id集合 示例：["2211575684096589833","2211575684096589834"] |
| code | string | 否 | 否 | 编码 示例：01000002 |
| name | string | 否 | 否 | 名称 示例：北京银行 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/bankDot/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 50,
	"startTs": "2025-02-28 11:16:47",
	"endTs": "2025-02-29 11:16:47",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "01000002",
	"name": "北京银行"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功是返回200 示例：200 |
| data | object | 是 | 调用成功时的返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 页大小 示例：50 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：100 |
| recordList | object | 是 | 响应数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 100,
			"recordList": [
				{
					"id": "2211575684096589833",
					"code": "01000002",
					"name": {
						"zh_CN": "北京银行股份有限公司金汉绿港支行",
						"en_US": "Bank of Beijing Co., Ltd. Jinhan Lvgang Branch",
						"zh_TW": "北京銀行股份有限公司金漢綠港支行"
					},
					"bank": "2179513899263459335",
					"bank___code": "313",
					"bank___name": {
						"zh_CN": "城市商业银行",
						"en_US": "city ??commercial bank",
						"zh_TW": "城市商業銀行"
					},
					"country": "1001Z01000000005J1WB",
					"country___code": "CN",
					"country___name": {
						"zh_CN": "中文",
						"en_US": "China",
						"zh_TW": "中國"
					},
					"detail_address": {
						"province": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
						"province___code": "110000000000",
						"province___name": {
							"zh_CN": "北京",
							"en_US": "Beijing",
							"zh_TW": "北京"
						},
						"city": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
						"city___code": "110100000000",
						"city___name": {
							"zh_CN": "北京市",
							"en_US": "Beijing",
							"zh_TW": "北京市"
						},
						"district": "bfad109f-5cf3-11e9-817e-7cd30abea0c0",
						"district___code": "110101000000",
						"district___name": {
							"zh_CN": "东城区",
							"en_US": "Dongcheng District",
							"zh_TW": "東城區"
						},
						"addressone": {
							"zh_CN": "地址1",
							"en_US": "address1",
							"zh_TW": "地址1"
						},
						"addresstwo": {
							"zh_CN": "地址2",
							"en_US": "address2",
							"zh_TW": "地址2"
						},
						"addressthree": {
							"zh_CN": "地址3",
							"en_US": "address3",
							"zh_TW": "地址3"
						},
						"addressfour": {
							"zh_CN": "地址4",
							"en_US": "address4",
							"zh_TW": "地址4"
						},
						"postcode": "100026"
					},
					"IBAN": "1121212",
					"linenumber": "305393000028",
					"swiftCode": "BKCHCNBJ",
					"enable": 1,
					"pubts": "2025-02-12 14:26:11"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-08

更新

返回参数 en_US

2	2025-06-30

更新

请求说明

3	2025-05-19

新增

返回参数 (36)

删除

返回参数 (4)

银行网点详情分页查询


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


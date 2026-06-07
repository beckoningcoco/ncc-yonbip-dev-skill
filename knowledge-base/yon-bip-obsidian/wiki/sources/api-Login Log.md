---
title: "登录日志"
apiId: "fb20a509686d47e3b7f31d91c5012a31"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Audit Log -Login Log"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Audit Log -Login Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 登录日志

> `ContentType` 请求方式	GET | 分类: Audit Log -Login Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/log-pub/login/rest/query

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| loginUserId | string | query | 否 | 主键（在es中作为索引） |
| loginUserName | string | query | 否 | 业务对象编码 |
| ip | string | query | 否 | ip地址 |
| device | string | query | 否 | 登录设备 (1/2/3/4) web/android/client/iphone |
| startDate | string | query | 否 | 开始时间（时间戳） |
| endDate | string | query | 否 | 结束时间（时间戳） |
| page | int | query | 是 | 页码    示例: 1 |
| size | int | query | 是 | 每页数量    示例: 10 |

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/login/rest/query?access_token=访问令牌&loginUserId=&loginUserName=&ip=&device=&startDate=&endDate=&page=1&size=10

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 返回状态值 示例：1 |
| data | object | 否 | 数据体 |
| totalPages | number |
| 小数位数:2,最大长度:10 | 否 | 总页码 示例：1000 |
| totalElements | number |
| 小数位数:2,最大长度:10 | 否 | 总条数 示例：11178 |
| first | string | 否 | 第一 |
| content | object | 是 | 内容 |
| last | string | 否 | 最后 |
| number | number |
| 小数位数:2,最大长度:10 | 否 | 页码 示例：0 |
| displayCode | string | 否 | 异常码 |
| level | number |
| 小数位数:2,最大长度:10 | 否 | 异常等级 |

## 5. 正确返回示例

{
	"code": "200",
	"status": 1,
	"data": {
		"totalPages": 1000,
		"totalElements": 11178,
		"first": "",
		"content": [
			{
				"loginId": "5381284e-454f-41e2-85ce-2f2ca8400e2e",
				"loginUserId": "55a86ea3-f25f-48aa-9611-46eb4d682552",
				"source": "xty",
				"ip": "10.3.0.75",
				"tenantId": "lrqomi2j",
				"loginUserName": "周景超",
				"operateType": "IN",
				"operateDate": "2021-06-29T07:25:34.353+00:00",
				"sessionId": "LMjntrmrjujxCtdiEKaPSb5emmZtfjtubjtrdqjcZhkxkxxtZokbnl",
				"device": 1,
				"deviceName": "",
				"characteristic": "",
				"beanMap": "",
				"_status": "",
				"ts": "",
				"loginStatus": "",
				"isYht": "",
				"detail": "",
				"ytenantId": "",
				"token": ""
			}
		],
		"last": "",
		"number": 0
	},
	"displayCode": "",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

status	0	状态值

msg	查询日志失败

errorCode	000000


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明

新增

返回参数 (13)

更新

返回参数 displayCode

更新

返回参数 level

2	2025-06-30

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


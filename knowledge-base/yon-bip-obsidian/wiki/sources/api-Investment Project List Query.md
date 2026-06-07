---
title: "投资项目列表查询"
apiId: "5d11d0e662084b848891a07c7abd3574"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment Project Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Project Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资项目列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Investment Project Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/investment/projectList

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
| page | object | 否 | 是 | 分页 |
| pageIndex | int | 否 | 是 | 页码 示例：1 |
| pageSize | int | 否 | 是 | 每页数量 示例：10 |
| externalData | object | 否 | 否 | 扩展参数 |
| vouchDate | string | 否 | 否 | 时间戳范围(查询在某个时间错范围内的数据，|隔开 时间格式为：yyyy-MM-dd HH:mm:ss) 示例：2024-05-13 09:39:28|2024-05-14 09:39:28 |

## 3. 请求示例

Url: /yonbip/digitalModel/investment/projectList?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"externalData": {
		"vouchDate": "2024-05-13 09:39:28|2024-05-14 09:39:28"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页数 示例：1 |
| pageSize | int | 否 | 每页行数 示例：10 |
| recordCount | int | 否 | 总数 示例：1 |
| recordList | object | 是 | 返回结果对象 |
| pageCount | int | 否 | 总页数 示例：1 |
| beginPageIndex | int | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | int | 否 | 结束页码（有多少页） 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"code": "test001",
				"orgcoin": "G001ZM0000DEFAULTCURRENCT00000000001",
				"payAttribute": "属性",
				"assetstage": 2495071591908751,
				"orgsum": 32423,
				"className": "部门测试人员02",
				"dealcoin": "G001ZM0000DEFAULTCURRENCT00000000001",
				"dealsum": 242333.33,
				"years": 22,
				"dr": 0,
				"orgcoinName": "人民币",
				"actualdate": "2022-03-01 00:00:00",
				"esfinishdate": "2022-03-27 00:00:00",
				"stageName": "111",
				"enable": 1,
				"assetstageName": "土地",
				"id": "1409860630235578368",
				"payid": "1409859943040811008",
				"payName": "测试",
				"tenant": "0000KXZSO9502NO4JR0000",
				"orgName": "集团",
				"orgid": "2591478270775558",
				"estimatedate": "2022-03-15 00:00:00",
				"actfinishdate": "2022-03-27 00:00:00",
				"personName": "1027003",
				"dealcoinName": "人民币",
				"classid": "2591484712358144",
				"person": "2591480638902545",
				"name": "test_project",
				"actualsum": 222,
				"investtype": "测试0623",
				"investtypeName": "测试0623",
				"costcenterName": "测试成本中心",
				"costcenter": 1483905497233358856,
				"planyear": 22,
				"amount": 2323.32,
				"budgetyear": "2022-01-01 00:00:00",
				"stageid": "1409856764765011968"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常


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


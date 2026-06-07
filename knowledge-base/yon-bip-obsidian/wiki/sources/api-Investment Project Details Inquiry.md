---
title: "投资项目详情查询"
apiId: "1675392224668418048"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Investment Project Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Project Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资项目详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Investment Project Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/investment/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID或code |

## 3. 请求示例

Url: /yonbip/digitalModel/investment/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 投资项目编码 示例：test001 |
| orgcoin | string | 否 | 组织本位币id 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| assetstage | string | 否 | 固定资产类别id 示例：2495071591908751 |
| orgsum | string | 否 | 计划投资总金额(本位币) 示例：32423 |
| description | object | 否 | 描述 |
| dealcoin | string | 否 | 交易币种id 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| dealsum | string | 否 | 计划投资总金额(交易币) 示例：242333.33 |
| investtype | string | 否 | 投资分类id 示例：2495071591908751 |
| esfinishdate | string | 否 | 实际完成日期 示例：2022-03-27 00:00:00 |
| enable | string | 否 | 状态, 0:未启用、1:启用、2:停用、 示例：1 |
| id | string | 否 | 业务数据id 示例：1557560922184089608 |
| payid | string | 否 | 所属投资支出类别id 示例：1409859943040811008 |
| costcenter | string | 否 | 成本中心id 示例：1483905497233358856 |
| amount | string | 否 | 数量 示例：12.00 |
| orgid | string | 否 | 所属组织id 示例：2591478270775558 |
| classid | string | 否 | 所属部门id 示例：2591484712358144 |
| estimatedate | string | 否 | 预计开始日期 示例：2022-03-15 00:00:00 |
| budgetyear | string | 否 | 预算年度，格式为:yyyy-MM-dd HH:mm:ss 示例：2022-01-01 00:00:00 |
| actualsum | string | 否 | 实际总金额 示例：222 |
| name | muti_lang | 否 | 投资项目名称,支持多语 |
| dr | string | 否 | 有效标识 示例：0 有效数据；1 已删除；2 删除中 |
| modifiedtime | string | 否 | 修改时间 示例：2022-09-30 15:45:56 |
| modifier | string | 否 | 修改人 示例：7a22a23e-7973-466d-bb7a-17f612b2f540 |
| tenant | string | 否 | 租户id 示例：0000L5KZEUUE3G0F1O0000 |
| pubts | string | 否 | 时间戳 示例：2022-09-30 16:04:23 |
| creator | string | 否 | 创建人 示例：7a22a23e-7973-466d-bb7a-17f612b2f540 |
| sysid | string | 否 | 应用标识 示例：diwork |
| creationtime | string | 否 | 创建时间 示例：2022-01-01 00:00:00 |

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"code": "test001",
		"orgcoin": "G001ZM0000DEFAULTCURRENCT00000000001",
		"assetstage": "2495071591908751",
		"orgsum": "32423",
		"description": {},
		"dealcoin": "G001ZM0000DEFAULTCURRENCT00000000001",
		"dealsum": "242333.33",
		"investtype": "2495071591908751",
		"esfinishdate": "2022-03-27 00:00:00",
		"enable": "1",
		"id": "1557560922184089608",
		"payid": "1409859943040811008",
		"costcenter": "1483905497233358856",
		"amount": "12.00",
		"orgid": "2591478270775558",
		"classid": "2591484712358144",
		"estimatedate": "2022-03-15 00:00:00",
		"budgetyear": "2022-01-01 00:00:00",
		"actualsum": "222",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"dr": "0 有效数据；1 已删除；2 删除中",
		"modifiedtime": "2022-09-30 15:45:56",
		"modifier": "7a22a23e-7973-466d-bb7a-17f612b2f540",
		"tenant": "0000L5KZEUUE3G0F1O0000",
		"pubts": "2022-09-30 16:04:23",
		"creator": "7a22a23e-7973-466d-bb7a-17f612b2f540",
		"sysid": "diwork",
		"creationtime": "2022-01-01 00:00:00"
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


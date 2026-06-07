---
title: "计量单位分组列表查询"
apiId: "cb17c7f7266f44be9c0f9c2358c12e11"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位分组列表查询

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/unitGroup/list

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
| simple | object | 否 | 否 | 查询条件 |
| id | string | 否 | 否 | 计量单位分组id 示例：123456 |
| code | string | 否 | 否 | 计量单位分组编码 示例：编码 |
| name | string | 否 | 否 | 计量单位分组名称 示例：名称 |
| pageIndex | long | 否 | 是 | 当前页索引 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 页大小 示例：10 默认值：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/unitGroup/list?access_token=访问令牌
Body: {
	"simple": {
		"id": "123456",
		"code": "编码",
		"name": "名称"
	},
	"pageIndex": 1,
	"pageSize": 10
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求完成结果状态码 示例：200 |
| message | string | 否 | 请求完成返回信息 示例：操作成功 |
| data | object | 否 | 请求完成返回数据 |
| pageIndex | long | 否 | 当前页索引 示例：1 |
| pageSize | long | 否 | 页大小 示例：1 |
| recordCount | long | 否 | 记录条数 示例：5 |
| recordList | object | 是 | 数据列表 |
| pageCount | long | 否 | 页数 示例：5 |
| beginPageIndex | long | 否 | 起始页索引 示例：2 |
| endPageIndex | long | 否 | 尾页索引 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 5,
		"recordList": [
			{
				"creator": "魏森",
				"code": "Weight",
				"createTime": "2021-06-15 17:13:10",
				"name": "重量",
				"id": 2302744824975616,
				"pubts": "2021-06-15 17:13:10",
				"stopstatus": false,
				"desc": "社会化量纲：重量",
				"createDate": "2021-06-15 00:00:00"
			}
		],
		"pageCount": 5,
		"beginPageIndex": 2,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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


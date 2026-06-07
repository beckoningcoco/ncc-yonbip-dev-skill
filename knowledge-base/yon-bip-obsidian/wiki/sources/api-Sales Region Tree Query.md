---
title: "销售区域树查询V2"
apiId: "1695130021772918791"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Region"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Region]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售区域树查询V2

> `ContentType	application/json` 请求方式	POST | 分类: Sales Region (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/salearea/newtree

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
| pageIndex | int | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 分页大小 示例：100 默认值：100 |
| name | string | 否 | 否 | 名称 示例：名称 |
| code | string | 否 | 否 | 编码 示例：编码 |
| beganTime | DateTime | 否 | 否 | 开始时间戳，包含 示例：2023.04.14 15:40 |
| endTime | DateTime | 否 | 否 | 结束时间戳，不包含 示例：2023.04.15 15:40 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳，大于(包含)当前值 示例：2023-04-15 15:40:00 |

## 3. 请求示例

Url: /yonbip/digitalModel/salearea/newtree?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"name": "名称",
	"code": "编码",
	"beganTime": "2023.04.14 15:40",
	"endTime": "2023.04.15 15:40",
	"pubts": "2023-04-15 15:40:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| id | long | 否 | ID 示例：123456 |
| code | string | 否 | 分类编码 示例：code |
| name | object | 否 | 分类名称,支持多语 |
| parent | long | 否 | 上级分类id 示例：123456 |
| parentName | string | 否 | 上级分类名称 示例：上级分类名称 |
| order | int | 否 | 排序号 示例：1 |
| level | int | 否 | 层级 示例：1 |
| stopStatus | boolean | 否 | 启用状态 true：停用 false：启用 示例：true |
| remark | object | 否 | 备注,支持多语 |
| orgId | string | 否 | 管理组织id 示例：666666 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": [
		{
			"id": 123456,
			"code": "code",
			"name": {
				"simplifiedName": "名称",
				"englishName": "name",
				"traditionalName": "名稱"
			},
			"parent": 123456,
			"parentName": "上级分类名称",
			"order": 1,
			"level": 1,
			"stopStatus": true,
			"remark": {
				"simplifiedName": "备注",
				"englishName": "remark",
				"traditionalName": "備注"
			},
			"orgId": "666666"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


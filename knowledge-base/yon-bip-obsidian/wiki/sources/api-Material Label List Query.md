---
title: "物料标签列表查询"
apiId: "1840139920246046725"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Label"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Label]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料标签列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Label (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/tag/list

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
| id | string | 否 | 否 | 标签id 示例：123456 |
| name | string | 否 | 否 | 标签名称 示例：标签名称 |
| tagClassCode | string | 否 | 否 | 标签分组编码 示例：code01 |
| scope | string | 否 | 否 | 标签样式,1:前端展示，2:管理端,3:促销活动 示例：1 |
| pageIndex | long | 否 | 是 | 当前页索引 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 页大小 示例：10 默认值：100 |

## 3. 请求示例

Url: /yonbip/digitalModel/tag/list?access_token=访问令牌
Body: {
	"id": "123456",
	"name": "标签名称",
	"tagClassCode": "code01",
	"scope": "1",
	"pageIndex": 1,
	"pageSize": 10
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 是 | 调用成功时的返回数据 |
| id | long | 否 | 标签id 示例：123456 |
| name | string | 否 | 名称 示例：名称 |
| tagClass | string | 否 | 分组id 示例：分组id |
| tagAbbr | string | 否 | 标签备注 示例：标签备注 |
| backGroundColor | string | 否 | 背景颜色 示例：ff11 |
| fontColor | string | 否 | 字体颜色 示例：ff11 |
| scope | string | 否 | 适用范围 示例：1 |
| style | string | 否 | 样式 示例：1 |
| tagBusinessId | string | 否 | 标签图片id 示例：id |
| tagPosition | string | 否 | 位置 示例：1 |
| endTime | string | 否 | 结束时间 示例：2023:10:16 00.00.00 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": [
		{
			"id": 123456,
			"name": "名称",
			"tagClass": "分组id",
			"tagAbbr": "标签备注",
			"backGroundColor": "ff11",
			"fontColor": "ff11",
			"scope": "1",
			"style": "1",
			"tagBusinessId": "id",
			"tagPosition": "1",
			"endTime": "2023:10:16 00.00.00"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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


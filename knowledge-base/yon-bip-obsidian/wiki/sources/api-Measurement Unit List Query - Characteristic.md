---
title: "计量单位列表查询-特征"
apiId: "2080171159801298945"
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

# 计量单位列表查询-特征

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/unit/newlist

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
| code | string | 否 | 否 | 编码 示例：编码 |
| name | string | 否 | 否 | 名称 示例：名称 |
| beganTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 开始时间 示例：2024-09-01 00:00:00 |
| endTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 结束时间 示例：2024-09-01 00:00:00 |
| pageIndex | number |
| 小数位数:0,最大长度:4 | 否 | 是 | 当前页索引 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:4 | 否 | 是 | 页大小 示例：10 默认值：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/unit/newlist?access_token=访问令牌
Body: {
	"code": "编码",
	"name": "名称",
	"beganTime": "2024-09-01 00:00:00",
	"endTime": "2024-09-01 00:00:00",
	"pageIndex": 1,
	"pageSize": 10
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 请求完成结果状态码 示例：200 |
| message | string | 否 | 请求完成返回信息 示例：处理成功 |
| data | object | 是 | 请求完成返回数据 |
| id | number |
| 小数位数:0,最大长度:22 | 否 | id 示例：123456 |
| name | object | 否 | 名称 |
| code | string | 否 | 编码 示例：编码 |
| precision | number |
| 小数位数:0,最大长度:2 | 否 | 精度 示例：0 |
| truncationType | number |
| 小数位数:0,最大长度:2 | 否 | 舍位方式 4：四舍五入 1：舍位 0：入位 示例：4 |
| baseUnit | boolean | 否 | 是否基本单位 示例：false |
| unitGroup | number |
| 小数位数:0,最大长度:22 | 否 | 计量单位分组id 示例：1234567 |
| unitGroupCode | string | 否 | 计量单位分组编码 示例：分组编码 |
| stopStatus | boolean | 否 | 启用状态 false:启用 true:停用 示例：false |

## 5. 正确返回示例

{
	"code": 200,
	"message": "处理成功",
	"data": [
		{
			"id": 123456,
			"name": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"code": "编码",
			"precision": 0,
			"truncationType": 4,
			"baseUnit": false,
			"unitGroup": 1234567,
			"unitGroupCode": "分组编码",
			"stopStatus": false
		}
	]
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


---
title: "根据外部编码批量更新计量单位"
apiId: "1731951489337786371"
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

# 根据外部编码批量更新计量单位

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/unit/batchupdate

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
| erpCode | string | 否 | 是 | 外部编码 示例：erp123 |
| code | string | 否 | 否 | 编码 示例：code01 |
| name | object | 否 | 否 | 名称 |
| simplifiedName | string | 否 | 否 | 简体 示例：中文 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| unitGroupCode | string | 否 | 否 | 分组编码 示例：group01 |
| truncationType | int | 否 | 否 | 舍位方式, 4:四舍五入、1:舍位、0:入位、 示例：0 |
| precision | int | 否 | 否 | 单位精度，新增时可不输默认为2，修改时必输 示例：2 |
| stopStatus | boolean | 否 | 否 | 启用状态, true:停用、false:启用 示例：false |
| baseUnit | boolean | 否 | 否 | 是否基本单位，false：否、true：是 示例：false |
| convertCoefficient | BigDecimal | 否 | 否 | 换算系数 示例：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/unit/batchupdate?access_token=访问令牌
Body: [{
	"erpCode": "erp123",
	"code": "code01",
	"name": {
		"simplifiedName": "中文",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"unitGroupCode": "group01",
	"truncationType": 0,
	"precision": 2,
	"stopStatus": false,
	"baseUnit": false,
	"convertCoefficient": 1
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 提示信息 示例：处理成功 |
| data | object | 否 | 返回结果 |
| count | int | 否 | 总数 示例：2 |
| successCount | int | 否 | 成功数量 示例：1 |
| failCount | int | 否 | 失败数量 示例：1 |
| successInfos | object | 是 | 成功信息 |
| failInfos | object | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"successInfos": [
			{
				"erpCode": "123",
				"message": "保存成功！"
			}
		],
		"failInfos": [
			{
				"erpCode": "456",
				"message": "erpCode,外部编码不存在！"
			}
		]
	}
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


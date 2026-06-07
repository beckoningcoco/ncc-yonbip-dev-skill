---
title: "计量单位批量保存"
apiId: "ff89535f3da44dde8d7fe3dc34056a9e"
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

# 计量单位批量保存

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/unit/save

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
| data | object | 是 | 是 | 计量单位 |
| creator | string | 否 | 否 | 创建人 示例：19908688888 |
| stopstatus | string | 否 | 是 | 停用状态, 0:启用、1:停用 示例：0 |
| createDate | string | 否 | 否 | 创建日期，yyyy-MM-dd 示例：2020-10-24 11:23:06 |
| name | object | 否 | 是 | 名称 |
| precision | string | 否 | 否 | 单位精度，新增时可不输默认为2，修改时必输 示例：2 |
| unitGroup_name | string | 否 | 否 | 计量单位组别名称 示例：分组 |
| createTime | string | 否 | 否 | 创建时间，yyyy-MM-dd hh:mm:ss 示例：2020-10-24 11:23:06 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| unitGroup | long | 否 | 否 | 计量单位分组id 示例：1842532819669248 |
| truncationType | string | 否 | 是 | 舍位方式：0 入位；1 舍位；4 四舍五入 示例：0 |
| code | string | 否 | 是 | 计量单位编码值 示例：lytest0000 |
| bBaseUnit | boolean | 否 | 是 | 是否基本单位，false：否、true：是 示例：false |
| convertCoefficient | BigDecimal | 否 | 否 | 换算系数 示例：1 |
| unitGroupCode | string | 否 | 否 | 计量单位分组编码 示例：分组编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/unit/save?access_token=访问令牌
Body: {
	"data": [
		{
			"creator": "19908688888",
			"stopstatus": "0",
			"createDate": "2020-10-24 11:23:06",
			"name": {
				"zh_CN": "lytest0000"
			},
			"precision": "2",
			"unitGroup_name": "分组",
			"createTime": "2020-10-24 11:23:06",
			"_status": "Insert",
			"unitGroup": 1842532819669248,
			"truncationType": "0",
			"code": "lytest0000",
			"bBaseUnit": false,
			"convertCoefficient": 1,
			"unitGroupCode": "分组编码"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| successCountAI | int | 否 | 批量保存AI成功数（默认为0） 示例：0 |
| failCountAI | int | 否 | 批量保存AI失败数（默认为0） 示例：0 |
| count | int | 否 | 批量处理数 示例：2 |
| sucessCount | int | 否 | 批量导入成功数 示例：1 |
| failCount | int | 否 | 批量导入失败数 示例：1 |
| messages | string | 是 | 错误信息描述（一条表示一条导入数据） 示例：名称 (xxx)已经存在 |
| infos | object | 是 | 导入保存成功返回信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			"名称 (xxx)已经存在"
		],
		"infos": [
			{
				"name": {
					"zh_CN": "名称"
				},
				"truncationType": 0,
				"unitGroup": 1842532819669248,
				"unitGroupCode": "分组编码",
				"unitGroup_name": "批导计量单位",
				"stopstatus": false,
				"id": 2236042401321472,
				"isEnabled": true,
				"precision": 2,
				"modifier": "Mr.Wang",
				"bBaseUnit": false,
				"convertCoefficient": 1,
				"modifierId": 2217385201291520,
				"createTime": "2020-10-24 11:23:06",
				"createDate": "2021-04-29 14:29:57",
				"modifyTime": "2021-04-29 14:29:57",
				"modifyDate": "2021-04-29 14:29:57",
				"stoptime": "2021-04-29 14:29:57",
				"tenant": 2217385199538432,
				"pubts": "2021-04-29 14:29:57",
				"yTenantId": "0000KNJO063K2E5S750000",
				"creator": "Mr.Li",
				"creatorId": 2217385201291520,
				"code": "lytest0000"
			}
		]
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


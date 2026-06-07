---
title: "员工批量停用_集成_API"
apiId: "2141451967915884548"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工批量停用_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/staff/integratedApi/batchStop

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 员工id 示例：1838065487581440 |
| enable | long | 否 | 否 | 0:未启用，1启用，2停用，接口需要传原状态，配合user_id解绑用户使用 示例：1 |
| objid | string | 否 | 否 | 第三方主键 |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/integratedApi/batchStop?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "1838065487581440",
			"enable": 1,
			"objid": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 说明 示例：操作成功 |
| data | object | 否 | 业务数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数量 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数 |
| messages | object | 是 | 消息 |
| infos | object | 是 | 响应数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "",
					"targetUnique": "",
					"enable": 0
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


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


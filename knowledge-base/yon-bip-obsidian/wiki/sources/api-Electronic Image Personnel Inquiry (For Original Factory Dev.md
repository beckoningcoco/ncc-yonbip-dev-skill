---
title: "电子影像人员查询（原厂开发专用）"
apiId: "1507857550595850247"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子影像人员查询（原厂开发专用）

> `ContentType	application/json` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/img/business/syncpostauthority

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
| uuid | string | 否 | 是 | 请求编号，用于后台日志标记请求，要求全局唯一，长度不能超过32位 示例：13122225891 |
| usercode | string | 否 | 否 | 用户编码 示例：csf |
| opTime | string | 否 | 是 | 操作时间 示例：2022-07-22 14:50:45 |
| factorycode | string | 否 | 是 | 厂商编码 示例：shy |
| data | object | 否 | 是 | 数据容器 |
| billid | string | 否 | 是 | 单据主键 示例：14384758373847 |

## 3. 请求示例

Url: /yonbip/ssc/img/business/syncpostauthority?access_token=访问令牌
Body: {
	"uuid": "13122225891",
	"usercode": "csf",
	"opTime": "2022-07-22 14:50:45",
	"factorycode": "shy",
	"data": {
		"billid": "14384758373847"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 专岗组织人员信息 |
| userid | string | 否 | 用户主键 示例：1001ZZ10000000001UD4 |
| usercode | string | 否 | 用户编码 示例：csf |
| username | string | 否 | 用户名 示例：陈顺风 |
| pk_org | string | 否 | 组织主键 示例：global00000000000000 |
| orgcode | string | 否 | 组织编码 示例：global00000000000000 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"userid": "1001ZZ10000000001UD4",
			"usercode": "csf",
			"username": "陈顺风",
			"pk_org": "global00000000000000",
			"orgcode": "global00000000000000"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023070105411	服务端逻辑异常	请联系系统管理员

1023070105441	厂商编码错误

1023070105442	厂商编码不可为空


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


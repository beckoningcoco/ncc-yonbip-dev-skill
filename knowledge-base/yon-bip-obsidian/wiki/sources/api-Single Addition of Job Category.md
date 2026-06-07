---
title: "职务类别单个新增"
apiId: "721d6ebcc63048c18247c87db248d7cc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职务类别单个新增

> `ContentType	application/json` 请求方式	POST | 分类: Job Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/dutytype/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| enable | string | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：1 |
| name | muti_lang | 否 | 是 | 职务类别名称 |
| id | string | 否 | 否 | 主键，新增非必填，更新必填 |
| code | string | 否 | 是 | 职务类别编码 示例：00003 |
| _status | string | 否 | 否 | 操作标识，Insert新增 Update更新 示例：Insert |
| parentid | string | 否 | 否 | 上级职务类别id或者编码 示例：6216261261 |
| ranktype_id | string | 否 | 否 | 职级类别id或者编码 示例：23121323 |

## 3. 请求示例

Url: /yonbip/digitalModel/dutytype/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"enable": "1",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"id": "",
		"code": "00003",
		"_status": "Insert",
		"parentid": "6216261261",
		"ranktype_id": "23121323"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| code | string | 否 | 编码 |
| name | muti_lang | 否 | 名称 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 |
| id | string | 否 | 主键 |
| pubts | string | 否 | 时间戳 |
| sysid | string | 否 | 系统标识 示例：diwork |
| parentid | string | 否 | 上级职务类别id 示例：2211231 |
| ranktype_id | string | 否 | 职级类别id 示例：2323232 |
| org_id | string | 否 | 所属组织id |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"enable": 0,
		"id": "",
		"pubts": "",
		"sysid": "diwork",
		"parentid": "2211231",
		"ranktype_id": "2323232",
		"org_id": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	检查入参是否正确，参数值是否真实存在，仍提示该信息请联系开发人员	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-19

新增

请求参数 user_define_character

HXRL-123878 职务类别接特征


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


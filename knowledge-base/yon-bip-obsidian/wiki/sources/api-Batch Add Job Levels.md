---
title: "职级批量新增"
apiId: "36a8ec9c640a423a9ac62d84562a72c8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Job Level (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rank/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | data |
| code | string | 否 | 是 | 编码 示例：编码 |
| enable | int | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：1 |
| name | muti_lang | 否 | 是 | 名称 |
| id | string | 否 | 否 | 主键 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 示例：Insert |
| org_id | string | 否 | 是 | 所属组织，传id或者编码 示例：113343435435 |
| ranktype_id | string | 否 | 否 | 职级类别，传id或code 示例：d59cb8c6f18541bf82c8d50efd5e1066 |
| maxrank_id | string | 否 | 否 | 最高职等，传id或code 示例：2476725260161536 |
| minrank_id | string | 否 | 否 | 最低职等，传id或code 示例：2476725251969536 |
| orderNo | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 顺序号 示例：1 |
| memo | object | 否 | 否 | 备注 |

## 3. 请求示例

Url: /yonbip/digitalModel/rank/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "编码",
			"enable": 1,
			"name": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"id": "",
			"_status": "Insert",
			"org_id": "113343435435",
			"ranktype_id": "d59cb8c6f18541bf82c8d50efd5e1066",
			"maxrank_id": "2476725260161536",
			"minrank_id": "2476725251969536",
			"orderNo": 1,
			"memo": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			}
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | sucessCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | string | 是 | messages |
| infos | object | 是 | infos |
| failInfos | string | 是 | failInfos |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "zcmcs0005",
				"enable": 1,
				"name": "高级专家02新",
				"org_id": "666666",
				"ranktype_id": "test",
				"maxrank_id": "1982040880866918407",
				"minrank_id": "1982040880866918407",
				"memo": {
					"zh_CN": "公司内部中高级职称，有一定专业技术能力的人员"
				},
				"orderNo": 116,
				"id": "2054826987270176777"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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


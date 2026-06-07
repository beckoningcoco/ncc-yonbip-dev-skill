---
title: "合同类型分组批量保存"
apiId: "2214465243597242377"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Type Group"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Type Group]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同类型分组批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Contract Type Group (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rest/integration/contractTypeGroup/save4API

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 合同类型分组数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 合同类型分组主键（查询接口获取） 示例：19752313512121212306 |
| sourceUnique | string | 否 | 否 | 外部系统来源ID 示例：19752313333333212306 |
| name | object | 否 | 是 | 合同类型分组名称，长度限制200个字符 |
| remark | object | 否 | 否 | 合同类型分组说明 |
| parent | string | 否 | 否 | 上级ID，即上级合同类型分组的主键或者外部系统来源主键 示例：1975231333322211112306 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/integration/contractTypeGroup/save4API?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "19752313512121212306",
			"sourceUnique": "19752313333333212306",
			"name": {
				"zh_CN": "分组1",
				"zh_TW": "繁體名稱",
				"en_US": "En_123"
			},
			"remark": {
				"zh_CN": "说明1",
				"zh_TW": "繁體說明",
				"en_US": "En_Remark"
			},
			"parent": "1975231333322211112306"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口状态 示例：200 |
| message | string | 否 | 接口信息 示例：操作成功 |
| data | object | 否 | 接口数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数量 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：0 |
| infos | object | 是 | 成功信息 |
| failInfos | object | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"infos": [
			{
				"id": "19752222222222222306",
				"outerSysId": "19723232323232222222306",
				"sourceUnique": "19723232323232222222306",
				"data": {
					"sourceUnique": "19723232323232222222306",
					"targetUnique": "19752222222222222306"
				},
				"name": {
					"zh_CN": "分组1",
					"en_US": "En_123"
				},
				"remark": {
					"zh_CN": "说明1"
				},
				"creator": "7071cd2f-c325-xxxxxxxxxxx77b",
				"createTime": "2025-03-03 19:52:12",
				"modifier": "7071cd2f-c325-xxxxxxxxxxx77b",
				"modifyTime": "2025-03-03 17:52:12",
				"pubts": "2025-03-03 17:52:13",
				"ytenantId": "0000LV033333333333E90000"
			}
		],
		"failInfos": [
			{
				"sourceUnique": "19723232323232222222306",
				"message": "错误信息"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	未知异常	未知异常，请联系管理员

10000	服务内部异常	服务内部异常，请联系管理员


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


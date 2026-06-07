---
title: "合同法律类别批量保存"
apiId: "2214451594191175689"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Legal Category"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Legal Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同法律类别批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Contract Legal Category (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rest/integration/legalType/save4API

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
| data | object | 是 | 否 | 合同法律类别数据列表 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 合同法律类别主键 示例：19752313512121212306 |
| sourceUnique | string | 否 | 否 | 外部系统来源ID 示例：19752313333333212306 |
| code | string | 否 | 是 | 合同法律类别编码，长度限制200个字符 示例：O |
| enable | string | 否 | 否 | 启用状态（1 启用 0 停用） 示例：1 默认值：0 |
| name | object | 否 | 是 | 合同法律类别名称 |
| remark | object | 否 | 否 | 合同法律类别说明 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/integration/legalType/save4API?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "19752313512121212306",
			"sourceUnique": "19752313333333212306",
			"code": "O",
			"enable": "1",
			"name": {
				"zh_CN": "居间合同",
				"zh_TW": "居間合同",
				"en_US": "En_Name"
			},
			"remark": {
				"zh_CN": "当事人双方约定一方接受他方的委托，并按照他方的指示要求，为他方报告订立合同的机会或者为订约提供媒介服务，委托人给付报酬的合同",
				"zh_TW": "繁體說明",
				"en_US": "En_Remark"
			}
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
				"sourceUnique": "1975223333333322222306",
				"code": "O",
				"name": {
					"zh_CN": "居间合同",
					"en_US": "En_123",
					"zh_TW": "繁體名稱"
				},
				"remark": {
					"zh_CN": "当事人双方约定一方接受他方的委托，并按照他方的指示要求，为他方报告订立合同的机会或者为订约提供媒介服务，委托人给付报酬的合同",
					"en_US": "En_12321",
					"zh_TW": "繁體說明"
				},
				"data": {
					"sourceUnique": "1975223333333322222306",
					"targetUnique": "19752222222222222306"
				},
				"modifier": "7071cd2f-c325-xxxxxxxxxxx77b",
				"modifyTime": "2025-03-03 17:52:12",
				"enable": "1",
				"pubts": "2025-03-03 17:52:13",
				"ytenantId": "0000LV033333333333E90000"
			}
		],
		"failInfos": [
			{
				"sourceUnique": "",
				"message": "错误信息"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	未知异常	未知异常，请联系管理员

10000	服务内部错误	服务内部异常，请联系管理员


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


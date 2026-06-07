---
title: "合同条款批量保存"
apiId: "2214325691534016517"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同条款批量保存

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rest/contractTerms/integration/batchSave

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
| orderFlag | int | 否 | 是 | 是否默认 1 是 0 否 示例：1 |
| data | object | 是 | 否 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 条款ID 示例：2172830121212129827 |
| sourceUnique | string | 否 | 否 | 外部系统来源ID 示例：2172831111334554129827 |
| categoryId | string | 否 | 否 | 条款分组ID 示例：217283014523423429827 |
| termNum | string | 否 | 是 | 合同条款编码，长度限制30个字符 示例：217283014543555555529827 |
| termName | string | 否 | 是 | 合同条款名称，长度限制30个字符 示例：名称1 |
| termStatus | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 启用状态（1 启用 0 停用） 示例：1 默认值：0 |
| termContent | string | 否 | 是 | 条款内容 示例：111${变量1}$ |
| keyWord | string | 否 | 否 | 关键字 示例：关键字 |
| remark | string | 否 | 否 | 说明 示例：说明123 |
| orgId | string | 否 | 否 | 组织ID 示例：2172830147643545429827 |
| orgCode | string | 否 | 否 | 组织编码，与组织ID必传一个 示例：orgCode1 |
| dr | string | 否 | 否 | 删除标记（1 已删除 0 未删除） 示例：0 默认值：0 |
| termName2 | string | 否 | 否 | 条款名称2 示例：名称2 |
| termName3 | string | 否 | 否 | 条款名称3 示例：名称3 |
| termName4 | string | 否 | 否 | 条款名称4 示例：名称4 |
| termName5 | string | 否 | 否 | 条款名称5 示例：名称5 |
| termName6 | string | 否 | 否 | 条款名称6 示例：名称6 |
| termVars | object | 是 | 否 | 条款变量 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/contractTerms/integration/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2172830121212129827",
			"sourceUnique": "2172831111334554129827",
			"categoryId": "217283014523423429827",
			"termNum": "217283014543555555529827",
			"termName": "名称1",
			"termStatus": 1,
			"termContent": "111${变量1}$",
			"keyWord": "关键字",
			"remark": "说明123",
			"orgId": "2172830147643545429827",
			"orgCode": "orgCode1",
			"dr": "0",
			"termName2": "名称2",
			"termName3": "名称3",
			"termName4": "名称4",
			"termName5": "名称5",
			"termName6": "名称6",
			"termVars": [
				{
					"variable": "变量1",
					"value": "变量值1",
					"termRequired": "0"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口状态 示例：200 |
| message | string | 否 | 接口信息 示例：操作成功 |
| data | object | 否 | 接口数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 请求中数据量 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：9 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：1 |
| infos | object | 是 | 成功数据 |
| IntegrationFailMessage | object | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"infos": [
			{
				"id": "197542811111111119013",
				"outerSysId": "1975428123211239013",
				"sourceUnique": "1975428123211239013",
				"targetUnique": "197542811111111119013",
				"termNum": "term001",
				"termName": "名称1",
				"categoryId": "19754281521221211239013",
				"orgId": "197542815555555239013",
				"orgCode": "orgCode1",
				"termStatus": "1",
				"termContent": "111${12",
				"keyWord": "关键字",
				"remark": "说明",
				"yTenantId": "qyxxxxxx",
				"ts": "2024-12-12 12:12:12",
				"dr": 0,
				"termName2": "名称2",
				"termName3": "名称3",
				"termName4": "名称4",
				"termName5": "名称5",
				"termName6": "名称6",
				"termVars": [
					{
						"variable": "变量1",
						"value": "值1",
						"termRequired": 8
					}
				]
			}
		],
		"IntegrationFailMessage": [
			{
				"sourceUnique": "197542812321111111111",
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


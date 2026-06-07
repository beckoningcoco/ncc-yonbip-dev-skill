---
title: "合同类型批量保存"
apiId: "2214491125070168073"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Type"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同类型批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Contract Type (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/rest/integration/contractType/save4API

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
| data | object | 是 | 否 | 接口传入数据列表 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 主键 示例：1975332332323004101 |
| sourceUnique | string | 否 | 否 | 外部系统来源ID 示例：1975323232396004101 |
| code | string | 否 | 是 | 合同类型编码，长度限制200个字符 示例：C3 |
| name | object | 否 | 是 | 合同类型名称，长度限制200个字符 |
| contractGroupId | string | 否 | 是 | 类型分组ID 示例：197533232326004096 |
| billTypeId | string | 否 | 否 | 单据类型ID 示例：197533444444444096 |
| billTypeId___code | string | 否 | 否 | 单据类型编码 示例：PMC5004 |
| enable | string | 否 | 否 | 启用状态（1 启用 0 停用） 示例：0 默认值：0 |
| remark | object | 否 | 否 | 合同类型说明 |
| adaptallorgs | boolean | 否 | 否 | 适配所有组织，当适用所有组织时，适用范围子表数据会默认忽略 示例：false 默认值：true |
| contractType_transTypeIdList | object | 是 | 否 | 适配交易类型子表 |
| contracttypescopeList | object | 是 | 否 | 适用范围子表 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/integration/contractType/save4API?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "1975332332323004101",
			"sourceUnique": "1975323232396004101",
			"code": "C3",
			"name": {
				"zh_CN": "资产租入合同",
				"zh_TW": "資產租入合同",
				"en_US": "Asset Lease-in Contract"
			},
			"contractGroupId": "197533232326004096",
			"billTypeId": "197533444444444096",
			"billTypeId___code": "PMC5004",
			"enable": "0",
			"remark": {
				"zh_CN": "中文说明",
				"en_US": "En_12321",
				"zh_TW": "繁體說明"
			},
			"adaptallorgs": false,
			"contractType_transTypeIdList": [
				{
					"transTypeId": "1975323232323444444096-01",
					"transTypeId___code": "PMC5004-01"
				}
			],
			"contracttypescopeList": [
				{
					"orgId": "197343433333333323444444096",
					"orgId___code": "sdfggf",
					"adaptalldepts": false,
					"contracttypescope_deptIdsList": [
						{
							"deptIds": "197333333333333396",
							"deptIds___code": "jhgfd"
						}
					]
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
| 小数位数:0,最大长度:10 | 否 | 请求总数量 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：0 |
| infos | object | 是 | 成功数据 |
| failInfos | object | 是 | 失败信息 |

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
				"id": "19111111111196004101",
				"sourceUnique": "191111212121296004101",
				"data": {
					"sourceUnique": "191111212121296004101",
					"targetUnique": "19111111111196004101"
				},
				"code": "C3",
				"name": {
					"zh_CN": "资产租入合同",
					"en_US": "Asset Lease-in Contract"
				},
				"billTypeId": "1712222222227669506",
				"billTypeId___code": "PMC5004",
				"enable": "0",
				"contractGroupId": "19753322222226004096",
				"remark": {
					"zh_CN": "中文说明",
					"en_US": "En_12321"
				},
				"adaptallorgs": false,
				"creator": "00001951-7ca3-4xxxxxxxxxd5a66e3e6724",
				"createTime": "2024-04-15 13:38:39",
				"modifier": "7071cd2f-c32xxxxxxxxxxxba1a5ab3e77b",
				"modifyTime": "2025-02-25 19:49:15",
				"pubts": "2025-02-25 19:49:15",
				"contractType_transTypeIdList": [
					{
						"id": "221002222222228",
						"transTypeId": "19752xxxxxx1503320",
						"transTypeId___code": "PMC5004-01",
						"fkid": "19111111111196004101"
					}
				],
				"contracttypescopeList": [
					{
						"id": "2210001535557959685",
						"orgId": "1333333333316939013",
						"orgId___code": "sdfggf",
						"adaptalldepts": false,
						"contracttypescope_deptIdsList": [
							{
								"id": "22102323232323223686",
								"fkid": "221002222222228",
								"deptIds": "197xxxx1233314881",
								"deptIds___code": "jhgfd"
							}
						]
					}
				]
			}
		],
		"failInfos": [
			{
				"sourceUnique": "191111212121296004101",
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


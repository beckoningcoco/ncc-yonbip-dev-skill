---
title: "物料分类批量新增保存"
apiId: "1897560351621251076"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料分类批量新增保存

> `ContentType	application/json` 请求方式	POST | 分类: Material Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/managementclass/newbatchinsert

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
| code | string | 否 | 是 | 编码 示例：000107 |
| name | object | 否 | 是 | 名称 |
| simplifiedName | string | 否 | 是 | 简体 示例：分类测试001 |
| englishName | string | 否 | 否 | 英文 示例：分类测试001 |
| traditionalName | string | 否 | 否 | 繁体 示例：分类测试001 |
| parentCode | string | 否 | 否 | 上级分类编码 示例：000106 |
| orgCode | string | 否 | 否 | 管理组织编码 示例：global00 |
| templateName | string | 否 | 否 | 物料模板名称 示例：hzw物料模板 |
| productClassCode | string | 否 | 否 | 商品分类编码 示例：001 |
| order | int | 否 | 否 | 排序号 示例：1 |
| stopStatus | boolean | 否 | 否 | 启用状态 true：停用 false：启用 默认：false 示例：false |
| remark | object | 否 | 否 | 备注 |
| simplifiedName | string | 否 | 否 | 简体 示例：分类测试001 |
| englishName | string | 否 | 否 | 英文 示例：分类测试001 |
| traditionalName | string | 否 | 否 | 繁体 示例：分类测试001 |
| orgGroups | object | 是 | 否 | 物料分类分配的组织 |
| orgCode | string | 否 | 否 | 组织编码 示例：A1 |

## 3. 请求示例

Url: /yonbip/digitalModel/managementclass/newbatchinsert?access_token=访问令牌
Body: [{
	"code": "000107",
	"name": {
		"simplifiedName": "分类测试001",
		"englishName": "分类测试001",
		"traditionalName": "分类测试001"
	},
	"parentCode": "000106",
	"orgCode": "global00",
	"templateName": "hzw物料模板",
	"productClassCode": "001",
	"order": 1,
	"stopStatus": false,
	"remark": {
		"simplifiedName": "分类测试001",
		"englishName": "分类测试001",
		"traditionalName": "分类测试001"
	},
	"orgGroups": [
		{
			"orgCode": "A1"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 成功或异常失败描述 示例：处理成功 |
| data | object | 否 | 详细返回结果 |
| count | int | 否 | 数量 示例：2 |
| successCount | int | 否 | 成功数量 示例：1 |
| failCount | int | 否 | 失败数量 示例：1 |
| messages | string | 是 | 失败详细信息 示例：["名称[分类测试002]编码[000108]保存失败，上级被物料引用，不能有子级"] |
| infos | object | 是 | 成功详细信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			"名称[分类测试002]编码[000108]保存失败，上级被物料引用，不能有子级"
		],
		"infos": [
			{
				"id": 1897546186716348400,
				"code": "000107"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。

118000	入参不能为空

118003	请求数量超过最大限制数量


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-05

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


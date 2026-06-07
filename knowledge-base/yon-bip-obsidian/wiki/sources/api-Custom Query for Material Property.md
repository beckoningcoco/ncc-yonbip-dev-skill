---
title: "物料属性自定义查询"
apiId: "38a44c6de9c44536aa2a24304e84ca5a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料属性自定义查询

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productpro/query

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
| condition | object | 否 | 否 | 查询条件 |
| simpleVOs | object | 是 | 否 | 查询条件 |
| data | string | 否 | 否 | 想要查询的字段，*为查询所有 示例：* |
| queryOrders | object | 否 | 否 | 排序设置 |
| partParam | object | 否 | 否 | 子对象查询配置 |

## 3. 请求示例

Url: /yonbip/digitalModel/productpro/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "classId",
				"op": "eq",
				"value1": "productArchive"
			}
		]
	},
	"data": "*",
	"queryOrders": {},
	"partParam": {}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| iorder | long | 否 | 排序号 示例：0 |
| defineId | string | 否 | 编码 示例：define114 |
| name | string | 否 | 商品名称 示例：商品档案 |
| isShowSpec | boolean | 否 | 是否适用零售 示例：false |
| isEnabled | boolean | 否 | 是否启用 示例：true |
| isMultiSel | boolean | 否 | 是否多选，true：是，false：否 示例：false |
| isSerInput | boolean | 否 | 管理端必输，true：是，false：否 示例：false |
| userdefMode | long | 否 | 录入方式, 0:输入项、1:选择项、2:输入+选择、3:提示语、 示例：1 |
| userdefAlias | string | 否 | 属性别名 示例：物料属性别名02 |
| propertyType | long | 否 | 属性 示例：0 |
| classId | string | 否 | 分类 示例：productArchive |
| isDeleted | boolean | 否 | 是否逻辑删除，true：是，false：否 示例：false |
| sourcetype | boolean | 否 | true：系统预置，false：自定项 示例：false |
| length | long | 否 | 长度 示例：255 |
| id | long | 否 | 物料属性id 示例：1511004183810360 |
| showItem | string | 否 | 名称 示例：物料属性02 |
| item | string | 否 | 项目号 示例：自定义项24 |
| type | string | 否 | 类型 示例：String |
| tenant | long | 否 | 租户id 示例：1511008618713344 |
| maxInputLen | long | 否 | 最大输入长度 示例：255 |
| isWebShow | boolean | 否 | 前端显示，true：是，false：否 示例：false |
| orderNum | long | 否 | 顺序 示例：0 |
| pubts | string | 否 | 时间戳 示例：2019-12-04 11:05:33 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"iorder": 0,
			"defineId": "define114",
			"name": "商品档案",
			"isShowSpec": false,
			"isEnabled": true,
			"isMultiSel": false,
			"isSerInput": false,
			"userdefMode": 1,
			"userdefAlias": "物料属性别名02",
			"propertyType": 0,
			"classId": "productArchive",
			"isDeleted": false,
			"sourcetype": false,
			"length": 255,
			"id": 1511004183810360,
			"showItem": "物料属性02",
			"item": "自定义项24",
			"type": "String",
			"tenant": 1511008618713344,
			"maxInputLen": 255,
			"isWebShow": false,
			"orderNum": 0,
			"pubts": "2019-12-04 11:05:33"
		}
	]
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


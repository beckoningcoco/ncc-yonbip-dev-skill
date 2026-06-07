---
title: "SKU属性详情查询"
apiId: "22bedc83eb414f34b49252a86e092850"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Product SKU File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product SKU File]
platform_version: "BIP"
source_type: community-api-docs
---

# SKU属性详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Product SKU File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productskupro/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | SKU属性id    示例: 2237431302820165 |

## 3. 请求示例

Url: /yonbip/digitalModel/productskupro/detail?access_token=访问令牌&id=2237431302820165

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| isSerInput | boolean | 否 | 管理端是否必输：false否，true是 示例：false |
| achiveCode | string | 否 | 引用档案编码 示例：pub_refList |
| userdefDesc | object | 否 | 备注 |
| length | long | 否 | 长度 示例：200 |
| orderNum | long | 否 | 顺序号 示例：0 |
| userdefAlias | object | 否 | 属性别名 |
| type | string | 否 | 属性类型，Date：日期，DateTime：日期时间，Double：数值，Integer：整型，ReferArchive：引用档案，String：文本，Time：时间 示例：ReferArchive |
| userdefMode | long | 否 | 录入方式：0输入项，1选择项，属性类型为文本时，录入方式可以选择0输入项或1选择项。当属性类型不是文本时，录入方式只能是0输入项 示例：0 |
| achiveReturnCaption | string | 否 | 档案返回值 示例：名称 |
| isEnabled | boolean | 否 | 是否启用：false否，true是 示例：false |
| achiveDomain | string | 否 | 领域编码 示例：retail |
| achiveReturn | string | 否 | 档案返回值列名 示例：name |
| showItem | object | 否 | 属性名称 |
| sourcetype | boolean | 否 | true：系统预置，false：自定项 示例：false |
| id | long | 否 | SKU属性id 示例：2345188090260275 |
| isWebShow | boolean | 否 | 前端是否显示：false否，true是 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-08-05 19:50:01 |
| achiveName | string | 否 | 引用档案名称 示例：参照列表 |
| achiveDomainName | string | 否 | 领域名称 示例：友零售 |
| userdefines | object | 是 | 自定义项值集合 |
| checkPro | object | 否 | 校验是否被模板引用返回值 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"isSerInput": false,
		"achiveCode": "pub_refList",
		"userdefDesc": {
			"zh_CN": ""
		},
		"length": 200,
		"orderNum": 0,
		"userdefAlias": {
			"zh_CN": "20210805"
		},
		"type": "ReferArchive",
		"userdefMode": 0,
		"achiveReturnCaption": "名称",
		"isEnabled": false,
		"achiveDomain": "retail",
		"achiveReturn": "name",
		"showItem": {
			"zh_CN": "20210805"
		},
		"sourcetype": false,
		"id": 2345188090260275,
		"isWebShow": false,
		"pubts": "2021-08-05 19:50:01",
		"achiveName": "参照列表",
		"achiveDomainName": "友零售",
		"userdefines": [
			{
				"code": "20210805",
				"name": "20210805",
				"id": "2375074449248512",
				"userdefid": "2345188090260275",
				"pubts": "2021-08-05 19:30:40"
			}
		],
		"checkPro": {
			"checkBody": [
				""
			],
			"checkHead": 0
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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


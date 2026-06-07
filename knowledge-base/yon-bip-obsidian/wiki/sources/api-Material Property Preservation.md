---
title: "物料属性保存"
apiId: "41442cb396c24a47b2abf42334274925"
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

# 物料属性保存

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productpro/save

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
| data | object | 否 | 是 | 物料属性 |
| id | long | 否 | 否 | 物料属性id，修改时必传 示例：2288600497578556 |
| showItem | object | 否 | 是 | 属性名称 |
| userdefAlias | object | 否 | 是 | 属性别名 |
| type | string | 否 | 是 | 属性类型，Date：日期，DateTime：日期时间，Double：数值，Integer：整型，ReferArchive：引用档案，String：文本，Time：时间 示例：String |
| orderNum | long | 否 | 是 | 排序 示例：10 |
| isSerInput | boolean | 否 | 是 | 管理端必输，true必输，false不必输 示例：true |
| isWebShow | boolean | 否 | 是 | 前端显示，true是，false否 示例：true |
| isEnabled | boolean | 否 | 是 | 是否启用，true启用，false不启用 示例：true |
| userdefMode | string | 否 | 是 | 录入方式：0输入项，1选择项，属性类型为文本时，录入方式可以选择0输入项或1选择项。当属性类型不是文本时，录入方式只能是0输入项 示例：0 |
| maxInputLen | string | 否 | 否 | 录入长度。属性类型为数值、文本、整型时，该参数必填。属性类型为日期、时间、日期时间、引用档案时该参数不填。属性类型为数值或整型时，录入长度最大为15；属性类型为文本时，录入长度最大为255 示例：255 |
| decimalDigits | string | 否 | 否 | 小数位。属性类型为数值时该参数可输入，最大为8，属性类型非数值则不能输入 |
| achiveDomainName | string | 否 | 否 | 来源域名称,当属性类型为引用档案时输入 |
| achiveName | string | 否 | 否 | 引用档案名称,当属性类型为引用档案时输入 |
| userdefDesc | object | 否 | 否 | 备注 |
| achiveReturnCaption | string | 否 | 否 | 档案返回值名称,当属性类型为引用档案时输入 |
| userdefines | object | 是 | 否 | 自定义项值集合，当录入方式为1时，输入 |
| _status | string | 否 | 是 | 实体状态，如Insert新增，Update修改 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/productpro/save?access_token=访问令牌
Body: {
	"data": {
		"id": 2288600497578556,
		"showItem": {
			"zh_CN": "20210728",
			"en_US": "",
			"zh_TW": ""
		},
		"userdefAlias": {
			"zh_CN": "20210728-1",
			"en_US": "",
			"zh_TW": ""
		},
		"type": "String",
		"orderNum": 10,
		"isSerInput": true,
		"isWebShow": true,
		"isEnabled": true,
		"userdefMode": "0",
		"maxInputLen": "255",
		"decimalDigits": "",
		"achiveDomainName": "",
		"achiveName": "",
		"userdefDesc": {
			"zh_CN": "测试20210728",
			"en_US": "",
			"zh_TW": ""
		},
		"achiveReturnCaption": "",
		"userdefines": [
			{
				"id": "",
				"code": "1",
				"name": "1",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 返回值数据 |
| id | long | 否 | 物料属性id 示例：2058080304809256 |
| sourcetype | boolean | 否 | true：系统预置，false：自定项 示例：false |
| showItem | object | 否 | 属性名称 |
| type | string | 否 | 属性类型，Date：日期，DateTime：日期时间，Double：数值，Integer：整型，ReferArchive：引用档案，String：文本，Time：时间 示例：String |
| orderNum | long | 否 | 排序 示例：0 |
| isSerInput | boolean | 否 | 管理端必输，true是，false否 示例：false |
| isWebShow | boolean | 否 | 前端显示，true是，false否 示例：false |
| isEnabled | boolean | 否 | 是否启用，true启用，false不启用 示例：false |
| userdefMode | long | 否 | 录入方式：0输入项，1选择项 示例：1 |
| maxInputLen | long | 否 | 录入长度 示例：255 |
| checkPro | object | 否 | 被模板引用返回数据 |
| pubts | string | 否 | 时间戳 示例：2021-07-28 15:14:13 |
| defineId | string | 否 | 自定义项项目号 示例：define97 |
| userdefines | object | 是 | 自定义项列表 |
| showItemResid | string | 否 | 规格名称资源编号 示例：P_YS_PF_GZTSYS_0001301266 |
| classname | string | 否 | 分类 示例：商品档案 |
| classId | string | 否 | 分类id 示例：productArchive |
| tenant | long | 否 | 租户id 示例：2155538208313600 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2058080304809256,
		"sourcetype": false,
		"showItem": {
			"zh_CN": "22"
		},
		"type": "String",
		"orderNum": 0,
		"isSerInput": false,
		"isWebShow": false,
		"isEnabled": false,
		"userdefMode": 1,
		"maxInputLen": 255,
		"checkPro": {
			"checkBody": [
				""
			],
			"checkHead": "0"
		},
		"pubts": "2021-07-28 15:14:13",
		"defineId": "define97",
		"userdefines": [
			{
				"code": "2",
				"name": "2",
				"defineId": "define97",
				"id": 2363559729008896,
				"userdefid": 2058080304809256,
				"tenant": 2155538208313600,
				"yTenantId": "csrka3z7"
			}
		],
		"showItemResid": "P_YS_PF_GZTSYS_0001301266",
		"classname": "商品档案",
		"classId": "productArchive",
		"tenant": 2155538208313600
	}
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


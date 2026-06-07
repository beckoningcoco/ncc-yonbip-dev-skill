---
title: "物料规格保存"
apiId: "9423a4fa41a9442ba6773719ef090e0a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Specification"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Specification]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料规格保存

> `ContentType	application/json` 请求方式	POST | 分类: Material Specification (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/spepro/save

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
| data | object | 否 | 是 | 物料规格 |
| id | string | 否 | 否 | 物料规格id（新增不填，修改必填） |
| showItem | object | 否 | 是 | 物料规格名称（多语） |
| type | string | 否 | 是 | 物料规格类型，Archive：自定义枚举 CustArchive：自定义档案 示例：Archive |
| erpCode | string | 否 | 否 | 物料规格外部编码 示例：lichi20210326 |
| isShowSpec | string | 否 | 是 | 是否单独显示，true：是，false：否 示例：false |
| userdefDesc | object | 否 | 否 | 物料规格备注（多语） |
| defineId | string | 否 | 否 | 编码，修改物料规格必填 |
| isEnabled | boolean | 否 | 是 | true：已启用，false：已停用 示例：true |
| checkPro | string | 否 | 否 | 是否关联 |
| _status | string | 否 | 是 | Insert：新增物料规格，Update：编辑物料规格 |
| userdefinespecs | object | 是 | 否 | 物料规格值 |
| achiveDefineCode | string | 否 | 否 | 自定义档案编码 0003 |
| achiveReturn | string | 否 | 否 | 档案返回值编码 name |

## 3. 请求示例

Url: /yonbip/digitalModel/spepro/save?access_token=访问令牌
Body: {
	"data": {
		"id": "",
		"showItem": {
			"zh_CN": "lichi20210326",
			"en_US": "lichi20210326",
			"zh_TW": "lichi20210326"
		},
		"type": "Archive",
		"erpCode": "lichi20210326",
		"isShowSpec": "false",
		"userdefDesc": {
			"zh_CN": "",
			"en_US": "",
			"zh_TW": ""
		},
		"defineId": "",
		"isEnabled": true,
		"checkPro": "",
		"_status": "",
		"userdefinespecs": [
			{
				"hasDefaultInit": true,
				"userdefid": "",
				"id": "",
				"name": "",
				"erpName": "",
				"barCode": "",
				"orderNum": 0,
				"_status": "",
				"isEnabled": "true",
				"code": ""
			}
		],
		"achiveDefineCode": "",
		"achiveReturn": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 主表关联标识 |
| showItem | muti_lang | 否 | 规格名称,支持多语 |
| erpCode | string | 否 | 外部编码 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| isShowSpec | string | 否 | 单独显示, true:是、false:否、 |
| userdefDesc | muti_lang | 否 | 规格备注,支持多语 |
| defineId | string | 否 | 编码 |
| isEnabled | boolean | 否 | 启用状态, true:启用、false:停用、 |
| checkPro | string | 否 | 是否关联 |
| userdefinespecs | object | 是 | 规格枚举项子表[pc.userdef.UserDefineSpec] |
| type | string | 否 | 类型 |
| classname | string | 否 | 分类 |
| classId | string | 否 | 分类id |
| defineIdOther | string | 否 | 编码2 |
| isWebInput | string | 否 | 前端必输 |
| isSerInput | string | 否 | 管理端必输 |
| isWebShow | string | 否 | 前端显示 |
| sourcetype | string | 否 | 区分系统预置或自定项 |
| isDeleted | string | 否 | 是否删除 |
| item | string | 否 | 项目号 |
| maxInputLen | string | 否 | 录入长度 |
| iorder | string | 否 | 排序 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"showItem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"erpCode": "",
		"pubts": "",
		"isShowSpec": "",
		"userdefDesc": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"defineId": "",
		"isEnabled": true,
		"checkPro": "",
		"userdefinespecs": [
			{
				"tenant": "",
				"hasDefaultInit": true,
				"userdefid": "",
				"pubts": "",
				"id": "",
				"name": "",
				"erpName": "",
				"barCode": "",
				"orderNum": 0,
				"iorder": ""
			}
		],
		"type": "",
		"classname": "",
		"classId": "",
		"defineIdOther": "",
		"isWebInput": "",
		"isSerInput": "",
		"isWebShow": "",
		"sourcetype": "",
		"isDeleted": "",
		"item": "",
		"maxInputLen": "",
		"iorder": ""
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


---
title: "自定义项设置保存"
apiId: "ac39fe56322c4af6ba594bbbe20896a4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义项设置保存

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attrext/save

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
| data | object | 否 | 是 | 自定义项[pc.userdefnew.AttrExtVO] |
| appranges | object | 是 | 否 | 应用范围 |
| userdefines | object | 是 | 否 | 暂无实际意义 |
| showitem | muti_lang | 否 | 是 | 名称 |
| docname | string | 否 | 否 | 参照档案名称 |
| type | string | 否 | 是 | 类型, String:文本、Double:数值、Integer:整型、Date:日期、Time:时间、DateTime:日期时间、Archive:自定义枚举、BaseArchive:基本档案、CustArchive:自定义档案、 |
| id | string | 否 | 否 | ID 新增时无需填写，修改时必填 新增时无需填写，修改时必填 新增时无需填写，修改时必填 |
| isEnabled | string | 否 | 否 | 是否启用, true:是、false:否、 |
| isInput | string | 否 | 否 | 是否必输, true:是、false:否、 |
| maxinputlen | int | 否 | 是 | 长度 |
| refDocId | string | 否 | 否 | 引用档案 |
| ref_name | string | 否 | 否 | 引用档案 |
| decimaldigits | int | 否 | 是 | 精度 |
| creator | string | 否 | 否 | 创建人 |
| createTime | string | 否 | 否 | 创建时间 |
| checkPro | string | 否 | 否 | 是否关联 |
| modifier | string | 否 | 否 | 修改人 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| modifyTime | string | 否 | 否 | 修改时间 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| attrextSub | object | 是 | 是 | 自定义项子表[pc.userdefnew.AttrExtdefine] |
| attrextShow | object | 是 | 是 | 自定义项预览[pc.userdefnew.AppRange] |

## 3. 请求示例

Url: /yonbip/digitalModel/attrext/save?access_token=访问令牌
Body: {
	"data": {
		"appranges": [
			{}
		],
		"userdefines": [
			{}
		],
		"showitem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"docname": "",
		"type": "",
		"id": "",
		"isEnabled": "",
		"isInput": "",
		"maxinputlen": 0,
		"refDocId": "",
		"ref_name": "",
		"decimaldigits": 0,
		"creator": "",
		"createTime": "",
		"checkPro": "",
		"modifier": "",
		"pubts": "",
		"modifyTime": "",
		"_status": "",
		"attrextSub": [
			{
				"id": "",
				"defineId": "",
				"userdefid": "",
				"code": "",
				"name": "",
				"pubts": "",
				"_status": ""
			}
		],
		"attrextShow": [
			{
				"id": "",
				"attrextid": "",
				"billid": "",
				"entityuri": "",
				"systemCode": "",
				"_status": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| tenant_id | string | 否 | 租户id |
| showitem_resid | string | 否 | 名称多语 |
| classname | string | 否 | 分类 |
| classId | string | 否 | 项目号 |
| defineId | string | 否 | 自定义项defineid名称 |
| yhtTenant | string | 否 | 友户通租户 |
| creationtime | string | 否 | 创建时间 |
| tenant | string | 否 | 租户 |
| showitem | muti_lang | 否 | 名称 |
| docname | string | 否 | 参照档案名称 |
| type | string | 否 | 类型, String:文本、Double:数值、Integer:整型、Date:日期、Time:时间、DateTime:日期时间、Archive:自定义枚举、BaseArchive:基本档案、CustArchive:自定义档案、 |
| id | int | 否 | 主键 |
| isEnabled | boolean | 否 | 是否启用, true:是、false:否、 |
| isInput | boolean | 否 | 是否必输, true:是、false:否、 |
| maxinputlen | int | 否 | 长度 |
| refDocId | string | 否 | 引用档案 |
| ref_name | string | 否 | 引用档案 |
| decimaldigits | int | 否 | 精度 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| checkPro | string | 否 | 是否关联 |
| modifier | string | 否 | 修改人 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| modifyTime | string | 否 | 修改时间 |
| attrextSub | object | 是 | 自定义项子表[pc.userdefnew.AttrExtdefine] |
| attrextShow | object | 是 | 自定义项预览[pc.userdefnew.AppRange] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"tenant_id": "",
		"showitem_resid": "",
		"classname": "",
		"classId": "",
		"defineId": "",
		"yhtTenant": "",
		"creationtime": "",
		"tenant": "",
		"showitem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"docname": "",
		"type": "",
		"id": 0,
		"isEnabled": true,
		"isInput": true,
		"maxinputlen": 0,
		"refDocId": "",
		"ref_name": "",
		"decimaldigits": 0,
		"creator": "",
		"createTime": "",
		"checkPro": "",
		"modifier": "",
		"pubts": "",
		"modifyTime": "",
		"attrextSub": [
			{
				"id": "",
				"defineId": "",
				"userdefid": "",
				"code": "",
				"name": "",
				"pubts": ""
			}
		],
		"attrextShow": [
			{
				"id": "",
				"attrextid": "",
				"billid": "",
				"entityuri": "",
				"systemCode": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	按照正确参数填写


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


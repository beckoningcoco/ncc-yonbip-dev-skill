---
title: "固定自定义项保存"
apiId: "a82a0f1da96543a28e546c369799b613"
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

# 固定自定义项保存

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attrextfixed/save

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
| data | object | 否 | 否 | data |
| classId | string | 否 | 否 | 表头 示例：billHead |
| ref_name | string | 否 | 否 | 引用档案 示例：税目税率 |
| type | string | 否 | 是 | 类型 示例：BaseArchive |
| isInput | boolean | 否 | 否 | 是否必输, true:是、false:否、 示例：true |
| isEnabled | string | 否 | 否 | 是否启用, true:是、false:否、 示例：false |
| maxinputlen | long | 否 | 是 | 长度 示例：0 |
| showitem | muti_lang | 否 | 是 | showitem |
| userdefines | string | 是 | 否 | userdefines |
| refDocId | string | 否 | 否 | refDocId 示例：ucfbasedoc.bd_taxrate&bd.taxrate.TaxRateVO&税目税率&P_YS_PF_GZTSYS_0000013143 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| decimaldigits | long | 否 | 是 | 精度 示例：0 |
| bShowIt | string | 否 | 否 | bShowIt 示例：true |
| _status | string | 否 | 否 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| id | string | 否 | 否 | id 新增时无需填写，修改时必填 |

## 3. 请求示例

Url: /yonbip/digitalModel/attrextfixed/save?access_token=访问令牌
Body: {
	"data": {
		"classId": "billHead",
		"ref_name": "税目税率",
		"type": "BaseArchive",
		"isInput": true,
		"isEnabled": "false",
		"maxinputlen": 0,
		"showitem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"userdefines": [
			""
		],
		"refDocId": "ucfbasedoc.bd_taxrate&bd.taxrate.TaxRateVO&税目税率&P_YS_PF_GZTSYS_0000013143",
		"pubts": "",
		"decimaldigits": 0,
		"bShowIt": "true",
		"_status": "Insert",
		"id": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| docname_resid | string | 否 | docname_resid 示例：P_YS_PF_GZTSYS_0000013143 |
| ref_name | string | 否 | 引用档案 示例：税目税率 |
| showitem_resid | string | 否 | showitem_resid 示例：R_YS_PF_GZTBDM_0000095981 |
| id | long | 否 | id 示例：1891882930753792 |
| userdefines | string | 是 | userdefines |
| refUri | string | 否 | refUri 示例：bd.taxrate.TaxRateVO |
| showitem | muti_lang | 否 | showitem |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-08-29 11:22:51 |
| maxinputlen | long | 否 | 长度 示例：0 |
| tenant | string | 否 | 租户 示例：umwz7rz7 |
| tenant_id | string | 否 | 租户id 示例：umwz7rz7 |
| yhtTenant | string | 否 | 友户通租户 示例：umwz7rz7 |
| decimaldigits | long | 否 | 精度 示例：0 |
| isEnabled | boolean | 否 | 是否启用, true:是、false:否、 示例：false |
| classname | string | 否 | classname 示例：单据头 |
| refDocId | string | 否 | refDocId 示例：ucfbasedoc.bd_taxrate |
| isInput | boolean | 否 | 是否必输, tru 示例：true |
| defineId | string | 否 | defineId 示例：headDefine3 |
| creationtime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-08-29 11:22:50 |
| bShowIt | boolean | 否 | bShowIt 示例：true |
| docname | string | 否 | 参照档案名称 示例：税目税率 |
| type | string | 否 | 类型 示例：BaseArchive |
| classId | string | 否 | 表头 示例：billHead |
| creator | string | 否 | 创建人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"docname_resid": "P_YS_PF_GZTSYS_0000013143",
		"ref_name": "税目税率",
		"showitem_resid": "R_YS_PF_GZTBDM_0000095981",
		"id": 1891882930753792,
		"userdefines": [
			""
		],
		"refUri": "bd.taxrate.TaxRateVO",
		"showitem": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"pubts": "2020-08-29 11:22:51",
		"maxinputlen": 0,
		"tenant": "umwz7rz7",
		"tenant_id": "umwz7rz7",
		"yhtTenant": "umwz7rz7",
		"decimaldigits": 0,
		"isEnabled": false,
		"classname": "单据头",
		"refDocId": "ucfbasedoc.bd_taxrate",
		"isInput": true,
		"defineId": "headDefine3",
		"creationtime": "2020-08-29 11:22:50",
		"bShowIt": true,
		"docname": "税目税率",
		"type": "BaseArchive",
		"classId": "billHead",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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


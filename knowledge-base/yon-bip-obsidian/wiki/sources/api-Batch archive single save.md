---
title: "批次档案单个保存"
apiId: "04766916f76f4a63bdb28c25eef04444"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Batch No. Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Batch No. Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 批次档案单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Batch No. Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/batchno/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| key | string | 否 | 否 | 主键字段 示例:id__pk 默认值:id__pk 示例：id__pk |
| data | object | 否 | 是 | 批次号[st.batchno.Batchno] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| product | string | 否 | 是 | 物料编码 示例：wjl002 |
| productsku | string | 否 | 否 | sku编码 示例：wjl002 |
| batchno | string | 否 | 是 | 批次号 示例：ce001 |
| producedate | string | 否 | 否 | 生产日期 示例：2018-06-23 |
| invaliddate | string | 否 | 否 | 有效期至 示例：2020-06-22 |
| define1 | string | 否 | 否 | 批次属性1 示例：11 |
| define2 | string | 否 | 否 | 批次属性2 示例：22 |
| define3 | string | 否 | 否 | 批次属性3 示例：33 |
| define4 | string | 否 | 否 | 批次属性4 示例：44 |
| define5 | string | 否 | 否 | 批次属性5 示例：55 |
| define6 | string | 否 | 否 | 批次属性6 示例：66 |
| define7 | string | 否 | 否 | 批次属性7 示例：77 |
| define8 | string | 否 | 否 | 批次属性8 示例：88 |
| define9 | string | 否 | 否 | 批次属性9 示例：99 |
| define10 | string | 否 | 否 | 批次属性10 示例：11 |
| define11 | string | 否 | 否 | 批次属性11 示例：11 |
| define12 | string | 否 | 否 | 批次属性12 示例：11 |
| define13 | string | 否 | 否 | 批次属性13 示例：11 |
| define14 | string | 否 | 否 | 批次属性14 示例：11 |
| define15 | string | 否 | 否 | 批次属性15 示例：11 |
| define16 | string | 否 | 否 | 批次属性16 示例：11 |
| define17 | string | 否 | 否 | 批次属性17 示例：11 |
| define18 | string | 否 | 否 | 批次属性18 示例：33 |
| define19 | string | 否 | 否 | 批次属性19 示例：33 |
| define20 | string | 否 | 否 | 批次属性20 示例：33 |
| define21 | string | 否 | 否 | 批次属性21 示例：33 |
| define22 | string | 否 | 否 | 批次属性22 示例：33 |
| define23 | string | 否 | 否 | 批次属性23 示例：33 |
| define24 | string | 否 | 否 | 批次属性24 示例：33 |
| define25 | string | 否 | 否 | 批次属性25 示例：33 |
| define26 | string | 否 | 否 | 批次属性26 示例：33 |
| define27 | string | 否 | 否 | 批次属性27 示例：33 |
| define28 | string | 否 | 否 | 批次属性28 示例：33 |
| define29 | string | 否 | 否 | 批次属性29 示例：33 |
| define30 | string | 否 | 否 | 批次属性30 示例：33 |
| firstStoredDate | string | 否 | 否 | 首次入库日期 示例：2018-06-23 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 示例：Insert |
| id__pk | string | 否 | 否 | 主键 示例:00001 示例：0001 |

## 3. 请求示例

Url: /yonbip/scm/batchno/save?access_token=访问令牌
Body: {
	"key": "id__pk",
	"data": {
		"resubmitCheckKey": "",
		"product": "wjl002",
		"productsku": "wjl002",
		"batchno": "ce001",
		"producedate": "2018-06-23",
		"invaliddate": "2020-06-22",
		"define1": "11",
		"define2": "22",
		"define3": "33",
		"define4": "44",
		"define5": "55",
		"define6": "66",
		"define7": "77",
		"define8": "88",
		"define9": "99",
		"define10": "11",
		"define11": "11",
		"define12": "11",
		"define13": "11",
		"define14": "11",
		"define15": "11",
		"define16": "11",
		"define17": "11",
		"define18": "33",
		"define19": "33",
		"define20": "33",
		"define21": "33",
		"define22": "33",
		"define23": "33",
		"define24": "33",
		"define25": "33",
		"define26": "33",
		"define27": "33",
		"define28": "33",
		"define29": "33",
		"define30": "33",
		"firstStoredDate": "2018-06-23",
		"_status": "Insert",
		"id__pk": "0001"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回消息 示例：操作成功 |
| data | object | 否 | 返回数据集 |
| successCountAI | long | 否 | 成功 示例：1 |
| failCountAI | long | 否 | 失败 示例：0 |
| count | long | 否 | 次数 示例：1 |
| sucessCount | long | 否 | 成功次数 示例：1 |
| failCount | long | 否 | 失败次数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"product": "2143764193087745",
				"batchno": "ch270",
				"invaliddate": "\"2021-09-29 00:00:00\"",
				"productsku": "2015216374485248",
				"producedate": "\"2020-11-30 00:00:00\"",
				"product_cName": "zjj1124sku批次",
				"product_cCode": "11241",
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"id": "2271282061152512",
				"pubts": "2021-05-24 11:47:35",
				"tenant": "1849710349897984",
				"yTenantId": "lzu07egu",
				"define1": "自定义数字1",
				"define2": "自定义数字2",
				"define3": "自定义数字3",
				"define4": "自定义数字4",
				"define5": "自定义数字5",
				"define6": "自定义数字6",
				"define7": "自定义数字7",
				"define8": "自定义数字8",
				"define9": "自定义数字9",
				"define10": "自定义数字10",
				"define11": "自定义数字11",
				"define12": "自定义数字12",
				"define13": "自定义数字13",
				"define14": "自定义数字14",
				"define15": "自定义数字15",
				"define16": "自定义数字16",
				"define17": "自定义数字17",
				"define18": "自定义数字18",
				"define19": "自定义数字19",
				"define20": "自定义数字20",
				"define21": "自定义数字21",
				"define22": "自定义数字22",
				"define23": "自定义数字23",
				"define24": "自定义数字24",
				"define25": "自定义数字25",
				"define26": "自定义数字26",
				"define27": "自定义数字27",
				"define28": "自定义数字28",
				"define29": "自定义数字29",
				"define30": "自定义数字30"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	效期管理的商品生产日期/有效期不能为空	录入正确的producedate，invaliddate


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-08

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


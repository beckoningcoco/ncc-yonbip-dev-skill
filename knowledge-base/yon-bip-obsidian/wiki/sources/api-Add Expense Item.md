---
title: "费用项目新增"
apiId: "1846128710969196553"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Item"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用项目新增

> `ContentType	application/json` 请求方式	POST | 分类: Expense Item (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/iuap-apdoc-finbd/bill/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 是 | 业务单元ID 示例：666666 |
| code | string | 否 | 是 | 编码 示例：Fee_KL |
| name | object | 否 | 是 | 名称对象 |
| mnemoniccode | string | 否 | 否 | 助记码 示例：WXF |
| expenseitemtype | string | 否 | 否 | 费用项目类型ID 示例：1855939352560926727 |
| desc | object | 否 | 否 | 备注对象 |
| enabled | boolean | 否 | 否 | 启用状态(启用:true;停用:fasle) 示例：true 默认值：true |
| _status | string | 否 | 是 | 状态(新增为Insert;更新为Update) 示例：Insert |
| id | string | 否 | 否 | 费用项目id(新增时不传，修改时必传) 示例：111 |

## 3. 请求示例

Url: /yonbip/AMP/iuap-apdoc-finbd/bill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accentity": "666666",
		"code": "Fee_KL",
		"name": {
			"zh_CN": "维修费"
		},
		"mnemoniccode": "WXF",
		"expenseitemtype": "1855939352560926727",
		"desc": {
			"zh_CN": "维修产生的费用"
		},
		"enabled": true,
		"_status": "Insert",
		"id": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| accentity | string | 否 | 业务单元 示例：666666 |
| code | string | 否 | code 示例：Fee_KL |
| name | object | 否 | name |
| mnemoniccode | string | 否 | 助记码 示例：WXF |
| expenseitemtype | string | 否 | 费用项目类型 示例：1855939352560926700 |
| desc | object | 否 | 描述 |
| enabled | boolean | 否 | 是否生效，0：未生效，1：生效 示例：true |
| pubts | string | 否 | pubts 示例：2023-10-24 11:40:19 |
| id | string | 否 | id 示例：1855770551687053300 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity": "666666",
		"code": "Fee_KL",
		"name": {
			"zh_CN": "维修费"
		},
		"mnemoniccode": "WXF",
		"expenseitemtype": "1855939352560926700",
		"desc": {
			"zh_CN": "维修产生的费用"
		},
		"enabled": true,
		"pubts": "2023-10-24 11:40:19",
		"id": "1855770551687053300"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	编码 (Fee_KL) 已经存在	编码重复，请修改费用项目编码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-12

更新

请求说明

新增

请求参数 mnemoniccode

更新

请求参数 (4)

新增

返回参数 mnemoniccode

更新

返回参数 (13)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


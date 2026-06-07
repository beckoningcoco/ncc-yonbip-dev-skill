---
title: "基础档案对照批量新增/编辑"
apiId: "2232041306359070725"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Basic File Mapping"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Basic File Mapping]
platform_version: "BIP"
source_type: community-api-docs
---

# 基础档案对照批量新增/编辑

> `ContentType	application/json` 请求方式	POST | 分类: Basic File Mapping (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/baseDocMapping/batchsave

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 否 | 基础档案对照主键（新增不传该值，编辑时传值) 示例：1819690017583792130 |
| code | string | 否 | 是 | 基础档案对照编码 示例：1001 |
| name | string | 否 | 是 | 基础档案对照名称：中文 示例：基础档案对照名称 |
| name2 | string | 否 | 否 | 基础档案对照名称：英文 |
| name3 | string | 否 | 否 | 基础档案对照名称：繁体 |
| name4 | string | 否 | 否 | 基础档案对照名称预留 |
| name5 | string | 否 | 否 | 基础档案对照名称预留 |
| name6 | string | 否 | 否 | 基础档案对照名称预留 |
| targetOrg | string | 否 | 是 | 目标组织主键 |
| desDocType | string | 否 | 是 | 目标档案类型主键 |
| srcDocTypes | object | 是 | 是 | 档案对照与来源档案类型关联数组( 最多支持选择四个来源档案类型！) |
| srcDocType | string | 否 | 否 | 来源档案类型主键 |
| bodies | object | 是 | 否 | 基础档案对照子表 |
| desDocTypeId | string | 是 | 否 | 目标档案类型主键 |
| field1 | string | 否 | 否 | 来源档案类型1的主键 |
| field2 | string | 否 | 否 | 来源档案类型2的主键 |
| field3 | string | 否 | 否 | 来源档案类型3的主键 |
| field4 | string | 否 | 否 | 来源档案类型4的主键 |
| id | string | 否 | 否 | 基础档案对照子表主键（新增时，不填写该值） |
| _status | string | 否 | 否 | 基础档案对照子表操作类型（Insert、Update、Delete, 首字母大写） |
| srcDocOrg | string | 否 | 否 | 基础档案对照业务单元 |

## 3. 请求示例

Url: /yonbip/AMP/baseDocMapping/batchsave?access_token=访问令牌
Body: [{
	"id": "1819690017583792130",
	"code": "1001",
	"name": "基础档案对照名称",
	"name2": "",
	"name3": "",
	"name4": "",
	"name5": "",
	"name6": "",
	"targetOrg": "",
	"desDocType": "",
	"srcDocTypes": [
		{
			"srcDocType": ""
		}
	],
	"bodies": [
		{
			"desDocTypeId": [
				""
			],
			"field1": "",
			"field2": "",
			"field3": "",
			"field4": "",
			"id": "",
			"_status": "",
			"srcDocOrg": ""
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 主键 示例：2232889751285792772 |
| targetOrg | string | 否 | 目标组织主键 示例：666666 |
| targetOrg_name | string | 否 | 目标组织名称 示例：企业账号级 |
| code | string | 否 | 编码 示例：test0408 |
| name | object | 否 | 名称 |
| desDocType | string | 否 | 目标档案类型 示例：90010 |
| desDocType_name | string | 否 | 目标档案类型名称 示例：标准工序 |
| modifierId_name | string | 否 | 修改人姓名 示例：u8c_vip管理员 |
| modifyTime | string | 否 | 修改时间 示例：2025-04-25 15:08:20 |
| srcDocTypes | object | 是 | 来源档案类型 |
| bodies | object | 是 | 基础档案对照子表 |
| modifier | string | 否 | 修改人姓名 示例：u8c_vip管理员 |
| modifierId | string | 否 | 修改人主键 示例：1525641755939569667 |
| modifyDate | string | 否 | 修改日期 示例：2025-04-25 15:08:20 |
| pubts | string | 否 | 时间戳 示例：2025-04-25 15:08:20 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2232889751285792772",
		"targetOrg": "666666",
		"targetOrg_name": "企业账号级",
		"code": "test0408",
		"name": {
			"zh_CN": "test0408"
		},
		"desDocType": "90010",
		"desDocType_name": "标准工序",
		"modifierId_name": "u8c_vip管理员",
		"modifyTime": "2025-04-25 15:08:20",
		"srcDocTypes": [
			{
				"srcDocType_domain": "fiepub",
				"srcDocType": "99",
				"srcDocType_fullname": "epub.accountbook.AccountBook",
				"srcDocType_name": "账簿",
				"sortNum": 1,
				"srcDocType_refCode": "fiepub.fiepub_accountbook_all_ref",
				"id": "2252959274466541574",
				"baseDocMapping": "2232889751285792772",
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000"
			}
		],
		"bodies": [
			{
				"srcDocOrg": "666666",
				"desDocTypeId_code": "LZC001",
				"desDocTypeId": "1576691574005301254",
				"srcDocOrg_code": "global00",
				"desDocTypeId_name": "LZC001",
				"sortNum": 1,
				"srcDocOrg_name": "企业账号级",
				"id": "2232920932820189193",
				"baseDocMapping": "2232889751285792772",
				"field2": "GL",
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000"
			}
		],
		"modifier": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyDate": "2025-04-25 15:08:20",
		"pubts": "2025-04-25 15:08:20"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

code=0，success=false	表示新增报错	查看message信息


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


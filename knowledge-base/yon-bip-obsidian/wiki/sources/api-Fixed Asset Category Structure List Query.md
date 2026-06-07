---
title: "固定资产类别结构列表查询"
apiId: "2378232260723212292"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Category Structure"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Category Structure]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产类别结构列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Category Structure (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/FixedAssetCategoryStructure/list

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
| pageSize | number |
| 小数位数:0,最大长度:11 | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| pageIndex | number |
| 小数位数:0,最大长度:11 | 否 | 是 | 当前页码 示例：1 默认值：1 |
| accentity | string | 否 | 否 | 所属组织ID 示例：1746851168803356676 |
| name | string | 否 | 否 | 类别结构名称 示例：11 |

## 3. 请求示例

Url: /yonbip/FCC/FixedAssetCategoryStructure/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"accentity": "1746851168803356676",
	"name": "11"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产使用状态信息 |
| pageIndex | number |
| 小数位数:0,最大长度:11 | 否 | 当前页码 示例：1 |
| recordCount | number |
| 小数位数:0,最大长度:11 | 否 | 总记录数 示例：100 |
| pageSize | number |
| 小数位数:0,最大长度:11 | 否 | 每页查询数据大小，限制500 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"recordCount": 100,
		"pageSize": 1,
		"recordList": [
			{
				"id": "1629396775637352454",
				"code": "5556",
				"accentity_name": "企业账号级",
				"accentity": "1572524545313079302",
				"creator_userName": "昵称-梦梦",
				"createTime": "2023-01-05 10:44:20",
				"autoCode": true,
				"pubts": "2022-10-24 17:59:46",
				"modifyTime": "2025-12-02 20:28:16",
				"modifier_userName": "昵称-梦梦",
				"name": "测试",
				"description": "",
				"structLevel": 1,
				"controlStrategy": "",
				"controLevel": "",
				"dr": 0,
				"codingRule": "",
				"parent_name": "企业手动父",
				"parent": "1746851168803356676"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token	token过期或者无效，使用有效的token


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


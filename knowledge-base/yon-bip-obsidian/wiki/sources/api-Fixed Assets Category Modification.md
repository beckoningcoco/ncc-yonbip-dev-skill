---
title: "固定资产类别修改"
apiId: "1956984677329272832"
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

# 固定资产类别修改

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Category Structure (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetsCategoryVO/update

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
| data | object | 否 | 是 | 固定资产类别信息 |
| id | string | 否 | 是 | 主键, 用来作为更新标识 示例：123456 |
| code | string | 否 | 是 | 分类编码 示例：01 |
| name | object | 否 | 是 | 名称 |
| cateStructId | string | 否 | 是 | 固定资产类别结构ID，不支持修改 示例：12345 |
| unitId | string | 否 | 否 | 计量单位ID 示例：1656411080548679685 |
| unitCode | string | 否 | 否 | 计量单位编码 示例：123 |
| description | object | 否 | 否 | 描述 |
| enable | string | 否 | 是 | 启用状态 1-启用，0-不启用 示例：1 |
| blnInventory | string | 否 | 是 | 是否盘点，true-是，false-否 示例：true |
| blnLease | string | 否 | 是 | 是否使用权资产类别 true-是，false-否 示例：false |
| level | string | 否 | 是 | 层级 示例：1 |
| scrapValueType | string | 否 | 是 | 残值类型, 0-残值率,1-残值金额 示例：0 |
| lifeYear | string | 否 | 是 | 使用年 示例：1 |
| lifeMonth | string | 否 | 是 | 使用月 示例：1 |
| scrapValueAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 残值金额，残值类型为1时必填 示例：100 |
| scrapValueRate | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 残值率%，残值类型为0时必填 示例：5 |
| useScrapValueType | string | 否 | 否 | 使用权残值类型, 购买并启用使用权资产时可用,blnlease为true时必填 示例：0 |
| useScrapValueAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 使用权残值金额, 购买并启用使用权资产时可用，使用权残值类型为1时必填 示例：100 |
| useScrapValueRate | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 使用权残值率, 使用权残值类型为0时必填 示例：5 |
| fromApi | string | 否 | 是 | 固定值 示例：true 默认值：true |
| _status | string | 否 | 是 | 固定值 示例：Update 默认值：Update |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetsCategoryVO/update?access_token=访问令牌
Body: {
	"data": {
		"id": "123456",
		"code": "01",
		"name": {
			"zh_CN": "名称"
		},
		"cateStructId": "12345",
		"unitId": "1656411080548679685",
		"unitCode": "123",
		"description": {
			"zh_CN": "描述"
		},
		"enable": "1",
		"blnInventory": "true",
		"blnLease": "false",
		"level": "1",
		"scrapValueType": "0",
		"lifeYear": "1",
		"lifeMonth": "1",
		"scrapValueAmount": 100,
		"scrapValueRate": 5,
		"useScrapValueType": "0",
		"useScrapValueAmount": 100,
		"useScrapValueRate": 5,
		"fromApi": "true",
		"_status": "Update"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 成功信息 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | id 示例：1817306869059813382 |
| accentity | string | 否 | 会计主体 示例：1779529994588389386 |
| cateStructId | string | 否 | 类别结构id 示例：1625145513945858050 |
| code | string | 否 | 编码 示例：880106 |
| name | object | 否 | 名称 |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 层级 示例：1 |
| isEnd | number |
| 小数位数:0,最大长度:10 | 否 | 是否末级 示例：1 |
| categoryFullName | string | 否 | 类别全称 示例：客车 |
| parent | string | 否 | 上级id 示例：1231 |
| unitId | string | 否 | 计量单位 示例：12312 |
| description | object | 否 | 描述 |
| enable | string | 否 | 启用状态 示例：1 |
| blnInventory | boolean | 否 | 是否盘点 示例：true |
| blnLease | boolean | 否 | 是否使用权类别 示例：false |
| lifeMonth | number |
| 小数位数:0,最大长度:10 | 否 | 使用月 示例：1 |
| lifeYear | number |
| 小数位数:0,最大长度:10 | 否 | 使用年 示例：5 |
| scrapValueType | string | 否 | 残值类型 示例：0 |
| scrapValueRate | number |
| 小数位数:0,最大长度:10 | 否 | 残值率 示例：5 |
| scrapValueAmount | object | 否 | 残值金额 |
| creator | string | 否 | 创建人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| useScrapValueType | string | 否 | 使用权残值类型 示例：1 |
| useScrapValueAmount | number |
| 小数位数:8,最大长度:48 | 否 | 使用权残值金额 示例：11 |
| useScrapValueRate | number |
| 小数位数:8,最大长度:48 | 否 | 使用权残值率 示例：1 |
| createTime | string | 否 | 创建时间 示例：2023-09-15 15:19:25 |
| creator_userName | string | 否 | 创建人 示例：默认用户 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1817306869059813382",
		"accentity": "1779529994588389386",
		"cateStructId": "1625145513945858050",
		"code": "880106",
		"name": {
			"zh_CN": "客车"
		},
		"level": 1,
		"isEnd": 1,
		"categoryFullName": "客车",
		"parent": "1231",
		"unitId": "12312",
		"description": {
			"zh_CN": "描述"
		},
		"enable": "1",
		"blnInventory": true,
		"blnLease": false,
		"lifeMonth": 1,
		"lifeYear": 5,
		"scrapValueType": "0",
		"scrapValueRate": 5,
		"scrapValueAmount": {},
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"useScrapValueType": "1",
		"useScrapValueAmount": 11,
		"useScrapValueRate": 1,
		"createTime": "2023-09-15 15:19:25",
		"creator_userName": "默认用户"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-28

删除

请求参数 (6)

新增

返回参数 (27)

更新

返回参数 code

更新

返回参数 message

更新

返回参数 data

删除

返回参数 (31)

更新

错误码 999

固定资产类别补充增加请求来源入参


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


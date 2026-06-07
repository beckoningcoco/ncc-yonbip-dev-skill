---
title: "凭证类型批量同步"
apiId: "2315388651423924227"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher Type"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证类型批量同步

> `ContentType	application/json` 请求方式	POST | 分类: Voucher Type (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/vouchertype/bill/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 否 | 单据编码 示例：epub_vouchertype 默认值：epub_vouchertype |
| data | object | 是 | 否 | 请求数据 |
| accentity | string | 否 | 否 | 会计主体id 示例：1526180336229679105 |
| sort | string | 否 | 否 | 排序 示例：1 |
| accentity_code | string | 否 | 否 | 会计主体编码 示例：pkm00 |
| code | string | 否 | 否 | 编码 示例：PZLX |
| name | object | 否 | 否 | 名称 |
| voucherstr | object | 否 | 否 | 凭证字 |
| controltype | string | 否 | 否 | 控制类型 示例：2 |
| cashcategory | string | 否 | 否 | 限制科目 示例：Bank,Cash |
| description | object | 否 | 否 | 描述 |
| stopstatus | string | 否 | 否 | 启用状态 示例：false 默认值：false |
| _status | string | 否 | 否 | 操作状态 示例：Insert |
| objid | string | 否 | 否 | 来源系统的唯一主键值 默认值：1111 |
| key | string | 否 | 否 | 来源系统的唯一主键字段名称 示例：objid 默认值：objid |

## 3. 请求示例

Url: /yonbip/FCC/vouchertype/bill/save?access_token=访问令牌
Body: {
	"billnum": "epub_vouchertype",
	"data": [
		{
			"accentity": "1526180336229679105",
			"sort": "1",
			"accentity_code": "pkm00",
			"code": "PZLX",
			"name": {
				"zh_CN": "凭证类型01",
				"en_US": "",
				"zh_TW": ""
			},
			"voucherstr": {
				"zh_CN": "1",
				"en_US": "",
				"zh_TW": ""
			},
			"controltype": "2",
			"cashcategory": "Bank,Cash",
			"description": {
				"zh_CN": "描述",
				"en_US": "",
				"zh_TW": ""
			},
			"stopstatus": "false",
			"_status": "Insert",
			"objid": ""
		}
	],
	"key": "objid"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 提示信息集合 |
| infos | object | 是 | 同步成功数据 |
| failInfos | string | 是 | 失败提示信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"accentity": "1526180336229679105",
				"sort": 1,
				"accentity_code": "pkm00",
				"code": "PZLX",
				"name": {
					"zh_CN": "凭证类型01",
					"en_US": "",
					"zh_TW": ""
				},
				"voucherstr": {
					"zh_CN": "1",
					"en_US": "",
					"zh_TW": ""
				},
				"controltype": "2",
				"cashcategory": "Bank,Cash",
				"description": {
					"zh_CN": "描述",
					"en_US": "",
					"zh_TW": ""
				},
				"stopstatus": false,
				"id": "2315383463101333508",
				"objid": "1111"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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


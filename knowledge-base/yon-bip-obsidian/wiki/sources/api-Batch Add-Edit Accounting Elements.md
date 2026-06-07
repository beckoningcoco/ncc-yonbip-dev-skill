---
title: "会计要素批量新增/编辑"
apiId: "1767655071440437255"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Element Table"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Element Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计要素批量新增/编辑

> `ContentType	application/json` 请求方式	POST | 分类: Accounting Element Table (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/accproperty/batchSave

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
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 新增时不填，编辑时必填 |
| code | string | 否 | 是 | 会计要素编码 示例：12321 |
| name | string | 否 | 是 | 会计要素中文名 示例：中文名称 |
| name2 | string | 否 | 否 | 会计要素英文名 |
| name3 | string | 否 | 否 | 会计要素繁体 |
| direction | string | 否 | 是 | 余额方向(借:Debit;贷:Credit) 示例：Credit |
| accpropertyattribute | string | 否 | 是 | 会计要素属性(0:普通;1:损益) 示例：0 |
| balanceformulaposition | string | 否 | 是 | 平衡公式位置(0:左;1:右) 示例：0 |
| accelement | string | 否 | 是 | 会计要素表(支持会计要素表id,会计要素表编码或者会计要素表名称) 示例：333 |

## 3. 请求示例

Url: /yonbip/AMP/accproperty/batchSave?access_token=访问令牌
Body: [{
	"id": "",
	"code": "12321",
	"name": "中文名称",
	"name2": "",
	"name3": "",
	"direction": "Credit",
	"accpropertyattribute": "0",
	"balanceformulaposition": "0",
	"accelement": "333"
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
| code | string | 否 | 返回状态编码 示例：200 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| count | int | 否 | 该次同步数量 示例：100 |
| sucessCount | int | 否 | 该次同步成功数量 示例：90 |
| failCount | int | 否 | 该次同步失败数量 示例：10 |
| messages | object | 是 | 同步失败数据信息 |
| infos | object | 是 | 同步成功数据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"count": 100,
		"sucessCount": 90,
		"failCount": 10,
		"messages": [
			{
				"key": "1",
				"message": "未查询到会计要素表信息!"
			}
		],
		"infos": [
			{
				"data": {
					"code": "111",
					"name": "111",
					"direction": "Debit",
					"accpropertyattribute": "0",
					"balanceformulaposition": "0",
					"accelement": "11",
					"objid": 1,
					"id": "111"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-28

更新

请求说明

修改透传


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


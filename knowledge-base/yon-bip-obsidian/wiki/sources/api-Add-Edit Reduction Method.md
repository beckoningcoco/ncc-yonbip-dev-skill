---
title: "减少方式查询"
apiId: "1976277558737502210"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Decrease Method"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Decrease Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 减少方式查询

> `ContentType	application/json` 请求方式	POST | 分类: Decrease Method (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bdreduceway/query

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
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| ids | string | 是 | 否 | 减少方式主键id集合（long类型字符串，长度不超19位） 示例：["1981919015466958851"] |
| objids | string | 是 | 否 | 外部同步数据id集合（长度不超36位） 示例：["1981919015466958852"] |
| codes | string | 是 | 否 | 减少方式编码集合 示例：["15"] |
| names | string | 是 | 否 | 减少方式名称集合 示例：["调出"] |
| enable | number |
| 小数位数:0,最大长度:6 | 否 | 否 | 减少方式状态：0，停用；1，启用 示例：1 |
| presetdate | boolean | 否 | 否 | 是否系统预制数据 示例：false |

## 3. 请求示例

Url: /yonbip/AMP/bdreduceway/query?access_token=访问令牌
Body: {
	"ids": [
		"1981919015466958851"
	],
	"objids": [
		"1981919015466958852"
	],
	"codes": [
		"15"
	],
	"names": [
		"调出"
	],
	"enable": 1,
	"presetdate": false
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
| data | object | 是 | 返回数据结果集合 |
| id | string | 否 | 减少方式主键id 示例：1981919015466958851 |
| code | string | 否 | 减少方式编码 示例：15 |
| name | object | 否 | 减少方式名称（多语对象） |
| presetdate | boolean | 否 | 是否系统预制数据 示例：false |
| enable | number |
| 小数位数:0,最大长度:6 | 否 | 停启用状态（0，停用；1，启用） 示例：1 |
| pubts | string | 否 | 时间戳(格式：yyyy-MM-dd HH:mm:ss) 示例：2024-05-25 10:30:00 |
| remark | object | 否 | 备注（多语对象） |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "1981919015466958851",
			"code": "15",
			"name": {
				"zh_CN": "测试减少方式"
			},
			"presetdate": false,
			"enable": 1,
			"pubts": "2024-05-25 10:30:00",
			"remark": {
				"zh_CN": "测试备注内容"
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


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


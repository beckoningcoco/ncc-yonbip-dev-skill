---
title: "找平规则设置删除"
apiId: "2393410374483312648"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Balancing Transition Account Settings"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Balancing Transition Account Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 找平规则设置删除

> `ContentType	application/json` 请求方式	POST | 分类: Balancing Transition Account Settings (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/component/bill/batchdelete

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
| billnum | string | 否 | 否 | 单据编码 示例：epub_component 默认值：fiepub_balancerule |
| data | object | 是 | 否 | 数据 |
| id | string | 否 | 否 | ID 示例：213456745 |
| accpurpose | string | 否 | 否 | 核算目的 示例：01 |
| accsubjectchart | string | 否 | 否 | 科目表 示例：1535139320189419523 |
| accountBookName | string | 否 | 否 | 账簿名称 示例：R02账簿 |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/component/bill/batchdelete?access_token=访问令牌
Body: {
	"billnum": "epub_component",
	"data": [
		{
			"id": "213456745",
			"accpurpose": "01",
			"accsubjectchart": "1535139320189419523",
			"accountBookName": "R02账簿"
		}
	]
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
| code | number |
| 小数位数:1,最大长度:10 | 否 | 返回码 示例：200 |
| message | string | 否 | 返回内容 示例：操作成功 |
| data | object | 否 | 数据 |
| count | string | 否 | count 示例：1 |
| sucessCount | string | 否 | sucessCount 示例：1 |
| failCount | string | 否 | failCount 示例：0 |
| messages | object | 是 | messages |
| infos | object | 是 | infos |
| failInfos | object | 是 | failInfos |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": "1",
		"sucessCount": "1",
		"failCount": "0",
		"messages": [
			{}
		],
		"infos": [
			{}
		],
		"failInfos": [
			{}
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


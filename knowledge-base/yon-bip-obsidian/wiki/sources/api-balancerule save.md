---
title: "找平规则设置保存"
apiId: "2393402205455515657"
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

# 找平规则设置保存

> `ContentType	application/json` 请求方式	POST | 分类: Balancing Transition Account Settings (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/component/bill/save

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
| billnum | string | 否 | 否 | 单据编码 示例：fiepub_balancerule |
| data | object | 否 | 否 | 数据 |
| accsubjectchart_name | string | 否 | 否 | 科目表名称 示例：1525643774565286108 |
| code | string | 否 | 否 | 编码 示例：005 |
| id | string | 否 | 否 | ID |
| accpurpose | string | 否 | 否 | 核算目的 |
| accsubject | string | 否 | 否 | 科目 示例：6 |
| accsubjectchart | string | 否 | 否 | 科目表 示例：采购成本 |
| levingdimension_name | string | 否 | 否 | 找平维度 示例：0 |
| accsubject_name | string | 否 | 否 | 科目名称 示例：2 |
| stopstatus | boolean | 否 | 否 | 停用状态 示例：false |
| createTime | string | 否 | 否 | 创建时间 示例：2025-05-29 17:37:22 |
| creatorId_name | string | 否 | 否 | 创建人姓名 |
| levingAccountBookInfo | object | 是 | 否 | 账簿信息 |
| levingRuleSettingB | object | 是 | 否 | 找平规则设置子表 |
| _status | string | 否 | 否 | _status 示例：Insert |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/component/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_balancerule",
	"data": {
		"accsubjectchart_name": "1525643774565286108",
		"code": "005",
		"id": "",
		"accpurpose": "",
		"accsubject": "6",
		"accsubjectchart": "采购成本",
		"levingdimension_name": "0",
		"accsubject_name": "2",
		"stopstatus": false,
		"createTime": "2025-05-29 17:37:22",
		"creatorId_name": "",
		"levingAccountBookInfo": [
			{
				"accountbook": "",
				"accountBookName": "",
				"id": "",
				"levingrule": "",
				"_status": "Insert"
			}
		],
		"levingRuleSettingB": [
			{
				"accsubjectcode": "",
				"accsubject": "",
				"accsubject_name": "",
				"id": "",
				"accsubjectStartCode": "",
				"accsubjectStartEnd": "",
				"mainid": "",
				"_id": "",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
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
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| accsubjectchart_name | string | 否 | 科目表名称 |
| code | string | 否 | 编码 |
| id | string | 否 | ID |
| accsubject | string | 否 | 科目 |
| accsubjectchart | string | 否 | 科目表 |
| accsubject_name | string | 否 | 科目名称 |
| stopstatus | boolean | 否 | 停用状态 |
| creatorId_name | string | 否 | 创建人姓名 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 |
| levingAccountBookInfo | object | 否 | 账簿信息 |
| levingRuleSettingB | object | 否 | 找平规则设置子表 |
| creatorId | string | 否 | 创建人 |
| pubts | string | 否 | pubts |
| traceId | string | 否 | 跟踪号 |
| uploadable | string | 否 | uploadable |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accsubjectchart_name": "",
		"code": "",
		"id": "",
		"accsubject": "",
		"accsubjectchart": "",
		"accsubject_name": "",
		"stopstatus": true,
		"creatorId_name": "",
		"createTime": "2026-06-07 12:12:20",
		"levingAccountBookInfo": {
			"accountbook": "",
			"accountBookName": "",
			"id": "",
			"levingrule": "",
			"tenant": 0,
			"ytenant": "",
			"pubts": ""
		},
		"levingRuleSettingB": {
			"accsubjectcode": "",
			"accsubject": "",
			"accsubject_name": "",
			"id": "",
			"accsubjectStartCode": "",
			"accsubjectStartEnd": "",
			"mainid": "",
			"tenant": 0,
			"ytenant": "",
			"pubts": ""
		},
		"creatorId": "",
		"pubts": ""
	},
	"traceId": "",
	"uploadable": ""
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


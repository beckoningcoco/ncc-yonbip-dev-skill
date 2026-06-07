---
title: "科目批量新增/编辑"
apiId: "1767585003343970306"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目批量新增/编辑

> `ContentType	application/json` 请求方式	POST | 分类: Accounts (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/accsubject/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| upvo | object | 否 | 否 | 上级节点 |
| id | string | 否 | 否 | 上级节点主键 |
| newvo | object | 否 | 是 | 新增科目节点 |
| id | string | 否 | 否 | 科目id（新增时不传，编辑时必传） 示例：E59AB3C3-8358-4B40-8018-C6DC62DF5F39 |
| code | string | 否 | 是 | 科目编码 示例：111 |
| name | string | 否 | 是 | 科目名称中文 示例：1111 |
| name2 | string | 否 | 否 | 科目名称英文 |
| name3 | string | 否 | 否 | 科目名称繁体 |
| direction | string | 否 | 是 | 余额方向（借:Debit;贷:Credit） 示例：Credit |
| deficitcheckstrategy | string | 否 | 是 | 余额赤字检查（不检查:NoCheck;警告:Warning;错误:Error） 示例：NoCheck |
| cashCategory | string | 否 | 是 | 现金分类（现金:Cash;银行:Bank;现金等价物:CashEquivalent;其他:Other） 示例：Cash |
| numcheck | boolean | 否 | 否 | 数量核算 示例：true |
| measuredoc | object | 否 | 否 | 默认计量单位 |
| currency | object | 否 | 否 | 币种 |
| accproperty | object | 否 | 是 | 会计要素 |
| vr23 | boolean | 否 | 否 | 辅助核算编码（vr1...vr100） 示例：true |
| proplist | object | 是 | 否 | 辅助核算控制 |
| accsubjectchart | string | 否 | 是 | 科目表主键 示例：03087A28-D983-43D3-8779-7449AA87C3FA |
| settlementmode | boolean | 否 | 否 | 结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true |
| billtime | boolean | 否 | 否 | 银行对账时间结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true |
| billno | boolean | 否 | 否 | 银行对账码结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true |
| bankverifycode | boolean | 否 | 否 | 银行对账结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true |
| mnemoniccode | string | 否 | 否 | 助记码 示例：KCXJ |

## 3. 请求示例

Url: /yonbip/AMP/accsubject/batchSave?access_token=访问令牌
Body: [{
	"upvo": {
		"id": ""
	},
	"newvo": {
		"id": "E59AB3C3-8358-4B40-8018-C6DC62DF5F39",
		"code": "111",
		"name": "1111",
		"name2": "",
		"name3": "",
		"direction": "Credit",
		"deficitcheckstrategy": "NoCheck",
		"cashCategory": "Cash",
		"numcheck": true,
		"measuredoc": {
			"id": "1914762922856704",
			"code": "111"
		},
		"currency": {
			"id": "1887942111187462",
			"code": "BMD"
		},
		"accproperty": {
			"id": "1a46d69f-bab3-11ea-b73a-060cee0005d2",
			"code": "05"
		},
		"vr23": true,
		"proplist": [
			{
				"vrs": "vr1",
				"propkey": "allowempty",
				"propvalue": "1"
			}
		],
		"accsubjectchart": "03087A28-D983-43D3-8779-7449AA87C3FA",
		"settlementmode": true,
		"billtime": true,
		"billno": true,
		"bankverifycode": true,
		"mnemoniccode": "KCXJ"
	}
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
				"message": "未查询到科目表"
			}
		],
		"infos": [
			{
				"data": {
					"code": "111",
					"name": "111",
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

999	报错具体提示信息，例如：服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-03

更新

请求说明

新增

请求参数 mnemoniccode

2	2025-06-26

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


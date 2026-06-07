---
title: "第三方虚拟账户批量更新"
apiId: "2048168035598991368"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Third-Party Virtual Account"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Third-Party Virtual Account]
platform_version: "BIP"
source_type: community-api-docs
---

# 第三方虚拟账户批量更新

> `ContentType	application/json` 请求方式	POST | 分类: Third-Party Virtual Account (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tmsp/virtualaccount/updateaccount

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
| serialId | string | 否 | 是 | 流水号(唯一) 示例：12345 |
| code | string | 否 | 是 | 原账户编码 示例：test001 |
| newCode | string | 否 | 否 | 更新后的账户编码 示例：test002 |
| settleName | string | 否 | 否 | 结算方式名称（废弃） 示例：微信扫码 |
| createAccDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 开户日期 示例：2024-07-24 |
| defaultAccount | string | 否 | 否 | 默认账户(true默认账户false非默认账户) 示例：true |
| remark | string | 否 | 否 | 备注 示例：备注 |
| enable | string | 否 | 否 | 状态 示例：1启用0停用 |

## 3. 请求示例

Url: /yonbip/ctm/tmsp/virtualaccount/updateaccount?access_token=访问令牌
Body: [{
	"serialId": "12345",
	"code": "test001",
	"newCode": "test002",
	"settleName": "微信扫码",
	"createAccDate": "2024-07-24",
	"defaultAccount": "true",
	"remark": "备注",
	"enable": "1启用0停用"
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
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| failRecord | object | 否 | 失败数据信息 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | 总条量 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 |
| failMessage | object | 否 | 失败信息 |
| successRecord | object | 否 | 成功数据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"failCount": 0,
		"failRecord": {},
		"totalCount": 0,
		"successCount": 0,
		"failMessage": {
			"accentity": "12333",
			"code": "test001",
			"settleMethod": "1233",
			"defaultAccount": "true",
			"enable": "1"
		},
		"successRecord": {
			"accentity": "1233",
			"code": "test001",
			"accountName": "测试账户",
			"currency": "1234",
			"settleMethod": "1235",
			"defaultAccount": true,
			"enable": "1启用0停用",
			"serialId": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

更新

请求参数 settleName

更新

请求参数 defaultAccount

更新

请求参数 character_define

更新

返回参数 accentity

更新

返回参数 accentity


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


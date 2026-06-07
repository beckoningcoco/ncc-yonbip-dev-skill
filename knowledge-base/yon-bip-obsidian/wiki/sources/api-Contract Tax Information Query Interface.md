---
title: "合同涉税信息-查询接口"
apiId: "2246135756919144448"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同涉税信息-查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/selectContract

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
| orgCode | string | 否 | 是 | 组织编码 示例：CODE001 |
| code | string | 否 | 否 | 合同编号 示例：CONTRACT001 |
| contractDetailId | string | 否 | 否 | 合同明细 id 示例：1535351553587 |
| createTimeStart | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 合同创建时间起 示例：2025-04-15 09:16:38 |
| createTimeEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 合同创建时间止 示例：2025-04-15 09:16:38 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/selectContract?access_token=访问令牌
Body: {
	"orgCode": "CODE001",
	"code": "CONTRACT001",
	"contractDetailId": "1535351553587",
	"createTimeStart": "2025-04-15 09:16:38",
	"createTimeEnd": "2025-04-15 09:16:38"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 合同编号 示例：code001 |
| sisNonTaxContract | string | 否 | 是否不征税合同(Y:是,N:否) 示例：Y |
| isContainsTax | string | 否 | 是否含税金额计税(Y:是,N:否) 示例：Y |
| stampTaxItem | string | 否 | 印花税税目 示例：123 |
| subItem | string | 否 | 印花税子目 示例：456 |
| contractBList | object | 否 | 明细数据 |
| id | string | 否 | 明细 id 示例：155315556878 |
| billNo | string | 否 | 单据编号 示例：001 |
| busiAmount | number |
| 小数位数:2,最大长度:15 | 否 | 发生金额(含税) 示例：115.02 |
| busiExcTaxAmount | number |
| 小数位数:2,最大长度:15 | 否 | 发生金额(不含税) 示例：5155.02 |
| stampStatus | string | 否 | 印花税申报状态（0-初始化，1-被引用，2-已申报） 示例：1 |
| stampPayableTax | number |
| 小数位数:2,最大长度:15 | 否 | 印花税应纳税额 示例：115.02 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "code001",
		"sisNonTaxContract": "Y",
		"isContainsTax": "Y",
		"stampTaxItem": "123",
		"subItem": "456",
		"contractBList": {
			"id": "155315556878",
			"billNo": "001",
			"busiAmount": 115.02,
			"busiExcTaxAmount": 5155.02,
			"stampStatus": "1",
			"stampPayableTax": 115.02
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	未知错误	系统异常信息

1001	参数为空	参数为空或者单次查询大于1000条合同


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明

新增

返回参数 sisNonTaxContract

更新

返回参数 stampTaxItem

更新

返回参数 subItem

更新

返回参数 contractBList

无改变


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


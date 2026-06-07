---
title: "会计主体变更接口"
apiId: "2011834940149727241"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计主体变更接口

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/bill/changeTaxBody

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
| changeTaxBodyParamList | object | 是 | 是 | 参数列表 |
| billType | string | 否 | 是 | 发票类型 示例：invoice |
| fpHm | string | 否 | 是 | 发票号码 示例：24112000000051106985 |
| fpDm | string | 否 | 否 | 发票代码 |
| newOrgCode | string | 否 | 是 | 目标会计主体编码 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill/changeTaxBody?access_token=访问令牌
Body: {
	"changeTaxBodyParamList": [
		{
			"billType": "invoice",
			"fpHm": "24112000000051106985",
			"fpDm": "",
			"newOrgCode": ""
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
| code | string | 否 | code 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| msg | string | 否 | msg 示例：操作完成！ |
| datas | string | 否 | datas 示例："" |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "0000",
		"msg": "操作完成！",
		"datas": "\"\""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	操作失败	操作失败


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


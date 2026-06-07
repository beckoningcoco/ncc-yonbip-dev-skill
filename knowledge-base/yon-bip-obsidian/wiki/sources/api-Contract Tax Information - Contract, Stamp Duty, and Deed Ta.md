---
title: "合同涉税信息-合同、印花税、契税税源联动删除"
apiId: "1757923113650618372"
apiPath: "请求方式	POST"
method: "3. 请求示例"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同涉税信息-合同、印花税、契税税源联动删除

> `3. 请求示例` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/delete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| deleteStamp | boolean | query | 否 | 是否删除印花税台账(true删除， false不删除，默认false) 示例: false 默认值: false    默认值: false |
| deleteDeedTax | boolean | query | 否 | 是否删除契税(true删除， false不删除，默认false) 示例: false 默认值: fals    默认值: false |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 是 | 是 | 请求方式直接为数组，请通过请求体body传入["合同编号1","合同编号2"]，勿传{"code":["123"]}！！ 示例：["123","456"] |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/delete?access_token=访问令牌&deleteStamp=&deleteDeedTax=
Body: [{
	"code": [
		"123",
		"456"
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：0000 |
| message | string | 否 | 消息 示例：删除成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "删除成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	系统异常报错


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明

更新

请求参数 deleteStamp

更新

请求参数 deleteDeedTax

更新

请求参数 code


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


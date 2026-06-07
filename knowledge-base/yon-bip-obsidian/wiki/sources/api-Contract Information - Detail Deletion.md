---
title: "合同涉税信息-明细删除"
apiId: "1758076169108324361"
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

# 合同涉税信息-明细删除

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/deleteitem

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条删除

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 否 | 是 | 合同编号 示例：aaaa |
| contractDetailId | string | 否 | 否 | 合同明细id（1、框架合同和非框架合同，均可以根据合同明细id删除合同明细。2、合同明细id和单据编码不能同时为空，不能同时送值 说明：仅框架合同，可以根据单据编号删除合同） 示例：321321321 |
| billNo | string | 否 | 否 | 单据编号（合同明细id和单据编码不能同时为空，不能同时送值 说明：仅框架合同，可以根据单据编号删除合同） 示例：bbbb |
| deleteStamp | boolean | 否 | 否 | 是否联动删除印花税(默认false) 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/deleteitem?access_token=访问令牌
Body: [{
	"code": "aaaa",
	"contractDetailId": "321321321",
	"billNo": "bbbb",
	"deleteStamp": false
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 响应信息 示例：删除合同的执行明细成功 |
| data | object | 否 | 响应数据 示例：["333","565"] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "删除合同的执行明细成功",
	"data": [
		"333",
		"565"
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1001	删除的合同执行明细为空，请进行检查或删除的合同执行明细超过了100，请减少通过的数量	数据量异常

9999	系统异常	系统异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明

无改变


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


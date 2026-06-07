---
title: "房地产涉税项目信息新增土地"
apiId: "1758145120499138564"
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

# 房地产涉税项目信息新增土地

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/land/payment/add

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
| tList | object | 是 | 否 | 地块信息 |
| landName | string | 否 | 是 | 地块名称 示例：1122 |
| landCode | string | 否 | 是 | 地块编码 示例：1122 |
| parcelNumber | string | 否 | 否 | 宗地编号 示例：1122 |
| realEstateNumber | string | 否 | 否 | 不动产权证号 示例：1122 |
| landArea | BigDecimal | 否 | 否 | 土地面积 示例：1122 |
| landAddress | string | 否 | 否 | 土地位置 示例：123122 |
| cancelMark | string | 否 | 否 | 作废标识（Y:是，N否） 示例：N |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/land/payment/add?access_token=访问令牌
Body: {
	"tList": [
		{
			"landName": "1122",
			"landCode": "1122",
			"parcelNumber": "1122",
			"realEstateNumber": "1122",
			"landArea": 1122,
			"landAddress": "123122",
			"cancelMark": "N"
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
| code | string | 否 | 编码 示例：200 |

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	根据message信息进行修改

1001	请设置Redis客户端编码	系统错误，redis配置错误


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


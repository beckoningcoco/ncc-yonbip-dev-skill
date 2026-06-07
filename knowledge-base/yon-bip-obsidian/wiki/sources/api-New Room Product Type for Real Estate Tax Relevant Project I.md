---
title: "房地产涉税项目信息新增房间产品类型"
apiId: "1758505700190322696"
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

# 房地产涉税项目信息新增房间产品类型

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/house/type/add

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
| productCode | string | 否 | 是 | 产品类型编码 示例：11222 |
| productName | string | 否 | 是 | 产品类型名称（当前级别） 示例：11222 |
| srcId | string | 否 | 是 | 来源id 示例：1122 |
| srcParentId | string | 否 | 否 | 来源父级id 示例：1122 |
| typeCode | string | 否 | 是 | 业态类型 示例：1122 |
| propertyAttributeCode | string | 否 | 是 | 产权属性编码 示例：123122 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/house/type/add?access_token=访问令牌
Body: [{
	"productCode": "11222",
	"productName": "11222",
	"srcId": "1122",
	"srcParentId": "1122",
	"typeCode": "1122",
	"propertyAttributeCode": "123122"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 响应信息 示例：操作成功 |
| code | string | 否 | 响应编码 示例：200 |

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	根据message信息修改

1001	请设置Redis客户端编码	redis配置错误


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


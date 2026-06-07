---
title: "开票信息删除"
apiId: "1601453048411979779"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票信息删除

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing Information (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/fiercl/rclinvoiceinfo/delete

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
| billnum | string | 否 | 是 | 开票信息列表编码 示例：rclInvoiceInfoList 默认值：rclInvoiceInfoList |
| data | object | 否 | 是 | 请求数据 |
| id | string | 否 | 是 | 开票信息Id 示例：1599905434269908993 |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/rclinvoiceinfo/delete?access_token=访问令牌
Body: {
	"billnum": "rclInvoiceInfoList",
	"data": {
		"id": "1599905434269908993"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 数据 |
| busiObj | string | 否 | 业务单元 示例：rclInvoiceInfo |
| id | string | 否 | 开票信息id 示例：1628035640397922307 |
| metaFullName | string | 否 | 元数据全名称 示例：RCL.RCL.RclInvoiceInfoHeader |
| _status | long | 否 | 状态(3--删除) 示例：3 |
| cBillNo | string | 否 | 页面编码 示例：rclInvoiceInfoList |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "rclInvoiceInfo",
		"id": "1628035640397922307",
		"metaFullName": "RCL.RCL.RclInvoiceInfoHeader",
		"_status": 3,
		"cBillNo": "rclInvoiceInfoList"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	未根据id查到开票信息，请检查！


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


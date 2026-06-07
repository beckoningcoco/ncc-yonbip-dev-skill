---
title: "根据银行流水号获取银行回单"
apiId: "bd14347517114a1c83510b0aa22798e3"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payment Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据银行流水号获取银行回单

> `ContentType	application/json` 请求方式	GET | 分类: Payment Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmpBankElectronPdf/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| bankseq | string | query | 否 | 流水号 |
| bankid | string | query | 否 | 银行id |

## 3. 请求示例

Url: /yonbip/fi/cmpBankElectronPdf/detail?access_token=访问令牌&bankseq=&bankid=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| receiptUrl | string | 否 | 回单文件url 示例：https://yonbip-pre.oss-cn-beijing.aliyuncs.com/czfw/yonbip-fi-ctmcmp/e218dd1a-3bf1-4f94-b124-a88bbf0e5aa5.pdf?Expires=1702881680&OSSAccessKeyId=LTAI5tCxDJSL8M4qA6TV8ytT&Signature=rHV%2Bk6XBla9z2%2F%2FA7BnIC%2FOo3Zw%3D |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"receiptUrl": "https://yonbip-pre.oss-cn-beijing.aliyuncs.com/czfw/yonbip-fi-ctmcmp/e218dd1a-3bf1-4f94-b124-a88bbf0e5aa5.pdf?Expires=1702881680&OSSAccessKeyId=LTAI5tCxDJSL8M4qA6TV8ytT&Signature=rHV%2Bk6XBla9z2%2F%2FA7BnIC%2FOo3Zw%3D"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	回单未返回	这里调用银企连接口48T23，请查看日志是否返回了正确数据


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


---
title: "凭证附件下载"
apiId: "2064526500904828929"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证附件下载

> `ContentType	application/json` 请求方式	POST | 分类: Voucher (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/rest/v1/openapi/queryBusinessFiles

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
| businessIds | string | 是 | 是 | 凭证id集合 示例：["2064621428254179336","2064621428254179332"] |

## 3. 请求示例

Url: /yonbip/EFI/rest/v1/openapi/queryBusinessFiles?access_token=访问令牌
Body: {
	"businessIds": [
		"2064621428254179336",
		"2064621428254179332"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 文件对象 示例：200为正常，其他为异常 |
| message | string | 否 | 错误提示 示例：服务异常消息 |
| data | object | 否 | data |
| 2064621428254179336 | object | 是 | 凭证id |

## 5. 正确返回示例

{
	"code": "200为正常，其他为异常",
	"message": "服务异常消息",
	"data": {
		"2064621428254179336": [
			{
				"fileId": "文件ID, 例如 : 66bb572e89f3285b7484ac35",
				"filePath": "https://iuap-file-test.oss-cn-beijing-internal.aliyuncs.com/iuap-apcom-file-private/iuap-apcom-file/c04cstr1/2024081320/cd12d22e-498f-4799-a9e6-cac9f2a88f60.png?Expires=1723557668&OSSAccessKeyId=LTAI5tByXGLgqo8mi4vNB75r&Signature=36IV%2F7H4Ep0AWt9gMXZzjYf",
				"ctime": 1723553582068,
				"utime": 1723553582068,
				"fileExtension": ".png",
				"fileSize": 385215,
				"fileName": "v2-c74db40f0fb5fd24c8d318ae05b6f386_1440w",
				"name": "v2-c74db40f0fb5fd24c8d318ae05b6f386_1440w.png",
				"yhtUserId": "3a71063c-8317-4e28-9e63-4ec5b7be7500",
				"tenantId": "xxxxxx",
				"objectId": "2064621428254179336",
				"objectName": "yonbip-fi-gl"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code	服务异常	服务异常


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


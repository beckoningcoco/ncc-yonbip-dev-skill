---
title: "电子档案任务列表接收"
apiId: "cf9348d3c04e421e9fe81ab3b517ba2b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子档案任务列表接收

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/elecarchive/billList

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
| type | string | 否 | 是 | 档案类型（即档案目录前缀）、或单据类型 示例：F0 |
| orgInfo | object | 否 | 是 | 组织信息 |
| pk | string | 否 | 否 | 单位pk，需要与业务系统一致，如果单位信息是通过接口同步的会有值，pk与code至少有一个 示例：11112 |
| code | string | 否 | 否 | 单位编码，需要与业务系统一致，pk与code至少有一个 示例：00001 |
| type | string | 否 | 否 | 单位类型，默认为book 示例：book |
| docPkList | string | 是 | 是 | 单据、或档案主键列表 示例：["121212134433321","122323343421123"] |
| callbackUrl | string | 否 | 否 | 档案回调地址，用于接口E提交数据 示例：http://10.166.40.102:8080//cloudrecord-imw/api/nc/v1/doc/push?corpId=1291 |
| showUpper | long | 否 | 否 | 是否抓取上游数据，0：不抓取 1：抓取 示例：1 |
| taskId | string | 否 | 否 | 任务id 示例：S2021month1-532500 |
| fileServer | object | 否 | 是 | 文件服务器信息 |
| bucketName | string | 否 | 是 | 桶名 示例：idoc |
| endpoint | string | 否 | 否 | 文件服务器地址 示例：http://172.20.47.202:9000 |
| secretKey | string | 否 | 否 | 密文key 示例：idocyonyoucloudcom |
| accessKey | string | 否 | 否 | 接入key 示例：idocyonyoucloudcom |
| serverType | string | 否 | 否 | 服务类型 示例：minio |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/elecarchive/billList?access_token=访问令牌
Body: {
	"type": "F0",
	"orgInfo": {
		"pk": "11112",
		"code": "00001",
		"type": "book"
	},
	"docPkList": [
		"121212134433321",
		"122323343421123"
	],
	"callbackUrl": "http://10.166.40.102:8080//cloudrecord-imw/api/nc/v1/doc/push?corpId=1291",
	"showUpper": 1,
	"taskId": "S2021month1-532500",
	"fileServer": {
		"bucketName": "idoc",
		"endpoint": "http://172.20.47.202:9000",
		"secretKey": "idocyonyoucloudcom",
		"accessKey": "idocyonyoucloudcom",
		"serverType": "minio"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 错误/成功信息 示例：success |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"displayCode": ""
}

## 6. 业务异常码

035-503-000089

请求体内容为空！


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "单据附件上传至OSS服务器"
apiId: "a1f9d3b0abcb4ccb8b2e5c3074f94005"
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

# 单据附件上传至OSS服务器

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/attach/upload

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billType | string | 否 | 是 | 单据类型（znbzbx_expensebill：通用报销单；znbzbx_travelexpbill ：差旅费报销单；znbzbx_loanbill：个人借款单；znbzbx_pubprepay：对公预付单；znbzbx_returnbill：还款单；znbzbx_refundbill：退款单；znbzbx_busistrip：出差申请单；znbzbx_memoapply ：通用申请单；znbzbx_manualwithholding；预提单；znbzbx_deferexpensedetail：摊销明细单） 示例：znbzbx_expensebill |
| fileName | string | 否 | 是 | 文件名称 示例：滴滴出行.pdf |
| file | string | 否 | 否 | 文件内容 示例：base64编码后的文件内容 |
| attachmentAss | string | 否 | 是 | 单据附件表ID（可理解为文件夹，可包含多个文件） 示例：与单据号对应，32位字符串，如：4853ca2e9f9c49d4aee8aa7c87f2632f |
| fileId | string | 否 | 否 | 文件id，来自协同文件上传接口返回的fileId字段 示例：66c48c3c0ee2b5075d7634e7 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/attach/upload?access_token=访问令牌
Body: {
	"billType": "znbzbx_expensebill",
	"fileName": "滴滴出行.pdf",
	"file": "base64编码后的文件内容",
	"attachmentAss": "与单据号对应，32位字符串，如：4853ca2e9f9c49d4aee8aa7c87f2632f",
	"fileId": "66c48c3c0ee2b5075d7634e7"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| msg | string | 否 | 文件上传返回信息 示例：上传成功 |
| fileName | string | 否 | 文件名 示例：滴滴电子发票A.pdf |
| code | string | 否 | 上传返回编码 示例：200 |
| success | boolean | 否 | 上传是否成功 示例：true |
| billType | string | 否 | 单据类型 示例：znbzbx_expensebill |
| fileKey | string | 否 | 文件路径 示例：2155538208313600/znbzbx_expensebill/039909d762604736afb92d7350819511/694e4ae50d.pdf |
| message | string | 否 | 上传返回信息 示例：操作成功 |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msg": "上传成功",
		"fileName": "滴滴电子发票A.pdf",
		"code": "200",
		"success": true,
		"billType": "znbzbx_expensebill",
		"fileKey": "2155538208313600/znbzbx_expensebill/039909d762604736afb92d7350819511/694e4ae50d.pdf",
		"message": "操作成功"
	},
	"displayCode": ""
}

## 6. 业务异常码

035-503-001019


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


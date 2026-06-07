---
title: "通过文件地址发起签署"
apiId: "1814415952349495304"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 通过文件地址发起签署

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/signFlow/createByDownloadFile

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| title | string | 否 | 是 | 合同标题 示例：合同1 |
| srcAppCode | string | 否 | 否 | 来源应用编码，默认yb 示例：yb |
| bizNo | string | 否 | 否 | 业务唯一编码 示例：123 |
| accountId | string | 否 | 否 | 发起人用户ID 示例：ed4a02a5-****-****-9854-eea0b9b11575 |
| uniqueId | string | 否 | 否 | 发起人用户 业务方唯一ID 示例：user1 |
| completeCallUrl | string | 否 | 否 | 签署状态变更回调地址 示例：https://temp.com/signChange |
| companyAppAuthId | string | 否 | 是 | 企业应用授权ID 示例：1800000000000004770 |
| tenantId | string | 否 | 否 | 发起租户ID 示例：qyxxxxxx |
| redirectUrl | string | 否 | 否 | 签署完成跳转地址 示例：https://temp.com/return |
| needPassword | boolean | 否 | 否 | 是否需要签署授权码 示例：false 默认值：false |
| passwordCheckUrl | string | 否 | 否 | 签署授权码校验地址 统一域名地址 示例：https://temp.com/check |
| signValidity | string | 否 | 否 | 签署有效期 格式：yyyy-MM-dd 示例：2024-02-01 00:00:00 |
| contracts | object | 是 | 否 | 合同文件 |
| title | string | 否 | 是 | 合同标题 示例：合同文件1 |
| fileKey | string | 否 | 是 | 合同文件唯一ID 示例：1806666666666664770 |
| docOrder | int | 否 | 否 | 合同文件顺序 示例：1 |
| docDownloadUrl | string | 否 | 是 | 合同文件下载地址 示例：https://temp.com/download/1806666666666664770 |
| docHash | string | 否 | 是 | 合同文件Hash值，用于合同文件校验 示例：c27a21fce52a84f7008eeb1f140e89bca165529c590b8838af1bad1388cd2b23 |
| annexesFiles | object | 是 | 否 | 合同附件 |
| fileName | string | 否 | 否 | 文件名称 示例：合同附件1 |
| fileKey | string | 否 | 是 | 合同文件唯一ID 示例：1806666666666664771 |
| docOrder | int | 否 | 否 | 合同文件顺序 示例：1 |
| docDownloadUrl | string | 否 | 是 | 合同文件下载地址 示例：https://temp.com/download/1806666666666664771 |
| docHash | string | 否 | 是 | 合同文件Hash值，用于合同文件校验 示例：c27a21fce52a84f7008eeb1f140e89bca165529c590b8838af1bad1388cd2b23 |
| contractSigners | object | 是 | 否 | 合同签署人 |
| accountId | string | 否 | 否 | 签署人用户ID，或者手机号必传 示例：ed4a02a5-****-****-9854-eea0b9b11575 |
| uniqueId | string | 否 | 否 | 签署用户 业务方唯一ID 示例：user1 |
| userName | string | 否 | 否 | 签署人姓名 示例：第五** |
| contactMobile | string | 否 | 否 | 签署用户手机号 示例：135******** |
| contactEmail | string | 否 | 否 | 签署用户邮箱 示例：123****@163.com |
| companyAppAuthId | string | 否 | 否 | 签署应用授权ID，或统一社会信用代码必传 示例：1800000000000004770 |
| companyUniqueId | string | 否 | 否 | 签署企业 业务方唯一ID 示例：company1 |
| companyIdNum | string | 否 | 否 | 企业统一社会信用代码 示例：91440300000008927P |
| companyName | string | 否 | 否 | 企业名称 示例：北京测试股份有限公司 |
| autoSign | boolean | 否 | 否 | 是否静默签 示例：false 默认值：false |
| legalSignFlag | int | 否 | 否 | 是否可以代法人签署；1：是，0：否；默认为0 示例：0 |
| signOrder | int | 否 | 否 | 签署顺序 示例：1 |
| onlyShowSignature | boolean | 否 | 否 | 是否只展示手写签名章,默认否false 示例：false 默认值：false |
| allowSignature | string | 否 | 否 | 签署页面上是否允许手写签名,默认否false 示例：false |
| contractPos | object | 是 | 否 | 合同签署位置 |
| copySendReceivers | object | 是 | 否 | 抄送人列表 |
| accountId | string | 否 | 否 | 抄送人用户ID 示例：ed4a02a5-****-****-9854-eea0b9b11575 |
| uniqueId | string | 否 | 否 | 抄送人 业务用户ID 示例：user1 |
| userMobile | string | 否 | 否 | 抄送人手机号 示例：135******** |
| userEmail | string | 否 | 否 | 抄送人邮箱 示例：123****@163.com |
| userName | string | 否 | 否 | 抄送人姓名 示例：第五** |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/signFlow/createByDownloadFile?access_token=访问令牌
Body: {
	"title": "合同1",
	"srcAppCode": "yb",
	"bizNo": "123",
	"accountId": "ed4a02a5-****-****-9854-eea0b9b11575",
	"uniqueId": "user1",
	"completeCallUrl": "https://temp.com/signChange",
	"companyAppAuthId": "1800000000000004770",
	"tenantId": "qyxxxxxx",
	"redirectUrl": "https://temp.com/return",
	"needPassword": false,
	"passwordCheckUrl": "https://temp.com/check",
	"signValidity": "2024-02-01 00:00:00",
	"contracts": [
		{
			"title": "合同文件1",
			"fileKey": "1806666666666664770",
			"docOrder": 1,
			"docDownloadUrl": "https://temp.com/download/1806666666666664770",
			"docHash": "c27a21fce52a84f7008eeb1f140e89bca165529c590b8838af1bad1388cd2b23"
		}
	],
	"annexesFiles": [
		{
			"fileName": "合同附件1",
			"fileKey": "1806666666666664771",
			"docOrder": 1,
			"docDownloadUrl": "https://temp.com/download/1806666666666664771",
			"docHash": "c27a21fce52a84f7008eeb1f140e89bca165529c590b8838af1bad1388cd2b23"
		}
	],
	"contractSigners": [
		{
			"accountId": "ed4a02a5-****-****-9854-eea0b9b11575",
			"uniqueId": "user1",
			"userName": "第五**",
			"contactMobile": "135********",
			"contactEmail": "123****@163.com",
			"companyAppAuthId": "1800000000000004770",
			"companyUniqueId": "company1",
			"companyIdNum": "91440300000008927P",
			"companyName": "北京测试股份有限公司",
			"autoSign": false,
			"legalSignFlag": 0,
			"signOrder": 1,
			"onlyShowSignature": false,
			"allowSignature": "false",
			"contractPos": [
				{
					"fileKey": "1806666666666664770",
					"signType": 2,
					"signIdentity": "PERSON",
					"sealId": "1801111111111114770",
					"keyWord": "经理",
					"pageRange": "1-2",
					"posX": 200,
					"posY": 400,
					"addSignTime": true,
					"edgeScope": 0
				}
			]
		}
	],
	"copySendReceivers": [
		{
			"accountId": "ed4a02a5-****-****-9854-eea0b9b11575",
			"uniqueId": "user1",
			"userMobile": "135********",
			"userEmail": "123****@163.com",
			"userName": "第五**"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| bizId | string | 否 | 业务系统关联的业务ID 示例：1234 |
| signFlowId | string | 否 | 签署流程ID 示例：1800000000000004770 |
| signInfo | object | 是 | 签署人信息 |
| signDocs | object | 是 | 签署文件信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"bizId": "1234",
		"signFlowId": "1800000000000004770",
		"signInfo": [
			{
				"signerId": "1801111111111114770",
				"accountId": "1802222222222224770",
				"uniqueId": "42341224234",
				"accountName": "第五**",
				"signUrl": "https://temp.com/sign"
			}
		],
		"signDocs": [
			{
				"docId": "1804444444444444770",
				"fileKey": "1804444444444444770"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	接口调用错误	接口调用错误


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


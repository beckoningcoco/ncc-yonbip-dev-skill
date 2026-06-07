---
title: "电子签hub创建签署流程"
apiId: "2275306401723056133"
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

# 电子签hub创建签署流程

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/signFlow/v1/create

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
| bizId | string | 否 | 否 | 业务系统方业务ID 示例：123123 |
| description | string | 否 | 否 | 此流程的流程描述 示例：测试流程 |
| expireTime | string | 否 | 否 | 签署流程过期时间，不填则不限制期限，精确到秒，例：2025-03-03 12:22:32 示例：2025-03-03 12:22:32 |
| initiate | string | 否 | 否 | 是否发起流程,默认true,也可通过发起流程接口单独发起 示例：true |
| createAccountId | string | 否 | 否 | 发起人电子签用户accountId, createAccountId和createUserUniqueId，当两者都有值时，以createAccountId为准 示例：8927c043be45ddba04a58ababe5989d5 |
| createUserUniqueId | string | 否 | 否 | 发起人电子签业务系统方关联的唯一用户标识 示例：123123 |
| redirectUrl | string | 否 | 否 | 使用电子签签署成功后重定向的网页 示例：http://test.com/redirctUrl/abc |
| completeCallUrl | string | 否 | 否 | 电子签签署回调， 详细说明见签署回调接口说明 示例：http://test.com/completeCallUrl/abc |
| signDocsInfo | object | 是 | 否 | 签署文档信息 |
| docFileKey | string | 否 | 是 | 文档fileKey，由合同上传接口返回 示例：5addd268901d112c1cc8a7e4b3c1ca5b |
| docName | string | 否 | 是 | 文档名称 示例：测试文件 |
| docOrder | string | 否 | 否 | 文档显示需要，从小到大排序 示例：1 |
| copySendReceivers | object | 是 | 否 | 抄送人列表 |
| accountId | string | 否 | 否 | 抄送人电子签用户accountId，如需抄送，accountId与uniqueId有一非空，都有值以accountId为准 示例：9e80bec5be0fa98534b51e46144d3142 |
| uniqueId | string | 否 | 否 | 抄送人电子签业务系统方关联的唯一用户ID 示例：123123 |
| signersInfo | object | 是 | 否 | 签署人信息 |
| accountId | string | 否 | 否 | 电子签用户accountId，与uniqueId有一非空，都有值以accountId为准 示例：9e80bec5be0fa98534b51e46144d3142 |
| uniqueId | string | 否 | 否 | 电子签用户业务系统方关联的唯一用户标识 示例：123123 |
| companyId | string | 否 | 否 | 用于过滤印章列表，有值则表示仅展示该企业下的印章。companyId和companyUniqueId两者都有值，则以companyId为准。如果都为空，则展示电子签用户accountId下的有权限印章 示例：a339c6c85bf0a9462b86c6fc1ab553e1 |
| companyUniqueId | string | 否 | 否 | 业务系统关联的唯一企业ID 示例：123123 |
| signerUniqueId | string | 否 | 是 | 业务系统关联的签署节点ID 示例：ABC23 |
| autoSign | string | 否 | 否 | 是否开启自动签署，开启后，自动签署规则的将自动签署，默认为false. 仅适用于企业内部用户模式。 示例：false |
| authType | string | 否 | 否 | 签署页面签署时，支持的意愿认证方式，可多选，多选通过“,”分割。1：短信，2：密码口令，3：人脸识别。 示例：1,2,3 |
| onlyShowSignature | string | 否 | 否 | 签署页面印章列表是否只展示手写签名章,默认否false 示例：false |
| allowSignature | string | 否 | 否 | 签署页面上是否允许手写签名（展示手写签名按钮）,默认true,允许手写签名 示例：true |
| signDocDetails | object | 是 | 否 | 文档签署详细信息 |
| createCompanyInfo | object | 否 | 否 | 发起流程企业信息 |
| companyName | string | 否 | 否 | 发起流程企业名称 示例：用友网络 |
| companyId | string | 否 | 否 | 发起流程企业三方电子签企业id 示例：5c943d7be73 |
| registerNo | string | 否 | 否 | 发起流程企业三方统一社会信用代码 示例：9111000060 |

## 3. 请求示例

Url: /yonbip/id/signFlow/v1/create?access_token=访问令牌
Body: {
	"bizId": "123123",
	"description": "测试流程",
	"expireTime": "2025-03-03 12:22:32",
	"initiate": "true",
	"createAccountId": "8927c043be45ddba04a58ababe5989d5",
	"createUserUniqueId": "123123",
	"redirectUrl": "http://test.com/redirctUrl/abc",
	"completeCallUrl": "http://test.com/completeCallUrl/abc",
	"signDocsInfo": [
		{
			"docFileKey": "5addd268901d112c1cc8a7e4b3c1ca5b",
			"docName": "测试文件",
			"docOrder": "1"
		}
	],
	"copySendReceivers": [
		{
			"accountId": "9e80bec5be0fa98534b51e46144d3142",
			"uniqueId": "123123"
		}
	],
	"signersInfo": [
		{
			"accountId": "9e80bec5be0fa98534b51e46144d3142",
			"uniqueId": "123123",
			"companyId": "a339c6c85bf0a9462b86c6fc1ab553e1",
			"companyUniqueId": "123123",
			"signerUniqueId": "ABC23",
			"autoSign": "false",
			"authType": "1,2,3",
			"onlyShowSignature": "false",
			"allowSignature": "true",
			"signDocDetails": [
				{
					"docFileKey": "5addd268901d112c1cc8a7e4b3c1ca5b",
					"sealActions": [
						{
							"uniqueId": "123123",
							"addSignTime": "false",
							"sealId": "411ff83fdf3507384438308a07ed8cca",
							"signType": "1",
							"findKey": "盖章处",
							"keyIndex": "-1",
							"positionMode": "1",
							"originPointType": "1",
							"offsetX": "500",
							"offsetY": "500",
							"ridingSealMaxCut": "20",
							"ridingSealPageMode": "1",
							"sealPage": "1-10",
							"positionX": "25000",
							"positionY": "25000",
							"signIdentity": "2,8",
							"sealTimeFormat": "yy-MM-dd",
							"sealTimeColor": "255,255,255"
						}
					]
				}
			]
		}
	],
	"createCompanyInfo": {
		"companyName": "用友网络",
		"companyId": "5c943d7be73",
		"registerNo": "9111000060"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| bizId | string | 否 | 合同业务ID,如果请求有传入，则回显 示例：12313 |
| signFlowId | string | 否 | 签署流程ID 示例：0fe8cbafd70a33d2552337ea82ea8c3e |
| signInfo | object | 是 | 签署流程中所有签署人信息 |
| signDocs | object | 是 | 签署文档信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"bizId": "12313",
		"signFlowId": "0fe8cbafd70a33d2552337ea82ea8c3e",
		"signInfo": [
			{
				"signerId": "SEISNSMDI",
				"signerUrl": "https://test.com/sign/123123",
				"signerUniqueId": "213123",
				"accountId": "9e80bec5be0fa98534b51e46144d3142",
				"uniqueId": "123123",
				"accountName": "张三",
				"companyId": "13d5045f07d950fb4ec98d7b81db8707",
				"companyUniqueId": "123123",
				"actions": [
					{
						"actionId": "asdasd",
						"uniqueId": "123123"
					}
				]
			}
		],
		"signDocs": [
			{
				"docId": "123123",
				"fileKey": "13d37e0404d65f01e30a41b6396c2d08",
				"oriDocKey": "5addd268901d112c1cc8a7e4b3c1ca5b"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

请求说明

新增

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


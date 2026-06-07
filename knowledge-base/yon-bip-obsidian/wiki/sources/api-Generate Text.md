---
title: "生成文本"
apiId: "2247588469489532932"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Template"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 生成文本

> `ContentType	application/json` 请求方式	POST | 分类: Contract Template (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/rest/contractPreview

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
| busDataQuery | object | 否 | 是 | 渲染单据数据信息 |
| dataType | string | 否 | 是 | 数据传输类型(rest rest方式取数 mddrpc rpc方式取数 settingData内置数据（即业务对象数据查询方式）) 示例：settingData 默认值：settingData |
| data | object | 否 | 是 | 单据数据 |
| templateCode | string | 否 | 否 | 合同模板编码(合同模板 ID 为空时必填) 示例：CSMB |
| templateId | string | 否 | 否 | 合同模板 ID(合同模板编码为空时必填) |
| templateVersionId | string | 否 | 否 | 合同模板版本 ID(不填时取最新版本) |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/contractPreview?access_token=访问令牌
Body: {
	"busDataQuery": {
		"dataType": "settingData",
		"data": {
			"id": "2117980383966920710"
		}
	},
	"templateCode": "CSMB",
	"templateId": "",
	"templateVersionId": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 |
| msg | string | 否 | 错误信息 |
| data | object | 否 | 返回数据 |
| sourceFileType | string | 否 | 源文件类型(0 PDF 1 WORD) |
| base64 | string | 否 | 渲染结果文件Base64 （强制PDF格式） |
| sourceBase64 | string | 否 | 渲染结果文件Base64(根据源文件类型不同而不同； 例如 源文件 为WORD，则该字段为WORD文件的Base64) |
| fileCreateType | string | 否 | 文件预览生成类型(采购合同预定义使用，用以标记生成合同文件时，是word还是pdf；如果word则可以继续调整；pdf则是直接定版 值范围： word pdf) |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"msg": "",
	"data": {
		"sourceFileType": "",
		"base64": "",
		"sourceBase64": "",
		"fileCreateType": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

600568	业务查询数据参数不能为空


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


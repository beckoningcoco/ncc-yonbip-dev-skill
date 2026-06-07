---
title: "销项查询并推送档案服务（电子会计档案）"
apiId: "92e508816c6c40af8eaaca1703393588"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outbound Enterprise Invoice Folder"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outbound Enterprise Invoice Folder]
platform_version: "BIP"
source_type: community-api-docs
---

# 销项查询并推送档案服务（电子会计档案）

> `ContentType	application/json` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/billpusher/query-billspush

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
| callbackUrl | string | 否 | 是 | 档案服务回调地址 示例：https://idoc.diwork.com//cloudrecord-imw/api/nc/v1/doc/push?corpId=1634 |
| docPkList | string | 是 | 是 | 票据查询条件列表 示例：["2444139785392640"] |
| fileServer | object | 否 | 是 | 档案文件服务器地址 |
| accessKey | string | 否 | 是 | 文件服务授权key 示例：idocyonyoucloudcom |
| bucketName | string | 否 | 是 | 文件服务桶名 示例：idoc |
| endpoint | string | 否 | 是 | 文件服务地址 示例：https://yonbip.diwork.com/yonbip-fi-eaffile/cloudrecord-file |
| secretKey | string | 否 | 是 | 文件服务密钥key 示例：idocyonyoucloudcom |
| serverType | string | 否 | 是 | 文件服务类型；gateway:把文件流传到档案核心微服务模块,通过后端上传到云存储（领域集成推荐） minio:直接上传到minio服务器(常用与私有云三方系统集成); tmp:先获取oss临时上传地址,通过临时地址上传文件（不推荐）; minio_tmp:先获取minio临时上传地址,通过临时地址上传文件（不推荐） 示例：gateway |
| orgInfo | object | 否 | 是 | 组织信息 |
| code | string | 否 | 是 | 组织编码 示例：001_0001 |
| type | string | 否 | 是 | 组织类型；unit 业务单元 、book 核算账簿(默认) 示例：book |
| showUpper | long | 否 | 否 | 上级文档id 示例：1 |
| taskId | string | 否 | 是 | 任务id 示例：S202111-173490-a559dc1db5f2 |
| type | string | 否 | 是 | 票据类型；目前该字段没有固定枚举值 示例：fa_fixedasset_FixedAssetsInfo |

## 3. 请求示例

Url: /yonbip/tax/output-tax/billpusher/query-billspush?access_token=访问令牌
Body: {
	"callbackUrl": "https://idoc.diwork.com//cloudrecord-imw/api/nc/v1/doc/push?corpId=1634",
	"docPkList": [
		"2444139785392640"
	],
	"fileServer": {
		"accessKey": "idocyonyoucloudcom",
		"bucketName": "idoc",
		"endpoint": "https://yonbip.diwork.com/yonbip-fi-eaffile/cloudrecord-file",
		"secretKey": "idocyonyoucloudcom",
		"serverType": "gateway"
	},
	"orgInfo": {
		"code": "001_0001",
		"type": "book"
	},
	"showUpper": 1,
	"taskId": "S202111-173490-a559dc1db5f2",
	"type": "fa_fixedasset_FixedAssetsInfo"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示语 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按照提示语处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


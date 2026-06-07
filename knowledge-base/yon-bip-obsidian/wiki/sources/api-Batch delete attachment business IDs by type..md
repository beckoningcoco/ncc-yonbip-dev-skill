---
title: "根据类型批量删除附件业务id"
apiId: "1809747383042965513"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据类型批量删除附件业务id

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attachment/batchdeleteattachmentfromnc

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
| attachmentInfoSyncSyncVOList | object | 是 | 否 | 档案附件信息 |
| archiveId | string | 否 | 否 | 档案id(如物料id、客户id等) 示例：12345 |
| attachmentBusinessId | string | 否 | 否 | 附件业务id 示例：abcd1234 |
| attachmentFileId | string | 否 | 否 | 文件id 示例：abcd1234 |
| attachmentBusinessType | string | 否 | 否 | 附件类型：取以下对应code 物料所有图片：PRODUCT_ALL_IMAGE; 物料首页图片：PRODUCT_HOME_PAGE_IMAGE; 物料视频:PRODUCT_VIDEO; 物料附件:PRODUCT_ATTACHMENT; 商品分类广告图片:PRESENTATION_CLASS_AD_IMAGE; 商品分类图片:PRESENTATION_CLASS_IMAGE; 标签图片:TAG_IMAGE; 品牌LOGO图片:BRAND_LOGO_IMAGE; 品牌广告图片:BRAND_AD_IMAGE; 客户LOGO图片:MERCHANT_LOGO_IMAGE; 客户营业执照:MERCHANT_BUSINESS_LICENSE; 客户法人证件正面:MERCHANT_LEGAL_PERSON_CERTIFICATE_FRONT; 客户法人证件背面:MERCHANT_LEGAL_PERSON_CERTIFICATE_BACK; 客户证照证书:MERCHANT_CERTIFICATE; 客户组织附件:MERCHANT_ORG_CERTIFICATE; 客户附件:MERCHANT_ATTACHMENT 示例：PRODUCT_HOME_PAGE_IMAGE |

## 3. 请求示例

Url: /yonbip/digitalModel/attachment/batchdeleteattachmentfromnc?access_token=访问令牌
Body: {
	"attachmentInfoSyncSyncVOList": [
		{
			"archiveId": "12345",
			"attachmentBusinessId": "abcd1234",
			"attachmentFileId": "abcd1234"
		}
	],
	"attachmentBusinessType": "PRODUCT_HOME_PAGE_IMAGE"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| success | boolean | 否 | 成功标识 示例：false |
| message | string | 否 | 提示信息 示例：处理成功 |
| code | long | 否 | 状态码:200表示成功 示例：200 |
| data | object | 否 | 返回值数据对象 |

## 5. 正确返回示例

{
	"success": false,
	"message": "处理成功",
	"code": 200,
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

-1	系统异常,请稍后再试	系统异常，联系管理员处理


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


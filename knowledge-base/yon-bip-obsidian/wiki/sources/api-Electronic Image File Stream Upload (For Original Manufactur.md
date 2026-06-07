---
title: "电子影像文件流上传（原厂开发专用）"
apiId: "2305524829524066307"
apiPath: "请求方式	POST"
method: "ContentType	multipart/form-data"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子影像文件流上传（原厂开发专用）

> `ContentType	multipart/form-data` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/current_yonbip_default_sys/ssc/imgCooperationFile/uploadFileForm

请求方式	POST

ContentType	multipart/form-data

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| uuid | string | 否 | 是 | 请求编号，用于后台日志标记请求，要求全局唯一，长度不能超过32位 示例：13152995891 |
| barcode | string | 否 | 是 | 单据条码 示例：261X1001ZZ1000000000C0AO |
| factorycode | string | 否 | 是 | 厂商编码 示例：shy |
| billid | string | 否 | 是 | 单据主键 示例：1588548192006832133 |
| opTime | string | 否 | 是 | 操作时间 示例：2022-11-11 15:24:14 |
| fieldCode | string | 否 | 是 | 领域编码，各领域在协同云注册 示例：GXGD |
| businessId | string | 否 | 是 | 上传文件的业务id，如共享工单的文件上传业务id就是单据id 示例：1588548192006832133 |
| contentType | string | 否 | 是 | 文件类型（"image/gif ：gif图片格式；image/jpeg ：jpg图片格式；image/png ：png图片格式；application/pdf ： pdf格式；application/msword ： Word文档格式"） 示例：image/jpeg |
| file | file | 否 | 是 | 上传的文件 |

## 3. 请求示例

Url: /current_yonbip_default_sys/ssc/imgCooperationFile/uploadFileForm?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 |
| message | string | 否 | 返回消息 |
| data | object | 否 | 上传文件信息处理结果 |
| fileId | string | 否 | 文件主键 |
| size | string | 否 | 文件大小 |
| name | string | 否 | 文件名字（带后缀） |
| baseName | string | 否 | 文件名字（无后缀） |
| extension | string | 否 | 文件后缀 |
| filePath | string | 否 | 文件路径 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"fileId": "",
		"size": "",
		"name": "",
		"baseName": "",
		"extension": "",
		"filePath": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023070105411	服务端逻辑异常	请联系系统管理员

1023070105443	协同云附件上传失败


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


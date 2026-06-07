---
title: "电子影像上传影像文件（客开场景使用）"
apiId: "2115632101993218054"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子影像上传影像文件（客开场景使用）

> `ContentType	application/json` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/img/OtherSystem/uploadImageFile

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
| billid | string | 否 | 是 | BIP单据id 示例：2107483208898576395 |
| data | object | 否 | 是 | 待上传文件数据 |
| fileName | string | 否 | 是 | 文件名称，需要带后缀。可通过springboot的MultipartFile获取，获取方式：MultipartFile.getOriginalFilename()。 示例：全电发票(普通).pdf |
| contentType | string | 否 | 是 | 文件类型（"image/gif ：gif图片格式；image/jpeg ：jpg图片格式；image/png ：png图片格式；application/pdf ： pdf格式；application/msword ： Word文档格式"），可通过springboot的MultipartFile获取，获取方式：MultipartFile..getContentType() 示例：image/png |
| fileBytes | number |
| 小数位数:0,最大长度:99999999999 | 是 | 是 | 文件字节流，可通过Spring框架的MultipartFile类获取。获取方式：MultipartFile.getBytes() |
| isInvoice | boolean | 否 | 是 | 是否为发票 示例：false |
| folderName | string | 否 | 否 | 文件夹名称 |

## 3. 请求示例

Url: /yonbip/ssc/img/OtherSystem/uploadImageFile?access_token=访问令牌
Body: {
	"billid": "2107483208898576395",
	"data": {
		"fileName": "全电发票(普通).pdf",
		"contentType": "image/png",
		"fileBytes": [
			0
		],
		"isInvoice": false,
		"folderName": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回值编码 示例：200 |
| message | string | 否 | 返回值信息 示例：请求成功 |
| data | object | 否 | 返回值数据 |
| fileId | string | 否 | 文件id 示例：6371b1b3b76c895a22c556a3 |
| size | number |
| 小数位数:0,最大长度:99999999999 | 否 | 文件大小 示例：133128 |
| name | string | 否 | 文件名称（带后缀） 示例：客运汽车票.jpg |
| baseName | string | 否 | 文件名称（不带后缀） 示例：客运汽车票 |
| extension | string | 否 | 文件类型 示例：.jpg |
| filePath | string | 否 | 文件路径 示例：iuap-apcom-file/0/2022111411/c8ca2840-3821-4488-ae35-141ca5899c17.jpg |

## 5. 正确返回示例

{
	"code": "200",
	"message": "请求成功",
	"data": {
		"fileId": "6371b1b3b76c895a22c556a3",
		"size": 133128,
		"name": "客运汽车票.jpg",
		"baseName": "客运汽车票",
		"extension": ".jpg",
		"filePath": "iuap-apcom-file/0/2022111411/c8ca2840-3821-4488-ae35-141ca5899c17.jpg"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023070105411	抱歉~系统异常，请联系管理员。

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


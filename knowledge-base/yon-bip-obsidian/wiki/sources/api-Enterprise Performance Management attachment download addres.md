---
title: "企业绩效获取附件下载地址"
apiId: "2048899846486622212"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "EPM Foundation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Foundation]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业绩效获取附件下载地址

> `ContentType	application/x-www-form-urlencoded` 请求方式	POST | 分类: EPM Foundation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/v1/file/get

请求方式	POST

ContentType	application/x-www-form-urlencoded

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| fileId | string | query | 是 | 文件id。可由上传文件接口返回获取。    示例: 669f4d5d35ab8523b4afc183 |

## 3. 请求示例

Url: /yonbip/qyjx/v1/file/get?access_token=访问令牌&fileId=669f4d5d35ab8523b4afc183

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| name | string | 否 | 文件名称 示例：test.txt |
| size | number |
| 小数位数:0,最大长度:10 | 否 | 文件大小，单位type 示例：5 |
| url | string | 否 | 文件下载链接 示例：https://bip-xxx.xxxx.com/iuap-apcom-file-private/iuap-apcom-file/0000L6YQ8AVLFUZPXD0000/2024072314/87e95653-441e-45d4-a030-78cc8d4f1d13.txt?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1721716993&Signature=I5Foo%2FtTkysxH%2F47MU5EKnyimi4%3D |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"name": "test.txt",
		"size": 5,
		"url": "https://bip-xxx.xxxx.com/iuap-apcom-file-private/iuap-apcom-file/0000L6YQ8AVLFUZPXD0000/2024072314/87e95653-441e-45d4-a030-78cc8d4f1d13.txt?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1721716993&Signature=I5Foo%2FtTkysxH%2F47MU5EKnyimi4%3D"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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


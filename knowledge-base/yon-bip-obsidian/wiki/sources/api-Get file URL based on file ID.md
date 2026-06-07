---
title: "根据文件ID获取文件URL"
apiId: "2094844580538089472"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planning, Budgeting& Forecasting"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planning, Budgeting& Forecasting]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据文件ID获取文件URL

> `ContentType	application/json` 请求方式	POST | 分类: Planning, Budgeting& Forecasting (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/bp/file/getUrl

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
| processID | string | 否 | 是 | 下载文件的processID 示例：2094746646611492873 |
| syscode | string | 否 | 是 | 系统类型，预算BP 示例：BP |

## 3. 请求示例

Url: /yonbip/qyjx/bp/file/getUrl?access_token=访问令牌
Body: {
	"processID": "2094746646611492873",
	"syscode": "BP"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| data | object | 否 | data |
| fileUrl | string | 否 | fileUrl 示例：https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/0000LIDZUUKY4HFK050000/2024092010/bd52d840-fa3c-457c-9d1c-ee3d45e933a8.zip?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1726801485&Signature=RgLWY4dYpGlV3cUrWJeV9iNhLNw%3D |
| type | string | 否 | type 示例：success |
| fileId | string | 否 | fileId 示例：66ece501aded5f5c20483029 |
| success | boolean | 否 | success 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"fileUrl": "https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/0000LIDZUUKY4HFK050000/2024092010/bd52d840-fa3c-457c-9d1c-ee3d45e933a8.zip?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1726801485&Signature=RgLWY4dYpGlV3cUrWJeV9iNhLNw%3D",
		"type": "success",
		"fileId": "66ece501aded5f5c20483029"
	},
	"success": true
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


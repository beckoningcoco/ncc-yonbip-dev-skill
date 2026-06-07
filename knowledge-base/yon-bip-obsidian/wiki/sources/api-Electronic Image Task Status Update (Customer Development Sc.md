---
title: "电子影像任务状态更新（客开场景使用）"
apiId: "2277286166890807300"
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

# 电子影像任务状态更新（客开场景使用）

> `ContentType	application/json` 请求方式	POST | 分类: File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/SSCIMG/img/OtherSystem/updateimagestate

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
| uuid | string | 否 | 是 | 请求编号，用于后台日志标记请求，要求全局唯一，长度不能超过32位 示例：13122225891 |
| barcode | string | 否 | 否 | 单据条码 示例：261X1001ZZ1000000000C0AO |
| opTime | string | 否 | 是 | 操作时间 示例：2022-07-22 14:50:45 |
| factorycode | string | 否 | 是 | 厂商编号 示例：shy |
| billid | string | 否 | 是 | 单据主键 示例：15253466543 |
| data | object | 否 | 是 | 影像状态更新信息 |
| imagestate | int | 否 | 是 | 影像状态（0：待扫描，1：扫描完成，2：待补扫，3：补扫完成，4：待重扫，5：重扫完成。） 示例：1 |
| imagenum | int | 否 | 是 | 影像数量：总文件数量 示例：5 |
| invoicenum | int | 否 | 是 | 发票数量：发票文件数量 示例：3 |
| opuserid | string | 否 | 是 | 操作用户主键 示例：1001ZZ1000000000C0AO |
| opusercode | string | 否 | 是 | 操作用户编号 示例：csf |
| opusername | string | 否 | 是 | 操作用户名 示例：陈顺风 |
| reject_reason | string | 否 | 否 | 驳回原因 示例：发票有误 |
| reject_idea | string | 否 | 否 | 驳回意见 示例：重新导入发票 |

## 3. 请求示例

Url: /yonbip/ssc/SSCIMG/img/OtherSystem/updateimagestate?access_token=访问令牌
Body: {
	"uuid": "13122225891",
	"barcode": "261X1001ZZ1000000000C0AO",
	"opTime": "2022-07-22 14:50:45",
	"factorycode": "shy",
	"billid": "15253466543",
	"data": {
		"imagestate": 1,
		"imagenum": 5,
		"invoicenum": 3,
		"opuserid": "1001ZZ1000000000C0AO",
		"opusercode": "csf",
		"opusername": "陈顺风",
		"reject_reason": "发票有误",
		"reject_idea": "重新导入发票"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编号 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 业务数据 示例：null |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023070105411	服务端逻辑异常	请联系系统管理员

1023070105435	影像任务不存在

1023070105441	厂商编码错误

1023070105442	厂商编码不可为空


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


---
title: "销售渠道更新保存"
apiId: "1972536891352285184"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Channel"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Channel]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售渠道更新保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Channel (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customertype/idempotent/update

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 销售渠道数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | number |
| 小数位数:0,最大长度:22 | 否 | 否 | id 示例：123456 |
| code | string | 否 | 否 | 销售渠道编码 示例：20210922_1 |
| name | object | 否 | 否 | 销售渠道名称 |
| stopStatus | boolean | 否 | 否 | 启用停用状态：false启用，true停用 示例：false |
| comment | string | 否 | 否 | 备注 示例：20210922_1 |

## 3. 请求示例

Url: /yonbip/digitalModel/customertype/idempotent/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 123456,
		"code": "20210922_1",
		"name": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"stopStatus": false,
		"comment": "20210922_1"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 调用完成时返回码 示例：200 |
| message | string | 否 | 调用完成时返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时返回数据 |
| id | long | 否 | 销售渠道id 示例：2442796906729728 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2442796906729728
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

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


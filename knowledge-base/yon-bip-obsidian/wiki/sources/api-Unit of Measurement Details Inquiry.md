---
title: "计量单位详情查询"
apiId: "1af1e4dc3c88432f889a0d0b364fe0f7"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位详情查询

> `ContentType	application/json` 请求方式	GET | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/unit/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID     示例: 123456 |

## 3. 请求示例

Url: /yonbip/digitalModel/unit/detail?access_token=访问令牌&id=123456

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 编码 示例：编码 |
| name | object | 否 | 名称,支持多语 |
| unitGroup_name | string | 否 | 分组名称 示例：分组名称 |
| unitGroup | long | 否 | 计量单位分组ID 示例：123456 |
| truncationType | int | 否 | 舍位方式, 4:四舍五入、1:舍位、0:入位 示例：4 |
| precision | int | 否 | 单位精度 示例：0 |
| creator | string | 否 | 创建人 示例：创建人 |
| createDate | string | 否 | 创建日期 示例：格式为:yyyy-MM-dd HH:mm:ss |
| stopstatus | int | 否 | 启用状态, 0:启用、1:停用、 示例：0 |
| createTime | string | 否 | 创建时间 示例：格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 修改人 示例：修改人 |
| modifyTime | string | 否 | 修改时间 示例：格式为:yyyy-MM-dd HH:mm:ss |
| modifyDate | string | 否 | 修改日期 示例：格式为:yyyy-MM-dd HH:mm:ss |
| id | long | 否 | 计量单位ID 示例：123456789 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：格式为:yyyy-MM-dd HH:mm:ss |
| bBaseUnit | boolean | 否 | 是否基本单位 示例：false-否，true-是，默认为false |
| convertCoefficient | BigDecimal | 否 | 换算系数，当前单位与基本单位换算系数 示例：1 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"code": "编码",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"unitGroup_name": "分组名称",
		"unitGroup": 123456,
		"truncationType": 4,
		"precision": 0,
		"creator": "创建人",
		"createDate": "格式为:yyyy-MM-dd HH:mm:ss",
		"stopstatus": 0,
		"createTime": "格式为:yyyy-MM-dd HH:mm:ss",
		"modifier": "修改人",
		"modifyTime": "格式为:yyyy-MM-dd HH:mm:ss",
		"modifyDate": "格式为:yyyy-MM-dd HH:mm:ss",
		"id": 123456789,
		"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
		"bBaseUnit": "",
		"convertCoefficient": 1
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


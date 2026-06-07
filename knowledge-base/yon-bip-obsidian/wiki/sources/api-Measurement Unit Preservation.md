---
title: "计量单位保存"
apiId: "1fb84429651a43cc9009fcdf8473d7b3"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位保存

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/unit/save

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
| data | object | 否 | 是 | 计量单位 |
| code | string | 否 | 是 | 编码,不能重复 示例：0001 |
| name | object | 否 | 否 | 名称,支持多语,不能重复 |
| unitGroup_name | string | 否 | 否 | 分组名称 示例：分组名称 |
| unitGroup | long | 否 | 是 | 分组id 示例：1742146567616105 |
| truncationType | int | 否 | 是 | 舍位方式, 4:四舍五入、1:舍位、0:入位、 示例：0 |
| precision | string | 否 | 否 | 单位精度，新增时可不输默认为2，修改时必输 示例：2 |
| creator | string | 否 | 否 | 创建人 示例：张三 |
| createDate | string | 否 | 否 | 创建日期 示例：2020-08-29 09:52:18 |
| stopstatus | string | 否 | 是 | 启用状态, 0:启用、1:停用 示例：1 |
| createTime | string | 否 | 否 | 创建时间 示例：2020-08-29 09:52:18 |
| id | string | 否 | 否 | 计量单位ID,修改计量单位编码时必填 示例：1891797551141632 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-08-29 09:55:59 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| bBaseUnit | boolean | 否 | 是 | 是否基本单位，false：否、true：是 示例：false |
| convertCoefficient | BigDecimal | 否 | 否 | 换算系数 示例：1 |
| unitGroupCode | string | 否 | 否 | 计量单位分组编码 示例：分组编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/unit/save?access_token=访问令牌
Body: {
	"data": {
		"code": "0001",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"unitGroup_name": "分组名称",
		"unitGroup": 1742146567616105,
		"truncationType": 0,
		"precision": "2",
		"creator": "张三",
		"createDate": "2020-08-29 09:52:18",
		"stopstatus": "1",
		"createTime": "2020-08-29 09:52:18",
		"id": "1891797551141632",
		"pubts": "2020-08-29 09:55:59",
		"_status": "Insert",
		"bBaseUnit": false,
		"convertCoefficient": 1,
		"unitGroupCode": "分组编码"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| modifierId | string | 否 | 修改人id 示例：123456 |
| isEnabled | boolean | 否 | 当前计量单位是否可用 示例：true |
| code | string | 否 | 编码 示例：编码 |
| name | object | 否 | 名称,支持多语 |
| unitGroup_name | string | 否 | 分组名称 示例：分组名称 |
| unitGroup | string | 否 | 计量单位分组ID 示例：12345678 |
| truncationType | string | 否 | 舍位方式, 4:四舍五入、1:舍位、0:入位、 示例：4 |
| precision | int | 否 | 单位精度 示例：0 |
| creator | string | 否 | 创建人 示例：创建人 |
| createDate | string | 否 | 创建日期 示例：2024-04-02 00:00:00 |
| stopstatus | boolean | 否 | 启用状态, false:启用、true:停用、 示例：true |
| createTime | string | 否 | 创建时间 示例：2024-04-02 00:00:00 |
| modifier | string | 否 | 修改人 示例：修改人 |
| modifyTime | string | 否 | 修改时间 示例：2024-04-02 00:00:00 |
| modifyDate | string | 否 | 修改日期 示例：2024-04-02 00:00:00 |
| id | long | 否 | 计量单位ID 示例：123456789 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2024-04-02 00:00:00 |
| bBaseUnit | boolean | 否 | 是否基本单位，false：否；true：是 示例：false |
| convertCoefficient | string | 否 | 换算系数 示例：1 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"modifierId": "123456",
		"isEnabled": true,
		"code": "编码",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"unitGroup_name": "分组名称",
		"unitGroup": "12345678",
		"truncationType": "4",
		"precision": 0,
		"creator": "创建人",
		"createDate": "2024-04-02 00:00:00",
		"stopstatus": true,
		"createTime": "2024-04-02 00:00:00",
		"modifier": "修改人",
		"modifyTime": "2024-04-02 00:00:00",
		"modifyDate": "2024-04-02 00:00:00",
		"id": 123456789,
		"pubts": "2024-04-02 00:00:00",
		"bBaseUnit": false,
		"convertCoefficient": "1"
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


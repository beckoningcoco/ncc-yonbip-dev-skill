---
title: "岗位新增|更新_save"
apiId: "1863936530154782728"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Position"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Position]
platform_version: "BIP"
source_type: community-api-docs
---

# 岗位新增|更新_save

> `ContentType	application/json` 请求方式	POST | 分类: Position (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/position/save

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
| data | object | 否 | 否 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 是 | 编码 |
| id | string | 否 | 否 | 主键，新增不填；更新，必填 示例：233243242 |
| org_id | string | 否 | 是 | 所属组织主键 |
| dept_id | string | 否 | 是 | 所属部门主键 |
| parentid | string | 否 | 否 | 上级职位 |
| jobtype_id | string | 否 | 否 | 职务类别 |
| job_id | string | 否 | 否 | 职务 |
| jobgrade_id | string | 否 | 否 | 职级 |
| maxrank_id | string | 否 | 否 | 最高职等 |
| minrank_id | string | 否 | 否 | 最低职等 |
| duties | string | 否 | 否 | 职责 |
| memo | object | 否 | 否 | 备注 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 |
| name | muti_lang | 否 | 是 | 名称 |
| enable | long | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：0 |
| os_base_post_id | string | 否 | 否 | 基准职位 |
| os_base_post_id_post_sequence_id | string | 否 | 否 | 职位序列：code或者id |
| starttime | Date | 否 | 否 | 生效日期，时间轴租户必填 示例：1970-01-01 |
| description | string | 否 | 否 | 变更说明，时间轴租户进行变更时填写 |
| vid | string | 否 | 否 | 时间轴租户主键，新增时不填，更新必填 示例：233243242 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "",
		"id": "233243242",
		"org_id": "",
		"dept_id": "",
		"parentid": "",
		"jobtype_id": "",
		"job_id": "",
		"jobgrade_id": "",
		"maxrank_id": "",
		"minrank_id": "",
		"duties": "",
		"memo": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"_status": "",
		"name": {
			"zh_TW": "繁体",
			"en_US": "英文",
			"zh_CN": "中文"
		},
		"enable": 0,
		"os_base_post_id": "",
		"os_base_post_id_post_sequence_id": "",
		"starttime": "1970-01-01",
		"description": "",
		"vid": "233243242"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | data |
| code | string | 否 | 编码 |
| name | muti_lang | 否 | 名称 |
| org_id | string | 否 | 所属组织主键 |
| dept_id | string | 否 | 所属部门主键 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 |
| sysid | string | 否 | 系统标识 |
| id | string | 否 | 主键 |
| pubts | string | 否 | 时间戳，yyyy-MM-dd HH:mm:ss |
| os_base_post_id_post_sequence_id | string | 否 | 职位序列主键 |
| creator | string | 否 | 创建人 |
| creationtime | string | 否 | 创建时间，yyyy-MM-dd HH:mm:ss |
| yhtTenant | string | 否 | 友互通租户 |
| tenant | string | 否 | 租户ID |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "",
		"name": {
			"zh_TW": "繁体",
			"en_US": "英文",
			"zh_CN": "中文"
		},
		"org_id": "",
		"dept_id": "",
		"enable": 0,
		"sysid": "",
		"id": "",
		"pubts": "",
		"os_base_post_id_post_sequence_id": "",
		"creator": "",
		"creationtime": "",
		"yhtTenant": "",
		"tenant": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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


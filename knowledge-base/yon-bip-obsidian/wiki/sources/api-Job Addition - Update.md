---
title: "职位新增|更新"
apiId: "1898235606395256835"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job]
platform_version: "BIP"
source_type: community-api-docs
---

# 职位新增|更新

> `ContentType	application/json` 请求方式	POST | 分类: Job (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/post/singleSave

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
| data | object | 否 | 是 | data |
| code | string | 否 | 是 | 编码 示例：123 |
| id | string | 否 | 否 | 主键，新增不填；更新，必填 示例：233243242 |
| org_id | string | 否 | 是 | 所属组织主键或者编码 示例：12121211 |
| jobtype_id | string | 否 | 否 | 职务类别主键或者编码 示例：11 |
| job_id | string | 否 | 否 | 职务主键或者编码 示例：22 |
| jobgrade_id | string | 否 | 否 | 职级主键或者编码 示例：11 |
| maxrank_id | string | 否 | 否 | 最高职等主键或者编码 示例：22 |
| minrank_id | string | 否 | 否 | 最低职等主键或者编码 示例：33 |
| duties | string | 否 | 否 | 职责 示例：职责 |
| memo | object | 否 | 否 | 备注 示例：备注 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 示例：Insert |
| name | muti_lang | 否 | 是 | 名称 |
| enable | long | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：0 |
| os_base_post_id | string | 否 | 否 | 基准职位主键或者编码 示例：22 |
| os_base_post_id_post_sequence_id | string | 否 | 否 | 职位序列：code或者id 示例：33 |
| professional | string | 否 | 否 | 专业类别：主键或者编码 示例：0000001 |
| reqedu | string | 否 | 否 | 最低学历要求：主键或者编码 示例：0000002 |
| degree | string | 否 | 否 | 学位要求：主键或者编码 示例：0000003 |
| reqtitle | string | 否 | 否 | 最低职称要求：主键或者编码 示例：000004 |
| reqexp | string | 否 | 否 | 工作经验要求 示例：3-5年 |
| reqworkyear | string | 否 | 否 | 最低工作年限 示例：2年 |
| age | string | 否 | 否 | 年龄要求 示例：18岁以上 |
| reqother | string | 否 | 否 | 其他要求 示例：其他要求 |

## 3. 请求示例

Url: /yonbip/digitalModel/post/singleSave?access_token=访问令牌
Body: {
	"data": {
		"code": "123",
		"id": "233243242",
		"org_id": "12121211",
		"jobtype_id": "11",
		"job_id": "22",
		"jobgrade_id": "11",
		"maxrank_id": "22",
		"minrank_id": "33",
		"duties": "职责",
		"memo": {
			"0": "备",
			"1": "注",
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"_status": "Insert",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"enable": 0,
		"os_base_post_id": "22",
		"os_base_post_id_post_sequence_id": "33",
		"professional": "0000001",
		"reqedu": "0000002",
		"degree": "0000003",
		"reqtitle": "000004",
		"reqexp": "3-5年",
		"reqworkyear": "2年",
		"age": "18岁以上",
		"reqother": "其他要求"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | data |
| code | string | 否 | 编码 示例：ZHIWEI00000001 |
| name | muti_lang | 否 | 名称 |
| org_id | string | 否 | 所属组织主键 示例：2682089228571136 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 示例：1 |
| sysid | string | 否 | 系统标识 示例：diwork |
| id | string | 否 | 主键 示例：2682089228571136 |
| pubts | string | 否 | 时间戳，yyyy-MM-dd HH:mm:ss 示例：2023-12-14 19:28:44 |
| os_base_post_id_post_sequence_id | string | 否 | 职位序列主键 示例：213131212 |
| creator | string | 否 | 创建人 示例：2682089228571136 |
| creationtime | string | 否 | 创建时间，yyyy-MM-dd HH:mm:ss 示例：2023-12-14 19:28:44 |
| yhtTenant | string | 否 | 友互通租户 示例：123 |
| tenant | string | 否 | 租户ID 示例：123 |
| vid | string | 否 | 时间轴主键 示例：1213123 |
| job_id | string | 否 | 职务主键 示例：123 |
| jobtype_id | string | 否 | 职务类别主键 示例：234 |
| jobgrade_id | string | 否 | 职级主键 示例：345 |
| maxrank_id | string | 否 | 最高职等主键 示例：456 |
| minrank_id | string | 否 | 最低职等主键 示例：567 |
| duties | string | 否 | 职责 示例：职责 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "ZHIWEI00000001",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"org_id": "2682089228571136",
		"enable": 1,
		"sysid": "diwork",
		"id": "2682089228571136",
		"pubts": "2023-12-14 19:28:44",
		"os_base_post_id_post_sequence_id": "213131212",
		"creator": "2682089228571136",
		"creationtime": "2023-12-14 19:28:44",
		"yhtTenant": "123",
		"tenant": "123",
		"vid": "1213123",
		"job_id": "123",
		"jobtype_id": "234",
		"jobgrade_id": "345",
		"maxrank_id": "456",
		"minrank_id": "567",
		"duties": "职责"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-19

新增

请求参数 (8)

HXRL-127424 职位中的任职资格相关的8个字段与基准职位解绑


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


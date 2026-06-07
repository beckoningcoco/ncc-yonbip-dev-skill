---
title: "岗位批量新增更新_集成_API"
apiId: "2128309161823305728"
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

# 岗位批量新增更新_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Position (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/position/batchSaveOrUpdateForIntegration

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | data |
| name | muti_lang | 否 | 是 | 名称 |
| objid | string | 否 | 是 | objid 示例：objid |
| org_id | string | 否 | 是 | 所属组织主键 示例：666666 |
| code | string | 否 | 是 | 编码 示例：123 |
| enable | int | 否 | 是 | 启用状态，0初始化 1启用 2停用 示例：1 |
| os_base_post_id | string | 否 | 否 | 基准职位 示例：2222 |
| os_base_post_id_post_sequence_id | string | 否 | 否 | 职位序列 示例：2222 |
| dept_id | string | 否 | 是 | 所属部门主键 示例：3333 |
| jobgrade_id | string | 否 | 否 | 职级id 示例：4444 |
| maxrank_id | string | 否 | 否 | 最高职等id 示例：444 |
| minrank_id | string | 否 | 否 | 最低职等id 示例：123 |
| job_id | string | 否 | 否 | 所属职务id 示例：222 |
| jobtype_id | string | 否 | 否 | 职务类别id 示例：321 |
| professional | string | 否 | 否 | 专业类别，基准职位有值时，以基准职位中专业类别为准 示例：432141324321 |
| reqedu | string | 否 | 否 | 最低学历要求，基准职位有值时，以基准职位中最低学历要求为准 示例：341412341234 |
| degree | string | 否 | 否 | 最低学位要求，基准职位有值时，以基准职位中最低学位要求为准 示例：234321432141 |
| reqtitle | string | 否 | 否 | 最低职称要求，基准职位有值时，以基准职位中最低职称要求为准 示例：324321341342 |
| reqexp | string | 否 | 否 | 工作经验要求，基准职位有值时，以基准职位中工作经验要求为准 示例：3-5年 |
| reqworkyear | string | 否 | 否 | 最低工作年限，基准职位有值时，以基准职位中最低工作年限为准 示例：3年 |
| age | string | 否 | 否 | 年龄要求，基准职位有值时，以基准职位中年龄要求为准 示例：30-40岁 |
| reqother | string | 否 | 否 | 其他要求，基准职位有值时，以基准职位中其他要求为准 示例：有责任心 |
| id | string | 否 | 否 | 主键 示例：232323 |
| distributionSite | string | 否 | 否 | distributionSite |
| dr | number |
| 小数位数:0,最大长度:10 | 否 | 否 | dr 示例：0 |
| parentid | string | 否 | 否 | 上级岗位 示例：2121 |
| freeze | number |
| 小数位数:0,最大长度:10 | 否 | 否 | freeze 示例：1 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 否 | level 示例：1 |
| sysid | string | 否 | 否 | sysid 示例：sysid |
| duties | string | 否 | 否 | duties 示例：duties |
| ts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | ts |
| memo | object | 否 | 否 | memo |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间 |
| creator | string | 否 | 否 | 创建人 |
| modifier | string | 否 | 否 | 修改人 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"objid": "objid",
			"org_id": "666666",
			"code": "123",
			"enable": 1,
			"os_base_post_id": "2222",
			"os_base_post_id_post_sequence_id": "2222",
			"dept_id": "3333",
			"jobgrade_id": "4444",
			"maxrank_id": "444",
			"minrank_id": "123",
			"job_id": "222",
			"jobtype_id": "321",
			"professional": "432141324321",
			"reqedu": "341412341234",
			"degree": "234321432141",
			"reqtitle": "324321341342",
			"reqexp": "3-5年",
			"reqworkyear": "3年",
			"age": "30-40岁",
			"reqother": "有责任心",
			"id": "232323",
			"distributionSite": "",
			"dr": 0,
			"parentid": "2121",
			"freeze": 1,
			"pubts": "2026-06-07 11:42:00",
			"level": 1,
			"sysid": "sysid",
			"duties": "duties",
			"ts": "2026-06-07 11:42:00",
			"memo": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"modifyTime": "2026-06-07 11:42:00",
			"createTime": "2026-06-07 11:42:00",
			"creator": "",
			"modifier": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | sucessCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| messages | object | 是 | messages |
| infos | object | 是 | infos |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			{
				"sourceUnique": "211221",
				"message": "失败原因"
			}
		],
		"infos": [
			{
				"data": {
					"name": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"starttime": "2024-11-29",
					"_status": "",
					"org_id": "",
					"code": "",
					"id": "",
					"enable": 0,
					"os_base_post_id": "",
					"os_base_post_id_post_sequence_id": "",
					"dept_id": "",
					"jobgrade_id": "",
					"maxrank_id": "",
					"minrank_id": "",
					"job_id": "",
					"jobtype_id": "",
					"user_define_character": {},
					"professional": "432141324321",
					"reqedu": "341412341234",
					"degree": "234321432141",
					"reqtitle": "324321341342",
					"reqexp": "3-5年",
					"reqworkyear": "3年",
					"age": "30-40岁",
					"reqother": "有责任心"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	请联系开发处理	请联系开发处理


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


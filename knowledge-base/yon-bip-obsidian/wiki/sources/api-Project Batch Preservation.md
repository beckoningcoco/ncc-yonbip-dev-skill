---
title: "项目批量保存V5"
apiId: "2171314591944933381"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目批量保存V5

> `ContentType	application/json` 请求方式	POST | 分类: Project (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/project/batchSave

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
| matchRule | string | 否 | 是 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 是 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add |
| insertAutoApplyRange | boolean | 否 | 否 | 适用范围是否自动分配，新增数据时有效。true-根据所属组织计算适用范围，和传入的适用范围合并后作为最终结果，false-传入的适用范围即是最终结果。 示例：true 默认值：true |
| data | object | 是 | 否 | 业务数据 |
| sourceUnique | string | 否 | 是 | 源系统唯一标识 示例：2211575684096589831 |
| id | string | 否 | 否 | 主键ID 示例：2211575684096589836 |
| code | string | 否 | 是 | 编码 示例：001 |
| name | object | 否 | 是 | 名称(根据租户开通的语种传入，当前为开通中英繁情况下传入格式) |
| classifyid | string | 否 | 否 | 所属分类(与classifyid___code二选一录入即可，默认classifyid有值时，classifyid___code字段不生效) 示例：2211575684096589834 |
| classifyid___code | string | 否 | 否 | 所属分类编码(与classifyid二选一录入即可，classifyid为空时，按classifyid___code匹配) 示例：001 |
| deptid | string | 否 | 否 | 项目负责部门(与deptid___code二选一录入即可，默认deptid有值时，deptid___code字段不生效) 示例：2211575684096589834 |
| deptid___code | string | 否 | 否 | 项目负责部门编码(与deptid二选一录入即可，deptid为空时，按deptid___code匹配) 示例：001 |
| description | object | 否 | 否 | description |
| enable | number |
| 小数位数:0,最大长度:11 | 否 | 否 | 启用状态 (1:启用,2:停用;新增时默认启用) 示例：1 |
| orgid | string | 否 | 否 | 所属组织(与orgid___code二选一录入即可，默认orgid有值时，orgid___code字段不生效) 示例：666666 |
| orgid___code | string | 否 | 否 | 所属组织编码(与orgid二选一录入即可，orgid为空时，按orgid___code匹配) 示例：global00 |
| parent | string | 否 | 否 | 上级id(与parent___code二选一录入即可，默认parent有值时，parent___code字段不生效) 示例：2211575684096589834 |
| parent___code | string | 否 | 否 | 上级编码(与parent二选一录入即可，parent为空时，按parent___code匹配) 示例：001 |
| person | string | 否 | 否 | 负责人(与person___code二选一录入即可，默认person有值时，person___code字段不生效) 示例：2211575684096589834 |
| person___code | string | 否 | 否 | 负责人编码(与person二选一录入即可，person为空时，按person___code匹配) 示例：001 |
| planDate | number |
| 小数位数:0,最大长度:6 | 否 | 否 | 计划工期 示例：153 |
| planStartTime | date |
| 格式:yyyy-MM-dd | 否 | 否 | 计划开始时间 示例：2025-03-05 |
| planEndTime | date |
| 格式:yyyy-MM-dd | 否 | 否 | 计划结束时间 示例：2025-08-05 |
| progress | number |
| 小数位数:2,最大长度:6 | 否 | 否 | 进度% 示例：65 |
| projectType | string | 否 | 否 | 项目类型(与projectType___code二选一录入即可，默认projectType有值时，projectType___code字段不生效，不填会使用默认值) 示例：2211575684096589834 |
| projectType___code | string | 否 | 否 | 项目类型编码(与projectType二选一录入即可，projectType为空时，按projectType___code匹配，不填会使用默认值) 示例：project0 |
| realDate | number |
| 小数位数:0,最大长度:6 | 否 | 否 | 实际工期 示例：150 |
| realStartTime | date |
| 格式:yyyy-MM-dd | 否 | 否 | 实际开始日期 示例：2025-03-05 |
| realEndTime | date |
| 格式:yyyy-MM-dd | 否 | 否 | 实际完成日期 示例：2025-08-02 |
| warehouseId | number |
| 小数位数:0,最大长度:64 | 否 | 否 | 收货仓库(与warehouseId___code二选一录入即可，默认warehouseId有值时，warehouseId___code字段不生效) 示例：2211575684096589834 |
| warehouseId___code | string | 否 | 否 | 收货仓库编码(与warehouseId二选一录入即可，warehouseId为空时，按warehouseId___code匹配) 示例：001 |
| projectApplyRangeListResultObj | object | 是 | 否 | 适用范围组织code集合,不填时使用分级管控配置 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/project/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"insertAutoApplyRange": true,
	"data": [
		{
			"sourceUnique": "2211575684096589831",
			"id": "2211575684096589836",
			"code": "001",
			"name": {
				"zh_CN": "001-cn",
				"en_US": "001-en",
				"zh_TW": "001-fan"
			},
			"classifyid": "2211575684096589834",
			"classifyid___code": "001",
			"deptid": "2211575684096589834",
			"deptid___code": "001",
			"description": {
				"zh_CN": "描述-cn",
				"en_US": "描述-en",
				"zh_TW": "描述-fan"
			},
			"enable": 1,
			"orgid": "666666",
			"orgid___code": "global00",
			"parent": "2211575684096589834",
			"parent___code": "001",
			"person": "2211575684096589834",
			"person___code": "001",
			"planDate": 153,
			"planStartTime": "2025-03-05",
			"planEndTime": "2025-08-05",
			"progress": 65,
			"projectType": "2211575684096589834",
			"projectType___code": "project0",
			"realDate": 150,
			"realStartTime": "2025-03-05",
			"realEndTime": "2025-08-02",
			"warehouseId": 2211575684096589834,
			"warehouseId___code": "001",
			"projectApplyRangeListResultObj": [
				{
					"rangeOrgId___code": "001"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功是返回200 示例：200 |
| data | object | 否 | 调用成功时的返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：9 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：1 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 成功数据信息 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "编码冲突！"
			}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": 0
}

## 6. 业务异常码

000-525-000066

传入的数据列表为空或存在空对象，请检查代码

000-525-000067

执行批量操作时，数据必须包含sourceUnique


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

请求说明

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


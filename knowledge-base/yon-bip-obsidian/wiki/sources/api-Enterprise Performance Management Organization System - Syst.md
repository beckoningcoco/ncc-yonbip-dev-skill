---
title: "企业绩效组织体系-体系成员树"
apiId: "1585709613865500678"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Organization System"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Organization System]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业绩效组织体系-体系成员树

> `ContentType	application/json` 请求方式	POST | 分类: Organization System (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/epmorg/epmorglist

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
| org_epm_systems_id | string | 否 | 是 | 企业绩效组织体系主键，可以通过 企业绩效组织体系-体系树 获取 示例：123123123123 |

## 3. 请求示例

Url: /yonbip/digitalModel/epmorg/epmorglist?access_token=访问令牌
Body: {
	"org_epm_systems_id": "123123123123"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求状态码 示例：200 |
| message | string | 否 | 请求结果描述 示例：操作成功 |
| data | object | 是 | 数据集合 |
| id | string | 否 | 主体单元关系主键 示例：2435806204645633 |
| org_id | string | 否 | 主体单元成员主键 示例：2435806204645634 |
| code | string | 否 | 主体单元编码 示例：100003 |
| name | string | 否 | 主体单元名称 示例：xx公司 |
| shortcode | string | 否 | 简码 示例：JM |
| shortname | string | 否 | 简称 示例：简称 |
| aggr | string | 否 | 汇总属性 1加，0忽略，-1减 示例：1 |
| currency | string | 否 | 本位币主键 示例：2322393516396800 |
| currency_code | string | 否 | 本位币编码 示例：CNY |
| currency_name | string | 否 | 本位币名称 示例：人民币 |
| org_source | string | 否 | 组织类型 0业务单元加部门，1会计主体，2部门，3成本中心，4虚组织，5销售区域，7业务单元，8虚节点，9审批汇报树 示例：0 |
| groupcode | string | 否 | 组编码 示例：#004 |
| is_balance_unit | int | 否 | 是否差额单位 0否，1是 示例：0 |
| class_type_name | string | 否 | 组织形态 示例：公司 |
| org_form_name | string | 否 | 部门性质 示例：公司 |
| innercode | string | 否 | 内置码 示例：2BHS |
| children | object | 是 | 下级主体单元集合，属性与根节点属性一致 |
| org_epm_systems_id | string | 否 | 预算报表组织体系主键 示例：2333877929743616 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "2435806204645633",
			"org_id": "2435806204645634",
			"code": "100003",
			"name": "xx公司",
			"shortcode": "JM",
			"shortname": "简称",
			"aggr": "1",
			"currency": "2322393516396800",
			"currency_code": "CNY",
			"currency_name": "人民币",
			"org_source": "0",
			"groupcode": "#004",
			"is_balance_unit": 0,
			"class_type_name": "公司",
			"org_form_name": "公司",
			"innercode": "2BHS",
			"children": [
				{
					"id": "2435807102996736",
					"org_id": "2435807102652672",
					"code": "100004",
					"name": "xxx公司",
					"shortcode": "JM",
					"shortname": "简称",
					"aggr": "1",
					"class_type_name": "公司",
					"groupcode": "#005",
					"is_balance_unit": 1,
					"parent_id": "2435806204645633",
					"parent_innercode": "QKEJ",
					"innercode": "QKEJBTWV",
					"org_epm_systems_id": "2333877929743616"
				}
			],
			"org_epm_systems_id": "2333877929743616"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常


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


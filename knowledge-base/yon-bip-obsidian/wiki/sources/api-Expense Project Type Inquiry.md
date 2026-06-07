---
title: "费用项目类型查询"
apiId: "b05c4969071d464bb08dc462f43b745d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Item Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Item Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用项目类型查询

> `ContentType	application/json` 请求方式	POST | 分类: Expense Item Type (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/bd/v1/querydata/expenseitemtype

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
| fields | string | 否 | 否 | 查询字段：id:主键,code:编码,name:名称,remark:备注,isEnd:是否末级,enabled:启用状态,level:层级,sort:排序字段,objid:原费用项目类型ID（同步场景）,accentity:业务单元ID,accentity.code:业务单元编码,accentity.name:业务单元名称,expenseitemtype:父级费用项目类型ID,expenseitemtype.name:父级费用项目类型名称 默认值：id,code,name |
| startTs | string | 否 | 否 | 开始时间，格式为yyyy-MM-dd HH:mm:ss，startTs、endTs、ids不能全为空 默认值：1900-01-01 |
| endTs | string | 否 | 否 | 结束时间，格式为yyyy-MM-dd HH:mm:ss，startTs、endTs、ids不能全为空 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页码，从1开始 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页数量，如果不输入默认是1000，最大3000 默认值：1000 |
| ids | string | 否 | 否 | 按ID批量查询，多个逗号分隔，startTs、endTs、ids不能全为空 |
| accentity | string | 否 | 否 | 业务单元id |
| accentity_code | string | 否 | 否 | 业务单元code，不支持模糊查询 |
| isEnable | string | 否 | 否 | 是否启用1：启用；0：停用 |
| code | string | 否 | 否 | 编码 |
| name | string | 否 | 否 | 名称 |

## 3. 请求示例

Url: /yonbip/fi/bd/v1/querydata/expenseitemtype?access_token=访问令牌
Body: {
	"fields": "",
	"startTs": "",
	"endTs": "",
	"pageIndex": 0,
	"pageSize": 0,
	"ids": "",
	"accentity": "",
	"accentity_code": "",
	"isEnable": "",
	"code": "",
	"name": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 错误码 示例：200表示正常 |
| message | string | 否 | 错误提示 示例：请登录后操作！ |
| data | object | 是 | 查询结果 |
| code | string | 否 | code |
| name | string | 否 | name |
| remark | string | 否 | remark |
| isEnd | string | 否 | 是否末级 |
| level | string | 否 | 层级 |
| objid | string | 否 | 原费用项目类型ID（同步场景） |
| expenseitemtype | string | 否 | 上级费用项目类型类型ID |
| sort | string | 否 | 按数字排序 |
| accentity | string | 否 | 业务单元ID |
| accentity_code | string | 否 | 会计主体编码 |
| accentity_name | string | 否 | 会计主体名称 |

## 5. 正确返回示例

{
	"code": "200表示正常",
	"message": "请登录后操作！",
	"data": [
		{
			"code": "",
			"name": "",
			"remark": "",
			"isEnd": "",
			"level": "",
			"objid": "",
			"expenseitemtype": "",
			"sort": "",
			"accentity": "",
			"accentity_code": "",
			"accentity_name": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

900	请登录后操作！	重新登录

999	传入数据格式错误	检验入参格式，确保每个入参格式正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-02-03

更新

请求说明

新增

请求参数 (4)

更新

请求参数 (7)

新增

返回参数 (7)

更新

返回参数 (5)

删除

返回参数 id

删除

返回参数 enabled

删除

返回参数 expenseitemtype_name


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


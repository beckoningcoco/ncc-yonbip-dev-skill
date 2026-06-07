---
title: "成本中心类别删除"
apiId: "2306261253199757317"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Center Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Center Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本中心类别删除

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/CostCenterClass/CostCenterClass/iuap-apdoc-finbd/costcenterclass/bill/batchdelete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| serviceCode | string | query | 是 | 服务编码    示例: finbdcostcenterclass    默认值: finbdcostcenterclass |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 是 | billnum 示例：bd_costcenterclasslist 默认值：bd_costcenterclasslist |
| data | object | 是 | 是 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | id 示例：2236521910638739457 |

## 3. 请求示例

Url: /CostCenterClass/CostCenterClass/iuap-apdoc-finbd/costcenterclass/bill/batchdelete?access_token=访问令牌&serviceCode=finbdcostcenterclass
Body: {
	"billnum": "bd_costcenterclasslist",
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2236521910638739457"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | sucessCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | object | 否 | messages |
| infos | object | 否 | infos |
| failInfos | object | 否 | failInfos |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": {},
		"infos": {},
		"failInfos": {}
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


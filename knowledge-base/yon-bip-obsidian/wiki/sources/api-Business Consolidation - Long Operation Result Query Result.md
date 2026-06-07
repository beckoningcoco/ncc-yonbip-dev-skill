---
title: "合并报表-长操作结果查询结果"
apiId: "2011786810746208259"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-长操作结果查询结果

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/vouch/open/querylongaction

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| sysParamJson | object | 否 | 是 | 请求参数 |
| appcode | string | 否 | 是 | 业务节点编码 |
| busiParamJson | string | 否 | 是 | 请求参数，转义之后的 json 串，isclose：默认传 false，pk_cube：模型主键，processid：长操作接口返回的数据主键 示例：{\"isclose\":false,\"pk_cube\":\"\",\"processid\":\"\"} |

## 3. 请求示例

Url: /yonbip/qyjx/vouch/open/querylongaction?access_token=访问令牌
Body: {
	"sysParamJson": {
		"appcode": ""
	},
	"busiParamJson": "{\\\"isclose\\\":false,\\\"pk_cube\\\":\\\"\\\",\\\"processid\\\":\\\"\\\"}"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 否 | 文件 pk |
| type | string | 否 | 长操作完成状态 示例：success |
| result | object | 否 | 长操作返回结果 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"type": "success",
		"result": {
			"success": "success",
			"message": "导入成功 1 条数据!"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

更新

请求说明

更新

返回参数 code

更新

返回参数 data

更新

返回参数 result

删除

返回参数 success

2	2025-06-25

更新

请求参数 busiParamJson


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


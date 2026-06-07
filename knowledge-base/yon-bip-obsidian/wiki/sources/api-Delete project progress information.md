---
title: "项目进度信息删除"
apiId: "1957530378694033412"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Progress Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Progress Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目进度信息删除

> `ContentType	application/json` 请求方式	POST | 分类: Project Progress Information (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/fiercl/projectscheduleinfo/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量删除

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 数据 |
| id | string | 否 | 否 | 项目进度信息id（编码和id必输其一，同时输入id优先） 示例：1242343513123 |
| code | string | 否 | 否 | 项目进度信息编码（编码和id必输其一，同时输入id优先） 示例：RPSI20241010001342 |
| projectCode | string | 否 | 否 | 项目编码(编码和id必输其一，同时输入id优先) 示例：yy001 |
| projectId | string | 否 | 否 | 项目id(编码和id必输其一，同时输入id优先) 示例：1468336086076358677 |
| bustypeCode | string | 否 | 否 | 交易类型编码(编码和id必输其一，同时输入id优先) 示例：test_cost_schedule |
| bustype | string | 否 | 否 | 交易类型id(编码和id必输其一，同时输入id优先) 示例：1826026528772194308 |
| accentity | string | 否 | 否 | 会计主体id(编码和id必输其一，同时输入id优先) 示例：1783771334923255818 |
| accentityCode | string | 否 | 否 | 会计主体编码(编码和id必输其一，同时输入id优先) 示例：xmhs-RMB |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/projectscheduleinfo/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1242343513123",
			"code": "RPSI20241010001342",
			"projectCode": "yy001",
			"projectId": "1468336086076358677",
			"bustypeCode": "test_cost_schedule",
			"bustype": "1826026528772194308",
			"accentity": "1783771334923255818",
			"accentityCode": "xmhs-RMB"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 数据总条数 示例：2 |
| successCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：1 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 成功数据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "202302130001",
				"message": "删除失败"
			}
		],
		"infos": [
			{
				"sourceUnique": "",
				"message": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	无效的入参！	如果是新增，检查参照格式、参数编码是否正确；如果是删除，确认参照格式、参数编码是否正确，确认要删除数据是否已删除


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


---
title: "同步会计期间方案(来源没有季度、半年)"
apiId: "2307716379559067657"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fiscal Period Scheme"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fiscal Period Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 同步会计期间方案(来源没有季度、半年)

> `ContentType	application/json` 请求方式	POST | 分类: Fiscal Period Scheme (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/accperiodscheme/period/api/u8c/saveOrUpdate

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| serviceCode | string | query | 是 | 服务编码    示例: accperiodscheme    默认值: accperiodscheme |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 请求数据 |
| code | string | 否 | 是 | 期间方案编码 示例：u8c_code |
| name | string | 否 | 是 | 期间方案名称 示例：u8c_code |
| objid | string | 否 | 否 | 来源数据的id 示例：1 |

## 3. 请求示例

Url: /yonbip/FCC/accperiodscheme/period/api/u8c/saveOrUpdate?access_token=访问令牌&serviceCode=accperiodscheme
Body: {
	"data": [
		{
			"code": "u8c_code",
			"name": "u8c_code",
			"objid": "1"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功！ |
| data | object | 否 | 响应数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 同步总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 失败的提示信息 |
| infos | object | 是 | 同步的信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"data": {
					"code": "u8c_code",
					"name": {
						"zh_CN": "u8c_code"
					},
					"objid": "1",
					"periodClass": 1,
					"description": {
						"zh_CN": "u8c同步"
					},
					"stopstatus": false,
					"id": 2175745168462839816,
					"_status": "Update"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	新增期间方案接口异常


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


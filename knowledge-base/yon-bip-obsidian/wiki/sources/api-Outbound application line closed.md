---
title: "出库申请行关闭"
apiId: "2305073308204793863"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Issue Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Issue Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 出库申请行关闭

> `ContentType	application/json` 请求方式	POST | 分类: Issue Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/pickingrequisition/lineclose

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
| data | object | 是 | 是 | 出库申请[st.pickingrequisition.PickingRequisition] |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 是 | 出库申请主表id 示例：2295109473715879940 |
| requisitionDetail | object | 是 | 是 | 出库申请子表数据 |

## 3. 请求示例

Url: /yonbip/SCC/pickingrequisition/lineclose?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2295109473715879940,
			"requisitionDetail": [
				{
					"id": 2295109473715879941
				}
			]
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据信息 |
| count | number |
| 小数位数:0,最大长度:19 | 否 | 影响出库申请单据数量 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:19 | 否 | 关闭成功出库申请单据数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:19 | 否 | 关闭失败出库申请单据数量 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | string | 是 | 失败信息 示例：["操作失败"] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 1567153388103663600,
				"requisitionDetail": [
					{
						"id": 1567153388103663600
					}
				],
				"status": 1,
				"pubts": "2022-10-13 17:13:33"
			}
		],
		"failInfos": [
			"操作失败"
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据返回提示信息做相应处理

999	服务端逻辑异常	根据返回提示信息做相应处理


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


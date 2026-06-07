---
title: "计划运输路线详情查询"
apiId: "1504760518408142855"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Transportation Route"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Transportation Route]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划运输路线详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Planned Transportation Route (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/despatch/plantransportroute/query

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
| id | int | 否 | 否 | 计划运输路线id，code为空则id必填，id和code不能同时为空；若id和code都有值则按或的关系查询 示例：2622413696798976 |
| code | string | 否 | 否 | 计划运输路线code,id为空则code必填，id和code不能同时为空，若id和code同时有值则按或的关系查询 示例：111 |

## 3. 请求示例

Url: /yonbip/scm/despatch/plantransportroute/query?access_token=访问令牌
Body: {
	"id": 2622413696798976,
	"code": "111"
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
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 描述信息 示例：操作成功 |
| data | object | 是 | 返回数组 |
| code | string | 否 | 计划运输路线编码 示例：111 |
| isSegmentedTransport | boolean | 否 | 是否有分段运输，true：是，false：否 示例：true |
| specifyCarrier | boolean | 否 | 是否指定承运商，true：是，false：否 示例：true |
| modifier | string | 否 | 修改人名称 示例：赵建军 |
| creatorId | long | 否 | 创建人id 示例：2415794825482496 |
| modifierId | long | 否 | 修改人id 示例：2410295558082816 |
| sendTransWay | long | 否 | 发运方式id 示例：2351954147398426 |
| stoptime | string | 否 | 停用时间 示例：2022-03-22 15:38:31 |
| childs | object | 是 | 子表数组 |
| modifyTime | string | 否 | 修改时间 示例：2022-02-10 15:37:59 |
| isConsiderPlan | boolean | 否 | 是否考虑运输计划，true：是，false：否 示例：true |
| id | long | 否 | 计划运输路线id 示例：2622413696798976 |
| pubts | string | 否 | 时间戳 示例：2022-05-23 17:14:12 |
| stopstatus | boolean | 否 | 停用状态，true：停用，false：启用 示例：true |
| tenant | long | 否 | 租户 示例：2352473431068928 |
| planLeadTime | double | 否 | 运输计划提前期（天），精度1位小数 示例：1.5 |
| createDate | string | 否 | 创建日期 示例：2022-01-27 00:00:00 |
| creator | string | 否 | 创建人名称 示例：门浩 |
| modifyDate | string | 否 | 修改日期 示例：2022-02-10 00:00:00 |
| routeDistance | double | 否 | 整条路线总距离（公里）,精度1位小数 示例：10.5 |
| startPoint | string | 否 | 起始地名称 示例：2622414359482624 |
| endPoint | string | 否 | 目的地名称 示例：2622412786880768 |
| createTime | string | 否 | 创建时间 示例：2022-01-27 12:57:09 |
| routeDuration | double | 否 | 整条路线在途时长（天），精度1位小数 示例：3.1 |
| name | string | 否 | 计划路线名称 示例：1111 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "111",
			"isSegmentedTransport": true,
			"specifyCarrier": true,
			"modifier": "赵建军",
			"creatorId": 2415794825482496,
			"modifierId": 2410295558082816,
			"sendTransWay": 2351954147398426,
			"stoptime": "2022-03-22 15:38:31",
			"childs": [
				{
					"endPoint": 2622412786880768,
					"startPoint": 0,
					"isConsiderPlan": true,
					"specifyCarrier": true,
					"routeDistance": 1.5,
					"routeDuration": 1.1,
					"segmentNum": 1,
					"id": 2622413696798977,
					"sendTransWay": 2351954147398426,
					"mainId": 2622413696798976,
					"pubts": "2022-05-23 17:14:12",
					"tenant": 2352473431068928
				}
			],
			"modifyTime": "2022-02-10 15:37:59",
			"isConsiderPlan": true,
			"id": 2622413696798976,
			"pubts": "2022-05-23 17:14:12",
			"stopstatus": true,
			"tenant": 2352473431068928,
			"planLeadTime": 1.5,
			"createDate": "2022-01-27 00:00:00",
			"creator": "门浩",
			"modifyDate": "2022-02-10 00:00:00",
			"routeDistance": 10.5,
			"startPoint": "2622414359482624",
			"endPoint": "2622412786880768",
			"createTime": "2022-01-27 12:57:09",
			"routeDuration": 3.1,
			"name": "1111"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	服务器内部错误


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


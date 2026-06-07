---
title: "计划运输路线列表查询"
apiId: "1510158055341817859"
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

# 计划运输路线列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Planned Transportation Route (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/despatch/plantransportroute/list

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
| pageIndex | long | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页条数 示例：10 默认值：10 |
| code | string | 否 | 否 | 计划运输路线编码 示例：222 |
| name | string | 否 | 否 | 计划运输路线名称，支持模糊查询 示例：11 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件)，startPoint(起点名称)、endPoint(终点名称)、sendTransWay.id(发运方式id)、sendTransWay.code(发运方式编码)、 defaultCarrier.id(默认承运商id)、defaultCarrier.code(默认承运商编码)、specifyCarrier(是否指定承运商，true：是、false：否)、routeDistance(整条路线总距离（公里）)、 routeDuration(整条路线在途时长（天）)、isConsiderPlan(是否考虑运输计划,true:是、false：否)、planLeadTime(运输计划提前期（天）)、 isSegmentedTransport(是否有分段运输,true:是、false：否)、pubts(时间戳)等等 示例：startPoint |
| op | string | 否 | 否 | 判断条件(eq等于,neq不等于,lt小于,gt大于,elt小于等于,egt大于等于,between区间,in包含,nin不包含,like模糊匹配,leftlike左匹配,rightlike右匹配,is_null为空,is_not_null非空) ； 当sendTransWay.id(发运方式id)、sendTransWay.code(发运方式编码)、defaultCarrier.id(默认承运商id)、defaultCarrier.code(默认承运商编码)为空时不支持neq,is_null,is_not_null 示例：eq |
| value1 | string | 否 | 否 | 值1（条件） 示例：北京 |
| value2 | string | 否 | 否 | 值2(条件) 示例：666 |

## 3. 请求示例

Url: /yonbip/scm/despatch/plantransportroute/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "222",
	"name": "11",
	"simpleVOs": [
		{
			"field": "startPoint",
			"op": "eq",
			"value1": "北京",
			"value2": "666"
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
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页条数 示例：20 |
| recordCount | long | 否 | 总记录数 示例：2 |
| recordList | object | 是 | 返回结果列表 |
| pageCount | long | 否 | 页数 示例：1 |
| beginPageIndex | long | 否 | 查询开始页码 示例：1 |
| endPageIndex | long | 否 | 查询结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 2,
		"recordList": [
			{
				"creator": "赵建军",
				"code": "222",
				"isSegmentedTransport": true,
				"specifyCarrier": true,
				"routeDistance": 0,
				"modifier": "WLS",
				"startPoint": "222",
				"endPonit": "",
				"creatorId": 2410295558082816,
				"modifierId": 2466602082210048,
				"modifyTime": "2022-03-22 15:37:10",
				"isConsiderPlan": true,
				"createTime": "2022-02-11 17:36:38",
				"routeDuration": 0,
				"name": "222",
				"id": 2643922102882560,
				"stopstatus": false,
				"planLeadTime": 0
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
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


---
title: "固定资产盘点位置查询"
apiId: "fb210cbb09cb48808bc3deaa8b3fd41d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Assets"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Assets]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产盘点位置查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Assets (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/location/refc

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
| condition | object | 否 | 否 | 查询条件 |
| isExtend | boolean | 否 | 否 | 扩展条件，true：查询条件才会生效，false或者空：查询条件无效 |
| simpleVOs | object | 是 | 否 | 查询条件（该数组只能有一个对象） |

## 3. 请求示例

Url: /yonbip/fi/location/refc?access_token=访问令牌
Body: {
	"condition": {
		"isExtend": true,
		"simpleVOs": [
			{
				"field": "code",
				"op": "in",
				"value1": [
					"LOC21040001",
					"LOC21040002",
					"LOC21040003"
				]
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回2 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用完成时的返回信息 示例：返回成功 |
| data | object | 是 | 调用完成时的返回信息 |
| enablestate | long | 否 | 当前位置状态是否启用 1 停用 2 启用 示例：2 |
| creator | string | 否 | 当前的创建者 示例：1838579e-6b2a-40e0-8c36-9d64817ba53c |
| code | string | 否 | 单据编码 示例：LOC21040001 |
| level | long | 否 | 当前的层级 示例：1 |
| innercode | string | 否 | 内部代码标识（标记码） 示例：WRBU |
| dr | long | 否 | 是否删除标识 示例：0 |
| location_type | long | 否 | 类型 示例：1 |
| pk_org | string | 否 | 所属的组织 示例：2205104932540672 |
| path | string | 否 | 所属的节点 示例：WRBU |
| location_name | string | 否 | 位置名称 示例：雷峰塔下 |
| install_limit | long | 否 | 安装限制 示例：2 |
| location_code | string | 否 | 位置编码 示例：LOC21040001 |
| name | string | 否 | 位置名称 示例：雷峰塔下 |
| creationtime | string | 否 | 创建时间 示例：2021-04-29 11:24:21 |
| isEnd | boolean | 否 | 是否叶子节点 true为叶子节点 false为非叶子节点 示例：true |
| id | string | 否 | 位置ID 示例：2235869774516736 |
| pubts | string | 否 | 时间戳 示例：2021-04-29 11:24:21 |
| tenant | string | 否 | 租户 示例：0000KMFZEQPD32VJ2J0000 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "返回成功",
	"data": [
		{
			"enablestate": 2,
			"creator": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
			"code": "LOC21040001",
			"level": 1,
			"innercode": "WRBU",
			"dr": 0,
			"location_type": 1,
			"pk_org": "2205104932540672",
			"path": "WRBU",
			"location_name": "雷峰塔下",
			"install_limit": 2,
			"location_code": "LOC21040001",
			"name": "雷峰塔下",
			"creationtime": "2021-04-29 11:24:21",
			"isEnd": true,
			"id": "2235869774516736",
			"pubts": "2021-04-29 11:24:21",
			"tenant": "0000KMFZEQPD32VJ2J0000"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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


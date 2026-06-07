---
title: "组件与要素对照新增"
apiId: "2341982796849348608"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Component"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Component]
platform_version: "BIP"
source_type: community-api-docs
---

# 组件与要素对照新增

> `ContentType	application/json` 请求方式	POST | 分类: Cost Component (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/component/mapping/bill/save

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
| data | object | 否 | 否 | 数据 |
| id | string | 否 | 否 | id 示例：2341551564972883976 |
| code | string | 否 | 否 | 编码 示例：082101 |
| name | object | 否 | 否 | 名称 |
| componentStruct | string | 否 | 否 | 成本组件结构id 示例：1550237745135222790 |
| componentStruct_code | string | 否 | 否 | 成本组件结构编码 示例：zh01 |
| componentStruct_name | string | 否 | 否 | 成本组件结构 示例：zh01 |
| accSubjectRuler | string | 否 | 否 | 科目表id 示例：1527070519744528387 |
| accSubjectRuler_code | string | 否 | 否 | 科目表编码 示例：CS001 |
| accSubjectRuler_name | string | 否 | 否 | 科目表 示例：中台-测试组织 |
| creatorId_name | string | 否 | 否 | 创建人 示例：u8c_vip管理员 |
| createTime | string | 否 | 否 | 创建时间 示例：2025-08-22 00:07:59 |
| modifierId_name | string | 否 | 否 | 修改人 示例：u8c_vip管理员 |
| modifyTime | string | 否 | 否 | 修改时间 示例：2025-08-22 13:54:12 |
| accSubjectRuler_accentity | string | 否 | 否 | 科目表 示例：666666 |
| componentReferBodies | object | 是 | 否 | 组件与要素对照明细子表 |
| _status | string | 否 | 否 | _status 示例：Update |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/component/mapping/bill/save?access_token=访问令牌
Body: {
	"data": {
		"id": "2341551564972883976",
		"code": "082101",
		"name": {
			"zh_CN": "测试对照表2"
		},
		"componentStruct": "1550237745135222790",
		"componentStruct_code": "zh01",
		"componentStruct_name": "zh01",
		"accSubjectRuler": "1527070519744528387",
		"accSubjectRuler_code": "CS001",
		"accSubjectRuler_name": "中台-测试组织",
		"creatorId_name": "u8c_vip管理员",
		"createTime": "2025-08-22 00:07:59",
		"modifierId_name": "u8c_vip管理员",
		"modifyTime": "2025-08-22 13:54:12",
		"accSubjectRuler_accentity": "666666",
		"componentReferBodies": [
			{
				"costElement_name": "生产成本_直接人工费",
				"component": "1550108269057933314",
				"costElement": "1527070519744528543",
				"componentStructBody": "1550237745135222791",
				"component_name": "费用组件",
				"costElement_code": "500102",
				"header": "2341551564972883976",
				"component_code": "YRZH003",
				"id": "2341551564972883977",
				"pubts": "2025-08-22 00:07:59",
				"component_purpose": 6,
				"_status": "Unchanged"
			}
		],
		"_status": "Update"
	}
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
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | id 示例：2341551564972883976 |
| code | string | 否 | code 示例：082101 |
| name | object | 否 | name |
| componentStruct | string | 否 | 成本组件结构id 示例：1550237745135222790 |
| componentStruct_code | string | 否 | 成本组件结构编码 示例：zh01 |
| componentStruct_name | string | 否 | 成本组件结构 示例：zh01 |
| accSubjectRuler | string | 否 | 科目表id 示例：1527070519744528387 |
| accSubjectRuler_code | string | 否 | 科目表编码 示例：CS001 |
| accSubjectRuler_name | string | 否 | 科目表 示例：中台-测试组织 |
| creatorId_name | string | 否 | 创建人 示例：u8c_vip管理员 |
| createTime | string | 否 | 创建时间 示例：2025-08-22 00:07:59 |
| modifierId_name | string | 否 | 修改人 示例：u8c_vip管理员 |
| modifyTime | string | 否 | 修改时间 示例：2025-08-22 13:56:44 |
| accSubjectRuler_accentity | string | 否 | 会计主体 示例：666666 |
| componentReferBodies | object | 是 | 组件与要素对照明细 |
| modifier | string | 否 | modifier 示例：u8c_vip管理员 |
| modifierId | string | 否 | modifierId 示例：1525641755939569667 |
| modifyDate | string | 否 | modifyDate 示例：2025-08-22 13:56:44 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | tenant 示例：2909930715861584 |
| ytenant | string | 否 | ytenant 示例：0000L6YQ8AVLFUZPXD0000 |
| creatorId | string | 否 | 创建人 示例：1525641755939569667 |
| pubts | string | 否 | 时间戳 示例：2025-08-22 13:56:44 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2341551564972883976",
		"code": "082101",
		"name": {
			"zh_CN": "测试对照表2"
		},
		"componentStruct": "1550237745135222790",
		"componentStruct_code": "zh01",
		"componentStruct_name": "zh01",
		"accSubjectRuler": "1527070519744528387",
		"accSubjectRuler_code": "CS001",
		"accSubjectRuler_name": "中台-测试组织",
		"creatorId_name": "u8c_vip管理员",
		"createTime": "2025-08-22 00:07:59",
		"modifierId_name": "u8c_vip管理员",
		"modifyTime": "2025-08-22 13:56:44",
		"accSubjectRuler_accentity": "666666",
		"componentReferBodies": [
			{
				"costElement_name": "生产成本_直接人工费",
				"component": "1550108269057933314",
				"costElement": "1527070519744528543",
				"componentStructBody": "1550237745135222791",
				"component_name": "费用组件",
				"costElement_code": "500102",
				"header": "2341551564972883976",
				"component_code": "YRZH003",
				"id": "2341551564972883977",
				"component_purpose": 6,
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000"
			}
		],
		"modifier": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyDate": "2025-08-22 13:56:44",
		"tenant": 2909930715861584,
		"ytenant": "0000L6YQ8AVLFUZPXD0000",
		"creatorId": "1525641755939569667",
		"pubts": "2025-08-22 13:56:44"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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


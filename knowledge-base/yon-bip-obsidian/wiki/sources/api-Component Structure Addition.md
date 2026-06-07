---
title: "组件结构新增"
apiId: "2341807467711168513"
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

# 组件结构新增

> `ContentType	application/json` 请求方式	POST | 分类: Cost Component (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/component/struct/bill/save

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
| id | string | 否 | 否 | id 示例：2341547510523756546 |
| code | string | 否 | 否 | 编码 示例：082101 |
| name | object | 否 | 否 | 名称 |
| description | object | 否 | 否 | description |
| character | object | 否 | 否 | character |
| componentStructBodies | object | 是 | 否 | componentStructBodies |
| componentStructDies | object | 是 | 否 | componentStructDies |
| _status | string | 否 | 否 | _status 示例：Update |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/component/struct/bill/save?access_token=访问令牌
Body: {
	"data": {
		"id": "2341547510523756546",
		"code": "082101",
		"name": {
			"zh_CN": "测试结构2"
		},
		"description": {
			"zh_CN": "备注"
		},
		"character": {},
		"componentStructBodies": [
			{
				"component": "2287091079004553221",
				"blnDefault": true,
				"component_name": "zj1",
				"component_header": "1525643774565286108",
				"header": "2341547510523756546",
				"component_dataSource": 2,
				"component_code": "zj1",
				"id": "2341547510523756547",
				"component_header_name": "采购成本",
				"component_purpose": 0,
				"_status": "Insert"
			}
		],
		"componentStructDies": [
			{
				"stockOrg": "1525652227072458756",
				"accbook": "1529236686495547405",
				"stockOrg_code": "pkm00",
				"accentity": "1529219901776461825",
				"accentity_code": "*CHDC",
				"accPurpose": "1525643714430500871",
				"accbook_code": "*存货调出",
				"accbook_name": "*存货调出",
				"header": "2341547510523756546",
				"accPurpose_property": 1,
				"id": "2341547510523756548",
				"accPurpose_code": "01",
				"_status": "Update"
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
| id | string | 否 | id 示例：2341547510523756546 |
| code | string | 否 | code 示例：082101 |
| name | object | 否 | name |
| description | object | 否 | description |
| character | object | 否 | character |
| componentStructBodies | object | 是 | 组件结构明细子表 |
| componentStructDies | object | 是 | 组织分配子表 |
| modifier | string | 否 | 修改人 示例：u8c_vip管理员 |
| modifierId | string | 否 | 修改人id 示例：1525641755939569667 |
| modifyTime | string | 否 | 修改时间 示例：2025-08-22 08:18:29 |
| creatorId | string | 否 | 创建人 示例：1525641755939569667 |
| modifierId_name | string | 否 | 修改人 示例：u8c_vip管理员 |
| pubts | string | 否 | 时间戳 示例：2025-08-22 08:18:29 |
| creatorId_name | string | 否 | 创建人 示例：u8c_vip管理员 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2341547510523756546",
		"code": "082101",
		"name": {
			"zh_CN": "测试结构2"
		},
		"description": {
			"zh_CN": "备注"
		},
		"character": {
			"id": "2341804366747926530",
			"tenant": 2909930715861584,
			"ytenant": "0000L6YQ8AVLFUZPXD0000"
		},
		"componentStructBodies": [
			{
				"component": "2287091079004553221",
				"component_name": "zj1",
				"component_code": "zj1",
				"component_header": "1525643774565286108",
				"component_purpose": 0,
				"component_dataSource": 2,
				"header": "2341547510523756546",
				"id": "2341804366747926529",
				"component_header_name": "采购成本"
			}
		],
		"componentStructDies": [
			{
				"stockOrg": "1525652227072458756",
				"accbook": "1529236686495547405",
				"accbook_code": "*存货调出",
				"accbook_name": "*存货调出",
				"stockOrg_code": "pkm00",
				"accentity": "1529219901776461825",
				"accentity_code": "*CHDC",
				"accPurpose": "1525643714430500871",
				"header": "2341547510523756546",
				"accPurpose_property": 1,
				"id": "2341547510523756548",
				"accPurpose_code": "01"
			}
		],
		"modifier": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyTime": "2025-08-22 08:18:29",
		"creatorId": "1525641755939569667",
		"modifierId_name": "u8c_vip管理员",
		"pubts": "2025-08-22 08:18:29",
		"creatorId_name": "u8c_vip管理员"
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


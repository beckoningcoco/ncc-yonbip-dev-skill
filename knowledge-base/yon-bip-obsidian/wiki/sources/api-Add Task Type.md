---
title: "作业类型新增"
apiId: "2343613879421501443"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Resource"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Resource]
platform_version: "BIP"
source_type: community-api-docs
---

# 作业类型新增

> `ContentType	application/json` 请求方式	POST | 分类: Resource (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/iuap-apdoc-finbd/activity/bill/save

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
| billnum | string | 否 | 否 | 单据编码 示例：bd_activity 默认值：bd_activity |
| data | object | 否 | 否 | 数据 |
| id | string | 否 | 否 | id 示例：2343601260812828673 |
| code | string | 否 | 否 | 编码 示例：082101 |
| name | object | 否 | 否 | 名称 |
| orgUnit | string | 否 | 否 | 组织单元ID 示例：666666 |
| orgUnit_code | string | 否 | 否 | 组织单元编码 示例：global00 |
| orgUnit_name | string | 否 | 否 | 组织单元名称 示例：企业账号级 |
| activityClass | string | 否 | 否 | 资源类别 示例：2334638540207423508 |
| activityClass_code | string | 否 | 否 | 资源类别编码 示例：0 |
| activityClass_name | string | 否 | 否 | 资源类别名称 示例：人工 |
| measureBase | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 计量基础 示例：1 |
| unit | string | 否 | 否 | 计量单位ID 示例：1575242117041618951 |
| unit_code | string | 否 | 否 | 计量单位编码 示例：102402 |
| unit_name | string | 否 | 否 | 计量单位名称 示例：克数 |
| unit_precision | string | 否 | 否 | 计量单位精度 示例：2 |
| numUnit | string | 否 | 否 | 数量单位ID 示例：1525645209096421378 |
| numUnit_code | string | 否 | 否 | 数量单位编码 示例：HUR |
| numUnit_name | string | 否 | 否 | 数量单位名称 示例：小时 |
| numUnit_precision | string | 否 | 否 | 数量单位精度 示例：6 |
| num | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 数量 示例：1 |
| priceMultiple | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 价格倍数 示例：1 |
| pubts | string | 否 | 否 | 时间戳 示例：2025-08-24 18:26:10 |
| conversionFactor | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 折标系数 示例：1 |
| calCost | boolean | 否 | 否 | 计算成本 示例：true |
| declareOccasion | string | 否 | 否 | 申报时机 示例：Operation_Finish |
| activityStatus | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 状态 示例：1 |
| remark | object | 否 | 否 | 备注 |
| _status | string | 否 | 否 | 操作状态 示例：Update |

## 3. 请求示例

Url: /yonbip/FCC/iuap-apdoc-finbd/activity/bill/save?access_token=访问令牌
Body: {
	"billnum": "bd_activity",
	"data": {
		"id": "2343601260812828673",
		"code": "082101",
		"name": {
			"zh_CN": "api测试"
		},
		"orgUnit": "666666",
		"orgUnit_code": "global00",
		"orgUnit_name": "企业账号级",
		"activityClass": "2334638540207423508",
		"activityClass_code": "0",
		"activityClass_name": "人工",
		"measureBase": 1,
		"unit": "1575242117041618951",
		"unit_code": "102402",
		"unit_name": "克数",
		"unit_precision": "2",
		"numUnit": "1525645209096421378",
		"numUnit_code": "HUR",
		"numUnit_name": "小时",
		"numUnit_precision": "6",
		"num": 1,
		"priceMultiple": 1,
		"pubts": "2025-08-24 18:26:10",
		"conversionFactor": 1,
		"calCost": true,
		"declareOccasion": "Operation_Finish",
		"activityStatus": 1,
		"remark": {
			"zh_CN": "1111"
		},
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
| id | string | 否 | id 示例：2343601260812828673 |
| code | string | 否 | 资源编码 示例：082101 |
| name | object | 否 | 资源名称 |
| orgUnit | string | 否 | 组织单元ID 示例：666666 |
| orgUnit_code | string | 否 | 组织单元编码 示例：global00 |
| orgUnit_name | string | 否 | 组织单元 示例：企业账号级 |
| activityClass | string | 否 | 资源类别 示例：2334638540207423508 |
| activityClass_code | string | 否 | 资源类别编码 示例：0 |
| activityClass_name | string | 否 | 资源类别名称 示例：人工 |
| measureBase | number |
| 小数位数:0,最大长度:10 | 否 | 计量基础 示例：1 |
| unit | string | 否 | 计量单位ID 示例：1575242117041618951 |
| unit_code | string | 否 | 计量单位编码 示例：102402 |
| unit_name | string | 否 | 计量单位 示例：克数 |
| unit_precision | string | 否 | 计量单位精度 示例：2 |
| numUnit | string | 否 | 数量单位ID 示例：1525645209096421378 |
| numUnit_code | string | 否 | 数量单位编码 示例：HUR |
| numUnit_name | string | 否 | 数量单位 示例：小时 |
| numUnit_precision | string | 否 | 数量单位精度 示例：6 |
| num | number |
| 小数位数:0,最大长度:10 | 否 | 数量 示例：1 |
| priceMultiple | number |
| 小数位数:0,最大长度:10 | 否 | 价格倍数 示例：1 |
| conversionFactor | number |
| 小数位数:0,最大长度:10 | 否 | 折标系数 示例：1 |
| calCost | boolean | 否 | 计算成本 示例：true |
| declareOccasion | string | 否 | 申报时机 示例：Operation_Finish |
| activityStatus | number |
| 小数位数:0,最大长度:10 | 否 | 状态 示例：1 |
| remark | object | 否 | 备注 |
| modifier | string | 否 | 修改人 示例：u8c_vip管理员 |
| modifierId | string | 否 | 修改人id 示例：1525641755939569667 |
| modifyTime | string | 否 | 修改时间 示例：2025-08-24 21:42:02 |
| modifyDate | string | 否 | 修改日期 示例：2025-08-24 21:42:02 |
| pubts | string | 否 | 时间戳 示例：2025-08-24 21:42:02 |
| traceId | string | 否 | traceId 示例：1e8ab0ccd915e7ac |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2343601260812828673",
		"code": "082101",
		"name": {
			"zh_CN": "api测试1"
		},
		"orgUnit": "666666",
		"orgUnit_code": "global00",
		"orgUnit_name": "企业账号级",
		"activityClass": "2334638540207423508",
		"activityClass_code": "0",
		"activityClass_name": "人工",
		"measureBase": 1,
		"unit": "1575242117041618951",
		"unit_code": "102402",
		"unit_name": "克数",
		"unit_precision": "2",
		"numUnit": "1525645209096421378",
		"numUnit_code": "HUR",
		"numUnit_name": "小时",
		"numUnit_precision": "6",
		"num": 1,
		"priceMultiple": 1,
		"conversionFactor": 1,
		"calCost": true,
		"declareOccasion": "Operation_Finish",
		"activityStatus": 1,
		"remark": {
			"zh_CN": "1111"
		},
		"modifier": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyTime": "2025-08-24 21:42:02",
		"modifyDate": "2025-08-24 21:42:02",
		"pubts": "2025-08-24 21:42:02"
	},
	"traceId": "1e8ab0ccd915e7ac",
	"uploadable": "0"
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


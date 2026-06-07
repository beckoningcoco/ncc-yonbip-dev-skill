---
title: "管控范围新增"
apiId: "2339099843004727301"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Control Scope"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Control Scope]
platform_version: "BIP"
source_type: community-api-docs
---

# 管控范围新增

> `ContentType	application/json` 请求方式	POST | 分类: Control Scope (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/bill/save

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
| billnum | string | 否 | 否 | billnum 示例：bd_controlscope |
| data | object | 否 | 否 | data |
| accpurpose_name | string | 否 | 否 | accpurpose_name 示例：利润中心核算目的 |
| code | string | 否 | 否 | code 示例：apiTest |
| name | object | 否 | 否 | name |
| currency_name | string | 否 | 否 | currency_name 示例：人民币 |
| rate_class_name | string | 否 | 否 | rate_class_name 示例：基准利率-ding |
| converparam | string | 否 | 否 | converparam 示例：1 |
| accpurpose | string | 否 | 否 | accpurpose 示例：1525643714430500872 |
| currency | string | 否 | 否 | currency 示例：1525643705855773169 |
| rate_class | string | 否 | 否 | rate_class 示例：1679114604013158401 |
| accpurpose_property | number |
| 小数位数:0,最大长度:10 | 否 | 否 | accpurpose_property 示例：0 |
| accsubjectchart_name | string | 否 | 否 | accsubjectchart_name 示例：中台-测试组织 |
| accperiodscheme_name | string | 否 | 否 | accperiodscheme_name 示例：基准会计期间方案 |
| accountingMode | string | 否 | 否 | accountingMode 示例：opl |
| accsubjectchart | string | 否 | 否 | accsubjectchart 示例：1527070519744528387 |
| blnMultilevelAccounting | boolean | 否 | 否 | blnMultilevelAccounting 示例：false |
| accperiodscheme | string | 否 | 否 | accperiodscheme 示例：1525643714430500925 |
| controlScopeAccbodyMapping | object | 是 | 否 | controlScopeAccbodyMapping |
| _status | string | 否 | 否 | _status 示例：Insert |

## 3. 请求示例

Url: /yonbip/FCC/bill/save?access_token=访问令牌
Body: {
	"billnum": "bd_controlscope",
	"data": {
		"accpurpose_name": "利润中心核算目的",
		"code": "apiTest",
		"name": {
			"zh_CN": "api测试"
		},
		"currency_name": "人民币",
		"rate_class_name": "基准利率-ding",
		"converparam": "1",
		"accpurpose": "1525643714430500872",
		"currency": "1525643705855773169",
		"rate_class": "1679114604013158401",
		"accpurpose_property": 0,
		"accsubjectchart_name": "中台-测试组织",
		"accperiodscheme_name": "基准会计期间方案",
		"accountingMode": "opl",
		"accsubjectchart": "1527070519744528387",
		"blnMultilevelAccounting": false,
		"accperiodscheme": "1525643714430500925",
		"controlScopeAccbodyMapping": [
			{
				"accbody_name": "lrf业务单元1",
				"accbody": "2338903142102990855",
				"accbody_code": "lrf1",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
| accpurpose_name | string | 否 | accpurpose_name 示例：利润中心核算目的 |
| code | string | 否 | code 示例：责任会计管控范围 |
| name | object | 否 | name |
| currency_name | string | 否 | currency_name 示例：人民币 |
| rate_class_name | string | 否 | rate_class_name 示例：基准汇率 |
| converparam | string | 否 | converparam 示例：1 |
| accpurpose | string | 否 | accpurpose 示例：1525643714430500872 |
| currency | string | 否 | currency 示例：1525643705855773169 |
| rate_class | string | 否 | rate_class 示例：0000L6YQ8AVLFUZPXD0000 |
| id | string | 否 | id 示例：1528679182566948867 |
| stopstatus | boolean | 否 | stopstatus 示例：false |
| accpurpose_property | string | 否 | accpurpose_property 示例：0 |
| accsubjectchart_name | string | 否 | accsubjectchart_name 示例：中台-测试组织 |
| accperiodscheme_name | string | 否 | accperiodscheme_name 示例：基准会计期间方案 |
| accountingMode | string | 否 | accountingMode 示例：opl |
| accsubjectchart | string | 否 | accsubjectchart 示例：1527070519744528387 |
| blnMultilevelAccounting | boolean | 否 | blnMultilevelAccounting 示例：true |
| accperiodscheme | string | 否 | accperiodscheme 示例：1525643714430500925 |
| modifierId_name | string | 否 | modifierId_name 示例：u8c_vip管理员 |
| modifyTime | string | 否 | modifyTime 示例：2025-08-18 16:43:57 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| modifier | string | 否 | modifier 示例：u8c_vip管理员 |
| modifierId | string | 否 | modifierId 示例：1525641755939569667 |
| modifyDate | string | 否 | modifyDate 示例：2025-08-18 16:43:57 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | tenant 示例：2909930715861584 |
| ytenant | string | 否 | ytenant 示例：0000L6YQ8AVLFUZPXD0000 |
| pubts | string | 否 | pubts 示例：2025-08-18 16:43:57 |
| traceId | string | 否 | traceId 示例：de273083e814aec9 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accpurpose_name": "利润中心核算目的",
		"code": "责任会计管控范围",
		"name": {
			"zh_CN": "责任会计管控范围"
		},
		"currency_name": "人民币",
		"rate_class_name": "基准汇率",
		"converparam": "1",
		"accpurpose": "1525643714430500872",
		"currency": "1525643705855773169",
		"rate_class": "0000L6YQ8AVLFUZPXD0000",
		"id": "1528679182566948867",
		"stopstatus": false,
		"accpurpose_property": "0",
		"accsubjectchart_name": "中台-测试组织",
		"accperiodscheme_name": "基准会计期间方案",
		"accountingMode": "opl",
		"accsubjectchart": "1527070519744528387",
		"blnMultilevelAccounting": true,
		"accperiodscheme": "1525643714430500925",
		"modifierId_name": "u8c_vip管理员",
		"modifyTime": "2025-08-18 16:43:57",
		"resubmitCheckKey": "bd_controlscope_edit_e9f47887-28de-4c3e-9726-621eaa073bfb",
		"modifier": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyDate": "2025-08-18 16:43:57",
		"tenant": 2909930715861584,
		"ytenant": "0000L6YQ8AVLFUZPXD0000",
		"pubts": "2025-08-18 16:43:57"
	},
	"traceId": "de273083e814aec9",
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


---
title: "账簿批量保存"
apiId: "2313995312481959942"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Book"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Book]
platform_version: "BIP"
source_type: community-api-docs
---

# 账簿批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Account Book (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/accbook/bill/save

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
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 否 | 单据编码 示例：fiepub_accountbookcard 默认值：fiepub_accountbookcard |
| data | object | 是 | 否 | 请求数据 |
| accpurpose | string | 否 | 否 | 核算目的id 示例：1525643714430500871 |
| accpurpose_code | string | 否 | 否 | 核算目的编码 示例：法人核算目的 |
| accentity | string | 否 | 否 | 会计主体id 示例：1811332586637623306 |
| accentity_code | string | 否 | 否 | 会计主体编码 示例：*ASAP |
| accountbooktype | string | 否 | 否 | 账簿类型id 示例：2310822336598638600 |
| accountbooktype_code | string | 否 | 否 | 账簿类型编码 示例：openApi |
| code | string | 否 | 否 | 编码 示例：0100 |
| name | object | 否 | 否 | 名称 |
| shortname | object | 否 | 否 | 简称 |
| accountingclassifi | string | 否 | 否 | 账簿分类 示例：1 |
| description | string | 否 | 否 | 描述 |
| sortnum | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 排序码 |
| accsubjectchart | string | 否 | 否 | 科目表id 示例：1527070519744528387 |
| accsubjectchart_code | string | 否 | 否 | 科目表编码 示例：中台-测试组织 |
| currency_code | string | 否 | 否 | 币种编码 示例：CNY |
| currency | string | 否 | 否 | 币种id 示例：1525643705855773169 |
| accperiodscheme | string | 否 | 否 | 期间方案id 示例：1525643714430500925 |
| accperiodscheme_code | string | 否 | 否 | 期间方案编码 示例：基准会计期间方案 |
| accstandard | string | 否 | 否 | 会计准则id 示例：1525643757385416705 |
| accstandard_code | string | 否 | 否 | 会计准则编码 示例：企业会计准则 |
| cashflowtype | string | 否 | 否 | 现金流量类型id 示例：2221817205422555136 |
| cashflowtype_code | string | 否 | 否 | 现金流量类型编码 示例：A3131 |
| currencyreducedparam | string | 否 | 否 | 币种折算参数 示例：1 |
| profitlossratetype | string | 否 | 否 | 汇兑损益汇率类型id 示例：1679114604013158401 |
| profitlossratetype_code | string | 否 | 否 | 汇兑损益汇率类型编码 |
| ratetype | string | 否 | 否 | 汇率类型id 示例：1622112622696464389 |
| ratetype_code | string | 否 | 否 | 汇率类型编码 示例：2222 |
| secondaryvoucher | boolean | 否 | 否 | 辅凭证 示例：false |
| accountBookGL | object | 是 | 否 | 总账子表 |
| accountBookRA | object | 是 | 否 | 责任会计子表 |
| accountBookIA | object | 是 | 否 | 存货核算子表 |
| accountBookAR | object | 是 | 否 | 应收管理子表 |
| accountBookAP | object | 是 | 否 | 应付管理子表 |
| accountBookFA | object | 是 | 否 | 固定资产子表 |
| accountBookCM | object | 是 | 否 | 现金管理子表 |
| accountBookCC | object | 是 | 否 | 成本中心子表 |
| accountBookPCM | object | 是 | 否 | 产品成本子表 |
| accountBookSC | object | 是 | 否 | 专项成本子表 |
| accountBookCE | object | 是 | 否 | 成本估算子表 |
| accountBookRVN | object | 是 | 否 | 收入管理子表 |
| svcregistration | object | 是 | 否 | 账簿服务注册 |
| accountBookIS | object | 是 | 否 | 内部结算子表 |
| accountBookPRC | object | 是 | 否 | 项目成本子表 |
| _status | string | 否 | 否 | 操作状态 示例：Insert |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| objid | string | 否 | 否 | 来源系统的唯一主键值 示例：11111 |
| key | string | 否 | 否 | 来源系统的唯一主键字段名称 示例：objid 默认值：objid |

## 3. 请求示例

Url: /yonbip/FCC/accbook/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_accountbookcard",
	"data": [
		{
			"accpurpose": "1525643714430500871",
			"accpurpose_code": "法人核算目的",
			"accentity": "1811332586637623306",
			"accentity_code": "*ASAP",
			"accountbooktype": "2310822336598638600",
			"accountbooktype_code": "openApi",
			"code": "0100",
			"name": {
				"zh_CN": "0100",
				"en_US": "",
				"zh_TW": ""
			},
			"shortname": {
				"zh_CN": "简称",
				"en_US": "",
				"zh_TW": ""
			},
			"accountingclassifi": "1",
			"description": "",
			"sortnum": 0,
			"accsubjectchart": "1527070519744528387",
			"accsubjectchart_code": "中台-测试组织",
			"currency_code": "CNY",
			"currency": "1525643705855773169",
			"accperiodscheme": "1525643714430500925",
			"accperiodscheme_code": "基准会计期间方案",
			"accstandard": "1525643757385416705",
			"accstandard_code": "企业会计准则",
			"cashflowtype": "2221817205422555136",
			"cashflowtype_code": "A3131",
			"currencyreducedparam": "1",
			"profitlossratetype": "1679114604013158401",
			"profitlossratetype_code": "",
			"ratetype": "1622112622696464389",
			"ratetype_code": "2222",
			"secondaryvoucher": false,
			"accountBookGL": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookRA": [
				{
					"enabled": "2",
					"startperiodid": "",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookIA": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookAR": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookAP": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookFA": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookCM": [
				{
					"enabled": "2",
					"_status": "Insert",
					"startperiodid": ""
				}
			],
			"accountBookCC": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookPCM": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookSC": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookCE": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookRVN": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"svcregistration": [
				{
					"svsid_name": "61",
					"svsid": "1879076160827031553",
					"enabled": "2",
					"_status": "Insert"
				}
			],
			"accountBookIS": [
				{
					"enabled": "2",
					"startperiodid": "",
					"id": "",
					"_status": "Insert"
				}
			],
			"accountBookPRC": [
				{
					"enabled": "2",
					"startperiodid": "1563488724293517322",
					"id": "",
					"_status": "Insert"
				}
			],
			"_status": "Insert",
			"resubmitCheckKey": "fiepub_accountbookcard_add_758ffc12-7f50-4a37-aa92-90b83012f8fc",
			"objid": "11111"
		}
	],
	"key": "objid"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败调试 示例：0 |
| messages | string | 是 | 提示信息 |
| infos | object | 是 | 明细数据 |
| failInfos | string | 是 | 失败提示信息 |

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
				"accpurpose_code": "01",
				"accentity": "2314426295264477190",
				"accentity_code": "zh01",
				"accountbooktype": "2314608530746245121",
				"accountbooktype_code": "zh01",
				"code": "ts00003",
				"name": {
					"zh_CN": "YS测测3",
					"en_US": "",
					"zh_TW": ""
				},
				"shortname": {
					"zh_CN": "YS测测3",
					"en_US": "",
					"zh_TW": ""
				},
				"accountingclassifi": "2",
				"description": "",
				"sortnum": 0,
				"accsubjectchart": "2314607749062197254",
				"accsubjectchart_code": "zh01",
				"currency_code": "CNY",
				"currency": "1649462390317645827",
				"accperiodscheme": "1525696894715559940",
				"accperiodscheme_code": "0001",
				"accstandard": "1525696740101980431",
				"accstandard_code": "01",
				"currencyreducedparam": "1",
				"profitlossratetype": "3333643872391424",
				"profitlossratetype_code": "zgzhang03-1",
				"ratetype": "3333643872391424",
				"ratetype_code": "zgzhang03-1",
				"id": "2314612550835634179",
				"issecond": false,
				"status": "2",
				"objid": "1111"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-12

更新

请求说明

新增

请求参数 sortnum

更新

请求参数 description

更新

请求参数 profitlossratetype_code

更新

请求参数 startperiodid

删除

请求参数 zh_CN

删除

请求参数 en_US

删除

请求参数 zh_TW

新增

返回参数 sortnum

更新

返回参数 (5)

删除

返回参数 zh_CN

删除

返回参数 en_US

删除

返回参数 zh_TW


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


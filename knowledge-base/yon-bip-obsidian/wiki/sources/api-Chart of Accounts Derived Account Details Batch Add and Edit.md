---
title: "科目表派生科目明细批量新增编辑"
apiId: "2145426427582349314"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Chart of Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Chart of Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目表派生科目明细批量新增编辑

> `ContentType	application/json` 请求方式	POST | 分类: Chart of Accounts (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/openapi/subjectchartcontrol/range/saveorupdate

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| data | object | 是 | 是 | 科目表派生科目明细参数集合 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 是 | 科目编码 示例：1001 |
| name | object | 否 | 是 | 科目名称 |
| accsubjectchart_objid | string | 否 | 是 | 科目所属科目表objid（长度不超36位） 示例：chartCtrlApi-01 |
| objid | string | 否 | 是 | 科目外部同步数据objid（长度不超36位） 示例：1001 |
| sourceUnique | string | 否 | 是 | 来源数据唯一标识（=objid） 示例：1001 |
| deficitcheckstrategy | string | 否 | 否 | 余额赤字检查。Error：错误；NoCheck：不检查；Warning：警告。 示例：NoCheck 默认值：NoCheck |
| cashcategory | string | 否 | 否 | 现金分类。Bank：银行；Cash：现金；CashEquivalent：现金等价物；Other：其他。 示例：Other 默认值：Other |
| settlementmode | boolean | 否 | 否 | 结算方式。现金分类为银行时可传值 示例：false 默认值：false |
| billtime | boolean | 否 | 否 | 票据日期。现金分类为银行时可传值 示例：false 默认值：false |
| billno | boolean | 否 | 否 | 票据号。现金分类为银行时可传值 示例：false 默认值：false |
| bankverifycode | boolean | 否 | 否 | 银行对账码。现金分类为银行时可传值 示例：false 默认值：false |
| bnumcheck | boolean | 否 | 否 | 数量核算 示例：false 默认值：false |
| measuredoc_code | string | 否 | 否 | 默认计量单位编码。数量核算=true，默认计量单位必填 示例：EA |
| hasnum | boolean | 否 | 否 | 数量必填 示例：false 默认值：false |
| currency_code | string | 否 | 否 | 币种简称（编码） 示例：CNY |
| isrevaluation | boolean | 否 | 否 | 汇兑损益 示例：false 默认值：false |
| exchangerate_code | string | 否 | 否 | 汇兑损益对方科目编码。汇兑损益=true，汇兑损益对方科目编码必填 |
| enabled | boolean | 否 | 否 | 状态 示例：true 默认值：true |
| baccrualcontrol | boolean | 否 | 否 | 发生额方向控制 示例：false 默认值：false |
| glbalance | string | 否 | 否 | 总账账簿余额双向显示。1：按原币作为基准；2：按本币作为基准 示例：1 |
| blnVerify | boolean | 否 | 否 | 往来科目 示例：false 默认值：false |
| country_code | string | 否 | 否 | 国家/地区编码 示例：CN |
| description | object | 否 | 否 | 科目说明 |
| parentObjid | string | 否 | 否 | 所属父级科目objid |
| bodies | object | 是 | 否 | 辅助核算项子表集合 |

## 3. 请求示例

Url: /yonbip/AMP/openapi/subjectchartcontrol/range/saveorupdate?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"code": "1001",
			"name": {
				"zh_CN": "库存现金"
			},
			"accsubjectchart_objid": "chartCtrlApi-01",
			"objid": "1001",
			"sourceUnique": "1001",
			"deficitcheckstrategy": "NoCheck",
			"cashcategory": "Other",
			"settlementmode": false,
			"billtime": false,
			"billno": false,
			"bankverifycode": false,
			"bnumcheck": false,
			"measuredoc_code": "EA",
			"hasnum": false,
			"currency_code": "CNY",
			"isrevaluation": false,
			"exchangerate_code": "",
			"enabled": true,
			"baccrualcontrol": false,
			"glbalance": "1",
			"blnVerify": false,
			"country_code": "CN",
			"description": {
				"zh_CN": ""
			},
			"parentObjid": "",
			"bodies": [
				{
					"vrs": "vr1",
					"ballowempty": false,
					"allownonleaf": true,
					"summaryprint": false,
					"balancedireccontrol": false
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 返回数据结果 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 操作总数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 操作成功数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 操作失败数 示例：1 |
| infos | object | 是 | 操作成功数据信息集合。没有成功数据返回空集合 |
| messages | object | 是 | 操作失败数据信息集合。没有失败数据返回空集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"infos": [
			{
				"data": {
					"id": "2145231667886292997",
					"code": "1001",
					"name": {
						"zh_CN": "库存现金"
					},
					"accsubjectchart": "2144789595501363212",
					"parentchart": "2144486808892735488",
					"objid": "1001",
					"sourceUnique": "1001",
					"targetUnique": "2145231667886292997"
				}
			}
		],
		"messages": [
			{
				"code": "1002",
				"name": {
					"zh_CN": "存款"
				},
				"accsubjectchart_objid": "testError",
				"objid": "1002",
				"sourceUnique": "1002",
				"message": "根据会计科目所属科目表的objid没有查到科目表数据！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	科目所属科目表objid不能为空！	科目必须有对应的科目表，科目表objid必须是真实存在的数据！


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


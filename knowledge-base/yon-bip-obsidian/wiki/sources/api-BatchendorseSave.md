---
title: "背书批量办理保存"
apiId: "2516421072510779398"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Batch Endorsement Processing"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Batch Endorsement Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 背书批量办理保存

> `ContentType	application/json` 请求方式	POST | 分类: Batch Endorsement Processing (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/api/batchendorse/save

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
| accentity | string | 否 | 是 | 资金组织 示例：示例: 110 |
| vouchdate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据日期 示例: 2026-04-20 |
| code | string | 否 | 否 | 单据编号(以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输) 示例: endore260326006454 |
| bustype | string | 否 | 否 | 交易类型id，或交易类型编码code，默认为系统预置的背书批量办理，示例：batchendorse |
| endorseeType | string | 否 | 是 | 被背书方 枚举：客户、供应商、资金伙伴、内部单位、其他 客户：1 供应商：2 其他：3 内部单位：4 资金伙伴：5 |
| endorsee | string | 否 | 否 | 被背书人 对方类型为客户、供应商、资金业务对象、内部单位，上送对应类型的档案id或code；对方类型为内部单位时，上送会计主体档案id或code；对方类型为其他时，上送被背书人名称 |
| endorseeBankacc | string | 否 | 否 | 被背书人账号 |
| endorseeAccName | string | 否 | 否 | 被背书人账号名称 |
| endorseebankId | string | 否 | 否 | 被背书人类型为其他时，必填，填写开户行名称；示例：中国银行西安东门里支行；对方类型为客户、供应商、资金业务对象、内部单位，不填写，根据所选的银行账号自动带出 |
| businessOrgId | string | 否 | 否 | 业务单元id，或业务单元编码code 示例: 110 |
| deptId | string | 否 | 否 | 部门id,或部门编码code |
| operatorId | string | 否 | 否 | 员工id，或员工编码code |
| expenseItemId | string | 否 | 否 | 费用项目id，或费用项目编码code |
| projectId | string | 否 | 否 | 项目id，或项目编码code |
| remarks | string | 否 | 否 | 备注 |
| batchEndorseDetail | object | 是 | 否 | 批量背书明细 |
| noteinfoId | string | 否 | 是 | 票据（包）号档案id，或票据（包）号 示例：503905649281520260326488727100 |
| noteinfoRange | string | 否 | 否 | 票据区间 票据号区间，票据号+子票区间作为唯一性判断标准，在一张票据有多个票段存储时，需用此字段判定唯一 示例：1-10000 |
| endorseAmount | number |
| 小数位数:2,最大长度:20 | 否 | 是 | 背书金额 示例：1000 |
| identificationCode | string | 否 | 否 | 财资统一对账码 |
| settlemode | string | 否 | 否 | 结算方式 id，或结算方式编码 示例：system_0001 |
| transBillno | string | 否 | 否 | 交易单号 |
| handledSupplement | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 是否已办理补单，是为1，否为0 |
| elec | boolean | 否 | 是 | 是否直联，是为1，否为0 |
| billRangeStart | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 子票区间开始，示例：1 |
| billRangeEnd | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 子票区间结束，示例：1000 |
| transferable | boolean | 否 | 是 | 是否可转让，是为1，否为0 |
| endorseeType | string | 否 | 是 | 被背书方 枚举：客户、供应商、资金伙伴、内部单位、其他 客户：1 供应商：2 其他：3 内部单位：4 资金伙伴：5 |
| endorsee | string | 否 | 是 | 被背书人 对方类型为客户、供应商、资金业务对象、内部单位，上送对应类型的档案id或code；对方类型为内部单位时，上送会计主体档案id或code；对方类型为其他时，上送被背书人名称 |
| endorseebankacc | string | 否 | 否 | 被背书人银行账号 如果对方类型为客户、供应商、资金业务对象、内部单位，上送对应类型档案的银行账号档案id或银行账号； 对方类型为内部单位时，对方银行信息id为企业银行账户档案id或银行账号编码或银行账号； 直联业务时必输； 示例: 4000021119201298365 |
| endorseeAccName | string | 否 | 否 | 被背书人账号名称 |
| endorseebankId | string | 否 | 否 | 被背书人开户行 被背书人类型为其他时，必填，填写开户行名称；示例：中国银行西安东门里支行；对方类型为客户、供应商、资金业务对象、内部单位，不填写，根据所选的银行账号自动带出 直联业务时必输； |
| endorsementStatus | string | 否 | 否 | 背书状态 |
| endorsementSuccDate | string | 否 | 否 | 背书成功日期 |
| instructStatus | string | 否 | 否 | 指令状态 |
| withdrawinstructStatus | string | 否 | 否 | 撤销指令状态 |
| sameEndore | boolean | 否 | 否 | 相同背书 |
| projectId | string | 否 | 否 | 项目 id，或项目编码code |
| sameType | string | 否 | 否 | 同名背书类型 |
| businessOrgId | string | 否 | 否 | 业务单元 id，或业务单元编码code 示例: 110 |
| deptId | string | 否 | 否 | 部门 id,或部门编码code |
| operatorId | string | 否 | 否 | 员工 id，或员工编码code |
| expenseItemId | string | 否 | 否 | 费用项目 id，或费用项目编码code |

## 3. 请求示例

Url: /yonbip/FCC/api/batchendorse/save?access_token=访问令牌
Body: {
	"accentity": "示例: 110",
	"vouchdate": "2026-06-07",
	"code": "",
	"bustype": "",
	"endorseeType": "",
	"endorsee": "",
	"endorseeBankacc": "",
	"endorseeAccName": "",
	"endorseebankId": "",
	"businessOrgId": "",
	"deptId": "",
	"operatorId": "",
	"expenseItemId": "",
	"projectId": "",
	"remarks": "",
	"batchEndorseDetail": [
		{
			"noteinfoId": "",
			"noteinfoRange": "",
			"endorseAmount": 0,
			"identificationCode": "",
			"settlemode": "",
			"transBillno": "",
			"handledSupplement": 0,
			"elec": true,
			"billRangeStart": 0,
			"billRangeEnd": 0,
			"transferable": true,
			"endorseeType": "",
			"endorsee": "",
			"endorseebankacc": "",
			"endorseeAccName": "",
			"endorseebankId": "",
			"endorsementStatus": "",
			"endorsementSuccDate": "",
			"instructStatus": "",
			"withdrawinstructStatus": "",
			"sameEndore": true,
			"projectId": "",
			"sameType": "",
			"businessOrgId": "",
			"deptId": "",
			"operatorId": "",
			"expenseItemId": ""
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
| accentity | string | 否 | 资金组织 示例：pkm00 |
| code | string | 否 | 单据编码 示例：000028 |
| vouchdate | string | 否 | 单据日期 示例：2026-04-22 |
| endorseeType | string | 否 | 被背书方 示例：3 |
| endorsee | string | 否 | 被背书人-文本 示例：00000000012335 |
| endorseeBankacc | string | 否 | 被背书人账号-文本 示例：996 |
| endorseeAccName | string | 否 | 被背书人账户名称 示例：996名称 |
| endorseebankId | string | 否 | 被背书人开户行 示例：北清路支行-1 |
| remarks | string | 否 | 备注 示例：接口测试 |
| batchEndorseDetail | object | 是 | 批量背书明细 |
| noteinfoId | string | 否 | 票据号 示例：555556666644444111112222200001 |
| billRangeStart | number |
| 小数位数:0,最大长度:10 | 否 | 子票区间开始 示例：1 |
| billRangeEnd | number |
| 小数位数:0,最大长度:10 | 否 | 子票区间终止 示例：55500 |
| endorseAmount | number |
| 小数位数:0,最大长度:10 | 否 | 背书金额 示例：555 |
| handledSupplement | number |
| 小数位数:0,最大长度:10 | 否 | 已办理补单 示例：1 |
| elec | boolean | 否 | 银企联电票 示例：false |
| transferable | boolean | 否 | 可转让 示例：true |
| endorseeType | string | 否 | 被背书方 示例：3 |
| endorsee | string | 否 | 被背书人-文本 示例：00000000012335 |
| endorseeBankacc | string | 否 | 被背书人账号-文本 示例：996 |
| endorseeAccName | string | 否 | 被背书人账户名称 示例：996名称 |
| endorseebankId | string | 否 | 被背书人开户行 示例：北清路支行-1 |
| projectId | string | 否 | 项目 示例：FF000082 |
| expenseItemId | string | 否 | 费用项目 示例：1975377625555664900 |
| businessOrgId | string | 否 | 业务组织 示例：1525652227072458756 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"accentity": "pkm00",
		"code": "000028",
		"vouchdate": "2026-04-22",
		"endorseeType": "3",
		"endorsee": "00000000012335",
		"endorseeBankacc": "996",
		"endorseeAccName": "996名称",
		"endorseebankId": "北清路支行-1",
		"remarks": "接口测试",
		"batchEndorseDetail": [
			{
				"noteinfoId": "555556666644444111112222200001",
				"billRangeStart": 1,
				"billRangeEnd": 55500,
				"endorseAmount": 555,
				"handledSupplement": 1,
				"elec": false,
				"transferable": true,
				"endorseeType": "3",
				"endorsee": "00000000012335",
				"endorseeBankacc": "996",
				"endorseeAccName": "996名称",
				"endorseebankId": "北清路支行-1",
				"projectId": "FF000082",
				"expenseItemId": "1975377625555664900",
				"businessOrgId": "1525652227072458756"
			}
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


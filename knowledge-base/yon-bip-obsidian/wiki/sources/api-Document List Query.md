---
title: "单据列表查询"
apiId: "aede36a84e1847368eb6f0de455ec306"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# 单据列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/billmanage/list

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
| billnum | string | 否 | 是 | 单据类型(znbzbx_billmanage_busistriplist:出差申请类;znbzbx_billmanage_applylist:通用申请类;znbzbx_billmanage_travellist:差旅报销类;znbzbx_billmanage_explist:通用报销类;znbzbx_billmanage_loanlist:借款类;znbzbx_billmanage_prepaylist:预付类;znbzbx_billmanage_holdlist:预提类;znbzbx_billmanage_deferlist:摊销类;znbzbx_billmanage_returnlist:还款类;znbzbx_billmanage_refundlist:退款类) 示例：znbzbx_billmanage_applylist |
| pageSize | long | 否 | 是 | 每页行数 示例：20 |
| pageIndex | long | 否 | 是 | 页号 示例：1 |
| code | string | 否 | 否 | 单据编号 示例：PLNS211201000001 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期起始日期(格式：yyyy-MM-dd) 示例：2021-11-01 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束日期(格式：yyyy-MM-dd) 示例：2021-12-01 |
| status | long | 否 | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0 |
| vreason | string | 否 | 否 | 单据事由 示例：测试 |
| cfinaceorg | long | 否 | 否 | 费用承担组织id 示例：1961970750984448 |
| vfinacedeptid | long | 否 | 否 | 费用承担部门id 示例：1961982461595904 |
| pk_handlepsn | long | 否 | 否 | 经办人id 示例：2302283524903168 |
| pk_busimemo | long | 否 | 否 | 费用项目id 示例：2053639131142400 |
| pk_project | long | 否 | 否 | 项目id 示例：2268373053853952 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |
| field | string | 否 | 否 | 字段(pubts:时间戳;caccountorg:会计主体id;caccountorg.code:会计主体编码;cfinaceorg.code:费用承担组织编码;vfinacedeptid.code:费用承担部门编码;pk_project.code:项目编码;pk_handlepsn.code:经办人编码;pk_busimemo.code:费用项目编码;pk_billtype:单据类型(见接口描述)) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2021-07-31 23:59:59 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/billmanage/list?access_token=访问令牌
Body: {
	"billnum": "znbzbx_billmanage_applylist",
	"pageSize": 20,
	"pageIndex": 1,
	"code": "PLNS211201000001",
	"open_vouchdate_begin": "2021-11-01",
	"open_vouchdate_end": "2021-12-01",
	"status": 0,
	"vreason": "测试",
	"cfinaceorg": 1961970750984448,
	"vfinacedeptid": 1961982461595904,
	"pk_handlepsn": 2302283524903168,
	"pk_busimemo": 2053639131142400,
	"pk_project": 2268373053853952,
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2021-07-01 00:00:00",
			"value2": "2021-07-31 23:59:59"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | int | 否 | 页码 示例：1 |
| pageSize | int | 否 | 单页数量 示例：1 |
| recordCount | int | 否 | 单据总数 示例：1211 |
| recordList | object | 是 | 单据列表 |
| sumRecordList | object | 是 | 单据合计 |
| pageCount | int | 否 | 总页数 示例：1211 |
| beginPageIndex | int | 否 | 起始页码 示例：2 |
| endPageIndex | int | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 1211,
		"recordList": [
			{
				"pk_busimemo_name": "胶水购置有申请",
				"code": "GAPL210101000012",
				"pk_handlepsn_name": "系统操作员",
				"bustype_name": "通用测试审批中心",
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vouchdate": "2021-02-01 00:00:00",
				"cfinaceorg": "1996589440733440",
				"vcurrency_moneyDigit": 4,
				"vcurrency_name": "人民币",
				"vnatcurrency_name": "人民币",
				"id": 2551796887917056,
				"pubts": "2021-12-08 15:48:18",
				"vreason": "2021.2",
				"nnatlavemny": 0,
				"vfinacedeptid_name": "费控一部",
				"vfinacedeptid": "1996591622820096",
				"vnatcurrency_moneyDigit": 4,
				"isfinished": false,
				"bustype": "2282959898611968",
				"pk_busimemo": 1989862620061184,
				"nlavemny": 0,
				"cfinaceorg_name": "友费控有限责任公司",
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"createTime": "2021-12-08 15:42:02",
				"pk_handlepsn": "2373478454759680",
				"pk_billtype": "znbzbx_memoapply",
				"status": 1
			}
		],
		"sumRecordList": [
			{
				"nlavemny": 9304.7724,
				"nnatfinishmny": 8820.6092,
				"napplymny": 7863.7966,
				"nnatapplymny": 9697.1715,
				"nfinishmny": 8559.0242,
				"nnatlavemny": 876.5623
			}
		],
		"pageCount": 1211,
		"beginPageIndex": 2,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


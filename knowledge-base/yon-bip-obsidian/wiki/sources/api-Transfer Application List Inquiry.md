---
title: "调拨申请列表查询"
apiId: "d56bb922dd7c4abc8a1207f405164503"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨申请列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferreq/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| isSum | boolean | 否 | 否 | 是否按照表头查询 true:表头 false:表头+明细 默认为false 示例：false 默认值：false |
| code | string | 否 | 否 | 单据编号 示例： DBDD0003 |
| pageSize | long | 否 | 是 | 每页显示数据数 示例：10 默认值：10 |
| pageIndex | long | 否 | 是 | 当前页数 示例：1 默认值：1 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始日期 示例：2020-09-09 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据结束日期 示例：2020-09-25 23:59:59 |
| demandWarehouse | long | 否 | 否 | 调入仓库id 示例：1538112225530112 |
| demandWarehouse_code | string | 否 | 否 | 调入仓库编码 |
| bustype | string | 否 | 否 | 交易类型id 示例：110000000000037 |
| bustype_code | string | 否 | 否 | 交易类型编码 |
| outorg | string | 否 | 否 | 调出组织id 示例：1513866252718336 |
| outorg_code | string | 否 | 否 | 调出组织编码 |
| inorg | string | 否 | 否 | 调入组织id 示例：1520919005434112 |
| inorg_code | string | 否 | 否 | 调入组织编码 |
| outwarehouse | long | 否 | 否 | 调出仓库id 示例：1538112225530112 |
| outwarehouse_code | string | 否 | 否 | 调出仓库编码 |
| outdepartment | string | 否 | 否 | 调出部门id 示例：["1513884859437312"] |
| outdepartment_code | string | 否 | 否 | 调出部门编码 |
| indepartment | string | 否 | 否 | 调入部门id 示例：["1513885202583808"] |
| indepartment_code | string | 否 | 否 | 调入部门编码 |
| outbizperson | string | 否 | 否 | 调出业务员id 示例：123 |
| outbizperson_code | string | 否 | 否 | 调出业务员编码 |
| inbizperson | string | 否 | 否 | 调入业务员id 示例：234 |
| inbizperson_code | string | 否 | 否 | 调入业务员编码 |
| breturn | boolean | 否 | 否 | 退货调拨 ,枚举类型，枚举值说明：true:是，false:否 示例：false |
| status | string | 否 | 否 | 单据状态（0:开立,1:已审核,2:已关闭,3:审核中,4:已出库） 示例：0 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件传属性的名称，如时间戳pubts、物料编码demandapplydetails.product.cCode、表头自定义项headItem.define1、表体自定义项demandapplydetails.bodyItem.define1等) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 值1(条件) 示例：2021-05-19 00:00:00 |
| value2 | string | 否 | 否 | 值2(条件) 示例：2021-05-20 23:59:59 |

## 3. 请求示例

Url: /yonbip/scm/transferreq/list?access_token=访问令牌
Body: {
	"isSum": false,
	"code": " DBDD0003",
	"pageSize": 10,
	"pageIndex": 1,
	"open_vouchdate_begin": "2020-09-09 00:00:00",
	"open_vouchdate_end": "2020-09-25 23:59:59",
	"demandWarehouse": 1538112225530112,
	"demandWarehouse_code": "",
	"bustype": "110000000000037",
	"bustype_code": "",
	"outorg": "1513866252718336",
	"outorg_code": "",
	"inorg": "1520919005434112",
	"inorg_code": "",
	"outwarehouse": 1538112225530112,
	"outwarehouse_code": "",
	"outdepartment": "[\"1513884859437312\"]",
	"outdepartment_code": "",
	"indepartment": "[\"1513885202583808\"]",
	"indepartment_code": "",
	"outbizperson": "123",
	"outbizperson_code": "",
	"inbizperson": "234",
	"inbizperson_code": "",
	"breturn": false,
	"status": "0",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2021-05-19 00:00:00",
			"value2": "2021-05-20 23:59:59"
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页 |
| endPageIndex | int | 否 | 结束页 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"businesstype": "",
				"outorg": "",
				"outorg_name": "",
				"inorg": "",
				"inorg_name": "",
				"indepartment": "",
				"indepartment_name": "",
				"outbizperson": "",
				"outbizperson_name": "",
				"returncount": "",
				"inaccount_name": "",
				"outWarehouse_name": "",
				"dplanshipmentdate": "",
				"modifier": "",
				"pubts": "",
				"auditDate": "",
				"productsku_cName": "",
				"qty": 0,
				"approvePcs": 0,
				"project": "",
				"project_name": "",
				"srcBillType": "",
				"product_model": "",
				"expireDateUnit": "",
				"linecloser": "",
				"bodyItem": {
					"define1": ""
				},
				"headItem": {
					"id": "",
					"define1": ""
				},
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": "",
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据返回结果检查，再调用即可


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


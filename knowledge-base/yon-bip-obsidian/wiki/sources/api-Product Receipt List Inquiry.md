---
title: "产品入库列表查询"
apiId: "edc735d69b654129b0da4c38f2d8877f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Receipt"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Receipt]
platform_version: "BIP"
source_type: community-api-docs
---

# 产品入库列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Product Receipt (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/storeprorecord/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| code | string | 否 | 否 | 单据编号 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| warehouse_name | string | 是 | 否 | 仓库名字 |
| bustype_name | string | 否 | 否 | 交易类型 |
| stockMgr_name | string | 是 | 否 | 库管人名字列表 |
| operator | string | 是 | 否 | 操作员id |
| department | string | 是 | 否 | 部门id |
| org | string | 否 | 否 | 组织id |
| product_cName | string | 是 | 否 | 物料ID |
| open_hopeReceiveDate_begin | string | 否 | 否 | 区间查询开始时间 : "2020-03-02" |
| open_hopeReceiveDate_end | string | 否 | 否 | 区间查询结束时间 :"2020-03-02 23:59:59" |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件),子表加前缀storeProRecords. |
| op | string | 否 | 否 | 条件比较符(eq,neq,lt,gt,elt,egt,between,in,nin,like,leftlike,rightlike,is_null,is_not_null,and,or) |
| value1 | string | 否 | 否 | 值1(条件),单条件时仅使用这个配置 |
| value2 | string | 否 | 否 | 值2(条件),单条件时此配置无效 |

## 3. 请求示例

Url: /yonbip/scm/storeprorecord/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"code": "",
	"pageSize": 0,
	"warehouse_name": [
		""
	],
	"bustype_name": "",
	"stockMgr_name": [
		""
	],
	"operator": [
		""
	],
	"department": [
		""
	],
	"org": "",
	"product_cName": [
		""
	],
	"open_hopeReceiveDate_begin": "",
	"open_hopeReceiveDate_end": "",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
| sumRecordList | object | 是 | sum合计信息 |
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 示例：格式：yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sumRecordList": [
			{
				"totalQuantity": "",
				"qty": "",
				"totalPieces": "",
				"subQty": ""
			}
		],
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "格式：yyyy-MM-dd HH:mm:ss",
		"recordList": [
			{
				"factoryFiOrg": "",
				"storeProRecords_product": "",
				"currency": "",
				"storeProRecords_unit": "",
				"storeProRecords_productsku": "",
				"storeProRecords_stockUnitId": "",
				"vouchdate": "",
				"code": "",
				"department_name": "",
				"accountOrg": "",
				"org_name": "",
				"stockMgr_name": "",
				"department": "",
				"totalPieces": "",
				"org": "",
				"stockMgr": "",
				"store": "",
				"store_name": "",
				"warehouse": "",
				"warehouse_name": "",
				"bustype": "",
				"accountOrg_name": "",
				"bustype_name": "",
				"status": "",
				"operator": "",
				"totalQuantity": 0,
				"totalMaterial": "",
				"creator": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"memo": "",
				"auditorId": "",
				"creatorId": "",
				"id": "",
				"modifierId": "",
				"pubts": "",
				"tplid": "",
				"storeProRecords_id": "",
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"product_modelDescription": "",
				"qty": 0,
				"product_unitName": "",
				"subQty": 0,
				"stockUnit_name": "",
				"project_name": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"natCurrency_priceDigit": 0,
				"natCurrency_moneyDigit": 0,
				"unit_Precision": 0,
				"stockUnitId_Precision": 0,
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

999	入参错误等异常	根据返回错误信息做出相应调整


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


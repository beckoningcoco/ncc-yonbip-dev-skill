---
title: "借用未还单列表查询"
apiId: "1611581560551112707"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Borrowing outstanding"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Borrowing outstanding]
platform_version: "BIP"
source_type: community-api-docs
---

# 借用未还单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Borrowing outstanding (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/lendrecord/list

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
| pageIndex | long | 否 | 否 | 页码 示例：1 默认值：1 |
| pageSize | long | 否 | 否 | 每页数 示例：10 默认值：10 |
| code | string | 否 | 否 | 单据编号 示例：QSQR202204290001 |
| bustype | long | 否 | 否 | 交易类型id 示例：2592843724003328 |
| bustype_code | string | 否 | 否 | 交易类型编码 示例：x001 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间，日期格式：YYYY-MM-DD 示例：2022-06-10 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间，日期格式：YYYY-MM-DD 示例：2022-06-22 |
| isSum | boolean | 否 | 否 | 查询表头或表头+明细，true查询表头，false查询表头+明细 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 查询条件 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时必填 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/scm/lendrecord/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "QSQR202204290001",
	"bustype": 2592843724003328,
	"bustype_code": "x001",
	"open_vouchdate_begin": "2022-06-10",
	"open_vouchdate_end": "2022-06-22",
	"isSum": false,
	"simpleVOs": [
		{
			"logicOp": "and",
			"conditions": [
				{
					"field": "lendRecords.sourceid",
					"op": "eq",
					"value1": "order",
					"value2": "CGDD202202116059"
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：20 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 是 | 汇总 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"store": "1601958067847561222",
				"borrowStaff_name": "店员01",
				"borrowStaff": "1471493952192905217",
				"invaliddate": "2022-10-04 00:00:00",
				"lendRecords_productsku_modelDescription": "sdfd",
				"natUnitPrice": 1,
				"natMoney": 1,
				"operator": "1471493952192905217",
				"operator_name": "店员01",
				"department": "1483511605793128451",
				"department_name": "*存货联调库存组织的部门",
				"stockMgr": "1471493952192905217",
				"stockMgr_name": "店员01",
				"project_code": "00000005",
				"project": "项目id",
				"project_name": "项目1",
				"lendRecords_memo": "222",
				"lendRecords_product_modelDescription": "sdfd",
				"memo": "1",
				"lendRecords_productsku_cName": "物料条码02",
				"lendRecords_expReturnDate": "2022-12-08 00:00:00",
				"bustype_name": "借入",
				"lendRecords_qty": 3,
				"lendRecords_firstuplineno": 10,
				"subQty": 3,
				"lendRecords_srcBusType": "1509428082756289057",
				"lendRecords_returnPieces": 0,
				"borrowName": "我的供应商",
				"lendRecords_transSaleQuantity": 0,
				"totalQuantity": 100,
				"lendRecords_contactsPieces": 1,
				"lendRecords_stockUnitId": 1509428349059465238,
				"borrowSupplier_name": "我的供应商",
				"id": 1608732657264361473,
				"lendRecords_id": 1608732657264361474,
				"lendRecords_contactsQuantity": 1,
				"borrowCusType": "2",
				"lendRecords_transComsumptionPieces": 0,
				"lendRecords_srcOutType": "1509428082756289057",
				"lendRecords_transPieces": 0,
				"lendRecords_transGiftPieces": 0,
				"lendRecords_product_cCode": "1054000002",
				"lendRecords_source": "st_othinrecord",
				"lendRecords_product_productClass_code": "220728",
				"lendRecords_product_primeCosts": 0,
				"recorddate": "2022-12-08 00:00:00",
				"warehouse": 1509924984707350534,
				"lendRecords_subQty": 3,
				"lendRecords_srcBusType_name": "借入入库",
				"barCode": "uscmf_lendrecord|1608732657264361473",
				"stockUnitId_precision": 2,
				"group_number": 1,
				"lendRecords_product_productOfflineRetail_purchaseUnit": 1509428349059465238,
				"lendRecords_sourceid": 1608732631503470593,
				"warehouse_name": "01",
				"lendDirection": 1,
				"natCurrency_moneyDigit": 6,
				"natCurrency_priceDigit": 4,
				"accountOrg_name": "王章宇全职能",
				"unit_Precision": 2,
				"org_code": "wzyqzn",
				"borrowCustomer": "1473538691629580294",
				"contactsQuantity": 1,
				"lendRecords_firstsourceid": 1608732631503470593,
				"totalPieces": 100,
				"batchno": "PCDA202212080003",
				"lendRecords_sourceautoid": 1608732631503470594,
				"code": "QTRK000020221208000002",
				"lendRecords_product_code": "1054000002",
				"lendRecords_rowno": 1,
				"producedate": "2021-08-02 00:00:00",
				"lendRecords_product": 1509920792819269634,
				"lendRecords_unit_code": "HUR",
				"product_unitName": "小时",
				"lendRecords_firstupcode": "QTRK000020221208000002",
				"lendRecords_firstsource": "st_othinrecord",
				"lendRecords_transGiftQuantity": 0,
				"lendRecords_returnQuantity": 0,
				"lendRecords_transSalePieces": 0,
				"lendRecords_noReturnPieces": 3,
				"lendRecords_noReturnQuantity": 3,
				"stockUnitId_name": "小时",
				"lendRecords_transQuantity": 0,
				"vouchdate": "2022-12-08 00:00:00",
				"lendRecords_transBorrowPieces": 0,
				"lendRecords_firstsourceautoid": 1608732631503470594,
				"lendRecords_expireDateNo": 3,
				"lendRecords_uplineno": 10,
				"lendRecords_invExchRate": 1,
				"store_name": "ym03（只启存货）",
				"pubts": "2022-12-08 14:32:11",
				"org_name": "王章宇全职能",
				"lendRecords_unit": 1509428349059465238,
				"creator": "0000111400",
				"lendRecords_srcBillType": "st_othinrecord",
				"lendRecords_product_cName": "条码物料01",
				"lendRecords_transBorrowQuantity": 0,
				"org": "1509931598952792074",
				"lendRecords_transComsumptionQuantity": 0,
				"lendRecords_unit_name": "小时",
				"borrowSupplier": "1510098097653940233",
				"lendRecords_productsku_cCode": "000036",
				"accountOrg": "1509931598952792074",
				"bustype": "1509428082756289061",
				"borrowCustomer_name": "lcy客户0714",
				"lendRecords_expireDateUnit": 6,
				"lendRecords_product_oUnitId": 1509428349059465238,
				"createTime": "2022-12-08 14:32:08",
				"upcode": "CKSQ202205010003",
				"lendRecords_productsku": 2372244134285568,
				"lendRecords_lineno": 10
			}
		],
		"sumRecordList": [
			{
				"natMoney": 1,
				"unit_Precision": 2,
				"natCurrency_priceDigit": 4,
				"natCurrency_moneyDigit": 6,
				"stockUnitId_precision": 2,
				"accountOrg": "1471443795553812483",
				"lendRecords_transComsumptionQuantity": 1,
				"lendRecords_transBorrowQuantity": 1,
				"lendRecords_transGiftPieces": 1,
				"lendRecords_transPieces": 1,
				"lendRecords_unit": 1471409676319981575,
				"lendRecords_transComsumptionPieces": 1,
				"lendRecords_contactsQuantity": 1,
				"lendRecords_id": 41051078238709743768,
				"lendRecords_stockUnitId": 1471409676319981575,
				"lendRecords_contactsPieces": 1,
				"lendRecords_transBorrowPieces": 1,
				"lendRecords_transSaleQuantity": 1,
				"lendRecords_transQuantity": 1,
				"lendRecords_noReturnQuantity": 1,
				"lendRecords_returnPieces": 1,
				"lendRecords_noReturnPieces": 1,
				"lendRecords_transSalePieces": 1,
				"lendRecords_returnQuantity": 1,
				"subQty": 1,
				"lendRecords_transGiftQuantity": 1,
				"lendRecords_qty": 1
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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


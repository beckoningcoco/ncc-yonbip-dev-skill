---
title: "请购单列表查询"
apiId: "0f1453d26e6741faa95ace9533a61683"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Requisition"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 请购单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/applyorder/list

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
| bustype | string | 否 | 否 | 交易类型id 示例：110000000000029 |
| product | long | 否 | 否 | 物料id 示例：1730491724599552 |
| pageIndex | long | 否 | 是 | 页码 示例：1 |
| pageSize | long | 否 | 是 | 每页条数 示例：10 |
| isSum | boolean | 否 | 否 | 是否按照表头查询：true:表头、false:表头+明细 示例：false 默认值：false |
| queryOrders | object | 是 | 否 | 排序字段 |
| field | string | 否 | 否 | 排序条件字段:必须传实体上有的字段;主表字段查询时字段名(例: id);子表字段查询是子表对象.字段名(例：applyOrders.id);参照类型只能传id(例:按物料查询只能传物料id,不能传物料code) 示例：id |
| order | string | 否 | 否 | 顺序：asc：正序、desc：倒序 示例：asc |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) ，1：status(单据状态：0:未审核、1:已审核、2:已关闭、3:审核中)、2：code(单据编号)、3：vouchdate(请购日期)、4：operator(请购员id)、5：org(需求组织id)、6；applyOrders.purchaseOrg(采购组织id)、7：applyOrders.vendor(建议供应商id)、 8：applyDept(请购部门id)、9：headItem.define1(单据头自定义项1)、10：applyOrders.adviseOrderDate(建议订货日期)、11：applyOrders.project(项目id) 示例：code |
| op | string | 否 | 否 | 比较符（条件）：eq：等于、neq：不等于、lt：小于、gt：大于、between：介于、in：包含、nin：不包含、like：模糊匹配、leftlike：左模糊匹配、rightlike：右模糊匹配、is_null：为空、is_not_null：不为空、and：并且、or：或者 示例：eq |
| value1 | string | 否 | 否 | 值1（条件） 示例：CGDD2010140000000003 |

## 3. 请求示例

Url: /yonbip/scm/applyorder/list?access_token=访问令牌
Body: {
	"bustype": "110000000000029",
	"product": 1730491724599552,
	"pageIndex": 1,
	"pageSize": 10,
	"isSum": false,
	"queryOrders": [
		{
			"field": "id",
			"order": "asc"
		}
	],
	"simpleVOs": [
		{
			"field": "code",
			"op": "eq",
			"value1": "CGDD2010140000000003"
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
| pageIndex | int | 否 | 分页 示例：1 |
| pageSize | int | 否 | 每页条数 示例：10 |
| pageCount | int | 否 | 页数 示例：10 |
| beginPageIndex | int | 否 | 起始页 示例：1 |
| endPageIndex | int | 否 | 结束页 示例：10 |
| recordCount | int | 否 | 记录数 示例：100 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-03-04 00:00:00 |
| recordList | object | 是 | 返回列表信息 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"pageCount": 10,
		"beginPageIndex": 1,
		"endPageIndex": 10,
		"recordCount": 100,
		"pubts": "2024-03-04 00:00:00",
		"recordList": [
			{
				"vouchdate": "2021-03-04 00:00:00",
				"code": "CGQG0000201905100001",
				"returncount": "1",
				"isWfControlled": "1",
				"verifystate": "1",
				"bustype": "1153091135965020",
				"bustype_name": "采购要货",
				"applyDept": "1996900540021735427",
				"applyDept_name": "数智请购部门",
				"bizstatus": "0",
				"status": "0",
				"currency": "1996901321700016134",
				"currency_name": "人名币",
				"warehouseId": "1996901321700016135",
				"warehouseId_name": "货品仓库",
				"source": "MR.mr_lrp_plan_order_batch",
				"store": "1996902524296626181",
				"isUretailVoucher": "false",
				"store_name": "零售门店",
				"org": "1996902524296626182",
				"org_name": "达利园组织",
				"custom": "1996903245851131908",
				"creator": "张三",
				"createTime": "2021-03-04 00:00:00",
				"modifier": "张三",
				"modifyTime": "2021-03-04 00:00:00",
				"closer": "李响",
				"closeTime": "2021-03-05 00:00:00",
				"locker": "张三",
				"lockTime": "2021-03-05 00:00:00",
				"operator": "1996904998192021506",
				"operator_name": "王晨",
				"auditor": "刘策",
				"auditTime": "2021-03-05 00:00:00",
				"auditDate": "2021-03-05 12:36:12",
				"submitor": "王晨",
				"submitTime": "2021-03-05 12:20:12",
				"totalQuantity": 200,
				"memo": "来货请购",
				"id": "1996904998192021507",
				"pubts": "2021-03-04 00:00:00",
				"tplid": "1996906535790313475",
				"headItem": {
					"id": "1996906535790313476",
					"define1": "表头自定义项1",
					"define2": "表头自定义项2",
					"define3": "表头自定义项3"
				},
				"applyorders_execStatus": "表头自定义项4",
				"applyorders_receiveOrg": "1996916044853673985",
				"applyorders_receiveOrg_name": "达利园组织",
				"applyorders_purchaseOrg": "1996916044853673985",
				"applyorders_purchaseOrg_name": "达利园组织",
				"applyorders_purDept": "1996916044853673986",
				"applyorders_purDept_name": "采购部门",
				"applyorders_purPerson": "1996916551654047750",
				"applyorders_purPerson_name": "李晨",
				"applyOrders_supplyMoney": 200,
				"applyOrder_orderMoneyRatio": "20",
				"applyorders_supplyCount": 20,
				"apporders_id": "1996916551654047751",
				"applyorders_product": "1996917006926348290",
				"product_defaultAlbumId": "1996917006926348291",
				"applyorders_product_cCode": "00000002",
				"applyorders_product_cName": "苹果",
				"applyorders_productsku": "1996917006926348290",
				"applyorders_productsku_cCode": "00000002",
				"applyorders_productsku_cName": "苹果",
				"applyorders_currency": "1996917006926348290",
				"applyorders_currency_name": "人民币",
				"applyorders_currency_priceDigit": "2",
				"applyorders_currency_moneyDigit": "2",
				"applyorders_qty": 20,
				"applyorders_subQty": 20,
				"applyorders_rowno": 10,
				"unit_Precision": "2",
				"applyorders_unit": "1996918364130246657",
				"applyorders_unit_name": "吨",
				"applyorders_product_oUnitId": "1996918364130246657",
				"applyorders_product_productOfflineRetail_purchaseUnit": "吨",
				"applyorders_invExchRate": 1,
				"applyorders_productOfflineRetail_purchaseRate": 1,
				"priceUOM": "1996918364130246658",
				"priceUOM_Name": "吨",
				"invPriceExchRate": 1,
				"unitExchangeTypePrice": "0",
				"priceUOM_Precision": "2",
				"taxRate": "2",
				"oriTax": 20,
				"oriTaxUnitPrice": 12,
				"oriUnitPrice": 6,
				"oriMoney": 150,
				"oriSum": 200,
				"applyorders_product_primeCosts": 23,
				"applyorders_productsku_primeCosts": 24,
				"applyorders_requirementDate": "2021-03-04 00:00:00",
				"applyorders_adviseOrderDate": "2021-03-04 00:00:00",
				"applyorders_adviseSupplier": "1996919652626202626",
				"applyorders_adviseSupplier_name": "达利园供应商",
				"applyorders_vendor": "1996919652626202626",
				"applyorders_vendor_name": "达利园供应商",
				"applyorders_memo": "要货请购",
				"bodyItem": {
					"id": "1996919652626202627",
					"define1": "表体自定义项1",
					"define2": "表体自定义项2",
					"define3": "表体自定义项3",
					"define56": "表体自定义项56",
					"define57": "表体自定义项57",
					"define58": "表体自定义项58",
					"define59": "表体自定义项59",
					"define60": "表体自定义项60",
					"define4": "表体自定义项4",
					"define31": "表体自定义项31",
					"define32": "表体自定义项32",
					"define33": "表体自定义项33",
					"define34": "表体自定义项34",
					"define35": "表体自定义项35",
					"define36": "表体自定义项36",
					"define37": "表体自定义项37",
					"define38": "表体自定义项38",
					"define39": "表体自定义项39",
					"define40": "表体自定义项40",
					"define41": "表体自定义项41",
					"define42": "表体自定义项42",
					"define43": "表体自定义项43",
					"define44": "表体自定义项44",
					"define45": "表体自定义项45",
					"define46": "表体自定义项46",
					"define47": "表体自定义项47",
					"define48": "表体自定义项48",
					"define49": "表体自定义项49",
					"define50": "表体自定义项50",
					"define51": "表体自定义项51",
					"define52": "表体自定义项52",
					"define53": "表体自定义项53",
					"define54": "表体自定义项54",
					"define55": "表体自定义项55",
					"define5": "表体自定义项5",
					"define6": "表体自定义项6",
					"define7": "表体自定义项7",
					"define8": "表体自定义项8",
					"define9": "表体自定义项9",
					"define10": "表体自定义项10",
					"define11": "表体自定义项11",
					"define12": "表体自定义项12",
					"define13": "表体自定义项13",
					"define14": "表体自定义项14",
					"define15": "表体自定义项15",
					"define16": "表体自定义项16",
					"define17": "表体自定义项17",
					"define18": "表体自定义项18",
					"define19": "表体自定义项19",
					"define20": "表体自定义项20",
					"define21": "表体自定义项21",
					"define22": "表体自定义项22",
					"define23": "表体自定义项23",
					"define24": "表体自定义项24",
					"define25": "表体自定义项25",
					"define26": "表体自定义项26",
					"define27": "表体自定义项27",
					"define28": "表体自定义项28",
					"define29": "表体自定义项29",
					"define30": "表体自定义项30"
				},
				"applyorders_productsku_modelDescription": "33mm",
				"applyorders_product_model": "33mm",
				"applyorders_product_modelDescription": "细口",
				"applyorders_propertiesValue": "细口",
				"project": "1996923973363302404",
				"project_code": "00034",
				"applyOrders_vendor_define1": "供应商自定义项1",
				"project_name": "虚拟项目",
				"applyOrders_vendor_define2": "供应商自定义项2",
				"applyorders_trackNo": "0002",
				"applyOrders_vendor_define3": "供应商自定义项3",
				"applyOrders_vendor_define4": "供应商自定义项4",
				"applyOrders_vendor_define5": "供应商自定义项5",
				"applyOrders_vendor_define6": "供应商自定义项6",
				"applyOrders_vendor_define7": "供应商自定义项7",
				"applyOrders_vendor_define8": "供应商自定义项8",
				"applyOrders_vendor_define9": "供应商自定义项9",
				"applyOrders_vendor_define10": "供应商自定义项10",
				"applyOrders_vendor_define11": "供应商自定义项11",
				"applyOrders_vendor_define12": "供应商自定义项12",
				"applyOrders_vendor_define13": "供应商自定义项13",
				"applyOrders_vendor_define14": "供应商自定义项14",
				"applyOrders_vendor_define15": "供应商自定义项15",
				"applyOrders_vendor_define16": "供应商自定义项16",
				"applyOrders_vendor_define17": "供应商自定义项17",
				"applyOrders_vendor_define18": "供应商自定义项18",
				"applyOrders_vendor_define19": "供应商自定义项19",
				"applyOrders_vendor_define20": "供应商自定义项20",
				"applyOrders_vendor_define21": "供应商自定义项21",
				"applyOrders_vendor_define22": "供应商自定义项22",
				"applyOrders_vendor_define23": "供应商自定义项23",
				"applyOrders_vendor_define24": "供应商自定义项24",
				"applyOrders_vendor_define25": "供应商自定义项25",
				"applyOrders_vendor_define26": "供应商自定义项26",
				"applyOrders_vendor_define27": "供应商自定义项27",
				"applyOrders_vendor_define28": "供应商自定义项28",
				"applyOrders_vendor_define29": "供应商自定义项29",
				"applyOrders_vendor_define30": "供应商自定义项30"
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


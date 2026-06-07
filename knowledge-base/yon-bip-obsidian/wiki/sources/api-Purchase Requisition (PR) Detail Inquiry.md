---
title: "请购单详情查询"
apiId: "3ba66fc23dc14ff8bcb9d49900e2dfcf"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Purchase Requisition"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 请购单详情查询

> `ContentType` 请求方式	GET | 分类: Purchase Requisition (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/applyorder/detail

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 请购单id    示例: 1996931352117116929 |

## 3. 请求示例

Url: /yonbip/scm/applyorder/detail?access_token=访问令牌&id=1996931352117116929

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
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| org | string | 否 | 需求组织id 示例：1996931352117116930 |
| org_name | string | 否 | 需求组织名称 示例：达利园组织 |
| id | string | 否 | 请购单id 示例：1996932589067698184 |
| bustype_name | string | 否 | 交易类型名称 示例：采购要货 |
| code | string | 否 | 请购单编号 示例：QG240513000001 |
| vouchdate | string | 否 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| bustype | string | 否 | 交易类型id 示例：1996932589067698185 |
| applyDept_name | string | 否 | 请购部门名称 示例：请购部门 |
| operator | string | 否 | 请购人id 示例：1996933671393689606 |
| store_name | string | 否 | 门店名称 示例：销售门店 |
| operator_name | string | 否 | 请购人名称 示例：李成 |
| applyDept | string | 否 | 请购部门id 示例：1996933671393689607 |
| warehouseId | string | 否 | 要货仓库id 示例：1996933946277363721 |
| warehouseId_name | string | 否 | 要货仓库名称 示例：采购仓库 |
| bizstatus | string | 否 | 单据状态：0:开立、3:审核中、1:已审核、2:已关闭 示例：0 |
| status | string | 否 | 单据状态：0:开立、3:审核中、1:已审核、2:已关闭 示例：0 |
| isWfControlled | string | 否 | 是否审批流：true、false 示例：false |
| verifystate | string | 否 | 审批状态：0：未提交、1：已提交、2：已审批、3：审批中 示例：0 |
| returncount | string | 否 | 返回次数 示例：0 |
| memo | string | 否 | 备注 示例：请购要货 |
| source | string | 否 | 来源单据类型, 20:计划独立需求、280:计划订单、MR.mr_lrp_plan_order_batch:计划订单、po_production_order:生产订单、ucf-amc-aum.aum_assignapply_card:资产领用申请、yonbip-pm-planme.rscm_project_materiallist_card:项目物资单、SCMSA.voucher_order:销售订单 示例：po_production_order |
| srcBillNO | string | 否 | 来源单据号 示例：UO-948220240507000001 |
| srcBill | string | 否 | 来源单据主表id 示例：1996933946277363722 |
| isUretailVoucher | string | 否 | 是否是零售：true：是、false：否 示例：true |
| custom | string | 否 | 客户id 示例：1996939692943605762 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| tplid | string | 否 | 模板id 示例：1996939692943605763 |
| store | string | 否 | 门店id 示例：1996939950635876355 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 整单数量 示例：200 |
| headItem | object | 否 | 表头自定义项 |
| creator | string | 否 | 制单人 示例：李晨 |
| locker | string | 否 | 锁定人 示例：李晨 |
| createTime | string | 否 | 制单时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 12:23:12 |
| lockTime | string | 否 | 锁定时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 12:23:12 |
| createDate | string | 否 | 制单日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| lockDate | string | 否 | 锁定日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| modifier | string | 否 | 修改人 示例：李晨 |
| modifyTime | string | 否 | 修改时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 12:23:12 |
| modifyDate | string | 否 | 修改日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| closer | string | 否 | 关闭人 示例：李晨 |
| closeTime | string | 否 | 关闭时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 12:23:12 |
| closeDate | string | 否 | 关闭日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| auditor | string | 否 | 审核人 示例：李晨 |
| auditTime | string | 否 | 审核时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 12:23:12 |
| auditDate | string | 否 | 审核日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| ecsuiteperson | string | 否 | 气泡联系人 示例：张策 |
| ecsuiteuser | string | 否 | 气泡联系人 示例：张策 |
| creatorId | long | 否 | 创建人id 示例：1996941780297711616 |
| lockerId | string | 否 | 锁定人id 示例：1996941780297711617 |
| modifierId | string | 否 | 修改人id 示例：1996941926320832514 |
| auditorId | string | 否 | 审批人id 示例：1996941926320832515 |
| closerId | string | 否 | 关闭人id 示例：1996941926320832514 |
| applyOrders | object | 是 | 请购单子表[pu.applyorder.ApplyOrders] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"org": "1996931352117116930",
		"org_name": "达利园组织",
		"id": "1996932589067698184",
		"bustype_name": "采购要货",
		"code": "QG240513000001",
		"vouchdate": "2024-05-13 00:00:00",
		"bustype": "1996932589067698185",
		"applyDept_name": "请购部门",
		"operator": "1996933671393689606",
		"store_name": "销售门店",
		"operator_name": "李成",
		"applyDept": "1996933671393689607",
		"warehouseId": "1996933946277363721",
		"warehouseId_name": "采购仓库",
		"bizstatus": "0",
		"status": "0",
		"isWfControlled": "false",
		"verifystate": "0",
		"returncount": "0",
		"memo": "请购要货",
		"source": "po_production_order",
		"srcBillNO": "UO-948220240507000001",
		"srcBill": "1996933946277363722",
		"isUretailVoucher": "true",
		"custom": "1996939692943605762",
		"pubts": "2024-05-13 00:00:00",
		"tplid": "1996939692943605763",
		"store": "1996939950635876355",
		"totalQuantity": 200,
		"headItem": {
			"id": "1996939950635876356",
			"define1": "表头自定义项1",
			"define2": "表头自定义项2",
			"define3": "表头自定义项3",
			"define60": "表头自定义项60"
		},
		"creator": "李晨",
		"locker": "李晨",
		"createTime": "2024-05-13 12:23:12",
		"lockTime": "2024-05-13 12:23:12",
		"createDate": "2024-05-13 00:00:00",
		"lockDate": "2024-05-13 00:00:00",
		"modifier": "李晨",
		"modifyTime": "2024-05-13 12:23:12",
		"modifyDate": "2024-05-13 00:00:00",
		"closer": "李晨",
		"closeTime": "2024-05-13 12:23:12",
		"closeDate": "2024-05-13 00:00:00",
		"auditor": "李晨",
		"auditTime": "2024-05-13 12:23:12",
		"auditDate": "2024-05-13 00:00:00",
		"ecsuiteperson": "张策",
		"ecsuiteuser": "张策",
		"creatorId": 1996941780297711616,
		"lockerId": "1996941780297711617",
		"modifierId": "1996941926320832514",
		"auditorId": "1996941926320832515",
		"closerId": "1996941926320832514",
		"applyOrders": [
			{
				"businessAttribute": 1,
				"id": "1996942261334048769",
				"mainid": "1996942261334048770",
				"receiveOrg": "1996942450306842625",
				"receiveOrg_name": "达利园组织",
				"purchaseOrg": "1996942450306842625",
				"purchaseOrg_name": "达利园组织",
				"sourceid": "1996942450306842626",
				"unit_Precision": "2",
				"unit": "1996942802499928073",
				"product_cCode": "000002",
				"product_cName": "铁丝",
				"product_modelDescription": "细长",
				"product_model": "003N",
				"pubts": "2024-05-13 09:16:16",
				"adviseSupplier": "1996942802499928074",
				"vendor": "1996943481104760837",
				"adviseSupplier_name": "达利园供应商",
				"vendor_define1": "供应商自定义项1",
				"vendor_define2": "供应商自定义项2",
				"vendor_define3": "供应商自定义项3",
				"vendor_define4": "供应商自定义项4",
				"vendor_define5": "供应商自定义项5",
				"productsku_cCode": "000002",
				"vendor_define6": "供应商自定义项6",
				"productsku_cName": "铁丝",
				"productsku_modelDescription": "细长",
				"propertiesValue": "003N",
				"vendor_define7": "供应商自定义项7",
				"vendor_define8": "供应商自定义项8",
				"vendor_define9": "供应商自定义项9",
				"vendor_define10": "供应商自定义项10",
				"vendor_define11": "供应商自定义项11",
				"vendor_define12": "供应商自定义项12",
				"vendor_define13": "供应商自定义项13",
				"vendor_define14": "供应商自定义项14",
				"vendor_define15": "供应商自定义项15",
				"unit_name": "米",
				"vendor_define16": "供应商自定义项16",
				"qty": 20,
				"purUOM_Code": "MI",
				"vendor_define17": "供应商自定义项17",
				"purUOM_Name": "米",
				"vendor_define18": "供应商自定义项18",
				"vendor_define19": "供应商自定义项19",
				"invExchRate": 1,
				"vendor_define20": "供应商自定义项20",
				"subQty": 12,
				"vendor_define21": "供应商自定义项21",
				"vendor_define22": "供应商自定义项22",
				"vendor_define23": "供应商自定义项23",
				"vendor_define24": "供应商自定义项24",
				"requirementDate": "2024-05-13 00:00:00",
				"vendor_define25": "供应商自定义项25",
				"adviseOrderDate": "2024-05-13 00:00:00",
				"vendor_define26": "供应商自定义项26",
				"vendor_name": "达利园供应商",
				"vendor_define27": "供应商自定义项27",
				"vendor_define28": "供应商自定义项28",
				"vendor_define29": "供应商自定义项29",
				"vendor_define30": "供应商自定义项30",
				"project_code": "00034",
				"purDept": "1996943481104760838",
				"project_name": "虚拟项目",
				"purDept_name": "要货请购部门",
				"purPerson": "1996946229878063109",
				"purPerson_name": "王庆",
				"makeRuleCode": "planorderToapplyorder2",
				"sourceautoid": "1996946229878063110",
				"memo": "要货请购",
				"product": "1996946796813746181",
				"productsku": "1996946796813746181",
				"materialId": "1996946796813746181",
				"product_defaultAlbumId": "f21bd56cb1b2a82fdb0882db2f0aa11",
				"rowno": 10,
				"product_oUnitId": "1996946796813746182",
				"product_productOfflineRetail_purchaseUnit": "1996947449648775169",
				"productOfflineRetail_purchaseRate": 1,
				"product_primeCosts": 12,
				"productsku_primeCosts": 12,
				"purQty": 20,
				"approveNum": 20,
				"supplyCount": 12,
				"free1": "物料规格1",
				"free2": "物料规格2",
				"free3": "物料规格3",
				"free4": "物料规格4",
				"free5": "物料规格5",
				"free6": "物料规格6",
				"free7": "物料规格7",
				"free8": "物料规格8",
				"free9": "物料规格9",
				"free10": "物料规格10",
				"prodefine1": "商品自定义项1",
				"prodefine2": "商品自定义项2",
				"prodefine3": "商品自定义项3",
				"prodefine4": "商品自定义项4",
				"prodefine5": "商品自定义项5",
				"prodefine6": "商品自定义项6",
				"prodefine7": "商品自定义项7",
				"prodefine8": "商品自定义项8",
				"prodefine9": "商品自定义项9",
				"prodefine10": "商品自定义项10",
				"prodefine11": "商品自定义项11",
				"prodefine12": "商品自定义项12",
				"prodefine13": "商品自定义项13",
				"prodefine14": "商品自定义项14",
				"prodefine15": "商品自定义项15",
				"prodefine16": "商品自定义项16",
				"prodefine17": "商品自定义项17",
				"prodefine18": "商品自定义项18",
				"prodefine19": "商品自定义项19",
				"prodefine20": "商品自定义项20",
				"prodefine21": "商品自定义项21",
				"prodefine22": "商品自定义项22",
				"prodefine23": "商品自定义项23",
				"prodefine24": "商品自定义项24",
				"prodefine25": "商品自定义项25",
				"prodefine26": "商品自定义项26",
				"prodefine27": "商品自定义项27",
				"prodefine28": "商品自定义项28",
				"prodefine29": "商品自定义项29",
				"prodefine30": "商品自定义项30",
				"skudefine1": "商品sku自定义项1",
				"skudefine2": "商品sku自定义项2",
				"skudefine3": "商品sku自定义项3",
				"skudefine4": "商品sku自定义项4",
				"skudefine5": "商品sku自定义项5",
				"skudefine6": "商品sku自定义项6",
				"skudefine7": "商品sku自定义项7",
				"skudefine8": "商品sku自定义项8",
				"skudefine9": "商品sku自定义项9",
				"skudefine10": "商品sku自定义项10",
				"skudefine11": "商品sku自定义项11",
				"skudefine12": "商品sku自定义项12",
				"skudefine13": "商品sku自定义项13",
				"skudefine14": "商品sku自定义项14",
				"skudefine15": "商品sku自定义项15",
				"skudefine16": "商品sku自定义项16",
				"skudefine17": "商品sku自定义项17",
				"skudefine18": "商品sku自定义项18",
				"skudefine19": "商品sku自定义项19",
				"skudefine20": "商品sku自定义项20",
				"skudefine21": "商品sku自定义项21",
				"skudefine22": "商品sku自定义项22",
				"skudefine23": "商品sku自定义项23",
				"skudefine24": "商品sku自定义项24",
				"skudefine25": "商品sku自定义项25",
				"skudefine26": "商品sku自定义项26",
				"skudefine27": "商品sku自定义项27",
				"skudefine28": "商品sku自定义项28",
				"skudefine29": "商品sku自定义项29",
				"skudefine30": "商品sku自定义项30",
				"skudefine31": "商品sku自定义项31",
				"skudefine32": "商品sku自定义项32",
				"skudefine33": "商品sku自定义项33",
				"skudefine34": "商品sku自定义项34",
				"skudefine35": "商品sku自定义项35",
				"skudefine36": "商品sku自定义项36",
				"skudefine37": "商品sku自定义项37",
				"skudefine38": "商品sku自定义项38",
				"skudefine39": "商品sku自定义项39",
				"skudefine40": "商品sku自定义项40",
				"skudefine41": "商品sku自定义项41",
				"skudefine42": "商品sku自定义项42",
				"skudefine43": "商品sku自定义项43",
				"skudefine44": "商品sku自定义项44",
				"skudefine45": "商品sku自定义项45",
				"skudefine46": "商品sku自定义项46",
				"skudefine47": "商品sku自定义项47",
				"skudefine48": "商品sku自定义项48",
				"skudefine49": "商品sku自定义项49",
				"skudefine50": "商品sku自定义项50",
				"skudefine51": "商品sku自定义项51",
				"skudefine52": "商品sku自定义项52",
				"skudefine53": "商品sku自定义项53",
				"skudefine55": "商品sku自定义项55",
				"skudefine54": "商品sku自定义项54",
				"skudefine56": "商品sku自定义项56",
				"skudefine57": "商品sku自定义项57",
				"skudefine58": "商品sku自定义项58",
				"skudefine59": "商品sku自定义项59",
				"skudefine60": "商品sku自定义项60",
				"bodyItem": {
					"id": "1996947449648775170",
					"define1": "表体自定义项1",
					"define2": "表体自定义项2",
					"define3": "表体自定义项3",
					"define41": "表体自定义项41",
					"define37": "表体自定义项37",
					"define33": "表体自定义项33",
					"define58": "表体自定义项58",
					"define54": "表体自定义项54",
					"define50": "表体自定义项50",
					"define46": "表体自定义项46",
					"define42": "表体自定义项42",
					"define38": "表体自定义项38",
					"define34": "表体自定义项34",
					"define4": "表体自定义项4",
					"define59": "表体自定义项59",
					"define55": "表体自定义项55",
					"define51": "表体自定义项51",
					"define47": "表体自定义项47",
					"define43": "表体自定义项43",
					"define39": "表体自定义项39",
					"define35": "表体自定义项35",
					"define31": "表体自定义项31",
					"define60": "表体自定义项60",
					"define56": "表体自定义项56",
					"define52": "表体自定义项52",
					"define48": "表体自定义项48",
					"define44": "表体自定义项44",
					"define40": "表体自定义项40",
					"define36": "表体自定义项36",
					"define32": "表体自定义项32",
					"define57": "表体自定义项57",
					"define53": "表体自定义项53",
					"define49": "表体自定义项49",
					"define45": "表体自定义项45",
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
				"purUOM": "1996957001661808646",
				"purUOM_Precision": "2",
				"project": "1996957001661808647",
				"trackNo": "0002",
				"linecloser": "李晨",
				"linecloseTime": "2024-05-13 09:16:16",
				"unitExchangeType": 0,
				"upcode": "UO-383020240430000003",
				"source": "po_production_order",
				"firstupcode": "UO-383020240430000003",
				"firstsourceautoid": "1996958049633828869",
				"firstsourceid": "1996958049633828869",
				"firstsource": "po_production_order"
			}
		]
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


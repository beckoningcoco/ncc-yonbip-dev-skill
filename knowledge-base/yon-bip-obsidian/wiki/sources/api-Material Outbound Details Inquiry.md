---
title: "材料出库详情查询"
apiId: "f5e34ec7d72040339511c9dc876fedaa"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material Issue Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Issue Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 材料出库详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Material Issue Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/materialout/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/scm/materialout/detail?access_token=访问令牌&id=

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
| org | string | 否 | 库存组织id |
| org_name | string | 否 | 库存组织名称 |
| accountOrg_name | string | 否 | 会计主体名称 |
| accountOrg | string | 否 | 会计主体id |
| natCurrency_moneyDigit | string | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 币种单价精度 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| factoryOrg | string | 否 | 领用组织 |
| warehouse_name | string | 否 | 仓库名称 |
| warehouse_iSerialManage | string | 否 | 仓库是否序列号严格管理 |
| warehouse_isGoodsPositionStock | string | 否 | 仓库货位是否记存量 |
| warehouse_isGoodsPosition | string | 否 | 出仓库是否货位管理 |
| factory_name | string | 否 | 领用组织 |
| warehouse | string | 否 | 仓库id |
| factoryFiOrg_name | string | 否 | 领用组织会计主体名称 |
| bustype | string | 否 | 交易类型id |
| factoryFiOrg | string | 否 | 领用组织会计主体IDid |
| bustype_name | string | 否 | 交易类型名称 |
| department_name | string | 否 | 部门名称 |
| department | string | 否 | 部门id |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr_name | string | 否 | 库管员名称 |
| stockMgr | string | 否 | 库管员IDid |
| memo | string | 否 | 备注 |
| totalQuantity | int | 否 | 整单数量 |
| totalPieces | string | 否 | 整单件数 |
| isCopy | string | 否 | 是否复制, true:是、false:否、 |
| bustype_extend_attrs_json | string | 否 | 出库类型 |
| status | string | 否 | 单据状态, 0:未提交、1:已提交、 |
| srcBillType | string | 否 | 来源上级单据类型 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| createDate | string | 否 | 创建日期,格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间,格式为:yyyy-MM-dd HH:mm:ss |
| modifyDate | string | 否 | 修改日期,格式为:yyyy-MM-dd HH:mm:ss |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间,格式为:yyyy-MM-dd HH:mm:ss |
| auditDate | string | 否 | 提交日期 |
| id | string | 否 | 主表id |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | string | 否 | 模板id |
| srcbill | string | 否 | 来源单据id |
| srcbillno | string | 否 | 来源单据 |
| vouchtype | string | 否 | 单据类型 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| headItem | object | 否 | 表头自定义项(暂时支持60个) |
| materOuts | object | 是 | 材料出库单子表[st.materialout.MaterialOuts] |
| st_materialoutssn | object | 是 | 材料出库单序列号[st.materialout.MaterialOutsSN] |
| costAccountingMethod | string | 否 | 委外成本核算方式：0按委外入库核算成本，1 按委外订单核算成本 |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"org": "",
		"org_name": "",
		"accountOrg_name": "",
		"accountOrg": "",
		"natCurrency_moneyDigit": "",
		"natCurrency_priceDigit": "",
		"code": "",
		"vouchdate": "",
		"store": "",
		"store_name": "",
		"factoryOrg": "",
		"warehouse_name": "",
		"warehouse_iSerialManage": "",
		"warehouse_isGoodsPositionStock": "",
		"warehouse_isGoodsPosition": "",
		"factory_name": "",
		"warehouse": "",
		"factoryFiOrg_name": "",
		"bustype": "",
		"factoryFiOrg": "",
		"bustype_name": "",
		"department_name": "",
		"department": "",
		"operator": "",
		"operator_name": "",
		"stockMgr_name": "",
		"stockMgr": "",
		"memo": "",
		"totalQuantity": 0,
		"totalPieces": "",
		"isCopy": "",
		"bustype_extend_attrs_json": "",
		"status": "",
		"srcBillType": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"id": "",
		"pubts": "",
		"tplid": "",
		"srcbill": "",
		"srcbillno": "",
		"vouchtype": "",
		"ecsuiteperson": "",
		"headItem": {
			"id": "",
			"define1": "",
			"define2": "",
			"define3": "",
			"define60": ""
		},
		"materOuts": [
			{
				"isSerialNoManage": "",
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"prodefine1": "",
				"prodefine2": "",
				"prodefine3": "",
				"prodefine4": "",
				"prodefine5": "",
				"prodefine6": "",
				"prodefine7": "",
				"prodefine8": "",
				"prodefine9": "",
				"prodefine10": "",
				"prodefine11": "",
				"prodefine12": "",
				"prodefine13": "",
				"prodefine14": "",
				"prodefine15": "",
				"currentqty": 0,
				"prodefine16": "",
				"availableqty": 0,
				"prodefine17": "",
				"prodefine18": "",
				"prodefine19": "",
				"prodefine20": "",
				"prodefine21": "",
				"prodefine22": "",
				"prodefine23": "",
				"prodefine24": "",
				"prodefine25": "",
				"prodefine26": "",
				"prodefine27": "",
				"prodefine28": "",
				"prodefine29": "",
				"prodefine30": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"skudefine1": "",
				"skudefine2": "",
				"skudefine3": "",
				"skudefine4": "",
				"skudefine5": "",
				"skudefine6": "",
				"skudefine7": "",
				"skudefine8": "",
				"skudefine9": "",
				"skudefine10": "",
				"skudefine11": "",
				"skudefine12": "",
				"skudefine13": "",
				"skudefine14": "",
				"skudefine15": "",
				"skudefine16": "",
				"skudefine17": "",
				"skudefine18": "",
				"skudefine19": "",
				"skudefine20": "",
				"skudefine21": "",
				"skudefine22": "",
				"skudefine23": "",
				"skudefine24": "",
				"skudefine25": "",
				"skudefine26": "",
				"skudefine27": "",
				"skudefine28": "",
				"skudefine29": "",
				"skudefine30": "",
				"skudefine31": "",
				"skudefine32": "",
				"skudefine33": "",
				"skudefine34": "",
				"skudefine35": "",
				"skudefine36": "",
				"skudefine37": "",
				"skudefine38": "",
				"skudefine39": "",
				"skudefine40": "",
				"skudefine41": "",
				"skudefine42": "",
				"skudefine43": "",
				"skudefine44": "",
				"skudefine45": "",
				"skudefine46": "",
				"skudefine47": "",
				"skudefine48": "",
				"skudefine49": "",
				"skudefine50": "",
				"skudefine51": "",
				"skudefine52": "",
				"skudefine53": "",
				"skudefine54": "",
				"skudefine55": "",
				"skudefine56": "",
				"skudefine57": "",
				"skudefine58": "",
				"skudefine59": "",
				"skudefine60": "",
				"productskuCp": "",
				"productskuCp_cCode": "",
				"productskuCp_cName": "",
				"free1": "",
				"free2": "",
				"free3": "",
				"free4": "",
				"free5": "",
				"free6": "",
				"free7": "",
				"free8": "",
				"free9": "",
				"free10": "",
				"propertiesValue": "",
				"batchno": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"define1": "",
				"define2": "",
				"define3": "",
				"define4": "",
				"define5": "",
				"define6": "",
				"define7": "",
				"define8": "",
				"define9": "",
				"define10": "",
				"define11": "",
				"define12": "",
				"define13": "",
				"define14": "",
				"define15": "",
				"define16": "",
				"define17": "",
				"taxRate": "",
				"oriTax": "",
				"oriSum": "",
				"oriMoney": "",
				"oriTaxUnitPrice": "",
				"oriUnitPrice": "",
				"natTax": 0,
				"natSum": 0,
				"natTaxUnitPrice": 0,
				"define18": "",
				"define19": "",
				"define20": "",
				"define21": "",
				"define22": "",
				"define23": "",
				"define24": "",
				"define25": "",
				"define26": "",
				"define27": "",
				"define28": "",
				"define29": "",
				"define30": "",
				"qty": 0,
				"unit": "",
				"unit_Precision": "",
				"product_unitName": "",
				"stockUnitId": "",
				"stockUnitId_Precision": "",
				"invExchRate": 0,
				"unitExchangeType": "",
				"subQty": 0,
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"stockUnit_name": "",
				"goodsposition": "",
				"goodsposition_cName": "",
				"natUnitPrice": 0,
				"autoCalcCost": "",
				"natMoney": 0,
				"costUnitPrice": "",
				"costMoney": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"mainid": "",
				"project": "",
				"project_name": "",
				"memo": "",
				"recorddate": "",
				"id": "",
				"pubts": "",
				"source": "",
				"upcode": "",
				"topsource": "",
				"firstsource": "",
				"topupcode": "",
				"firstupcode": "",
				"product_model": "",
				"product_modelDescription": "",
				"makeproduct": "",
				"orderproduct_makeproduct": "",
				"sourceid": "",
				"sourceautoid": "",
				"makeRuleCode": "",
				"sourceGrandchildrenId": "",
				"firstsourceid": "",
				"firstsourceautoid": "",
				"firstsourceGrandchildrenId": "",
				"topsourceautoid": "",
				"isWip": "",
				"bodyParallel": {
					"wipOpSn": "",
					"wipOperationId": ""
				},
				"bodyParallel_wipOperationCode": "",
				"bodyParallel_wipOperationName": "",
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"st_materialoutssn": [
			{
				"id": "",
				"pubts": "",
				"grandpaid": "",
				"detailid": "",
				"sn": "",
				"define1": "",
				"define2": "",
				"define3": "",
				"define4": "",
				"define5": "",
				"define6": "",
				"define7": "",
				"define8": "",
				"define9": "",
				"define10": "",
				"define11": "",
				"define12": "",
				"define13": "",
				"define14": "",
				"define15": "",
				"define16": "",
				"define17": "",
				"define18": "",
				"define19": "",
				"define20": "",
				"define21": "",
				"define22": "",
				"define23": "",
				"define24": "",
				"define25": "",
				"define26": "",
				"define27": "",
				"define28": "",
				"define29": "",
				"define30": ""
			}
		],
		"costAccountingMethod": "",
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
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


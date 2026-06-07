---
title: "形态转换单列表查询"
apiId: "1427085983157321728"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transformation Sheet"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transformation Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 形态转换单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Transformation Sheet (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/morphologyconversion/list

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
| isSum | boolean | 否 | 否 | 是否按照表头查询 true:表头 false:表头+明细 默认为false 默认值：false |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| code | string | 否 | 否 | 单据编号 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始日期，yyyy-MM-dd |
| open_vouchdate_end | string | 否 | 否 | 单据结束日期，yyyy-MM-dd |
| status | string | 否 | 否 | 单据状态，0:开立状态；3:审核中；1:已审核；2:已关闭； |
| simpleVOs | object | 是 | 否 | 查询条件 |
| op | string | 否 | 否 | 比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间 ) |
| value2 | string | 否 | 否 | 值2(条件)如："2021-04-19 23:59:59" |
| value1 | string | 否 | 否 | 值1(条件)如： "2021-04-19 00:00:00" |
| field | string | 否 | 否 | 属性名(条件传属性的名称，交易类型：businesstypeId、businesstypeId.code、businesstypeId.name；转换类型：conversionType[1为一对一；2为多对一；3为一对多]；业务员：operator、operator.name；物料sku：morphologyconversiondetail.productsku、morphologyconversiondetail.productsku.cCode、morphologyconversiondetail.productsku.skuName；仓库：morphologyconversiondetail.warehouse、morphologyconversiondetail.warehouse.name；库存组织：org、org.code、org.name；部门：department、department.name；库管员：morphologyconversiondetail.warehousePersonId、morphologyconversiondetail.warehousePersonId.name；表头自定义项：headItem.define1；表体自定义项：morphologyconversiondetail.bodyItem.define1；时间戳：pubts；) |

## 3. 请求示例

Url: /yonbip/scm/morphologyconversion/list?access_token=访问令牌
Body: {
	"isSum": true,
	"pageIndex": 0,
	"code": "",
	"pageSize": 0,
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"status": "",
	"simpleVOs": [
		{
			"op": "",
			"value2": "",
			"value1": "",
			"field": ""
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
| code | string | 否 | 请求响应码，200时表示成功 示例：200 |
| message | string | 否 | 响应信息描述 示例：操作成功 |
| data | object | 否 | 响应数据 |
| pageIndex | long | 否 | 页号 示例：1 |
| pageSize | long | 否 | 每页行数 示例：20 |
| recordCount | long | 否 | 总数 示例：1 |
| recordList | object | 是 | 数据集 |
| sumRecordList | object | 是 | 合计数据集 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：1 |

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
				"morphologyconversiondetail_warehousePersonId": "",
				"warehousePersonName": "",
				"operator_name": "",
				"operator": "",
				"department": 0,
				"department_name": "",
				"beforeWarehouseName": "CSE普仓1",
				"conversionType": 3,
				"qty": "2",
				"subQty": 2,
				"morphologyconversiondetail_productsku": 2355070652485889,
				"lineType": 3,
				"id": 2713158178755072,
				"storeTransDetail_propertiesValue": "CSE颜色规格:CSE红;CSE大小规格:大;",
				"product_model": "CSE型号2",
				"morphologyconversiondetail_product_cCode": "000008",
				"orgName": "95总公司",
				"isWfControlled": false,
				"morphologyconversiondetail_stockUnitId": 2353530000216320,
				"morphologyconversiondetail_productsku_cCode": "000013",
				"morphologyconversiondetail_qty": 2,
				"main_unit_name": "个",
				"barCode": "st_morphologyconversion|2713158178755072",
				"stockUnitId_precision": 2,
				"modelDescription": "CSE规格说明2",
				"natCurrency_moneyDigit": 2,
				"natCurrency_priceDigit": 2,
				"unit_Precision": 2,
				"invExchRate": 1,
				"status": 0,
				"returncount": 0,
				"verifystate": 0,
				"morphologyconversiondetail_productsku_cName": "CSE多规格物料CSE红大",
				"code": "XTZH20220401000003",
				"morphologyconversiondetail_warehouse": 2355082071216384,
				"morphologyconversiondetail_product_cName": "CSE多规格物料",
				"afterWarehouse": 2370737867149568,
				"morphologyconversiondetail_id": 2713158178755073,
				"warehouseName": "CSE普仓1",
				"defines": {
					"id": 0,
					"define1": "",
					"define2": ""
				},
				"headItem": {
					"id": 0,
					"define1": "",
					"define2": ""
				},
				"bodyItem": {
					"id": 0,
					"define1": ""
				},
				"stockUnitId_name": "个",
				"vouchdate": "2022-04-01 00:00:00",
				"businesstypeName": "拆卸",
				"morphologyconversiondetail_product": 2355070652485888,
				"accountOrgName": "95总公司",
				"afterWarehouseName": "CSE仓库2",
				"orgCode": "95zgs",
				"pubts": "2022-04-01 15:27:15",
				"createDate": "2022-04-01 00:00:00",
				"businesstypeId": "2352475251151360",
				"creator": "柴守娥",
				"org": "2371682382681600",
				"beforeWarehouse": 2355082071216384,
				"accountOrg": "2371682382681600",
				"groupNumber": 1,
				"lineno": 10,
				"createTime": "2022-04-01 15:27:14",
				"businesstypeCode": "A70004",
				"main_unit_id": 2353530000216320,
				"morphologyconversionsn": {
					"detailId": 0,
					"id": 0,
					"sn": "",
					"pubts": "",
					"mainId": 0
				}
			}
		],
		"sumRecordList": [
			{
				"natCurrency_moneyDigit": 0,
				"morphologyconversiondetail_stockUnitId": 0,
				"natCurrency_priceDigit": 0,
				"qty": 0,
				"morphologyconversiondetail_mainUnitId": 0,
				"unit_Precision": 0,
				"morphologyconversiondetail_qty": 0,
				"accountOrg": "",
				"morphologyconversiondetail_id": 0,
				"subQty": 0,
				"MorphologyConversionDetail_qty": 0,
				"stockUnitId_precision": 0
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


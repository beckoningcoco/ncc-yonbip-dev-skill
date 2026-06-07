---
title: "形态转换单详情查询"
apiId: "89844c56e4f64d4c897eb5a0e6e078ce"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Transformation Sheet"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transformation Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 形态转换单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Transformation Sheet (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/morphologyconversion/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 业务数据ID，注意ID与单据编号不能同时为空。 |
| code | string | query | 否 | 单据编号，注意ID与单据编号不能同时为空。 |

## 3. 请求示例

Url: /yonbip/scm/morphologyconversion/detail?access_token=访问令牌&id=&code=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | long | 否 | 请求响应码，200时表示成功 示例：200 |
| message | string | 否 | 请求响应信息 示例：操作成功 |
| data | object | 否 | 请求响应数据 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审批状态，0：初始开立；1：审核中；2:已审核；4：提交后驳回开立态； 示例：0 |
| beforeWarehouseName | string | 否 | 转换前仓库 示例：CSE普仓1 |
| code | string | 否 | 单据编号 示例：XTZH20220401000003 |
| shop | long | 否 | 商家id 示例：-1 |
| masterOrgKeyField | string | 否 | 库存组织字段 示例：org |
| afterWarehouse | long | 否 | 转换后仓库id 示例：2370737867149568 |
| conversionType | int | 否 | 转换类型，1:一对一；2:多对一；3:一对多； 示例：3 |
| department | long | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| operator | long | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| remark | string | 否 | 备注 |
| batchno | string | 否 | 批次号 |
| goodsposition | long | 否 | 货位id |
| producedate | string | 否 | 生产日期（格式：yyyy-MM-dd） |
| invaliddate | string | 否 | 失效日期（格式：yyyy-MM-dd） |
| fixedQuantity | float | 否 | 固定用量 |
| numeratorQuantity | float | 否 | 分子用量 |
| denominatorQuantity | float | 否 | 分母用量 |
| unitUseQuantity | float | 否 | 单位用量 |
| warehousePersonName | string | 否 | 库管员名称 |
| warehousePersonId | long | 否 | 库管员id |
| vouchdate | string | 否 | 单据日期 示例：2022-04-01 00:00:00 |
| natCurrency | string | 否 | 本币id 示例：2352475617481216 |
| businesstypeName | string | 否 | 业务类型名称 示例：拆卸 |
| accountOrgName | string | 否 | 会计主体 示例：95总公司 |
| orgCode | string | 否 | 库存组织编码 示例：95zgs |
| afterWarehouseName | string | 否 | 转换后仓库 示例：CSE仓库2 |
| afterWarehouse_isGoodsPositionStock | boolean | 否 | 仓库货位是否记存量，true：是；false：否； 示例：false |
| id | long | 否 | 主键ID 示例：2713158178755072 |
| pubts | string | 否 | 时间戳 示例：2022-04-01 15:27:15 |
| beforeWarehouse_isGoodsPosition | boolean | 否 | 转换前仓库是否货位管理，true：是；false：否； 示例：false |
| createDate | string | 否 | 创建日期 示例：2022-04-01 00:00:00 |
| morphologyconversiondetail | object | 是 | 子表数据 |
| businesstypeId | string | 否 | 交易类型id 示例：2352475251151360 |
| creator | string | 否 | 创建人 示例：柴守娥 |
| orgName | string | 否 | 库存组织名称 示例：95总公司 |
| org | string | 否 | 库存组织id 示例：2371682382681600 |
| isWfControlled | boolean | 否 | 是否审批流控制，true：是；false：否； 示例：false |
| afterWarehouse_isGoodsPosition | boolean | 否 | 转换前仓库是否货位管理，true：是；false：否； 示例：false |
| beforeWarehouse | long | 否 | 转换前仓库id 示例：2355082071216384 |
| accountOrg | string | 否 | 会计主体id 示例：2371682382681600 |
| mcType | string | 否 | 转换纬度 示例：{"mcType":"4"} |
| beforeWarehouse_iSerialManage | boolean | 否 | 转换前仓库是否序列号管理，true：是；false：否； 示例：false |
| transTypeKeyField | string | 否 | 业务类型字段 示例：businesstypeId |
| barCode | string | 否 | 单据条码 示例：st_morphologyconversion|2713158178755072 |
| natCurrency_moneyDigit | long | 否 | 币种金额精度 示例：2 |
| natCurrency_priceDigit | long | 否 | 币种单价精度 示例：2 |
| createTime | string | 否 | 创建时间 示例：2022-04-01 15:27:14 |
| businesstypeCode | string | 否 | 业务类型编码 示例：A70004 |
| afterWarehouse_iSerialManage | boolean | 否 | 转换后仓库是否序列号管理，true：是；false：否； 示例：false |
| beforeWarehouse_isGoodsPositionStock | boolean | 否 | 仓库货位是否记存量，true：是；false：否； 示例：false |
| headItem | object | 否 | 表头自定义项 |
| status | int | 否 | 单据状态，0:开立状态；3:审核中；1:已审核； 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"returncount": 0,
		"verifystate": 0,
		"beforeWarehouseName": "CSE普仓1",
		"code": "XTZH20220401000003",
		"shop": -1,
		"masterOrgKeyField": "org",
		"afterWarehouse": 2370737867149568,
		"conversionType": 3,
		"department": 0,
		"department_name": "",
		"operator": 0,
		"operator_name": "",
		"remark": "",
		"batchno": "",
		"goodsposition": 0,
		"producedate": "",
		"invaliddate": "",
		"fixedQuantity": 0,
		"numeratorQuantity": 0,
		"denominatorQuantity": 0,
		"unitUseQuantity": 0,
		"warehousePersonName": "",
		"warehousePersonId": 0,
		"vouchdate": "2022-04-01 00:00:00",
		"natCurrency": "2352475617481216",
		"businesstypeName": "拆卸",
		"accountOrgName": "95总公司",
		"orgCode": "95zgs",
		"afterWarehouseName": "CSE仓库2",
		"afterWarehouse_isGoodsPositionStock": false,
		"id": 2713158178755072,
		"pubts": "2022-04-01 15:27:15",
		"beforeWarehouse_isGoodsPosition": false,
		"createDate": "2022-04-01 00:00:00",
		"morphologyconversiondetail": [
			{
				"productSpecitem": "CSE颜色规格:CSE红;CSE大小规格:大;",
				"stockUnit_name": "个",
				"warehouse_isGoodsPositionStock": false,
				"stockStatusDoc": 2346257360557210,
				"stockStatusDoc_name": "合格",
				"warehouseName": "CSE普仓1",
				"subQty": 2,
				"productName": "CSE多规格物料",
				"defines": {
					"define1": "",
					"define2": "",
					"id": ""
				},
				"scrap": 0,
				"free2": "大",
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"lineType": 3,
				"free1": "CSE红",
				"productClassName": "CSE物料分类",
				"stockUnitId_Precision": 2,
				"warehouse_isGoodsPosition": false,
				"id": 2713158178755073,
				"bomSelect": "1",
				"pubts": "2022-04-01 15:27:14",
				"isSerialNoManage": false,
				"product_model": "CSE型号2",
				"productskuName": "CSE多规格物料CSE红大",
				"mainUnitId": 2353530000216320,
				"proratadistribution": 100,
				"bomId": 2713068188373504,
				"product": 2355070652485888,
				"productClass": 2353527630729472,
				"unitExchangeType": 0,
				"warehouse": 2355082071216384,
				"warehouse_iSerialManage": false,
				"groupNumber": 1,
				"modelDescription": "CSE规格说明2",
				"mainUnitName": "个",
				"lineno": 10,
				"productCode": "000008",
				"productsku": 2355070652485889,
				"morphologyConversionId": 2713158178755072,
				"qty": 2,
				"unit_Precision": 2,
				"productskuCode": "000013",
				"isSerialNoManage_source": false,
				"invExchRate": 1,
				"stockUnitId": 2353530000216320,
				"morphologyconversionsn": {
					"detailId": 0,
					"id": 0,
					"sn": "",
					"pubts": "",
					"mainId": 0
				},
				"bodyItem": {
					"id": 0,
					"define5": "",
					"define11": ""
				}
			}
		],
		"businesstypeId": "2352475251151360",
		"creator": "柴守娥",
		"orgName": "95总公司",
		"org": "2371682382681600",
		"isWfControlled": false,
		"afterWarehouse_isGoodsPosition": false,
		"beforeWarehouse": 2355082071216384,
		"accountOrg": "2371682382681600",
		"mcType": "{\"mcType\":\"4\"}",
		"beforeWarehouse_iSerialManage": false,
		"transTypeKeyField": "businesstypeId",
		"barCode": "st_morphologyconversion|2713158178755072",
		"natCurrency_moneyDigit": 2,
		"natCurrency_priceDigit": 2,
		"createTime": "2022-04-01 15:27:14",
		"businesstypeCode": "A70004",
		"afterWarehouse_iSerialManage": false,
		"beforeWarehouse_isGoodsPositionStock": false,
		"headItem": {
			"id": 0,
			"define1": "",
			"define3": ""
		},
		"status": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	系统异常	根据返回提示信息做相应处理


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


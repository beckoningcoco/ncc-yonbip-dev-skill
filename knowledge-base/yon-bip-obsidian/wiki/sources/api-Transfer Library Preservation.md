---
title: "转库保存"
apiId: "08139bebea694aedab7f59017755a843"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Stock Transfer Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stock Transfer Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 转库保存

> `ContentType	application/json` 请求方式	POST | 分类: Stock Transfer Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/storetransfer/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 转库单请求体集合 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| org | string | 否 | 是 | 库存组织code或id 示例：A23001 |
| org_name | string | 否 | 否 | 库存组织名称 示例：小鸟婷婷 |
| accountOrg | string | 否 | 否 | 会计主体id 示例：1984188314292280 |
| accountOrg_name | string | 否 | 否 | 会计主体名称 示例：cc会计主体 |
| code | string | 否 | 否 | 单据编号，编码规则是手动时必填 示例：ZK20210417000002 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-04-17 00:00:00 |
| businesstype | string | 否 | 是 | 交易类型code或id 示例：110000000000019 |
| businesstype_name | string | 否 | 否 | 交易类型名称 示例：转库单 |
| status | long | 否 | 否 | 单据状态，由系统业务自动生成，接口无需传值。 |
| verifystate | long | 否 | 否 | 审批状态，由系统业务自动生成，接口无需传值。 |
| store | string | 否 | 否 | 门店code或id 示例：1984188314292480 |
| store_name | string | 否 | 否 | 门店名称 示例：门店1 |
| outWarehouse | string | 否 | 是 | 出库仓库code或id 示例：02 |
| outWarehouse_name | string | 否 | 否 | 出库仓库名称 示例：北京科捷样品仓 |
| inWarehouse | string | 否 | 是 | 入库仓库code或id 示例：1920126858645760 |
| inWarehouse_name | string | 否 | 否 | 入库仓库名称 示例：inWarehouse_name |
| department | string | 否 | 否 | 部门id或code 示例：1984188314292250 |
| department_name | string | 否 | 否 | 部门名称 示例：dd销售部 |
| stockMgr | string | 否 | 否 | 库管员code或id 示例：1984222114292250 |
| stockMgr_name | string | 否 | 否 | 库管员名称 示例：王小二 |
| totalPieces | string | 否 | 否 | 整单件数 示例：122 |
| operator | long | 否 | 否 | 业务员code或id 示例：1920126858645720 |
| operator_name | string | 否 | 否 | 业务员名称 示例：王小二 |
| creator | long | 否 | 否 | 创建人 示例：1920126858645721 |
| createTime | string | 否 | 否 | 创建时间 示例：2021-04-27 13:50:22 |
| createDate | string | 否 | 否 | 创建日期 示例：2021-04-27 00:00:00 |
| modifier | string | 否 | 否 | 修改人 示例：王小二 |
| modifyTime | string | 否 | 否 | 修改时间 示例：2021-04-27 14:50:22 |
| modifyDate | string | 否 | 否 | 修改日期 示例：2021-04-27 00:00:00 |
| auditor | string | 否 | 否 | 审核人 示例：1984188314292280 |
| auditTime | string | 否 | 否 | 审核时间 示例：2021-04-27 14:50:22 |
| auditDate | string | 否 | 否 | 审核日期 示例：2021-04-27 00:00:00 |
| id | long | 否 | 否 | 转库单主表ID，更新操作时必填 示例：1920126858642000 |
| memo | string | 否 | 否 | 备注 示例：表头备注 |
| totalQuantity | string | 否 | 否 | 整单数量 示例：122 |
| outWarehouse_iSerialManage | boolean | 否 | 否 | 出库仓库是否序列号严格管理，true是、false否。 示例：false |
| inWarehouse_iSerialManage | boolean | 否 | 否 | 入库仓库是否序列号严格管理，true是、false否。 示例：false |
| inWarehouse_isGoodsPosition | boolean | 否 | 否 | 入仓库是否货位管理，true是、false否。 示例：false |
| warehouse_isGoodsPosition | boolean | 否 | 否 | 出仓库是否货位管理，true是、false否。 示例：false |
| ecsuiteperson | long | 否 | 否 | 气泡联系人 示例：1984222114292220 |
| isWfControlled | boolean | 否 | 否 | 是否为审批流控制，true是、false否。 示例：true |
| returncount | long | 否 | 否 | 返回次数 示例：0 |
| storeTransCustomItem | object | 否 | 否 | 转库单表头自定义项 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| details | object | 是 | 是 | 转库单子表[st.storetrans.StoreTransDetail] |

## 3. 请求示例

Url: /yonbip/scm/storetransfer/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "A23001",
		"org_name": "小鸟婷婷",
		"accountOrg": "1984188314292280",
		"accountOrg_name": "cc会计主体",
		"code": "ZK20210417000002",
		"vouchdate": "2021-04-17 00:00:00",
		"businesstype": "110000000000019",
		"businesstype_name": "转库单",
		"status": 0,
		"verifystate": 0,
		"store": "1984188314292480",
		"store_name": "门店1",
		"outWarehouse": "02",
		"outWarehouse_name": "北京科捷样品仓",
		"inWarehouse": "1920126858645760",
		"inWarehouse_name": "inWarehouse_name",
		"department": "1984188314292250",
		"department_name": "dd销售部",
		"stockMgr": "1984222114292250",
		"stockMgr_name": "王小二",
		"totalPieces": "122",
		"operator": 1920126858645720,
		"operator_name": "王小二",
		"creator": 1920126858645721,
		"createTime": "2021-04-27 13:50:22",
		"createDate": "2021-04-27 00:00:00",
		"modifier": "王小二",
		"modifyTime": "2021-04-27 14:50:22",
		"modifyDate": "2021-04-27 00:00:00",
		"auditor": "1984188314292280",
		"auditTime": "2021-04-27 14:50:22",
		"auditDate": "2021-04-27 00:00:00",
		"id": 1920126858642000,
		"memo": "表头备注",
		"totalQuantity": "122",
		"outWarehouse_iSerialManage": false,
		"inWarehouse_iSerialManage": false,
		"inWarehouse_isGoodsPosition": false,
		"warehouse_isGoodsPosition": false,
		"ecsuiteperson": 1984222114292220,
		"isWfControlled": true,
		"returncount": 0,
		"storeTransCustomItem": {
			"id": "表头自定义项id",
			"define1": "表头自定义项",
			"define2": "表头自定义项",
			"define3": "表头自定义项",
			"define4": "表头自定义项",
			"define5": "表头自定义项",
			"define6": "表头自定义项",
			"define7": "表头自定义项",
			"define8": "表头自定义项",
			"define9": "表头自定义项",
			"define10": "表头自定义项",
			"define11": "表头自定义项",
			"define12": "表头自定义项",
			"define13": "表头自定义项",
			"define14": "表头自定义项",
			"define15": "表头自定义项",
			"define16": "表头自定义项",
			"define17": "表头自定义项",
			"define18": "表头自定义项",
			"define19": "表头自定义项",
			"define20": "表头自定义项",
			"define21": "表头自定义项",
			"define22": "表头自定义项",
			"define23": "表头自定义项",
			"define24": "表头自定义项",
			"define25": "表头自定义项",
			"define26": "表头自定义项",
			"define27": "表头自定义项",
			"define28": "表头自定义项",
			"define29": "表头自定义项",
			"define30": "表头自定义项",
			"define31": "表头自定义项",
			"define32": "表头自定义项",
			"define33": "表头自定义项",
			"define34": "表头自定义项",
			"define35": "表头自定义项",
			"define36": "表头自定义项",
			"define37": "表头自定义项",
			"define38": "表头自定义项",
			"define39": "表头自定义项",
			"define40": "表头自定义项",
			"define41": "表头自定义项",
			"define42": "表头自定义项",
			"define43": "表头自定义项",
			"define44": "表头自定义项",
			"define45": "表头自定义项",
			"define46": "表头自定义项",
			"define47": "表头自定义项",
			"define48": "表头自定义项",
			"define49": "表头自定义项",
			"define50": "表头自定义项",
			"define51": "表头自定义项",
			"define52": "表头自定义项",
			"define53": "表头自定义项",
			"define54": "表头自定义项",
			"define55": "表头自定义项",
			"define56": "表头自定义项",
			"define57": "表头自定义项",
			"define58": "表头自定义项",
			"define59": "表头自定义项",
			"define60": "表头自定义项"
		},
		"_status": "Insert",
		"details": [
			{
				"isSerialNoManage": false,
				"mainid": 1920126858642000,
				"product": "1920126858647891",
				"product_cCode": "CC00101",
				"product_cName": "铜锣烧",
				"product_model": "包",
				"modelDescription": "30g/包",
				"prodefine1": "商品自定义项",
				"prodefine2": "商品自定义项",
				"prodefine3": "商品自定义项",
				"prodefine4": "商品自定义项",
				"prodefine5": "商品自定义项",
				"prodefine6": "商品自定义项",
				"prodefine7": "商品自定义项",
				"prodefine8": "商品自定义项",
				"prodefine9": "商品自定义项",
				"prodefine10": "商品自定义项",
				"prodefine11": "商品自定义项",
				"prodefine12": "商品自定义项",
				"prodefine13": "商品自定义项",
				"prodefine14": "商品自定义项",
				"prodefine15": "商品自定义项",
				"prodefine16": "商品自定义项",
				"prodefine17": "商品自定义项",
				"prodefine18": "商品自定义项",
				"prodefine19": "商品自定义项",
				"prodefine20": "商品自定义项",
				"prodefine21": "商品自定义项",
				"prodefine22": "商品自定义项",
				"prodefine23": "商品自定义项",
				"prodefine24": "商品自定义项",
				"prodefine25": "商品自定义项",
				"prodefine26": "商品自定义项",
				"prodefine27": "商品自定义项",
				"prodefine28": "商品自定义项",
				"prodefine29": "商品自定义项",
				"prodefine30": "商品自定义项",
				"productsku": "1920126858647892",
				"productsku_cCode": "CC00101-1",
				"productsku_cName": "铜锣烧50g",
				"skudefine1": "sku自定义项",
				"skudefine2": "sku自定义项",
				"skudefine3": "sku自定义项",
				"skudefine4": "sku自定义项",
				"skudefine5": "sku自定义项",
				"skudefine6": "sku自定义项",
				"skudefine7": "sku自定义项",
				"skudefine8": "sku自定义项",
				"skudefine9": "sku自定义项",
				"skudefine10": "sku自定义项",
				"skudefine11": "sku自定义项",
				"skudefine12": "sku自定义项",
				"skudefine13": "sku自定义项",
				"skudefine14": "sku自定义项",
				"skudefine15": "sku自定义项",
				"skudefine16": "sku自定义项",
				"skudefine17": "sku自定义项",
				"skudefine18": "sku自定义项",
				"skudefine19": "sku自定义项",
				"skudefine20": "sku自定义项",
				"skudefine21": "sku自定义项",
				"skudefine22": "sku自定义项",
				"skudefine23": "sku自定义项",
				"skudefine24": "sku自定义项",
				"skudefine25": "sku自定义项",
				"skudefine26": "sku自定义项",
				"skudefine27": "sku自定义项",
				"skudefine28": "sku自定义项",
				"skudefine29": "sku自定义项",
				"skudefine30": "sku自定义项",
				"skudefine31": "sku自定义项",
				"skudefine32": "sku自定义项",
				"skudefine33": "sku自定义项",
				"skudefine34": "sku自定义项",
				"skudefine35": "sku自定义项",
				"skudefine36": "sku自定义项",
				"skudefine37": "sku自定义项",
				"skudefine38": "sku自定义项",
				"skudefine39": "sku自定义项",
				"skudefine40": "sku自定义项",
				"skudefine41": "sku自定义项",
				"skudefine42": "sku自定义项",
				"skudefine43": "sku自定义项",
				"skudefine44": "sku自定义项",
				"skudefine45": "sku自定义项",
				"skudefine46": "sku自定义项",
				"skudefine47": "sku自定义项",
				"skudefine48": "sku自定义项",
				"skudefine49": "sku自定义项",
				"skudefine50": "sku自定义项",
				"skudefine51": "sku自定义项",
				"skudefine52": "sku自定义项",
				"skudefine53": "sku自定义项",
				"skudefine54": "sku自定义项",
				"skudefine55": "sku自定义项",
				"skudefine56": "sku自定义项",
				"skudefine57": "sku自定义项",
				"skudefine58": "sku自定义项",
				"skudefine59": "sku自定义项",
				"skudefine60": "sku自定义项",
				"free1": "商品规格",
				"free2": "商品规格",
				"free3": "商品规格",
				"free4": "商品规格",
				"free5": "商品规格",
				"free6": "商品规格",
				"free7": "商品规格",
				"free8": "商品规格",
				"free9": "商品规格",
				"free10": "商品规格",
				"propertiesValue": "30g/包",
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"batchno": "bt001",
				"producedate": "2021-04-27 00:00:00",
				"invaliddate": "2021-10-27 00:00:00",
				"expireDateNo": "1",
				"expireDateUnit": 1,
				"define1": "批次属性",
				"define2": "批次属性",
				"define3": "批次属性",
				"define4": "批次属性",
				"define5": "批次属性",
				"define6": "批次属性",
				"define7": "批次属性",
				"define8": "批次属性",
				"define9": "批次属性",
				"define10": "批次属性",
				"define11": "批次属性",
				"define12": "批次属性",
				"define13": "批次属性",
				"define14": "批次属性",
				"define15": "批次属性",
				"define16": "批次属性",
				"define17": "批次属性",
				"define18": "批次属性",
				"define19": "批次属性",
				"define20": "批次属性",
				"define21": "批次属性",
				"define22": "批次属性",
				"define23": "批次属性",
				"define24": "批次属性",
				"define25": "批次属性",
				"define26": "批次属性",
				"define27": "批次属性",
				"define28": "批次属性",
				"define29": "批次属性",
				"define30": "批次属性",
				"id": 1920126858642001,
				"detailsid": 1920126858642001,
				"contactsQuantity": "12",
				"contactsPieces": "12",
				"qty": "12",
				"unit": "1836523958194432",
				"unitName": "件（精度2）",
				"invExchRate": "1",
				"subQty": "12",
				"stockUnitId": "1836523958194432",
				"stockUnit_name": "件（精度2）",
				"goodsposition": "1836523958191100",
				"ingoodsposition": "1836523958191200",
				"project": 1836523218191100,
				"project_code": "cp02001",
				"project_name": "小鸟项目",
				"unitExchangeType": "1",
				"memo": "表体备注",
				"detailsmemo": "表体备注",
				"storeTransDetailCustomItem": {
					"id": 1920126858642001,
					"define1": "表体自定义项",
					"define2": "表体自定义项",
					"define3": "表体自定义项",
					"define4": "表体自定义项",
					"define5": "表体自定义项",
					"define6": "表体自定义项",
					"define7": "表体自定义项",
					"define8": "表体自定义项",
					"define9": "表体自定义项",
					"define10": "表体自定义项",
					"define11": "表体自定义项",
					"define12": "表体自定义项",
					"define13": "表体自定义项",
					"define14": "表体自定义项",
					"define15": "表体自定义项",
					"define16": "表体自定义项",
					"define17": "表体自定义项",
					"define18": "表体自定义项",
					"define19": "表体自定义项",
					"define20": "表体自定义项",
					"define21": "表体自定义项",
					"define22": "表体自定义项",
					"define23": "表体自定义项",
					"define24": "表体自定义项",
					"define25": "表体自定义项",
					"define26": "表体自定义项",
					"define27": "表体自定义项",
					"define28": "表体自定义项",
					"define29": "表体自定义项",
					"define30": "表体自定义项",
					"define31": "表体自定义项",
					"define32": "表体自定义项",
					"define33": "表体自定义项",
					"define34": "表体自定义项",
					"define35": "表体自定义项",
					"define36": "表体自定义项",
					"define37": "表体自定义项",
					"define38": "表体自定义项",
					"define39": "表体自定义项",
					"define40": "表体自定义项",
					"define41": "表体自定义项",
					"define42": "表体自定义项",
					"define43": "表体自定义项",
					"define44": "表体自定义项",
					"define45": "表体自定义项",
					"define46": "表体自定义项",
					"define47": "表体自定义项",
					"define48": "表体自定义项",
					"define49": "表体自定义项",
					"define50": "表体自定义项",
					"define51": "表体自定义项",
					"define52": "表体自定义项",
					"define53": "表体自定义项",
					"define54": "表体自定义项",
					"define55": "表体自定义项",
					"define56": "表体自定义项",
					"define57": "表体自定义项",
					"define58": "表体自定义项",
					"define59": "表体自定义项",
					"define60": "表体自定义项"
				},
				"storeTransDetailSNs": [
					{
						"id": 1920126858642002,
						"grandpaid": 1920126858642000,
						"detailid": 1920126858642001,
						"sn": "sn001",
						"sndefine1": "序列号自定义项",
						"sndefine2": "序列号自定义项",
						"sndefine3": "序列号自定义项",
						"sndefine4": "序列号自定义项",
						"sndefine5": "序列号自定义项",
						"sndefine6": "序列号自定义项",
						"sndefine7": "序列号自定义项",
						"sndefine8": "序列号自定义项",
						"sndefine9": "序列号自定义项",
						"sndefine10": "序列号自定义项",
						"sndefine11": "序列号自定义项",
						"sndefine12": "序列号自定义项",
						"sndefine13": "序列号自定义项",
						"sndefine14": "序列号自定义项",
						"sndefine15": "序列号自定义项",
						"sndefine16": "序列号自定义项",
						"sndefine17": "序列号自定义项",
						"sndefine18": "序列号自定义项",
						"sndefine19": "序列号自定义项",
						"sndefine20": "序列号自定义项",
						"sndefine21": "序列号自定义项",
						"sndefine22": "序列号自定义项",
						"sndefine23": "序列号自定义项",
						"sndefine24": "序列号自定义项",
						"sndefine25": "序列号自定义项",
						"sndefine26": "序列号自定义项",
						"sndefine27": "序列号自定义项",
						"sndefine28": "序列号自定义项",
						"sndefine29": "序列号自定义项",
						"sndefine30": "序列号自定义项",
						"_status": "Insert"
					}
				],
				"_status": "Insert"
			}
		]
	}
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
| code | string | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回提示信息 示例：操作成功 |
| data | object | 否 | 请求返回数据集 |
| count | long | 否 | 返回总数 示例：1 |
| sucessCount | long | 否 | 返回成功总数 示例：1 |
| failCount | long | 否 | 返回失败总数 示例：0 |
| messages | string | 是 | 提示信息 |
| infos | object | 是 | 返回单据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "ZK20210428000001",
				"creatorId": 1828157065564416,
				"outWarehouse_name": "wzy货位仓",
				"businesstype": "110000000000019",
				"vouchdate": "2021-04-28 00:00:00",
				"details": [
					{
						"stockUnit_name": "个（精度2）",
						"product_cCode": "0000000067",
						"subQty": 10,
						"product_cName": "海绵",
						"isBatchManage": false,
						"isExpiryDateManage": false,
						"id": 2234780147273985,
						"mainid": 2234780147273984,
						"pubts": "2021-04-28 16:55:55",
						"stockUnit_Precision": 2,
						"isSerialNoManage": false,
						"product": 2013892214591744,
						"outStockStatusDoc": 2006555827382146,
						"unitName": "个（精度2）",
						"unitPrecision": 2,
						"yTenantId": "h9atv6yc",
						"inStockStatusDoc": 2006555827382146,
						"unit": 1836502351286528,
						"productsku": 2013892248129792,
						"productsku_cCode": "0000000067",
						"qty": 10,
						"invExchRate": 1,
						"stockUnitId": 1836502351286528,
						"storeTransDetailSNs": [
							{
								"sn": "cc10001",
								"id": 2305600287085824,
								"detailid": 2305600287069442,
								"grandpaid": 2305600287069440,
								"pubts": "2021-06-17 17:37:54"
							}
						]
					}
				],
				"inWarehouse_name": "wzy仓库2",
				"id": 2234780147273984,
				"pubts": "2021-04-28 16:55:57",
				"tenant": 1828157064990976,
				"createDate": "2021-04-28 16:55:55",
				"outWarehouse": 2078745182310656,
				"outWarehouse_iSerialManage": true,
				"creator": "YonSuite默认用户",
				"inWarehouse": 1976990877110528,
				"org": "1916459579707648",
				"isWfControlled": false,
				"accountOrg": "1916459579707648",
				"yTenantId": "h9atv6yc",
				"barCode": "st_storetransfer|2234780147273984",
				"wStore": false,
				"createTime": "2021-04-28 16:55:55",
				"businesstype_name": "转库单",
				"status": 0
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	库存组织没启用库存，不允许保存库存单据！请在组织档案中为当前库存组织设置启用期间	检查库存组织是否填写正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-18

更新

请求参数 goodsposition

更新

请求参数 ingoodsposition

删除

请求参数 ingoodsposition_cName

删除

请求参数 goodsposition_cName


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


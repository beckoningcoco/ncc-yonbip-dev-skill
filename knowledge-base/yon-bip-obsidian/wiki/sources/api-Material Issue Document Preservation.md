---
title: "材料出库单个保存"
apiId: "2310904722736283652"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Issue Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Issue Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 材料出库单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Material Issue Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/materialout/single/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 材料出库单[st.materialout.MaterialOut] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| org | string | 否 | 是 | 库存组织id，或库存组织code 示例：00000 |
| id | string | 否 | 否 | 主表id 新增时无需填写，修改时必填 |
| code | string | 否 | 否 | 单据编号 设置手工编号时必输，自动编号时输入无效 示例：liulicailiaochuku001 |
| calcLinesKey | string | 否 | 否 | 表体行计算依据，不传或传入null时默认不计算，已传入为准。支持传入：natUnitPrice、natMoney。作为计算依据的金额类字段，表体中对应参数不可为空。 示例：natMoney |
| calcLinesQtyKey | string | 否 | 否 | 表体行计算数量件数依据，已传入为准。仅支持传入：qty,subQty。作为计算依据的数量类字段，表体中对应参数不可为空。 示例：qty |
| accountOrg | string | 否 | 否 | 会计主体id，或会计主体code 示例：00000 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2022-09-05 00:00:00 |
| store | string | 否 | 否 | 门店id，或门店code |
| factoryOrg | string | 否 | 是 | 领用组织id或领用组织code 示例：00000 |
| warehouse_isGoodsPosition | string | 否 | 否 | 仓库是否货位管理：true：是、false：否 示例：false |
| warehouse_iSerialManage | string | 否 | 否 | 仓库是否序列号：true、false |
| warehouse | string | 否 | 是 | 仓库id，或仓库code 示例：1513053017970049032 |
| bustype | string | 否 | 是 | 交易类型id，或交易类型code 示例：1508510411464376357 |
| factoryFiOrg | string | 否 | 否 | 领用会计主体ID 示例：00000 |
| department | string | 否 | 否 | 部门id，或部门code（会计主体启用成本中心后，部门不能为空） 示例：1509141617039638535 |
| operator | string | 否 | 否 | 业务员id，或业务员code |
| stockMgr | string | 否 | 否 | 库管员id，或库管员code |
| memo | string | 否 | 否 | 备注 示例：memo |
| pubts | DateTime | 否 | 否 | 时间戳，更新时必填 示例：2023-02-02 18:07:51 |
| isCopy | string | 否 | 否 | 是否复制, true:是、false:否、 |
| bustype_extend_attrs_json | string | 否 | 否 | 出库类型 |
| headItem | object | 否 | 否 | 表头自定义项集合 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| materOuts | object | 是 | 是 | 材料出库单子表[st.materialout.MaterialOuts] |
| out_sys_id | string | 否 | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 否 | 外部来源类型 |

## 3. 请求示例

Url: /yonbip/SCC/materialout/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "00000",
		"id": "",
		"code": "liulicailiaochuku001",
		"calcLinesKey": "natMoney",
		"calcLinesQtyKey": "qty",
		"accountOrg": "00000",
		"vouchdate": "2022-09-05 00:00:00",
		"store": "",
		"factoryOrg": "00000",
		"warehouse_isGoodsPosition": "false",
		"warehouse_iSerialManage": "",
		"warehouse": "1513053017970049032",
		"bustype": "1508510411464376357",
		"factoryFiOrg": "00000",
		"department": "1509141617039638535",
		"operator": "",
		"stockMgr": "",
		"memo": "memo",
		"pubts": "2023-02-02 18:07:51",
		"isCopy": "",
		"bustype_extend_attrs_json": "",
		"headItem": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"_status": "",
		"materOuts": [
			{
				"isSerialNoManage": "true",
				"id": "",
				"product": "1536085450119184391",
				"productsku": "1536088894682955785",
				"productskuCp": "",
				"propertiesValue": "",
				"batchno": "201001",
				"expireDateNo": "1",
				"expireDateUnit": "",
				"producedate": "2022-09-01",
				"invaliddate": "2022-10-01",
				"isBatchManage": "true",
				"isExpiryDateManage": "true",
				"qty": 2,
				"unit": "1514583503798796288",
				"stockUnitId": "1509143386569834498",
				"invExchRate": 1,
				"unitExchangeType": "0",
				"subQty": 2,
				"goodsposition": "",
				"autoCalcCost": "",
				"natUnitPrice": "1",
				"natMoney": "1",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"mainid": "",
				"pubts": "2023-02-02 18:07:51",
				"project": "",
				"expenseItems": "",
				"budgetUnitPrice": 1,
				"budgetMoney": 1,
				"memo": "",
				"product_model": "",
				"product_modelDescription": "",
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"_status": "Insert",
				"materOutsSNs": [
					{
						"id": 0,
						"sn": "",
						"_status": "Insert"
					}
				],
				"bodyParallel": {
					"id": 0,
					"returnStockReasonId": 1834229126116933638
				},
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | object | 否 | 错误信息 |

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
				"org": "1509137322072342531",
				"org_name": "",
				"accountOrg_name": "",
				"accountOrg": "1509137322072342531",
				"natCurrency_moneyDigit": "",
				"natCurrency_priceDigit": "",
				"code": "CLCK20221202000000",
				"vouchdate": "2022-12-02 00:00:00",
				"store": "",
				"store_name": "",
				"factoryOrg": "1509137322072342531",
				"warehouse_name": "",
				"warehouse_isGoodsPosition": false,
				"factory_name": "",
				"warehouse_iSerialManage": false,
				"warehouse": 1513053017970049032,
				"factoryFiOrg_name": "",
				"bustype": "1508510411464376357",
				"factoryFiOrg": "1509137322072342531",
				"bustype_name": "",
				"department_name": "",
				"department": "1509141617039638535",
				"operator": "",
				"operator_name": "",
				"stockMgr_name": "",
				"stockMgr": "",
				"expenseItems": 0,
				"expenseItems_name": "",
				"expenseItems_code": "",
				"budgetUnitPrice": 0,
				"budgetMoney": 0,
				"memo": "memo",
				"totalQuantity": 0,
				"totalPieces": 0,
				"isCopy": "",
				"bustype_extend_attrs_json": "",
				"status": 0,
				"creator": "",
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"id": 1609368784861134857,
				"pubts": "2022-12-09 11:06:27",
				"tplid": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"ecsuiteperson": "",
				"materOuts": [
					{
						"isSerialNoManage": "false",
						"product": 1536085450119184391,
						"product_cCode": "0001000041",
						"product_cName": "琉璃物料004-固定换算率",
						"currentqty": 0,
						"availableqty": 0,
						"productsku": 1536088894682955785,
						"productsku_cCode": "",
						"productsku_cName": "",
						"productskuCp": "",
						"productskuCp_cCode": "",
						"productskuCp_cName": "",
						"propertiesValue": "",
						"batchno": "201001",
						"expireDateNo": 0,
						"expireDateUnit": 0,
						"producedate": "2022-12-02 00:00:00",
						"invaliddate": "2022-12-31 00:00:00",
						"isBatchManage": true,
						"isExpiryDateManage": true,
						"taxRate": 0,
						"oriTax": "",
						"oriSum": "",
						"oriMoney": "",
						"oriTaxUnitPrice": "",
						"oriUnitPrice": "",
						"natTax": 0,
						"natSum": 0,
						"natTaxUnitPrice": 0,
						"qty": 2,
						"unit": 1514583503798796288,
						"unit_Precision": 2,
						"product_unitName": "千克",
						"stockUnitId": 1509143386569834498,
						"stockUnitId_Precision": "2",
						"invExchRate": 1,
						"unitExchangeType": 0,
						"subQty": 2,
						"stockUnit_name": "箱",
						"goodsposition": "",
						"goodsposition_cName": "",
						"natUnitPrice": 0,
						"autoCalcCost": "",
						"natMoney": 0,
						"contactsQuantity": 0,
						"contactsPieces": 0,
						"mainid": 1609368784861134857,
						"project": "",
						"project_name": "",
						"memo": "meno",
						"recorddate": "",
						"id": 1609368784861134858,
						"pubts": "2022-12-09 11:06:27",
						"product_model": "",
						"product_modelDescription": "",
						"fixedQuantity": "",
						"recipientQuantity": 0,
						"receivedQuantity": 0,
						"substituteFlag": "",
						"supplyType": "",
						"bodyItem": {
							"id": "",
							"define1": "",
							"define2": ""
						},
						"bodyParallel": {
							"id": 1609368784861134800,
							"returnStockReasonId": 0
						},
						"out_sys_rowno": "",
						"out_sys_lineid": ""
					}
				],
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": ""
			}
		],
		"failInfos": {}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	系统异常	根据返回提示信息做相应处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

删除

请求参数 ecsuiteperson


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


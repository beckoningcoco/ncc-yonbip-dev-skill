---
title: "产品入库来源生单保存"
apiId: "1429993126260899840"
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

# 产品入库来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Product Receipt (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storeprorecord/mergeSourceData/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 产品入库单[st.storeprorecord.StoreProRecord] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| mergeSourceData | boolean | 否 | 是 | 合并上游数据，固定值传入true |
| calcLinesKey | string | 否 | 否 | 表体行计算依据，不传或传入null时默认不计算，已传入为准。支持传入：natUnitPrice、natMoney。作为计算依据的金额类字段，表体中对应参数不可为空。 |
| code | string | 否 | 否 | 单据编号：以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 |
| vouchdate | DateTime | 否 | 是 | 单据日期，日期格式:yyyy-MM-dd HH:mm:ss |
| bustype | string | 否 | 是 | 交易类型id，或交易类型code |
| warehouse | string | 否 | 否 | 仓库id，或仓库code；上游单据未指定仓库时必输 |
| memo | string | 否 | 否 | 备注 |
| _status | string | 否 | 是 | 操作标识, Insert:新增 |
| storeProRecords | object | 是 | 是 | 产品入库单子表 |

## 3. 请求示例

Url: /yonbip/scm/storeprorecord/mergeSourceData/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"mergeSourceData": true,
		"calcLinesKey": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"warehouse": "",
		"memo": "",
		"_status": "",
		"storeProRecords": [
			{
				"storeproType": "",
				"makeRuleCode": "",
				"sourceid": "",
				"sourceautoid": "",
				"sourceGrandchildrenId": "",
				"qmsResultId": "",
				"batchno": "",
				"producedate": "",
				"goodsposition": "",
				"qty": 0,
				"autoCalcCost": true,
				"natUnitPrice": 0,
				"natMoney": 0,
				"memo": "",
				"productsku": "",
				"processSn": 0,
				"_status": "",
				"StoreProRecordsSNs": [
					{
						"sn": "",
						"_status": ""
					}
				]
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| warehouse | long | 否 | 仓库 |
| tenant | string | 否 | 租户 |
| accountOrg | string | 否 | 会计主体id |
| org | string | 否 | 库存组织id |
| org_name | string | 否 | 库存组织名称 |
| accountOrg_name | string | 否 | 会计主体名称 |
| code | string | 否 | 单据编号 |
| vouchdate | DateTime | 否 | 单据日期 |
| store | long | 否 | 门店id |
| warehouse_name | string | 否 | 仓库名称 |
| warehouse_isGoodsPosition | boolean | 否 | 仓库是否货位管理，true:是、false:否 |
| factoryOrg | string | 否 | 工厂id |
| factory_name | string | 否 | 工厂 |
| factoryFiOrg | string | 否 | 工厂会计主体id |
| factoryFiOrg_name | string | 否 | 工厂会计主体名称 |
| bustype | string | 否 | 交易类型id |
| bustype_code | string | 否 | 交易类型编码 |
| bustype_name | string | 否 | 交易类型名称 |
| bustype_extend_attrs_json | string | 否 | 产品入库类型 |
| shop | string | 否 | 商家 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr | string | 否 | 库管员ID |
| stockMgr_name | string | 否 | 库管员名称 |
| memo | string | 否 | 备注 |
| srcBillType | string | 否 | 来源类型 |
| srcBill | string | 否 | 来源单据 |
| srcBillNO | string | 否 | 来源单据号 |
| status | short | 否 | 单据状态, 0:未提交、1:已提交、 |
| natCurrency_priceDigit | string | 否 | 币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 币种金额精度 |
| totalQuantity | long | 否 | 整单数量(废弃) |
| totalPieces | long | 否 | 整单件数(废弃) |
| totalMaterial | boolean | 否 | 已材料出, true:是、false:否、(废弃) |
| id | long | 否 | 主表id |
| pubts | string | 否 | 时间戳 |
| tplid | string | 否 | 模板id(废弃) |
| creator | string | 否 | 创建人id |
| creatorId | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | DateTime | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | DateTime | 否 | 最后修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| auditDate | string | 否 | 提交日期 |
| modifierId | string | 否 | 修改人 |
| auditorId | string | 否 | 审批人 |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号严格管理，true:是、false:否 |
| headItem | object | 否 | 表头自定义项（1-60） |
| defines | object | 否 | 表头自由自定义项（1-60） |
| storeProRecords | object | 是 | 产品入库单子表[st.storeprorecord.StoreProRecords] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"warehouse": 0,
		"tenant": "",
		"accountOrg": "",
		"org": "",
		"org_name": "",
		"accountOrg_name": "",
		"code": "",
		"vouchdate": "",
		"store": 0,
		"warehouse_name": "",
		"warehouse_isGoodsPosition": true,
		"factoryOrg": "",
		"factory_name": "",
		"factoryFiOrg": "",
		"factoryFiOrg_name": "",
		"bustype": "",
		"bustype_code": "",
		"bustype_name": "",
		"bustype_extend_attrs_json": "",
		"shop": "",
		"department": "",
		"department_name": "",
		"operator": "",
		"operator_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"memo": "",
		"srcBillType": "",
		"srcBill": "",
		"srcBillNO": "",
		"status": 0,
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"totalQuantity": 0,
		"totalPieces": 0,
		"totalMaterial": true,
		"id": 0,
		"pubts": "",
		"tplid": "",
		"creator": "",
		"creatorId": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"modifierId": "",
		"auditorId": "",
		"warehouse_iSerialManage": true,
		"headItem": {
			"id": 0,
			"define1": ""
		},
		"defines": {
			"id": 0,
			"define1": ""
		},
		"storeProRecords": [
			{
				"warehouseMaterialCheckRule": "",
				"unit_name": "",
				"rowno": "",
				"taxRate": "",
				"isSerialNoManage": true,
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
				"productsku": 0,
				"productsku_cCode": "",
				"productsku_cName": "",
				"product_model": "",
				"product_modelDescription": "",
				"batchno": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"qty": 0,
				"unit": "",
				"unit_Precision": "",
				"product_unitName": "",
				"invExchRate": 0,
				"unitExchangeType": 0,
				"subQty": 0,
				"stockUnitId": 0,
				"stockUnit_name": "",
				"stockUnitId_Precision": "",
				"goodsposition": 0,
				"goodsposition_cName": "",
				"costUnitPrice": 0,
				"costMoney": 0,
				"natUnitPrice": 0,
				"natMoney": 0,
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"project_name": "",
				"project": "",
				"recorddate": "",
				"memo": "",
				"incomingQuantity": 0,
				"sourceid": 0,
				"sourceautoid": 0,
				"sourceGrandchildrenId": 0,
				"qmsResultId": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"mrpQuantity": 0,
				"mainid": "",
				"id": 0,
				"pubts": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"processSn": 0,
				"StoreProRecordsSNs": [
					{
						"id": 0,
						"sn": "",
						"pubts": ""
					}
				],
				"bodyItem": {
					"id": "",
					"define1": ""
				},
				"defines": {
					"id": "",
					"define1": ""
				}
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


---
title: "材料出库来源生单保存"
apiId: "21dcef390e014aebb9bf823dfee2b5a0"
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

# 材料出库来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Material Issue Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/materialout/mergeSourceData/save

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
| data | object | 否 | 是 | 材料出库单[st.materialout.MaterialOut] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| needCal4Api | boolean | 否 | 否 | 换算标识：传false时，支持外部直接赋值数量、件数、换算率，确保调用方已传入正确数据不会被系统自动改掉 默认值：true |
| materialBusType | string | 否 | 否 | 出库类型，matlRet：原单退料（原单退料业务必传） |
| mergeSourceData | boolean | 否 | 是 | 合并上游数据，固定值传入true。 |
| isThrowExceptionFromApi | boolean | 否 | 否 | 是否提示报错：传入true则全部成功才视为成功，任何一行不成功即报错； 默认值：false |
| vouchdate | DateTime | 否 | 是 | 单据日期，日期格式:YYYYMMDD HHMMSS |
| code | string | 否 | 否 | 单据编号：以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 |
| bustype | string | 否 | 是 | 交易类型id，或交易类型code |
| warehouse | string | 否 | 否 | 仓库id，或仓库code；上游单据未指定仓库时必输 |
| memo | string | 否 | 否 | 备注 |
| _status | string | 否 | 是 | 操作标识, Insert:新增 |
| materOuts | object | 是 | 是 | 材料出库单子表 |

## 3. 请求示例

Url: /yonbip/scm/materialout/mergeSourceData/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"needCal4Api": true,
		"materialBusType": "",
		"mergeSourceData": true,
		"isThrowExceptionFromApi": true,
		"vouchdate": "",
		"code": "",
		"bustype": "",
		"warehouse": "",
		"memo": "",
		"_status": "",
		"materOuts": [
			{
				"alternateMaterialId": "",
				"bomMaterialId": "",
				"alternateId": "",
				"materialReqType": 0,
				"makeRuleCode": "",
				"sourceid": "",
				"sourceautoid": "",
				"sourceGrandchildrenId": "",
				"batchno": "",
				"producedate": "",
				"goodsposition": "",
				"qty": 0,
				"memo": "",
				"_status": "",
				"productsku": "",
				"materOutsSNs": [
					{
						"sn": "",
						"_status": ""
					}
				],
				"bodyParallel": {
					"id": 0,
					"returnStockReasonId": 1834229126116933638
				}
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
| id | long | 否 | 主表主键id |
| org | string | 否 | 库存组织ID |
| org_name | string | 否 | 库存组织 |
| factoryFiOrg | string | 否 | 领用会计主体ID |
| factoryFiOrg_name | string | 否 | 领用会计主体 |
| accountOrg | string | 否 | 会计主体id |
| accountOrg_name | string | 否 | 会计主体 |
| factoryOrg | string | 否 | 领用组织ID |
| factory_name | string | 否 | 领用组织 |
| code | string | 否 | 单据编号 |
| isOsm | boolean | 否 | 是否委外材料 |
| warehouse_isGoodsPositionStock | boolean | 否 | 仓库货位是否记存量 |
| srcBill | long | 否 | 来源单据id |
| materialOutType | string | 否 | 材料出库类型 |
| isWfControlled | boolean | 否 | 是否审批流控制 |
| srcBillNO | string | 否 | 来源单据 |
| warehouse | long | 否 | 仓库id |
| srcBillType | string | 否 | 来源上级单据类型 |
| warehouse_countCost | boolean | 否 | 仓库是否计算成本，true:是 false:否 |
| barCode | string | 否 | 单据条码 |
| warehouse_name | string | 否 | 仓库 |
| vouchtype | long | 否 | 单据类型 |
| inventoryowner | long | 否 | 货主对象 |
| isUpdateCost | boolean | 否 | 更新存货成本，true:是 false:否 |
| status | long | 否 | 单据状态, 0:未提交、1:已提交、 |
| verifystate | long | 否 | 审批状态，0未审核 1审核中 2已审核 |
| shop | long | 否 | 商家id |
| extend_attrs_json | string | 否 | 出库类型 |
| creatorId | long | 否 | 创建人id |
| vouchdate | string | 否 | 单据日期 |
| warehouse_isGoodsPosition | boolean | 否 | 出仓库是否货位管理，true:是 false:否 |
| department | string | 否 | 部门 |
| pubts | string | 否 | 时间戳 |
| createDate | string | 否 | 创建日期 |
| creator | string | 否 | 创建人 |
| department_name | string | 否 | 部门 |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号严格管理，true:是 false:否 |
| bustype | string | 否 | 业务类型id |
| createTime | string | 否 | 创建时间 |
| ownertype | long | 否 | 货权归属 |
| headItem | object | 否 | 表头自定义项（1-60） |
| defines | object | 否 | 表头自由自定义项（1-60） |
| materOuts | object | 是 | 材料出库单子表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": 0,
		"org": "",
		"org_name": "",
		"factoryFiOrg": "",
		"factoryFiOrg_name": "",
		"accountOrg": "",
		"accountOrg_name": "",
		"factoryOrg": "",
		"factory_name": "",
		"code": "",
		"isOsm": true,
		"warehouse_isGoodsPositionStock": true,
		"srcBill": 0,
		"materialOutType": "",
		"isWfControlled": true,
		"srcBillNO": "",
		"warehouse": 0,
		"srcBillType": "",
		"warehouse_countCost": true,
		"barCode": "",
		"warehouse_name": "",
		"vouchtype": 0,
		"inventoryowner": 0,
		"isUpdateCost": true,
		"status": 0,
		"verifystate": 0,
		"shop": 0,
		"extend_attrs_json": "",
		"creatorId": 0,
		"vouchdate": "",
		"warehouse_isGoodsPosition": true,
		"department": "",
		"pubts": "",
		"createDate": "",
		"creator": "",
		"department_name": "",
		"warehouse_iSerialManage": true,
		"bustype": "",
		"createTime": "",
		"ownertype": 0,
		"headItem": {
			"id": "",
			"define1": ""
		},
		"defines": {
			"id": "",
			"define1": ""
		},
		"materOuts": [
			{
				"alternateMaterialId": "",
				"bomMaterialId": "",
				"alternateId": "",
				"id": 0,
				"stockUnit_name": "",
				"product_cCode": "",
				"memo": "",
				"firstsource": "",
				"firstupcode": "",
				"source": "",
				"stockStatusDoc_name": "",
				"productskuCp_cCode": "",
				"subQty": 0,
				"product_cName": "",
				"isExpiryDateManage": true,
				"stockUnitId_Precision": "",
				"firstsourceGrandchildrenId": 0,
				"mainid": 0,
				"firstlineno": "",
				"isSerialNoManage": true,
				"productskuCp_cName": "",
				"isScrap": true,
				"unit": 0,
				"productsku": 0,
				"productsku_cCode": "",
				"qty": 0,
				"unit_Precision": "",
				"invExchRate": 0,
				"contactsPieces": 0,
				"contactsQuantity": 0,
				"inventoryowner": 0,
				"stockUnitId": 0,
				"isUpdateCost": true,
				"reserveid": 0,
				"sourceGrandchildrenId": 0,
				"firstsourceautoid": 0,
				"materialReqType": 0,
				"makeRuleCode": "",
				"product_unitName": "",
				"stockStatusDoc": 0,
				"firstgrandlineno": "",
				"productsku_cName": "",
				"productskuCp": 0,
				"isBatchManage": true,
				"supplyType": "",
				"firstsourceid": 0,
				"pubts": "",
				"sourceid": 0,
				"product": 0,
				"sourceOrderlineno": 0,
				"unitExchangeType": 0,
				"sourceautoid": 0,
				"makeproduct": 0,
				"lineno": 0,
				"ownertype": 0,
				"upcode": "",
				"uplineno": 0,
				"orderproduct_makeproduct": 0,
				"bodyItem": {
					"id": "",
					"define1": ""
				},
				"defines": {
					"id": "",
					"define1": ""
				},
				"materOutsSNs": [
					{
						"id": "",
						"sn": "",
						"pubts": ""
					}
				],
				"bodyParallel": {
					"id": 0,
					"returnStockReasonId": 0
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

1	2026-04-03

更新

请求参数 (35)

2	2025-11-24

新增

请求参数 (6)

更新

请求参数 materialReqType

更新

请求参数 makeRuleCode

新增

返回参数 alternateMaterialId

新增

返回参数 bomMaterialId

新增

返回参数 alternateId

支持：原单退料；替代料；数量件数不重算


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


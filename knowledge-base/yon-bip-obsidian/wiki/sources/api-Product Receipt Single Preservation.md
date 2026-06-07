---
title: "产品入库单个保存"
apiId: "2313946667682365440"
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

# 产品入库单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Product Receipt (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/storeprorecord/single/save

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
| data | object | 否 | 是 | 产品入库单[st.storeprorecord.StoreProRecord] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accountOrg | string | 否 | 否 | 会计主体id，或会计主体code |
| id | string | 否 | 否 | 主表id，更新操作时必填 |
| code | string | 否 | 否 | 单据编号，以系统编码规则配置为准，系统设置为手工编号时必输，系统设置为自动编号时非必输 |
| org | string | 否 | 是 | 组织id，或组织code |
| vouchdate | Date | 否 | 是 | 单据日期 |
| store | string | 否 | 否 | 门店id，或门店code |
| warehouse | string | 否 | 是 | 仓库id，或仓库code |
| warehouse_isGoodsPosition | boolean | 否 | 否 | 仓库是否货位管理：true、false |
| factoryOrg | string | 否 | 是 | 工厂id，或工厂code |
| factoryFiOrg | string | 否 | 否 | 工厂会计主体id，或code |
| bustype | string | 否 | 是 | 交易类型id，或code |
| shop | string | 否 | 否 | 商家id，或code |
| department | string | 否 | 否 | 部门id，或部门code |
| operator | string | 否 | 否 | 业务员id，或业务员code |
| stockMgr | string | 否 | 否 | 库管员id，或库管员code |
| memo | string | 否 | 否 | 备注 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳，更新时必填 示例：2024-05-28 16:07:51 |
| warehouse_iSerialManage | boolean | 否 | 否 | 仓库是否序列号严格管理：true、false |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| storeProRecords | object | 是 | 是 | 产品入库单子表[st.storeprorecord.StoreProRecords] |
| out_sys_id | string | 否 | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 否 | 外部来源类型 |

## 3. 请求示例

Url: /yonbip/SCC/storeprorecord/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accountOrg": "",
		"id": "",
		"code": "",
		"org": "",
		"vouchdate": "",
		"store": "",
		"warehouse": "",
		"warehouse_isGoodsPosition": true,
		"factoryOrg": "",
		"factoryFiOrg": "",
		"bustype": "",
		"shop": "",
		"department": "",
		"operator": "",
		"stockMgr": "",
		"memo": "",
		"pubts": "2024-05-28 16:07:51",
		"warehouse_iSerialManage": true,
		"_status": "",
		"storeProRecords": [
			{
				"rowno": "",
				"id": "",
				"isSerialNoManage": true,
				"productionType": "",
				"product": "",
				"prodefine1": "",
				"productsku": "",
				"skudefine1": "",
				"product_model": "",
				"product_modelDescription": "",
				"free1": "",
				"batchno": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"define1": "",
				"qty": 0,
				"unit": "",
				"invExchRate": 0,
				"unitExchangeType": "",
				"subQty": 0,
				"stockUnitId": "",
				"autoCalcCost": true,
				"goodsposition": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"project": "",
				"memo": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"mainid": "",
				"detailid": "",
				"pubts": "",
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"_status": "",
				"StoreProRecordsSNs": [
					{
						"id": 0,
						"sn": "",
						"_status": ""
					}
				],
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 总条数 |
| sucessCount | long | 否 | 成功条数 |
| failCount | long | 否 | 失败条数 |
| messages | object | 否 | 错误数据信息 |
| infos | object | 否 | 成功数据信息 |
| failInfos | object | 否 | 错误信息 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": {},
		"infos": {
			"warehouse": 0,
			"tenant": 0,
			"accountOrg": "",
			"org": "",
			"org_name": "",
			"accountOrg_name": "",
			"code": "",
			"vouchdate": "",
			"store": "",
			"warehouse_name": "",
			"warehouse_isGoodsPosition": true,
			"factoryOrg": "",
			"factory_name": "",
			"factoryFiOrg": "",
			"factoryFiOrg_name": "",
			"bustype": "",
			"bustype_code": "",
			"bustype_name": "",
			"shop": 0,
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
			"id": 0,
			"pubts": "2026-06-07 12:15:17",
			"creator": "",
			"creatorId": 0,
			"createTime": "",
			"createDate": "",
			"warehouse_iSerialManage": true,
			"storeProRecords": {
				"warehouseMaterialCheckRule": "",
				"unit_name": "",
				"rowno": "",
				"taxRate": 0,
				"isSerialNoManage": true,
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
				"prodefine1": "",
				"productsku": 0,
				"productsku_cCode": "",
				"productsku_cName": "",
				"skudefine1": "",
				"product_modelDescription": "",
				"free1": "",
				"batchno": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"define1": "",
				"qty": 0,
				"unit": 0,
				"product_unitName": "",
				"invExchRate": 0,
				"unitExchangeType": "",
				"subQty": 0,
				"stockUnitId": 0,
				"stockUnit_name": "",
				"autoCalcCost": true,
				"goodsposition": "",
				"goodsposition_cName": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"project_name": 0,
				"project": "",
				"recorddate": "",
				"memo": "",
				"sourceid": "",
				"sourceautoid": "",
				"sourceGrandchildrenId": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"mainid": 0,
				"id": 0,
				"pubts": "",
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			},
			"out_sys_id": "",
			"out_sys_code": "",
			"out_sys_version": "",
			"out_sys_type": ""
		},
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


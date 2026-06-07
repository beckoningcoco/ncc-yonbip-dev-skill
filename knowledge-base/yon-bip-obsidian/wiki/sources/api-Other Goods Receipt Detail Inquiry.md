---
title: "其他入库详情查询"
apiId: "37f701ee9f184d5e8ecb36089149a9e7"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Other Goods Receipt Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Goods Receipt Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他入库详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Other Goods Receipt Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/othinrecord/detail

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

Url: /yonbip/scm/othinrecord/detail?access_token=访问令牌&id=

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
| id | long | 否 | 主表id |
| org | string | 否 | 库存组织id |
| org_name | string | 否 | 库存组织名称 |
| accountOrg | string | 否 | 会计主体id |
| accountOrg_name | string | 否 | 会计主体名称 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | long | 否 | 仓库id |
| warehouse_name | string | 否 | 仓库名名称 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| bustype_extend_attrs_json | string | 否 | 入库类型 |
| totalQuantity | int | 否 | 整单数量 |
| totalPieces | int | 否 | 整单件数 |
| status | int | 否 | 单据状态, 0:未提交、1:已提交、 |
| memo | string | 否 | 备注 |
| warehouse_iSerialManage | string | 否 | 仓库是否序列号严格管理 |
| warehouse_isGoodsPosition | string | 否 | 仓库是否货位管理 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | string | 否 | 模板id |
| natCurrency | string | 否 | 本币 |
| natCurrency_priceDigit | int | 否 | 币种单价精度 |
| natCurrency_moneyDigit | int | 否 | 币种金额精度 |
| isCopy | string | 否 | 是否复制, true:是、false:否、 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| auditDate | string | 否 | 提交日期 |
| creatorId | string | 否 | 创建人 |
| modifierId | string | 否 | 修改人id |
| auditorId | string | 否 | 审批人id |
| costStart | string | 否 | 成本期初, true:是、false:否、 |
| stockStart | string | 否 | 库存期初, true:是、false:否、 |
| othInRecords | object | 是 | 其他入库单子表[st.othinrecord.OthInRecords] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外系来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": 0,
		"org": "",
		"org_name": "",
		"accountOrg": "",
		"accountOrg_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"bustype_name": "",
		"store": "",
		"store_name": "",
		"warehouse": 0,
		"warehouse_name": "",
		"department": "",
		"department_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"operator": "",
		"operator_name": "",
		"bustype_extend_attrs_json": "",
		"totalQuantity": 0,
		"totalPieces": 0,
		"status": 0,
		"memo": "",
		"warehouse_iSerialManage": "",
		"warehouse_isGoodsPosition": "",
		"pubts": "",
		"tplid": "",
		"natCurrency": "",
		"natCurrency_priceDigit": 0,
		"natCurrency_moneyDigit": 0,
		"isCopy": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"creatorId": "",
		"modifierId": "",
		"auditorId": "",
		"costStart": "",
		"stockStart": "",
		"othInRecords": [
			{
				"id": 0,
				"mainid": "",
				"rowno": 0,
				"isSerialNoManage": "",
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"modelDescription": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"qty": 0,
				"unit": "",
				"product_unitName": "",
				"subQty": 0,
				"invExchRate": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"recorddate": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"goodsposition": "",
				"goodsposition_cName": "",
				"group_number": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"memo": "",
				"unitExchangeType": "",
				"autoCalcCost": "",
				"pubts": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"othInRecordsSNs": [
					{
						"id": 0,
						"sn": "",
						"pubts": ""
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


---
title: "其他出库详情查询"
apiId: "98fc1de9bd514b36a8d1fdb9dc8d6c91"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Other Goods Issue Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Goods Issue Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他出库详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Other Goods Issue Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/othoutrecord/detail

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

Url: /yonbip/scm/othoutrecord/detail?access_token=访问令牌&id=

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
| accountOrg | string | 否 | 会计主体id |
| accountOrg_name | string | 否 | 会计主体名称 |
| org | string | 否 | 库存组织id |
| org_name | string | 否 | 库存组织名称 |
| code | string | 否 | 出库单编号 |
| vouchdate | string | 否 | 出库日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | string | 否 | 仓库id |
| warehouse_name | string | 否 | 仓库名称 |
| warehouse_iSerialManage | string | 否 | 仓库id |
| warehouse_isGoodsPosition | string | 否 | 仓库是否货位管理 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| status | string | 否 | 单据状态, 0:未提交、1:已提交、 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| bustype_extend_attrs_json | string | 否 | 出库类型 |
| totalQuantity | double | 否 | 整单数量 |
| totalPieces | int | 否 | 整单件数 |
| memo | string | 否 | 备注 |
| id | long | 否 | 主表ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | int | 否 | 模板id |
| natCurrency_priceDigit | int | 否 | 币种单价精度 |
| natCurrency_moneyDigit | int | 否 | 币种金额精度 |
| natCurrency | string | 否 | 本币 |
| source | string | 否 | 上游单据类型 |
| upcode | string | 否 | 上游单据编号 |
| isCopy | string | 否 | 是否复制, true:是、false:否、 |
| sourceid | string | 否 | 上游单据主表id |
| creatorId | string | 否 | 创建人 |
| modifierId | string | 否 | 修改人id |
| auditorId | string | 否 | 审批人id |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| auditDate | string | 否 | 提交日期 |
| othOutRecords | object | 是 | 其他出库单子表[st.othoutrecord.OthOutRecords] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accountOrg": "",
		"accountOrg_name": "",
		"org": "",
		"org_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"bustype_name": "",
		"store": "",
		"store_name": "",
		"warehouse": "",
		"warehouse_name": "",
		"warehouse_iSerialManage": "",
		"warehouse_isGoodsPosition": "",
		"department": "",
		"department_name": "",
		"status": "",
		"operator": "",
		"operator_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"bustype_extend_attrs_json": "",
		"totalQuantity": 0,
		"totalPieces": 0,
		"memo": "",
		"id": 0,
		"pubts": "",
		"tplid": 0,
		"natCurrency_priceDigit": 0,
		"natCurrency_moneyDigit": 0,
		"natCurrency": "",
		"source": "",
		"upcode": "",
		"isCopy": "",
		"sourceid": "",
		"creatorId": "",
		"modifierId": "",
		"auditorId": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"othOutRecords": [
			{
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
				"isBatchManage": true,
				"isExpiryDateManage": true,
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
				"mainid": "",
				"recorddate": "",
				"subQty": 0,
				"invExchRate": 0,
				"unitExchangeType": "",
				"stockUnitId": "",
				"stockUnit_name": "",
				"unit_Precision": "",
				"stockUnitId_Precision": 0,
				"goodsposition": "",
				"goodsposition_cName": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"group_number": "",
				"project_code": "",
				"project_name": "",
				"project": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"autoCalcCost": "",
				"memo": "",
				"id": 0,
				"pubts": "",
				"othOutRecordsSNs": [
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


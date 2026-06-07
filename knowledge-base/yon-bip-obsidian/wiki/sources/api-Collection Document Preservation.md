---
title: "收款单个保存"
apiId: "1448260756070465536"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Collection Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/receivebill/single/save

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
| data | object | 否 | 是 | 收款单信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 收款单id, 新增时无需填写，修改时必填 示例：123455111111 |
| accentity_code | string | 否 | 是 | 会计主体(支持ID和code) 示例：1111 |
| vouchdate | string | 否 | 是 | 单据日期, 格式为:yyyy-MM-dd 示例：2022-05-11 |
| accountdate | string | 否 | 否 | 立账日期 yyyy-MM-dd 示例：2022-05-16 |
| code | string | 否 | 否 | 单据编号，设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值 示例：2131313 |
| customer_code | string | 否 | 是 | 客户(支持ID和code) 示例：3131313 |
| customerbankaccount | string | 否 | 否 | 付款银行账户id 示例：1122313123 |
| settlemode_code | string | 否 | 否 | 结算方式(支持ID和code) 示例：2324234 |
| retailer | string | 否 | 否 | 散户，客户是散户时才可能传，非散户时无需传 示例：1223 |
| enterprisebankaccount_code | string | 否 | 否 | 收款银行账户(支持ID和code) 示例：123113 |
| cashaccount_code | string | 否 | 否 | 收款现金账户(支持ID和code) 示例：123131 |
| tradetype_code | string | 否 | 是 | 交易类型(支持ID和code) 示例：1313123 |
| currency | string | 否 | 是 | 币种（支持id、code） 示例：CNY |
| exchangeRateType_code | string | 否 | 是 | 汇率类型(支持ID和code) 示例：1313131 |
| exchRate | double | 否 | 是 | 汇率 示例：1 |
| oriSum | double | 否 | 是 | 收款金额 示例：100 |
| natSum | double | 否 | 是 | 本币金额 示例：100 |
| org_code | string | 否 | 否 | 销售组织(支持ID和code) 示例：1231313 |
| dept_code | string | 否 | 否 | 部门(支持ID和code) 示例：31313 |
| operator_code | string | 否 | 否 | 业务员(支持ID和code) 示例：13213113 |
| orderno | string | 否 | 否 | 订单编号 示例：123123 |
| contractno | string | 否 | 否 | 合同编号 示例：1313131 |
| project_code | string | 否 | 否 | 项目(支持ID和code) 示例：133333 |
| description | string | 否 | 否 | 备注 示例：测试 |
| initflag | string | 否 | 否 | 期初标志, true:是、false:否、 示例：false |
| headItem | object | 否 | 否 | 表头固定自定义项（1-60） |
| headfree | object | 否 | 否 | 表头自由自定义项（1-60） |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| ReceiveBill_b | object | 是 | 是 | 收款明细 |

## 3. 请求示例

Url: /yonbip/fi/receivebill/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "123455111111",
		"accentity_code": "1111",
		"vouchdate": "2022-05-11",
		"accountdate": "2022-05-16",
		"code": "2131313",
		"customer_code": "3131313",
		"customerbankaccount": "1122313123",
		"settlemode_code": "2324234",
		"retailer": "1223",
		"enterprisebankaccount_code": "123113",
		"cashaccount_code": "123131",
		"tradetype_code": "1313123",
		"currency": "CNY",
		"exchangeRateType_code": "1313131",
		"exchRate": 1,
		"oriSum": 100,
		"natSum": 100,
		"org_code": "1231313",
		"dept_code": "31313",
		"operator_code": "13213113",
		"orderno": "123123",
		"contractno": "1313131",
		"project_code": "133333",
		"description": "测试",
		"initflag": "false",
		"headItem": {
			"id": "",
			"define1": "define1",
			"define2": "define2"
		},
		"headfree": {
			"id": "",
			"define1": "define1",
			"define2": "define2"
		},
		"_status": "",
		"ReceiveBill_b": [
			{
				"id": "13213131",
				"mainid": "2131313131",
				"quickType_code": "33333",
				"material_code": "33333",
				"oriSum": 100,
				"natSum": 100,
				"customer_code": "1231313",
				"org_code": "1313123",
				"dept_code": "13131231",
				"operator_code": "214234234",
				"project_code": "214214234",
				"orderno": "13131313",
				"contractno": "1231313",
				"description": "测",
				"issue": "112233",
				"expenseitem_code": "2222",
				"bodyItem": {
					"id": "",
					"define1": "define1",
					"define2": "define2"
				},
				"bodyfree": {
					"id": "",
					"define1": "define1",
					"define2": "define2"
				},
				"_status": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据集 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| dept_code | string | 否 | 部门 示例：ApartmentCode198528542 |
| oriMoneyRount | long | 否 | 原币精度舍入方式，取值自BigDecimal，例如：0：ROUND_UP、1：ROUND_DOWN、2：ROUND_CEILING、3：ROUND_FLOOR、4：ROUND_HALF_UP、5：ROUND_HALF_DOWN、6：ROUND_HALF_EVEN、7：ROUND_UNNECESSARY 示例：4 |
| enterprisebankaccount | string | 否 | 收款银行账户 示例：2604161097536512 |
| moneyRount | long | 否 | 本币精度舍入方式，取值自BigDecimal，例如：0：ROUND_UP、1：ROUND_DOWN、2：ROUND_CEILING、3：ROUND_FLOOR、4：ROUND_HALF_UP、5：ROUND_HALF_DOWN、6：ROUND_HALF_EVEN、7：ROUND_UNNECESSARY 示例：1 |
| settlemode | long | 否 | 结算方式 示例：2578617795367424 |
| ReceiveBill_b | object | 是 | 收款单明细 |
| accentity | string | 否 | 会计主体id 示例：2578616857580032 |
| settlestatus | long | 否 | 结算状态, 1:未结算、2:已结算 示例：1 |
| natCurrency | string | 否 | 本币币种id 示例：2578464720327424 |
| balance | double | 否 | 余额 示例：100 |
| id | long | 否 | 单据明细ID 示例：1472903242554278000 |
| exchangeRateType_code | string | 否 | 汇率类型编码 示例：exctype198528542 |
| tenant | long | 否 | 租户id 示例：2491026088726784 |
| exchangeRateType_digit | long | 否 | 汇率精度 示例：6 |
| period | long | 否 | 会计期间id 示例：2589917579547142 |
| isWfControlled | boolean | 否 | 审批流标志, true:是、false:否 示例：false |
| localbalance | double | 否 | 本币余额 示例：100 |
| basebilltype | string | 否 | 事项类型id 示例：FICA1 |
| natSum | double | 否 | 本币金额 示例：100 |
| org_code | string | 否 | 销售组织编码 示例：zzdy198528542 |
| status | long | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0 |
| signature | string | 否 | 加密密文 示例：Rv4ZMCJUt5eoDQi1tPs1zib/NVJqSiODdot5q110hR0W5YnVmDLHcjdcpfrYVYe2 jNuPWMZgUzZjg0FUhPZOHtqbh0BQR68cTMmJYzt5tsafrV874ZO+shy49SvN6Bu/ NZ/xFYHUSwpc+CAw7SysflZs5das1brMYm+7vXAgQ4mYYUD540MT0AviR20eTb/g NYwew76jopkBXeIHikfg0iDYdyvt16LXToKON+Om219aUyaQaUvmFyd1t3SxWR0p m2/yxVjRtJoYZSTyL6ic2x+twnkzN8oLcq8eLqBMK6jw9lner3xWBUP8CX30Fe2y 6lfm9FegV9kS0ABGyWq7hw== |
| caobject | long | 否 | 收款对象(1：客户，2：供应商，3：员工，4：其他) 示例：1 |
| vouchdate | string | 否 | 单据日期 示例：2022-06-08 00:00:00 |
| checkBillCode | boolean | 否 | 单据校验标识 示例：false |
| currency | string | 否 | 币种id 示例：2578617037149696 |
| pubts | string | 否 | 时间戳 示例：2022-06-08 14:08:41 |
| createDate | string | 否 | 创建日期 示例：2022-06-08 14:08:40 |
| creator | string | 否 | 创建人 示例：刘预发接口测试员工 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| oriSum | double | 否 | 收款金额 示例：100 |
| bookAmount | double | 否 | 预占用金额 示例：0 |
| retailer | string | 否 | 散户 示例：散户 |
| contractno | string | 否 | 合同编号 示例：contractno21 |
| dept | string | 否 | 部门id 示例：2578616882778368 |
| billnum | string | 否 | 单据类型 示例：arap_receivebill |
| accentity_code | string | 否 | 会计主体 示例：zzdy198528542 |
| srcitem | long | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方。调用时无需输入值，系统自动产生 示例：9 |
| voucherstatus | long | 否 | 凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成 示例：2 |
| tradetype | string | 否 | 交易类型id 示例：2491027558388257 |
| initflag | boolean | 否 | 期初标志, true:是、false:否 示例：false |
| createTime | string | 否 | 创建时间 示例：2022-06-08 14:08:40 |
| natMoney | double | 否 | 本币无税金额 示例：0 |
| orderno | string | 否 | 订单编号 示例：orderno21 |
| project | string | 否 | 项目id 示例：2604130504036608 |
| tradetype_code | string | 否 | 交易类型编码 示例：arap_receipt_other |
| operator | string | 否 | 业务员id 示例：2578617669423616 |
| enterprisebankaccount_code | string | 否 | 收款银行账户编码 示例：0973868747 |
| operator_code | string | 否 | 业务员编码 示例：ygywy98528542 |
| customer_code | string | 否 | 客户编码 示例：autotest136275026 |
| project_code | string | 否 | 项目编码 示例：Test74279234 |
| yTenantId | string | 否 | 友互通租户ID 示例：0000KV7VR8GU3W81730000 |
| oriMoneyDigit | long | 否 | 原币精度 示例：2 |
| moneyDigit | long | 否 | 本币精度 示例：2 |
| oriMoney | double | 否 | 无税金额 示例：0 |
| basebilltype_code | string | 否 | 事项类型编码 示例：arap_receipt |
| code | string | 否 | 单据编号 示例：RECar20220608000607 |
| settlemode_code | string | 否 | 结算方式编码 示例：jsfsyhyw98528542 |
| creatorId | long | 否 | 创建人id 示例：2582918148463360 |
| description | string | 否 | 备注 示例：备注 |
| exchRate | double | 否 | 汇率 示例：1 |
| cmpflag | boolean | 否 | 是否传现金标志，true:是、false:否 示例：true |
| basebilltypecode | string | 否 | 事项类型编码 示例：arap_receipt |
| billtype | long | 否 | 收付事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单 示例：7 |
| customerbankaccount | long | 否 | 付款银行账户id 示例：2590006989394182 |
| busiaccbook | string | 否 | 业务账簿id 示例：82EDD46B-142D-4FB0-B536-1C3C639A221E |
| auditstatus | long | 否 | 审批状态, 1:已审批、2:未审批 示例：2 |
| org | string | 否 | 销售组织id 示例：2578616857580032 |
| exchangeRateType | string | 否 | 汇率类型id 示例：2578616843981824 |
| writeoffstatus | long | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销 示例：2 |
| accountdate | string | 否 | 立账日期 示例：2022-06-08 00:00:00 |
| paytype | long | 否 | 支付方式, 1:线上支付、2:线下支付 示例：2 |
| customer | long | 否 | 客户id 示例：2590006989394176 |
| headfree | object | 否 | 表头自由自定义项 |
| headItem | object | 否 | 表头固定自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"dept_code": "ApartmentCode198528542",
		"oriMoneyRount": 4,
		"enterprisebankaccount": "2604161097536512",
		"moneyRount": 1,
		"settlemode": 2578617795367424,
		"ReceiveBill_b": [
			{
				"dept_code": "ApartmentCode198528542",
				"quickType_code": "9",
				"expenseitem_code": "00001",
				"orderno": "orderno21",
				"quickTypeCode": "9",
				"project": "2604130504036608",
				"bodyfree": {
					"define1": "define1",
					"define2": "define2"
				},
				"operator": "2578617669423616",
				"quickType": 2490195827397627,
				"balance": 100,
				"operator_code": "ygywy98528542",
				"id": 1472903242554278000,
				"mainid": 1472903242554278000,
				"pubts": "2022-06-08 14:08:41",
				"customer_code": "autotest136275026",
				"tenant": 2491026088726784,
				"oriSum": 100,
				"issue": 21,
				"bookAmount": 0,
				"org": "2578616857580032",
				"contractno": "contractno21",
				"localbalance": 100,
				"project_code": "Test74279234",
				"natSum": 100,
				"dept": "2578616882778368",
				"yTenantId": "0000KV7VR8GU3W81730000",
				"expenseitem": 2582962031661568,
				"material": 2578617454252544,
				"org_code": "zzdy198528542",
				"material_code": "ZDH-000698528542",
				"customer": 2590006989394176,
				"bodyItem": {
					"poiExcelRowNum": "1",
					"poiExcelSheetName": "ReceiveBill_bCustomItem(1)",
					"define2": "define2",
					"define1": "define1",
					"pubts": "2022-06-08 14:08:41",
					"tenant": 2491026088726784,
					"yTenantId": "0000KV7VR8GU3W81730000",
					"id": 1472903242554278000
				}
			}
		],
		"accentity": "2578616857580032",
		"settlestatus": 1,
		"natCurrency": "2578464720327424",
		"balance": 100,
		"id": 1472903242554278000,
		"exchangeRateType_code": "exctype198528542",
		"tenant": 2491026088726784,
		"exchangeRateType_digit": 6,
		"period": 2589917579547142,
		"isWfControlled": false,
		"localbalance": 100,
		"basebilltype": "FICA1",
		"natSum": 100,
		"org_code": "zzdy198528542",
		"status": 0,
		"signature": "Rv4ZMCJUt5eoDQi1tPs1zib/NVJqSiODdot5q110hR0W5YnVmDLHcjdcpfrYVYe2\njNuPWMZgUzZjg0FUhPZOHtqbh0BQR68cTMmJYzt5tsafrV874ZO+shy49SvN6Bu/\nNZ/xFYHUSwpc+CAw7SysflZs5das1brMYm+7vXAgQ4mYYUD540MT0AviR20eTb/g\nNYwew76jopkBXeIHikfg0iDYdyvt16LXToKON+Om219aUyaQaUvmFyd1t3SxWR0p\nm2/yxVjRtJoYZSTyL6ic2x+twnkzN8oLcq8eLqBMK6jw9lner3xWBUP8CX30Fe2y\n6lfm9FegV9kS0ABGyWq7hw==",
		"caobject": 1,
		"vouchdate": "2022-06-08 00:00:00",
		"checkBillCode": false,
		"currency": "2578617037149696",
		"pubts": "2022-06-08 14:08:41",
		"createDate": "2022-06-08 14:08:40",
		"creator": "刘预发接口测试员工",
		"resubmitCheckKey": "OPENAPI_1448260756070465536_0000KV7VR8GU3W81730000_liu01",
		"oriSum": 100,
		"bookAmount": 0,
		"retailer": "散户",
		"contractno": "contractno21",
		"dept": "2578616882778368",
		"billnum": "arap_receivebill",
		"accentity_code": "zzdy198528542",
		"srcitem": 9,
		"voucherstatus": 2,
		"tradetype": "2491027558388257",
		"initflag": false,
		"createTime": "2022-06-08 14:08:40",
		"natMoney": 0,
		"orderno": "orderno21",
		"project": "2604130504036608",
		"tradetype_code": "arap_receipt_other",
		"operator": "2578617669423616",
		"enterprisebankaccount_code": "0973868747",
		"operator_code": "ygywy98528542",
		"customer_code": "autotest136275026",
		"project_code": "Test74279234",
		"yTenantId": "0000KV7VR8GU3W81730000",
		"oriMoneyDigit": 2,
		"moneyDigit": 2,
		"oriMoney": 0,
		"basebilltype_code": "arap_receipt",
		"code": "RECar20220608000607",
		"settlemode_code": "jsfsyhyw98528542",
		"creatorId": 2582918148463360,
		"description": "备注",
		"exchRate": 1,
		"cmpflag": true,
		"basebilltypecode": "arap_receipt",
		"billtype": 7,
		"customerbankaccount": 2590006989394182,
		"busiaccbook": "82EDD46B-142D-4FB0-B536-1C3C639A221E",
		"auditstatus": 2,
		"org": "2578616857580032",
		"exchangeRateType": "2578616843981824",
		"writeoffstatus": 2,
		"accountdate": "2022-06-08 00:00:00",
		"paytype": 2,
		"customer": 2590006989394176,
		"headfree": {
			"define2": "define2",
			"define1": "define1",
			"tenant": 2491026088726784,
			"poiExcelSheetName": "ReceiveBillAttrExtItem(1)",
			"pubts": "2022-06-08 14:08:41",
			"poiExcelRowNum": "1",
			"id": 1472903242554278000,
			"yTenantId": "0000KV7VR8GU3W81730000"
		},
		"headItem": {
			"poiExcelRowNum": "1",
			"define2": "define2",
			"define1": "define1",
			"id": 1472903242554278000,
			"yTenantId": "0000KV7VR8GU3W81730000",
			"poiExcelSheetName": "ReceiveBillCustomItem(1)",
			"tenant": 2491026088726784,
			"pubts": "2022-06-08 14:08:41"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前会计期间已经结账,单据不能维护	会计期间已结账，不能录单校验


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


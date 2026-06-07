---
title: "薪资发放单明细查询"
apiId: "1696919648737427464"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payroll"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payroll]
platform_version: "BIP"
source_type: community-api-docs
---

# 薪资发放单明细查询

>  请求方式	GET | Payroll (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/payfile/queryWaPayfileDetailByCond
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
orgCode	string	query	否	组织编码    示例: 2
schemeCode	string	query	是	发薪方案编码    示例: FXFA202203210003
payPeriod	string	query	是	发薪期间    示例: 2021-01
payFileCode	string	query	否	薪资发放单的编码    示例: 00001-FXFA20220321-202203
cancelApproval	string	query	是	允许取消审批标识，1代表允许，0代表不允许    示例: 1    默认值: 1

## 3. 请求示例

Url: /yonbip/hrcloud/payfile/queryWaPayfileDetailByCond?access_token=访问令牌&orgCode=2&schemeCode=FXFA202203210003&payPeriod=2021-01&payFileCode=00001-FXFA20220321-202203&cancelApproval=1

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：查询成功
data	object	否	返回的数据
waPayfileVOList	object	是	List对象，存储返回的所有发放单对象
itemList	object	否	Map对象，key是发放单id，value是一个存储对应发放单下的薪资项目的List
waPayfileDetailList	object	否	Map对象，key是发放单id，value存储对应发放单下人员发薪详情信息的List

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"waPayfileVOList": [
			{
				"id": "f6193445d72f4719afb5ed4c0b3b6d74",
				"busiOrg": "2285636518106368",
				"code": "zz-FXFA20210811-202108",
				"name": "不扣税方案-202108",
				"payPeriod": "c810349b90e24de3beb80ccb11d40b56",
				"taxYear": 2021,
				"taxMonth": 1,
				"payDate": "2023-01-31",
				"pkWaScheme": "9671bf58ea5242c996f51f5071640995",
				"payNums": 1,
				"totals": 0,
				"actualTotals": 0,
				"schemeName": "不扣税方案",
				"payPeriodName": "2021-08",
				"segmentAccount": "0",
				"busiOrgName": "资产组织",
				"mullangName": "不扣税方案-202108"
			}
		],
		"itemList": {
			"f6193445d72f4719afb5ed4c0b3b6d74": [
				{
					"pkPayfile": "f6193445d72f4719afb5ed4c0b3b6d74",
					"dr": 0,
					"itemCode": "F_N_1",
					"itemName": "应发工资",
					"itemName2": "Wage Payable",
					"itemName3": "應發工資",
					"showOrder": "5",
					"isItem": 1,
					"fromFlag": 0,
					"approveFlag": 1,
					"dateType": 1,
					"pkWaItem": "0000KPGAC0FB43YQ6K0000item0000001",
					"isShow": 1,
					"schemeItemId": "92375ce9b8e7453eb057ed41ef3d7176",
					"fldDecimal": 2,
					"pkScheme": "d28acba4e269456c9e3de29e7a4b3b11",
					"fldWidth": 10,
					"roundType": 4,
					"clearFlag": 0,
					"isModify": 1,
					"segmentAccount": "0",
					"isFixed": 0,
					"fromFlagName": "公式",
					"mullangName": "应发工资",
					"payFileDisplay": 1,
					"formula": "[waitem.f_n_26]",
					"pkWaSchemeItem": "1789883013259591685",
					"es": 0
				}
			]
		},
		"waPayfileDetailList": {
			"f6193445d72f4719afb5ed4c0b3b6d74": [
				{
					"F_N_1": "0.00",
					"orgId": "2285636518106368",
					"F_N_9": "0.00",
					"F_N_6": 0.01,
					"F_N_4": "0.00",
					"F_N_5": "0.00",
					"F_N_2": "0.00",
					"F_N_3": "0.00",
					"id": "008424ef0dfa4919afed79c051ff9d96",
					"adjust_item_data": "F_N_6|0.01|0.01||wl,F_D_1|1629043200000|1629043200000||wl,F_B_1|false|false||wl",
					"DOC_ID": "159518e2-5b92-41da-875f-f4c05bb5fb0a",
					"deptId": "2285637611360512",
					"PART_FLAG": false,
					"staffCode": "A18",
					"taxOrgName": "资产组织",
					"approveFlag": true,
					"TAX_ORG_ID": "2285636518106368",
					"F_D_1": 1629043200000,
					"staffId": "2310792753484049",
					"TAX_DEPT_ID": "2285637611360512",
					"F_N_32": "0.00",
					"STAFF_JOB_ID": "2310792800162049",
					"staffName": "导入测试A18",
					"calculateFlag": true,
					"F_N_19": "0.00",
					"deptName": "IT部门",
					"F_N_17": "1000.00",
					"F_N_18": "0.00",
					"F_N_11": "0.00",
					"F_N_12": "0.00",
					"F_N_15": "0.00",
					"F_N_16": "1000.00",
					"F_N_13": "5000.00",
					"orgName": "资产组织",
					"taxDeptName": "IT部门",
					"PK_WA_PAYFILE": "f6193445d72f4719afb5ed4c0b3b6d74",
					"F_N_20": "0.00",
					"F_N_21": "0.00",
					"F_B_1": false,
					"payDocId": "1789896954721861640",
					"path": "3432251074924831|",
					"level": "1",
					"isEnd": 1,
					"deptCode": "0809bu2",
					"parttype2": "主任职",
					"projectIn": 0
				}
			]
		}
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	未找到对应的薪资发放单	修改请求数据

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


---
title: "薪资发放单测算"
apiId: "1985173913503531011"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payroll"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payroll]
platform_version: "BIP"
source_type: community-api-docs
---

# 薪资发放单测算

>  请求方式	POST | Payroll (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/payFile/reCalculate
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
schemeAuthId	string	否	是	发薪方案授权ID 示例：1970393109958754304
staffIds	string	否	是	人员ID,多个用英文逗号隔开 示例：123,124
periodTime	string	否	是	发薪期间，如：2024-01 示例：2024-05
taxPeriod	string	否	是	纳税期间，如：2024-01 示例：2024-05

## 3. 请求示例

Url: /yonbip/hrcloud/payFile/reCalculate?access_token=访问令牌
Body: {
	"schemeAuthId": "1970393109958754304",
	"staffIds": "123,124",
	"periodTime": "2024-05",
	"taxPeriod": "2024-05"
}

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
code	number
小数位数:0,最大长度:10	否	返回状态编码 示例：200
message	string	否	返回提示信息 示例：操作成功
data	object	否	返回数据
item	object	否	发薪项目
data	object	是	薪资数据
isEntry	string	否	是否新进人员
traceId	string	否	traceId 示例：baa97e212a448859

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"item": {
			"F_N_1": {
				"code": "f_n_1",
				"memo": "系统自动计算增减属性为“应发项”的项目合计，即应该发放给员工的工资项合计。",
				"roundType": "4",
				"dataType": "1",
				"payslipName": "应发工资",
				"fldDecimal": 2,
				"isDisplay": 1,
				"fldWidth": 10,
				"name": "应发工资"
			}
		},
		"data": [
			{
				"id": "b93636da-f7c1-44f3-a069-d9210cd284d5",
				"pkWaPayfile": "1985684688166977545",
				"pkWaScheme": "1970393109958754304",
				"staffId": "1970358853288591362",
				"staffJobId": "1973013228975816706",
				"staffCode": "00000010",
				"staffName": "荒天帝",
				"orgId": "1970353853973921801",
				"deptId": "1970355528994914308",
				"taxOrgId": "wmsj",
				"parentId": "1",
				"mutiProjectIn": "0",
				"taxMonth": 4,
				"taxYear": 2024,
				"isChange": "1",
				"beginDate": "2024-04-01",
				"endDate": "2024-04-30",
				"PARENT_ID": "1",
				"DOC_ID": "b93636da-f7c1-44f3-a069-d9210cd284d5",
				"F_N_4": 0,
				"F_N_5": 0,
				"F_N_2": 0,
				"F_N_3": 5,
				"PK_PAYFILE": "1985684688166977545",
				"F_V_1": 5000,
				"F_N_9": 0,
				"F_N_6": 0.03,
				"STAFF_ID": "1970358853288591362",
				"F_N_28": 500,
				"F_N_29": 5,
				"F_N_1": 5,
				"F_N_27": 0,
				"F_N_20": 0,
				"F_N_21": 0,
				"F_N_200": 0,
				"F_N_101": 0,
				"ID": "1985684688186900485",
				"F_N_1000": 0,
				"F_N_17": 0,
				"F_N_18": 0,
				"F_N_19": 0,
				"F_N_13": 5000,
				"PK_PAYFILE_DOC": "b93636da-f7c1-44f3-a069-d9210cd284d5",
				"F_B_1": false,
				"F_N_15": 0,
				"F_N_16": 0,
				"F_D_0": "2024-04-01 00:00:00",
				"F_N_11": 0,
				"F_N_12": 0,
				"level": "1",
				"isEnd": 0,
				"path": "b93636da-f7c1-44f3-a069-d9210cd284d5|",
				"children": [
					{
						"id": "abbe4776-ec5e-4d41-b0d0-dc7e79eb86bf",
						"pkWaPayfile": "1985684688166977545",
						"pkWaScheme": "1970393109958754304",
						"staffJobId": "1971505996116787208",
						"staffId": "1970358853288591362",
						"staffCode": "00000010",
						"staffName": "荒天帝",
						"orgId": "1970353853973921801",
						"orgName": "完美世界",
						"deptId": "1970355408735830018",
						"deptName": "仙域",
						"choose": 1,
						"dr": 0,
						"approveFlag": 0,
						"calculateFlag": 0,
						"pkStaffDoc": "1971528828159787008",
						"taxOrgId": "wmsj",
						"parentId": "b93636da-f7c1-44f3-a069-d9210cd284d5",
						"beginDate": "2024-04-01",
						"endDate": "2024-04-08",
						"creator": "96b61a89-f6a7-4a7e-b449-2f566fb82caa",
						"modifier": "96b61a89-f6a7-4a7e-b449-2f566fb82caa",
						"mutiProjectIn": "0",
						"taxYear": 2024,
						"taxMonth": 4,
						"PARENT_ID": "b93636da-f7c1-44f3-a069-d9210cd284d5",
						"DOC_ID": "abbe4776-ec5e-4d41-b0d0-dc7e79eb86bf",
						"PK_PAYFILE_DOC": "abbe4776-ec5e-4d41-b0d0-dc7e79eb86bf",
						"F_N_27": 0,
						"PK_PAYFILE": "1985684688166977545",
						"STAFF_ID": "1970358853288591362",
						"F_N_101": 0,
						"ID": "1985684688186900480",
						"F_N_28": 100,
						"F_N_29": 1,
						"F_N_1": 1,
						"level": "2",
						"isEnd": 1,
						"path": "b93636da-f7c1-44f3-a069-d9210cd284d5|abbe4776-ec5e-4d41-b0d0-dc7e79eb86bf|"
					}
				]
			}
		],
		"isEntry": ""
	},
	"traceId": "baa97e212a448859"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-30	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


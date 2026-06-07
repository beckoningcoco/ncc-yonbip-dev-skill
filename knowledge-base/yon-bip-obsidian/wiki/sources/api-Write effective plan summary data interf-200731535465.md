---
title: "写入生效的计划汇总数据接口"
apiId: "2007315354655653893"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inquire Plan Summary"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inquire Plan Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 写入生效的计划汇总数据接口

>  请求方式	POST | Inquire Plan Summary (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/cspl_plansummarylist/writeplansummarydata
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
main	object	否	是	计划汇总表
plansummaryID	string	否	否	计划汇总表ID，若是有计划明细ID则为更新，否则为新增 示例：2007242297086836700
accentity	string	否	是	计划组织对应的资金组织 示例：1748339555433971719
planOrg	string	否	是	计划组织 示例：1916136609081721171
capitalPlanCycle	string	否	是	计划周期 示例：4
currency	string	否	是	币种 示例：1525643705855773169
period	string	否	是	计划期间 示例：1751863739335311364
lastAdjustId	string	否	否	调整单id
strategSetId	string	否	是	资金计划策略ID 示例：1758693381568462856
beginDate	date
格式:yyyy-MM-dd	否	是	期间开始 示例：2027-04-01
endDate	date
格式:yyyy-MM-dd	否	是	期间结束 示例：2027-04-30
isObtain	string	否	否	是否获取预测数，1是0否 示例：1
incomeAmt	string	否	否	收入总额度 示例：150
payAmt	string	否	否	支出总额度 示例：150
isDecompose	string	否	否	是否分解生成，true是false否 示例：false 默认值：false
strategyRecord	string	否	是	资金计划策略版本 示例：175869338156846666
planSummaryB	object	是	否	计划汇总表子表
periodAmt	number
小数位数:8,最大长度:28	否	否	计划额度 示例：100
projectId	string	否	是	资金计划项目id 示例：1556200001579253766
details	object	是	否	计划汇总表明细表
accentity	string	否	是	资金组织 示例：1809288886581985481
detailID	number
小数位数:0,最大长度:20	否	否	计划明细ID，若是有计划明细ID则为更新，否则为新增 示例：2007242305676771300
amount	number
小数位数:1,最大长度:28	否	是	金额 示例：22
confirmStatus	string	否	否	内部交易确认状态,1是0否 示例：1
contractCode	string	否	否	合同编号 示例：2222
contractName	string	否	否	合同名称 示例：名称
dept	string	否	否	部门
expenseProject	string	否	否	费用项目 示例：1
isWholesale	number
小数位数:0,最大长度:10	否	否	是否大额 示例：0
localAmount	number
小数位数:1,最大长度:28	否	是	原币金额 示例：100
localCurrency	string	否	是	原币币种 示例：1809997375910969379
oppAcc	string	否	否	对方账号 示例：account1
oppAccId	string	否	否	对方账号ID 示例：accID1
oppAccName	string	否	否	对方户名 示例：accName1
oppBankName	string	否	否	对方开户行名 示例：bank1
oppBankType	string	否	否	对方银行类型 示例：type1
oppId	string	否	否	对方类型主键ID 示例：oppID1
oppName	string	否	否	对方名称 示例：oppName1
oppType	string	否	否	对方类型
paymentType	string	否	否	款项类型
planOrg	string	否	否	计划组织 示例：1815806559685967878
planSettleDate	date
格式:yyyy-MM-dd	否	否	计划结算日期 示例：2027-05-01
projectId	string	否	是	资金计划项目 示例：1556200740313628676
rate	string	否	否	计划币种汇率 示例：1
rateType	string	否	否	计划币种汇率类型 示例：0000LM671H5EE0AZUU0000
receiptType	string	否	是	收支类型 示例：1
remark	string	否	否	备注 示例：remark1
settleMode	string	否	否	结算方式
sourceType	string	否	是	来源类型 示例：1
sourceDetailId	string	否	是	来源明细id 示例：detailID1
defineDoc	string	否	否	自定义档案 示例：doc1
defineDocName	string	否	否	自定义档案名称 示例：docName1
defineDocNo	string	否	否	自定义档案编号 示例：docNo1
planSummaryDetailFeature	string	否	否	自定义项特征组 示例：feature1

## 3. 请求示例

Url: /yonbip/ctm/cspl_plansummarylist/writeplansummarydata?access_token=访问令牌
Body: {
	"main": {
		"plansummaryID": "2007242297086836700",
		"accentity": "1748339555433971719",
		"planOrg": "1916136609081721171",
		"capitalPlanCycle": "4",
		"currency": "1525643705855773169",
		"period": "1751863739335311364",
		"lastAdjustId": "",
		"strategSetId": "1758693381568462856",
		"beginDate": "2027-04-01",
		"endDate": "2027-04-30",
		"isObtain": "1",
		"incomeAmt": "150",
		"payAmt": "150",
		"isDecompose": "false",
		"strategyRecord": "175869338156846666"
	},
	"planSummaryB": [
		{
			"periodAmt": 100,
			"projectId": "1556200001579253766"
		}
	],
	"details": [
		{
			"accentity": "1809288886581985481",
			"detailID": 2007242305676771300,
			"amount": 22,
			"confirmStatus": "1",
			"contractCode": "2222",
			"contractName": "名称",
			"dept": "",
			"expenseProject": "1",
			"isWholesale": 0,
			"localAmount": 100,
			"localCurrency": "1809997375910969379",
			"oppAcc": "account1",
			"oppAccId": "accID1",
			"oppAccName": "accName1",
			"oppBankName": "bank1",
			"oppBankType": "type1",
			"oppId": "oppID1",
			"oppName": "oppName1",
			"oppType": "",
			"paymentType": "",
			"planOrg": "1815806559685967878",
			"planSettleDate": "2027-05-01",
			"projectId": "1556200740313628676",
			"rate": "1",
			"rateType": "0000LM671H5EE0AZUU0000",
			"receiptType": "1",
			"remark": "remark1",
			"settleMode": "",
			"sourceType": "1",
			"sourceDetailId": "detailID1",
			"defineDoc": "doc1",
			"defineDocName": "docName1",
			"defineDocNo": "docNo1",
			"planSummaryDetailFeature": "feature1"
		}
	]
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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
main	object	否	main
planSummaryB	object	是	planSummaryB
details	object	是	details

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"main": {
			"plansummaryID": "2007242297086836736",
			"accentity": "1748339555433971719",
			"planOrg": "1916136609081721171",
			"capitalPlanCycle": "4",
			"currency": "1525643705855773169",
			"period": "1751863739335311364",
			"strategSetId": "1758693381568462856",
			"beginDate": "2027-04-01 00:00:00",
			"endDate": "2027-04-30 00:00:00",
			"isObtain": true,
			"incomeAmt": "150",
			"payAmt": "150",
			"isDecompose": false,
			"strategyRecord": "1758693381568462856"
		},
		"planSummaryB": [
			{
				"periodAmt": 100,
				"projectId": "1556200001579253766"
			}
		],
		"details": [
			{
				"accentity": "1809288886581985481",
				"detailID": "2007242305676771336",
				"amount": 22,
				"confirmStatus": true,
				"contractCode": "2222",
				"contractName": "名称",
				"expenseProject": "1",
				"isWholesale": false,
				"localAmount": 100,
				"localCurrency": "1809997375910969379",
				"oppAcc": "account1",
				"oppAccId": "accID1",
				"oppAccName": "accName1",
				"oppBankName": "bank1",
				"oppBankType": "type1",
				"oppId": "oppID1",
				"oppName": "oppName1",
				"planOrg": "1815806559685967878",
				"planSettleDate": "2027-05-01 00:00:00",
				"projectId": "1556200740313628676",
				"rate": "1",
				"rateType": "0000LM671H5EE0AZUU0000",
				"receiptType": "1",
				"remark": "remark1",
				"sourceType": "1",
				"sourceDetailId": "detailID1",
				"defineDoc": "doc1",
				"defineDocName": "docName1",
				"defineDocNo": "docNo1",
				"planSummaryDetailFeature": "feature1"
			}
		]
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
999	后端异常	后端发生异常

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


---
title: "写入预算编制"
apiId: "2027346661232607232"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Preparation"
domain: "PMPB"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Preparation]
platform_version: "BIP"
source_type: community-api-docs
---

# 写入预算编制

>  请求方式	POST | Budget Preparation (PMPB)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/budget/genBudget
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	否	data入参层级，支持幂等
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
projectId	string	否	否	项目ID，项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准，来源于项目档案 示例：1567993612501254153
projectCode	string	否	否	项目编码，来源于项目档案 示例：1567993612501254152
budgetSchemeId	string	否	否	预算编制方案ID，预算编制方案ID和编码至少录入一项，预算编制方案ID和编码同时存在，以预算编制方案ID为准 示例：1563514030335197189
budgetSchemeCode	string	否	否	预算编制方案编码 示例：1011
makeDate	date
格式:yyyy-MM-dd	否	否	编制日期 示例：2022-10-26
startTime	date
格式:yyyy-MM-dd	否	否	开始时间，预算模型中含有年或月时必填 示例：2025-07-01
endTime	date
格式:yyyy-MM-dd	否	否	结束时间，预算模型中含有年或月时必填 示例：2025-08-01
subjectMny	object	是	否	科目金额映射

## 3. 请求示例

Url: /yonbip/pm/budget/genBudget?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"projectId": "1567993612501254153",
		"projectCode": "1567993612501254152",
		"budgetSchemeId": "1563514030335197189",
		"budgetSchemeCode": "1011",
		"makeDate": "2022-10-26",
		"startTime": "2025-07-01",
		"endTime": "2025-08-01",
		"subjectMny": [
			{
				"budgetSubjectId": "1547886808992841738",
				"budgetSubjectCode": "3",
				"costCenterId": "1547886808992841739",
				"costCenterCode": "1",
				"investProjectId": "1547886808992841740",
				"investProjectCode": "1",
				"wbsId": "1547886808992841741",
				"wbsCode": "1",
				"expenseItemId": "1547886808992841742",
				"expenseItemCode": "1",
				"expenseItemTypeId": "1547886808992841743",
				"expenseItemTypeCode": "1",
				"productId": "1547886808992841744",
				"productCode": "1",
				"managementClassId": "1547886808992841745",
				"managementClassCode": "1",
				"gradeId": "1547886808992841746",
				"gradeCode": "1",
				"budgetMny": 100,
				"budgetSubjectMnyItemDtoList": [
					{
						"year": "2025",
						"month": "07",
						"budgetMny": 100
					}
				]
			}
		]
	}
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	long	否	请求状态编码 示例：200
message	string	否	执行状态 示例：操作成功
data	object	否	执行结果
id	string	否	保存成功后，返回该条预算编制单的id 示例：2030305610215981063

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2030305610215981063"
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
0	未传入优惠券档案id	coupon_id值填写有误
1032001990002	项目ID和项目编码不允许同时为空	检查项目ID和编码是否同时为空
1032001990003	预算类型值不正确	检查预算类型值是否正确
1001001000003	其他异常（1.该项目已存在支出/收入类的预算编制单，单据编码：XXX）	根据错误返回信息修改参数
310008	参数校验失败，参数[budgetType]是必填的	检查参数是否填写了预算类型
1032001990001	未接收到参数	检查参数是否为空

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-11	
新增
请求参数 (22)
更新
请求参数 budgetSubjectId
更新
请求参数 budgetSubjectCode
更新
请求参数 budgetMny
删除
请求参数 budgetType
新增
错误码 1001001000003
删除
错误码 1032001990099

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


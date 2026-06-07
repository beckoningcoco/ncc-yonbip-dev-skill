---
title: "项目物资清单新增"
apiId: "2200254408027013129"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Resource Demand"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Resource Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目物资清单新增

>  请求方式	POST | Project Resource Demand (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/projectmaterial/save
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
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
projectId	string	否	否	项目ID, 项目ID和项目编码至少录入一项，与项目编码二选一，若同时存在以项目ID为主 示例：2066636558109245471
projectCode	string	否	否	项目编码 示例：000050
compilerId	string	否	否	编制人ID，与编制人编码二选一，若同时存在以编制人ID为主 示例：1530658157472251912
compilerCode	string	否	否	编制人编码 示例：00000080
compilerDepartmentId	string	否	否	编制部门ID，与编制部门编码二选一，若同时存在以编制部门ID为主 示例：2022081800001
compilerDepartmentCode	string	否	否	编制部门编码 示例：000050
compileDate	date
格式:yyyy-MM-dd	否	否	编制日期，默认业务日期 示例：2025-01-01
items	object	是	是	物资明细

## 3. 请求示例

Url: /yonbip/pm/projectmaterial/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"projectId": "2066636558109245471",
		"projectCode": "000050",
		"compilerId": "1530658157472251912",
		"compilerCode": "00000080",
		"compilerDepartmentId": "2022081800001",
		"compilerDepartmentCode": "000050",
		"compileDate": "2025-01-01",
		"items": [
			{
				"productId": "1671838980955963400",
				"productCode": "0303zp",
				"rowType": "1981338876953755650",
				"rowTypeCode": "PMC9004-03",
				"quantity": 10,
				"memo": "备注",
				"unitPrice": 100,
				"supplierId": "1549527778478522373",
				"supplierCode": "0009000037",
				"taxCategoryId": "11000",
				"taxCategoryCode": "BL"
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
code	number
小数位数:2,最大长度:10	否	响应编码 示例：200
message	string	否	响应信息 示例：操作成功
data	string	否	返回数据 示例：保存成功

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "保存成功"
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
1032001990001	项目ID和项目编码不能同时为空	项目ID或者项目编码错误
1032001990002	物料信息不能为空	物料信息不能为空
1032001990003	物料ID和物料编码不能同时为空	物料ID和物料编码不能同时为空
1032001990004	供应商ID和供应商编码不能同时为空	供应商ID和供应商编码不能同时为空
1032001990005	行类型ID和行类型编码不能同时为空	行类型ID和行类型编码不能同时为空
1032001990006	税率ID和税率编码不能同时为空	税率ID和税率编码不能同时为空
1032001990007	数量不能为空	数量不能为空
1032001990008	无税单价不能为空	无税单价不能为空
1032001990009	数量需大于零	数量需大于零
1032001990010	无税单价需大于零	无税单价需大于零
1032001990011	查询项目信息失败，请检查项目ID	查询项目信息失败，请检查项目ID
1032001990012	查询项目信息失败，请检查项目编码	查询项目信息失败，请检查项目编码
1032001990013	编制人ID错误	编制人ID错误
1032001990014	编制人编码错误	编制人编码错误
1032001990015	编制部门ID错误	编制部门ID错误
1032001990016	编制部门编码错误	编制部门编码错误
1032001990017	行类型ID错误	行类型ID错误
1032001990018	行类型编码错误	行类型编码错误
1032001990019	物料ID错误	物料ID错误
1032001990020	物料编码错误	物料编码错误
1032001990021	供应商ID错误	供应商ID错误
1032001990022	供应商编码错误	供应商编码错误
1032001990023	税率ID错误	税率ID错误
1032001990024	税率编码错误	税率编码错误
1032001990099	其他错误	其他错误

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


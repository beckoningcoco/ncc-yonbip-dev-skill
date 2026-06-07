---
title: "按照手机号查询此人参与的项目"
apiId: "3cf01fbb4fed4bc585b97406367c9847"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 按照手机号查询此人参与的项目

>  请求方式	POST | Project (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/projectcenter/findInvolvedProjects
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
phoneNo	string	否	是	手机号 示例：13466649325
projectStatusFilterDto	object	否	否	项目状态过滤对象
includeStatus	string	是	否	选择包含的状态:未启用:UNABLE;启用:ENABLED;停用:STOP;提前立项:ADVANCE;正常立项:NORMAL;执行中:ING;暂停:SUSPEND;业务关闭:BUSINESS_CLOSE;财务关闭:FINANCE_CLOSE; 示例：["NORMAL"]
excludeStatus	string	是	否	选择不包含的状态,如果选择了包含的状态,则此条件无效.未启用:UNABLE;启用:ENABLED;停用:STOP;提前立项:ADVANCE;正常立项:NORMAL;执行中:ING;暂停:SUSPEND;业务关闭:BUSINESS_CLOSE;财务关闭:FINANCE_CLOSE;

## 3. 请求示例

Url: /yonbip/pm/projectcenter/findInvolvedProjects?access_token=访问令牌
Body: {
	"phoneNo": "13466649325",
	"projectStatusFilterDto": {
		"includeStatus": [
			"NORMAL"
		],
		"excludeStatus": [
			""
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
code	string	否	请求状态码 示例：200
data	object	是	数据
code	string	否	项目编码 示例：2288684340777216
custManagerId	string	否	客户经理ID（员工档案ID） 示例：2251406403588352
estiManDays	long	否	预计人天 示例：20
id	string	否	id 示例：2283856228290816
managerId	string	否	项目经理ID（员工档案ID） 示例：2230618183569664
name	string	否	项目名称 示例：提前立项LG001
orgId	string	否	立项企业ID (业务单元ID) 示例：2231538707042560
projectFileId	string	否	项目档案id 示例：2288684354670848
projectStatus	long	否	项目状态编码 示例：11
projectStatusName	string	否	项目状态名称 示例：ADVANCE
settlementBasis	long	否	结算依据.清单结算:1. 里程碑结算:2. 示例：1
contrctId	string	否	销售合同ID 示例：23331254312355
message	string	否	请求信息 示例：查询成功

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"code": "2288684340777216",
			"custManagerId": "2251406403588352",
			"estiManDays": 20,
			"id": "2283856228290816",
			"managerId": "2230618183569664",
			"name": "提前立项LG001",
			"orgId": "2231538707042560",
			"projectFileId": "2288684354670848",
			"projectStatus": 11,
			"projectStatusName": "ADVANCE",
			"settlementBasis": 1,
			"contrctId": "23331254312355"
		}
	],
	"message": "查询成功"
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
1032001990002	手机号不允许为空	手机号不允许为空,检查是否输入
1032001990001	未接收到参数	检查参数是否正确输入
1032001990099	其他异常	稍后重试
1032001990003	您输入的手机号不合规,请检查	检查手机号是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-11	
更新
请求说明
更新
请求参数 managerId
更新
请求参数 managerCode
新增
错误码 1032001990023
	2	2025-07-16	
新增
请求参数 managerId
新增
请求参数 managerCode
新增
错误码 1032001990022
支持变更项目经理
	3	2025-06-26	
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


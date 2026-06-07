---
title: "立项单查询"
apiId: "1883415512491753479"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Initiation Application"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Initiation Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 立项单查询

>  请求方式	POST | Project Initiation Application (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/projectcreation/queryProjectCreationByCondition
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
tenantId	string	否	是	租户ID 示例：0000L6YQ8AVLFUZPXD0000
projectId	string	否	否	项目档案ID，项目档案ID和项目编码同时存在，以项目档案ID为准 示例：2088157367996776453
projectCode	string	否	否	项目编码 示例：00000003
projectDateBegin	Date	否	是	立项开始日期(格式：yyyy-MM-dd) 示例：2023-12-11
projectDateEnd	Date	否	是	立项结束日期（格式：yyyy-MM-dd） 示例：2023-12-12
page	int	否	否	分页页码（不能小于1,默认为1） 示例：1 默认值：1
count	int	否	否	每页数量（不能小于0,默认数量为50） 示例：10 默认值：50
orgCodes	string	是	否	立项企业code集合 示例：["666666","code0001"]
transiTypeCodes	string	是	否	交易类型编码集合 示例：["PMC1003-01"]
status	number
小数位数:0,最大长度:1	否	否	单据状态(0-开立态,3-审核中,1-已审核) 示例：0
vouchdateBegin	date
格式:yyyy-MM-dd	否	否	单据开始日期 示例：2023-12-12
vouchdateEnd	date
格式:yyyy-MM-dd	否	否	单据结束日期 示例：2023-12-12
auditTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批开始时间 示例：2023-12-12 08:00:00
auditTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批结束时间 示例：2023-12-12 08:00:00
createTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建开始时间 示例：2023-12-12 08:00:00
createTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建结束时间 示例：2023-12-12 08:00:00
modifyTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改开始时间 示例：2023-12-12 08:00:00
modifyTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改结束时间 示例：2023-12-12 08:00:00
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳开始时间 示例：2023-12-12 08:00:00
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳结束时间 示例：2023-12-12 08:00:00

## 3. 请求示例

Url: /yonbip/pm/projectcreation/queryProjectCreationByCondition?access_token=访问令牌
Body: {
	"tenantId": "0000L6YQ8AVLFUZPXD0000",
	"projectId": "2088157367996776453",
	"projectCode": "00000003",
	"projectDateBegin": "2023-12-11",
	"projectDateEnd": "2023-12-12",
	"page": 1,
	"count": 10,
	"orgCodes": [
		"666666",
		"code0001"
	],
	"transiTypeCodes": [
		"PMC1003-01"
	],
	"status": 0,
	"vouchdateBegin": "2023-12-12",
	"vouchdateEnd": "2023-12-12",
	"auditTimeBegin": "2023-12-12 08:00:00",
	"auditTimeEnd": "2023-12-12 08:00:00",
	"createTimeBegin": "2023-12-12 08:00:00",
	"createTimeEnd": "2023-12-12 08:00:00",
	"modifyTimeBegin": "2023-12-12 08:00:00",
	"modifyTimeEnd": "2023-12-12 08:00:00",
	"pubtsBegin": "2023-12-12 08:00:00",
	"pubtsEnd": "2023-12-12 08:00:00"
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
code	string	否	请求状态编码 示例：200
message	string	否	请求状态描述 示例：操作成功
data	object	是	返回数据
pageIndex	int	否	分页页数 示例：1
pageSize	int	否	分页数量 示例：10
recordCount	int	否	数据总量 示例：681
pageCount	int	否	分页总页数 示例：69
beginPageIndex	int	否	分页首页 示例：1
endPageIndex	int	否	分页末页 示例：10
recordList	object	是	数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"pageIndex": 1,
			"pageSize": 10,
			"recordCount": 681,
			"pageCount": 69,
			"beginPageIndex": 1,
			"endPageIndex": 10,
			"recordList": [
				{
					"deliveryList": [
						{
							"unitPrice": 88.5,
							"totalMny": 8849.56,
							"productId": 2470767201440000,
							"totalTaxMny": 10000,
							"orgId": "2469709537334528",
							"contractObjectId": "2471000024240385",
							"taxRate": 13,
							"qty": 100,
							"unitTaxPrice": 100,
							"id": 2471000429842688,
							"finOrgId": "2469709537334528",
							"skuId": 2470767213220096,
							"cqtUnitId": 2470766143344896,
							"producCode": "0001",
							"cqtUnitName": "千克",
							"memo": "我是销售清单备注"
						}
					],
					"custManagerId": "2469713902162176",
					"departmentId": "2469710188007680",
					"estiIncomeMny": 50000,
					"natEstiExpendMny": 10000,
					"constrPeriod": 999,
					"natCurrencyId": "2469603733737984",
					"projectDate": "2021-10-12 00:00:00",
					"estiExpendMny": 10000,
					"id": 2470856672137472,
					"currencyId": "2469603733737984",
					"natEstiIncomeMny": 50000,
					"estiManDays": 55,
					"natEstiProfitMny": 40000,
					"expectSignDate": "2021-10-12 00:00:00",
					"keyFlag": false,
					"name": "用友网络科技股份有限公司",
					"finOrgId": "2469709537334528",
					"code": "00000002",
					"exchRate": 1,
					"orgId": "2469709537334528",
					"customerId": 2470769264939264,
					"planEndDate": "2024-07-06 00:00:00",
					"exchRateTypeId": "0000KUM991V7BR516C0000",
					"projectFileId": "2470856668434944",
					"managerId": "2481053510357248",
					"projectTypeId": "2643576439952128",
					"estiProfitMny": 40000,
					"planStartDate": "2021-10-12 00:00:00",
					"categoryId": "2470770940957184",
					"salesOrgId": "2469709537334528",
					"orgName": "用友网络科技股份有限公司",
					"orgCode": "10",
					"categoryCode": "00000001",
					"categoryName": "希望类",
					"managerName": "王策",
					"customerCode": "01",
					"customerName": "项目云事业部",
					"custManagerName": "追忆蓝星",
					"salesOrgCode": "10",
					"finOrgCode": "10",
					"finOrgName": "用友网络科技股份有限公司",
					"currencyName": "人民币",
					"currencyCode": "CNY",
					"departmentName": "项目云",
					"departmentCode": "0101",
					"exchagerateTypeCode": "01",
					"exchagerateTypeId": "0000KUM991V7BR516C0000",
					"exchagerateTypeName": "基准汇率",
					"natCurrencyCode": "CNY",
					"natCurrencyName": "人民币",
					"projectTypeName": "通用项目",
					"projectCode": "code001",
					"projectTypeCode": "projectType0",
					"teamMembers": [
						{
							"id": "1886893070210301956",
							"memberId": "1861812685992099846",
							"memberName": "张三",
							"projectRoleId": "1847684416828604532",
							"projectRoleName": "项目经理",
							"memberMobile": "18834820699",
							"memo": "我是团队成员备注信息"
						}
					],
					"projectDesc": "哩个想",
					"status": "3",
					"statusName": "已审核",
					"transiTypeId": "1847684391085540901",
					"transiTypeCode": "PMC1003-01",
					"originatorName": "张崇玉",
					"originatorId": "1851282946610692105"
				}
			]
		}
	]
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
1032001990001	未接收到参数	如果传入的参数实体为空的话，就会出现这种情况。但是可能性为零
1032001990002	租户id不能为空	租户id必填性
1032001990003	立项日期的开始和结束不能同时为空	立项日期的开始和结束不能同时为空，否则会出现该报错
1032001990004	立项日期的开始时间不能晚于结束时间	立项日期的开始时间不能晚于结束时间，否则会出现该报错
1032001990005	分页信息异常，页码从1开始，页面数量不能小于1	传入的分页信息不符合传参说明
1032001990006	未查询到数据	没有查询到符合条件的立项单
1032001990099	其他异常	其他程序的未知错误
1032001990008	查询项目信息失败	查询项目信息失败

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


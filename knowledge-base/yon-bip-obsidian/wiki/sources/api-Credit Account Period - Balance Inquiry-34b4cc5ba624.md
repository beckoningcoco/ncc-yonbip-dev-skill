---
title: "信用账期/余额查询"
apiId: "34b4cc5ba6244aa2aa60f45c7428ccde"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Consump Details"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Consump Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 信用账期/余额查询

>  请求方式	POST | Credit Consump Details (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/credit/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	查询数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
targetObjId	long	否	否	客户id(不支持传code，对象类型为0时，必填) 示例：2251362603274496
currencyId	string	否	是	币种id 示例：2152541263991040
controlOrgId	long	否	否	授信组织id 示例：2154061429052160
bizId	long	否	否	商家id，为空时按租户查询，反之该商家查询 示例：1951482557763840
creditQueryType	short	否	否	查询规则类型 （1 余额 ，2 逾期天数，0 余额和逾期天数，不传默认为0 ） 示例：0
targetType	short	否	否	对象类型（0:客户,1:业务员,2:销售组织,3:部门,4:对象域） 示例：0
targetDomainCode	string	否	否	对象域编码（对象类型为4时，必填,id或者code） 示例：客户-业务员
departmentId	string	否	否	部门ID或者code(对象类型为3时，必填) 示例：2737399362179328
salesOrgId	string	否	否	销售组织ID或者code(对象类型为2时，必填) 示例：2611170238403328
salesManId	string	否	否	业务员ID或者code(对象类型为1时，必填) 示例：2264335782712320

## 3. 请求示例

Url: /yonbip/sd/credit/query?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"targetObjId": 2251362603274496,
			"currencyId": "2152541263991040",
			"controlOrgId": 2154061429052160,
			"bizId": 1951482557763840,
			"creditQueryType": 0,
			"targetType": 0,
			"targetDomainCode": "客户-业务员",
			"departmentId": "2737399362179328",
			"salesOrgId": "2611170238403328",
			"salesManId": "2264335782712320"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	操作状态码 示例：200
message	string	否	操作信息 示例：操作成功
data	object	是	返回数据
targetObjId	long	否	客户id 示例：2251362603274496
currencyId	string	否	币种id 示例：2152541263991040
controlOrgId	long	否	授信组织id 示例：2154061429052160
bizId	long	否	商家id 示例：1951482557763840
creditQueryType	long	否	查询规则类型（0.查询余额和逾期天数，1.查询余额，2.查询逾期天数 ） 示例：0
overdueDays	long	否	信用应收情况逾期天数 示例：0
settingOverdueDays	long	否	信用档案逾期天数 示例：0
creditLine	BigDecimal	否	信用额度 示例：0
creditBalance	BigDecimal	否	信用余额 示例：0
preBalance	number
小数位数:8,最大长度:28	否	信用预占余额 示例：0
targetType	short	否	信用对象类型（0.客户，1.业务员，2.组织，3.部门，4.对象域） 示例：0
controlScope	short	否	控制范围（0.当前组织，2.全局，3.范围域） 示例：0
targetDomainId	long	否	对象域id 示例：2154061429052160
controlDomainId	long	否	范围域id 示例：2154061429052160
startDate	DateTime	否	信用起始日期 示例：2019-12-09 00:00:00
endDate	DateTime	否	信用截止日期 示例：2019-12-31 00:00:00

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"targetObjId": 2251362603274496,
			"currencyId": "2152541263991040",
			"controlOrgId": 2154061429052160,
			"bizId": 1951482557763840,
			"creditQueryType": 0,
			"overdueDays": 0,
			"settingOverdueDays": 0,
			"creditLine": 0,
			"creditBalance": 0,
			"preBalance": 0,
			"targetType": 0,
			"controlScope": 0,
			"targetDomainId": 2154061429052160,
			"controlDomainId": 2154061429052160,
			"startDate": "2019-12-09 00:00:00",
			"endDate": "2019-12-31 00:00:00"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-12	
新增
返回参数 preBalance
QDZT-36812 【预占】API查询信用余额，返回值添加预占余额字段（915）
	2	2025-06-25	
更新
请求参数 (7)
更新
返回参数 (18)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


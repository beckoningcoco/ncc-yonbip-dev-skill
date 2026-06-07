---
title: "对象信用档案删除"
apiId: "2040016050257920005"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Object File"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Object File]
platform_version: "BIP"
source_type: community-api-docs
---

# 对象信用档案删除

>  请求方式	POST | Credit Object File (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/creditrecord/delete
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
data	object	否	否	请求参数
targetType	string	否	否	对象类型（枚举，输入码值： 0 :客户,1 :业务员,2 :销售组织,3 :销售部门,4 :对象域,5 :会计主体） 示例：0
targetObjId	string	否	否	信用控制对象 示例：1751687944950016
containSub	string	否	否	包含下级(枚举： 0：否，1：是) 示例：0
isShare	string	否	否	共享收款（枚举： 0：否，1：是） 示例：1
controlScope	string	否	否	控制范围（枚举： 0 :当前组织,2 :全局,3 :范围域） 示例：0
controlDomainId	string	否	否	范围域 示例：2548881394667776
quotaRuleId	string	否	否	额度占用规则 示例：2274036982321408
checkRuleId	string	否	否	信用检查规则 示例：2529055514087936
currencyId	string	否	否	币种 示例：2274035737448704
queryDate	string	否	否	时间（格式yyyy-MM-dd,需要和时间范围queryDateRange一起使用） 示例：2024-07-12
queryDateRange	string	否	否	时间范围（枚举，1：仅当时时间点匹配的档案，2：全部时间段的档案，3：当前时间点匹配的以及之后的档案； 需要和时间queryDate配合使用） 示例：1

## 3. 请求示例

Url: /yonbip/sd/creditrecord/delete?access_token=访问令牌
Body: {
	"data": {
		"targetType": "0",
		"targetObjId": "1751687944950016",
		"containSub": "0",
		"isShare": "1",
		"controlScope": "0",
		"controlDomainId": "2548881394667776",
		"quotaRuleId": "2274036982321408",
		"checkRuleId": "2529055514087936",
		"currencyId": "2274035737448704",
		"queryDate": "2024-07-12",
		"queryDateRange": "1"
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
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	单据不存在	

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


---
title: "企业绩效组织体系-成员引入"
apiId: "1786115201651703810"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Organization System"
domain: "PF"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 企业绩效组织体系-成员引入

>  请求方式	POST | Organization System (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/epmorg/introducenew
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
epmOrgId	string	否	是	预算报表组织体系id 可以从企业绩效组织体系-体系树 接口中获取 示例：1760005923670065153
introduceDTOList	object	是	是	引入DTO列表
fromOrgType	string	否	是	引入数据的组织类型("0": "业务单元+部门","1": "会计主体","2": "部门","3": "成本中心", "5": "销售区域","7": "业务单元") 示例：0
includeSub	boolean	否	是	是否包含下级 示例：false 默认值：false
orgIds	string	是	是	要引入的组织id，如果传函数，需要拼接函数id(所有下级（含自己）:2295602243015793/直接下级:2295602243015792/末级节点:2295602243015795/同级节点:2295602243015794),拼接形式：组织id#函数id 示例：["1752734475335237639#2295602243015793"]
isContainDisEnable	boolean	否	是	是否包含未启用数据 示例：false 默认值：false
selectDate	Date	否	是	引入日期 示例：2023-08-08
toOrgId	string	否	否	父组织id（组织体系树的id） 示例：null

## 3. 请求示例

Url: /yonbip/digitalModel/epmorg/introducenew?access_token=访问令牌
Body: {
	"epmOrgId": "1760005923670065153",
	"introduceDTOList": [
		{
			"fromOrgType": "0",
			"includeSub": false,
			"orgIds": [
				"1752734475335237639#2295602243015793"
			]
		}
	],
	"isContainDisEnable": false,
	"selectDate": "2023-08-08",
	"toOrgId": "null"
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
code	string	否	成功状态码 示例：200
message	string	否	描述信息 示例：操作成功
data	string	是	返回结果集

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		""
	]
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-22	
更新
请求说明
请求入参增加serviceCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


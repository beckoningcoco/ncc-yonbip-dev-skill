---
title: "集团司库数据上报客商信息整单新增"
apiId: "2184712673701134343"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Regulatory Reporting"
domain: "ctm"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 集团司库数据上报客商信息整单新增

>  请求方式	POST | Regulatory Reporting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/submit/api/group/merchinfo/bill/insert
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
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
dataDate	string	否	是	数据日期
submitType	string	否	是	上报业务数据类型 MERCHINFO 示例：MERCHINFO
detailList	object	是	是	明细
submitGroupCreditCode	string	否	是	所属集团编码
submitGroupName	string	否	是	所属集团名称
dataSource	string	否	是	数据来源 MANUAL_INPUT 手工录入 CUSTOMER_FILE 客商档案 CUSTOMER_FILE_REVISION 客商档案修订
sourceId	string	否	是	外部数据来源id
ownUnitCode	string	否	是	本方单位编码
ownUnitName	string	否	是	本方单位名称
merchantName	string	否	是	客商名称
legalRepresent	string	否	否	法定代表人
socialCreditCode	string	否	否	统一社会信用代码
registeredCapital	number
小数位数:2,最大长度:32	否	否	注册资本
establishDate	string	否	否	成立日期
companyAddress	string	否	否	企业地址
internalExternalMark	string	否	是	集团内外部标识
merchantsFamiliar	string	否	否	客商属性
industry	string	否	否	所属行业

## 3. 请求示例

Url: /yonbip/ctm/submit/api/group/merchinfo/bill/insert?access_token=访问令牌
Body: {
	"dataDate": "",
	"submitType": "MERCHINFO",
	"detailList": [
		{
			"submitGroupCreditCode": "",
			"submitGroupName": "",
			"dataSource": "",
			"sourceId": "",
			"ownUnitCode": "",
			"ownUnitName": "",
			"merchantName": "",
			"legalRepresent": "",
			"socialCreditCode": "",
			"registeredCapital": 0,
			"establishDate": "",
			"companyAddress": "",
			"internalExternalMark": "",
			"merchantsFamiliar": "",
			"industry": ""
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
code	number
小数位数:0,最大长度:10	否	接口返回状态码
message	string	否	返回描述
sourceIds	string	是	插入成功的外部来源id

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"sourceIds": [
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
暂时没有数据哦~

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


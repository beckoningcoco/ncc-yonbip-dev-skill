---
title: "银行交易回单查询及下载"
apiId: "1749045656754847751"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Transaction Receipt"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Transaction Receipt]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行交易回单查询及下载

>  请求方式	POST | Account Transaction Receipt (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/cmp/bankReconciliationQuery_copy
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
pageIndex	int	否	否	页号 默认值：1
pageSize	int	否	否	每页行数 默认值：10
accentity	string	否	否	账户使用组织id 示例：2591580914225408
accentity_code	string	否	否	账户使用组织编码；只有账户使用组织id为空时该条件生效 示例：110
dc_flag	int	否	否	借贷方向：1借；2贷 示例：1
currency	string	否	否	币种id 示例：2350737731850752
currency_name	string	否	否	币种名称；只有在币种id为空时该条件才会生效 示例：人民币
begin_date	Date	否	否	开始日期，交易日期 示例：2023-02-01
end_date	Date	否	否	结束日期，交易日期 示例：2023-02-10
bankaccount	string	否	否	本方银行账户id 示例：1510000739330031619
bankaccount_account	string	否	否	本方银行账号；只有本方银行账户id为空时该条件生效 示例：622221444555

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationQuery_copy?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "2591580914225408",
	"accentity_code": "110",
	"dc_flag": 1,
	"currency": "2350737731850752",
	"currency_name": "人民币",
	"begin_date": "2023-02-01",
	"end_date": "2023-02-10",
	"bankaccount": "1510000739330031619",
	"bankaccount_account": "622221444555"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
recordList	object	是	返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"accentity": "2591580914225408",
				"accentity_code": "ZSZB",
				"accentity_name": "曾氏总部",
				"currency": "2591342867010560",
				"currency_name": "人民币",
				"bankaccount": "1510000739330031619",
				"bankaccount_acctName": "测试银行账户户名",
				"bankaccount_account": "622221444555",
				"bank_seq_no": "test01",
				"tran_date": "2023-03-01",
				"dc_flag": 1,
				"tran_amt": 22.3,
				"to_acct_no": "",
				"to_acct_name": "",
				"to_acct_bank": "",
				"to_acct_bank_name": "",
				"use_name": "",
				"remark": "",
				"url": "",
				"bankpdf": {}
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
999	服务端逻辑异常:XXX	根据提示调整参数重试请求

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


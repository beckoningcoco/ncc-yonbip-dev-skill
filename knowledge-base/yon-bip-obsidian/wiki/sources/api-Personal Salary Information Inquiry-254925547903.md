---
title: "个人薪资信息查询"
apiId: "2549255479039623172"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payroll Calculation"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payroll Calculation]
platform_version: "BIP"
source_type: community-api-docs
---

# 个人薪资信息查询

>  请求方式	POST | Payroll Calculation (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/api/mdd/pay/payslip/queryPayslipDetail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Digital-Avatar-Id	string	header	否	Digital-Avatar-Id
Yht-Access-Token	string	header	否	Yht-Access-Token
yht_access_token	string	header	否	yht_access_token
Body参数
名称	类型	数组	必填	描述
beginYear	string	否	是	起始年 示例：2026
beginMonth	string	否	是	起始月 示例：02
endYear	string	否	是	结束年 示例：2026
endMonth	string	否	是	结束月 示例：05
passwordType	number
小数位数:0,最大长度:10	否	否	密码类型 1:密码 2:验证码 passwordConfig不等于4的时候必填 示例：1
password	string	否	否	密码或验证码 passwordConfig不等于4的时候必填 示例：Aa123456
queryType	number
小数位数:0,最大长度:10	否	是	查询类型 1 按照发薪期间查询 2 按照发放日期查询 示例：1
passwordConfig	number
小数位数:0,最大长度:10	否	是	0:密码或验证码 1：密码或验证码 2：仅密码 3：仅验证码 4：不需要验证 示例：1

## 3. 请求示例

Url: /yonbip/HCC/api/mdd/pay/payslip/queryPayslipDetail?access_token=访问令牌
Header: 
	Digital-Avatar-Id : ""
	Yht-Access-Token : ""
	yht_access_token : ""
Body: {
	"beginYear": "2026",
	"beginMonth": "02",
	"endYear": "2026",
	"endMonth": "05",
	"passwordType": 1,
	"password": "Aa123456",
	"queryType": 1,
	"passwordConfig": 1
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
data	object	是	data
webTopData	object	是	webTopData
moblieTopData	object	是	moblieTopData
basicData	object	是	basicData
detailData	object	是	detailData

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"webTopData": [
				{
					"name": "应发工资",
					"value": "60200.00"
				}
			],
			"moblieTopData": [
				{
					"name": "实发工资",
					"value": "52100.00"
				}
			],
			"basicData": [
				{
					"name": "period",
					"value": "2026-05"
				}
			],
			"detailData": [
				{
					"parentDto": {
						"name": "分组1",
						"isSum": 0,
						"type": 1
					},
					"detailList": [
						{
							"name": "应发工资",
							"type": "number",
							"value": "60200.00",
							"key": "9"
						}
					]
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-06-04	
新增
请求参数 passwordConfig
更新
请求参数 passwordType
更新
请求参数 password

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


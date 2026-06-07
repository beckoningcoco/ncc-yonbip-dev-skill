---
title: "增值税减免计算表-新增"
apiId: "2027364081612095495"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calculation Table of Value-added Tax Reduction"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calculation Table of Value-added Tax Reduction]
platform_version: "BIP"
source_type: community-api-docs
---

# 增值税减免计算表-新增

>  请求方式	POST | Calculation Table of Value-added Tax Reduction (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/other-tax/api/tax-redution/add
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
orgCode	string	否	是	组织编码 示例：rzs2
period	string	否	是	税款所属期 示例：2024-05
reductionType	string	否	是	减免税类型 1:减税；2:免税 示例：1
reductionPolicyName	string	否	是	减免税政策名称 长度最大500 示例：0001010504|SXA031900428|蔬菜免征增值税优惠|《财政部 国家税务总局关于免征蔬菜流通环节增值税有关问题的通知》 财税〔2011〕137号
deductionTax	number
小数位数:2,最大长度:15	否	否	抵减税额 示例：100.00
otSaleMny	number
小数位数:2,最大长度:15	否	否	免征增值税项目销售额 示例：200
otSubMny	number
小数位数:2,最大长度:15	否	否	免税销售额扣除项目本期实际扣除金额 示例：50
itTax	number
小数位数:0,最大长度:15	否	否	免税销售额对应的进项税额 示例：10
freeTax	number
小数位数:2,最大长度:15	否	否	免税额 示例：5
projectCode	string	否	否	项目编码 示例：aaa
remark	string	否	否	备注 长度最大500 示例：bbbb
sourceId	string	否	是	来源id 长度最大200 示例：111

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/tax-redution/add?access_token=访问令牌
Body: [{
	"orgCode": "rzs2",
	"period": "2024-05",
	"reductionType": "1",
	"reductionPolicyName": "0001010504|SXA031900428|蔬菜免征增值税优惠|《财政部 国家税务总局关于免征蔬菜流通环节增值税有关问题的通知》 财税〔2011〕137号",
	"deductionTax": 100,
	"otSaleMny": 200,
	"otSubMny": 50,
	"itTax": 10,
	"freeTax": 5,
	"projectCode": "aaa",
	"remark": "bbbb",
	"sourceId": "111"
}]

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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	提示信息 示例：操作成功

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
9999	未知错误	按返回信息处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-04	
新增
请求参数 defineTerm
修改所属分类

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


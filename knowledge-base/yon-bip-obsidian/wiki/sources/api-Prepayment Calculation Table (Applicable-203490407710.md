---
title: "预缴计算表（建筑业适用）-新增"
apiId: "2034904077101432834"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Advance payment calculation table(Applicable to construction industry)"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 预缴计算表（建筑业适用）-新增

>  请求方式	POST | Advance payment calculation table(Applicable to construction industry) (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
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
orgId	string	否	是	税务组织id 示例：1798776756739506178
projectId	string	否	是	项目主键 示例：1803937537907490822
period	string	否	是	预缴所属期 示例：2024-02
amount	number
小数位数:0,最大长度:10	否	是	开票金额(含税) 示例：1111
finalPeriod	string	否	否	最终预缴所属期
prepayTaxes	object	是	否	预缴税集合
taxCategoryArchiveId	string	否	否	税种id 示例：10001
taxType	string	否	是	税类型:税种 0:增值税，1:企业所得税，2：个人所得税，3：印花税，4：水利建设基金税，5：城市维护建设税，6：教育附加税，7：地方教育附加，8：残疾人就业保障金，9：工会经费，10：资源税，11：垃圾处置费,12:环保税 示例：3
taxationBasis	number
小数位数:0,最大长度:10	否	是	计税依据 0 ：不含税金额 1： 含税金额 2：增值税税额 示例：0
taxRate	number
小数位数:3,最大长度:10	否	是	税率 示例：0.001
prepayAmount	string	否	否	预缴金额 示例：1078.64
taxDeduction	string	否	否	六税两费减免税额
taxAmount	string	否	否	税额 示例：1.08
projectPaymentId	string	否	是	项目预缴id 示例：1803937537907490823
isDeduction	string	否	否	是否享受六税两费减免 示例：0
taxOfficeName	string	否	否	税局名称 示例：国家税务总局福建福安经济开发区税务局
verifyNumber	string	否	否	跨区域涉税事项报验管理编号
taxType	string	否	否	计税方式；1：一般计税；2：简易计税 示例：2

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/add?access_token=访问令牌
Body: {
	"orgId": "1798776756739506178",
	"projectId": "1803937537907490822",
	"period": "2024-02",
	"amount": 1111,
	"finalPeriod": "",
	"prepayTaxes": [
		{
			"taxCategoryArchiveId": "10001",
			"taxType": "3",
			"taxationBasis": 0,
			"taxRate": 0.001,
			"prepayAmount": "1078.64",
			"taxDeduction": "",
			"taxAmount": "1.08"
		}
	],
	"projectPaymentId": "1803937537907490823",
	"isDeduction": "0",
	"taxOfficeName": "国家税务总局福建福安经济开发区税务局",
	"verifyNumber": "",
	"taxType": "2"
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
code	string	否	操作码 示例：200
message	string	否	操作描述 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统错误	根据具体返回信息调整数据
1001	校验错误	根据具体返回信息调整数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
更新
请求参数 orgId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


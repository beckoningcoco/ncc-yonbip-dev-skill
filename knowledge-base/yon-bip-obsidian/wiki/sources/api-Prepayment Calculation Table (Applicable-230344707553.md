---
title: "预缴计算表（建筑业适用）-不征税发票查询"
apiId: "2303447075537289217"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Advance payment calculation table(Applicable to construction industry)"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 预缴计算表（建筑业适用）-不征税发票查询

>  请求方式	POST | Advance payment calculation table(Applicable to construction industry) (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/write-off-list
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
orgCode	string	否	是	会计主体编码 示例：1895096569401704449
projectCode	string	否	是	项目编号 示例：111
verifyNumber	string	否	否	跨区域涉税事项报验管理编号 示例：2222
declarePeriod	string	否	否	申报所属期 示例：2024-07
declareStatus	string	否	否	申报状态（1：未申报 2：已申报 3：预申报） 示例：1
fpDm	string	否	否	发票代码 示例：1233
fpHm	string	否	否	发票号码 示例：111

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/write-off-list?access_token=访问令牌
Body: {
	"orgCode": "1895096569401704449",
	"projectCode": "111",
	"verifyNumber": "2222",
	"declarePeriod": "2024-07",
	"declareStatus": "1",
	"fpDm": "1233",
	"fpHm": "111"
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
data	object	是	返回值集合
nsrmc	string	否	纳税人名称 示例：111
nsrsbh	string	否	纳税人识别号 示例：222
orgCode	string	否	会计主体编码 示例：333
orgName	string	否	会计主体名称 示例：333
projectCode	string	否	项目编码 示例：项目编码
projectName	string	否	项目名称 示例：项目名称
fpDm	string	否	发票代码 示例：发票代码
fpHm	string	否	发票号码 示例：发票号码
fplx	string	否	发票类型 示例：发票类型
gmfMc	string	否	购买方名称 示例：购买方名称
kprq	string	否	开票日期 示例：开票日期
hjje	number
小数位数:2,最大长度:15	否	合计金额 示例：12.23
hjse	number
小数位数:2,最大长度:15	否	合计税额 示例：1.23
jshj	number
小数位数:2,最大长度:15	否	价税合计 示例：13.46
noTaxationStayWriteOffAmount	number
小数位数:2,最大长度:15	否	不征税可核销金额（含税）合计 示例：10090
noTaxationHasWriteOffAmount	number
小数位数:2,最大长度:15	否	不征税已核销金额（含税）合计 示例：111

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"nsrmc": "111",
			"nsrsbh": "222",
			"orgCode": "333",
			"orgName": "333",
			"projectCode": "项目编码",
			"projectName": "项目名称",
			"fpDm": "发票代码",
			"fpHm": "发票号码",
			"fplx": "发票类型",
			"gmfMc": "购买方名称",
			"kprq": "开票日期",
			"hjje": 12.23,
			"hjse": 1.23,
			"jshj": 13.46,
			"noTaxationStayWriteOffAmount": 10090,
			"noTaxationHasWriteOffAmount": 111
		}
	]
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
	1	2025-08-12	
更新
请求参数 orgCode
更新
返回参数 orgCode
更新
返回参数 orgName
降板

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


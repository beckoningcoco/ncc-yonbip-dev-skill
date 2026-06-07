---
title: "薪资发放单ID查询工资单"
apiId: "1803990305805434884"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payroll"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payroll]
platform_version: "BIP"
source_type: community-api-docs
---

# 薪资发放单ID查询工资单

>  请求方式	POST | Payroll (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/payfile/queryPayslipsByPayFileIdsMDD
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
ids	string	否	是	薪资发放单ID 示例：1489285115567144968,1487209641341353986

## 3. 请求示例

Url: /yonbip/hrcloud/payfile/queryPayslipsByPayFileIdsMDD?access_token=访问令牌
Body: {
	"ids": "1489285115567144968,1487209641341353986"
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
code	string	否	code 示例：200
message	string	否	message 示例：查询成功
data	object	是	data
id	string	否	工资单ID 示例：1700917000547074057
cyear	string	否	工资表年 示例：2022
cperiod	string	否	工资表月 示例：12
pkWaclass	string	否	薪资类型主键 示例：1700917009154834441
staffid	string	否	发薪人员id 示例：12345
overFlag	string	否	0:未结算,1:已结算,2:已确认 示例：0
pkPayfileDoc	string	否	薪资发放单明细ID 示例：01ea3771-0e3b-4fab-ac23-0b8528392b6f
amtPayable	long	否	应发工资总计 示例：0
amtReality	long	否	实发工资总计 示例：0
amtDeduct	long	否	人员扣款合计 示例：0
amtDeductTax	long	否	本次扣税 示例：0
paytitles	string	否	项目名称 示例：{"1":"姓名","2":"000","3":"扣款合计","4":"实发工资","5":"本次扣税"}
paytitles2	string	否	项目名称_英文 示例：{"1":"Name","2":"000","3":"扣款合计","4":"实发工资","5":"本次扣税"}
paytitles3	string	否	项目名称_繁体 示例：{"1":"姓名","2":"000","3":"扣款合计","4":"实发工资","5":"本次扣税"}
paydate	long	否	发放时间 示例：1675612800000
typeName	string	否	薪资类别名称 示例：一般劳务报酬个税计算
pkOrg	string	否	组织主键 示例：2677750465876480
paydatas	string	否	项目值 示例：{"1":"测试ok薪资组","2":"0.00","3":"0.00","4":"0.00","5":"0.00"}
payslipWeb	string	否	web端工资条 示例：{"1":"000","2":"扣款合计","3":"实发工资","4":"本次扣税"}
payslipWeb2	string	否	web端工资条_英文 示例：{"1":"000","2":"扣款合计","3":"实发工资","4":"本次扣税"}
payslipWeb3	string	否	web端工资条_繁体 示例：{"1":"000","2":"扣款合计","3":"实发工资","4":"本次扣税"}
payslipMobile	string	否	手机端工资条 示例：{"1":"实发工资","2":"000","3":"本次扣税"}
payslipMobile2	string	否	手机端工资条_英文 示例：{"1":"实发工资","2":"000","3":"本次扣税"}
payslipMobile3	string	否	手机端工资条_繁体 示例：{"1":"实发工资","2":"000","3":"本次扣税"}
nameEncode	string	否	项目名称编码 示例：{"000":"f_n_1","扣款合计":"f_n_2","实发工资":"f_n_3","本次扣税":"f_n_5"}
mullangPaytitles	string	否	项目名称_多语 示例：{"1":"姓名","2":"000","3":"扣款合计","4":"实发工资","5":"本次扣税"}
mullangTypeName	string	否	薪资类别名称_多语 示例：一般劳务报酬个税计算

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"id": "1700917000547074057",
			"cyear": "2022",
			"cperiod": "12",
			"pkWaclass": "1700917009154834441",
			"staffid": "12345",
			"overFlag": "0",
			"pkPayfileDoc": "01ea3771-0e3b-4fab-ac23-0b8528392b6f",
			"amtPayable": 0,
			"amtReality": 0,
			"amtDeduct": 0,
			"amtDeductTax": 0,
			"paytitles": "{\"1\":\"姓名\",\"2\":\"000\",\"3\":\"扣款合计\",\"4\":\"实发工资\",\"5\":\"本次扣税\"}",
			"paytitles2": "{\"1\":\"Name\",\"2\":\"000\",\"3\":\"扣款合计\",\"4\":\"实发工资\",\"5\":\"本次扣税\"}",
			"paytitles3": "{\"1\":\"姓名\",\"2\":\"000\",\"3\":\"扣款合计\",\"4\":\"实发工资\",\"5\":\"本次扣税\"}",
			"paydate": 1675612800000,
			"typeName": "一般劳务报酬个税计算",
			"pkOrg": "2677750465876480",
			"paydatas": "{\"1\":\"测试ok薪资组\",\"2\":\"0.00\",\"3\":\"0.00\",\"4\":\"0.00\",\"5\":\"0.00\"}",
			"payslipWeb": "{\"1\":\"000\",\"2\":\"扣款合计\",\"3\":\"实发工资\",\"4\":\"本次扣税\"}",
			"payslipWeb2": "{\"1\":\"000\",\"2\":\"扣款合计\",\"3\":\"实发工资\",\"4\":\"本次扣税\"}",
			"payslipWeb3": "{\"1\":\"000\",\"2\":\"扣款合计\",\"3\":\"实发工资\",\"4\":\"本次扣税\"}",
			"payslipMobile": "{\"1\":\"实发工资\",\"2\":\"000\",\"3\":\"本次扣税\"}",
			"payslipMobile2": "{\"1\":\"实发工资\",\"2\":\"000\",\"3\":\"本次扣税\"}",
			"payslipMobile3": "{\"1\":\"实发工资\",\"2\":\"000\",\"3\":\"本次扣税\"}",
			"nameEncode": "{\"000\":\"f_n_1\",\"扣款合计\":\"f_n_2\",\"实发工资\":\"f_n_3\",\"本次扣税\":\"f_n_5\"}",
			"mullangPaytitles": "{\"1\":\"姓名\",\"2\":\"000\",\"3\":\"扣款合计\",\"4\":\"实发工资\",\"5\":\"本次扣税\"}",
			"mullangTypeName": "一般劳务报酬个税计算"
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
500	调用失败	

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


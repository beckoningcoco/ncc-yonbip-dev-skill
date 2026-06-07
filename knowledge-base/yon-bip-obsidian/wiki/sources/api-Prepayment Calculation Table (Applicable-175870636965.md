---
title: "预缴计算表（建筑业适用）数据查询（项目维度查询）"
apiId: "1758706369652326427"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Advance payment calculation table(Applicable to construction industry)"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 预缴计算表（建筑业适用）数据查询（项目维度查询）

>  请求方式	POST | Advance payment calculation table(Applicable to construction industry) (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/invoiced-amount/query
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
period	string	否	否	预缴所属期 示例：2023-01
projectCode	string	否	是	项目编号 示例：11
orgCode	string	否	是	税务组织编码 示例：11
verifyNumber	string	否	否	跨区域涉税事项报验管理编号 示例：11
finalPeriod	string	否	否	实际预交所属期 示例：2023-01

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/invoiced-amount/query?access_token=访问令牌
Body: {
	"period": "2023-01",
	"projectCode": "11",
	"orgCode": "11",
	"verifyNumber": "11",
	"finalPeriod": "2023-01"
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
code	string	否	状态码 示例：200
message	string	否	操作描述 示例：操作成功
data	object	是	返回值集合
nsrsbh	string	否	纳税人识别号 示例：555123456888888
nsrmc	string	否	纳税人名称 示例：cs-测试
orgCode	string	否	税务组织编码 示例：555
prepaymentId	string	否	预缴主键 示例：123
projectCode	string	否	项目编号 示例：000023144
projectName	string	否	项目名称 示例：11111
isCrossRegion	string	否	是否跨区涉 示例：0
taxOfficeName	string	否	主管税务机关 示例：国家税务总局北京市大兴区税务局兴丰税务所
verifyNumber	string	否	跨区域涉税事项报验管理编号 示例：123
period	string	否	预缴所属期 YYYY-MM 示例：2023-08
finalPeriod	string	否	实际预交所属期 YYYY-MM 示例：2023-09
taxType	string	否	计税方式1-一般计税，2-简易征收（老项目），3-简易征收（甲供材）、4-简易征收（其他） 示例：1
declareStatus	long	否	申报状态 1：未申报 2：已申报 示例：1
beInvoicedAmount	BigDecimal	否	待开票金额 示例：112222
taxRelatedType	string	否	项目涉税类型；1-建筑服务，2-出租不动产，3-销售不动产 示例：1
invoicedAmount	BigDecimal	否	已开票金额 示例：0
feeWithoutTax	BigDecimal	否	不含税金额 示例：102955.96
serviceNumber	string	否	业务编码 示例：123
totalSe	BigDecimal	否	预征税额合计 示例：2954.75
verifyStateName	string	否	审批状态 示例：审批通过
prepayPaths	string	是	预缴缴款书附件地址集合
taxItems	object	是	预缴税集合
subcontractorDetails	object	是	增值税税种关联的发票明细集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"nsrsbh": "555123456888888",
			"nsrmc": "cs-测试",
			"orgCode": "555",
			"prepaymentId": "123",
			"projectCode": "000023144",
			"projectName": "11111",
			"isCrossRegion": "0",
			"taxOfficeName": "国家税务总局北京市大兴区税务局兴丰税务所",
			"verifyNumber": "123",
			"period": "2023-08",
			"finalPeriod": "2023-09",
			"taxType": "1",
			"declareStatus": 1,
			"beInvoicedAmount": 112222,
			"taxRelatedType": "1",
			"invoicedAmount": 0,
			"feeWithoutTax": 102955.96,
			"serviceNumber": "123",
			"totalSe": 2954.75,
			"verifyStateName": "审批通过",
			"prepayPaths": [
				""
			],
			"taxItems": [
				{
					"taxType": "0",
					"taxationBasis": 1,
					"prepayAmount": 112222,
					"deduction": 4,
					"taxRate": 0.02,
					"taxAmount": 2059.05
				}
			],
			"subcontractorDetails": [
				{
					"fpdm": "044002200112",
					"fphm": "15695071",
					"kprq": "2023-04-06",
					"xsfMc": "广州市北二环交通科技有限公司",
					"fplx": "14",
					"jshj": 5.99,
					"remainDeductAmount": 1.99,
					"curDeductAmount": 4,
					"totalDeductAmount": 4,
					"hjse": 0.17,
					"prepaymentId": 123
				}
			]
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
	1	2025-09-12	
新增
返回参数 verifyStateName
添加审批状态
	2	2025-07-03	
更新
请求参数 orgCode
更新
返回参数 orgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


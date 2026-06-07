---
title: "房地产涉税项目信息同步楼栋"
apiId: "1758489233285709825"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 房地产涉税项目信息同步楼栋

>  请求方式	POST | Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/block/payment/add
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
tList	object	是	否	楼栋数据
blockName	string	否	是	楼栋名称 示例：1122
blockCode	string	否	是	楼栋编码 示例：1122
preSaleTime	string	否	否	预售证时间，格式yyyy-MM-dd 示例：2023-01-01
completionFilingTime	string	否	否	竣工备案时间，格式yyyy-MM-dd 示例：2023-01-01
hardcoverAcceptanceTime	string	否	否	精装验收时间，格式yyyy-MM-dd 示例：2023-02-01
liquidationTime	string	否	否	清算时间，格式yyyy-MM-dd 示例：2023-03-01
taxCalculationMethod	string	否	是	计税方式(1 一般计税、2 简易计税) 示例：1
vatRate	double	否	是	增值税税率,增值税税率支持3位整数，7位小数 示例：0.022
projectCode	string	否	否	项目编码，项目编码长度不能超过30个字符 示例：llce
installmentCode	string	否	是	分期编码，分期编码长度不能超过30个字符 示例：1122
sectionCode	string	否	否	标段编码，标段编码长度不能超过30个字符 示例：1111
srcId	string	否	否	来源id 示例：122
cancelMark	string	否	否	作废标识（Y:是，N否） 示例：N

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/block/payment/add?access_token=访问令牌
Body: {
	"tList": [
		{
			"blockName": "1122",
			"blockCode": "1122",
			"preSaleTime": "2023-01-01",
			"completionFilingTime": "2023-01-01",
			"hardcoverAcceptanceTime": "2023-02-01",
			"liquidationTime": "2023-03-01",
			"taxCalculationMethod": "1",
			"vatRate": 0.022,
			"projectCode": "llce",
			"installmentCode": "1122",
			"sectionCode": "1111",
			"srcId": "122",
			"cancelMark": "N"
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
message	string	否	响应信息 示例：操作成功
code	string	否	编码 示例：200

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200"
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	同步数据大于1000	系统异常
1001	请设置Redis客户端编码	redis设置错误

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


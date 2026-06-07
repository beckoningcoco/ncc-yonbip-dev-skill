---
title: "查询进项发票附件信息"
apiId: "1853618498270920708"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询进项发票附件信息

>  请求方式	POST | Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/input-tax/api/billpusher/query-file
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
billId	string	否	是	业务单据id 示例：业务单据1
billNumber	string	否	是	业务单据编码 示例：业务单据code1
needDigest	long	否	否	是否需要计算hash值 0--不需要，1--需要 示例：1

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/billpusher/query-file?access_token=访问令牌
Body: {
	"billId": "业务单据1",
	"billNumber": "业务单据code1",
	"needDigest": 1
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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	信息 示例：成功
data	object	是	文件信息
pk	string	否	主键 示例：11111&&2222
type	string	否	业务类型 示例：input&&invoice
fileInfoList	object	是	文件信息列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": [
		{
			"pk": "11111&&2222",
			"type": "input&&invoice",
			"fileInfoList": [
				{
					"fileName": "111.pdf",
					"fileDigest": "51b39fc219af0ae3a6e992d468a46333"
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
9999	系统错误	系统错误

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


---
title: "返利待计算单生成数据"
apiId: "2058320350472044548"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Rebate Pending Calculation Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Rebate Pending Calculation Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 返利待计算单生成数据

>  请求方式	POST | Rebate Pending Calculation Document (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/rebatepolicy/sourcesdata/insert
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
data	object	是	是	返利待计算单信息
code	string	否	否	单据编码（非必填，根据设置的编码规则，判断是否输入单据编码）
name	string	否	是	单据名称
creationOrgId_name	string	否	是	销售组织（请输入编码或名称）
currency_name	string	否	是	币种（请输入编码或名称）
vouchdate	date
格式:yyyy-MM-dd	否	是	单据日期
agentId_name	string	否	否	客户（请输入编码或名称）
productId_name	string	否	否	物料（请输入编码或名称）
productClassId_name	string	否	否	商品分类（请输入编码或名称）
productLineId_name	string	否	否	产品线（请输入编码或名称）
productBrandId_name	string	否	否	品牌（请输入编码或名称）
marketerId_name	string	否	否	业务员（请输入编码或名称）
departmentId_name	string	否	否	部门（请输入编码或名称）
marketAreaId_name	string	否	否	销售区域（请输入编码或名称）
quality	number
小数位数:8,最大长度:19	否	是	数值
note	string	否	否	备注
oriBillType	string	否	是	来源单据类型（1-销售订单;12-销售出库;13-其他;20-核销单;21-业绩确认;22-营销目标;23-目标完成率;26-收款单)
oriBillNo	string	否	否	来源单据编码
oriBillRowNo	string	否	否	来源行号

## 3. 请求示例

Url: /yonbip/sd/rebatepolicy/sourcesdata/insert?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "",
			"name": "",
			"creationOrgId_name": "",
			"currency_name": "",
			"vouchdate": "2026-06-07",
			"agentId_name": "",
			"productId_name": "",
			"productClassId_name": "",
			"productLineId_name": "",
			"productBrandId_name": "",
			"marketerId_name": "",
			"departmentId_name": "",
			"marketAreaId_name": "",
			"quality": 0,
			"note": "",
			"oriBillType": "",
			"oriBillNo": "",
			"oriBillRowNo": ""
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	请求返回码 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	调用返回详情
count	number
小数位数:0,最大长度:10	否	新增总数量
sucessCount	number
小数位数:0,最大长度:10	否	成功条数
failCount	number
小数位数:0,最大长度:10	否	失败条数
messages	string	否	返回信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": ""
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
999	错误信息	请联系管理员

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


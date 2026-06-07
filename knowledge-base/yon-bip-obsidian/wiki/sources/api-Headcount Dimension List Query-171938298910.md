---
title: "编制维度列表查询"
apiId: "1719382989102120969"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Headcount Dimension (Deprecated)"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Headcount Dimension (Deprecated)]
platform_version: "BIP"
source_type: community-api-docs
---

# 编制维度列表查询

>  请求方式	POST | Headcount Dimension (Deprecated) (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffing/period/list
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
periodId	long	否	是	编制期间id 示例：44555555

## 3. 请求示例

Url: /yonbip/hrcloud/staffing/period/list?access_token=访问令牌
Body: {
	"periodId": 44555555
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
code	string	否	编码 示例：200表示成功
message	string	否	说明 示例：操作成功
data	object	是	返回数据
id	long	否	id 示例：1
dimensionId	long	否	维度id 示例：2
dimensionIdName	string	否	维度名 示例：岗位
periodId	long	否	期间id 示例：4
periodIdName	string	否	期间名 示例：2023上半年

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": [
		{
			"id": 1,
			"dimensionId": 2,
			"dimensionIdName": "岗位",
			"periodId": 4,
			"periodIdName": "2023上半年"
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
500	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2023-05-26	
更新
请求参数 periodId
文档

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


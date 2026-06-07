---
title: "采购品类树查询-特征"
apiId: "1840887991875665920"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procurement Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procurement Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购品类树查询-特征

>  请求方式	POST | Procurement Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/purchaseclass/newtree
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
pageIndex	int	否	是	页码 示例：1 默认值：1
pageSize	int	否	是	分页大小 示例：100 默认值：100
name	string	否	否	名称 示例：名称
code	string	否	否	编码 示例：code
orgId	string	否	否	使用组织Id条件 示例：123456
orgCode	string	否	否	使用组织code条件
beganTime	DateTime	否	否	开始时间戳，包含 示例：2023-04-17 16:30:00
endTime	DateTime	否	否	结束结束时间戳，不包含 示例：2023-04-17 16:40:00

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseclass/newtree?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"name": "名称",
	"code": "code",
	"orgId": "123456",
	"orgCode": "",
	"beganTime": "2023-04-17 16:30:00",
	"endTime": "2023-04-17 16:40:00"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用返回信息 示例：处理成功
data	object	是	采购品类数据
id	long	否	id 示例：123456
code	string	否	编码 示例：code
name	string	否	品类名称 示例：品类名称
parent	long	否	上级品类id 示例：1465624
parentCode	string	否	上级品类编码 示例：上级品类
orgCode	string	否	管理组织编码 示例：orgcode
order	int	否	排序号 示例：1
stopStatus	boolean	否	启用状态 true：停用 false：启用 示例：true
pubts	string	否	时间戳 示例：2024-06-17 00:00:00
categoryManager	string	否	品类经理id 示例：156324
categoryManagerCode	string	否	品类经理编码 示例：code01
categoryGrade	string	否	品类等级id 示例：1563488
categoryGradeCode	string	否	品类等级编码 示例：code02

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": [
		{
			"id": 123456,
			"code": "code",
			"name": "品类名称",
			"parent": 1465624,
			"parentCode": "上级品类",
			"orgCode": "orgcode",
			"order": 1,
			"stopStatus": true,
			"pubts": "2024-06-17 00:00:00",
			"categoryManager": "156324",
			"categoryManagerCode": "code01",
			"categoryGrade": "1563488",
			"categoryGradeCode": "code02"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-01	
新增
返回参数 (4)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


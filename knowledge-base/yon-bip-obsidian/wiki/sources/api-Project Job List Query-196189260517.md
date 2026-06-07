---
title: "项目职位列表查询"
apiId: "1961892605176840192"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Position Card"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Position Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目职位列表查询

>  请求方式	POST | Project Position Card (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/projectposts/bill/list
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
pageSize	int	否	是	页数 示例：10 默认值：10
code	string	否	否	编码 示例：00001
name	string	否	否	名称 示例：张三
pubts	string	否	否	时间戳 示例：2020-11-23 16:11:09
org_id	string	否	否	项目团队主键 示例：1961382981440372743

## 3. 请求示例

Url: /yonbip/hrcloud/projectposts/bill/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "00001",
	"name": "张三",
	"pubts": "2020-11-23 16:11:09",
	"org_id": "1961382981440372743"
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
data	object	否	返回数据
pageIndex	int	否	页码 示例：0
pageSize	int	否	页数 示例：10
recordCount	int	否	总数 示例：20
recordList	object	否	数据

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 20,
		"recordList": {
			"id": "322322323",
			"code": "123",
			"org_id": "3333",
			"org_id_name": "组织",
			"memo": "111",
			"enable": 1
		}
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
999	请联系开发人员	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-09	
新增
返回参数 user_define_character
核心 3、4、商开、海外支持

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


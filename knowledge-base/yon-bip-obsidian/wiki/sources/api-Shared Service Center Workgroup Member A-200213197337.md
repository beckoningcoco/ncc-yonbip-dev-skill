---
title: "共享中心工作组组员启停用"
apiId: "2002131973377097733"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Workgroup"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Workgroup]
platform_version: "BIP"
source_type: community-api-docs
---

# 共享中心工作组组员启停用

>  请求方式	POST | Workgroup (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/task/updateMemberStatus
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
shareCenterCode	string	否	是	共享中心节点中的编码 示例：2823
sharedServiceTypeCode	string	否	是	共享服务类型编码，枚举值："FI"- 财务共享，"HR"-人力共享 示例：FI
staffCode	string	否	是	工作组内显示的员工编码 示例：00000127
status	boolean	否	是	启用状态，true-启用，false-停用

## 3. 请求示例

Url: /yonbip/ssc/task/updateMemberStatus?access_token=访问令牌
Body: {
	"shareCenterCode": "2823",
	"sharedServiceTypeCode": "FI",
	"staffCode": "00000127",
	"status": true
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
code	string	否	成功为200，错误提示为其他值 示例：200
message	string	否	成功提示或错误提示 示例：操作成功
data	object	否	返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1023020400002	客户端参数不能为空:{0}	必传参数校验，根据提示补充缺失参数
1023010500050	共享中心不存在	所传共享中心编码不正确
1023020400131	无此组员信息	参数不正确导致查不到员工任职的组员信息
1023000500036	服务端逻辑异常	请联系共享管理员
1023010500162	同一启用组员只能存在一个共享中心的工作组中	员工所在工作组组员只能在一个共享中心启用，请检查其他任职工作组组员的启用状态。

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


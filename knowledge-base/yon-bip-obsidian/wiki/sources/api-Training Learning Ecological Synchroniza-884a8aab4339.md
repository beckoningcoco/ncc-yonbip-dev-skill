---
title: "培训学习生态同步域名"
apiId: "884a8aab433942ee8d9998687212ff72"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Training"
domain: "TLNT"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Training]
platform_version: "BIP"
source_type: community-api-docs
---

# 培训学习生态同步域名

>  请求方式	POST | Training (TLNT)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/hrcloud-train/syncDomain
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
tenantid	string	否	否	租户id 示例：cwginzia
tenantname	string	否	否	用友租户名称 示例：0630专业版daily1
pndomain	string	否	否	生态域名（平南云域名） 示例：xxxxxx
operator	int	否	否	操作符：1:新增编辑；2删除 示例：1
source	int	否	否	来源：默认传1 示例：1

## 3. 请求示例

Url: /yonbip/hrcloud/hrcloud-train/syncDomain?access_token=访问令牌
Body: {
	"tenantid": "cwginzia",
	"tenantname": "0630专业版daily1",
	"pndomain": "xxxxxx",
	"operator": 1,
	"source": 1
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
code	int	否	状态码 示例：成功：200/ 失败:999
message	string	否	返回信息 示例：租户名称不匹配：租户id:cwginzia,租户名称：0630专业版daily
displayCode	string	否	异常码 示例：124-504-780003

## 5. 正确返回示例

{
	"code": NaN,
	"message": "租户名称不匹配：租户id:cwginzia,租户名称：0630专业版daily",
	"displayCode": "124-504-780003"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	当前租户不存在！	
999	当前租户已配置映射关系，请勿再次配置：域名:xxxx	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-01	
新增
返回参数 displayCode
更新
错误码 999

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


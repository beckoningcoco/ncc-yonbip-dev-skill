---
title: "共享作业单据字段映射并派单"
apiId: "2204616419744153602"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SSC Task"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SSC Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 共享作业单据字段映射并派单

>  请求方式	POST | SSC Task (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/task/reMappingAndDispatch
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
billId	string	否	是	单据id 示例：1534409253080006662
billTypeId	string	否	是	单据类型id 示例：2333826110575360
mappingFields	string	是	否	映射字段列表，空值表示全部映射 示例：["name","subject"]

## 3. 请求示例

Url: /yonbip/ssc/task/reMappingAndDispatch?access_token=访问令牌
Body: {
	"billId": "1534409253080006662",
	"billTypeId": "2333826110575360",
	"mappingFields": [
		"name",
		"subject"
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
code	string	否	成功为200，错误提示为其他值 示例：200
message	string	否	成功提示或错误提示 示例：操作成功
data	string	否	返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1023000500036	服务端逻辑异常	请联系共享管理员
1023020400103	待分组作业分配出现异常：{0}	分配出现异常提示信息

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


---
title: "电子签hub解绑企业经办人"
apiId: "2275246942195810306"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子签hub解绑企业经办人

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/id/company/common/v1/unBindUser
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
companyId	string	否	否	电子签企业ID、uniqueId其一必须有值，如果两者都有值，则以companyId为准 示例：44532df36f8f430dfa3b8618ba10b3e1
uniqueId	string	否	否	业务系统方关联的唯一标识，如果companyId和uniqueId两者都有值的情况下，以companyId为准 示例：21312312
accountId	string	否	否	解除绑定经办人操作人用户id 示例：af7a9664199db5f6060304ae29c20a87
accountUniqueId	string	否	否	业务系统关联的唯一用户ID 示例：5675676
users	object	是	否	绑定的经办人用户列表
accountId	string	否	否	电子签用户账号ID，uniqueid两者不能同时为空，两者都有值的情况下，以accountId为准 示例：56db221228ec205f6f98f7cf18b50116
uniqueId	string	否	否	业务系统方关联的用户ID 示例：213123-21313
isDefault	string	否	否	是否为默认用户：0非默认用户，1默认用户 示例：0

## 3. 请求示例

Url: /yonbip/id/company/common/v1/unBindUser?access_token=访问令牌
Body: {
	"companyId": "44532df36f8f430dfa3b8618ba10b3e1",
	"uniqueId": "21312312",
	"accountId": "af7a9664199db5f6060304ae29c20a87",
	"accountUniqueId": "5675676",
	"users": [
		{
			"accountId": "56db221228ec205f6f98f7cf18b50116",
			"uniqueId": "213123-21313",
			"isDefault": "0"
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
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：success
data	object	否	响应数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-15	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


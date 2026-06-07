---
title: "电子签-企业实名认证-企业数字签名"
apiId: "1853659678417354756"
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

# 电子签-企业实名认证-企业数字签名

>  请求方式	POST | E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/rest/signature/company
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
oriData	string	否	是	待加签的数据，，base64编码后的数据 示例：MTIzNDU=
bizNo	string	否	是	业务单据Id，用于标示对哪个业务进行加签，与当前加签进行绑定（限长64） 示例：654321
sourceId	string	否	否	签署主体来源id 示例：1520271045373722627
sourceType	int	否	否	签署来源类型，来源类型 1组织 2客户档案 3供应商档案4友互通企业 示例：1
companyId	string	否	否	公司id，companyId和sourceId、sourceType这两个参数必有一组需要提供，同时传以companyId为准 示例：2s23123444
userId	string	否	是	当前操作人用户id 示例：fdf4a7c6-2e65-4bc1-8cbd-63348efd457b

## 3. 请求示例

Url: /yonbip/digitalModel/rest/signature/company?access_token=访问令牌
Body: {
	"oriData": "MTIzNDU=",
	"bizNo": "654321",
	"sourceId": "1520271045373722627",
	"sourceType": 1,
	"companyId": "2s23123444",
	"userId": "fdf4a7c6-2e65-4bc1-8cbd-63348efd457b"
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
code	int	否	返回编码 示例：0
msg	string	否	返回信息 示例：success
data	object	否	返回数据
signId	string	否	签名事件ID 示例：698715386db245e78c9cc771ecf5a0c2
signData	string	否	加签后的数据 示例：Njk4NzE1Mzg2ZGIyNDVlNzhjOWNjNzcxZWNmNWEwYzIpgXU+qYPqZblQmFyJ5dmzLpSqF6uT9ZkKX4HUESeIpDFsUZ7JrQ1AcumcsLGBP+o4oVOpjVP+IBmT7OdkfHBf+yWeoEfnwq5Iokx+VJrZd2NY9diiu2WnfFh6G7HV2d/krzbKh/KH/7Fqidb0CrkA8i89gt9He0CmxogpJw+76XV9TCY892gxuZCqzLeud4JTq0bk5O/LlJjjqPTq/Uv

## 5. 正确返回示例

{
	"code": 0,
	"msg": "success",
	"data": {
		"signId": "698715386db245e78c9cc771ecf5a0c2",
		"signData": "Njk4NzE1Mzg2ZGIyNDVlNzhjOWNjNzcxZWNmNWEwYzIpgXU+qYPqZblQmFyJ5dmzLpSqF6uT9ZkKX4HUESeIpDFsUZ7JrQ1AcumcsLGBP+o4oVOpjVP+IBmT7OdkfHBf+yWeoEfnwq5Iokx+VJrZd2NY9diiu2WnfFh6G7HV2d/krzbKh/KH/7Fqidb0CrkA8i89gt9He0CmxogpJw+76XV9TCY892gxuZCqzLeud4JTq0bk5O/LlJjjqPTq/Uv"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
10002	未获取到当前的企业信息	这个是统一的参数错误码，会返回多种提示语
-1	加签失败	加签失败
1000	租户下未设置运营商标识，或者当前运营商不支持加签操作，请联系相关人员处理	租户下未设置运营商标识，或者当前运营商不支持加签操作，请联系相关人员处理

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


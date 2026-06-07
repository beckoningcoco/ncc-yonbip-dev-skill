---
title: "合同信息用印申请回传"
apiId: "1873561792377520135"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Registration"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同信息用印申请回传

>  请求方式	POST | Contract Registration (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CLMS/v1.0/contract/stamp/callback
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
contractId	string	否	是	合同id 示例：1856645187491590000
stampStatus	string	否	是	用印状态 1-待用印 2-用印中 3-用印完成 4-用印不通过 示例：3 默认值：3

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contract/stamp/callback?access_token=访问令牌
Body: {
	"contractId": "1856645187491590000",
	"stampStatus": "3"
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
code	string	否	状态码 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
id	string	否	合同id 示例：1879045374692294657
stampStatus	string	否	用印状态 1-待用印 2-用印中 3-用印完成 4-用印不通过 示例：3

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1879045374692294657",
		"stampStatus": "3"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
500	服务异常	异常信息
999	接口调用错误	异常信息,请联系管理员
1001001000003	参数错误	异常信息,请检查数据

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


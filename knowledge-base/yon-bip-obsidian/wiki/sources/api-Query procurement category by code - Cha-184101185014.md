---
title: "根据code查询采购品类-特征"
apiId: "1841011850144645123"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Procurement Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procurement Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据code查询采购品类-特征

>  请求方式	GET | Procurement Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/purchaseclass/newdetailbycode
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
code	string	query	是	采购品类编码    示例: code

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseclass/newdetailbycode?access_token=访问令牌&code=code

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
data	object	否	调用成功时的返回数据
id	long	否	采购品类ID 示例：123456
code	string	否	品类编码 示例：code
name	string	否	品类名称 示例：品类名称
parent	long	否	上级品类id 示例：1234567
parentName	string	否	上级品类名称 示例：上级品类
template	long	否	物料模板id 示例：123456789
order	int	否	排序号 示例：1
level	int	否	层级 示例：1
stopStatus	boolean	否	启用状态 true：停用 false：启用 示例：true
orgName	string	否	管理组织名称 示例：管理组织
orgId	string	否	管理组织id 示例：12345456

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"id": 123456,
		"code": "code",
		"name": "品类名称",
		"parent": 1234567,
		"parentName": "上级品类",
		"template": 123456789,
		"order": 1,
		"level": 1,
		"stopStatus": true,
		"orgName": "管理组织",
		"orgId": "12345456"
	}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "开红票-部分(原发票部分红冲)(废弃)"
apiId: "df527e8644644abea482a4e9458e6cb4"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 开红票-部分(原发票部分红冲)(废弃)

>  请求方式	POST | Invoicing (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/part-red
请求方式	POST
ContentType	application/x-www-form-urlencoded
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
requestdatas	string	否	是	发票部分红冲参数； 示例：请求参数详情见开放平台接口信息补充描述-销项发票管理-发票部分红冲：https://fapiao.yonyoucloud.com/apidoc/appendix/
email	string	否	否	邮件推送配置(可选) 示例：[ { "fpqqlsh":"发票请求流水号和上方requestdatas保持一致 必填", "address": "邮箱地址 必填" } ]
sms	string	否	否	短信推送配置(可选) 示例：[{ "fpqqlsh":"发票请求流水号和上方requestdatas保持一致 必填", "address": "手机号 必填" }]
url	string	否	否	回调服务配置；返回结果详情见开放平台接口信息补充描述-销项发票管理-常规回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{ "fpqqlsh":"发票请求流水号和上方requestdatas保持一致 必填", "url": "回调地址 必填" }]
nc6x-ubl	string	否	否	ncc友企联回调参数；返回结果详情见开放平台接口信息补充描述-销项发票管理-NCC友企联回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{ "fpqqlsh":"发票请求流水号和上方requestdatas保持一致 必填", "method":"queryUserPermAppPksOrCodes 必填", "intf":"nccloud.pubitf.baseapp.apprbac.IAppAndOrgPermQueryPubService 必填" }]
autoAudit	string	否	否	是否自动审核(可选):true:自动审核，即不需要人工在发票平台确认开票，直接进行开票 false:不自动审核，即需要人工确认 如果不传，代表true 示例："自动审核，即不需要人工在发票平台确认开票，直接进行开票 false:不自动审核，即需要人工确认如果不传，代表true"
delurl	string	否	否	退回业务系统回调服务配置；返回结果详情见开放平台接口信息补充描述-销项发票管理-常规回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{"fpqqlsh":"发票请求流水号","url":"www.baidu.com"}]

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/part-red?access_token=访问令牌

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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
message	string	否	信息 示例：success
data	string	否	响应信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "success"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1001	价税合计必须小于0	请确认价税合计金额

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
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


---
title: "采购台账新增进项转出"
apiId: "1758663471518973961"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Value-added Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Value-added Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购台账新增进项转出

>  请求方式	POST | Value-added Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/input-tax/api/purchase-collection/rollout
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
fpHm	string	否	是	发票号码 示例：08946106
fpDm	string	否	否	发票代码（有则必填） 示例：5100172130
outDate	string	否	是	转出日期 yyyy-MM-dd 示例：2022-11-22
operator	string	否	是	转出人 示例：sss
outMoney	BigDecimal	否	是	转出税额（两位小数） 示例：0.01
reason	string	否	是	转出原因 1-免税项目用；2-集体福利、个人消费；3-非正常损失；4-简易计税方法征税项目用；5-红字专用发票信息表注明的进项税额；6-其他应作进项税额转出的情形(其他进项转出明细：601-贷款服务及直接相关费用；602-非应税交易项目；603-用于简易计税、免税项目和非应税交易无法划分年度清算调整；604-长期资产进项税额转出额；605-其他进项税额转出)；7-免抵退税办法不得抵扣的进项税额；8-纳税检查调减进项税额；9-上期留抵税额抵减欠税；10-上期留抵税额退税；11-异常凭证转出进项税额 示例：1
vnote	string	否	否	备注 示例：lll
voucherId	string	否	否	凭证号 示例：12312
voucherAccId	string	否	否	凭证号ID 示例：1
srcBillcode	string	否	否	来源单据号 示例：1

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/purchase-collection/rollout?access_token=访问令牌
Body: [{
	"fpHm": "08946106",
	"fpDm": "5100172130",
	"outDate": "2022-11-22",
	"operator": "sss",
	"outMoney": 0.01,
	"reason": "1",
	"vnote": "lll",
	"voucherId": "12312",
	"voucherAccId": "1",
	"srcBillcode": "1"
}]

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
data	string	否	响应信息
message	string	否	消息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
9999	未知错误	根据返回信息处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-10	
更新
请求说明
更新
请求参数 reason

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "代扣代缴计算表新增"
apiId: "1841835504609263628"
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

# 代扣代缴计算表新增

>  请求方式	POST | Value-added Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/input-tax/api/invoice-withhold/add
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
orgCode	string	否	是	组织编码 示例：rzs2
withholdDate	string	否	是	税款所属期，yyyy-MM-dd 示例：2023-10-16
taxOfficeName	string	否	是	征收机关名称 示例：国家税务总局合肥市瑶海区第一税务分局办税厅
taxItemCode	string	否	否	代扣代缴项目 示例：101017101_WHT
voucherNum	string	否	是	代扣代缴凭证编号 示例：20231016
price	BigDecimal	否	是	税额 示例：13789.28
projectCode	string	否	否	项目编码 示例：123
lyid	string	否	否	来源单据号 示例：tax123
note	string	否	否	备注 示例：备注
operator	string	否	否	操作人 示例：七七
voucherId	string	否	否	凭证主键 示例：111
withholdNsrsbh	string	否	是	扣缴人纳税人识别号 不能超过50个字符 示例：1234abcd
withholdNsrmc	string	否	是	扣缴人名称 不能超过200个字符 示例：wwww
billingDate	string	否	否	填发日期，yyyy-MM-dd 示例：2025-02-02
srcId	string	否	否	来源id 不能超过50个字符 示例：12345

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/invoice-withhold/add?access_token=访问令牌
Body: [{
	"orgCode": "rzs2",
	"withholdDate": "2023-10-16",
	"taxOfficeName": "国家税务总局合肥市瑶海区第一税务分局办税厅",
	"taxItemCode": "101017101_WHT",
	"voucherNum": "20231016",
	"price": 13789.28,
	"projectCode": "123",
	"lyid": "tax123",
	"note": "备注",
	"operator": "七七",
	"voucherId": "111",
	"withholdNsrsbh": "1234abcd",
	"withholdNsrmc": "wwww",
	"billingDate": "2025-02-02",
	"srcId": "12345"
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
code	string	否	编码 示例：0000
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	消息 示例：操作成功

## 5. 正确返回示例

{
	"code": "0000",
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
9999	操作失败	按返回信息处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-18	
更新
请求说明
新增
请求参数 taxItemCode
更新
请求参数 defineTerm
删除
请求参数 prjCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


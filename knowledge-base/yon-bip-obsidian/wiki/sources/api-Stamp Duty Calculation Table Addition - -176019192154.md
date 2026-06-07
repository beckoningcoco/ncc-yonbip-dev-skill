---
title: "印花税计算表新增-税源来自合同"
apiId: "1760191921540038657"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Stamp Tax Calculation Table"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stamp Tax Calculation Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 印花税计算表新增-税源来自合同

>  请求方式	POST | Stamp Tax Calculation Table (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/tax/yonbip-fi-taxoth/api/stamptaxaccount/edit
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
lyid	string	否	是	记录唯一标识 示例：10000000002
orgCode	string	否	是	组织编码 示例：0223zxh
deptCode	string	否	否	部门编码 示例：BMCODE
contractCode	string	否	是	合同编码 示例：jiekou0001
contractName	string	否	否	应税凭证名称(默认等于税目-子目，如果子目为空则等于税目) 示例：接口测试0001
contractSignDate	string	否	否	合同签订日期，日期格式：yyyy-MM-dd 示例：2023-01-01
busiAmount	BigDecimal	否	是	发生金额 示例：42.1
busiDate	string	否	是	应税凭证书立日期，日期格式：yyyy-MM-dd 示例：2020-07-21
relativeName	string	否	否	合同相对方名称 示例：接口测试合同相对方名称
relativeNsrsbh	string	否	否	合同相对方税号 示例：110101123456789
stampSubItem	string	否	是	税目子目 示例：银行业金融机构借款合同
periodType	string	否	否	填报周期1:按季、4: 按次 示例：1
bframe	string	否	否	是否框架合同（N：否；Y：是） 示例：Y
contractCount	number
小数位数:0,最大长度:10	否	否	应税凭证数量(默认1) 示例：1
taxableVoucherCode	string	否	否	应税凭证编号 示例：YSPZBH
oriCurrencyCode	string	否	否	业务币种 示例：CNY
exchangeRateBusDate	date
格式:yyyy-MM-dd	否	否	汇率日期 示例：2025-11-26
exchangeRate	number
小数位数:8,最大长度:32	否	否	汇率 示例：0.654

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/stamptaxaccount/edit?access_token=访问令牌
Body: [{
	"lyid": "10000000002",
	"orgCode": "0223zxh",
	"deptCode": "BMCODE",
	"contractCode": "jiekou0001",
	"contractName": "接口测试0001",
	"contractSignDate": "2023-01-01",
	"busiAmount": 42.1,
	"busiDate": "2020-07-21",
	"relativeName": "接口测试合同相对方名称",
	"relativeNsrsbh": "110101123456789",
	"stampSubItem": "银行业金融机构借款合同",
	"periodType": "1",
	"bframe": "Y",
	"contractCount": 1,
	"taxableVoucherCode": "YSPZBH",
	"oriCurrencyCode": "CNY",
	"exchangeRateBusDate": "2025-11-26",
	"exchangeRate": 0.654
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
code	string	否	操作码 示例：0000
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	操作描述 示例：操作成功

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
9999	系统异常	根据具体返回信息调整数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-26	
更新
请求说明
新增
请求参数 exchangeRateBusDate

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


---
title: "分销商(团长)查询"
apiId: "752242ebf1bb4c4f958d084f11c33128"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Community Leader"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Community Leader]
platform_version: "BIP"
source_type: community-api-docs
---

# 分销商(团长)查询

>  请求方式	POST | Community Leader (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/distribution/query
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
iType	long	否	是	分销类型（1： 分销商 2 ：团长） 示例：1
distributorId	long	否	否	分销商/团长ID（与手机号参数两者必传一个） 示例：122222
oid	string	否	否	粉丝ID 示例：zbag111111
cPhoneNum	string	否	否	手机号(与分销商/团长ID参数两者必传其中一个) 示例：13211223344

## 3. 请求示例

Url: /yonbip/sd/distribution/query?access_token=访问令牌
Body: {
	"iType": 1,
	"distributorId": 122222,
	"oid": "zbag111111",
	"cPhoneNum": "13211223344"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
data	object	否	数据对象
cAmount	Decimal	否	可提佣金
cCountryCode	string	否	区号
cDistributorLevelName	string	否	等级名称
cDistributorName	string	否	分销商名称 示例：R
cHeadPicUrl	string	否	头像
cPhoneNum	string	否	手机号 示例：13009100001
cRegisterTime	string	否	注册时间 示例：2021-09-10
cShopName	string	否	小店名称 示例：R的小店
defineDtoList	string	否	自定义项
estimatedAmount	long	否	暂估佣金 示例：0
fansDtoList	string	否	粉丝数据
iAuditStatus	int	否	审核状态 （0：未审 1 ：已审） 示例：1
iDistributorLevel	string	否	级别
iStatus	long	否	状态（0：禁用 1：启用） 示例：0
iSubordinateNumber	string	否	下级人数
id	string	否	分销商/团长ID 示例：2425549823416576
qrCodeUrl	string	否	分享二维码
totalAmount	long	否	累计佣金 示例：0
totalCashAmount	long	否	累计提现 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"cAmount": 0,
		"cCountryCode": "",
		"cDistributorLevelName": "",
		"cDistributorName": "R",
		"cHeadPicUrl": "",
		"cPhoneNum": "13009100001",
		"cRegisterTime": "2021-09-10",
		"cShopName": "R的小店",
		"defineDtoList": "",
		"estimatedAmount": 0,
		"fansDtoList": "",
		"iAuditStatus": 1,
		"iDistributorLevel": "",
		"iStatus": 0,
		"iSubordinateNumber": "",
		"id": "2425549823416576",
		"qrCodeUrl": "",
		"totalAmount": 0,
		"totalCashAmount": 0
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	未查到信息！	请求参数填写有误

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


---
title: "分销商(团长)注册"
apiId: "30ffdbcbd8d6452188918affc317f940"
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

# 分销商(团长)注册

>  请求方式	POST | Community Leader (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/distribution/register
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
type	int	否	是	type(1:分销商 2：团长) 示例：1
bSmsVerify	boolean	否	是	是否需要验证码（true：是 false：否） 示例：false
verifyCode	string	否	否	验证码(bSmsVerify为true时必填，为false时不填) 示例：232121
oid	string	否	是	粉丝ID 示例：as112233333
cPhoneNum	string	否	是	手机号 示例：15611223344
iLNG	string	否	否	经度（type=2时必填） 示例：11.222
iLAT	string	否	否	纬度（type=2时必填） 示例：23433
cRegion	string	否	否	区域(type=2时必填) 示例：11000022
regionCode	string	否	否	地区编码(type=2时必填)
source	string	否	否	来源（1 微信 2 小程序）
wxAcountId	string	否	否	微信ID 示例：wx0001
cDistributorName	string	否	否	分销商/团长名称 示例：张三
cHeadPicUrl	string	否	否	头像
cShopName	string	否	否	小店名称 示例：我的小店
cCountryCode	string	否	否	区号 示例：+86

## 3. 请求示例

Url: /yonbip/sd/distribution/register?access_token=访问令牌
Body: {
	"type": 1,
	"bSmsVerify": false,
	"verifyCode": "232121",
	"oid": "as112233333",
	"cPhoneNum": "15611223344",
	"iLNG": "11.222",
	"iLAT": "23433",
	"cRegion": "11000022",
	"regionCode": "",
	"source": "",
	"wxAcountId": "wx0001",
	"cDistributorName": "张三",
	"cHeadPicUrl": "",
	"cShopName": "我的小店",
	"cCountryCode": "+86"
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
message	string	否	返回信息 示例：注册成功
data	string	否	返回数据(值为null时，表示不返回具体数据)

## 5. 正确返回示例

{
	"code": "200",
	"message": "注册成功",
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	验证码错误！	verifyCode值填写有误

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


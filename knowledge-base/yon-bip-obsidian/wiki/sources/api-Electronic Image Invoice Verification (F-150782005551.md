---
title: "电子影像发票查验（原厂开发专用）"
apiId: "1507820055513530377"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "File Services"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, File Services]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子影像发票查验（原厂开发专用）

>  请求方式	POST | File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/img/invoice/verify/verify
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
uuid	string	否	是	请求编号，用于后台日志标记请求，要求全局唯一，长度不能超过32位 示例：13122225891
barcode	string	否	否	单据条码 示例：261X1001ZZ1000000000C0AO
opTime	string	否	是	操作时间 示例：2022-07-22 14:50:45
factorycode	string	否	是	厂商编码 示例：shy
billid	string	否	是	单据主键 示例：142235343464
verifier	string	否	否	查验人姓名 示例：张三
data	object	是	是	发票查验结果信息
fpDm	string	否	否	发票代码（对于全电发票可以不传发票代码，其他发票需要传入发票代码参数） 示例：1100154320
fpHm	string	否	是	发票号码 示例：25045336
kprq	string	否	是	开票日期 示例：20161010
jym	string	否	否	校验码 示例：10221376566424011310
hjje	string	否	否	合计金额 示例：100
jshj	string	否	否	价税合计 示例：106
billid	string	否	否	单据主键 示例：142235343464

## 3. 请求示例

Url: /yonbip/ssc/img/invoice/verify/verify?access_token=访问令牌
Body: {
	"uuid": "13122225891",
	"barcode": "261X1001ZZ1000000000C0AO",
	"opTime": "2022-07-22 14:50:45",
	"factorycode": "shy",
	"billid": "142235343464",
	"verifier": "张三",
	"data": [
		{
			"fpDm": "1100154320",
			"fpHm": "25045336",
			"kprq": "20161010",
			"jym": "10221376566424011310",
			"hjje": "100",
			"jshj": "106",
			"billid": "142235343464"
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
code	string	否	返回编码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	是	查验结果信息
code	string	否	查验结果编码 示例：3001
msg	string	否	查验结果消息 示例：发票已经存在,发票代码:330xxxx,发票号码:100xxx的状态为报销中!
saveToken	string	否	发票查验token 示例：3243242352
fpDm	string	否	发票代码 示例：330xxxx
fpHm	string	否	发票号码 示例：100xxx
invoice	object	否	查验发票详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "3001",
			"msg": "发票已经存在,发票代码:330xxxx,发票号码:100xxx的状态为报销中!",
			"saveToken": "3243242352",
			"fpDm": "330xxxx",
			"fpHm": "100xxx",
			"invoice": {}
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1023070105411	服务端逻辑异常	请联系系统管理员
1023070105441	厂商编码错误	
1023070105442	厂商编码不可为空	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-16	
新增
请求参数 verifier
更新
请求参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


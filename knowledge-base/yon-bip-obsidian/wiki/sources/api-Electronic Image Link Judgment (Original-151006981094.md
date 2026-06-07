---
title: "电子影像环节判断（原厂开发专用）"
apiId: "1510069810941132801"
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

# 电子影像环节判断（原厂开发专用）

>  请求方式	POST | File Services (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/img/business/ispostnode
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
barcode	string	否	是	单据条码 示例：261X1001ZZ1000000000C0AO
factorycode	string	否	是	厂商编码 示例：shy
billid	string	否	是	单据主键 示例：15500403202
opTime	string	否	是	操作时间 示例：2022-07-28 15:06:30
data	object	否	是	数据容器
scanmode	int	否	是	扫描方式（1：专岗必扫，2：专岗非必扫）） 示例：1
opuserid	string	否	是	操作用户主键 示例：1001ZZ1000000000C0AO
opusername	string	否	是	操作用户姓名 示例：陈顺风

## 3. 请求示例

Url: /yonbip/ssc/img/business/ispostnode?access_token=访问令牌
Body: {
	"uuid": "13122225891",
	"barcode": "261X1001ZZ1000000000C0AO",
	"factorycode": "shy",
	"billid": "15500403202",
	"opTime": "2022-07-28 15:06:30",
	"data": {
		"scanmode": 1,
		"opuserid": "1001ZZ1000000000C0AO",
		"opusername": "陈顺风"
	}
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
data	object	否	返回结果信息容器
billid	string	否	单据主键 示例：1001ZZ10000000001UD4
barcode	string	否	单据条码 示例：261X1001ZZ1000000000C0AO
isimagepost	string	否	是否到达影像专岗（true：到达专岗，false：未到达专岗。） 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"billid": "1001ZZ10000000001UD4",
		"barcode": "261X1001ZZ1000000000C0AO",
		"isimagepost": "true"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1023070105411	服务端逻辑异常	请联系系统管理员
1023070105435	影像任务不存在	
1023070105441	厂商编码错误	
1023070105442	厂商编码不可为空	
1023070105446	该单据流程不在影像专岗	
1023070105447	该用户没有该单据下业务单元的扫描权限	
1023070105448	该用户没有该单据的扫描权限，具体扫描人为：...	

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


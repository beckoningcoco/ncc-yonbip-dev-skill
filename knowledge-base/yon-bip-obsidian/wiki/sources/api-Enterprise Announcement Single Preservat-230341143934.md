---
title: "publishName	string	否	发布者"
apiId: "2303411439344287744"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Publish Announcement"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Publish Announcement]
platform_version: "BIP"
source_type: community-api-docs
---

# publishName	string	否	发布者

>  请求方式	POST | Publish Announcement (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PCC/announcement/api/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
resubmitCheckKey	string	否	是	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	是	企业公告编码。以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：QY202506170001
title	string	否	是	企业公告标题名称
id	string	否	否	企业公告主表id，新增时无需填写，修改必填，示例： 1998548312812158981 示例：1998548312812158981
publishOrgCode	string	否	否	主组织编码 示例：GYS001
publishOrgId	string	否	是	主组织主键 示例：3334441234567224567
publishName	string	否	是	发布人：录入人员名称，示例：郑采 示例：郑采
enterNoticeTypeCode	string	否	否	公告类型为企业公告时，公告分类选填。公告分类在采购业务档案-公告分类定义，录入公告分类code 示例：001
noticeTypeCode	string	否	是	公告类型：supoptmanual：供应商操作手册、entnotice：企业公告、noticeinfo：公告信息、purnoticeinfo：供应商公告消息 示例：entnotice 示例：entnotice
announcementObject	string	否	否	公告对象：0：全部、1：供应商、2：企业内部，默认：0：全部，示例：0 示例：0
autoRevoke	string	否	否	是否自动撤销：1：是、0：否 示例：1 默认值：1
revocationTime	date
格式:yyyy-MM-dd	否	否	是否自动撤销为是时，撤销日期必填， 默认值：2025-06-20
loginEnabled	string	否	否	是否登陆查看公告：1：是、0：否，为1：是时，表示企业采购门户上的公告只有在登录的情况下才能查看公告详情 示例：0 默认值：0
announcementLabel	string	否	否	标签：录入，示例：内部通知公告 默认值：内部通知公告
content	string	否	否	公告内容：录入，示例：关于公司采购制度更新的通知
appendix	string	否	否	附件：主键或者ID，转换为附件文档显示。
displayInsCodes	string	是	是	公告展示位置：private：企业采购门户、purchase：采购商工作台、supply：供应商工作台。当公告对象为企业内部时，公告展示位置只能是采购商工作台，示例：purchase 示例：["purchase"]
visibilityScopeSupplyCods	string	是	否	公告对象为供应商时，可见范围选填。可见范围为供应商code 示例：["123123123","1231231"]

## 3. 请求示例

Url: /yonbip/PCC/announcement/api/save?access_token=访问令牌
Body: {
	"resubmitCheckKey": "",
	"code": "QY202506170001",
	"title": "",
	"id": "1998548312812158981",
	"publishOrgCode": "GYS001",
	"publishOrgId": "3334441234567224567",
	"publishName": "郑采",
	"enterNoticeTypeCode": "001",
	"noticeTypeCode": "entnotice",
	"announcementObject": "0",
	"autoRevoke": "1",
	"revocationTime": "2026-06-07",
	"loginEnabled": "0",
	"announcementLabel": "",
	"content": "",
	"appendix": "",
	"displayInsCodes": [
		"purchase"
	],
	"visibilityScopeSupplyCods": [
		"123123123",
		"1231231"
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
data	object	否	保存结果返回
title	string	否	标题
code	string	否	编码
noticeType	object	否	公告类型
noticeTypeName	string	否	公告类型名称
noticeTypeCode	string	否	公告类型编码
publishOrg	string	否	发布组织
publishTime	string	否	发布时间
enterNoticeType	object	否	公告分类
announcementObject	string	否	公告对象：0：全部、1：供应商、2：企业内部，默认：0：全部，示例：0
appendix	string	否	附件id
autoRevoke	string	否	是否自动撤销0否,1是
content	string	否	内容
isTop	string	否	是否置顶0否,1是
revocationTime	string	否	撤销日期
loginEnabled	string	否	允许未登录查看公告0否,1是
isSystemNotice	string	否	是否系统公告
unstickTime	string	否	取消置顶时间
priority	string	否	优先级
stickType	string	否	置顶类型
status	string	否	状态
pubts	string	否	时间戳
viewCount	string	否	阅读数量
publishCode	string	否	发布人编码
orgs	string	否	采购组织
tenant	string	否	发布的租户
isWfControlled	string	否	是否审批流控制
verifystate	string	否	审批状态
disPlayLocationList	object	是	展示位置数组
visibilityScopeList	object	是	可见范围数组
code	string	否	返回结果 示例：200
status	string	否	返回数据状态 示例：1

## 5. 正确返回示例

{
	"data": {
		"title": "",
		"code": "",
		"noticeType": {},
		"noticeTypeName": "",
		"noticeTypeCode": "",
		"publishOrg": "",
		"publishName": "",
		"publishTime": "",
		"enterNoticeType": {},
		"announcementObject": "",
		"appendix": "",
		"autoRevoke": "",
		"content": "",
		"isTop": "",
		"revocationTime": "",
		"loginEnabled": "",
		"isSystemNotice": "",
		"unstickTime": "",
		"priority": "",
		"stickType": "",
		"status": "",
		"pubts": "",
		"viewCount": "",
		"publishCode": "",
		"orgs": "",
		"tenant": "",
		"isWfControlled": "",
		"verifystate": "",
		"disPlayLocationList": [
			{
				"announcement": "",
				"announcementDisplayLocation": "",
				"announcementDisplayLocation_name": "",
				"displayInsCode": "",
				"displayInsName": "",
				"id": ""
			}
		],
		"visibilityScopeList": [
			{
				"announcement": "",
				"id": "",
				"supply": "",
				"supply_name": ""
			}
		]
	},
	"code": "200",
	"status": "1"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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


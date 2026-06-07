---
title: "publishName	string	否	发布者"
apiId: "2304943239411007490"
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
请求地址	/yonbip/PCC/announcement/api/detail
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
id	string	否	是	企业公告id 默认值：1998432606391107591

## 3. 请求示例

Url: /yonbip/PCC/announcement/api/detail?access_token=访问令牌
Body: {
	"id": ""
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
data	object	否	查询数据
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


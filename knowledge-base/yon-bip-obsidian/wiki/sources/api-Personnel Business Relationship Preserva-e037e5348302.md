---
title: "人员业务关系保存"
apiId: "e037e5348302422bbc87298bbf5b3f52"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personnel Business Relationship"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personnel Business Relationship]
platform_version: "BIP"
source_type: community-api-docs
---

# 人员业务关系保存

>  请求方式	POST | Personnel Business Relationship (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/personset/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	人员业务关系新增数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
person_code	string	否	是	人员编码 示例：00000068
billAreaList	object	是	否	子表集合属性
_status	string	否	是	操作标识，Insert：新增 示例：Insert

## 3. 请求示例

Url: /yonbip/crm/personset/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"person_code": "00000068",
		"billAreaList": [
			{
				"isdefault": true,
				"areaResponsible": true,
				"saleArea_code": "098"
			}
		],
		"_status": "Insert"
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	long	否	返回编码，200为保存成功，999为保存失败 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	人员业务关系相应保存信息
person_code	string	否	人员编码 示例：00000068
billAreaList	object	是	子表集合属性
id	long	否	人员id 示例：2475414441201920
creator	string	否	创建人 示例：李亚苹
creatorId	long	否	创建人id 示例：2293809202172160
createTime	string	否	创建时间 示例：2021-10-15 16:41:47
createDate	string	否	创建日期 示例：2021-10-15 16:41:47
pubts	string	否	时间戳 示例：2021-10-15 16:41:47
tenant	long	否	租户id 示例：2292495487783168
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"person_code": "00000068",
		"billAreaList": [
			{
				"isdefault": true,
				"areaResponsible": true,
				"saleArea_code": "098",
				"id": 2475414441201921,
				"pubts": "2021-10-15 16:41:47",
				"tenant": 2292495487783168
			}
		],
		"id": 2475414441201920,
		"creator": "李亚苹",
		"creatorId": 2293809202172160,
		"createTime": "2021-10-15 16:41:47",
		"createDate": "2021-10-15 16:41:47",
		"pubts": "2021-10-15 16:41:47",
		"tenant": 2292495487783168,
		"resubmitCheckKey": "crmc_personsetcard_add_f6315566-b3d8-464b-82b6-eeb6d1f6e77f"
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
999	人员业务关系名称已经存在	

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


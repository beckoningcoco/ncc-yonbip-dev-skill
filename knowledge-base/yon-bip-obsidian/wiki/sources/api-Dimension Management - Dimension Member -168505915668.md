---
title: "维度管理丨维度成员丨维度成员和属性查询丨无锡国联"
apiId: "1685059156689027079"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Dimension Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Dimension Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 维度管理丨维度成员丨维度成员和属性查询丨无锡国联

>  请求方式	POST | Dimension Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/dim/dimapi/queryAllMembers
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
busiParamJson	string	否	是	busiParamJson 示例：{path:queryAllMembers,pkDimDef:TB_DIMDEF_MEASURE_00,pkDimHier:1528520998914621442,systemCode:BP}
sysParamJson	object	否	是	sysParamJson
appcode	string	否	是	节点编码 示例：EPMP0505 默认值：EPMP0505
syscode	string	否	否	系统编码 示例：BP

## 3. 请求示例

Url: /yonbip/qyjx/dim/dimapi/queryAllMembers?access_token=访问令牌
Body: {
	"busiParamJson": "{path:queryAllMembers,pkDimDef:TB_DIMDEF_MEASURE_00,pkDimHier:1528520998914621442,systemCode:BP}",
	"sysParamJson": {
		"appcode": "EPMP0505",
		"syscode": "BP"
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
memberList	object	否	返回结果集
pid	string	否	父id
id	string	否	id
code	string	否	编码
name	string	否	名称
name2	string	否	英文名称
name3	string	否	繁体名称

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"memberList": {
			"pid": "",
			"id": "",
			"code": "",
			"name": "",
			"name2": "",
			"name3": ""
		}
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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


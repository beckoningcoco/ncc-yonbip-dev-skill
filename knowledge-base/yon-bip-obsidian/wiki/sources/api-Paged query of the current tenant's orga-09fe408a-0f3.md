---
title: "分页查询当前租户组织架构"
apiId: "09fe408a-0f32-4339-b4fc-82198015abb4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contacts"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contacts]
platform_version: "BIP"
source_type: community-api-docs
---

# 分页查询当前租户组织架构

>  请求方式	POST | Contacts (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/org/page_list
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
index	int	否	是	起始页从1开始
size	int	否	是	一页大小
conditions	object	否	否	查询条件List，每一个条件使用field+value+operator组成，默认的操作符operator是=
orders	object	否	否	排序条件List,field是排序字段，asc=true或false

## 3. 请求示例

Url: /yonbip/uspace/org/page_list?access_token=访问令牌
Body: {
	"index": 0,
	"size": 0,
	"conditions": {},
	"orders": {}
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
id	string	否	主键 UUID
total	int	否	总数量
code	string	否	编码, UUID
totalPages	int	否	总页数
name	string	否	名称
pageSize	int	否	页数大小
sort	object	是	排序
parentid	string	否	上级节点,""表示上级节点为空
currentPage	string	否	当前页
modifiedtime	string	否	修改时间,2018-07-21 10:31:11
enable	int	否	启用状态,0,1,2分别表示未启用、已启用、已停用
shortname	string	否	简称
principal	string	否	负责人,员工主键
contact	string	否	联系人
telephone	string	否	联系电话
address	string	否	联系地址,北京市海淀区...
branchleader	string	否	分管领导,员工主键
orgtype	int	否	组织类型,1 组织 2部门
isdefault	int	否	是否默认组织,0 非默认部门 1 默认部门
hassub	boolean	否	用于显示：是否有下级, true

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"total": 0,
		"code": "",
		"totalPages": 0,
		"name": "",
		"pageSize": 0,
		"sort": [
			{}
		],
		"parentid": "",
		"currentPage": "",
		"modifiedtime": "",
		"enable": 0,
		"shortname": "",
		"principal": "",
		"contact": "",
		"telephone": "",
		"address": "",
		"branchleader": "",
		"orgtype": 0,
		"isdefault": 0,
		"hassub": true
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


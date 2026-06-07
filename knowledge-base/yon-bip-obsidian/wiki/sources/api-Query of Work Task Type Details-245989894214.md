---
title: "工作任务类型详情查询"
apiId: "2459898942141759490"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Task Management"
domain: "PLMPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作任务类型详情查询

>  请求方式	GET | Task Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/tempTaskCgr/v1/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	id

## 3. 请求示例

Url: /yonbip/RDC/openapi/tempTaskCgr/v1/detail?access_token=访问令牌&id=

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
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
		否	
		否	
creator	string	否	创建人ID 示例：d324f53b-b775-4626-9f24-a6b094c2e2aa
code	string	否	编码 示例：00000001
ownedorg	string	否	所属组织ID 示例：2220177129213001738
level	number
小数位数:0,最大长度:10	否	层级 示例：1
lctId_name	string	否	生命周期模板 示例：工作任务-默认模板使用
creator_userName	string	否	创建人 示例：曾祥吉
sort	number
小数位数:0,最大长度:10	否	排序 示例：4
isEnd	boolean	否	是否末级 示例：false
path	string	否	路径 示例：2459890781700751368|
tempTaskCgrDefLinkList	object	是	自定义项
definecode	string	否	自定义项编码 示例：userDefine__a11111
creator	string	否	创建人ID 示例：d324f53b-b775-4626-9f24-a6b094c2e2aa
code	string	否	编码 示例：userDefine__a11111
name	string	否	名称 示例：ly
creator_userName	string	否	创建人 示例：曾祥吉
cgrId	string	否	工作任务类型ID 示例：2459890781700751368
creationtime	string	否	创建时间 示例：2026-01-28 10:56:18
id	string	否	id 示例：2459890781700751370
pubts	string	否	时间戳 示例：2026-01-28 10:56:18
cgrId_name	string	否	工作任务类型 示例：00000001
name	string	否	名称 示例：00000001
lctId	string	否	生命周期模板ID 示例：2220176098415607825
creationtime	string	否	创建时间 示例：2026-01-28 10:56:17
id	string	否	id 示例：2459890781700751368
pubts	string	否	时间戳 示例：2026-01-28 10:52:16
ownedorg_name	string	否	所属组织 示例：智石开
status	string	否	启用状态 示例：1
desc	string	否	描述 示例：API测试
tempTaskCgrRolesList	object	是	角色
roleId_orgId_name	string	否	角色组织 示例：企业账号级
roleId_code	string	否	角色编码 示例：plmywall
roleId	string	否	角色ID 示例：ae25650e-4d01-4382-b84e-b1cb41924566
roleId_name	string	否	角色名称 示例：plm业务全
cgrId	string	否	工作任务类型ID 示例：2459890781700751368
id	string	否	id 示例：2459890781700751369
pubts	string	否	时间戳 示例：2026-01-28 10:56:18
cgrId_name	string	否	工作任务类型 示例：00000001
parent_name	string	否	父级 示例：root
parent	string	否	父级ID

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"creator": "d324f53b-b775-4626-9f24-a6b094c2e2aa",
		"code": "00000001",
		"ownedorg": "2220177129213001738",
		"level": 1,
		"lctId_name": "工作任务-默认模板使用",
		"creator_userName": "曾祥吉",
		"sort": 4,
		"isEnd": false,
		"path": "2459890781700751368|",
		"tempTaskCgrDefLinkList": [
			{
				"definecode": "userDefine__a11111",
				"creator": "d324f53b-b775-4626-9f24-a6b094c2e2aa",
				"code": "userDefine__a11111",
				"name": "ly",
				"creator_userName": "曾祥吉",
				"cgrId": "2459890781700751368",
				"creationtime": "2026-01-28 10:56:18",
				"id": "2459890781700751370",
				"pubts": "2026-01-28 10:56:18",
				"cgrId_name": "00000001"
			}
		],
		"name": "00000001",
		"lctId": "2220176098415607825",
		"creationtime": "2026-01-28 10:56:17",
		"id": "2459890781700751368",
		"pubts": "2026-01-28 10:52:16",
		"ownedorg_name": "智石开",
		"status": "1",
		"desc": "API测试",
		"tempTaskCgrRolesList": [
			{
				"roleId_orgId_name": "企业账号级",
				"roleId_code": "plmywall",
				"roleId": "ae25650e-4d01-4382-b84e-b1cb41924566",
				"roleId_name": "plm业务全",
				"cgrId": "2459890781700751368",
				"id": "2459890781700751369",
				"pubts": "2026-01-28 10:56:18",
				"cgrId_name": "00000001"
			}
		],
		"parent_name": "root",
		"parent": ""
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
0	未传入优惠券档案id	coupon_id值填写有误
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


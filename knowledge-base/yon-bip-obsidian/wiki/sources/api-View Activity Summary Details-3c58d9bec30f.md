---
title: "查看活动小结详情"
apiId: "3c58d9bec30f4a08b4b90250fa956c3f"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Activity Summary"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Activity Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看活动小结详情

>  请求方式	GET | Activity Summary (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/summary/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	活动小结主键（单据id和单据编码二选一必填，单据id和编码同时存在以id为准。）
code	string	query	否	活动小结单据编码（单据id和单据编码二选一必填）

## 3. 请求示例

Url: /yonbip/crm/summary/getbyid?access_token=访问令牌&id=&code=

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
code	long	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
reviewReuslt	long	否	审核结果(0:不合格，1:合格，2:待审） 示例：2
dept_code	string	否	部门编码 示例：001
verifystate	long	否	审批状态（0:开立，1:审批中，2:审批通过，3:审批不通过，4:驳回） 示例：0
code	string	否	编码（编码查询用此） 示例：20210916001970
activity	long	否	营销活动ID 示例：2429716062851328
masterOrgKeyField	string	否	主组织字段 示例：org
activity_bustype	string	否	活动交易类型 示例：2292497086304513
bustype_name	string	否	交易类型 示例：小结
activity_customer	long	否	活动客户 示例：2352133551182336
picture1	string	否	照片1 示例：240d7150-16c2-11ec-bcc2-ebe76ed634e9
picture4	string	否	照片4 示例：23faaca0-16c2-11ec-bcc2-ebe76ed634e9
picture3	string	否	照片3 示例：2401ffa0-16c2-11ec-bcc2-ebe76ed634e9
picture2	string	否	照片2 示例：2407cc00-16c2-11ec-bcc2-ebe76ed634e9
ower_name	string	否	负责人 示例：陈川华
marketingPlan_code	string	否	营销方案 示例：20210911003554
pictureSettingDetail	object	否	照片处理细节
theme	string	否	活动主题 示例：111
id	long	否	主键id（id查询用此） 示例：2434306005504256
pubts	string	否	时间戳 示例：2021-09-16 15:44:08
org_name	string	否	所属组织 示例：北京分公司
bustype_extend_attrs_json	string	否	交易类型扩展属性（attendObj参与对象：0终端，1客户；expenseItem_id费用项主键；expenseItem_name费用项名称；closeAfterSummary小结即结案；bustype活动分类：0促销活动，1推广活动） 示例：{"attendObj":"1","expenseItem_id":"","expenseItem_name":"","closeAfterSummary":"true","bustype":"0"}
bustype_code	string	否	交易类型编码 示例：82301
ower	string	否	负责人id 示例：2325360786608640
creator	string	否	制单人 示例：陈川华
org	string	否	组织id 示例：2293806909461248
isWfControlled	boolean	否	是否审批流（true:启用审批流；false:未启用审批流） 示例：false
terminalReality	long	否	终端真实(0：不真实，1：真实) 示例：1
actMatterNames	string	是	行为关系名称
dept_name	string	否	所属部门 示例：销售部
activity_code	string	否	营销活动 示例：20210913003851
dept	string	否	部门ID 示例：2293807299121408
transTypeKeyField	string	否	交易类型区域 示例：bustype
bustype	string	否	交易类型ID 示例：2400283644940544
createTime	string	否	制单时间 示例：2021-09-16 15:44:07
customer_name	string	否	活动客户 示例：终端lc-1
org_code	string	否	组织编码 示例：060901
actualCostList	object	否	实际费用
summaryMaterialList	object	否	活动物料

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"reviewReuslt": 2,
		"dept_code": "001",
		"verifystate": 0,
		"code": "20210916001970",
		"activity": 2429716062851328,
		"masterOrgKeyField": "org",
		"activity_bustype": "2292497086304513",
		"bustype_name": "小结",
		"activity_customer": 2352133551182336,
		"picture1": "240d7150-16c2-11ec-bcc2-ebe76ed634e9",
		"picture4": "23faaca0-16c2-11ec-bcc2-ebe76ed634e9",
		"picture3": "2401ffa0-16c2-11ec-bcc2-ebe76ed634e9",
		"picture2": "2407cc00-16c2-11ec-bcc2-ebe76ed634e9",
		"ower_name": "陈川华",
		"marketingPlan_code": "20210911003554",
		"pictureSettingDetail": {
			"watchmarkvalues": [
				"creator",
				"customer_name",
				"currentTime",
				"currentLocation"
			],
			"isAllowAlbum": false,
			"isUseWatermark": true,
			"id": 37549,
			"isAllowPhotograph": true
		},
		"theme": "111",
		"id": 2434306005504256,
		"pubts": "2021-09-16 15:44:08",
		"org_name": "北京分公司",
		"bustype_extend_attrs_json": "{\"attendObj\":\"1\",\"expenseItem_id\":\"\",\"expenseItem_name\":\"\",\"closeAfterSummary\":\"true\",\"bustype\":\"0\"}",
		"bustype_code": "82301",
		"ower": "2325360786608640",
		"creator": "陈川华",
		"org": "2293806909461248",
		"isWfControlled": false,
		"terminalReality": 1,
		"actMatterNames": [
			""
		],
		"dept_name": "销售部",
		"activity_code": "20210913003851",
		"dept": "2293807299121408",
		"transTypeKeyField": "bustype",
		"bustype": "2400283644940544",
		"createTime": "2021-09-16 15:44:07",
		"customer_name": "终端lc-1",
		"org_code": "060901",
		"actualCostList": {},
		"summaryMaterialList": {}
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
999	获取失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (46)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


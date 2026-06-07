---
title: "营销物料申领详情查询"
apiId: "2487517342779572229"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Marketing Material Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketing Material Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销物料申领详情查询

>  请求方式	GET | Marketing Material Application (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/MarketingMaterialApplication/getbyid
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	营销物料主键

## 3. 请求示例

Url: /yonbip/MCC/MarketingMaterialApplication/getbyid?access_token=访问令牌&id=

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
code	number
小数位数:0,最大长度:3	否	状态码 示例：200
message	string	否	消息 示例：操作成功
traceId	string	否	追踪ID 示例：03cba0734269eeaa
uploadable	string	否	可上传标识 示例：0
data	object	否	返回数据
id	string	否	主键ID 示例：2487487853529923586
code	string	否	申请单号 示例：2026030600049
bustype	string	否	交易类型ID 示例：2054084267070717958
bustype_name	string	否	交易类型名称 示例：测试加号123
bustype_extend	string	否	交易类型扩展信息 示例：{"isStockManage":"false","innerStoreAllocation":"false","isAutoIssue":"false"}
bustype_extend_attrs_json	string	否	交易类型扩展属性 示例：{"isStockManage":"false","innerStoreAllocation":"false","isAutoIssue":"false"}
org	string	否	销售组织ID 示例：1567050111173263368
org_code	string	否	销售组织编码 示例：JT01
org_name	string	否	销售组织名称 示例：集团
ower	string	否	执行人ID 示例：1567062987461099521
ower_name	string	否	执行人姓名 示例：李亚苹
applyTime	string	否	申请时间 示例：2026-03-06 00:00:00
verifystate	number
小数位数:0,最大长度:1	否	审批状态(0:待审批,1:已审批,2:已驳回) 示例：0 默认值：0
isWfControlled	boolean	否	是否工作流控制 示例：false 默认值：false
creatorId	string	否	创建人ID 示例：1567063219403489282
creator	string	否	创建人姓名 示例：昵称-李亚苹
modifierId	string	否	修改人ID 示例：1567063219403489282
modifier	string	否	修改人姓名 示例：昵称-李亚苹
createTime	string	否	创建时间 示例：2026-03-06 15:21:39
modifyTime	string	否	修改时间 示例：2026-03-06 15:25:20
pubts	string	否	更新时间戳 示例：2026-03-06 15:25:20
autoIssueStatus	number
小数位数:0,最大长度:1	否	自动下发状态 示例：0
masterOrgKeyField	string	否	主组织关键字段 示例：org
transTypeKeyField	string	否	交易类型关键字段 示例：bustype
_mddFormulaExecuteFlag	string	否	MDD公式执行标志 示例：true
pictureSettingDetail	object	否	图片设置详情
terminalAssetsDetail	object	是	终端资产明细列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"traceId": "03cba0734269eeaa",
	"uploadable": "0",
	"data": {
		"id": "2487487853529923586",
		"code": "2026030600049",
		"bustype": "2054084267070717958",
		"bustype_name": "测试加号123",
		"bustype_extend": "{\"isStockManage\":\"false\",\"innerStoreAllocation\":\"false\",\"isAutoIssue\":\"false\"}",
		"bustype_extend_attrs_json": "{\"isStockManage\":\"false\",\"innerStoreAllocation\":\"false\",\"isAutoIssue\":\"false\"}",
		"org": "1567050111173263368",
		"org_code": "JT01",
		"org_name": "集团",
		"ower": "1567062987461099521",
		"ower_name": "李亚苹",
		"applyTime": "2026-03-06 00:00:00",
		"verifystate": 0,
		"isWfControlled": false,
		"creatorId": "1567063219403489282",
		"creator": "昵称-李亚苹",
		"modifierId": "1567063219403489282",
		"modifier": "昵称-李亚苹",
		"createTime": "2026-03-06 15:21:39",
		"modifyTime": "2026-03-06 15:25:20",
		"pubts": "2026-03-06 15:25:20",
		"autoIssueStatus": 0,
		"masterOrgKeyField": "org",
		"transTypeKeyField": "bustype",
		"_mddFormulaExecuteFlag": "true",
		"pictureSettingDetail": {
			"id": "1567799170623864904",
			"isUseUISet": 0,
			"isAllowAlbum": true,
			"isAllowPhotograph": true,
			"isUseWatermark": false,
			"isCompressUploadedImages": 1
		},
		"terminalAssetsDetail": [
			{
				"id": "2487487853529923587",
				"terminalassetsId": "2487487853529923586",
				"customer": "1570239459373350917",
				"customer_name": "客户001",
				"customer_code": "00000000000001",
				"product": "1570762363075821574",
				"product_name": "物料22",
				"product_code": "新物料编码\t\t存货编码",
				"productMainUnit": "1567037191908491270",
				"productMainUnit_name": "小时",
				"productMainUnit_precision": 3,
				"quantity": 10,
				"outQuantity": 0,
				"pubts": "2026-03-06 15:21:40"
			}
		]
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

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


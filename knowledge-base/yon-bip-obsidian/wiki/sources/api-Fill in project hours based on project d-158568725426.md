---
title: "预算科目表保存"
apiId: "1585687254265757698"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Working Hour"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Working Hour]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算科目表保存

>  请求方式	POST | Project Working Hour (PMPP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/budget/saveSubject
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	否	入参层级，支持幂等
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	预算科目表ID，修改时必传；新增后台生成ID，不需要传 示例：1752133257202237446
code	string	否	否	预算科目表编码，新增时必填 示例：061901
name	string	否	否	预算科目表名称，新增时必填 示例：061901
addFlag	boolean	否	否	预算科目表新增标识(true为新增，false为更新，默认新增) 示例：true 默认值：true
orgId	string	否	否	业务单元ID，新增时业务单元ID和编码至少录入一项，业务单元ID和编码同时存在，以业务单元ID为准，来源于业务单元档案 示例：1549336472143790081
orgCode	string	否	否	业务单元编码，来源于业务单元档案 示例：001
enable	number
小数位数:0,最大长度:10	否	否	是否启用(1启用，0停用，默认启用) 示例：1
memo	string	否	否	备注（支持200字符） 示例：备注一下
items	object	是	否	预算科目

## 3. 请求示例

Url: /yonbip/digitalModel/budget/saveSubject?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1752133257202237446",
		"code": "061901",
		"name": "061901",
		"addFlag": true,
		"orgId": "1549336472143790081",
		"orgCode": "001",
		"enable": 1,
		"memo": "备注一下",
		"items": [
			{
				"id": "1752133257202237447",
				"code": "06190102",
				"name": "06190102",
				"memo": "备注一下",
				"parentCode": "06190101",
				"enable": 1,
				"addFlag": true
			}
		]
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
code	string	否	请求状态编码 示例：200
message	string	否	执行状态 示例：操作成功
data	object	否	执行结果
id	string	否	保存预算科目表的ID 示例：1752961515696160768

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1752961515696160768"
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
1001001000003	科目表编码不允许重复！；预算科目表编码不允许为空；科目表名称不允许重复！；预算科目表名称不允许为空；更新必须录入ID；请勿重复新增；请勿重复修改；当前组织未开放档案管理权!；存在父科目循环引用问题，请检查数据并更正！	预算科目表、科目编码、名称不允许重复，新增时编码名称不能为空；检查更新时是否录入了ID；录入参数不能重复；检查业务单元ID是否正确
1032001990095	业务单元id和编码不能同时为空	检查业务单元ID和编码是否都为空
1032001990096	业务单元编码不正确	检查业务单元编码是否正确
1032001990099	其他异常	查看具体错误信息
1032001990092	预算科目表id格式不正确	检查预算科目表id格式是否正确
1032001990094	预算科目id格式不正确	检查预算科目id格式是否正确
1032001990100	上级科目为停用，不可启用！	上级科目是禁用的科目不能启用
1032001990102	来源是费用项目的预算科目表不允许修改	来源是费用项目的预算科目表不允许修改

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


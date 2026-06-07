---
title: "标准工作包详情查询"
apiId: "2159297677285654536"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Standard Job Plan"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Standard Job Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 标准工作包详情查询

>  请求方式	POST | Standard Job Plan (APS)


## 1. 通过OpenAPI查询标准工作包详情；


## 2. 支持的查询条件及操作符：标准工作包编码（等于、模糊匹配）

3. 返回信息包括标准工作包表头、作业方案页签、物料页签、工种页签、工具页签、风险预控页签

## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/ampubstdjobcard/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	标准工作包主键 示例：1975228435580059658
code	string	否	否	标准工作包编码 示例：01

## 3. 请求示例

Url: /yonbip/am/ampubstdjobcard/detail?access_token=访问令牌
Body: {
	"id": "1975228435580059658",
	"code": "01"
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
code	string	否	返回http状态码(200:正常，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	查询到的数据
pk_org__name	string	否	维修组织 示例：WUHF资产组织
code	string	否	标准工作包编码 示例：01
name	object	否	标准工作包名称
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
enablestate	number
小数位数:0,最大长度:10	否	启用状态（启用状态 1-未启用 2-已启用 3-已停用） 示例：2
predict_hours	number
小数位数:2,最大长度:10	否	预计工作时长 示例：6.32
pk_category__category_name	string	否	资产类别 示例：一级资产
nversion	number
小数位数:0,最大长度:10	否	版本号 示例：1
last_version	boolean	否	是否最新版本 示例：true
pk_specialty__special_name	string	否	专业 示例：测试专业
pk_creation_dept__name	string	否	创建部门 示例：测试部门
memo	string	否	备注 示例：测试备注
updator__name	string	否	变更人 示例：昵称-王浩伟
update_time	string	否	变更时间 示例：2024-12-19 16:28:28
verifystate	number
小数位数:0,最大长度:10	否	审批状态（0-开立 1-审批中 2-审批通过 3-流程终止 4-退回制单） 示例：1
creator__name	string	否	创建人 示例：昵称-王浩伟
creationtime	string	否	创建时间 示例：2024-12-18 20:00:28
modifier__name	string	否	最后修改人 示例：昵称-郝小侠
modifiedtime	string	否	最后修改时间 示例：2024-12-19 18:22:36
std_job_task	object	否	作业方案页签
std_job_material	object	否	物料页签
std_job_type	object	否	工种页签
std_job_tool	object	否	工具页签
std_job_precaution	object	否	风险预控页签

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pk_org__name": "WUHF资产组织",
		"code": "01",
		"name": {
			"zh_CN": "测试数据"
		},
		"bill_status": 0,
		"enablestate": 2,
		"predict_hours": 6.32,
		"pk_category__category_name": "一级资产",
		"nversion": 1,
		"last_version": true,
		"pk_specialty__special_name": "测试专业",
		"pk_creation_dept__name": "测试部门",
		"memo": "测试备注",
		"updator__name": "昵称-王浩伟",
		"update_time": "2024-12-19 16:28:28",
		"verifystate": 1,
		"creator__name": "昵称-王浩伟",
		"creationtime": "2024-12-18 20:00:28",
		"modifier__name": "昵称-郝小侠",
		"modifiedtime": "2024-12-19 18:22:36",
		"std_job_task": {
			"sequence_num": 1,
			"job_content": "测试作业内容",
			"std_need": "测试标准要求",
			"check_means": "测试检查方法",
			"normal_hours": 12,
			"pk_tool__name": "工具1"
		},
		"std_job_material": {
			"rowno": 1,
			"sequence_num": 1,
			"pk_material__code": "01",
			"pk_material__name": "测试物料名称",
			"pk_material__modelDescription": "测试规格",
			"pk_material__model": "测试型号",
			"castunitid__name": "小时",
			"nnum": 4,
			"vchangerate": 1,
			"pk_measdoc__name": "小时",
			"nassistnum": "1",
			"reference_price": 2,
			"total_price": 4
		},
		"std_job_type": {
			"rowno": 1,
			"sequence_num": 1,
			"pk_craft__code": "01",
			"pk_craft__name": "工种01",
			"pk_craft_level__name": "中级",
			"person_num": 3,
			"normal_hours": 2,
			"std_rate": 4,
			"total_craft": 24
		},
		"std_job_tool": {
			"rowno": 1,
			"sequence_num": 1,
			"pk_tool__code": "01",
			"pk_tool__name": "工具1",
			"tools_num": 6
		},
		"std_job_precaution": {
			"pk_precaution__code": "01",
			"pk_precaution__name": "风险1",
			"pk_precaution__risk_type": "安全风险",
			"risk_zone": "高空作业防护",
			"precaution_content": "安全带厚度、检查安全带是否结实",
			"memo": "测试备注"
		}
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
999	服务端逻辑异常	服务端逻辑异常

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


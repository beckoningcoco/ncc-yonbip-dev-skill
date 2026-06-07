---
title: "行动保存"
apiId: "2210645935363457025"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Action"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Action]
platform_version: "BIP"
source_type: community-api-docs
---

# 行动保存

>  请求方式	POST | Action (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/actt/save
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
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
org	string	否	是	组织ID 示例：1731890672499687429
org_name	string	否	否	销售组织名称 示例：集团
id	string	否	否	行动ID
creatorId	string	否	是	创建人ID
actiontypesetting	string	否	是	行动类型设置ID
oppt	string	否	否	商机ID 示例：2200251547675787269
oppt_name	string	否	否	商机名称 示例：验证查询商家01
clue	string	否	否	线索ID 示例：1889129201976475657
clue_name	string	否	否	线索 示例：导入线索04
activity	string	否	否	营销活动ID 示例：1904737207619420161
customer	string	否	否	客户ID 示例：2076170457769836548
customer_name	string	否	否	客户名称 示例：zy082901
terminal	string	否	否	终端ID 示例：2023638077136175105
terminal_name	string	否	否	终端名称 示例：地址测试
saleArea	string	否	否	销售区域ID 示例：2173415500960759810
saleArea_name	string	否	否	销售区域名称 示例：华北区
dept	string	否	否	部门ID 示例：1733604751101657088
dept_name	string	否	否	部门名称 示例：销管一部
ower	string	否	否	负责人ID 示例：1997633141071151107
ower_name	string	否	否	负责人名称 示例：王天驰
_status	string	否	是	保存类型 Insert:新增 Update:更新 示例：Insert

## 3. 请求示例

Url: /yonbip/crm/actt/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "1731890672499687429",
		"org_name": "集团",
		"id": "",
		"creatorId": "",
		"actiontypesetting": "",
		"oppt": "2200251547675787269",
		"oppt_name": "验证查询商家01",
		"clue": "1889129201976475657",
		"clue_name": "导入线索04",
		"activity": "1904737207619420161",
		"customer": "2076170457769836548",
		"customer_name": "zy082901",
		"terminal": "2023638077136175105",
		"terminal_name": "地址测试",
		"saleArea": "2173415500960759810",
		"saleArea_name": "华北区",
		"dept": "1733604751101657088",
		"dept_name": "销管一部",
		"ower": "1997633141071151107",
		"ower_name": "王天驰",
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
code	string	否	行动编码 示例：20250226002862
actiontypesetting	string	否	行动类型设置 示例：1893177474935685122
actiontypesetting_associationBusinessObject	string	否	行动类型设置关联业务对象 示例：0
actiontypesetting_bustype	string	否	行动类型设置交易类型 示例：1884107775339922596
actiontypesetting_name	string	否	行动类型设置名 示例：普通行动
actionTime	string	否	行动时间 示例：2025-02-26 00:00:00
customer	string	否	客户ID 示例：1884714181757239300
customer_name	string	否	客户名字 示例：正式客户121501
contractDraft	string	否	合同草案ID 示例：1904961130035937281
contractDraft_name	string	否	合同草案名称 示例：合同111
terminal	string	否	终端ID 示例：1904961130035937281
terminal_name	string	否	终端名 示例：终端1
activity	string	否	营销活动ID 示例：1904961130035937281
oppt	string	否	商机ID 示例：2200251547675787269
oppt_name	string	否	商机名称 示例：验证查询商家01
clue	string	否	线索ID 示例：1889129201976475657
clue_name	string	否	线索名 示例：导入线索04
org	string	否	组织ID 示例：1884698324742176769
org_name	string	否	组织名 示例：集团
saleArea	string	否	销售区域ID 示例：1884704045653819395
saleArea_name	string	否	销售区域名 示例：北京区
dept	string	否	部门ID 示例：1884699295404785664
dept_name	string	否	部门名 示例：销管二部
ower	string	否	负责人ID 示例：1884702611124256781
ower_name	string	否	负责人名 示例：王天驰
finishedcondition	string	否	完成状态 示例：0
id	string	否	行动id 示例：2210655710786617351
bustype	string	否	交易类型 示例：1884107775339922596
creatorId	string	否	创建人ID 示例：1884702791499776003
creator	string	否	创建人 示例：王天驰

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "20250226002862",
		"actiontypesetting": "1893177474935685122",
		"actiontypesetting_associationBusinessObject": "0",
		"actiontypesetting_bustype": "1884107775339922596",
		"actiontypesetting_name": "普通行动",
		"actionTime": "2025-02-26 00:00:00",
		"customer": "1884714181757239300",
		"customer_name": "正式客户121501",
		"contractDraft": "1904961130035937281",
		"contractDraft_name": "合同111",
		"terminal": "1904961130035937281",
		"terminal_name": "终端1",
		"activity": "1904961130035937281",
		"oppt": "2200251547675787269",
		"oppt_name": "验证查询商家01",
		"clue": "1889129201976475657",
		"clue_name": "导入线索04",
		"org": "1884698324742176769",
		"org_name": "集团",
		"saleArea": "1884704045653819395",
		"saleArea_name": "北京区",
		"dept": "1884699295404785664",
		"dept_name": "销管二部",
		"ower": "1884702611124256781",
		"ower_name": "王天驰",
		"finishedcondition": "0",
		"id": "2210655710786617351",
		"bustype": "1884107775339922596",
		"creatorId": "1884702791499776003",
		"creator": "王天驰"
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


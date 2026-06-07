---
title: "企业资金账户批量保存V7"
apiId: "2201867580536258565"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Fund Account"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Fund Account]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业资金账户批量保存V7

>  请求方式	POST | Enterprise Fund Account (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/basedoc/enterprisebank/batchSave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
matchRule	string	否	是	对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id
unmatchedStrategy	string	否	是	按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add
data	object	是	否	请求体
id	string	否	否	主键 示例：2201731713568604166
code	string	否	是	编码 示例：lc01
name	object	否	是	名称，根据租户开通的语种传入
description	object	否	否	描述，根据租户开通的语种传入
account_apply_range	object	是	否	适用范围
enable	number
小数位数:0,最大长度:10	否	否	状态，0:未启用、1:启用、2:停用 示例：0
accountNature	number
小数位数:0,最大长度:10	否	否	账户类型包括：0-活期、1-定期、2-通知、3-保证金、4-贷款，根据传入的开户类型不同，账户类型的范围不同。其中：1）开户类型为0-银行开户时，账户类型范围支持【0、1、2、3】；2）开户类型为1-结算中心开户时，账户类型范围支持【0、1、4】；3）开户类型为2-财务公司时，账户类型范围支持【0、1、2、3】；4）开户类型为3-其他金融机构时，账户类型支持【0、1、2、3】；5）开户类型为5-数币钱包时，账户类型范围支持【0、1、2、3】。 示例：0 默认值：0
currencyList	object	是	否	企业银行币种
linkedAccountList	object	是	否	数币钱包关联银行账户
taxRegistration	boolean	否	否	纳税登记 false-否 true-是 示例：false
acctName	object	否	否	开户名，根据租户开通的语种传入
orgid	string	否	否	组织主键，与orgid___code二选一录入即可，默认id有值时，code字段不生效 示例：1624225669279907850
orgid___code	string	否	否	组织编码，与orgid二选一录入即可，deptid为空时，按code匹配组织档案 示例：test01
agentBank	string	否	否	电票代理行主键，与agentBank___code二选一录入即可，默认id有值时，code字段不生效 示例：2183173202809192448
agentBank___code	string	否	否	电票代理行编码，与agentBank二选一录入即可，deptid为空时，按code匹配银行网点档案 示例：openapi_test
acctopentype	number
小数位数:0,最大长度:10	否	否	开户类型 0-银行开户 1-结算中心开户 2-财务公司 3-其他金融机构 5-数币钱包 示例：0
accountPurpose	string	否	否	账户用途主键，与accountPurpose___code二选一录入即可，默认id有值时，code字段不生效 示例：2200876396574146567
accountPurpose___code	string	否	否	账户用途编码，与accountPurpose二选一录入即可，deptid为空时，按code匹配银行账户用途档案 示例：use_api001
acctType	number
小数位数:0,最大长度:10	否	否	账户性质包括：0-基本、1-一般、2-临时、3-专用、5-其他、6-第三方账户，根据传入的开户类型不同，账户性质的范围不同。其中：1）开户类型为0-银行开户时，账户性质范围支持【0、1、2、3、5、6】；2）开户类型为1-结算中心开户时，账户性质范围支持【1】；3）开户类型为2-财务公司时，账户性质范围支持【1、2、3、5、6】； 4）当开户类型为3-其他金融机构时，账户性质范围支持【1、2、3、5、6】；5）当开户类型为5-数币钱包时，账户性质范围支持【0、1、2、3、5、6】。 示例：0 默认值：0
accountOrgId	string	否	否	开户组织主键，与accountOrgId___code二选一录入即可，默认id有值时，code字段不生效 示例：1624225669279907850
accountOrgId___code	string	否	否	与accountOrgId二选一录入即可，deptid为空时，按code匹配组织档案 示例：test01
bankNumber	string	否	否	开户行主键，与bankNumber___code二选一录入即可，默认id有值时，code字段不生效 示例：2183173202809192448
bankNumber___code	string	否	否	开户行编码，与bankNumber二选一录入即可，deptid为空时，按code匹配银行网点档案 示例：openapi_test
account	string	否	否	银行账号 示例：account001
parent	string	否	否	上级企业银行账户主键，与上级企业银行账户编码二选一，默认id有值时，code字段不生效 示例：2013259365970083864
parent___code	string	否	否	上级企业银行账户编码，与上级企业银行账户主键二选一 示例：api001
settleorgid	string	否	否	结算中心主键 示例：1632565696906395656
settleorgid___code	string	否	否	结算中心编码 示例：01
sourceUnique	string	否	是	来源唯一键 示例：sourceUnique001
accountOpenDate	date
格式:yyyy-MM-dd	否	否	开户日期 示例：2025-03-03
accountLevel	string	否	否	账户等级，开户类型为数币钱包时必填，1-一类 2-二类 3-三类 4-四类 示例：1

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/enterprisebank/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"id": "2201731713568604166",
			"code": "lc01",
			"name": {
				"zh_CN": "银行账户01",
				"en_US": "Bank Account 01",
				"zh_TW": "银行账户01"
			},
			"description": {
				"zh_TW": "银行账户描述01",
				"en_US": "Bank Account Description01",
				"zh_CN": "银行账户描述01"
			},
			"account_apply_range": [
				{
					"rangeOrgId___code": "test01"
				}
			],
			"enable": 0,
			"accountNature": 0,
			"currencyList": [
				{
					"currency": "2200857893855035397",
					"currency___code": "NAPI",
					"enable": 1,
					"isdefault": false,
					"iban": "412313"
				}
			],
			"linkedAccountList": [
				{
					"linkedBankAccountId": "124151556113",
					"linkedBankAccountId___code": "testCode",
					"currencyId": "3453545",
					"currencyId___code": "NAPI"
				}
			],
			"taxRegistration": false,
			"acctName": {
				"zh_TW": "开户名01",
				"en_US": "Account name",
				"zh_CN": "开户名01"
			},
			"orgid": "1624225669279907850",
			"orgid___code": "test01",
			"agentBank": "2183173202809192448",
			"agentBank___code": "openapi_test",
			"acctopentype": 0,
			"accountPurpose": "2200876396574146567",
			"accountPurpose___code": "use_api001",
			"acctType": 0,
			"accountOrgId": "1624225669279907850",
			"accountOrgId___code": "test01",
			"bankNumber": "2183173202809192448",
			"bankNumber___code": "openapi_test",
			"account": "account001",
			"parent": "2013259365970083864",
			"parent___code": "api001",
			"settleorgid": "1632565696906395656",
			"settleorgid___code": "01",
			"sourceUnique": "sourceUnique001",
			"accountOpenDate": "2025-03-03",
			"accountLevel": "1"
		}
	]
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
code	string	否	返回码，调用成功是返回200 示例：200
data	object	否	调用成功时的返回数据
count	number
小数位数:0,最大长度:10	否	总数 示例：10
successCount	number
小数位数:0,最大长度:10	否	成功总数 示例：9
failCount	number
小数位数:0,最大长度:10	否	失败总数 示例：1
messages	object	是	失败数据信息
infos	object	是	成功数据信息
displayCode	string	否	业务异常码 示例：000-525-000067
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "编码冲突！"
			}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-525-000066
	传入的数据列表为空或存在空对象，请检查代码	
000-525-000067
	执行批量操作时，数据必须包含sourceUnique	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-15	
更新
请求说明
更新
请求参数 (12)
新增
异常码 000-525-000066
新增
异常码 000-525-000067
修正账户类型支持范围： 其他金融机构：活期、定期、通知、保证金
	2	2025-07-01	
更新
请求说明
新增
返回参数 displayCode
新增
返回参数 level
	3	2025-05-22	
删除
请求参数 insertAutoApplyRange
企业银行账户批量保存

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


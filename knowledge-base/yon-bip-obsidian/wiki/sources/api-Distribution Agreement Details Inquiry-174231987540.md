---
title: "经销协议详情查询"
apiId: "1742319875403546624"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Distribution Agreement"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Distribution Agreement]
platform_version: "BIP"
source_type: community-api-docs
---

# 经销协议详情查询

>  请求方式	GET | Distribution Agreement (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/voucher/agreement/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	经销协议ID， 与code两项中必须输入一项，当两项都输入时，以id为准    示例: 1698394720901791748
code	string	query	否	经销协议编码，与 id 两项中必须输入一项，当两项都输入时，以id为准    示例: JAA202304080001

## 3. 请求示例

Url: /yonbip/sd/api/voucher/agreement/detail?access_token=访问令牌&id=1698394720901791748&code=JAA202304080001

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
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	返回结果
accountIdA	string	否	甲方账户 示例：168520000000000000000
marketAreaId_name	string	否	所属销售区域 示例：华南002
agentEnterpriseName	string	否	直接客户企业名称 示例：直接客户企业名称
departmentId	string	否	所属部门id 示例：1593028384213958702
capitalSpecialFund	string	否	专项基金金额大写 示例：两千
accountIdB	string	否	乙方账户 示例：168530000000000000000
modifier	string	否	修改人 示例：修改人
businessId	string	否	合同交易类型id 示例：2386231289844480
modifierId	long	否	修改人id 示例：2650884321634304
marketerId_name	string	否	所属业务员 示例：所属业务员
proxyA	string	否	甲方代理人 示例：甲方代理人
proxyB	string	否	乙方代理人 示例：乙方代理人
capitalVolume	string	否	总体积大写 示例：伍万陆仟
number	BigDecimal	否	总数量 示例：6100
capitalDeposit	string	否	保证金大写 示例：壹仟
modifyTime	string	否	修改时间 示例：2023-06-08 13:43:20
addressB	string	否	乙方地址 示例：乙方地址
agreementGoodSaleRange	object	是	经营商品行
addressA	string	否	甲方地址 示例：甲方地址
phoneB	string	否	乙方电话 示例：158000000
capitalCompensation	string	否	赔偿金大写 示例：伍仟
taxpayerIdB	string	否	乙方纳税人识别号 示例：XY124546543241654654653
id	long	否	单据主表id 示例：1743709400487952391
beginTime	string	否	开始日期 示例：2023-06-08 00:00:00
taxpayerIdA	string	否	甲方纳税人识别号 示例：XY124546543241654654654
signOrgId	string	否	主签署组织id 示例：2383019313829632
agentId_name	string	否	直接客户 示例：直接客户
phoneA	string	否	甲方电话 示例：18300000000
emailB	string	否	乙方电子邮箱 示例：yifang@163.com
emailA	string	否	甲方电子邮箱 示例：jiafang@163.com
modifyDate	string	否	修改日期 示例：2023-06-08 00:00:00
isWfControlled	boolean	否	是否审批流控制(true:是,false:否) 示例：true
businessId_extend_attrs_json	string	否	合同交易类型扩展属性 示例：{"0002":"333","agreement011":"agent011_1","agreement001":"true","0001":"222","agreement010":"agent010_1","agreement004":"false","agreement002":"agent002_1","agreement003":"agent003_1","agreement008":"","agreement009":"","agreement006":"港元","agreement007":"公斤"}
weight	BigDecimal	否	总重量 示例：1500
volume	BigDecimal	否	总体积 示例：56000
auditorId	long	否	审核人ID 示例：2650884321634304
accountBankA	string	否	甲方开户行 示例：甲方开户行
accountBankB	string	否	乙方开户行 示例：乙方开户行
auditTime	string	否	审批时间 示例：2023-06-08 13:43:48
brandId	long	否	所属品牌id 示例：2414198320042240
departmentId_name	string	否	所属部门 示例：所属部门
deposit	BigDecimal	否	保证金 示例：1000
capitalNum	string	否	总数量大写 示例：陆仟壹佰
businessId_name	string	否	交易类型 示例：年度经销协议
status	long	否	协议状态(0:开立,1:审批通过,3:审批中,4:已冻结) 示例：1
capitalDecorationDeposit	string	否	装修保证金大写 示例：伍佰
marketAreaId	long	否	所属销售区域id 示例：2540160539087104
agentId	long	否	直接客户id 示例：2403258568265984
code	string	否	编码 示例：JXXY202306080005
contractTypeId_name	string	否	协议类型 示例：1686068538
signStatus	long	否	签署状态(1:无需签署,2:待发起,3:签署中,4:签署完成) 示例：2
capitalFirstAmount	string	否	首单金额大写 示例：贰仟
creatorId	long	否	创建人ID 示例：2650884321634304
vouchdate	string	否	单据日期 示例：2023-06-08 00:00:00
capitalWeight	string	否	总重量大写 示例：一千五百
contractName	string	否	协议名称 示例：协议名称
signOrgId_name	string	否	主签署组织 示例：自动化_普通组织2
productLineId_name	string	否	所属产品线 示例：所属产品线
capitalAmount	string	否	总金额大写 示例：叁万
productLineId	long	否	所属产品线id 示例：1575379453059006472
createDate	string	否	创建日期 示例：2023-06-08 00:00:00
auditDate	string	否	审批日期 示例：2023-06-08 00:00:00
amount	BigDecimal	否	总金额 示例：30000
creator	string	否	制单人 示例：制单人
annualDate	string	否	所属年度 示例：2023-01-01 00:00:00
specialFund	BigDecimal	否	专项基金金额 示例：2000
auditor	string	否	审批人 示例：张三
brandId_name	string	否	所属品牌 示例：所属品牌
agreementGoodSaleArea	object	是	经营区域行
contractTypeId	long	否	协议类型id 示例：1742627481052512265
decorationDeposit	BigDecimal	否	装修保证金 示例：500
createTime	string	否	创建时间 示例：2023-06-08 11:21:32
firstAmount	BigDecimal	否	首单金额 示例：2000
signedDate	string	否	签署日期 示例：2023-06-08 00:00:00
compensation	BigDecimal	否	赔偿金 示例：5000
legalPersonB	string	否	乙方法人 示例：乙方法人
emailNameB	string	否	乙方电子邮箱名称 示例：yifang
endTime	string	否	结束日期 示例：2023-06-30 00:00:00
marketerId	string	否	所属业务员id 示例：1587844788211154946
emailNameA	string	否	甲方电子邮箱名称 示例：jiafang
accountNameA	string	否	甲方开户名 示例：甲方开户名
legalPersonA	string	否	甲方法人 示例：甲方法人
internalCode	string	否	内部编码 示例：neibubianma
salesOrgId_name	string	否	管理组织 示例：自动化_普通组织2
salesOrgId	string	否	管理组织id 示例：2383019313829632
accountNameB	string	否	乙方开户名 示例：乙方开户名
stockOrgId	string	否	辅助库存组织id 示例：2383019313829634
stockOrgId_name	string	否	辅助库存组织 示例：辅助库存组织
auxiliarySalesOrgId	string	否	辅助销售组织id 示例：2383019313829635
auxiliarySalesOrgId_name	string	否	辅助销售组织 示例：辅助销售组织
channelAgentId	long	否	渠道客户id 示例：2383019313829636
channelAgentId_name	string	否	渠道客户 示例：渠道客户
channelAgentEnterpriseName	string	否	渠道客户企业名称 示例：渠道客户企业名称
bizId	long	否	渠道商家id 示例：2383019313829637
bizId_name	string	否	渠道商家 示例：渠道商家
bizEnterpriseName	string	否	渠道商家企业名称 示例：渠道商家企业名称
legalPersonC	string	否	丙方法人 示例：丙方法人
proxyC	string	否	丙方代理人 示例：丙方代理人
emailC	string	否	丙方电子邮箱 示例：bignfang@163.com
emailNameC	string	否	丙方电子邮箱名称 示例：丙方电子邮箱名称
phoneC	string	否	丙方电话 示例：15800000000
addressC	string	否	丙方地址 示例：丙方地址
accountBankC	string	否	丙方开户行 示例：丙方开户行
accountNameC	string	否	丙方开户名 示例：丙方开户名
accountIdC	string	否	丙方账户 示例：158964200000000000
taxpayerIdC	string	否	丙方纳税人识别号 示例：XYU546500000000000
auxiliaryAgentId	long	否	辅助客户id 示例：2383019313829649
auxiliaryAgentId_name	string	否	辅助客户 示例：辅助客户
auxiliaryAgentEnterpriseName	string	否	辅助客户企业名称 示例：辅助客户企业名称

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accountIdA": "168520000000000000000",
		"marketAreaId_name": "华南002",
		"agentEnterpriseName": "直接客户企业名称",
		"departmentId": "1593028384213958702",
		"capitalSpecialFund": "两千",
		"accountIdB": "168530000000000000000",
		"modifier": "修改人",
		"businessId": "2386231289844480",
		"modifierId": 2650884321634304,
		"marketerId_name": "所属业务员",
		"proxyA": "甲方代理人",
		"proxyB": "乙方代理人",
		"capitalVolume": "伍万陆仟",
		"number": 6100,
		"capitalDeposit": "壹仟",
		"modifyTime": "2023-06-08 13:43:20",
		"addressB": "乙方地址",
		"agreementGoodSaleRange": [
			{
				"brandName": "品牌",
				"brandId": 2499104493621504,
				"id": 1743782243133292548,
				"productLineId": 2499104493621501,
				"productLineName": "产品线",
				"goodClassId": 2499104493621502,
				"goodClassName": "商品分类",
				"goodId": 2499104493621503,
				"goodName": "商品"
			}
		],
		"addressA": "甲方地址",
		"phoneB": "158000000",
		"capitalCompensation": "伍仟",
		"taxpayerIdB": "XY124546543241654654653",
		"id": 1743709400487952391,
		"beginTime": "2023-06-08 00:00:00",
		"taxpayerIdA": "XY124546543241654654654",
		"signOrgId": "2383019313829632",
		"agentId_name": "直接客户",
		"phoneA": "18300000000",
		"emailB": "yifang@163.com",
		"emailA": "jiafang@163.com",
		"modifyDate": "2023-06-08 00:00:00",
		"isWfControlled": true,
		"businessId_extend_attrs_json": "{\"0002\":\"333\",\"agreement011\":\"agent011_1\",\"agreement001\":\"true\",\"0001\":\"222\",\"agreement010\":\"agent010_1\",\"agreement004\":\"false\",\"agreement002\":\"agent002_1\",\"agreement003\":\"agent003_1\",\"agreement008\":\"\",\"agreement009\":\"\",\"agreement006\":\"港元\",\"agreement007\":\"公斤\"}",
		"weight": 1500,
		"volume": 56000,
		"auditorId": 2650884321634304,
		"accountBankA": "甲方开户行",
		"accountBankB": "乙方开户行",
		"auditTime": "2023-06-08 13:43:48",
		"brandId": 2414198320042240,
		"departmentId_name": "所属部门",
		"deposit": 1000,
		"capitalNum": "陆仟壹佰",
		"businessId_name": "年度经销协议",
		"status": 1,
		"capitalDecorationDeposit": "伍佰",
		"marketAreaId": 2540160539087104,
		"agentId": 2403258568265984,
		"code": "JXXY202306080005",
		"contractTypeId_name": "1686068538",
		"signStatus": 2,
		"capitalFirstAmount": "贰仟",
		"creatorId": 2650884321634304,
		"vouchdate": "2023-06-08 00:00:00",
		"capitalWeight": "一千五百",
		"contractName": "协议名称",
		"signOrgId_name": "自动化_普通组织2",
		"productLineId_name": "所属产品线",
		"capitalAmount": "叁万",
		"productLineId": 1575379453059006472,
		"createDate": "2023-06-08 00:00:00",
		"auditDate": "2023-06-08 00:00:00",
		"amount": 30000,
		"creator": "制单人",
		"annualDate": "2023-01-01 00:00:00",
		"specialFund": 2000,
		"auditor": "张三",
		"brandId_name": "所属品牌",
		"agreementGoodSaleArea": [
			{
				"saleAreaName": "销售区域",
				"id": 1743782406342049797,
				"saleAreaId": 2540160535269632,
				"regionCode": "110105000000"
			}
		],
		"contractTypeId": 1742627481052512265,
		"decorationDeposit": 500,
		"createTime": "2023-06-08 11:21:32",
		"firstAmount": 2000,
		"signedDate": "2023-06-08 00:00:00",
		"compensation": 5000,
		"legalPersonB": "乙方法人",
		"emailNameB": "yifang",
		"endTime": "2023-06-30 00:00:00",
		"marketerId": "1587844788211154946",
		"emailNameA": "jiafang",
		"accountNameA": "甲方开户名",
		"legalPersonA": "甲方法人",
		"internalCode": "neibubianma",
		"salesOrgId_name": "自动化_普通组织2",
		"salesOrgId": "2383019313829632",
		"accountNameB": "乙方开户名",
		"stockOrgId": "2383019313829634",
		"stockOrgId_name": "辅助库存组织",
		"auxiliarySalesOrgId": "2383019313829635",
		"auxiliarySalesOrgId_name": "辅助销售组织",
		"channelAgentId": 2383019313829636,
		"channelAgentId_name": "渠道客户",
		"channelAgentEnterpriseName": "渠道客户企业名称",
		"bizId": 2383019313829637,
		"bizId_name": "渠道商家",
		"bizEnterpriseName": "渠道商家企业名称",
		"legalPersonC": "丙方法人",
		"proxyC": "丙方代理人",
		"emailC": "bignfang@163.com",
		"emailNameC": "丙方电子邮箱名称",
		"phoneC": "15800000000",
		"addressC": "丙方地址",
		"accountBankC": "丙方开户行",
		"accountNameC": "丙方开户名",
		"accountIdC": "158964200000000000",
		"taxpayerIdC": "XYU546500000000000",
		"auxiliaryAgentId": 2383019313829649,
		"auxiliaryAgentId_name": "辅助客户",
		"auxiliaryAgentEnterpriseName": "辅助客户企业名称"
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
999	错误信息	请重新修改参数

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


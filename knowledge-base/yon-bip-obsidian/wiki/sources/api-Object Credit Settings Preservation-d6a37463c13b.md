---
title: "授信申请保存"
apiId: "d6a37463c13b46e0a359669b8c5a416e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Application"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 授信申请保存

>  请求方式	POST | Credit Application (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/creditsettingtmp/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	对象信用设置数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	单据id（更新操作必填）
transactionTypeId	string	否	是	交易类型id 示例：1952340151146905605
orgId	string	否	是	授信组织id,或授信组织code 示例：2060702124462336
departmentId	string	否	否	授信部门id,或授信部门code 示例：2094572910760192
targetType	long	否	是	对象类型（0：客户，1:业务员；2：销售组织；3，部门4：对象域，5：会计主体）??示例:?0 示例：0
isWfControlled	boolean	否	否	是否审批流控制（true：是，false：否） 示例：false
productDimension	long	否	是	产品维度（0：不控制） 暂时只支持不控制 示例：0
verifystate	long	否	否	审批状态，由系统业务自动生成，接口无需传值。
status	long	否	否	单据状态，由系统业务自动生成，接口无需传值。
controlScope	long	否	是	控制范围（0：当前组织，2：全局，3：范围域） 示例：0
startDate	string	否	否	起始日期 示例：2021-04-02 00:00:00
endDate	string	否	否	截至日期 示例：2021-04-03 00:00:00
grantType	long	否	否	授予方式（0：变更，1：追加） 示例：0
checkRuleId	string	否	是	信用检查规则id,或信用检查规则code 示例：2174298302288128
targetStatus	long	否	否	对象状态，由系统业务自动生成，接口无需传值。
creditQuotaRuleId	string	否	是	额度占用规则id或额度占用规则code 示例：2604106019983616
excRateTypeId	string	否	是	汇率类型id，或汇率类型code 示例：0000KY2DK3XH2NO4KJ0000
extensionDomainType	string	否	否	扩展域类型（0：物料，1：商品分类，2：物料分类，3：产品线，4：扩展域， 特征编码：特征名称）； 示例：'0,TZ0101' ,说明： 可以录入多个，英文逗号分割， 特征编码，是分配给 扩展域 的特征，以实际为准 示例：0,TZ0101
creditSettingItems	object	是	否	对象信用设置字表
_status	string	否	是	操作标识, Insert:新增、 Update:更新 示例：Insert

## 3. 请求示例

Url: /yonbip/sd/creditsettingtmp/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"transactionTypeId": "1952340151146905605",
		"orgId": "2060702124462336",
		"departmentId": "2094572910760192",
		"targetType": 0,
		"isWfControlled": false,
		"productDimension": 0,
		"verifystate": 0,
		"status": 0,
		"controlScope": 0,
		"startDate": "2021-04-02 00:00:00",
		"endDate": "2021-04-03 00:00:00",
		"grantType": 0,
		"checkRuleId": "2174298302288128",
		"targetStatus": 0,
		"creditQuotaRuleId": "2604106019983616",
		"excRateTypeId": "0000KY2DK3XH2NO4KJ0000",
		"extensionDomainType": "0,TZ0101",
		"creditSettingItems": [
			{
				"id": 0,
				"status": 0,
				"isCreditLineCtl": true,
				"adjustCreditLine": true,
				"creditLine": "1.00",
				"isOverdueDaysCtl": false,
				"adjustOverdueDays": false,
				"overdueDays": "10",
				"checkRuleId": "2174298302288128",
				"startDate": "2021-04-02 00:00:00",
				"endDate": "2021-04-03 00:00:00",
				"targetObjId": "2079070989799936",
				"controlDomainId": "1533683077179506688",
				"currencyName": "人民币",
				"currencyId": "2060627104667136",
				"moneyDigit": 2,
				"containSub": false,
				"isShare": true,
				"quotaRuleId": "2604106019983616",
				"operator": "1686483891810992133",
				"orgId": "1686518096942071817",
				"departmentId": "1994677903082127365",
				"targetDomainId": "1529985264944414731",
				"settlementOrgId": "1685812657140006920",
				"productId": "1972298709710929924",
				"productId_name": "拿铁套餐",
				"productClassId": "1999099975636615182",
				"productClassId_name": "卡券分类",
				"materialClassId": "1972278841200082946",
				"materialClassId_name": "西瓜分类",
				"productLine": "1997644926631280647",
				"productLine_name": "西瓜",
				"creditExtDomainId": "1997644926631280647",
				"_status": "Insert"
			}
		],
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	提示信息编码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	返回数据
bizId	long	否	商家id 示例：2060625902227712
checkRuleId	long	否	信用检查规则id 示例：2174298302288128
checkRuleName	string	否	信用检查规则名称 示例：保存预警提示
controlScope	long	否	控制范围（0：当前组织，2：全局） 示例：0
createDate	string	否	创建日期 示例：2021-04-02 14:14:15
createTime	string	否	创建时间 示例：2021-04-02 14:14:15
creator	string	否	创建人 示例：王明霞
creatorId	long	否	创建人id 示例：2060700027457792
creditSettingItems	object	是	信用对象设置字表
departmentId	string	否	授信部门id 示例：2094572910760192
departmentName	string	否	授信部门名称 示例：夏目部门
endDate	string	否	截至日期 示例：2021-04-03 00:00:00
grantType	long	否	（0：变更，1：追加） 示例：0
id	long	否	单据id 示例：2197816205168896
isWfControlled	boolean	否	是否受审批流控制（true：是，false：否） 示例：true
orgId	string	否	授信组织id 示例：2060702124462336
orgName	string	否	授信组织名称 示例：夏目公司
productDimension	long	否	（0：不控制） 示例：0
pubts	string	否	更新时间 示例：2021-04-02 14:14:16
startDate	string	否	起始日期 示例：2021-04-02 00:00:00
status	long	否	单据状态（(0：开立，1：已审核，2：已关闭，3：审核中，4：锁定中)） 示例：0
targetStatus	long	否	对象状态（0：保存，1：审核中，2：已审核，3：已取消） 示例：1
targetType	long	否	对象类型（0：客户） 示例：0
uordercorp	long	否	租户id 示例：2060625902227712
verifystate	long	否	（0：未审核，1：提交中，3：已审核） 示例：0
yTenantId	string	否	租户 示例：pywpv5oq

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"bizId": 2060625902227712,
		"checkRuleId": 2174298302288128,
		"checkRuleName": "保存预警提示",
		"controlScope": 0,
		"createDate": "2021-04-02 14:14:15",
		"createTime": "2021-04-02 14:14:15",
		"creator": "王明霞",
		"creatorId": 2060700027457792,
		"creditSettingItems": [
			{
				"checkRuleId": 2174298302288128,
				"checkRuleName": "保存预警提示",
				"creditLine": "1.00",
				"currencyId": "2060627104667136",
				"currencyName": "人民币",
				"endDate": "2021-04-03 00:00:00",
				"id": 2197816205168897,
				"isCreditLineCtl": true,
				"isOverdueDaysCtl": false,
				"moneyDigit": "2",
				"pubts": "2021-04-02 14:14:15",
				"settingId": 2197816205168896,
				"startDate": "2021-04-02 00:00:00",
				"status": 0,
				"targetObjId": 2079070989799936,
				"targetObjName": "CRM客户升级验证2",
				"containSub": false,
				"isShare": true,
				"uordercorp": 2060625902227712,
				"yTenantId": "pywpv5oq",
				"targetDomainId": "1533683077179506688",
				"controlDomainId": "1533690936969658378"
			}
		],
		"departmentId": "2094572910760192",
		"departmentName": "夏目部门",
		"endDate": "2021-04-03 00:00:00",
		"grantType": 0,
		"id": 2197816205168896,
		"isWfControlled": true,
		"orgId": "2060702124462336",
		"orgName": "夏目公司",
		"productDimension": 0,
		"pubts": "2021-04-02 14:14:16",
		"startDate": "2021-04-02 00:00:00",
		"status": 0,
		"targetStatus": 1,
		"targetType": 0,
		"uordercorp": 2060625902227712,
		"verifystate": 0,
		"yTenantId": "pywpv5oq"
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
999	服务器逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-22	
更新
请求说明
更新
请求参数 targetType
更新
请求参数 settlementOrgId
	2	2025-08-14	
更新
请求参数 startDate
更新
请求参数 endDate
QDZT-36815 开始、截至日期取消必填

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


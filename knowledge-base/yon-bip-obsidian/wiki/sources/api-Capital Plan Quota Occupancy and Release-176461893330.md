---
title: "资金计划额度占用释放V2"
apiId: "1764618933306392576"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inquire Plan Summary"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inquire Plan Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金计划额度占用释放V2

>  请求方式	POST | Inquire Plan Summary (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/energy/occupyOrReleaseV2
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
businessSerialNum	string	否	是	业务流水号，上游系统传入，作为数据唯一标识，不允许重复 示例：FF11441133
sourceSystem	string	否	是	来源系统，1、 BIP内部系统按应用服务编码传入 2、 BIP以外的系统按业务系统注册中的业务系统编码或名称传入 示例：0
accentity	string	否	是	资金组织编码 示例：G002
dept	string	否	否	部门编码，业务单据对应的部门编码；按部门控制时，必传 示例：1567925941000208391
businessDate	Date	否	是	业务日期，业务单据对应的业务日期 示例：2022-12-20
businessType	string	否	是	业务单据类型，1、 BIP内部系统按单据注册编码传入 2、 BIP以外的系统按业务系统注册中的业务单据类型名称或编码传入 示例：190
sourceBillCode	string	否	是	业务单据号，来源业务系统的单据编码 示例：TEST202301120001
businessDetailNum	string	否	是	业务单据明细，单据明细行编码，如果业务单据存在多行表体明细，需按照业务单据明细的粒度传送 示例：FFD230705000030
receiptType	string	否	是	收支类型，占用释放标识为true(占用)时，需要填2(支出) 示例：2
currency	string	否	是	币种 示例：CNY
amount	BigDecimal	否	是	占用/释放金额 示例：100
flag	boolean	否	是	占用释放标识，占用释放标志 1占用 0释放 示例：true
capitalDrawItemId	string	否	否	资金计划编制子表ID，计划项目编码，二者必传其一 示例：1514525547460821015
planProjectCode	string	否	否	计划项目编码，资金计划编制单子表行ID，二者必传其一 示例：G005
ourAcc	string	否	否	本方账号 示例：1231455
oppType	string	否	否	对方类型，枚举值：资金业务对象(1)、供应商(2)、 客户(3)、个人(4)、其他(9) 示例：1
OppFileCode	string	否	否	对方档案编码，对方类型为“供应商、客户、个人、资金业务对象”时必传 示例：51Q124141
oppAccName	string	否	否	对方名称 示例：资金业务对象账户-1
oppAcc	string	否	否	对方银行账号 示例：4
oppAccountName	string	否	否	对方账户名称 示例：资金业务对象账户-1
oppBankType	string	否	否	对方银行类别 示例：招商银行
oppOpenName	string	否	否	对方开户行名 示例：招商银行深圳分行

## 3. 请求示例

Url: /yonbip/ctm/energy/occupyOrReleaseV2?access_token=访问令牌
Body: [{
	"businessSerialNum": "FF11441133",
	"sourceSystem": "0",
	"accentity": "G002",
	"dept": "1567925941000208391",
	"businessDate": "2022-12-20",
	"businessType": "190",
	"sourceBillCode": "TEST202301120001",
	"businessDetailNum": "FFD230705000030",
	"receiptType": "2",
	"currency": "CNY",
	"amount": 100,
	"flag": true,
	"capitalDrawItemId": "1514525547460821015",
	"planProjectCode": "G005",
	"ourAcc": "1231455",
	"oppType": "1",
	"OppFileCode": "51Q124141",
	"oppAccName": "资金业务对象账户-1",
	"oppAcc": "4",
	"oppAccountName": "资金业务对象账户-1",
	"oppBankType": "招商银行",
	"oppOpenName": "招商银行深圳分行"
}]

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
code	string	否	状态码 示例："200"
message	string	否	状态信息 示例：操作成功
data	object	是	返回数据
businessSerialNum	string	否	传入的业务流水号 示例：F12314
accentity	string	否	传入的资金组织 示例：G002
dept	string	否	部门编码 示例：0001
fundPlanCode	string	否	资金计划编号，占用结果为“成功”时，返回计划编制单编号 示例：RE111
fundPlanName	string	否	资金计划名称，占用结果为“成功”时，返回计划编制单名称 示例：成功编制单
capitalDrawItemId	string	否	资金计划编制单子表ID，占用结果为“成功”时，返回已占用的计划项目信息 示例：192131841
planProjectSetCode	string	否	计划项目编码 示例：PP001
planProjectSetName	string	否	计划项目名称 示例：计划项目1
controlMethod	short	否	额度控制方式，该计划项目在计划策略中设置的额度控制方式 支出：枚举值，管控1、监控0 ；收入：空 示例：1
executeProportion	BigDecimal	否	最高执行比例，该计划项目在计划策略中设置的最高执行比例 示例：100
warningTipProportion	BigDecimal	否	预警提示比例，该计划项目在计划策略中设置的预警提示比例 示例：70
periodPlanAmt	BigDecimal	否	计划额度，该计划项目在资金计划中最新已生效的计划额度 示例：1000
executePlanAmt	BigDecimal	否	执行额度，该计划项目最新已被占用的额度 示例：700
unExecutePlanAmt	BigDecimal	否	未执行额度，计划额度-执行额度 示例：300
useProportion	BigDecimal	否	执行率，执行额度/计划额度 示例：70

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": [
		{
			"businessSerialNum": "F12314",
			"accentity": "G002",
			"dept": "0001",
			"fundPlanCode": "RE111",
			"fundPlanName": "成功编制单",
			"capitalDrawItemId": "192131841",
			"planProjectSetCode": "PP001",
			"planProjectSetName": "计划项目1",
			"controlMethod": 1,
			"executeProportion": 100,
			"warningTipProportion": 70,
			"periodPlanAmt": 1000,
			"executePlanAmt": 700,
			"unExecutePlanAmt": 300,
			"useProportion": 70
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
10000001	参数为空	
999	逻辑异常,附带错误信息	

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


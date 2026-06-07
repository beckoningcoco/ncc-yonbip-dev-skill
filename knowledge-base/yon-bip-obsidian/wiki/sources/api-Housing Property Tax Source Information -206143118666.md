---
title: "房产税源信息-设施明细-新增"
apiId: "2061431186667864072"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Property tax source information"
domain: "TAX"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 房产税源信息-设施明细-新增

>  请求方式	POST | Property tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/other-tax/api/house-account/v1/auxiliary/facility/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
orgCode	string	否	是	税务组织编码 示例：qz-sw
accountLyId	string	否	否	房源来源业务id（房源来源业务id和房产税源编号不可同时为空，且不能同时填写） 示例：56445646786789789456
code	string	否	否	房产税源编号（房源来源业务id和房产税源编号不可同时为空，且不能同时填写） 示例：FCSY2024080808000001
sourceId	string	否	是	设施来源业务id 示例：54545233
sourceCode	string	否	否	设施来源业务编号 示例：1234
auxiliaryFacilityDetailType	string	否	是	设施类型,枚举：1房屋附着物、3-房屋、4-税金调整 示例：3
auxiliaryFacilityDetailName	string	否	是	设施名称 示例：附属设施A
isInvolvedHouseVatDetail	string	否	否	涉及房产税，枚举值：1-是、0-否 示例：1
useDate	string	否	是	投入使用月份，格式为yyyy-MM 示例：2024-01
auxiliaryFacilityDetailValue	number
小数位数:2,最大长度:15	否	是	设施价值 示例：100
isAutoUpTaxAccount	string	否	否	自动生成/更新房产税台账（0-否 1-是） 示例：0 默认值：0
calcAlloLandValueByHouse	boolean	否	否	按照房屋计算应摊入土地价值 默认值：false
constructionArea	number
小数位数:2,最大长度:10	否	否	建筑面积
shouldAllocatedLandValue	number
小数位数:2,最大长度:10	否	否	应摊入土地价值

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/house-account/v1/auxiliary/facility/add?access_token=访问令牌
Body: [{
	"orgCode": "qz-sw",
	"accountLyId": "56445646786789789456",
	"code": "FCSY2024080808000001",
	"sourceId": "54545233",
	"sourceCode": "1234",
	"auxiliaryFacilityDetailType": "3",
	"auxiliaryFacilityDetailName": "附属设施A",
	"isInvolvedHouseVatDetail": "1",
	"useDate": "2024-01",
	"auxiliaryFacilityDetailValue": 100,
	"isAutoUpTaxAccount": "0",
	"calcAlloLandValueByHouse": true,
	"constructionArea": 0,
	"shouldAllocatedLandValue": 0
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
code	string	否	编码 示例：0000
message	string	否	消息 示例：操作成功
data	object	是	数据
id	string	否	设施税务云数据id 示例：1859123943677399040
sourceId	string	否	设施来源业务id 示例：202411190234
auxiliaryFacilityDetailCode	string	否	设施编号 示例：SS20241120100003

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功",
	"data": [
		{
			"id": "1859123943677399040",
			"sourceId": "202411190234",
			"auxiliaryFacilityDetailCode": "SS20241120100003"
		}
	]
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	操作失败	操作失败

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-17	
更新
请求说明
新增
请求参数 (5)
更新
请求参数 auxiliaryFacilityDetailType
删除
请求参数 plotRatio
房产税源支持按照房屋维护应摊入土地价值
	2	2025-07-03	
更新
请求参数 orgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


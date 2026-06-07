---
title: "货源策略保存"
apiId: "2048211277329727494"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Source Strategy"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Source Strategy]
platform_version: "BIP"
source_type: community-api-docs
---

# 货源策略保存

>  请求方式	POST | Supply Source Strategy (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/gdstrgyList/bill/apisave
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
data	object	否	是	数据分组标识
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	主表id，新增不需要填，修改时必须填，而且要填单据修改前的值，也就是填单据上次保存的id 示例：3906548140445952
orgId	string	否	否	组织id，和组织编码二选一必填 示例：1753605503279693830
orgCode	string	否	否	组织编码，和组织id二选一必填
code	string	否	否	方案编码，系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：HY20240722000002
name	string	否	是	方案名称 示例：测试方案
isMaterialClass	number
小数位数:0,最大长度:1	否	是	是否物料分类，必填，1或者0 示例：0
businessType	string	否	是	业务场景，必填，1采购订单，3委外申请下单 示例：1
materialId	string	否	否	物料id，当是否物料分类选否时，和物料编码二选一必填 示例：2013278538812096521
materialCode	string	否	否	物料编码，当是否物料分类选否时，和物料id二选一必填 示例：20240605
materialClassCode	string	否	否	物料分类编码，当是否物料分类选是时，和物料分类id二选一必填 示例：000004
materialClassId	string	否	否	物料分类id，当是否物料分类选是时，和物料分类编码二选一必填 示例：1856529584160243717
strategy	number
小数位数:0,最大长度:6	否	是	方案策略，必填，20最新价中最低价供应商，30有价供应商，50固定比例，60动态比例 示例：50
enable	string	否	是	启用状态，1启用，0停用 示例：1 默认值：1
memo	string	否	否	备注 示例：备注
strategyOrgs	object	是	是	适用组织子表信息
_status	string	否	是	状态，新增Insert，更新Update，删除Delete 示例：Insert
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳。新增不需要填，修改时必填，而且要填上次单据的时间戳

## 3. 请求示例

Url: /yonbip/cpu/gdstrgyList/bill/apisave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "3906548140445952",
		"orgId": "1753605503279693830",
		"orgCode": "",
		"code": "HY20240722000002",
		"name": "测试方案",
		"isMaterialClass": 0,
		"businessType": "1",
		"materialId": "2013278538812096521",
		"materialCode": "20240605",
		"materialClassCode": "000004",
		"materialClassId": "1856529584160243717",
		"strategy": 50,
		"enable": "1",
		"memo": "备注",
		"strategyOrgs": [
			{
				"orgId": "1753605503279693830",
				"id": "3906548140445953",
				"_status": "Insert",
				"pubts": "2026-06-07 13:06:45",
				"orgCode": "zb"
			}
		],
		"_status": "Insert",
		"pubts": "2026-06-07 13:06:45"
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
code	number
小数位数:0,最大长度:25	否	服务状态码 示例：200
message	string	否	服务调用状态说明 示例：操作成功
data	object	否	数据
enable	string	否	启用状态 示例：1
code	string	否	方案编码 示例：测试方案编码
name	string	否	方案名称 示例：测试方案名称
isMaterialClass	number
小数位数:0,最大长度:1	否	是否物料分类策略 示例：1
businessType	string	否	业务场景 示例：1
materialName	string	否	物料名称 示例：测试物料
id	number
小数位数:0,最大长度:25	否	主表id 示例：3906548140445952
materialId	string	否	物料id 示例：2013278538812096521
materialCode	string	否	物料编码 示例：20240605
orgId	string	否	组织id 示例：1753605503279693830
orgName	string	否	组织名称 示例：采购云
materialClassId	string	否	物料分类id 示例：1856529584160243717
materialClassName	string	否	物料分类名称 示例：TT-物料分类
materialClassCode	string	否	物料分类编码 示例：000004
memo	string	否	备注 示例：备注
strategyOrgs	object	否	适用组织信息数据
strategy	number
小数位数:0,最大长度:6	否	方案策略 示例：50

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"enable": "1",
		"code": "测试方案编码",
		"name": "测试方案名称",
		"isMaterialClass": 1,
		"businessType": "1",
		"materialName": "测试物料",
		"id": 3906548140445952,
		"materialId": "2013278538812096521",
		"materialCode": "20240605",
		"orgId": "1753605503279693830",
		"orgName": "采购云",
		"materialClassId": "1856529584160243717",
		"materialClassName": "TT-物料分类",
		"materialClassCode": "000004",
		"memo": "备注",
		"strategyOrgs": {
			"id": 3906548140445953,
			"orgId": "1753605503279693830",
			"orgName": "采购云",
			"orgCode": "yc"
		},
		"strategy": 50
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
999	message	按照提示处理

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


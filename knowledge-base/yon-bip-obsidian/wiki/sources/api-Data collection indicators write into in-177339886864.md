---
title: "数据采集指标写入指标得分等信息MDD"
apiId: "1773398868641710082"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Collection"
domain: "PFMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 数据采集指标写入指标得分等信息MDD

>  请求方式	POST | Data Collection (PFMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/pmcore/saveIndiScore
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
collectdata	object	是	是	数据集合
schemeid	string	否	否	方案id，与方案名称二选一必填 示例：013f1deff39843c98ef51084616a7cbe
schemename	string	否	否	方案名称，与方案id二选一必填 示例：2021考核方案
staffid	string	否	否	人员id，与人员code二选一必填 示例：2483827512381696
staffcode	string	否	否	人员code,与人员id二选一必填 示例：00001
orgid	string	否	否	组织部门id(组织考核对象对应orgid),组织方案下与组织部门code二选一必填必传，员工绩效时不可传值 示例：2483827512381696
orgcode	string	否	否	组织部门code(组织考核对象对应orgcode),组织方案下与组织部门id二选一必填，员工绩效时不可传值
indicatorid	string	否	是	指标id 示例：d4f3aa7068af478cb7b317737b562b3d
column	object	是	是	栏目

## 3. 请求示例

Url: /yonbip/hrcloud/pmcore/saveIndiScore?access_token=访问令牌
Body: {
	"collectdata": [
		{
			"schemeid": "013f1deff39843c98ef51084616a7cbe",
			"schemename": "2021考核方案",
			"staffid": "2483827512381696",
			"staffcode": "00001",
			"orgid": "2483827512381696",
			"orgcode": "",
			"indicatorid": "d4f3aa7068af478cb7b317737b562b3d",
			"column": [
				{
					"columncode": "006",
					"columnvalue": "006002",
					"columndatatype": 1
				}
			]
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	状态码；200：正确；999：业务错误 示例：200
message	string	否	业务信息 示例：操作成功!
displayCode	string	否	异常码 示例：123-001-665070

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功!",
	"displayCode": "123-001-665070"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	方案名称和方案id不能同时为空	核对方案数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-30	
新增
返回参数 displayCode
更新
返回参数 code
新增
错误码 999
删除
错误码 401
响应透传

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


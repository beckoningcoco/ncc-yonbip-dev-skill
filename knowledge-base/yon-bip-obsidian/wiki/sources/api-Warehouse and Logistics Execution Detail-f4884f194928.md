---
title: "仓储与物流执行明细数量汇报"
apiId: "f4884f1949284377805ee6b926957f40"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shipping Document Card"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shipping Document Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 仓储与物流执行明细数量汇报

>  请求方式	POST | Shipping Document Card (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/despatch/warehouseandtrans/detail/report
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
outSysFlag	string	否	是	外部系统标识，TMS为运输管理系统；WMS为仓储管理系统 示例：WMS
reports	object	是	是	数据汇报list
isDel	long	否	是	是否删除标识，0为新增，1为删除 示例：0
detailId	long	否	是	发运表体id 示例：2707504780251393
oResNum	long	否	是	作业完成结果数量, 指令单据为正数时，汇报结果时需要传正数。指令单据为负数时，汇报结果时需要传负数。示例：到货单 到货数量100个，汇报结果时传 100，到货单的到货数量-100个，汇报结果时需要传-100。
oResPack	long	否	是	作业完成结果件数, 指令单据为正数时，汇报结果时需要传正数。指令单据为负数时，汇报结果时需要传负数。示例：到货单 到货件数100件，汇报结果时传 100，到货单的到货件数-100件，汇报结果时需要传-100。
rejectionNum	long	否	否	拒收数量，发运上游为采购到货，发运相关性依赖仓储，则拒收数量可传 示例：1
replenishRejNum	long	否	否	原单补货数量，发运上游为采购到货，发运相关性依赖仓储，则原单补货数量可传 示例：0
oStatus	long	否	否	作业完成结果状态，1为部分完成；2为全部完成；若本次汇报全为新增，且汇报对应的发运子表行数据存在完结状态(全部完成)，则作业完成结果状态必传为2 示例：1
oEndDate	string	否	是	作业完成日期 示例：2022-03-25
remark	string	否	否	备注 示例：test
outSysId	string	否	否	外部系统主表id 示例：13
outSysCode	string	否	否	外部系统主表代码 示例：123
outSysLineid	string	否	是	外部系统子表id 示例：11
batchno	string	否	否	批次号,若汇报发运表体行id对应的物料开启批次管理，则批次号必填，反之必不填；
define1	string	否	否	批次自定义项1(最多支持30项，仅在开启批次管理时使用)
define2	string	否	否	批次自定义项2
producedate	string	否	否	生产日期,若汇报发运表体行id对应的物料开启效期管理，则生产日期必填，反之必不填；
invaliddate	string	否	否	有效期至,若汇报发运表体行id对应的物料开启效期管理，则有效期至必填，反之必不填；
stockStatus	long	否	否	库存状态id，从库存状态档案中查询获取 示例：2346257360557177

## 3. 请求示例

Url: /yonbip/scm/despatch/warehouseandtrans/detail/report?access_token=访问令牌
Body: {
	"outSysFlag": "WMS",
	"reports": [
		{
			"isDel": 0,
			"detailId": 2707504780251393,
			"oResNum": 0,
			"oResPack": 0,
			"rejectionNum": 1,
			"replenishRejNum": 0,
			"oStatus": 1,
			"oEndDate": "2022-03-25",
			"remark": "test",
			"outSysId": "13",
			"outSysCode": "123",
			"outSysLineid": "11",
			"batchno": "",
			"define1": "",
			"define2": "",
			"producedate": "",
			"invaliddate": "",
			"stockStatus": 2346257360557177
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
code	string	否	响应码 示例：200
message	string	否	响应信息描述 示例：操作成功
data	string	否	响应数据 示例：success

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "success"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	外部系统子表id存在唯一性校验，请检查	外部系统子表id不可重复传递，若该条数据传输有误，先执行删除再执行新增

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


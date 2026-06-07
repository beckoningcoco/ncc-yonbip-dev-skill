---
title: "智能收单获取不干胶信息"
apiId: "1573280090172686342"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intelligent Receipt Collection"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intelligent Receipt Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能收单获取不干胶信息

>  请求方式	POST | Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/appDevice/v1/print/stickers
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
deviceCode	string	否	是	设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou
manufacturer	string	否	是	终端所属厂商标识：由用友分发标识符 示例：yonyou
receiptBatchNo	string	否	是	归档批次号：来源于开箱取件返回的归档批次号参数 示例：YongBIP00001-A02-20221102041130

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/print/stickers?access_token=访问令牌
Body: {
	"deviceCode": "yonyou",
	"manufacturer": "yonyou",
	"receiptBatchNo": "YongBIP00001-A02-20221102041130"
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
code	long	否	成功为200,错误提示为其他值 示例：200
message	string	否	成功提示或错误提示 示例：成功
data	object	否	返回信息对象
receiptDate	string	否	取件日期 示例：2022-10-21
qtCodeData	string	否	二维码信息 示例：归档批次号: YongBIP00001-A02-20225202015210\n 单据组织：用友网络科技股份有限公司\n 取件日期：2022-10-13\n 收单分数: 50
billCreatorOrgName	object	是	单据组织:本批次单据组织名称数组 示例：[ "jinMDD5回归事业部", "jinMDD5回归", "jincase事业部" ]
receiptBatchNo	string	否	归档批次号：开箱取件接口返回本次归档批次号 示例：YongBIP00001-A02-20225202015210
receiptCount	Number	否	收单份数:本批次单据总数量 示例：40
barCodeData	string	否	条形码信息 示例：YongBIP00001-A02-20225202015210

## 5. 正确返回示例

{
	"code": 200,
	"message": "成功",
	"data": {
		"receiptDate": "2022-10-21",
		"qtCodeData": "归档批次号: YongBIP00001-A02-20225202015210\\n 单据组织：用友网络科技股份有限公司\\n 取件日期：2022-10-13\\n 收单分数: 50",
		"billCreatorOrgName": [
			"jinMDD5回归事业部",
			"jinMDD5回归",
			"jincase事业部"
		],
		"receiptBatchNo": "YongBIP00001-A02-20225202015210",
		"receiptCount": 40,
		"barCodeData": "YongBIP00001-A02-20225202015210"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
10230604000045	空开箱	检查输入批次号与机器号
10230604000046	批次号格式错误	检查输入批次号格式

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


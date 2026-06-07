---
title: "智能收单附件下载"
apiId: "2044459863941578760"
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

# 智能收单附件下载

>  请求方式	POST | Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/appDevice/v1/downlaod/file
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
deviceCode	string	否	是	设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001
manufacturer	string	否	是	终端所属厂商标识：由用友分发标识符 示例：yonyou
fileIds	object	是	是	文件id集合：上传图片时获取的文件id 示例：["636920d7fc6f763bfe94ad5d","63998eaa1bf6eb157a428682", "63ea086f70429d45e8897fee"]

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/downlaod/file?access_token=访问令牌
Body: {
	"deviceCode": "yonyou00001",
	"manufacturer": "yonyou",
	"fileIds": [
		"636920d7fc6f763bfe94ad5d",
		"63998eaa1bf6eb157a428682",
		"63ea086f70429d45e8897fee"
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
code	string	否	成功为200，错误提示为其他值 示例：200
message	string	否	成功提示或错误提示 示例：操作成功
data	object	是	返回数据
fileId	string	否	文件id：请求时文件id 示例：63998eaa1bf6eb157a428682
downloadUrl	string	否	文件下载地址：该地址有效时长为5分钟 示例：https://apcom-file-pub-npro.obs.cn-north-4.myhuaweicloud.com/iuap-apcom-file/0/2022121416/a334fc91-e0a7-42ca-a820-48e657c510a2.png

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"fileId": "63998eaa1bf6eb157a428682",
			"downloadUrl": "https://apcom-file-pub-npro.obs.cn-north-4.myhuaweicloud.com/iuap-apcom-file/0/2022121416/a334fc91-e0a7-42ca-a820-48e657c510a2.png"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
10230604000055	文件id不能为空	请求时文件id参数为空

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


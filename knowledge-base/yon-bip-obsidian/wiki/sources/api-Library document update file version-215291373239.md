---
title: "文库文档更新文件版本"
apiId: "2152913732390879238"
apiPath: "请求方式	POST"
method: "ContentType	multipart/form-data"
category: "Library"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Library]
platform_version: "BIP"
source_type: community-api-docs
---

# 文库文档更新文件版本

>  请求方式	POST | Library (OA)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/uspace/rest/openapi/file/uploadNewVersion
请求方式	POST
ContentType	multipart/form-data
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
fid	string	query	是	文库文件id
userId	string	query	是	用户id
tenantId	string	query	是	租户id
Body参数
名称	类型	数组	必填	描述
file	file	否	否	新版本文件

## 3. 请求示例

Url: /yonbip/uspace/rest/openapi/file/uploadNewVersion?access_token=访问令牌&fid=&userId=&tenantId=

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
code	string	否	code
data	object	否	data
fid	string	否	文件fid 示例：2505324148353662982
fileName	string	否	文件名称 示例：瑞京公司2024年6月份安全环保综合检查通报12345（普通商密）.docx
fileUrl	string	否	文件地址 示例：https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/perm/0000L6YQ8AVLFUZPXD0000/20260330/16/088405b3-5ac2-40b3-9875-5f395de5d6a1.docx?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1774868958&v=1774858158303&Signature=44ZLEz2z%2FhUVe3iepi3CR0w3mFo%3D
fileSize	string	否	文件大小 示例：162291
fileExt	string	否	文件后缀 示例：docx
versionId	number
小数位数:0,最大长度:19	否	文件版本id 示例：2505324500540981249
parentPath	string	否	文件路径
bid	string	否	目录id 示例：0

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"fid": "2505324148353662982",
		"fileName": "瑞京公司2024年6月份安全环保综合检查通报12345（普通商密）.docx",
		"fileUrl": "https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/perm/0000L6YQ8AVLFUZPXD0000/20260330/16/088405b3-5ac2-40b3-9875-5f395de5d6a1.docx?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1774868958&v=1774858158303&Signature=44ZLEz2z%2FhUVe3iepi3CR0w3mFo%3D",
		"fileSize": "162291",
		"fileExt": "docx",
		"versionId": 2505324500540981249,
		"parentPath": "",
		"bid": "0"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-07	
更新
请求说明
新增
返回参数 (10)
删除
返回参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


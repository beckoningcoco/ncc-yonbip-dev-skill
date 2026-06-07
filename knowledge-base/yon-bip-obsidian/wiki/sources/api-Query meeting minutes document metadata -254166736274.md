---
title: "查询会议纪要文档元数据/下载地址"
apiId: "2541667362740895750"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Meeting Management"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Meeting Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询会议纪要文档元数据/下载地址

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/meeting/summary/get
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
meetingId	string	query	是	会议ID    示例: meeting-001

## 3. 请求示例

Url: /yonbip/SCCC/meeting/summary/get?access_token=访问令牌&meetingId=meeting-001

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
code	int	否	返回码，调用成功时返回0 示例：0
data	object	否	调用成功时的返回数据
id	string	否	会议纪要ID
creator	string	否	创建人
createTime	string	否	创建时间
modifier	string	否	更新人
modifyTime	string	否	更新时间
pubts	string	否	时间戳
dr	int	否	删除标识，0代表未删除，1代表已删除
ytenantid	string	否	友户通租户ID
commonTenantId	string	否	租户ID
meetingId	string	否	会议ID
isPresetTemplate	int	否	是否使用预置模板
source	int	否	会议纪要来源，1-友闪记，2-视频会议
isAllPerson	int	否	是否全部人员可编辑
fileId	string	否	文件ID
fileUrl	string	否	文件地址
fileSize	long	否	文件大小
fileName	string	否	文件名称
fileExtension	string	否	文件扩展名
commonUserIds	string	是	可编辑会议纪要的人员ID列表
downloadUrl	string	否	下载地址
previewUrl	string	否	预览地址
editUrl	string	否	编辑地址
userName	string	否	创建人姓名
jurisdiction	int	否	是否有权限编辑会议纪要，1-有权限，0-无权限
isOwner	boolean	否	是否是会议预定人
editSummaryPersons	object	是	可编辑会议纪要的人员

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"id": "",
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"pubts": "",
		"dr": 0,
		"ytenantid": "",
		"commonTenantId": "",
		"meetingId": "",
		"isPresetTemplate": 0,
		"source": 0,
		"isAllPerson": 0,
		"fileId": "",
		"fileUrl": "",
		"fileSize": 0,
		"fileName": "",
		"fileExtension": "",
		"commonUserIds": [
			""
		],
		"downloadUrl": "",
		"previewUrl": "",
		"editUrl": "",
		"userName": "",
		"jurisdiction": 0,
		"isOwner": true,
		"editSummaryPersons": [
			{
				"commonUserId": "",
				"userName": ""
			}
		]
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


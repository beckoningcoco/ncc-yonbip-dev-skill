---
title: "根据表单模型id和实例id查询表单数据"
apiId: "56b8b10fe7fe4b97b99ec23c225a8295"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Approval"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Approval]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据表单模型id和实例id查询表单数据

>  请求方式	POST | Approval (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openapi/iform/queryFormData
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
pkBo	string	否	是	表单模型id 示例：5d6e2bf3470f4590a37bd5d3bb300548
pkBoins	string	否	是	表单实例id 示例：8fb20b05ef74400f875af86e808a8943
appSource	string	否	否	新老租户区分（老租户传null,新租户传"approve"或不传）

## 3. 请求示例

Url: /yonbip/uspace/openapi/iform/queryFormData?access_token=访问令牌
Body: {
	"pkBo": "5d6e2bf3470f4590a37bd5d3bb300548",
	"pkBoins": "8fb20b05ef74400f875af86e808a8943",
	"appSource": ""
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
code	long	否	返回接口状态码，200成功，其它异常 示例：200
message	string	否	返回接口信息描述
data	object	否	返回数据对象
gzfj_1640227415332820	string	否	对应表单控件模型columncode 示例：{"contract":{"contractPreviewUrl":"https://bip-daily.yyuap.com/iuap-apcom-contract/esign-web/preview?previewId=4028c5707dea6bba017dfa93ef2a113e","processId":"4028c5707dea6bba017dfa93ef241137"},"files":[{"author":"李雄丰","authorDept":"","authorDeptId":"2026315703718144","fid":"","fileKey":"1ceb1449664e47b78416138d5df0d851","filename":"交易控股友报账.pdf","filesize":231076,"name":"交易控股友报账.pdf","signType":"0","size":231076,"src":"","type":"application/pdf","url":"https://bip-daily.yyuap.com/yonbip-ec-iform/iform_ctr/contract/file/downLoadSignFile/1ceb1449664e47b78416138d5df0d851","userId":"d2769a9a-e1e5-4775-b1da-907e666b46b3"},{"author":"李雄丰","authorDept":"","authorDeptId":"2026315703718144","fid":"","fileKey":"5e9b649f5cfb4ff7a8912d8a1952be74","filename":"download.pdf","filesize":211336,"name":"download.pdf","signType":"1","size":211336,"src":"","type":"application/pdf","url":"https://bip-daily.yyuap.com/yonbip-ec-iform/iform_ctr/contract/file/downLoadSignFile/5e9b649f5cfb4ff7a8912d8a1952be74","userId":"d2769a9a-e1e5-4775-b1da-907e666b46b3"}]}
modifyuser	string	否	修改用户id 示例：fc35ced2-ae0e-48e0-9367-65bbccfb1edc
createuser	string	否	创建用户id 示例：d2769a9a-e1e5-4775-b1da-907e666b46b3
version	long	否	数据提交模型版本号 示例：13
pk_boins	string	否	表单数据实例id 示例：8fb20b05ef74400f875af86e808a8943
dr	long	否	是否删除0未删除，null是删除 示例：0
gzr_1640227415329209	string	否	对应表单控件模型columncode 示例：[{"userId":"fc35ced2-ae0e-48e0-9367-65bbccfb1edc","userName":"杨鹏","type":0,"companyId":"","sourceId":"","sourceType":"","companyName":"","mainstayType":""},{"userId":"06220443-fd62-4614-9ab4-dbad762000e6","userName":"林洁丹","type":0,"companyId":"","sourceId":"","sourceType":"","companyName":"","mainstayType":""}]
ytenant_id	string	否	租户信息 示例：ddok9sw4
pk_procdef	string	否	流程定义 示例：iform_6aa7c8a948:14:8c7c808f-6563-11ec-9fab-6a5f8516f4d8
modifydate	string	否	修改日期 示例：2021-12-25 17:35:40
pk_procdefins	string	否	流程定义key 示例：b5c8f17a-6565-11ec-9fab-6a5f8516f4d8
pk_temp	string	否	模型版本id 示例：9990d6aa0323424aadacc3f2017e26b0
sysversion	long	否	系统版本号 示例：0
fj_1640260765860504	string	否	对应表单控件模型columncode
startdept	string	否	发起部门id 示例：2026315703718144
startorg	string	否	发起组织id 示例：2019609293689088
status	string	否	流程状态(run运行中，end结束，tempSave草稿态) 示例：run
ts	string	否	创建时间 示例：2021-12-25 17:33:25
htmc_1640246578745462	string	否	对应表单控件字段值 示例：控股合同签署2

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"gzfj_1640227415332820": "{\"contract\":{\"contractPreviewUrl\":\"https://bip-daily.yyuap.com/iuap-apcom-contract/esign-web/preview?previewId=4028c5707dea6bba017dfa93ef2a113e\",\"processId\":\"4028c5707dea6bba017dfa93ef241137\"},\"files\":[{\"author\":\"李雄丰\",\"authorDept\":\"\",\"authorDeptId\":\"2026315703718144\",\"fid\":\"\",\"fileKey\":\"1ceb1449664e47b78416138d5df0d851\",\"filename\":\"交易控股友报账.pdf\",\"filesize\":231076,\"name\":\"交易控股友报账.pdf\",\"signType\":\"0\",\"size\":231076,\"src\":\"\",\"type\":\"application/pdf\",\"url\":\"https://bip-daily.yyuap.com/yonbip-ec-iform/iform_ctr/contract/file/downLoadSignFile/1ceb1449664e47b78416138d5df0d851\",\"userId\":\"d2769a9a-e1e5-4775-b1da-907e666b46b3\"},{\"author\":\"李雄丰\",\"authorDept\":\"\",\"authorDeptId\":\"2026315703718144\",\"fid\":\"\",\"fileKey\":\"5e9b649f5cfb4ff7a8912d8a1952be74\",\"filename\":\"download.pdf\",\"filesize\":211336,\"name\":\"download.pdf\",\"signType\":\"1\",\"size\":211336,\"src\":\"\",\"type\":\"application/pdf\",\"url\":\"https://bip-daily.yyuap.com/yonbip-ec-iform/iform_ctr/contract/file/downLoadSignFile/5e9b649f5cfb4ff7a8912d8a1952be74\",\"userId\":\"d2769a9a-e1e5-4775-b1da-907e666b46b3\"}]}",
		"modifyuser": "fc35ced2-ae0e-48e0-9367-65bbccfb1edc",
		"createuser": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
		"version": 13,
		"pk_boins": "8fb20b05ef74400f875af86e808a8943",
		"dr": 0,
		"gzr_1640227415329209": "[{\"userId\":\"fc35ced2-ae0e-48e0-9367-65bbccfb1edc\",\"userName\":\"杨鹏\",\"type\":0,\"companyId\":\"\",\"sourceId\":\"\",\"sourceType\":\"\",\"companyName\":\"\",\"mainstayType\":\"\"},{\"userId\":\"06220443-fd62-4614-9ab4-dbad762000e6\",\"userName\":\"林洁丹\",\"type\":0,\"companyId\":\"\",\"sourceId\":\"\",\"sourceType\":\"\",\"companyName\":\"\",\"mainstayType\":\"\"}]",
		"ytenant_id": "ddok9sw4",
		"pk_procdef": "iform_6aa7c8a948:14:8c7c808f-6563-11ec-9fab-6a5f8516f4d8",
		"modifydate": "2021-12-25 17:35:40",
		"pk_procdefins": "b5c8f17a-6565-11ec-9fab-6a5f8516f4d8",
		"pk_temp": "9990d6aa0323424aadacc3f2017e26b0",
		"sysversion": 0,
		"fj_1640260765860504": "",
		"startdept": "2026315703718144",
		"startorg": "2019609293689088",
		"status": "run",
		"ts": "2021-12-25 17:33:25",
		"htmc_1640246578745462": "控股合同签署2"
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
310036	非法token(token无效)	重新获取正确token

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


---
title: "电子文件-增值税发票-新增"
apiId: "2350988841646555145"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Archive Accession"
domain: "EAF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Archive Accession]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子文件-增值税发票-新增

>  请求方式	POST | Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/v1/api/invoice/batchInsert
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
orgCode	string	query	是	全宗编码
Body参数
名称	类型	数组	必填	描述
invoiceElectronics	object	是	是	电子发票列表 最大请求量：10
fpdm	string	否	否	发票代码 示例：012345678901
fphm	string	否	否	发票号码 示例：12345678
invoiceNature	string	否	否	发票性质: input-进项发票, output-销项发票 示例：input
fplx	string	否	否	发票类型: 1-增值税电子普通发票; 2-增值税电子专用发票; 3-增值税普通发票; 4-增值税专用发票; 5-机动车销售统一发票; 6-货物运输业增值税专用发票; 8-增值税电子普通发票（成品油）; 9-成品油普通发票(卷式); 10-成品油普通发票; 11-成品油专用发票; 12-增值税普通发票(卷式); 14-通行费发票; 15-二手车销售统一发票; 31-数电票(增值税专用发票); 32-数电票(普通发票); 33-数电纸质发票(增值税专用发票); 34-数电纸质发票(普通发票); 35-数电票( 示例：1
jshj	number
小数位数:0,最大长度:15	否	否	价税合计 示例：113.00
hjje	number
小数位数:0,最大长度:15	否	否	合计金额 示例：100.00
hjse	number
小数位数:0,最大长度:15	否	否	合计税额 示例：13.00
kprq	string	否	否	开票日期，YYYY-MM-DD 示例：2023-12-01
gmfMc	string	否	否	购买方名称 示例：某某公司
gmfNsrsbh	string	否	否	购买方纳税人识别号 示例：912345678901234567
xsfMc	string	否	否	销售方名称 示例：某某销售公司
xsfNsrsbh	string	否	否	销售方纳税人识别号 示例：919876543210987654
kplx	string	否	否	开票类型: 0-蓝字发票; 1-红字发票 示例：0
fpjz	string	否	否	开票介质: 0-电子发票; 1-纸质发票 示例：0
jym	string	否	否	发票校验码 示例：123456
kpr	string	否	否	开票人 示例：张三
skr	string	否	否	收款人 示例：李四
fhr	string	否	否	复核人 示例：王五
bz	string	否	否	备注 示例：备注信息
userId	string	否	否	提交人ID 示例：user001
userName	string	否	否	提交人姓名 示例：提交人姓名
srcFileName	string	否	是	上传的原始文件名 示例：invoice.pdf
filePath	string	否	是	文件路径 示例：/path/to/invoice.pdf
srcType	number
小数位数:0,最大长度:1	否	否	来源类型: 0-手工采集, 1-接口采集 示例：0
checkRealStatus	number
小数位数:0,最大长度:4	否	否	验真状态: 1-已验真, 2-未验真 示例：1
fpmw	string	否	否	发票密文 示例：密文信息
zfbz	string	否	否	作废标志N 否 Y 是 示例：N
zfrq	date
格式:yyyy-MM-dd	否	否	作废日期 示例：2023-12-01
gmfDzdh	string	否	否	购买方地址、电话 示例：北京市朝阳区 某某街道 电话:13800000000
gmfYhzh	string	否	否	购买方银行账号 示例：1234567890123456
jqbh	string	否	否	税控设备编号 示例：税控设备编号
xsfDzdh	string	否	否	销售方地址、电话 示例：北京市海淀区 某某街道 电话:13900000000
xsfYhzh	string	否	否	销售方银行账号 示例：0987654321098765
yfpDm	string	否	否	原发票代码（红字发票必须） 示例：012345678902
yfpHm	string	否	否	原发票号码（红字发票必须） 示例：12345679
swjgDm	string	否	否	主管税务机关代码(机动车用) 示例：税务机关代码
swjgMc	string	否	否	主管税务机关名称(机动车用) 示例：某某税务局
wsPzh	string	否	否	完税凭证号(机动车用) 示例：完税凭证号
sgbz	string	否	否	农产品收购标志: 2=农产品收购 示例：2
txfbz	string	否	否	通行费标志: 06-可抵扣通行费; 07-不可抵扣同行费 示例：06
lslbz	string	否	否	通行费-零税率标志: 空-非零税率; 1-免税; 2-不征收; 3-零税率 示例：1
fpmxx	string	否	否	发票明细项 示例：明细项
verifyStatus	number
小数位数:0,最大长度:1	否	否	0-为查验 1-已查验 示例：1
hasattache	boolean	否	否	是否有专员 示例：true
purchaserstatus	string	否	否	采购状态 示例：0
hasExist	boolean	否	否	是否存在 示例：true
needVerify	string	否	否	是否需要验证 示例：Y
fileSize	number
小数位数:0,最大长度:20	否	否	文件大小 示例：102400
srcSys	string	否	否	来源系统 示例：ERP系统
pidSrcSys	string	否	否	发票上游来源系统 示例：上游系统
srcId	string	否	否	来源单据ID 示例：来源单据ID
accountYear	string	否	否	会计年 示例：2023
accountMonth	string	否	否	会计月 示例：12
guid	string	否	否	与凭证下的附件进行关联 示例：guid
srcFileName2	string	否	否	第二原始文件名 示例：invoice2.pdf
srcFileName3	string	否	否	第三原始文件名 示例：invoice3.pdf
filePath2	string	否	否	第二文件路径 示例：/path/to/invoice2.pdf
filePath3	string	否	否	第三文件路径 示例：/path/to/invoice3.pdf
fileSize2	number
小数位数:0,最大长度:20	否	否	第二文件大小 示例：51200
fileSize3	number
小数位数:0,最大长度:20	否	否	第三文件大小 示例：25600
pages	number
小数位数:0,最大长度:10	否	否	页数 示例：3
checkRealOperator	string	否	否	验真人 示例：验真人姓名
checkRealDate	date
格式:yyyy-MM-dd	否	否	验真日期 示例：2023-12-01
realFileSize	number
小数位数:0,最大长度:20	否	否	文件真实大小 示例：102400
fileType	string	否	否	文件类型 示例：pdf
items	object	是	否	发票详情 最大请求量：10

## 3. 请求示例

Url: /yonbip/FCC/v1/api/invoice/batchInsert?access_token=访问令牌&orgCode=
Body: {
	"invoiceElectronics": [
		{
			"fpdm": "012345678901",
			"fphm": "12345678",
			"invoiceNature": "input",
			"fplx": "1",
			"jshj": 113,
			"hjje": 100,
			"hjse": 13,
			"kprq": "2023-12-01",
			"gmfMc": "某某公司",
			"gmfNsrsbh": "912345678901234567",
			"xsfMc": "某某销售公司",
			"xsfNsrsbh": "919876543210987654",
			"kplx": "0",
			"fpjz": "0",
			"jym": "123456",
			"kpr": "张三",
			"skr": "李四",
			"fhr": "王五",
			"bz": "备注信息",
			"userId": "user001",
			"userName": "提交人姓名",
			"srcFileName": "invoice.pdf",
			"filePath": "/path/to/invoice.pdf",
			"srcType": 0,
			"checkRealStatus": 1,
			"fpmw": "密文信息",
			"zfbz": "N",
			"zfrq": "2023-12-01",
			"gmfDzdh": "北京市朝阳区 某某街道 电话:13800000000",
			"gmfYhzh": "1234567890123456",
			"jqbh": "税控设备编号",
			"xsfDzdh": "北京市海淀区 某某街道 电话:13900000000",
			"xsfYhzh": "0987654321098765",
			"yfpDm": "012345678902",
			"yfpHm": "12345679",
			"swjgDm": "税务机关代码",
			"swjgMc": "某某税务局",
			"wsPzh": "完税凭证号",
			"sgbz": "2",
			"txfbz": "06",
			"lslbz": "1",
			"fpmxx": "明细项",
			"verifyStatus": 1,
			"hasattache": true,
			"purchaserstatus": "0",
			"hasExist": true,
			"needVerify": "Y",
			"fileSize": 102400,
			"srcSys": "ERP系统",
			"pidSrcSys": "上游系统",
			"srcId": "来源单据ID",
			"accountYear": "2023",
			"accountMonth": "12",
			"guid": "guid",
			"srcFileName2": "invoice2.pdf",
			"srcFileName3": "invoice3.pdf",
			"filePath2": "/path/to/invoice2.pdf",
			"filePath3": "/path/to/invoice3.pdf",
			"fileSize2": 51200,
			"fileSize3": 25600,
			"pages": 3,
			"checkRealOperator": "验真人姓名",
			"checkRealDate": "2023-12-01",
			"realFileSize": 102400,
			"fileType": "pdf",
			"items": [
				{
					"fpdm": "",
					"fphm": "",
					"fphxz": "",
					"xmmc": "",
					"dw": "",
					"ggxh": "",
					"xmsl": 0,
					"xmdj": 0,
					"xmje": 0,
					"se": 0,
					"sl": 0,
					"kce": 0,
					"spbm": "",
					"txfCph": "",
					"txfLx": "",
					"txfTxrqq": "",
					"txfTxrqz": "",
					"zzstsgl": ""
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
code	string	否	状态码 示例：0000
message	string	否	提示信息 示例：描述信息
data	object	否	响应实体

## 5. 正确返回示例

{
	"code": "0000",
	"message": "描述信息",
	"data": {}
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
	1	2025-12-17	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


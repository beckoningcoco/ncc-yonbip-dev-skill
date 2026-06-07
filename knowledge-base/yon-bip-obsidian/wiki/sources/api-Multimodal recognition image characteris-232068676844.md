---
title: "多模态识别图片特征"
apiId: "2320686768446242824"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "YonKnow"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, YonKnow]
platform_version: "BIP"
source_type: community-api-docs
---

# 多模态识别图片特征

>  请求方式	POST | YonKnow (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CPC/intellis/open/multimodal/picture
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
chatType	number
小数位数:2,最大长度:10	否	否	大模型厂商类别 示例：12
model	string	否	否	具体模型 示例：qwen2.5-vl-7b-instruct
promptContent	string	否	否	自定义提示词
fileUrl	string	否	是	公网可以访问的图片URL 示例：https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/0000L7T4IPFB9V865G0000/2025072421/ea02f196-c468-485a-b696-4dcc57fc442c.jpg?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1753362790&Signature=ufHf0TFgk0XJq%2BkKXyKzM3CFENw%3D
materialType	string	否	是	物料分类 示例：水果分类
materialFeatureList	string	是	否	物料特征 示例：["颜色","水果种类","大小","甜度"]

## 3. 请求示例

Url: /yonbip/CPC/intellis/open/multimodal/picture?access_token=访问令牌
Body: {
	"chatType": 12,
	"model": "qwen2.5-vl-7b-instruct",
	"promptContent": "",
	"fileUrl": "https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/0000L7T4IPFB9V865G0000/2025072421/ea02f196-c468-485a-b696-4dcc57fc442c.jpg?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1753362790&Signature=ufHf0TFgk0XJq%2BkKXyKzM3CFENw%3D",
	"materialType": "水果分类",
	"materialFeatureList": [
		"颜色",
		"水果种类",
		"大小",
		"甜度"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
status	number
小数位数:0,最大长度:10	否	status 示例：1
data	object	否	data
fileId	string	否	fileId
fileUrl	string	否	fileUrl 示例：https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/0000L7T4IPFB9V865G0000/2025072421/ea02f196-c468-485a-b696-4dcc57fc442c.jpg?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1753362790&Signature=ufHf0TFgk0XJq%2BkKXyKzM3CFENw%3D
promptContent	string	否	promptContent 示例：####专业资质 1、具备丰富的图像识别与商品特征提取经验 2、精通图像处理算法与商品特征数据库构建 3、曾为多家知名水果分类生产企业、厂商提供特征提取服务 ###任务拆解 1.图像预处理:对上传的图片进行去噪、增强等操作，提高图像质量。 2.特征识别:识别水果分类的颜色,水果种类,大小,甜度等特征。 3.数据整理:将识别到的特征进行整理和记录。 ###约束条件 1.特征提取的准确率需达到95%以上。 2.不得对图片进行篡改或损坏。 ###输出规范 1.以文本形式输出，详细描述水果分类的各项特征， 2.对于可量化的物料特征，需给出具体数值或描述。 3.对于无法明确的特征，需注明“未明确”。
multimodalContent	string	否	多模态解析内容 示例：### 图像预处理 对上传的图片进行了去噪和增强操作，确保图像质量清晰，以便于后续的特征识别。图像中水果的颜色、形状和纹理等细节均得到了良好的保留。 ### 特征识别 #### 1. 颜色特征 - **草莓**：鲜红色，表面有白色小点。 - **苹果**：绿色，表面光滑。 - **柠檬**：黄色，表面有细小的凹凸不平。 - **西瓜**：外皮为深绿色和浅绿色相间的条纹，内部果肉为红色。 - **蓝莓**：深蓝色，表面有一层白霜。 - **梨**：绿色，表面光滑。 #### 2. 水果种类 - **草莓**：多颗，表面有白色小点。 - **苹果**：多颗，绿色。 - **柠檬**：多颗，黄色。 - **西瓜**：一颗，外皮为深绿色和浅绿色相间的条纹。 - **蓝莓**：多颗，深蓝色。 - **梨**：一颗，绿色。 #### 3. 大小特征 - **草莓**：较小，直径约2-3厘米。 - **苹果**：中等大小，直径约6-8厘米。 - **柠檬**：中等大小，直径约5-7厘米。 - **西瓜**：较大，直径约20-30厘米。 - **蓝莓**：较小，直径约1厘米。 - **梨**：中等大小，直径约6-8厘米。 #### 4. 甜度特征 - **草莓**：甜度较高，具体数值未明确。 - **苹果**：甜度适中，具体数值未明确。 - **柠檬**：酸味较重，甜度较低，具体数值未明确。 - **西瓜**：甜度较高，具体数值未明确。 - **蓝莓**：甜度适中，具体数值未明确。 - **梨**：甜度适中，具体数值未明确。 ### 数据整理 将识别到的特征进行整理和记录如下： | 水果种类 | 颜色 | 大小（直径） | 甜度 | |----------|------------|--------------|----------| | 草莓 | 鲜红色 | 2-3厘米 | 较高 | | 苹果 | 绿色 | 6-8厘米 | 适中 | | 柠檬 | 黄色 | 5-7厘米 | 较低 | | 西瓜 | 深绿/浅绿 | 20-30厘米 | 较高 | | 蓝莓 | 深蓝色 | 1厘米 | 适中 | | 梨 | 绿色 | 6-8厘米 | 适中 | ### 输出规范 以上信息以文本形式输出，详细描述了水果分类的各项特征。对于可量化的物料特征，给出了具体数值或描述；对于无法明确的特征，注明了“未明确”。
materialType	string	否	物料分类 示例：水果分类
materialFeatureList	string	是	物料特征 示例：["颜色","水果种类","大小","甜度"]
chatType	number
小数位数:0,最大长度:10	否	chatType 示例：12
model	string	否	model 示例：qwen2.5-vl-72b-instruct
multimodalErrorMessage	string	否	多模型解析异常信息
msg	string	否	msg 示例：执行成功
ext	string	否	ext
errorCode	string	否	errorCode
message	string	否	message
traceId	string	否	traceId
displayCode	string	否	displayCode
level	number
小数位数:0,最大长度:10	否	level 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": 1,
		"data": {
			"fileId": "",
			"fileUrl": "https://bip-test-self.obs.cn-north-4.myhuaweicloud.com:443/iuap-apcom-file-private/iuap-apcom-file/0000L7T4IPFB9V865G0000/2025072421/ea02f196-c468-485a-b696-4dcc57fc442c.jpg?AccessKeyId=I3YZKIJBIK6MNPXFHVOI&Expires=1753362790&Signature=ufHf0TFgk0XJq%2BkKXyKzM3CFENw%3D",
			"promptContent": "####专业资质\n1、具备丰富的图像识别与商品特征提取经验\n2、精通图像处理算法与商品特征数据库构建\n3、曾为多家知名水果分类生产企业、厂商提供特征提取服务\n###任务拆解\n1.图像预处理:对上传的图片进行去噪、增强等操作，提高图像质量。\n2.特征识别:识别水果分类的颜色,水果种类,大小,甜度等特征。\n3.数据整理:将识别到的特征进行整理和记录。\n###约束条件\n1.特征提取的准确率需达到95%以上。\n2.不得对图片进行篡改或损坏。\n###输出规范\n1.以文本形式输出，详细描述水果分类的各项特征，\n2.对于可量化的物料特征，需给出具体数值或描述。\n3.对于无法明确的特征，需注明“未明确”。",
			"multimodalContent": "### 图像预处理\n对上传的图片进行了去噪和增强操作，确保图像质量清晰，以便于后续的特征识别。图像中水果的颜色、形状和纹理等细节均得到了良好的保留。\n\n### 特征识别\n#### 1. 颜色特征\n- **草莓**：鲜红色，表面有白色小点。\n- **苹果**：绿色，表面光滑。\n- **柠檬**：黄色，表面有细小的凹凸不平。\n- **西瓜**：外皮为深绿色和浅绿色相间的条纹，内部果肉为红色。\n- **蓝莓**：深蓝色，表面有一层白霜。\n- **梨**：绿色，表面光滑。\n\n#### 2. 水果种类\n- **草莓**：多颗，表面有白色小点。\n- **苹果**：多颗，绿色。\n- **柠檬**：多颗，黄色。\n- **西瓜**：一颗，外皮为深绿色和浅绿色相间的条纹。\n- **蓝莓**：多颗，深蓝色。\n- **梨**：一颗，绿色。\n\n#### 3. 大小特征\n- **草莓**：较小，直径约2-3厘米。\n- **苹果**：中等大小，直径约6-8厘米。\n- **柠檬**：中等大小，直径约5-7厘米。\n- **西瓜**：较大，直径约20-30厘米。\n- **蓝莓**：较小，直径约1厘米。\n- **梨**：中等大小，直径约6-8厘米。\n\n#### 4. 甜度特征\n- **草莓**：甜度较高，具体数值未明确。\n- **苹果**：甜度适中，具体数值未明确。\n- **柠檬**：酸味较重，甜度较低，具体数值未明确。\n- **西瓜**：甜度较高，具体数值未明确。\n- **蓝莓**：甜度适中，具体数值未明确。\n- **梨**：甜度适中，具体数值未明确。\n\n### 数据整理\n将识别到的特征进行整理和记录如下：\n\n| 水果种类 | 颜色       | 大小（直径） | 甜度     |\n|----------|------------|--------------|----------|\n| 草莓     | 鲜红色     | 2-3厘米      | 较高     |\n| 苹果     | 绿色       | 6-8厘米      | 适中     |\n| 柠檬     | 黄色       | 5-7厘米      | 较低     |\n| 西瓜     | 深绿/浅绿  | 20-30厘米    | 较高     |\n| 蓝莓     | 深蓝色     | 1厘米        | 适中     |\n| 梨       | 绿色       | 6-8厘米      | 适中     |\n\n### 输出规范\n以上信息以文本形式输出，详细描述了水果分类的各项特征。对于可量化的物料特征，给出了具体数值或描述；对于无法明确的特征，注明了“未明确”。",
			"materialType": "水果分类",
			"materialFeatureList": [
				"颜色",
				"水果种类",
				"大小",
				"甜度"
			],
			"chatType": 12,
			"model": "qwen2.5-vl-72b-instruct",
			"multimodalErrorMessage": ""
		},
		"msg": "执行成功",
		"ext": "",
		"errorCode": "",
		"message": "",
		"traceId": "",
		"displayCode": "",
		"level": 0
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
0	未传入优惠券档案id	coupon_id值填写有误
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


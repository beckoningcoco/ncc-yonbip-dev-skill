---
title: "开票申请单新增（原未开票管理新增单据）"
apiId: "b19dc1e144e64abea75c9adb4ead6362"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoice Request"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoice Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票申请单新增（原未开票管理新增单据）

>  请求方式	POST | Invoice Request (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/tax/invoiceclient-web/api/invoice-will/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
lyid	string	否	否	来源ID 示例：123123
lydjh	string	否	否	业务来源单据号 示例：45345312
lyBillTypeId	string	否	否	来源单据类型id 示例：12312312
djqqlsh	string	否	是	单据请求流水号 示例：4545343123
lylx	string	否	否	来源类型 1-手工开具; 2-接口传入; 3-文件导入; 4-二维码扫描; 5-微信传入; 6-快速开票; 7-支付宝传入; 8-拼多多; 9-小程序; w-待开票明细; v-开票申请单; n-NCC传入 示例：1
orgCode	string	否	是	开票点编码；在开票点档案中查询 示例：123
gmfMc	string	否	是	购买方名称 示例：名称
gmfNsrsbh	string	否	否	购买方纳税人识别号 示例：231321242
gmfYhzh	string	否	否	购买方银行账户 示例：北京银行 12315
gmfDzdh	string	否	否	购买方地址电话 示例：北京海淀 12312326566
gmfDz	string	否	否	购买方地址（数电专用字段） 示例：北京海淀
gmfDh	string	否	否	购买方电话(数电专用字段) 示例：155323265
gmfYh	string	否	否	购买方银行（数电专用） 示例：北京银行
gmfZh	string	否	否	购买方账号（数电专用） 示例：121323
xsfMc	string	否	否	销售方名称 示例：销方名称
xsfNsrsbh	string	否	否	销售方纳税人识别号 示例：21313213
xsfDzdh	string	否	否	销售方地址、电话 示例：北京海淀 1553232656
xsfYhzh	string	否	否	销售方银行账号 示例：销方银行 122323
xsfDz	string	否	否	销售方地址（数电专用） 示例：地址 16665655566
xsfDh	string	否	否	销售方电话（数电专用） 示例：15532329899
xsfYh	string	否	否	销售方银行（数电专用） 示例：北京银行
xsfZh	string	否	否	销售方账号（数电专用） 示例：12513163
lc	string	否	否	联次：2-二联 3-三联 5-五联 示例：2
bz	string	否	否	备注。数电发票，如为基础通道（电子税务局），最长为200字符，如为乐企通道，最长为450字符（汉字、数字、字母等只占用一个字符）；税控发票，最长为230个字符（汉字占两个字符，数字、字母等占一个字符）； 示例：123
fplx	string	否	否	发票类型：1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票 ；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)； 36：数电纸质发票(机动车销售统一发票)；83：数电票（机动车销售统一发票）；84：数电票（二手车销售统一发票）；88：数电纸质发票（二手车销售统一发票）；选填 默认为1 示例：1
zdrq	string	否	是	制单日期：格式为yyyy-MM-dd 示例：2023-11-22
revurl1	string	否	否	待开票明细结果回传地址 示例：http:1231321.com
revemail	string	否	否	联系人邮箱 示例：1464658255@qq.com
revphone	string	否	否	联系人手机号 示例：15532329878
kpr	string	否	否	开票人 示例：张三
skr	string	否	否	收款人 示例：张三
fhr	string	否	否	复核人 示例：张三
tsyw	string	否	否	特殊业务 2-燃油增值税专用发票 8-农产品销售 9-农产品收购 11-烟草发票 12-机动车发票 14-成品油发票 DK-代开发票 16-矿产品发票 E01-成品油发票 E02-稀土发票 E03-建筑服务发票 E04 货物运输 E05-不动产销售 E06-不动产租赁服务发票 E07-代收车船税 E09-旅客运输 E12-自产农产品销售 E14-机动车 E16-农产品收购 E17-光伏收购 E18-卷烟发票 E24-报废产品收购 E26-金银首饰批发 E27-金银首饰零售 E32-电子烟 示例：0
secretLevelName	string	否	否	单据密级。 示例：公开
autoMake	string	否	否	是否自动开票 true：自动开 false：不自动开 示例：false
einvoiceShowGxfDzDh	string	否	否	数电发票是否显示购销方地址、电话: 0：不显示 1：仅显示销地址、电话 2：仅显示购买方地址、电话 3：购销方地址、电话都显示 示例：N
einvoiceShowSkrShr	string	否	否	数电发票(非纸质发票)是否显示收款人、复核人。0：不显示 1：仅显示收款人 2：仅显示复核人 3：收款人复核人都显示 示例：N
einvoiceShowGxfYhZh	string	否	否	数电发票是否显示购销方银行、账号: 0：不显示 1：仅显示销售方银行、账号 2：仅显示购买方银行、账号 3：购销方银行、账号都显示
dfgtgmbz	string	否	否	多方共同购买标志 Y：多方共同购买N：非多方共同购买 示例：N
zrrbs	string	否	否	购买方自然人标志。仅在开具数电普票(电子)时使用，如受票方（发票抬头）为自然人，并要求能将发票归集在个人票夹中展示，需提供姓名及身份证号（自然人纳税人识别号），此参数传入Y；如受票方（发票抬头）为个体工商户，需提供社会统一信用代码或纳税人识别号，此参数传入N 示例：N
zjlx	string	否	否	证件类型代码.适用于自然人标识为Y时的自然人补充信息，枚举参见出行人证件类型代码枚举。收购发票或者ZJHM、GUOJI两个字段有值时，必填 示例：201
zjhm	string	否	否	证件号码,适用于自然人标识为Y时的自然人补充信息。收购发票或者ZJLX、GUOJI两个字段有值时，必填 示例：120110202101111111
guoji	string	否	否	国籍代码,适用于自然人标识为Y时的自然人补充信息，枚举参见国家地区代码枚举。收购发票或者ZJLX、ZJHM两个字段有值时，必填 示例：156
yfpDm	string	否	否	蓝字发票代码(被红冲的发票代码)
yfpHm	string	否	否	蓝字发票号码(被红冲的发票号码)
hzxxbbh	string	否	否	红字信息表编号(专票红冲时必传)
hcyy	string	否	否	红冲原因(1 销货退回 2 开票有误 3 服务中止 4 销售折让)
mqkfrl	string	否	否	每千克煤炭发热量。煤炭类商品总不含税基恩超过一千万必填。 示例：12
gjql	string	否	否	干基全硫量。煤炭类商品总不含税基恩超过一千万必填。 示例：12
gzwhjhff	string	否	否	干燥无灰基挥发分量。煤炭类商品总不含税金额超过一千万必填。 示例：21
zsfs	string	否	否	征税方式。0-普通征税 2-差额征税/差额开票 3-全额开票 示例：0
kqysssxbgglbm	string	否	否	跨区域涉税事项报验管理编号。数电特殊票种-建筑服务及不动产销售使用 示例：3333
tdzzsxmbh	string	否	否	土地增值税项目编号。数电特殊票种-建筑服务及不动产销售使用 示例：232342131
kdsbz	string	否	否	跨地（市）标志 Y：是 N：否。数电特殊票种-不动产租赁、不动产销售、及建筑服务使用 示例：N
bxdh	string	否	否	保险单号 示例：33
cphcbdjh	string	否	否	车牌号/船舶登记号 示例：豫MUX555
skssq	string	否	否	税款所属期yyyy-MM+空格+yyyy-MM 示例：2023-01 2023-03
dsccsje	string	否	否	代收车船税金额 示例：3
znj	string	否	否	滞纳金 示例：111
jehj	string	否	否	金额合计 示例：1
cjh	string	否	否	车辆识别代码/车架号码 示例：233134133384938
scrapProdSaleType	string	否	否	报废产品销售类型 01-销售自己使用过的报废产品 02-销售收购的报废产品 示例：01
cpyqylb	string	否	否	企业类别代码 示例：08
administrativeDivisionCode	string	否	否	行政区划数字代码。报废品收购发票必填 示例：440105
subdistrictCode	string	否	否	街道行政代码。报废品收购发票必填 示例：440105001
isTaxProfessionalServiceInvoiceItem	string	否	否	是否开具涉税专业服务发票 枚举：Y、N。说明：涉税专业服务机构企业（即税务师事务所、会计师事务所、律师事务所、代理记账机构、税务代理公司、财税类咨询公司及其他提供涉税专业服务的机构）开具涉税专业服务发票时，购买方纳税人识别号、是否开具涉税专业服务发票、涉税专业服务协议编号为必填项。此字段为局端认定的涉税专业服务机构开具非特定业务发票时使用，其他企业必须为空。 示例：Y
taxProServiceAgreementNo	string	否	否	涉税专业服务协议编号 是否开具涉税专业服务发票品目为“Y”时，此字段为必填项。此字段为局端认定的涉税专业服务机构开具非特定业务发票时使用，其他企业必须为空。
jazs	string	否	否	减按征税方式代码。不动产租赁特殊票种选填。枚举：01 个人出租住房 02 小规模复工复业 03 销售自己使用过的固定资产 04 销售收购的二手车 05 住房租赁 51 开具发票为2022年4月1日前发生纳税义务的业务 52 前期已开具相应征收率发票 53 因实际经营业务需要，放弃享受免征增值税政策 示例：05
tspzs	object	是	否	数电特殊票种
ysmxxh	string	否	否	运输明细序号 示例：1
ysgjzl	string	否	否	运输工具种类。铁路运输 公路运输 水路运输 航空运输 管道运输 其他运输工具 示例：铁路运输
ysgjph	string	否	否	运输工具牌号。 示例：京A111111
qyd	string	否	否	起运地 示例：北京
ddd	string	否	否	到达地 示例：德州
yshwmc	string	否	否	运输货物名称 示例：苹果
cxr	string	否	否	出行人 示例：张三
chuxrq	string	否	否	出行日期。格式yyyy-MM-dd 示例：2025-03-13
cxrzjlxDm	string	否	否	出行人证件类型。参考FAQ文档：https://docs.qq.com/doc/DUG5MWWdUYnprZHRW?nlc=1 示例：101
sfzjhm	string	否	否	身份证件号码 示例：371233333323333323
cfd	string	否	否	旅客出发地 示例：北京
lkddd	string	否	否	旅客到达地 示例：北京
zwdj	string	否	否	座位等级。参考FAQ文档：https://docs.qq.com/doc/DUG5MWWdUYnprZHRW?nlc=1 示例：一等座
jtgjlxDm	string	否	否	交通工具类型代码。1：飞机 2：火车 3：长途汽车 4：公共交通 5：出租车 6：汽车 7：船舶 9：其他 示例：1
bdcxsTspzs	object	是	否	数电特殊票种-新版本不动产销售及不动产租赁必传。
cxrxh	string	否	否	明细序号，注意该序号要与明细行中正数行行号一对一关联 示例：1
bdcdz	string	否	否	不动产地址 示例：北京市辖区东城区滨河公园5-4-1803
wqhtbabh	string	否	否	网签合同编号 示例：32333
tdzzsxmbh	string	否	否	土地增值税项目编号 示例：123331
bdcdwdm	string	否	否	不动产单元代码 示例：32333
hdjsjg	string	否	否	核定计税价格。不属于核定计税不动产销售的可不填写 示例：3.2
sjcjhsje	string	否	否	实际成交含税金额。若按核定计税价格征税的，为必填 示例：3.2
kdsbz	string	否	否	跨地（市）标志 Y：是 N：否 示例：N
cqzsbh	string	否	否	产权证书/不动产权证号 示例：3233
mjdw	string	否	否	面积单位。取值为：平方千米、平方米、公顷、亩、h㎡、k㎡、㎡、米（铁路线与管道等使用） 示例：平方米
zlqq	string	否	否	租赁期起日期 例：2022-11-18 示例：2022-11-18
zlqz	string	否	否	租赁期止日期 例：2023-11-18 示例：2023-11-18
cph	string	否	否	车牌号 示例：京A123456
invoiceWillBs	object	是	否	项目明细数据
spbm	string	否	否	商品编码：物料档案，档案中商品编码唯一 示例：11313213123
xmje	number
小数位数:2,最大长度:20	否	否	不含税金额。不含税金额为空，根据项具价税合计反算。不为空时不进行计算。 示例：1.2
xmjshj	number
小数位数:2,最大长度:20	否	是	项目价税合计，最多2位小数 示例：50
hh	string	否	是	行号 示例：1
sl	number
小数位数:2,最大长度:20	否	是	税率 示例：0.03
xmmc	string	否	是	项目名称 示例：222
xmdj	number
小数位数:8,最大长度:20	否	否	商品不含税单价。商品不含税单价为空时，根据项目金额反算。不为空时不进行计算。 示例：1.12
xmhsdj	number
小数位数:2,最大长度:20	否	否	商品含税单价 示例：5
xmsl	number
小数位数:8,最大长度:20	否	否	项目数量：如果是成品油、机动车、稀土业务类型的发票，必填 示例：10
se	number
小数位数:2,最大长度:20	否	否	税额 示例：5
spssflbm	string	否	否	商品税收分类编码 示例：43452343123
dw	string	否	否	单位：如果是机动车专用发票，必填且只能是"辆"，如果是稀土专用发票，必填且只能是"公斤或吨" 示例：个
ggxh	string	否	否	规格型号：如果是机动车专用发票且非生产企业，则规格型号栏位必须填写，填写数据为车辆识别代号/车架号码 示例：1/个
fphxz	string	否	否	发票行性质。折扣行性质,0和空:正常行;1:折扣行;2:被折扣行 示例：2
zkhhh	string	否	否	折扣行行号 示例：1
zkhbs	string	否	否	折扣行标识，Y开票时带折扣行，N开票时不带折扣行 示例：Y
zke	number
小数位数:2,最大长度:20	否	否	折扣额 示例：0
lslbs	string	否	否	零税率标志。0-出口退税 1-免税 2-不征税 3-普通零税率 示例：0
zzstsgl	string	否	否	增值税特殊管理。 示例：按3%简易征收
lymxid	string	否	否	来源明细id 示例：11111
lymxdjh	string	否	否	来源明细单据号 示例：mxdj1111
defineTerm	object	否	否	明细表的自定义特征项(key value的形式，支持多个，key是特征编码，value是特征值) 示例：{"invoice_bz":"123","invoice_remark":"记录"}
detailMotor	object	否	否	明细扩展属性
cepzs	object	否	否	差额征收凭证
xh	string	否	否	序号 示例：1
pzlx	string	否	否	10-专用发票、11-普通发票、12-海关进口增值税专用缴款书、13-航空运输电子客票行程单、14-铁路电子客票、15-税收完税证明（契税）、16-中央非税收入统一票据（土地出让金）、05-财政票据、06-法院裁决书、09-其他扣除凭证； 原凭证类型：01-数电票、02-增值税专用发票、03-增值税普通发票、04-营业税发票、07-契税完税凭证、08-其他发票类，税局已经在20251230作废不再使用。 示例：09
fphm	string	否	否	数电发票号码，当凭证类型为10-专用发票”、11-普通发票且为数电发票时，数电发票号码必填。当凭证类型为13-航空运输电子客票行程单、14-铁路电子客票时，数电发票号码必填。 示例：333
fpdm	string	否	否	发票代码，当凭证类型为10-专用发票”、11-普通发票且为税控发票时，发票代码必填；当凭证类型为16-中央非税收入统一票据（土地出让金）时，发票代码必填。 示例：323
zzfphm	string	否	否	发票号码，当凭证类型为10-专用发票”、11-普通发票且为税控发票时，发票号码必填。 示例：3333
pzhm	string	否	否	凭证号码，当凭证类型为 12-海关进口增值税专用缴款书、15-税收完税证明（契税）、16-中央非税收入统一票据（土地出让金）、05-财政票据、06-法院裁决书时，凭证号码必填。 示例：33
kjrq	string	否	否	开具日期，当凭证类型为10-专用发票、11-普通发票、13-航空运输电子客票行程单、14-铁路电子客票时必填。格式要求示例：2025-12-23 示例：2023-01-04
hjje	string	否	否	合计金额 示例：100
kce	string	否	否	扣除额 示例：3
bz	string	否	否	凭证备注，当凭证类型为09-其他扣除凭证时，凭证备注可填写：劳务派遣员工工资、福利、为其办理社会保险及住房公积金。当开票方税号为乐企通道且凭证类型为“其他扣除凭证”时，备注必填 示例：1
ly	string	否	否	录入方式，取值范围如下：手工录入 勾选录入 模板录入 示例：手工录入
bckcje	string	否	否	本次扣除金额 示例：1
pzhjje	string	否	否	凭证合计金额 示例：1
zdybz	string	否	否	自定义备注 示例：1
allElcUserName	string	否	否	数电发票用户名
bustype	string	否	否	交易类型(支持id和code)     当交易类型为空时，程序自动去【交易类型】界面获取开票申请单设置的默认交易类型。 如获取到，则直接使用默认值，如未获取到，则报错。 示例: 2282959898611968

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoice-will/save?access_token=访问令牌
Body: {
	"lyid": "123123",
	"lydjh": "45345312",
	"lyBillTypeId": "12312312",
	"djqqlsh": "4545343123",
	"lylx": "1",
	"orgCode": "123",
	"gmfMc": "名称",
	"gmfNsrsbh": "231321242",
	"gmfYhzh": "北京银行  12315",
	"gmfDzdh": "北京海淀 12312326566",
	"gmfDz": "北京海淀",
	"gmfDh": "155323265",
	"gmfYh": "北京银行",
	"gmfZh": "121323",
	"xsfMc": "销方名称",
	"xsfNsrsbh": "21313213",
	"xsfDzdh": "北京海淀 1553232656",
	"xsfYhzh": "销方银行 122323",
	"xsfDz": "地址 16665655566",
	"xsfDh": "15532329899",
	"xsfYh": "北京银行",
	"xsfZh": "12513163",
	"lc": "2",
	"bz": "123",
	"fplx": "1",
	"zdrq": "2023-11-22",
	"revurl1": "http:1231321.com",
	"revemail": "1464658255@qq.com",
	"revphone": "15532329878",
	"kpr": "张三",
	"skr": "张三",
	"fhr": "张三",
	"tsyw": "0",
	"secretLevelName": "公开",
	"autoMake": "false",
	"einvoiceShowGxfDzDh": "N",
	"einvoiceShowSkrShr": "N",
	"einvoiceShowGxfYhZh": "",
	"dfgtgmbz": "N",
	"zrrbs": "N",
	"zjlx": "201",
	"zjhm": "120110202101111111",
	"guoji": "156",
	"yfpDm": "",
	"yfpHm": "",
	"hzxxbbh": "",
	"hcyy": "",
	"mqkfrl": "12",
	"gjql": "12",
	"gzwhjhff": "21",
	"zsfs": "0",
	"kqysssxbgglbm": "3333",
	"tdzzsxmbh": "232342131",
	"kdsbz": "N",
	"bxdh": "33",
	"cphcbdjh": "豫MUX555",
	"skssq": "2023-01 2023-03",
	"dsccsje": "3",
	"znj": "111",
	"jehj": "1",
	"cjh": "233134133384938",
	"scrapProdSaleType": "01",
	"cpyqylb": "08",
	"administrativeDivisionCode": "440105",
	"subdistrictCode": "440105001",
	"isTaxProfessionalServiceInvoiceItem": "Y",
	"taxProServiceAgreementNo": "",
	"jazs": "05",
	"tspzs": [
		{
			"ysmxxh": "1",
			"ysgjzl": "铁路运输",
			"ysgjph": "京A111111",
			"qyd": "北京",
			"ddd": "德州",
			"yshwmc": "苹果",
			"cxr": "张三",
			"chuxrq": "2025-03-13",
			"cxrzjlxDm": "101",
			"sfzjhm": "371233333323333323",
			"cfd": "北京",
			"lkddd": "北京",
			"zwdj": "一等座",
			"jtgjlxDm": "1"
		}
	],
	"bdcxsTspzs": [
		{
			"cxrxh": "1",
			"bdcdz": "北京市辖区东城区滨河公园5-4-1803",
			"wqhtbabh": "32333",
			"tdzzsxmbh": "123331",
			"bdcdwdm": "32333",
			"hdjsjg": "3.2",
			"sjcjhsje": "3.2",
			"kdsbz": "N",
			"cqzsbh": "3233",
			"mjdw": "平方米",
			"zlqq": "2022-11-18",
			"zlqz": "2023-11-18",
			"cph": "京A123456"
		}
	],
	"invoiceWillBs": [
		{
			"spbm": "11313213123",
			"xmje": 1.2,
			"xmjshj": 50,
			"hh": "1",
			"sl": 0.03,
			"xmmc": "222",
			"xmdj": 1.12,
			"xmhsdj": 5,
			"xmsl": 10,
			"se": 5,
			"spssflbm": "43452343123",
			"dw": "个",
			"ggxh": "1/个",
			"fphxz": "2",
			"zkhhh": "1",
			"zkhbs": "Y",
			"zke": 0,
			"lslbs": "0",
			"zzstsgl": "按3%简易征收",
			"lymxid": "11111",
			"lymxdjh": "mxdj1111",
			"defineTerm": {
				"invoice_bz": "123",
				"invoice_remark": "记录"
			},
			"detailMotor": {
				"mtzldm": "0100",
				"mtzldmxy": "0201",
				"cllx": "车辆类型",
				"cpxh": "厂牌型号",
				"cd": "产地",
				"hgzh": "合格证号",
				"jkzmsh": "进口证明书号",
				"sjdh": "商检单号",
				"fdjhm": "发动机号码",
				"cjhm": "车架号码",
				"wspzh": "完税凭证号",
				"dunwei": "吨位",
				"xcrs": "限乘人数",
				"gmfsfzjlx": "1",
				"xfdw": "卖方单位/个人",
				"xfhm": "二手车-卖方单位代码/身份证号",
				"xfdz": "卖方单位/个人住址",
				"xfdh": "卖方电话",
				"cpzh": "车牌照号",
				"djzh": "登记证号",
				"cgsmc": "转入地车辆车管所名称",
				"saleNaturalPersonId": "Y",
				"saleNationalityCode": "156",
				"saleIdType": "201",
				"saleIdNumber": "销方(卖方)证件号码",
				"jzfwfsd": "北京市",
				"jzxmmc": "第九区"
			}
		}
	],
	"cepzs": {
		"xh": "1",
		"pzlx": "09",
		"fphm": "333",
		"fpdm": "323",
		"zzfphm": "3333",
		"pzhm": "33",
		"kjrq": "2023-01-04",
		"hjje": "100",
		"kce": "3",
		"bz": "1",
		"ly": "手工录入",
		"bckcje": "1",
		"pzhjje": "1"
	},
	"zdybz": "1",
	"allElcUserName": "",
	"bustype": ""
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
code	string	否	状态码 示例：200
message	string	否	操作信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	单据请求流水号已被使用，请重新赋值	请根据提示修改

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
新增
请求参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志


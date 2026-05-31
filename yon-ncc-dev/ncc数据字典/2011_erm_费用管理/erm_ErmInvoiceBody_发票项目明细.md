# |<<

**发票项目明细 (erm_ErmInvoiceBody / nc.vo.erm.erminvoice.ErmInvoiceBody)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1920.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_erminvoice_b | 明细主键 | pk_erminvoice_b | char(20) | √ | 主键 (UFID) |
| 2 | itemname | 项目名称废弃 | itemname | varchar(50) |  | 字符串 (String) |
| 3 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | xmmc | 项目名称 | xmmc | varchar(500) |  | 字符串 (String) |
| 5 | ggxh | 规格型号 | ggxh | varchar(200) |  | 字符串 (String) |
| 6 | dw | 单位 | dw | varchar(50) |  | 字符串 (String) |
| 7 | spbm | 商品税收分类编码 | spbm | varchar(50) |  | 字符串 (String) |
| 8 | lslbs | 零税率标识 | lslbs | varchar(50) |  | 字符串 (String) |
| 9 | xmsl | 项目数量 | xmsl | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | xmdj | 项目单价 | xmdj | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | xmje | 项目金额 | xmje | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | xmjshj | 项目价税合计 | xmjshj | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | sl | 税率 | sl | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | se | 税额 | se | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | hh | 行号 | hh | varchar(50) |  | 字符串 (String) |
| 16 | yjzcbs | 优惠政策标识 | yjzcbs | int |  | 整数 (Integer) |
| 17 | zzstsgl | 优惠政策说明 | zzstsgl | varchar(500) |  | 字符串 (String) |
| 18 | kce | 扣除额 | kce | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | txftxrqz | 通行日期止 | txftxrqz | varchar(50) |  | 字符串 (String) |
| 20 | txftxrqq | 通行日期起 | txftxrqq | varchar(50) |  | 字符串 (String) |
| 21 | txflx | 类型 | txflx | varchar(50) |  | 字符串 (String) |
| 22 | txfcph | 车牌号 | txfcph | varchar(50) |  | 字符串 (String) |
| 23 | fphxz | 发票行性质 | fphxz | varchar(50) |  | 字符串 (String) |
| 24 | cd | 产地 | cd | varchar(50) |  | 字符串 (String) |
| 25 | cjhm | 车架号码 | cjhm | varchar(100) |  | 字符串 (String) |
| 26 | dunwei | 吨位 | dunwei | varchar(50) |  | 字符串 (String) |
| 27 | fdjhm | 发动机号码 | fdjhm | varchar(100) |  | 字符串 (String) |
| 28 | hgzh | 合格证号 | hgzh | varchar(100) |  | 字符串 (String) |
| 29 | jkzmsh | 进口证明书号 | jkzmsh | varchar(100) |  | 字符串 (String) |
| 30 | sjdh | 商检单号 | sjdh | varchar(50) |  | 字符串 (String) |
| 31 | xcrs | 限乘人数 | xcrs | varchar(50) |  | 字符串 (String) |
| 32 | airdetailid | 行程单明细id | airdetailid | varchar(50) |  | 字符串 (String) |
| 33 | airid | 行程单主表id | airid | varchar(50) |  | 字符串 (String) |
| 34 | airfrom | 出发 | airfrom | varchar(50) |  | 字符串 (String) |
| 35 | airto | 到达 | airto | varchar(50) |  | 字符串 (String) |
| 36 | flightnum | 航班号 | flightnum | varchar(50) |  | 字符串 (String) |
| 37 | carrier | 承运人 | carrier | varchar(50) |  | 字符串 (String) |
| 38 | seat | 仓位 | seat | varchar(50) |  | 字符串 (String) |
| 39 | airdate | 乘机日期 | airdate | varchar(50) |  | 字符串 (String) |
| 40 | airtime | 乘机时间 | airtime | varchar(50) |  | 字符串 (String) |
| 41 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |
| 42 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 43 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 44 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 45 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 46 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 47 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 48 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 49 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 50 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
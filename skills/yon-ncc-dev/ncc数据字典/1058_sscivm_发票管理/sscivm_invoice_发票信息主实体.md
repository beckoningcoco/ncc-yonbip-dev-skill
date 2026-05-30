# |<<

**发票信息主实体 (sscivm_invoice / nc.vo.sscivm.invoice.IVMInvoiceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5541.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice | 发票主键 | pk_invoice | char(20) | √ | 主键 (UFID) |
| 2 | fphm | 发票号码 | fphm | varchar(50) |  | 字符串 (String) |
| 3 | fpdm | 发票代码 | fpdm | varchar(50) |  | 字符串 (String) |
| 4 | jjm | 机器编号 | jjm | varchar(50) |  | 字符串 (String) |
| 5 | kprq | 开票日期 | kprq | char(19) |  | 日期 (UFDate) |
| 6 | fpmw | 密码区 | fpmw | varchar(255) |  | 字符串 (String) |
| 7 | jym | 校验码 | jym | varchar(50) |  | 字符串 (String) |
| 8 | xsfmc | 销售方名称 | xsfmc | varchar(255) |  | 字符串 (String) |
| 9 | xsfnsrsbh | 销售方纳税人识别号 | xsfnsrsbh | varchar(50) |  | 字符串 (String) |
| 10 | xsfdzdh | 销售方地址电话 | xsfdzdh | varchar(512) |  | 字符串 (String) |
| 11 | xsfyhzh | 销售方开户行及账号 | xsfyhzh | varchar(255) |  | 字符串 (String) |
| 12 | gmfmc | 购买方名称 | gmfmc | varchar(255) |  | 字符串 (String) |
| 13 | gmfdzdh | 购买方地址电话 | gmfdzdh | varchar(255) |  | 字符串 (String) |
| 14 | gmfnsrsbh | 纳税人识别号 | gmfnsrsbh | varchar(50) |  | 字符串 (String) |
| 15 | gmfyhzh | 购货单位开户行及账号 | gmfyhzh | varchar(255) |  | 字符串 (String) |
| 16 | jshj | 价税合计 | jshj | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | hjje | 不含税金额 | hjje | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | hjse | 税额 | hjse | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | bz | 备注 | bz | varchar(512) |  | 字符串 (String) |
| 20 | kpr | 开票人 | kpr | varchar(50) |  | 字符串 (String) |
| 21 | skr | 收款人 | skr | varchar(50) |  | 字符串 (String) |
| 22 | fhr | 复核人 | fhr | varchar(50) |  | 字符串 (String) |
| 23 | lyxt | 来源系统 | lyxt | varchar(50) |  | 来源系统 (enum) |  | ar=应收管理; |
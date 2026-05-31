# |<<

**电子发票关联信息 (er_fprelation / nc.vo.erm.ErmFpRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1899.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fprelation | 主键 | pk_fprelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_bxd | 报销单主键 | pk_bxd | varchar(50) | √ | 字符串 (String) |
| 3 | pk_busitem | 业务表体记录 | pk_busitem | varchar(50) |  | 字符串 (String) |
| 4 | filename | 文件名 | filename | varchar(50) |  | 字符串 (String) |
| 5 | usercode | 用户名 | usercode | varchar(50) |  | 字符串 (String) |
| 6 | fpdm | 发票代码 | fpdm | varchar(50) |  | 字符串 (String) |
| 7 | fphm | 发票号码 | fphm | varchar(50) |  | 字符串 (String) |
| 8 | gmfmc | gmfMc | gmfmc | varchar(50) |  | 字符串 (String) |
| 9 | hjje | hjje | hjje | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | jshj | jshj | jshj | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | kpr | kpr | kpr | varchar(50) |  | 字符串 (String) |
| 12 | kprq | 开票日期 | kprq | varchar(50) |  | 字符串 (String) |
| 13 | xsfdzdh | xsfDzdh | xsfdzdh | varchar(50) |  | 字符串 (String) |
| 14 | xsfmc | xsfMc | xsfmc | varchar(50) |  | 字符串 (String) |
| 15 | xsfnsrsbh | xsfNsrsbh | xsfnsrsbh | varchar(50) |  | 字符串 (String) |
# |<<

**票据签发回单 (fbm_register / nc.vo.cfbm.signback.SignBackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | 主键 | pk_register | char(20) | √ | 主键 (UFID) |
| 2 | serialno | 序列号 | serialno | int |  | 整数 (Integer) |
| 3 | registerno | 登记单编号 | registerno | varchar(100) |  | 字符串 (String) |
| 4 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 5 | pk_billtypeid | 单据类型主属性 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 6 | gatherdate | 收票日期 | gatherdate | char(19) |  | 日期 (UFDate) |
| 7 | gathertype | 收票来源类型 | gathertype | varchar(50) |  | 收票来源类型 (GathertypeEnum) |  | input=收票录入; |
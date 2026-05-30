# |<<

**票据登记 (fbm_register / nc.vo.fbm.register.RegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2152.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | 主键 | pk_register | char(20) | √ | 主键 (UFID) |
| 2 | committor | 提交人 | committor | varchar(20) |  | 用户 (user) |
| 3 | signer | 签收人 | signer | varchar(20) |  | 用户 (user) |
| 4 | commitdate | 提交日期 | commitdate | char(19) |  | 日期 (UFDate) |
| 5 | signdate | 签收日期 | signdate | char(19) |  | 日期 (UFDate) |
| 6 | serialno | 序列号 | serialno | int |  | 整数 (Integer) |
| 7 | registerno | 登记单编号 | registerno | varchar(100) |  | 字符串 (String) |
| 8 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 9 | pk_billtypeid | 单据类型主属性 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 10 | gatherdate | 收票日期 | gatherdate | char(19) |  | 日期 (UFDate) |
| 11 | gathertype | 收票来源类型 | gathertype | varchar(30) |  | 收票来源类型 (GathertypeEnum) |  | input=收票录入; |
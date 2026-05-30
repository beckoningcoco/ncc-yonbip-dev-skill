# |<<

**非银行金融机构银行账户 (tmpub_NonbankAcc / nc.vo.tmpub.bd.nonbankacc.NonbankAccVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nonbankacc | 主键 | pk_nonbankacc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | accnum | 账号 | accnum | varchar(40) |  | 字符串 (String) |
| 6 | accname | 户名 | accname | varchar(200) |  | 字符串 (String) |
| 7 | code | 账户编码 | code | varchar(40) |  | 字符串 (String) |
| 8 | name | 账户名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | pk_bankdoc | 开户银行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 10 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 11 | accountproperty | 账户性质 | accountproperty | smallint |  | 账户性质 (accountproperty) |  | 0=公司; |
# |<<

**到账通知自动生单 (cmp_autoinform / nc.vo.cmp.autoinform.AutoinformVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1529.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_autoinform | 主键 | pk_autoinform | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_bankacc | 本方账号 | pk_bankacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 4 | billtypeobj | 交易类型对象 | billtypeobj | varchar(50) |  | 交易类型对象 (billtypeobj) |  | 1=客户; |
# |<<

**银行存款日报表 (cmp_bankdailyreport / nc.vo.cmp.bankdailyreport)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1537.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankdaily | 主键 | pk_bankdaily | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种 | pk_currtype | varchar(0) |  | 币种 (currtype) |
| 3 | pk_account | 银行账户 | pk_account | varchar(20) |  | 银行账户 (bankaccount) |
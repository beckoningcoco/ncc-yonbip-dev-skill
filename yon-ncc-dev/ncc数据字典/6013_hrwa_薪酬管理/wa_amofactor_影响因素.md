# |<<

**影响因素 (wa_amofactor / nc.vo.wa.amoscheme.AmoFactorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6318.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amofactor | 影响因素主键 | pk_amofactor | char(20) | √ | 主键 (UFID) |
| 2 | pk_amoscheme | 分摊方案主键 | pk_amoscheme | char(20) |  | 主键 (UFID) |
| 3 | factor_doc_name | 影响因素 | factor_doc_name | varchar(50) | √ | 字符串 (String) |
| 4 | factor_doc_pk | 影响因素档案主键 | factor_doc_pk | char(20) |  | 字符串 (String) |
| 5 | factor_value_name | 影响因素值 | factor_value_name | varchar(2048) |  | 字符串 (String) |
| 6 | factor_value_pk | factor_value_pk | factor_value_pk | varchar(2048) |  | 字符串 (String) |
| 7 | priority | priority | priority | int |  | 整数 (Integer) |
# |<<

**折旧方法 (fa_depmethod / nc.vo.fa.depmethod.DepmethodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2013.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depmethod | 折旧方法标识 | pk_depmethod | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | depmethod_code | 折旧方法编码 | depmethod_code | varchar(40) |  | 字符串 (String) |
| 5 | depmethod_name | 折旧方法名称 | depmethod_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | amountformula | 月折旧额公式 | amountformula | varchar(200) |  | 字符串 (String) |
| 7 | rateformula | 月折旧率公式 | rateformula | varchar(200) |  | 字符串 (String) |
| 8 | pre_flag | 是否预置 | pre_flag | char(1) |  | 是否 (enum) |  | 0=否; |
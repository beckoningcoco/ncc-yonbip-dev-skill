# |<<

**账簿_账簿类型 (org_setofbook / nc.vo.org.SetOfBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4167.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_setofbook | 账簿类型主键 | pk_setofbook | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_accsystem | 科目体系 | pk_accsystem | varchar(20) |  | 科目体系 (accsystem) |
| 8 | pk_accperiodscheme | 会计期间方案 | pk_accperiodscheme | varchar(20) | √ | 会计期间方案 (accperiodscheme) |
| 9 | pk_standardcurr | 本位币 | pk_standardcurr | varchar(20) | √ | 币种 (currtype) |
| 10 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |
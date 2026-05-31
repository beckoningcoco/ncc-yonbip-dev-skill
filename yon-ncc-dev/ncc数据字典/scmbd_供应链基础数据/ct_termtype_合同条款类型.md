# |<<

**合同条款类型 (ct_termtype / nc.vo.ct.termtype.entity.TermTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1684.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_termtype | 条款类型主键 | pk_ct_termtype | char(20) | √ | 主键 (UFID) |
| 2 | termtypecode | 条款类型编码 | termtypecode | varchar(30) |  | 主键 (UFID) |
| 3 | termtypename | 条款类型名称 | termtypename | varchar(60) |  | 多语文本 (MultiLangText) |
| 4 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | termtype_memo | 备注 | termtype_memo | varchar(181) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
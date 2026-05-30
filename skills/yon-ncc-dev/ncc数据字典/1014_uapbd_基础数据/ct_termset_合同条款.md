# |<<

**合同条款 (ct_termset / nc.vo.ct.term.entity.TermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1683.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_termset | 合同条款主键 | pk_ct_termset | char(20) | √ | 主键 (UFID) |
| 2 | pk_ct_termtype | 条款类型主键 | pk_ct_termtype | varchar(20) |  | 合同条款类型 (ct_termtype) |
| 3 | vtermcode | 合同条款编码 | vtermcode | varchar(30) |  | 字符串 (String) |
| 4 | vtermname | 合同条款名称 | vtermname | varchar(90) |  | 多语文本 (MultiLangText) |
| 5 | vtermcontent | 合同条款内容 | vtermcontent | varchar(996) |  | 备注 (Memo) |
| 6 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | memo | 备注 | memo | varchar(181) |  | 备注 (Memo) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
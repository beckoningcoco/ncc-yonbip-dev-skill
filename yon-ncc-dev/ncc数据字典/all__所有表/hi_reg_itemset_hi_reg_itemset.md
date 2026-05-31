# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reg_itemset | pk_reg_itemset | pk_reg_itemset | char(20) | √ |
| 2 | candelete | candelete | candelete | char(1) |
| 3 | disorder | disorder | disorder | number(38, 0) |
| 4 | isdefault | isdefault | isdefault | char(1) |
| 5 | isedit | isedit | isedit | char(1) |
| 6 | ismustnotnull | ismustnotnull | ismustnotnull | char(1) |
| 7 | itemkey | itemkey | itemkey | varchar2(128) |
| 8 | itemname | itemname | itemname | varchar2(128) |
| 9 | pk_group | pk_group | pk_group | char(20) |
| 10 | pk_infoset | pk_infoset | pk_infoset | char(20) |
| 11 | pk_infoset_item | pk_infoset_item | pk_infoset_item | char(20) |
| 12 | pk_org | pk_org | pk_org | char(20) |
| 13 | probation_type | probation_type | probation_type | number(38, 0) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stbill_itemset | pk_stbill_itemset | pk_stbill_itemset | char(20) | √ |
| 2 | billtype | billtype | billtype | char(4) | √ |
| 3 | candelete | candelete | candelete | char(1) | √ |
| 4 | disorder | disorder | disorder | number(38, 0) |
| 5 | isdefault | isdefault | isdefault | char(1) |
| 6 | isedit | isedit | isedit | char(1) |
| 7 | ismustnotnull | ismustnotnull | ismustnotnull | char(1) |
| 8 | itemkey | itemkey | itemkey | varchar2(128) | √ |
| 9 | itemname | itemname | itemname | varchar2(128) | √ |
| 10 | pk_group | pk_group | pk_group | char(20) | √ |
| 11 | pk_infoset | pk_infoset | pk_infoset | char(20) | √ |
| 12 | pk_infoset_item | pk_infoset_item | pk_infoset_item | char(20) |
| 13 | pk_org | pk_org | pk_org | char(20) | √ |
| 14 | pk_sttype | pk_sttype | pk_sttype | char(20) | √ |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
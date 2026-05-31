# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10058.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mergescheme | pk_mergescheme | pk_mergescheme | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | mergeorder | mergeorder | mergeorder | number(38, 0) |
| 4 | mergetype | mergetype | mergetype | number(38, 0) |
| 5 | m_accountcode | m_accountcode | m_accountcode | char(1) |
| 6 | m_direct | m_direct | m_direct | char(1) |
| 7 | m_expla | m_expla | m_expla | char(1) |
| 8 | m_mass | m_mass | m_mass | char(1) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | schemecode | schemecode | schemecode | varchar2(50) |
| 12 | schemename | schemename | schemename | varchar2(300) |
| 13 | schemename2 | schemename2 | schemename2 | varchar2(300) |
| 14 | schemename3 | schemename3 | schemename3 | varchar2(300) |
| 15 | schemename4 | schemename4 | schemename4 | varchar2(300) |
| 16 | schemename5 | schemename5 | schemename5 | varchar2(300) |
| 17 | schemename6 | schemename6 | schemename6 | varchar2(300) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
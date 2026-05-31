# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_terms | pk_mtcon_terms | pk_mtcon_terms | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_mtcon | pk_mtcon | pk_mtcon | char(20) | √ |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 7 | pk_terms_detail | pk_terms_detail | pk_terms_detail | varchar2(20) |  |  | '~' |
| 8 | terms_content | terms_content | terms_content | varchar2(996) |
| 9 | def1 | def1 | def1 | varchar2(101) |
| 10 | def2 | def2 | def2 | varchar2(101) |
| 11 | def3 | def3 | def3 | varchar2(101) |
| 12 | def4 | def4 | def4 | varchar2(101) |
| 13 | def5 | def5 | def5 | varchar2(101) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
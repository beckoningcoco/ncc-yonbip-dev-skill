# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatool_cate | pk_datatool_cate | pk_datatool_cate | char(20) | √ |
| 2 | cate_code | cate_code | cate_code | varchar2(50) |
| 3 | cate_name | cate_name | cate_name | varchar2(50) |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | mnecode | mnecode | mnecode | varchar2(50) |
| 7 | modifytime | modifytime | modifytime | char(19) |
| 8 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
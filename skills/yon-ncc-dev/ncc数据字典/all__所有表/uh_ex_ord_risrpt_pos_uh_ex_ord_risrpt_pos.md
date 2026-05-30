# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12608.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_risrptpos | pk_risrptpos | pk_risrptpos | char(20) | √ |
| 2 | addr_img | addr_img | addr_img | varchar2(400) |
| 3 | name_srv | name_srv | name_srv | varchar2(400) |
| 4 | note | note | note | varchar2(4000) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_risrpt | pk_risrpt | pk_risrpt | varchar2(20) |  |  | '~' |
| 8 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 9 | result | result | result | number(38, 0) |
| 10 | result_obj | result_obj | result_obj | varchar2(4000) |
| 11 | result_subj | result_subj | result_subj | varchar2(4000) |
| 12 | unit_med | unit_med | unit_med | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
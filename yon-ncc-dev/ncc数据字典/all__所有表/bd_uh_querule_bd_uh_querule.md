# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7211.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvquerule | pk_pvquerule | pk_pvquerule | char(20) | √ |
| 2 | cn_conte | cn_conte | cn_conte | number(38, 0) |
| 3 | cn_wait | cn_wait | cn_wait | number(38, 0) |
| 4 | eu_queruletype | eu_queruletype | eu_queruletype | varchar2(50) |
| 5 | func | func | func | varchar2(256) |
| 6 | name_rule | name_rule | name_rule | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pri_paticate | pri_paticate | pri_paticate | varchar2(256) |
| 10 | pri_pvcontilev | pri_pvcontilev | pri_pvcontilev | varchar2(256) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
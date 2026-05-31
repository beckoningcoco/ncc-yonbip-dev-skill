# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12066.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | dimfilter | dimfilter | dimfilter | blob |
| 3 | name_flowdef | name_flowdef | name_flowdef | varchar2(100) |
| 4 | pk_flowdef | pk_flowdef | pk_flowdef | varchar2(20) |
| 5 | pk_org | pk_org | pk_org | char(20) |
| 6 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) | √ |
| 7 | priority | priority | priority | number(38, 0) | √ |
| 8 | processdefid | processdefid | processdefid | varchar2(64) |
| 9 | taskstage | taskstage | taskstage | char(2) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
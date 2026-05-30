# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7060.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relatedapp | pk_relatedapp | pk_relatedapp | varchar2(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(200) | √ |
| 3 | pagecode | pagecode | pagecode | varchar2(200) |
| 4 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) | √ |
| 5 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) | √ |
| 6 | priority | priority | priority | number(38, 0) |
| 7 | sence | sence | sence | number(38, 0) | √ |
| 8 | vdef1 | vdef1 | vdef1 | varchar2(256) |
| 9 | vdef2 | vdef2 | vdef2 | varchar2(256) |
| 10 | vdef3 | vdef3 | vdef3 | varchar2(256) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
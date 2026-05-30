# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dirrelation | pk_dirrelation | pk_dirrelation | char(20) | √ |
| 2 | domain | domain | domain | varchar2(50) | √ |
| 3 | freereportdir | freereportdir | freereportdir | varchar2(20) |
| 4 | moduleid | moduleid | moduleid | varchar2(50) | √ |
| 5 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 6 | smartdir | smartdir | smartdir | varchar2(20) |
| 7 | type | type | type | varchar2(50) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
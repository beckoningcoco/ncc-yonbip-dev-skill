# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_uitabextend | pk_uitabextend | pk_uitabextend | char(20) | √ |
| 2 | exbean_name | exbean_name | exbean_name | varchar2(200) |
| 3 | ex_configpath | ex_configpath | ex_configpath | varchar2(400) | √ |
| 4 | ex_pointno | ex_pointno | ex_pointno | number(38, 0) |
| 5 | metadataid | metadataid | metadataid | varchar2(36) | √ |
| 6 | nodekey | nodekey | nodekey | varchar2(200) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
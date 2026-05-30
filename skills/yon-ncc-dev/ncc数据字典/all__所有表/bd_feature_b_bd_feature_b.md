# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6929.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfeaturebid | cfeaturebid | cfeaturebid | char(20) | √ |
| 2 | cfeatureid | cfeatureid | cfeatureid | char(20) | √ |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | vfvalue | vfvalue | vfvalue | varchar2(200) |
| 5 | vfvaluename | vfvaluename | vfvaluename | varchar2(200) |
| 6 | vrowno | vrowno | vrowno | varchar2(20) |
| 7 | vsimplecode | vsimplecode | vsimplecode | varchar2(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
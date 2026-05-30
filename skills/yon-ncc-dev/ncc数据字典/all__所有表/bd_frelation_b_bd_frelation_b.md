# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6938.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfrelationbid | cfrelationbid | cfrelationbid | char(20) | √ |
| 2 | cfeatureid1 | cfeatureid1 | cfeatureid1 | varchar2(20) |  |  | '~' |
| 3 | cfeatureid2 | cfeatureid2 | cfeatureid2 | varchar2(20) |  |  | '~' |
| 4 | cfrelationid | cfrelationid | cfrelationid | char(20) | √ |
| 5 | dbegindate | dbegindate | dbegindate | char(19) |
| 6 | denddate | denddate | denddate | char(19) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | vfrealvalue1 | vfrealvalue1 | vfrealvalue1 | varchar2(20) |
| 9 | vfrealvalue2 | vfrealvalue2 | vfrealvalue2 | varchar2(20) |
| 10 | vfvalue1 | vfvalue1 | vfvalue1 | varchar2(20) |  |  | '~' |
| 11 | vfvalue2 | vfvalue2 | vfvalue2 | varchar2(20) |  |  | '~' |
| 12 | vfvaluename1 | vfvaluename1 | vfvaluename1 | varchar2(200) |
| 13 | vfvaluename2 | vfvaluename2 | vfvaluename2 | varchar2(200) |
| 14 | vrelation | vrelation | vrelation | number(38, 0) |
| 15 | vrowno | vrowno | vrowno | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
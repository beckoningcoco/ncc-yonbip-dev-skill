# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6935.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfpricebid | cfpricebid | cfpricebid | char(20) | √ |
| 2 | cfclassid | cfclassid | cfclassid | varchar2(20) |  |  | '~' |
| 3 | cfeaturebid | cfeaturebid | cfeaturebid | varchar2(20) |  |  | '~' |
| 4 | cfeatureid | cfeatureid | cfeatureid | varchar2(20) |  |  | '~' |
| 5 | cfpriceid | cfpriceid | cfpriceid | char(20) | √ |
| 6 | cnodeid | cnodeid | cnodeid | varchar2(60) |
| 7 | cpnodeid | cpnodeid | cpnodeid | varchar2(60) |
| 8 | nprice | nprice | nprice | number(28, 8) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | vfvalue | vfvalue | vfvalue | varchar2(20) |  |  | '~' |
| 11 | vfvaluename | vfvaluename | vfvaluename | varchar2(200) |
| 12 | vrowno | vrowno | vrowno | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7643.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccostdetailid | ccostdetailid | ccostdetailid | char(20) | √ |
| 2 | actsingle | actsingle | actsingle | char(1) |
| 3 | bfromcostcenter | bfromcostcenter | bfromcostcenter | char(1) |
| 4 | bsubtype | bsubtype | bsubtype | char(1) |
| 5 | ccostcentergroup | ccostcentergroup | ccostcentergroup | varchar2(20) |  |  | '~' |
| 6 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 7 | ccostobjectid | ccostobjectid | ccostobjectid | varchar2(20) |  |  | '~' |
| 8 | ccosttype | ccosttype | ccosttype | varchar2(20) |  |  | '~' |
| 9 | celementid | celementid | celementid | varchar2(20) |  |  | '~' |
| 10 | cfactorgroupid | cfactorgroupid | cfactorgroupid | varchar2(20) |  |  | '~' |
| 11 | cmarbasclassid | cmarbasclassid | cmarbasclassid | varchar2(20) |  |  | '~' |
| 12 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 13 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 14 | cmaterialspec | cmaterialspec | cmaterialspec | varchar2(50) |
| 15 | cmaterialtype | cmaterialtype | cmaterialtype | varchar2(50) |
| 16 | cmobatchcode | cmobatchcode | cmobatchcode | varchar2(50) |
| 17 | cmocode | cmocode | cmocode | varchar2(50) |
| 18 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 19 | cproject | cproject | cproject | varchar2(20) |  |  | '~' |
| 20 | fconttype | fconttype | fconttype | number(38, 0) |
| 21 | fsrc | fsrc | fsrc | number(38, 0) |
| 22 | funit | funit | funit | number(38, 0) |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | rejectsingle | rejectsingle | rejectsingle | char(1) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpricemodelogid | cpricemodelogid | cpricemodelogid | char(20) | √ |
| 2 | bnewbatchcostflag | bnewbatchcostflag | bnewbatchcostflag | char(1) |
| 3 | boldbatchcostflag | boldbatchcostflag | boldbatchcostflag | char(1) |
| 4 | caccountperiod | caccountperiod | caccountperiod | char(7) |
| 5 | cinventoryid | cinventoryid | cinventoryid | varchar2(20) |  |  | '~' |
| 6 | fnewpricemodeflag | fnewpricemodeflag | fnewpricemodeflag | number(38, 0) |
| 7 | foldpricemodeflag | foldpricemodeflag | foldpricemodeflag | number(38, 0) |
| 8 | pk_book | pk_book | pk_book | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
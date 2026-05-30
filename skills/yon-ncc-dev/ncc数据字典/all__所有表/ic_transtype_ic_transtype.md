# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype | pk_transtype | pk_transtype | char(20) | √ |
| 2 | baffectcost | baffectcost | baffectcost | char(1) |
| 3 | baffectonhand | baffectonhand | baffectonhand | char(1) |
| 4 | bapprovepushbill | bapprovepushbill | bapprovepushbill | char(1) |
| 5 | bautoapprove | bautoapprove | bautoapprove | char(1) |
| 6 | bautosign | bautosign | bautosign | char(1) |
| 7 | bretail | bretail | bretail | char(1) |
| 8 | bsalepromotion | bsalepromotion | bsalepromotion | char(1) |
| 9 | cavtype | cavtype | cavtype | number(38, 0) |
| 10 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 11 | dest_billtypecode | dest_billtypecode | dest_billtypecode | varchar2(4) |
| 12 | fconssettleflag | fconssettleflag | fconssettleflag | number(38, 0) |
| 13 | finoutflag | finoutflag | finoutflag | number(38, 0) | √ |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |
| 15 | transtypecode | transtypecode | transtypecode | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
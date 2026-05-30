# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | pk_trantype | pk_trantype | char(20) | √ |
| 2 | bbrandflag | bbrandflag | bbrandflag | char(1) |
| 3 | bcostcenterflag | bcostcenterflag | bcostcenterflag | char(1) |
| 4 | bcustomerflag | bcustomerflag | bcustomerflag | char(1) |
| 5 | bmanulflag | bmanulflag | bmanulflag | char(1) |
| 6 | bmaterialflag | bmaterialflag | bmaterialflag | char(1) |
| 7 | bprodlineflag | bprodlineflag | bprodlineflag | char(1) |
| 8 | bprojectflag | bprojectflag | bprojectflag | char(1) |
| 9 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(40) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
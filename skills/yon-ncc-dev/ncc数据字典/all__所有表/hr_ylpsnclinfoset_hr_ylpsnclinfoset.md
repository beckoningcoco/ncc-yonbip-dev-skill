# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8845.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | caneditflag | caneditflag | caneditflag | char(1) |
| 2 | checkflag | checkflag | checkflag | char(1) |
| 3 | infopk | infopk | infopk | varchar2(20) |
| 4 | infotype | infotype | infotype | number(38, 0) |
| 5 | metadata | metadata | metadata | varchar2(100) |
| 6 | mustentryflag | mustentryflag | mustentryflag | char(1) |
| 7 | mustflag | mustflag | mustflag | char(1) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |
| 10 | pk_psnclinfoset | pk_psnclinfoset | pk_psnclinfoset | char(20) | √ |
| 11 | pk_psnclrule | pk_psnclrule | pk_psnclrule | varchar2(20) |
| 12 | showflag | showflag | showflag | char(1) |
| 13 | sysdataflag | sysdataflag | sysdataflag | char(1) |
| 14 | usedflag | usedflag | usedflag | char(1) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
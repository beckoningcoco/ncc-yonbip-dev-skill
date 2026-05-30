# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnclinfoset | pk_psnclinfoset | pk_psnclinfoset | char(20) | √ |
| 2 | caneditflag | caneditflag | caneditflag | char(1) |  |  | 'N' |
| 3 | checkflag | checkflag | checkflag | char(1) |  |  | 'N' |
| 4 | infopk | infopk | infopk | varchar2(20) |
| 5 | infotype | infotype | infotype | number(38, 0) |
| 6 | metadata | metadata | metadata | varchar2(100) |
| 7 | mustentryflag | mustentryflag | mustentryflag | char(1) |  |  | 'N' |
| 8 | mustflag | mustflag | mustflag | char(1) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |
| 11 | pk_psnclrule | pk_psnclrule | pk_psnclrule | varchar2(20) |
| 12 | showflag | showflag | showflag | char(1) |  |  | 'Y' |
| 13 | sysdataflag | sysdataflag | sysdataflag | char(1) |
| 14 | usedflag | usedflag | usedflag | char(1) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
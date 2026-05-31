# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8530.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_querycondition | pk_querycondition | pk_querycondition | char(20) | √ |
| 2 | booknode | booknode | booknode | varchar2(20) |
| 3 | endperiod | endperiod | endperiod | char(2) |
| 4 | includerealtimeflag | includerealtimeflag | includerealtimeflag | char(1) |
| 5 | includeuntalliedflag | includeuntalliedflag | includeuntalliedflag | char(1) |
| 6 | pk_accsubj | pk_accsubj | pk_accsubj | char(20) |
| 7 | pk_corp | pk_corp | pk_corp | char(4) |
| 8 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |
| 9 | pk_glbook | pk_glbook | pk_glbook | char(20) |
| 10 | pk_glorg | pk_glorg | pk_glorg | char(20) |
| 11 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) |
| 12 | showsettleinfoflag | showsettleinfoflag | showsettleinfoflag | char(1) |
| 13 | sortstyle | sortstyle | sortstyle | number(38, 0) |
| 14 | startperiod | startperiod | startperiod | char(2) |
| 15 | year | year | year | char(4) |
| 16 | free1 | free1 | free1 | varchar2(60) |
| 17 | free2 | free2 | free2 | varchar2(60) |
| 18 | free3 | free3 | free3 | varchar2(60) |
| 19 | free4 | free4 | free4 | varchar2(60) |
| 20 | free5 | free5 | free5 | varchar2(60) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
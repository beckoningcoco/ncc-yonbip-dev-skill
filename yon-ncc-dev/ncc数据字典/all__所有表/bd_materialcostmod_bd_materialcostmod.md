# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6986.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialcostmod | pk_materialcostmod | pk_materialcostmod | char(20) | √ |
| 2 | batchcost | batchcost | batchcost | char(1) |  |  | 'N' |
| 3 | costmode | costmode | costmode | number(38, 0) | √ |  | 3 |
| 4 | costproduction | costproduction | costproduction | char(1) |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 6 | marasst2 | marasst2 | marasst2 | char(1) |
| 7 | marasst3 | marasst3 | marasst3 | char(1) |
| 8 | marasst4 | marasst4 | marasst4 | char(1) |
| 9 | marasst5 | marasst5 | marasst5 | char(1) |
| 10 | marasst6 | marasst6 | marasst6 | char(1) |
| 11 | marasst7 | marasst7 | marasst7 | char(1) |
| 12 | marasst8 | marasst8 | marasst8 | char(1) |
| 13 | marasst9 | marasst9 | marasst9 | char(1) |
| 14 | marasst10 | marasst10 | marasst10 | char(1) |
| 15 | marasst11 | marasst11 | marasst11 | char(1) |
| 16 | marasst12 | marasst12 | marasst12 | char(1) |
| 17 | marasst13 | marasst13 | marasst13 | char(1) |
| 18 | marasst14 | marasst14 | marasst14 | char(1) |
| 19 | marasst15 | marasst15 | marasst15 | char(1) |
| 20 | marasst100 | marasst100 | marasst100 | char(1) |
| 21 | pk_costregion | pk_costregion | pk_costregion | char(20) | √ |
| 22 | pk_factor | pk_factor | pk_factor | varchar2(20) |
| 23 | pk_material | pk_material | pk_material | char(20) | √ |
| 24 | pk_materialcost | pk_materialcost | pk_materialcost | char(20) | √ |
| 25 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) | √ |
| 26 | planedprice | planedprice | planedprice | number(20, 8) |
| 27 | storeamount | storeamount | storeamount | number(20, 8) |
| 28 | storenum | storenum | storenum | number(38, 0) |
| 29 | storeprice | storeprice | storeprice | number(20, 8) |
| 30 | def1 | def1 | def1 | varchar2(100) |
| 31 | def2 | def2 | def2 | varchar2(101) |
| 32 | def3 | def3 | def3 | varchar2(100) |
| 33 | def4 | def4 | def4 | varchar2(100) |
| 34 | def5 | def5 | def5 | varchar2(100) |
| 35 | def6 | def6 | def6 | varchar2(100) |
| 36 | def7 | def7 | def7 | varchar2(100) |
| 37 | def8 | def8 | def8 | varchar2(100) |
| 38 | def9 | def9 | def9 | varchar2(100) |
| 39 | def10 | def10 | def10 | varchar2(100) |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
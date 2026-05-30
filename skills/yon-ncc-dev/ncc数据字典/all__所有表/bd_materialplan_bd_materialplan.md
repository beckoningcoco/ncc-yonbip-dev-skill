# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6993.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialplan | pk_materialplan | pk_materialplan | char(20) | √ |
| 2 | accquiretime | accquiretime | accquiretime | number(38, 0) |
| 3 | aheadbatch | aheadbatch | aheadbatch | number(20, 8) |
| 4 | aheadcoff | aheadcoff | aheadcoff | number(20, 8) |
| 5 | batchincrnum | batchincrnum | batchincrnum | number(20, 8) |
| 6 | batchnum | batchnum | batchnum | number(20, 8) |
| 7 | batchrule | batchrule | batchrule | char(2) | √ |  | 'ZJ' |
| 8 | combineflag | combineflag | combineflag | char(1) |
| 9 | confirmtime | confirmtime | confirmtime | number(38, 0) |
| 10 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 11 | economicbatch | economicbatch | economicbatch | number(20, 8) |
| 12 | endahead | endahead | endahead | number(20, 8) |
| 13 | fixcombinreqday | fixcombinreqday | fixcombinreqday | number(38, 0) |
| 14 | fixedahead | fixedahead | fixedahead | number(20, 8) |
| 15 | fixlossmainnum | fixlossmainnum | fixlossmainnum | number(20, 8) |
| 16 | isimpermitapprove | isimpermitapprove | isimpermitapprove | char(1) |  |  | 'N' |
| 17 | issupneedorder | issupneedorder | issupneedorder | char(1) |  |  | 'N' |
| 18 | isvirtual | isvirtual | isvirtual | char(1) |
| 19 | longcycleprep | longcycleprep | longcycleprep | char(1) |
| 20 | losscoefficient | losscoefficient | losscoefficient | number(20, 8) |
| 21 | lowlevelcode | lowlevelcode | lowlevelcode | number(38, 0) |  |  | 0 |
| 22 | lowstocknum | lowstocknum | lowstocknum | number(20, 8) |
| 23 | marasst1 | marasst1 | marasst1 | char(1) |
| 24 | marasst2 | marasst2 | marasst2 | char(1) |
| 25 | marasst3 | marasst3 | marasst3 | char(1) |
| 26 | marasst4 | marasst4 | marasst4 | char(1) |
| 27 | marasst5 | marasst5 | marasst5 | char(1) |
| 28 | marasst6 | marasst6 | marasst6 | char(1) |
| 29 | marasst7 | marasst7 | marasst7 | char(1) |
| 30 | marasst8 | marasst8 | marasst8 | char(1) |
| 31 | marasst9 | marasst9 | marasst9 | char(1) |
| 32 | marasst10 | marasst10 | marasst10 | char(1) |
| 33 | marasst11 | marasst11 | marasst11 | char(1) |
| 34 | marasst12 | marasst12 | marasst12 | char(1) |
| 35 | marasst13 | marasst13 | marasst13 | char(1) |
| 36 | marasst14 | marasst14 | marasst14 | char(1) |
| 37 | marasst15 | marasst15 | marasst15 | char(1) |
| 38 | marasst100 | marasst100 | marasst100 | char(1) |
| 39 | materialreqcombintype | materialreqcombintype | materialreqcombintype | number(38, 0) |
| 40 | maxstornum | maxstornum | maxstornum | number(20, 8) |
| 41 | minbatchnum | minbatchnum | minbatchnum | number(20, 8) |
| 42 | numofcombindays | numofcombindays | numofcombindays | number(38, 0) |
| 43 | oversupdays | oversupdays | oversupdays | number(38, 0) |
| 44 | pk_group | pk_group | pk_group | char(20) | √ |
| 45 | pk_material | pk_material | pk_material | char(20) | √ |
| 46 | pk_org | pk_org | pk_org | char(20) | √ |
| 47 | pk_prodeptdoc | pk_prodeptdoc | pk_prodeptdoc | varchar2(20) |  |  | '~' |
| 48 | pk_prodfactory | pk_prodfactory | pk_prodfactory | varchar2(20) |  |  | '~' |
| 49 | pk_propsndoc | pk_propsndoc | pk_propsndoc | varchar2(20) |  |  | '~' |
| 50 | planbasnum | planbasnum | planbasnum | number(20, 8) | √ |  | 1.00 |
| 51 | planperiod | planperiod | planperiod | number(38, 0) |
| 52 | planprop | planprop | planprop | char(2) |
| 53 | planstrategygroup | planstrategygroup | planstrategygroup | varchar2(20) |
| 54 | prevahead | prevahead | prevahead | number(20, 8) |
| 55 | reamountalw | reamountalw | reamountalw | number(20, 8) |
| 56 | rebackwardays | rebackwardays | rebackwardays | number(38, 0) |
| 57 | reforwardays | reforwardays | reforwardays | number(38, 0) |
| 58 | reorderpoint | reorderpoint | reorderpoint | number(20, 8) |
| 59 | reqcombmoment | reqcombmoment | reqcombmoment | number(38, 0) |
| 60 | roundingnum | roundingnum | roundingnum | number(20, 8) | √ |  | 0.50 |
| 61 | safetystocknum | safetystocknum | safetystocknum | number(20, 8) |
| 62 | sumahead | sumahead | sumahead | number(20, 8) |
| 63 | targetstocklevel | targetstocklevel | targetstocklevel | number(38, 0) |
| 64 | targetsupplyday | targetsupplyday | targetsupplyday | number(38, 0) |
| 65 | timeslice | timeslice | timeslice | number(38, 0) |
| 66 | wasterrate | wasterrate | wasterrate | number(20, 8) |
| 67 | def1 | def1 | def1 | varchar2(101) |
| 68 | def2 | def2 | def2 | varchar2(101) |
| 69 | def3 | def3 | def3 | varchar2(101) |
| 70 | def4 | def4 | def4 | varchar2(101) |
| 71 | def5 | def5 | def5 | varchar2(101) |
| 72 | def6 | def6 | def6 | varchar2(101) |
| 73 | def7 | def7 | def7 | varchar2(101) |
| 74 | def8 | def8 | def8 | varchar2(101) |
| 75 | def9 | def9 | def9 | varchar2(101) |
| 76 | def10 | def10 | def10 | varchar2(101) |
| 77 | def11 | def11 | def11 | varchar2(101) |
| 78 | def12 | def12 | def12 | varchar2(101) |
| 79 | def13 | def13 | def13 | varchar2(101) |
| 80 | def14 | def14 | def14 | varchar2(101) |
| 81 | def15 | def15 | def15 | varchar2(101) |
| 82 | def16 | def16 | def16 | varchar2(101) |
| 83 | def17 | def17 | def17 | varchar2(101) |
| 84 | def18 | def18 | def18 | varchar2(101) |
| 85 | def19 | def19 | def19 | varchar2(101) |
| 86 | def20 | def20 | def20 | varchar2(101) |
| 87 | creationtime | creationtime | creationtime | char(19) |
| 88 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 89 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 90 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 91 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 92 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
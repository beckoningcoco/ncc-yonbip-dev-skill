# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10799.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle_feeallot | pk_settle_feeallot | pk_settle_feeallot | char(20) | √ |
| 2 | bestfirstsettle | bestfirstsettle | bestfirstsettle | char(1) |
| 3 | nallotbillmny | nallotbillmny | nallotbillmny | number(28, 8) |
| 4 | nallotbillnum | nallotbillnum | nallotbillnum | number(28, 8) |
| 5 | nallotmoney | nallotmoney | nallotmoney | number(28, 8) |
| 6 | nnosubmny | nnosubmny | nnosubmny | number(28, 8) |
| 7 | norigmny | norigmny | norigmny | number(28, 8) |
| 8 | ntimesafterfirst | ntimesafterfirst | ntimesafterfirst | number(38, 0) |
| 9 | pk_allotbillbid | pk_allotbillbid | pk_allotbillbid | varchar2(20) |
| 10 | pk_allotbillid | pk_allotbillid | pk_allotbillid | varchar2(20) |
| 11 | pk_material | pk_material | pk_material | varchar2(20) |
| 12 | pk_oppofee_b | pk_oppofee_b | pk_oppofee_b | char(20) |
| 13 | pk_origcurrid | pk_origcurrid | pk_origcurrid | varchar2(20) |
| 14 | pk_settlebill | pk_settlebill | pk_settlebill | char(20) |
| 15 | pk_settlebill_b | pk_settlebill_b | pk_settlebill_b | char(20) | √ |
| 16 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |
| 17 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |
| 18 | vallotbilltype | vallotbilltype | vallotbilltype | varchar2(4) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
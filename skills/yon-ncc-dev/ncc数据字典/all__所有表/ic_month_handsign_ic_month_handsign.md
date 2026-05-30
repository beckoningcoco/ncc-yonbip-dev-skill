# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9100.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | casscustid | casscustid | casscustid | varchar2(20) |  |  | '~' |
| 2 | castunitid | castunitid | castunitid | varchar2(20) | √ |
| 3 | cffileid | cffileid | cffileid | varchar2(20) |
| 4 | clocationid | clocationid | clocationid | varchar2(20) |
| 5 | cmaterialoid | cmaterialoid | cmaterialoid | char(20) | √ |
| 6 | cmaterialvid | cmaterialvid | cmaterialvid | char(20) | √ |
| 7 | cproductorid | cproductorid | cproductorid | varchar2(20) |
| 8 | cprojectid | cprojectid | cprojectid | varchar2(20) |
| 9 | cstateid | cstateid | cstateid | varchar2(20) |
| 10 | ctplcustomerid | ctplcustomerid | ctplcustomerid | varchar2(20) |
| 11 | cvendorid | cvendorid | cvendorid | varchar2(20) |
| 12 | cvmivenderid | cvmivenderid | cvmivenderid | varchar2(20) |
| 13 | cwarehouseid | cwarehouseid | cwarehouseid | char(20) | √ |
| 14 | dyearmonth | dyearmonth | dyearmonth | char(7) | √ |
| 15 | nassistnum | nassistnum | nassistnum | number(28, 8) |
| 16 | ngrossnum | ngrossnum | ngrossnum | number(28, 8) |
| 17 | niaassistnum | niaassistnum | niaassistnum | number(28, 8) |
| 18 | niagrossnum | niagrossnum | niagrossnum | number(28, 8) |
| 19 | nianum | nianum | nianum | number(28, 8) |
| 20 | niaretassistnum | niaretassistnum | niaretassistnum | number(28, 8) |
| 21 | niaretgrossnum | niaretgrossnum | niaretgrossnum | number(28, 8) |
| 22 | niaretnum | niaretnum | niaretnum | number(28, 8) |
| 23 | nnum | nnum | nnum | number(28, 8) |
| 24 | nretassistnum | nretassistnum | nretassistnum | number(28, 8) |
| 25 | nretgrossnum | nretgrossnum | nretgrossnum | number(28, 8) |
| 26 | nretnum | nretnum | nretnum | number(28, 8) |
| 27 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 28 | pk_group | pk_group | pk_group | char(20) | √ |
| 29 | pk_org | pk_org | pk_org | char(20) | √ |
| 30 | pk_org_v | pk_org_v | pk_org_v | char(20) | √ |
| 31 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 32 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 33 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 34 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 35 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 36 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 37 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 38 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 39 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 40 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 41 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 42 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
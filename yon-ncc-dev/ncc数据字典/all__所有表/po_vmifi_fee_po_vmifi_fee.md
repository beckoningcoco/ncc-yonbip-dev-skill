# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps_fee | pk_stockps_fee | pk_stockps_fee | char(20) | √ |
| 2 | bopptaxflag | bopptaxflag | bopptaxflag | char(1) |
| 3 | btoap | btoap | btoap | char(1) |  |  | 'N' |
| 4 | btoia | btoia | btoia | char(1) |  |  | 'N' |
| 5 | btriatradeflag | btriatradeflag | btriatradeflag | char(1) |
| 6 | crececountryid | crececountryid | crececountryid | varchar2(20) |
| 7 | csendcountryid | csendcountryid | csendcountryid | varchar2(20) |
| 8 | ctaxcodeid | ctaxcodeid | ctaxcodeid | varchar2(20) |
| 9 | ctaxcountryid | ctaxcountryid | ctaxcountryid | varchar2(20) |
| 10 | destdate | destdate | destdate | char(19) |
| 11 | fbuysellflag | fbuysellflag | fbuysellflag | number(38, 0) |
| 12 | ftaxtypeflag | ftaxtypeflag | ftaxtypeflag | number(38, 0) |
| 13 | ncalcostmny | ncalcostmny | ncalcostmny | number(28, 8) |
| 14 | ncaltaxmny | ncaltaxmny | ncaltaxmny | number(28, 8) |
| 15 | nestexchgrate | nestexchgrate | nestexchgrate | number(28, 8) |
| 16 | nestmny | nestmny | nestmny | number(28, 8) |
| 17 | nestomny | nestomny | nestomny | number(28, 8) |
| 18 | nestototalmny | nestototalmny | nestototalmny | number(28, 8) |
| 19 | nesttaxmny | nesttaxmny | nesttaxmny | number(28, 8) |
| 20 | nesttaxrate | nesttaxrate | nesttaxrate | number(28, 8) |
| 21 | nesttotalmny | nesttotalmny | nesttotalmny | number(28, 8) |
| 22 | nnosubtax | nnosubtax | nnosubtax | number(28, 8) |
| 23 | nnosubtaxrate | nnosubtaxrate | nnosubtaxrate | number(28, 8) |
| 24 | pk_costfactor | pk_costfactor | pk_costfactor | varchar2(20) |
| 25 | pk_estcurrency | pk_estcurrency | pk_estcurrency | varchar2(20) |
| 26 | pk_estpsn | pk_estpsn | pk_estpsn | varchar2(20) |
| 27 | pk_feematerial | pk_feematerial | pk_feematerial | varchar2(20) |
| 28 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |
| 29 | pk_firstsettle | pk_firstsettle | pk_firstsettle | varchar2(20) |
| 30 | pk_firstsettle_b | pk_firstsettle_b | pk_firstsettle_b | varchar2(20) |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |
| 32 | pk_localcurrency | pk_localcurrency | pk_localcurrency | varchar2(20) |
| 33 | pk_srcfeematerial | pk_srcfeematerial | pk_srcfeematerial | varchar2(20) |
| 34 | pk_stockps | pk_stockps | pk_stockps | char(20) |
| 35 | pk_stockps_b | pk_stockps_b | pk_stockps_b | char(20) | √ |
| 36 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
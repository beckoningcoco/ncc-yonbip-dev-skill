# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costconvrel | pk_costconvrel | pk_costconvrel | char(20) | √ |
| 2 | ccostregionid_aim | ccostregionid_aim | ccostregionid_aim | varchar2(20) |  |  | '~' |
| 3 | ccostregionid_source | ccostregionid_source | ccostregionid_source | varchar2(20) |  |  | '~' |
| 4 | costtransmeth | costtransmeth | costtransmeth | number(38, 0) |
| 5 | cprofitcenterid_aim | cprofitcenterid_aim | cprofitcenterid_aim | varchar2(20) |  |  | '~' |
| 6 | cprofitcenterid_aim_v | cprofitcenterid_aim_v | cprofitcenterid_aim_v | varchar2(20) |  |  | '~' |
| 7 | cprofitcenterid_source | cprofitcenterid_source | cprofitcenterid_source | varchar2(20) |  |  | '~' |
| 8 | cprofitcenterid_source_v | cprofitcenterid_source_v | cprofitcenterid_source_v | varchar2(20) |  |  | '~' |
| 9 | pk_accbook_aim | pk_accbook_aim | pk_accbook_aim | varchar2(20) |  |  | '~' |
| 10 | pk_accbook_source | pk_accbook_source | pk_accbook_source | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_setofbook_aim | pk_setofbook_aim | pk_setofbook_aim | varchar2(20) |  |  | '~' |
| 13 | pk_setofbook_source | pk_setofbook_source | pk_setofbook_source | varchar2(20) |  |  | '~' |
| 14 | stockorg_aim | stockorg_aim | stockorg_aim | varchar2(20) |  |  | '~' |
| 15 | stockorg_aim_v | stockorg_aim_v | stockorg_aim_v | varchar2(20) |  |  | '~' |
| 16 | stockorg_source | stockorg_source | stockorg_source | varchar2(20) |  |  | '~' |
| 17 | stockorg_source_v | stockorg_source_v | stockorg_source_v | varchar2(20) |  |  | '~' |
| 18 | updateccosttype | updateccosttype | updateccosttype | varchar2(20) |  |  | '~' |
| 19 | vnote | vnote | vnote | varchar2(181) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8855.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 2 | ccorrespondcode | ccorrespondcode | ccorrespondcode | varchar2(50) |
| 3 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 4 | dbizdate | dbizdate | dbizdate | char(19) |
| 5 | dproduct | dproduct | dproduct | char(19) |
| 6 | dvalidate | dvalidate | dvalidate | char(19) |
| 7 | memo | memo | memo | varchar2(50) |
| 8 | nmny | nmny | nmny | number(28, 8) |
| 9 | nnum | nnum | nnum | number(28, 8) |
| 10 | nprice | nprice | nprice | number(28, 8) |
| 11 | pk_inbid | pk_inbid | pk_inbid | varchar2(50) |
| 12 | pk_inoutdata | pk_inoutdata | pk_inoutdata | char(20) | √ |
| 13 | pk_inoutdata_b | pk_inoutdata_b | pk_inoutdata_b | char(50) | √ |
| 14 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 15 | pk_outbid | pk_outbid | pk_outbid | varchar2(50) |
| 16 | pk_rack | pk_rack | pk_rack | varchar2(20) |  |  | '~' |
| 17 | rowno | rowno | rowno | varchar2(50) |
| 18 | srcformat | srcformat | srcformat | varchar2(50) |
| 19 | srcmaterialcode | srcmaterialcode | srcmaterialcode | varchar2(50) |
| 20 | srcmaterialname | srcmaterialname | srcmaterialname | varchar2(50) |
| 21 | srcmodel | srcmodel | srcmodel | varchar2(50) |
| 22 | srcrackcode | srcrackcode | srcrackcode | varchar2(50) |
| 23 | srcrackname | srcrackname | srcrackname | varchar2(50) |
| 24 | srcunit | srcunit | srcunit | varchar2(50) |
| 25 | vbarcode | vbarcode | vbarcode | varchar2(50) |
| 26 | vbatchcode | vbatchcode | vbatchcode | varchar2(50) |
| 27 | vchangerate | vchangerate | vchangerate | varchar2(50) |
| 28 | vserialcode | vserialcode | vserialcode | varchar2(50) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
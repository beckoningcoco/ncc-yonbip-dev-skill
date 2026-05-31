# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12042.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | asscodecol | asscodecol | asscodecol | varchar2(50) |
| 3 | doctypecol | doctypecol | doctypecol | varchar2(50) |
| 4 | dstdim | dstdim | dstdim | varchar2(50) | √ |
| 5 | matchtype | matchtype | matchtype | varchar2(50) | √ |
| 6 | orgcodecol | orgcodecol | orgcodecol | varchar2(50) |
| 7 | pk_imptask | pk_imptask | pk_imptask | char(20) | √ |
| 8 | srccol | srccol | srccol | varchar2(1200) | √ |
| 9 | valuemap | valuemap | valuemap | char(1) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
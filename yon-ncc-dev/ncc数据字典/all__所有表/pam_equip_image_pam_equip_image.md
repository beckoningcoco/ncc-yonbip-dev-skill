# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10380.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equip_image | pk_equip_image | pk_equip_image | char(20) | √ |
| 2 | image | image | image | blob |
| 3 | isdefault | isdefault | isdefault | char(1) |
| 4 | pk_equip | pk_equip | pk_equip | char(20) |
| 5 | pk_image_file | pk_image_file | pk_image_file | varchar2(40) |
| 6 | previewimage | previewimage | previewimage | blob |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
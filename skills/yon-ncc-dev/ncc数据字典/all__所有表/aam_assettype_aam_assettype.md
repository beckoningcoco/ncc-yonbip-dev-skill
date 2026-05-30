# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assettype | pk_assettype | pk_assettype | char(20) | √ |
| 2 | assettypecode | assettypecode | assettypecode | varchar2(50) | √ |
| 3 | assettypedesc | assettypedesc | assettypedesc | varchar2(1024) |
| 4 | assettypename | assettypename | assettypename | varchar2(300) | √ |
| 5 | assettypename2 | assettypename2 | assettypename2 | varchar2(300) |
| 6 | assettypename3 | assettypename3 | assettypename3 | varchar2(300) |
| 7 | assettypename4 | assettypename4 | assettypename4 | varchar2(300) |
| 8 | assettypename5 | assettypename5 | assettypename5 | varchar2(300) |
| 9 | assettypename6 | assettypename6 | assettypename6 | varchar2(300) |
| 10 | datakind | datakind | datakind | varchar2(50) |
| 11 | isdefault | isdefault | isdefault | char(1) |
| 12 | ismodularized | ismodularized | ismodularized | char(1) | √ |
| 13 | issystem | issystem | issystem | char(1) |
| 14 | processorclass | processorclass | processorclass | varchar2(512) | √ |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
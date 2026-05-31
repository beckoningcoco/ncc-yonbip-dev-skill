# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9885.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dmotranstype | pk_dmotranstype | pk_dmotranstype | char(20) | √ |
| 2 | bautoclose | bautoclose | bautoclose | char(1) |
| 3 | bautofinish | bautofinish | bautofinish | char(1) |
| 4 | brepair | brepair | brepair | char(1) |
| 5 | bsavetoaudit | bsavetoaudit | bsavetoaudit | char(1) |
| 6 | bunplannpicking | bunplannpicking | bunplannpicking | char(1) |
| 7 | ctrantypeid | ctrantypeid | ctrantypeid | char(20) |
| 8 | foperationmode | foperationmode | foperationmode | number(38, 0) |
| 9 | fpickmauditmode | fpickmauditmode | fpickmauditmode | number(38, 0) |  |  | 2 |
| 10 | freworktype | freworktype | freworktype | number(38, 0) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
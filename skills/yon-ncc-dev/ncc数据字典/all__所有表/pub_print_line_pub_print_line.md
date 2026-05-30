# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10967.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | clineid | clineid | clineid | char(20) | √ |
| 2 | cdirector | cdirector | cdirector | char(1) |
| 3 | ctemplateid | ctemplateid | ctemplateid | char(20) | √ |
| 4 | ftype | ftype | ftype | number(38, 0) |  |  | 1 |
| 5 | icolor | icolor | icolor | number(38, 0) |  |  | -16777216 |
| 6 | iendcol | iendcol | iendcol | number(38, 0) |
| 7 | iendrow | iendrow | iendrow | number(38, 0) |
| 8 | iendx | iendx | iendx | number(38, 0) |
| 9 | iendy | iendy | iendy | number(38, 0) |
| 10 | istartcol | istartcol | istartcol | number(38, 0) |
| 11 | istartrow | istartrow | istartrow | number(38, 0) |
| 12 | istartx | istartx | istartx | number(38, 0) |
| 13 | istarty | istarty | istarty | number(38, 0) |
| 14 | pk_corp | pk_corp | pk_corp | char(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
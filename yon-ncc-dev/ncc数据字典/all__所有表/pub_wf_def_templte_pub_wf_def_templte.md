# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_def | pk_wf_def | pk_wf_def | char(20) | √ |
| 2 | content | content | content | blob |
| 3 | filename | filename | filename | varchar2(100) | √ |
| 4 | filepath | filepath | filepath | varchar2(100) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |
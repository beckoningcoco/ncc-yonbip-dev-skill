# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8797.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cppe_grade | pk_cppe_grade | pk_cppe_grade | char(20) | √ |
| 2 | gradedesc | gradedesc | gradedesc | varchar2(1536) |
| 3 | gradescore | gradescore | gradescore | varchar2(10) |
| 4 | gradeseq | gradeseq | gradeseq | number(38, 0) | √ |
| 5 | gradestandard | gradestandard | gradestandard | varchar2(1536) |
| 6 | pk_grade | pk_grade | pk_grade | char(20) |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | pk_scorule | pk_scorule | pk_scorule | char(20) | √ |
| 10 | remark | remark | remark | varchar2(1536) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |